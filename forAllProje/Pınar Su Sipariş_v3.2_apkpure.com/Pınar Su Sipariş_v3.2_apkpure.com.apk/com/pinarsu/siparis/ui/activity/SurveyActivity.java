package com.pinarsu.siparis.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.widget.TextView;
import butterknife.ButterKnife;
import butterknife.InjectView;
import com.pinarsu.siparis.Preferences;
import com.pinarsu.siparis.R;
import com.pinarsu.siparis.adapter.SurveyViewPagerAdapter;
import com.pinarsu.siparis.api.service.ServiceBase;
import com.pinarsu.siparis.api.service.ServiceBase.Retrieve2;
import com.pinarsu.siparis.api.service.ServiceItem;
import com.pinarsu.siparis.api.service.ServiceItem.REQUEST_TYPE;
import com.pinarsu.siparis.api.service.ServiceItemRequestParameter;
import com.pinarsu.siparis.interfaces.IClickListener;
import com.pinarsu.siparis.interfaces.IDismissListener;
import com.pinarsu.siparis.interfaces.IIndicatorPageSelectionListener;
import com.pinarsu.siparis.interfaces.IServiceResponse;
import com.pinarsu.siparis.model.SurveyAnswer;
import com.pinarsu.siparis.model.data.ANKET_ARAMA_PARENT;
import com.pinarsu.siparis.model.data.SORULAR;
import com.pinarsu.siparis.ui.fragment.InfoCallAlertDialogFragment;
import com.pinarsu.siparis.view.ViewPagerIndicator;
import java.util.List;
import org.b.a.h;

public class SurveyActivity extends BaseActivity implements IClickListener, IDismissListener, IIndicatorPageSelectionListener, IServiceResponse {
    @InjectView(2131558644)
    ViewPagerIndicator indicator;
    public List<SORULAR> list;
    ANKET_ARAMA_PARENT parent = null;
    public int size;
    @InjectView(2131558641)
    TextView tvProgress;
    @InjectView(2131558642)
    TextView tvTotalSize;
    @InjectView(2131558643)
    ViewPager viewPager;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("Müşteri Anketi");
        ButterKnife.inject((Activity) this);
        this.parent = (ANKET_ARAMA_PARENT) getIntent().getExtras().getSerializable("parent");
        setView();
    }

    private void setView() {
        this.list = this.parent.list;
        this.size = this.list.size();
        this.tvTotalSize.setText(" / " + this.size);
        this.viewPager.setAdapter(new SurveyViewPagerAdapter(getSupportFragmentManager(), this.list, this));
        this.indicator.setDelegatePageSelectionListener(this);
        this.indicator.setViewPager(this.viewPager);
        this.viewPager.bringToFront();
    }

    public int getLayoutResource() {
        return R.layout.activity_survey;
    }

    public void onResponse(ServiceItem serviceItem) {
        if (serviceItem.serviceErrorItem == null) {
            InfoCallAlertDialogFragment.show(this, "Anket başarıyla gönderildi.", this, 0);
        } else {
            InfoCallAlertDialogFragment.show(this, serviceItem.serviceErrorItem.detail);
        }
    }

    public void onPageSelected(int i) {
        this.tvProgress.setText("" + (i + 1));
        Log.d("MNTTAG", "onPageSelected   : " + i);
    }

    public void onClickListener(int i) {
        if (i == this.size - 1) {
            ServiceItem serviceItem = new ServiceItem(REQUEST_TYPE.SURVEY_SAVE);
            serviceItem.parameterList.add(new ServiceItemRequestParameter("ANKET_ID  ", "" + this.parent.ANKET_ID));
            h hVar = new h("", "CEVAPLAR");
            for (SORULAR sorular : this.list) {
                h hVar2 = new h("", "item");
                hVar2.b("SORU_ID", Long.valueOf(sorular.SORU_ID));
                hVar2.b("CEVAP_METNI", sorular.CEVAP_METNI);
                h hVar3 = new h("", "CEVAP_SECENEKLERI");
                int i2 = 0;
                for (SurveyAnswer surveyAnswer : sorular.answerObjectList) {
                    int i3;
                    if (surveyAnswer.isChecked) {
                        hVar3.b("item", surveyAnswer.answer);
                        i3 = i2 + 1;
                    } else {
                        i3 = i2;
                    }
                    i2 = i3;
                }
                if (i2 == 0) {
                    InfoCallAlertDialogFragment.show(this, "Lütfen tüm anket sorularını cevaplayınız.");
                    return;
                }
                Log.d("MNTTAG", hVar3.toString());
                hVar2.a(hVar3);
                hVar.a(hVar2);
            }
            serviceItem.parameterList.add(new ServiceItemRequestParameter("", hVar));
            serviceItem.parameterList.add(new ServiceItemRequestParameter("TELEFON_NO ", Preferences.PHONE_NUMBER));
            ServiceBase serviceBase = new ServiceBase(this);
            serviceBase.getClass();
            new Retrieve2(serviceItem, this.activity).execute(new Void[0]);
        } else {
            this.viewPager.setCurrentItem(i + 1);
        }
        Log.d("MNTTAG", "onPageSelected   : " + i);
    }

    public void onDismissListener(int i) {
        finish();
    }
}
