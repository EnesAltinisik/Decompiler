package com.pinarsu.siparis.ui.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import com.adjust.sdk.Adjust;
import com.adjust.sdk.AdjustEvent;
import com.google.android.gms.cast.TextTrackStyle;
import com.pinarsu.siparis.MyApplication;
import com.pinarsu.siparis.Preferences;
import com.pinarsu.siparis.R;
import com.pinarsu.siparis.api.service.ServiceBase;
import com.pinarsu.siparis.api.service.ServiceBase.Retrieve2;
import com.pinarsu.siparis.api.service.ServiceItem;
import com.pinarsu.siparis.api.service.ServiceItem.REQUEST_TYPE;
import com.pinarsu.siparis.api.service.ServiceItemRequestParameter;
import com.pinarsu.siparis.interfaces.IDelegateOneObjectLister;
import com.pinarsu.siparis.interfaces.IDismissListener;
import com.pinarsu.siparis.interfaces.IServiceResponse;
import com.pinarsu.siparis.model.data.SONUC_PARENT;
import com.pinarsu.siparis.model.data.SON_SIPARIS;
import com.pinarsu.siparis.model.data.SON_SIPARIS_PARENT;
import com.pinarsu.siparis.ui.activity.MainActivity;
import com.pinarsu.siparis.view.TextView;
import java.util.Calendar;
import org.b.a.h;

public class RightDrawerFragment extends Fragment implements IDelegateOneObjectLister, IDismissListener, IServiceResponse {
    private MainActivity activity;
    @InjectView(2131558662)
    ImageView imPopup;
    public DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mDrawerToggle;
    private ServiceBase serviceBase;
    @InjectView(2131558578)
    TextView tvAddress;
    @InjectView(2131558665)
    TextView tvLastOrder;

    public void openRightDrawer() {
        this.mDrawerLayout.e(5);
    }

    public void closeRightDrawer() {
        this.mDrawerLayout.f(5);
    }

    public boolean isDrawerOpen() {
        return this.mDrawerLayout.g(5);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.activity = (MainActivity) getActivity();
        this.serviceBase = new ServiceBase(this);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ButterKnife.inject(this, view);
        if (!Preferences.LAST_ORDER_POPUP_VIEWED) {
            this.imPopup.setVisibility(0);
        }
        if (!MainActivity.TRY_APP) {
            getLastOrder();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log.d("MNTTAG", "RightDrawerFragment onCreateView");
        return layoutInflater.inflate(R.layout.fragment_last_order_repeat, viewGroup, false);
    }

    public void setUp(int i, DrawerLayout drawerLayout, Toolbar toolbar) {
        this.mDrawerLayout = drawerLayout;
        final Toolbar toolbar2 = toolbar;
        this.mDrawerToggle = new ActionBarDrawerToggle(getActivity(), drawerLayout, toolbar, R.string.drawer_open, R.string.drawer_close) {
            public void onDrawerOpened(View view) {
                super.onDrawerOpened(view);
                RightDrawerFragment.this.activity.invalidateOptionsMenu();
            }

            public void onDrawerClosed(View view) {
                super.onDrawerClosed(view);
                RightDrawerFragment.this.activity.invalidateOptionsMenu();
            }

            public void onDrawerSlide(View view, float f) {
                super.onDrawerSlide(view, f);
                toolbar2.setAlpha(TextTrackStyle.DEFAULT_FONT_SCALE - (f / 2.0f));
            }
        };
        this.mDrawerToggle.setDrawerIndicatorEnabled(false);
        this.mDrawerLayout.setDrawerListener(this.mDrawerToggle);
        this.mDrawerLayout.post(new Runnable() {
            public void run() {
                RightDrawerFragment.this.mDrawerToggle.syncState();
            }
        });
    }

    public void onResponse(ServiceItem serviceItem) {
        if (serviceItem.serviceErrorItem == null) {
            if (serviceItem.type == REQUEST_TYPE.LAST_ORDER) {
                if (serviceItem.object != null) {
                    SON_SIPARIS son_siparis = ((SON_SIPARIS_PARENT) serviceItem.object).lastOrder;
                    this.activity.lastOrder = son_siparis;
                    if (son_siparis != null && son_siparis.MIKTAR > 0) {
                        CharSequence charSequence = "";
                        CharSequence charSequence2 = son_siparis.MIKTAR + " Adet " + son_siparis.MALZEME_ADI;
                        if (!son_siparis.ADRES.isEmpty()) {
                            charSequence = son_siparis.ADRES;
                        }
                        this.tvLastOrder.setText(charSequence2);
                        this.tvAddress.setText(charSequence);
                        this.activity.unLockRightSideMenu(true);
                        if (!Preferences.HOME_ORDER_POPUP_VIEWED) {
                            ImageView imageView = (ImageView) this.activity.findViewById(R.id.imHomePopup);
                            imageView.setVisibility(0);
                            imageView.bringToFront();
                            imageView.setOnClickListener(new OnClickListener() {
                                public void onClick(View view) {
                                    Preferences.HOME_ORDER_POPUP_VIEWED = true;
                                    MyApplication.getInstance().getPreferences().save();
                                    view.setVisibility(8);
                                }
                            });
                            return;
                        }
                        return;
                    }
                }
                this.activity.lastOrder = null;
                this.activity.lockRightSideMenu();
            } else if (serviceItem.type != REQUEST_TYPE.GIVE_ORDER) {
            } else {
                if (serviceItem.object != null) {
                    SONUC_PARENT sonuc_parent = (SONUC_PARENT) serviceItem.object;
                    if (sonuc_parent == null || sonuc_parent.SONUC == null || sonuc_parent.SONUC.isEmpty()) {
                        InfoCallAlertDialogFragment.show(this.activity, "Siparişiniz tarafımıza ulaştı en yakın zamanda su teslimatınız yapılacaktır.", this, 0);
                        Adjust.trackEvent(new AdjustEvent("7iv9kq"));
                        this.activity.getAllOrder();
                        return;
                    }
                    InfoCallAlertDialogFragment.show(this.activity, "Sipariş Kaydedilemedi\n" + sonuc_parent.SONUC);
                    return;
                }
                InfoCallAlertDialogFragment.show(this.activity, "Sipariş Kaydedilemedi");
            }
        } else if (serviceItem.type == REQUEST_TYPE.LAST_ORDER) {
            this.activity.lockRightSideMenu();
        }
    }

    public void getLastOrder() {
        ServiceItem serviceItem = new ServiceItem(REQUEST_TYPE.LAST_ORDER);
        serviceItem.parameterList.add(new ServiceItemRequestParameter("TELEFON_NO", Preferences.PHONE_NUMBER));
        ServiceBase serviceBase = this.serviceBase;
        serviceBase.getClass();
        new Retrieve2(serviceBase, serviceItem, this.activity).execute(new Void[0]);
    }

    @OnClick({2131558664})
    void clickFrameLastOrderRepeat() {
        popupGiveOrder();
    }

    @OnClick({2131558663})
    void clickBlob() {
        popupGiveOrder();
    }

    private void popupGiveOrder() {
        YesOrNoFragment.show(this.activity, this, 0, "", "Son siparişinizi tekrarlamak istediğinize emin misiniz?", "İptal", "Sipariş Ver");
    }

    private void giveOrder() {
        SON_SIPARIS son_siparis = this.activity.lastOrder;
        Calendar instance = Calendar.getInstance();
        int i = instance.get(1);
        int i2 = instance.get(2) + 1;
        String str = i + "-" + String.format("%02d", new Object[]{Integer.valueOf(i2)}) + "-" + String.format("%02d", new Object[]{Integer.valueOf(instance.get(5))});
        ServiceItem serviceItem = new ServiceItem(REQUEST_TYPE.GIVE_ORDER);
        serviceItem.parameterList.add(new ServiceItemRequestParameter("BAYI_NO  ", son_siparis.BAYI_NO));
        h hVar = new h("", "SIPARISLER");
        h hVar2 = new h("", "item");
        hVar2.b("MALZEME", son_siparis.MALZEME_NO);
        hVar2.b("ADET", Integer.valueOf(son_siparis.MIKTAR));
        hVar2.b("TARIH", str);
        hVar2.b("ARALIK_ID", "");
        hVar2.b("ILERI_TARIHLI", "");
        hVar2.b("ACIKLAMA", "");
        hVar2.b("SIPARIS_KANALI", "5");
        hVar.a(hVar2);
        serviceItem.parameterList.add(new ServiceItemRequestParameter("", hVar));
        serviceItem.parameterList.add(new ServiceItemRequestParameter("TELEFON_NO ", Preferences.PHONE_NUMBER));
        ServiceBase serviceBase = new ServiceBase(this);
        serviceBase.getClass();
        new Retrieve2(serviceBase, serviceItem, this.activity).execute(new Void[0]);
    }

    public void onObject(Object obj, int i) {
        if (obj != null) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            Log.d("MNTTAG", "" + booleanValue);
            if (!booleanValue) {
                giveOrder();
            }
        }
    }

    public void onDismissListener(int i) {
        closeRightDrawer();
    }

    @OnClick({2131558662})
    void clickPopup() {
        Preferences.LAST_ORDER_POPUP_VIEWED = true;
        MyApplication.getInstance().getPreferences().save();
        this.imPopup.setVisibility(4);
    }
}
