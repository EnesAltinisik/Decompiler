package com.pinarsu.siparis.ui.fragment;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import com.pinarsu.siparis.Preferences;
import com.pinarsu.siparis.R;
import com.pinarsu.siparis.api.service.ServiceBase;
import com.pinarsu.siparis.api.service.ServiceBase.Retrieve2;
import com.pinarsu.siparis.api.service.ServiceItem;
import com.pinarsu.siparis.api.service.ServiceItem.REQUEST_TYPE;
import com.pinarsu.siparis.api.service.ServiceItemRequestParameter;
import com.pinarsu.siparis.interfaces.IBackPressed;
import com.pinarsu.siparis.interfaces.IDatePickerListener;
import com.pinarsu.siparis.interfaces.IServiceResponse;
import com.pinarsu.siparis.model.data.MALZEMELER;
import com.pinarsu.siparis.model.data.SIPARIS_TUTARI_PARENT;
import com.pinarsu.siparis.model.data.SONUC_PARENT;
import com.pinarsu.siparis.model.data.TESLIMAT_SAATLERI;
import com.pinarsu.siparis.tools.DateTimeTool;
import com.pinarsu.siparis.tools.DateTimeTool.DATETIMEFORMAT;
import com.pinarsu.siparis.ui.activity.DeliveryHoursActivity;
import com.pinarsu.siparis.ui.activity.MainActivity;
import com.pinarsu.siparis.ui.activity.MainActivity.FRAGMENT_TYPE;
import com.pinarsu.siparis.ui.activity.Order4Activity;
import com.pinarsu.siparis.ui.activity.OrderActivity;
import com.pinarsu.siparis.view.EditText;
import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
import org.b.a.h;

@SuppressLint({"ParcelCreator"})
public class Order3Fragment extends Fragment implements IBackPressed, IDatePickerListener, IServiceResponse {
    private String ARALIK_ID;
    private OrderActivity activity;
    private int day;
    @InjectView(2131558675)
    EditText edOrderNote;
    @InjectView(2131558672)
    ImageView imNow;
    @InjectView(2131558674)
    ImageView imSelectCalendar;
    private boolean isToday = true;
    @InjectView(2131558676)
    LinearLayout linearCampaigns;
    private int month;
    private List<MALZEMELER> productList;
    private Resources resources;
    private SIPARIS_TUTARI_PARENT siparisTutariParent;
    private int thisDay;
    private int thisMonth;
    private int thisYear;
    @InjectView(2131558623)
    TextView tvAmount;
    @InjectView(2131558677)
    TextView tvCampaignInfo;
    @InjectView(2131558572)
    TextView tvSelectedDate;
    @InjectView(2131558673)
    TextView tvToday;
    @InjectView(2131558678)
    TextView tvWarning;
    private int year;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.activity = (OrderActivity) getActivity();
        this.resources = this.activity.getResources();
        this.productList = this.activity.productList;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_order3, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ButterKnife.inject(this, view);
        Calendar instance = Calendar.getInstance();
        this.thisYear = instance.get(1);
        this.thisMonth = instance.get(2);
        this.thisDay = instance.get(5);
        this.year = this.thisYear;
        this.month = this.thisMonth;
        this.day = this.thisDay;
        String format = String.format("%02d", new Object[]{Integer.valueOf(instance.get(11))});
        this.tvToday.setText("(" + this.resources.getString(R.string.today) + ", " + (format + "." + String.format("%02d", new Object[]{Integer.valueOf(instance.get(12))})) + ")");
        this.siparisTutariParent = (SIPARIS_TUTARI_PARENT) getArguments().getSerializable("SIPARIS_TUTARI_PARENT");
        setView();
    }

    public void onResume() {
        super.onResume();
        this.activity.setDelegateIBackPressed(this);
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    public void onDetach() {
        super.onDetach();
    }

    @OnClick({2131558671})
    void clickNow() {
        this.day = this.thisDay;
        this.month = this.thisMonth;
        this.year = this.thisYear;
        this.isToday = true;
        this.imNow.setImageResource(R.drawable.check_green_white2);
        this.imSelectCalendar.setImageResource(R.drawable.circle_white);
    }

    @OnClick({2131558571})
    void clickSelectCalendar() {
        if (this.activity.deliveryList == null || this.activity.deliveryList.size() <= 0) {
            InfoCallAlertDialogFragment.show(this.activity, "Teslimat saati bulunamadı.");
            return;
        }
        Intent intent = new Intent(this.activity, DeliveryHoursActivity.class);
        intent.putExtra("deliveryList", (Serializable) this.activity.deliveryList);
        startActivityForResult(intent, 111);
    }

    public void onDateSet(int i, int i2, int i3) {
        this.year = i;
        this.month = i2;
        this.day = i3;
        this.tvSelectedDate.setText("(" + String.format("%02d", new Object[]{Integer.valueOf(i3)}) + " " + DateTimeTool.MONTHS[i2] + " " + i + ")");
        Log.d("MNTTAG", "year : " + i);
        Log.d("MNTTAG", "month : " + i2);
        Log.d("MNTTAG", "day : " + i3);
    }

    @OnClick({2131558679})
    void clickGiveOrder() {
        String str = this.thisDay + "." + this.thisMonth + "." + this.thisYear;
        String str2 = this.day + "." + this.month + "." + this.year;
        Calendar dateTime = DateTimeTool.getDateTime(str, DATETIMEFORMAT.ONLYDATE);
        Calendar dateTime2 = DateTimeTool.getDateTime(str2, DATETIMEFORMAT.ONLYDATE);
        long timeInMillis = dateTime.getTimeInMillis();
        long timeInMillis2 = dateTime2.getTimeInMillis();
        if (timeInMillis > timeInMillis2) {
            InfoCallAlertDialogFragment.show(this.activity, "Geçmiş tarihe sipariş veremezsiniz.");
            return;
        }
        if (timeInMillis == timeInMillis2) {
            this.isToday = true;
        }
        String str3 = Preferences.ADDRESS.BAYI_NO;
        int i = this.month + 1;
        String str4 = this.year + "-" + String.format("%02d", new Object[]{Integer.valueOf(i)}) + "-" + String.format("%02d", new Object[]{Integer.valueOf(this.day)});
        str = "";
        if (this.isToday) {
            this.ARALIK_ID = "";
            Object obj = str;
        } else {
            str2 = "X";
        }
        String obj2 = this.edOrderNote.getText().toString();
        ServiceItem serviceItem = new ServiceItem(REQUEST_TYPE.GIVE_ORDER);
        serviceItem.parameterList.add(new ServiceItemRequestParameter("BAYI_NO  ", str3));
        h hVar = new h("", "SIPARISLER");
        for (MALZEMELER malzemeler : this.productList) {
            h hVar2 = new h("", "item");
            hVar2.b("MALZEME", malzemeler.MALZEME);
            hVar2.b("ADET", Integer.valueOf(malzemeler.MIKTAR));
            hVar2.b("TARIH", str4);
            hVar2.b("ARALIK_ID", this.ARALIK_ID);
            hVar2.b("ILERI_TARIHLI", obj);
            hVar2.b("ACIKLAMA", obj2);
            hVar2.b("SIPARIS_KANALI", "5");
            hVar.a(hVar2);
        }
        serviceItem.parameterList.add(new ServiceItemRequestParameter("", hVar));
        serviceItem.parameterList.add(new ServiceItemRequestParameter("TELEFON_NO ", Preferences.PHONE_NUMBER));
        ServiceBase serviceBase = new ServiceBase(this);
        serviceBase.getClass();
        new Retrieve2(serviceBase, serviceItem, this.activity).execute(new Void[0]);
    }

    public void onResponse(ServiceItem serviceItem) {
        if (serviceItem.serviceErrorItem != null) {
            InfoCallAlertDialogFragment.show(this.activity, serviceItem.serviceErrorItem.detail);
        } else if (serviceItem.type != REQUEST_TYPE.GIVE_ORDER) {
        } else {
            if (serviceItem.object != null) {
                SONUC_PARENT sonuc_parent = (SONUC_PARENT) serviceItem.object;
                if (sonuc_parent == null || sonuc_parent.SONUC == null || sonuc_parent.SONUC.isEmpty()) {
                    MainActivity.IS_ORDER_SUMMARY_CHANGED = true;
                    Bundle bundle = new Bundle();
                    bundle.putString("amount", this.tvAmount.getText().toString());
                    bundle.putString("BASARILI_SONUC_MESAJI", sonuc_parent.BASARILI_SONUC_MESAJI);
                    this.activity.startActivity(new Intent(this.activity, Order4Activity.class).putExtras(bundle));
                    this.activity.finish();
                    return;
                }
                InfoCallAlertDialogFragment.show(this.activity, "" + sonuc_parent.SONUC);
                return;
            }
            InfoCallAlertDialogFragment.show(this.activity, "Sipariş Kaydedilemedi");
        }
    }

    public void onBackPressed() {
        this.activity.displayView(FRAGMENT_TYPE.ORDER2, null);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        OrderActivity orderActivity = this.activity;
        if (i2 == -1 && i == 111) {
            this.isToday = false;
            this.imNow.setImageResource(R.drawable.circle_white);
            this.imSelectCalendar.setImageResource(R.drawable.check_green_white2);
            TESLIMAT_SAATLERI teslimat_saatleri = (TESLIMAT_SAATLERI) intent.getSerializableExtra("deliveryHours");
            this.ARALIK_ID = teslimat_saatleri.ARALIK_ID;
            Calendar dateTime = DateTimeTool.getDateTime(teslimat_saatleri.TARIH, DATETIMEFORMAT.AROX);
            this.year = dateTime.get(1);
            this.month = dateTime.get(2);
            this.day = dateTime.get(5);
            String hourMinute = DateTimeTool.getHourMinute(teslimat_saatleri.BASLANGIC_SAATI);
            this.tvSelectedDate.setText("(" + DateTimeTool.getDateWithMonthName(teslimat_saatleri.TARIH, DATETIMEFORMAT.AROX) + " " + hourMinute + " - " + DateTimeTool.getHourMinute(teslimat_saatleri.BITIS_SAATI) + ")");
            Log.d("MNTTAG", "year : " + this.year);
            Log.d("MNTTAG", "month : " + this.month);
            Log.d("MNTTAG", "day : " + this.day);
            Log.d("MNTTAG", "ARALIK_ID : " + teslimat_saatleri.ARALIK_ID);
        }
    }

    private void setView() {
        String str = this.siparisTutariParent.TUTAR;
        if (str == null || str.isEmpty() || str.equals("-1")) {
            this.tvAmount.setText("");
            this.tvAmount.setVisibility(8);
        } else {
            this.tvAmount.setVisibility(0);
            this.tvAmount.setText("Tutar: " + str + " TL");
        }
        CharSequence charSequence = this.siparisTutariParent.KAMPANYA_BILGISI;
        if (charSequence == null || charSequence.isEmpty()) {
            this.linearCampaigns.setVisibility(8);
        } else {
            this.linearCampaigns.setVisibility(0);
            this.tvCampaignInfo.setText(charSequence);
        }
        str = this.siparisTutariParent.UCRET_NOTU;
        if (str == null || str.isEmpty()) {
            this.tvWarning.setVisibility(8);
            return;
        }
        this.tvWarning.setVisibility(0);
        this.tvWarning.setText("*" + str);
    }
}
