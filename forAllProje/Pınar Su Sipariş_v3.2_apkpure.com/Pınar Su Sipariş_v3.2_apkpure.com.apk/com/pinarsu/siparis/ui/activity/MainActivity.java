package com.pinarsu.siparis.ui.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import com.adjust.sdk.Adjust;
import com.google.android.gms.identity.intents.AddressConstants.ErrorCodes;
import com.pinarsu.siparis.MyApplication;
import com.pinarsu.siparis.Preferences;
import com.pinarsu.siparis.R;
import com.pinarsu.siparis.adapter.TutorialViewPagerAdapter;
import com.pinarsu.siparis.api.service.ServiceBase;
import com.pinarsu.siparis.api.service.ServiceBase.Retrieve2;
import com.pinarsu.siparis.api.service.ServiceItem;
import com.pinarsu.siparis.api.service.ServiceItem.REQUEST_TYPE;
import com.pinarsu.siparis.api.service.ServiceItemRequestParameter;
import com.pinarsu.siparis.gcm.GCMRegistrationService;
import com.pinarsu.siparis.interfaces.IActivityResult;
import com.pinarsu.siparis.interfaces.IBackPressed;
import com.pinarsu.siparis.interfaces.IDelegateOneObjectLister;
import com.pinarsu.siparis.interfaces.IDismissListener;
import com.pinarsu.siparis.interfaces.IRequestPermissionsResult;
import com.pinarsu.siparis.interfaces.IServiceResponse;
import com.pinarsu.siparis.model.data.ADRES;
import com.pinarsu.siparis.model.data.ADRESLER_PARENT;
import com.pinarsu.siparis.model.data.KAMPANYALAR;
import com.pinarsu.siparis.model.data.KAMPANYALAR_PARENT;
import com.pinarsu.siparis.model.data.MALZEMELER_PARENT;
import com.pinarsu.siparis.model.data.SIPARISLER;
import com.pinarsu.siparis.model.data.SIPARISLER_PARENT;
import com.pinarsu.siparis.model.data.SON_SIPARIS;
import com.pinarsu.siparis.model.data.TUM_MALZEMELER_PARENT;
import com.pinarsu.siparis.tools.Tools;
import com.pinarsu.siparis.ui.fragment.AnnouncementsAndNewsFragment;
import com.pinarsu.siparis.ui.fragment.BaseFragment;
import com.pinarsu.siparis.ui.fragment.CampaignsFragment;
import com.pinarsu.siparis.ui.fragment.HomeFragment;
import com.pinarsu.siparis.ui.fragment.InfoCallAlertDialogFragment;
import com.pinarsu.siparis.ui.fragment.InternetConnectionDialogFragment;
import com.pinarsu.siparis.ui.fragment.LeftDrawerFragment;
import com.pinarsu.siparis.ui.fragment.Order1Fragment;
import com.pinarsu.siparis.ui.fragment.Order2Fragment;
import com.pinarsu.siparis.ui.fragment.Order3Fragment;
import com.pinarsu.siparis.ui.fragment.OrderSummaryFragment;
import com.pinarsu.siparis.ui.fragment.ProfileFragment;
import com.pinarsu.siparis.ui.fragment.ReminderFragment;
import com.pinarsu.siparis.ui.fragment.RightDrawerFragment;
import com.pinarsu.siparis.ui.fragment.YesOrNoFragment;
import com.pinarsu.siparis.view.TextView;
import java.io.Serializable;
import java.util.List;

@SuppressLint({"ParcelCreator"})
public class MainActivity extends AppCompatActivity implements Parcelable, IDelegateOneObjectLister, IDismissListener, IServiceResponse {
    public static boolean IS_ORDER_SUMMARY_CHANGED = false;
    public static int REQUEST_ADDRESS = ErrorCodes.ERROR_CODE_NO_APPLICABLE_ADDRESSES;
    public static int REQUEST_EDIT_LEFT_MENU = 666;
    public static int REQUEST_TYPE = 999;
    public static boolean TRY_APP = false;
    private List<ADRES> addressList;
    public List<KAMPANYALAR> allCampaignList;
    public TUM_MALZEMELER_PARENT allProductParent;
    public List<KAMPANYALAR> campaignList;
    private IBackPressed delegateIBackPressed;
    private IRequestPermissionsResult delegateRequestPermissionsResult;
    @InjectView(2131558627)
    public ImageView imBack;
    @InjectView(2131558742)
    public ImageView imLeftMenu;
    @InjectView(2131558743)
    public ImageView imLogo;
    @InjectView(2131558746)
    public ImageView imRightMenu;
    private boolean isInternetExceptionShowing = false;
    boolean isLoadedLastOrder = false;
    private boolean isOnResumeFragment = false;
    public SON_SIPARIS lastOrder;
    public FRAGMENT_TYPE lastType;
    public LeftDrawerFragment leftDrawerFragment;
    private String number;
    IActivityResult onActivityResultDelegate;
    public List<SIPARISLER> orderList;
    public MALZEMELER_PARENT productParent;
    private RightDrawerFragment rightDrawerFragment;
    private ServiceBase serviceBase;
    @InjectView(2131558568)
    Toolbar toolbar;
    @InjectView(2131558686)
    public TextView tvLogin;
    @InjectView(2131558577)
    TextView tvTitle;

    public enum FRAGMENT_TYPE {
        PROFILE(ProfileFragment.class),
        ORDER_SUMMARY(OrderSummaryFragment.class),
        HOME(HomeFragment.class),
        ANNOUNCEMENTS_AND_NEWS(AnnouncementsAndNewsFragment.class),
        ORDER1(Order1Fragment.class),
        ORDER2(Order2Fragment.class),
        ORDER3(Order3Fragment.class),
        CAMPAIGNS(CampaignsFragment.class),
        REMINDER(ReminderFragment.class);
        
        public Class<?> clazz;

        private FRAGMENT_TYPE(Class<?> cls) {
            this.clazz = cls;
        }
    }

    public void onObject(Object obj, int i) {
        if (obj != null) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            Log.d("MNTTAG", "" + booleanValue);
            if (i != 123) {
                return;
            }
            if (booleanValue) {
                onDismissListener(111);
                return;
            }
            Tools.callNumber(this, this.number);
            finish();
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.serviceBase = new ServiceBase(this);
        if (Tools.isInternetConnected(this)) {
            setContentView((int) R.layout.activity_main);
            GCMRegistrationService.startService(this);
            Adjust.appWillOpenUrl(null);
            ButterKnife.inject((Activity) this);
            if (Preferences.isFIRST_OPEN_APP) {
                startActivity(new Intent(this, TutorialActivity.class));
                finish();
                return;
            }
            if (Preferences.PHONE_NUMBER == null || Preferences.PHONE_NUMBER.isEmpty()) {
                TRY_APP = true;
            } else {
                TRY_APP = false;
            }
            setSupportActionBar(this.toolbar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(false);
            createNavigationDrawer();
            if (TRY_APP) {
                getCampaignListFromService(this.serviceBase, Boolean.valueOf(true));
                return;
            }
            getAddressListFromService();
            getCampaignListFromService(this.serviceBase, Boolean.valueOf(true));
            getAllOrder();
            return;
        }
        InternetConnectionDialogFragment.show(this, this, getString(R.string.no_internet_connection), 111);
    }

    protected void onDestroy() {
        super.onDestroy();
        GCMRegistrationService.stopService(this);
    }

    private void getAddressListFromService() {
        ServiceItem serviceItem = new ServiceItem(REQUEST_TYPE.ALL_ADDRESS);
        serviceItem.parameterList.add(new ServiceItemRequestParameter("TELEFON_NO", Preferences.PHONE_NUMBER));
        ServiceBase serviceBase = this.serviceBase;
        serviceBase.getClass();
        new Retrieve2(serviceItem, this).execute(new Void[0]);
    }

    public void getCampaignListFromService(ServiceBase serviceBase, Boolean bool) {
        ServiceItem serviceItem;
        if (bool.booleanValue()) {
            serviceItem = new ServiceItem(REQUEST_TYPE.ALL_CAMPAIGNS);
        } else {
            this.campaignList = null;
            serviceItem = new ServiceItem(REQUEST_TYPE.CAMPAIGNS_IN_ADDRESS);
        }
        if (!TRY_APP) {
            String str = "";
            if (!bool.booleanValue()) {
                str = Preferences.ADDRESS.BAYI_NO;
            }
            serviceItem.parameterList.add(new ServiceItemRequestParameter("BAYI_NO", str));
            serviceItem.parameterList.add(new ServiceItemRequestParameter("TELEFON_NO", Preferences.PHONE_NUMBER));
        }
        serviceBase.getClass();
        new Retrieve2(serviceItem, this).execute(new Void[0]);
    }

    public void onResponse(ServiceItem serviceItem) {
        if (serviceItem.serviceErrorItem != null) {
            if (serviceItem.type == REQUEST_TYPE.CAMPAIGNS_IN_ADDRESS) {
                this.campaignList = null;
                displayView(FRAGMENT_TYPE.HOME, null);
            } else if (serviceItem.type == REQUEST_TYPE.ALL_CAMPAIGNS) {
                this.leftDrawerFragment.setItemVisibility(2, false);
                if (TRY_APP) {
                    displayView(FRAGMENT_TYPE.HOME, null);
                }
            } else if (serviceItem.type == REQUEST_TYPE.LAST_10_ORDER) {
                this.leftDrawerFragment.setItemVisibility(3, false);
                this.orderList = null;
            }
            String str = serviceItem.serviceErrorItem.detail;
            if (str.contains("#")) {
                str = str.split("#")[1];
                Log.d("MNTTAG", str);
                this.number = str;
                if (this.isOnResumeFragment) {
                    YesOrNoFragment.show(this, this, 123, "", "", getString(R.string.try_again), getString(R.string.call));
                }
            } else if (serviceItem.serviceErrorItem.isCrashed || serviceItem.type == REQUEST_TYPE.ALL_CAMPAIGNS) {
                if (this.lastType == null && !this.isInternetExceptionShowing) {
                    this.isInternetExceptionShowing = true;
                    InternetConnectionDialogFragment.show(this, this, getString(R.string.service_error), 111);
                }
                Log.w("MNTTAG", "servis hatasi : " + serviceItem.serviceErrorItem.detail);
            } else {
                InfoCallAlertDialogFragment.show(this, serviceItem.serviceErrorItem.detail);
            }
        } else if (serviceItem.type == REQUEST_TYPE.ALL_ADDRESS) {
            if (serviceItem.object != null) {
                this.addressList = ((ADRESLER_PARENT) serviceItem.object).list;
                if (this.addressList == null || this.addressList.size() <= 0) {
                    InfoCallAlertDialogFragment.show(this, "Kayıtlı bir adres bulunamadı.", this, 121);
                } else if (this.addressList.size() == 1) {
                    Preferences.ADDRESS = (ADRES) this.addressList.get(0);
                    MyApplication.getInstance().getPreferences().save();
                    getCampaignListFromService(this.serviceBase, Boolean.valueOf(false));
                } else {
                    chooseAddress();
                }
            }
        } else if (serviceItem.type == REQUEST_TYPE.CAMPAIGNS_IN_ADDRESS) {
            if (serviceItem.object != null) {
                this.campaignList = ((KAMPANYALAR_PARENT) serviceItem.object).list;
            } else {
                this.campaignList = null;
            }
            displayView(FRAGMENT_TYPE.HOME, null);
        } else if (serviceItem.type == REQUEST_TYPE.ALL_CAMPAIGNS) {
            if (serviceItem.object != null) {
                this.allCampaignList = ((KAMPANYALAR_PARENT) serviceItem.object).list;
                if (this.allCampaignList == null || this.allCampaignList.size() == 0) {
                    this.leftDrawerFragment.setItemVisibility(2, false);
                } else {
                    this.leftDrawerFragment.setItemVisibility(2, true);
                }
            } else {
                Log.w("MNTTAG", "kampanya bos");
                this.leftDrawerFragment.setItemVisibility(2, false);
            }
            if (TRY_APP) {
                displayView(FRAGMENT_TYPE.HOME, null);
            }
        } else if (serviceItem.type != REQUEST_TYPE.LAST_10_ORDER) {
        } else {
            if (serviceItem.object != null) {
                this.orderList = ((SIPARISLER_PARENT) serviceItem.object).list;
                if (this.orderList == null || this.orderList.size() == 0) {
                    this.leftDrawerFragment.setItemVisibility(3, false);
                    return;
                } else {
                    this.leftDrawerFragment.setItemVisibility(3, true);
                    return;
                }
            }
            this.leftDrawerFragment.setItemVisibility(3, false);
            this.orderList = null;
        }
    }

    protected void onResumeFragments() {
        super.onResumeFragments();
        this.isOnResumeFragment = true;
    }

    protected void onPostResume() {
        super.onPostResume();
        this.isOnResumeFragment = false;
    }

    public void onDismissListener(int i) {
        if (i == 111) {
            this.isInternetExceptionShowing = false;
            startActivity(new Intent(this, MainActivity.class));
            finish();
        } else if (i == 121) {
            finish();
        } else {
            chooseAddress();
        }
    }

    private void chooseAddress() {
        Intent intent = new Intent(this, AllAddressActivity.class);
        intent.putExtra("isFromHome", true);
        startActivityForResult(intent, REQUEST_ADDRESS);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
    }

    @OnClick({2131558742})
    void clickImLeftMenu() {
        if (this.leftDrawerFragment.isDrawerOpen()) {
            this.leftDrawerFragment.closeLeftDrawer();
        } else {
            this.leftDrawerFragment.openLeftDrawer();
        }
    }

    @OnClick({2131558746})
    public void clickImRightMenu() {
        if (this.rightDrawerFragment.isDrawerOpen()) {
            this.rightDrawerFragment.closeRightDrawer();
        } else {
            this.rightDrawerFragment.openRightDrawer();
        }
    }

    @OnClick({2131558667})
    void onClick(View view) {
        switch (view.getId()) {
            case R.id.linearExit:
                Preferences.PHONE_NUMBER = "";
                Preferences.ADDRESS = null;
                ((MyApplication) getApplication()).getPreferences().save();
                startActivity(new Intent(this, LoginActivity.class));
                finish();
                return;
            default:
                return;
        }
    }

    @OnClick({2131558686})
    void login() {
        startActivity(new Intent(this, LoginActivity.class));
        finish();
    }

    public void lockLeftSideMenu() {
        this.leftDrawerFragment.mDrawerLayout.a(1, 3);
        this.imLeftMenu.setEnabled(false);
        this.imLeftMenu.setImageResource(R.drawable.side_bar_icon_inactive);
    }

    public void unLockLeftSideMenu() {
        this.leftDrawerFragment.mDrawerLayout.a(0, 3);
        this.imLeftMenu.setEnabled(true);
        this.imLeftMenu.setImageResource(R.drawable.side_bar_icon_active);
    }

    public void lockRightSideMenu() {
        this.rightDrawerFragment.mDrawerLayout.a(1, 5);
        this.imRightMenu.setEnabled(false);
        this.imRightMenu.setVisibility(8);
    }

    public void unLockRightSideMenu(boolean z) {
        this.imRightMenu.setEnabled(true);
        this.imRightMenu.setVisibility(0);
        if (z) {
            this.leftDrawerFragment.mDrawerLayout.a(0, 3);
            this.rightDrawerFragment.mDrawerLayout.a(0, 5);
        } else {
            this.leftDrawerFragment.mDrawerLayout.a(1, 3);
            this.rightDrawerFragment.mDrawerLayout.a(1, 5);
        }
        if (!this.isLoadedLastOrder) {
            this.rightDrawerFragment.getLastOrder();
            this.isLoadedLastOrder = true;
        }
    }

    private void createNavigationDrawer() {
        this.leftDrawerFragment = (LeftDrawerFragment) getSupportFragmentManager().findFragmentById(R.id.left_fragment_navigation_drawer);
        this.leftDrawerFragment.setUp(R.id.left_fragment_navigation_drawer, (DrawerLayout) findViewById(R.id.drawer_layout), null);
        this.rightDrawerFragment = (RightDrawerFragment) getSupportFragmentManager().findFragmentById(R.id.right_fragment_navigation_drawer);
        this.rightDrawerFragment.setUp(R.id.right_fragment_navigation_drawer, (DrawerLayout) findViewById(R.id.drawer_layout), this.toolbar);
        if (TRY_APP) {
            lockRightSideMenu();
        }
    }

    public void displayView(FRAGMENT_TYPE fragment_type, Bundle bundle) {
        if (this.lastType == fragment_type) {
            this.leftDrawerFragment.closeLeftDrawer();
            return;
        }
        Object obj = null;
        try {
            obj = fragment_type.clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        }
        BaseFragment baseFragment = (BaseFragment) obj;
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putSerializable("lastType", this.lastType);
        if (bundle != null) {
            baseFragment.setArguments(bundle);
        }
        if (baseFragment != null) {
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            beginTransaction.replace(R.id.container_body, baseFragment);
            beginTransaction.commitAllowingStateLoss();
        }
        this.lastType = fragment_type;
        if (TRY_APP) {
            if (fragment_type == FRAGMENT_TYPE.HOME) {
                this.tvLogin.setVisibility(0);
            } else {
                this.tvLogin.setVisibility(8);
            }
        } else if (this.lastOrder == null || this.lastOrder.MIKTAR <= 0) {
            lockRightSideMenu();
        } else if (fragment_type == FRAGMENT_TYPE.HOME) {
            unLockRightSideMenu(true);
        } else {
            unLockRightSideMenu(false);
        }
    }

    public void onItemClick(View view, int i) {
        if (MyApplication.getInstance().isConnected()) {
            FRAGMENT_TYPE fragment_type;
            int intValue = ((Integer) ((ImageView) view.findViewById(R.id.im)).getTag()).intValue();
            Bundle bundle = null;
            if (intValue == 0) {
                fragment_type = FRAGMENT_TYPE.HOME;
            } else if (intValue == 1) {
                fragment_type = FRAGMENT_TYPE.PROFILE;
            } else if (intValue == 2) {
                Bundle bundle2 = new Bundle();
                bundle2.putSerializable("campaignList", (Serializable) this.allCampaignList);
                Bundle bundle3 = bundle2;
                fragment_type = FRAGMENT_TYPE.CAMPAIGNS;
                bundle = bundle3;
            } else if (intValue == 3) {
                fragment_type = FRAGMENT_TYPE.ORDER_SUMMARY;
            } else if (intValue == 4) {
                fragment_type = FRAGMENT_TYPE.ANNOUNCEMENTS_AND_NEWS;
            } else if (intValue == 5) {
                fragment_type = FRAGMENT_TYPE.REMINDER;
            } else {
                TutorialViewPagerAdapter.isFromMain = true;
                startActivity(new Intent(this, TutorialActivity.class));
                return;
            }
            this.leftDrawerFragment.closeLeftDrawer();
            displayView(fragment_type, bundle);
            return;
        }
        InfoCallAlertDialogFragment.show(this, "Bağlantı yapılamadı lütfen internet bağlantınızı kontrol ediniz.");
    }

    public void setTitle(int i) {
        if (i != 0) {
            this.tvTitle.setVisibility(0);
            this.tvTitle.setText(getString(i));
            this.imLogo.setVisibility(4);
            return;
        }
        this.tvTitle.setVisibility(4);
        this.tvTitle.setText("");
        this.imLogo.setVisibility(0);
    }

    public void setOnActivityResultDelegate(IActivityResult iActivityResult) {
        this.onActivityResultDelegate = iActivityResult;
    }

    public void setDelegateIBackPressed(IBackPressed iBackPressed) {
        this.delegateIBackPressed = iBackPressed;
    }

    public void setRequestPermissionsDelegate(IRequestPermissionsResult iRequestPermissionsResult) {
        this.delegateRequestPermissionsResult = iRequestPermissionsResult;
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (this.delegateRequestPermissionsResult != null) {
            this.delegateRequestPermissionsResult.onRequestPermissionsResult(i, strArr, iArr);
            this.delegateRequestPermissionsResult = null;
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    public void onBackPressed() {
        if (this.delegateIBackPressed != null) {
            this.delegateIBackPressed.onBackPressed();
            this.delegateIBackPressed = null;
        } else if (this.rightDrawerFragment.isDrawerOpen()) {
            this.rightDrawerFragment.closeRightDrawer();
        } else if (this.lastType == FRAGMENT_TYPE.HOME) {
            super.onBackPressed();
        } else {
            displayView(FRAGMENT_TYPE.HOME, null);
        }
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        if (this.onActivityResultDelegate == null) {
            super.onActivityResult(i, i2, intent);
            if (i == REQUEST_ADDRESS) {
                if (i2 == -1) {
                    Preferences.ADDRESS = (ADRES) intent.getSerializableExtra("address");
                    MyApplication.getInstance().getPreferences().save();
                    getCampaignListFromService(this.serviceBase, Boolean.valueOf(false));
                    return;
                }
                InfoCallAlertDialogFragment.show(this, "Devam edebilmek için lütfen adres seçiniz", this, 0);
            } else if (i == REQUEST_EDIT_LEFT_MENU && this.lastType != null && this.lastType != FRAGMENT_TYPE.HOME) {
                displayView(FRAGMENT_TYPE.HOME, null);
            }
        } else if (i2 == -1 && i == REQUEST_TYPE) {
            super.onActivityResult(i, i2, intent);
            this.onActivityResultDelegate.onActivityResult(intent);
            this.onActivityResultDelegate = null;
        }
    }

    public void getAllOrder() {
        ServiceItem serviceItem = new ServiceItem(REQUEST_TYPE.LAST_10_ORDER);
        serviceItem.parameterList.add(new ServiceItemRequestParameter("TELEFON_NO", Preferences.PHONE_NUMBER));
        ServiceBase serviceBase = this.serviceBase;
        serviceBase.getClass();
        new Retrieve2(serviceItem, this).execute(new Void[0]);
    }

    protected void onResume() {
        super.onResume();
        if (IS_ORDER_SUMMARY_CHANGED) {
            getAllOrder();
            IS_ORDER_SUMMARY_CHANGED = false;
        }
    }

    protected void onSaveInstanceState(Bundle bundle) {
        bundle.putString("WORKAROUND_FOR_BUG_19917_KEY", "WORKAROUND_FOR_BUG_19917_VALUE");
        super.onSaveInstanceState(bundle);
    }
}
