package com.pinarsu.siparis.ui.fragment;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import butterknife.OnItemClick;
import com.pinarsu.siparis.MyApplication;
import com.pinarsu.siparis.Preferences;
import com.pinarsu.siparis.R;
import com.pinarsu.siparis.adapter.ProductAdapter;
import com.pinarsu.siparis.adapter.ViewPagerAdapter;
import com.pinarsu.siparis.api.service.ServiceBase;
import com.pinarsu.siparis.api.service.ServiceBase.Retrieve2;
import com.pinarsu.siparis.api.service.ServiceItem;
import com.pinarsu.siparis.api.service.ServiceItem.REQUEST_TYPE;
import com.pinarsu.siparis.api.service.ServiceItemRequestParameter;
import com.pinarsu.siparis.interfaces.IActivityResult;
import com.pinarsu.siparis.interfaces.IDelegateOneObjectLister;
import com.pinarsu.siparis.interfaces.IDismissListener;
import com.pinarsu.siparis.interfaces.IServiceResponse;
import com.pinarsu.siparis.model.ViewPagerItem;
import com.pinarsu.siparis.model.data.ADRES;
import com.pinarsu.siparis.model.data.KAMPANYALAR_PARENT;
import com.pinarsu.siparis.model.data.MALZEMELER;
import com.pinarsu.siparis.model.data.MALZEMELER_PARENT;
import com.pinarsu.siparis.model.data.TUM_MALZEMELER_PARENT;
import com.pinarsu.siparis.tools.Tools;
import com.pinarsu.siparis.ui.activity.AllAddressActivity;
import com.pinarsu.siparis.ui.activity.LoginActivity;
import com.pinarsu.siparis.ui.activity.MainActivity;
import com.pinarsu.siparis.ui.activity.MainActivity.FRAGMENT_TYPE;
import com.pinarsu.siparis.ui.activity.OrderActivity;
import com.pinarsu.siparis.ui.fragment.ViewPagerFragment.IMAGE_TYPE;
import com.pinarsu.siparis.view.TextView;
import com.pinarsu.siparis.view.ViewPagerIndicator;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"ParcelCreator"})
public class HomeFragment extends BaseFragment implements IActivityResult, IDelegateOneObjectLister, IDismissListener, IServiceResponse {
    private ProductAdapter adapter;
    private ADRES address;
    private TUM_MALZEMELER_PARENT allProductParent;
    private List<ViewPagerItem> bannerList;
    private int bannerSize;
    @InjectView(2131558661)
    FrameLayout frameCampaigns;
    private Handler handler;
    private boolean isInternetExceptionShowing = false;
    @InjectView(2131558581)
    ListView lv;
    private String number;
    private List<MALZEMELER> productList;
    private MALZEMELER_PARENT productParent;
    private Runnable runnable = new Runnable() {
        public void run() {
            if (HomeFragment.this.viewPager == null) {
                HomeFragment.this.stopSlide();
                return;
            }
            int currentItem = HomeFragment.this.viewPager.getCurrentItem();
            if (currentItem >= HomeFragment.this.bannerSize) {
                currentItem = 0;
            } else {
                currentItem++;
            }
            try {
                HomeFragment.this.viewPager.a(currentItem % HomeFragment.this.bannerSize, true);
                HomeFragment.this.handler.postDelayed(HomeFragment.this.runnable, 7000);
            } catch (IllegalStateException e) {
                HomeFragment.this.stopSlide();
            } catch (IllegalArgumentException e2) {
                HomeFragment.this.stopSlide();
            }
        }
    };
    private ServiceBase serviceBase;
    private TextView tvAddress;
    private ViewPager viewPager;
    private ViewPagerAdapter viewPagerAdapter;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.d("MNTTAG", "HomeFragment onCreate");
        this.serviceBase = new ServiceBase(this);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.activity.setTitle(0);
        this.activity.setDelegateIBackPressed(null);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    public void onPause() {
        super.onPause();
        if (this.adapter != null) {
            stopSlide();
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (!Preferences.HOME_ORDER_POPUP_VIEWED) {
            ((ImageView) this.activity.findViewById(R.id.imHomePopup)).setVisibility(8);
        }
    }

    public void onResume() {
        super.onResume();
        if (this.adapter != null) {
            startSlide();
            if (!Preferences.HOME_ORDER_POPUP_VIEWED) {
                ((ImageView) this.activity.findViewById(R.id.imHomePopup)).setVisibility(0);
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ButterKnife.inject(this, view);
        if (this.activity.campaignList == null || this.activity.campaignList.size() == 0) {
            this.frameCampaigns.setVisibility(8);
        }
        this.address = Preferences.ADDRESS;
        getProductInAddress();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    public void onDetach() {
        super.onDetach();
    }

    public int getLayoutResource() {
        return R.layout.fragment_home;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
    }

    public void onResponse(ServiceItem serviceItem) {
        if (serviceItem.serviceErrorItem != null) {
            String str = serviceItem.serviceErrorItem.detail;
            if (str.contains("#")) {
                String[] split = str.split("#");
                str = split[1];
                Log.d("MNTTAG", str);
                this.number = str;
                YesOrNoFragment.show(this.activity, this, 123, "", split[0], getString(R.string.try_again), getString(R.string.call));
            } else if (!this.isInternetExceptionShowing) {
                this.isInternetExceptionShowing = true;
                InternetConnectionDialogFragment.show(this.activity, this, getString(R.string.service_error), 111);
            }
        } else if (serviceItem.type == REQUEST_TYPE.ALL_PRODUCTS || serviceItem.type == REQUEST_TYPE.PRODUCTS_IN_ADDRESS) {
            if (serviceItem.object != null) {
                if (MainActivity.TRY_APP) {
                    this.allProductParent = (TUM_MALZEMELER_PARENT) serviceItem.object;
                    this.activity.allProductParent = this.allProductParent;
                } else {
                    this.productParent = (MALZEMELER_PARENT) serviceItem.object;
                    this.activity.productParent = this.productParent;
                }
                setView();
            }
        } else if (serviceItem.type == REQUEST_TYPE.CAMPAIGNS_IN_ADDRESS) {
            if (serviceItem.object != null) {
                KAMPANYALAR_PARENT kampanyalar_parent = (KAMPANYALAR_PARENT) serviceItem.object;
                this.activity.campaignList = kampanyalar_parent.list;
            }
            if (this.activity.campaignList == null || this.activity.campaignList.size() == 0) {
                this.frameCampaigns.setVisibility(8);
            } else {
                this.frameCampaigns.setVisibility(0);
            }
        }
    }

    private void setView() {
        if (MainActivity.TRY_APP) {
            this.productList = this.allProductParent.productList;
        } else {
            this.productList = this.productParent.productList;
        }
        if (this.productList != null && this.productList.size() > 0) {
            List list;
            if (MainActivity.TRY_APP) {
                list = this.allProductParent.bannerList;
            } else {
                list = this.productParent.bannerList;
            }
            List arrayList = new ArrayList();
            if (r0 == null || r0.size() <= 0) {
                arrayList.add(new ViewPagerItem(null, null, R.drawable.banner720, IMAGE_TYPE.FROM_DRAWABLE));
            } else {
                for (String viewPagerItem : r0) {
                    arrayList.add(new ViewPagerItem(null, viewPagerItem, 0, IMAGE_TYPE.FROM_URL));
                }
            }
            this.bannerList = arrayList;
            this.adapter = new ProductAdapter(this.activity, this.productList);
            setViewPager();
            this.lv.setAdapter(this.adapter);
        }
    }

    private void setViewPager() {
        View inflate = this.activity.getLayoutInflater().inflate(R.layout.header_home, null);
        FrameLayout frameLayout = (FrameLayout) inflate.findViewById(R.id.frame);
        ((LinearLayout) inflate.findViewById(R.id.linearCurrentAddress)).setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (MainActivity.TRY_APP) {
                    HomeFragment.this.loginPopup();
                    return;
                }
                HomeFragment.this.activity.setOnActivityResultDelegate(HomeFragment.this);
                Intent intent = new Intent(HomeFragment.this.activity, AllAddressActivity.class);
                intent.putExtra("isFromHome", true);
                HomeFragment.this.activity.startActivityForResult(intent, MainActivity.REQUEST_TYPE);
            }
        });
        this.bannerSize = this.bannerList.size();
        this.viewPagerAdapter = new ViewPagerAdapter(this.activity.getSupportFragmentManager(), this.bannerList, null);
        if (this.viewPager == null) {
            this.tvAddress = (TextView) inflate.findViewById(R.id.tvAddress);
            this.viewPager = (ViewPager) inflate.findViewById(R.id.viewPager);
            ViewPagerIndicator viewPagerIndicator = (ViewPagerIndicator) inflate.findViewById(R.id.indicator);
            this.viewPager.setAdapter(this.viewPagerAdapter);
            viewPagerIndicator.setViewPager(this.viewPager);
            viewPagerIndicator.bringToFront();
            frameLayout.getLayoutParams().height = (MyApplication.SCREEN_WIDTH * 3) / 4;
            this.lv.addHeaderView(inflate);
            startSlide();
        } else {
            this.adapter.notifyDataSetChanged();
        }
        setAddress();
    }

    public void startSlide() {
        try {
            if (this.handler == null) {
                this.handler = new Handler();
            }
            if (this.bannerSize > 1) {
                this.handler.postDelayed(this.runnable, 2000);
            }
        } catch (Exception e) {
        }
    }

    public void stopSlide() {
        if (this.handler != null) {
            this.handler.removeCallbacks(this.runnable);
            this.handler = null;
        }
    }

    private void setAddress() {
        CharSequence charSequence = "";
        if (MainActivity.TRY_APP) {
            charSequence = "Adres";
        } else if (this.address != null) {
            if (!(this.address.ILCE_ADI == null || this.address.ILCE_ADI.isEmpty())) {
                charSequence = charSequence + this.address.ILCE_ADI;
            }
            if (!(this.address.IL_ADI == null || this.address.IL_ADI.isEmpty())) {
                if (charSequence.isEmpty()) {
                    charSequence = this.address.IL_ADI;
                } else {
                    charSequence = charSequence + " / " + this.address.IL_ADI;
                }
            }
        } else {
            charSequence = "";
        }
        this.tvAddress.setText(charSequence);
    }

    public void onActivityResult(Intent intent) {
        ADRES adres = (ADRES) intent.getSerializableExtra("address");
        Log.d("MNTTAG", "+address.BAYI_NO : " + adres.BAYI_NO);
        if (!this.address.BAYI_NO.equals(adres.BAYI_NO)) {
            this.address = adres;
            Preferences.ADDRESS = adres;
            MyApplication.getInstance().getPreferences().save();
            setAddress();
            this.activity.productParent = null;
            this.frameCampaigns.setVisibility(8);
            this.activity.getCampaignListFromService(this.serviceBase, Boolean.valueOf(false));
            getProductInAddress();
        }
    }

    private void getProductInAddress() {
        if (!Tools.isInternetConnected(this.activity)) {
            InternetConnectionDialogFragment.show(this.activity, this, getString(R.string.no_internet_connection), 111);
        } else if (MainActivity.TRY_APP) {
            if (this.activity.allProductParent == null) {
                r0 = new ServiceItem(REQUEST_TYPE.ALL_PRODUCTS);
                r2 = this.serviceBase;
                r2.getClass();
                new Retrieve2(r2, r0, this.activity).execute(new Void[0]);
                return;
            }
            this.allProductParent = this.activity.allProductParent;
            setView();
        } else if (this.activity.productParent == null) {
            r0 = new ServiceItem(REQUEST_TYPE.PRODUCTS_IN_ADDRESS);
            r0.parameterList.add(new ServiceItemRequestParameter("BAYI_NO", Preferences.ADDRESS.BAYI_NO));
            r0.parameterList.add(new ServiceItemRequestParameter("TELEFON_NO", Preferences.PHONE_NUMBER));
            r2 = this.serviceBase;
            r2.getClass();
            new Retrieve2(r2, r0, this.activity).execute(new Void[0]);
        } else {
            this.productParent = this.activity.productParent;
            setView();
        }
    }

    @OnItemClick({2131558581})
    void itemClick(int i) {
        if (MainActivity.TRY_APP) {
            loginPopup();
        } else if (i > 0) {
            int i2 = i - 1;
            Log.d("MNTTAG", "positionlvv : " + i2);
            List list = this.productParent.deliveryList;
            MALZEMELER malzemeler = (MALZEMELER) this.productList.get(i2);
            Intent intent = new Intent(this.activity, OrderActivity.class);
            if (list != null) {
                intent.putExtra("deliveryList", (Serializable) list);
            }
            intent.putExtra("productListParent", (Serializable) this.productList);
            intent.putExtra("product", malzemeler);
            this.activity.startActivity(intent);
        }
    }

    @OnClick({2131558661})
    void clickCampaigns() {
        Bundle bundle = new Bundle();
        bundle.putSerializable("campaignList", (Serializable) this.activity.campaignList);
        this.activity.displayView(FRAGMENT_TYPE.CAMPAIGNS, bundle);
    }

    public void loginPopup() {
        YesOrNoFragment.show(this.activity, this, 111, "", "Uygulamanın tüm özelliklerini kullanabilmek için giriş yapmanız gerekmektedir.", "İptal", "Giriş Yap");
    }

    public void onObject(Object obj, int i) {
        if (obj != null) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            Log.d("MNTTAG", "" + booleanValue);
            if (i == 111) {
                if (!booleanValue) {
                    this.activity.startActivity(new Intent(this.activity, LoginActivity.class));
                    this.activity.finish();
                }
            } else if (i != 123) {
            } else {
                if (booleanValue) {
                    onDismissListener(0);
                    return;
                }
                Tools.callNumber(this.activity, this.number);
                this.activity.finish();
            }
        }
    }

    public void onDismissListener(int i) {
        this.isInternetExceptionShowing = false;
        startActivity(new Intent(this.activity, MainActivity.class));
        this.activity.finish();
    }
}
