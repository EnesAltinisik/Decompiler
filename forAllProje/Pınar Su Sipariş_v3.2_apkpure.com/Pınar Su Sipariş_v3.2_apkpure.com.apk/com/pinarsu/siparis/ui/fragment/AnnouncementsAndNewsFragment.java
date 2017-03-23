package com.pinarsu.siparis.ui.fragment;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnItemClick;
import com.google.android.gms.plus.PlusShare;
import com.pinarsu.siparis.R;
import com.pinarsu.siparis.adapter.AnnouncementsAndNewsBaseAdapter;
import com.pinarsu.siparis.api.service.ServiceBase;
import com.pinarsu.siparis.api.service.ServiceBase.Retrieve2;
import com.pinarsu.siparis.api.service.ServiceItem;
import com.pinarsu.siparis.api.service.ServiceItem.REQUEST_TYPE;
import com.pinarsu.siparis.interfaces.IServiceResponse;
import com.pinarsu.siparis.model.data.DUYURULAR;
import com.pinarsu.siparis.model.data.DUYURULAR_PARENT;
import com.pinarsu.siparis.model.data.SERTIFIKALAR;
import com.pinarsu.siparis.ui.activity.ImageViewerActivity;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"ParcelCreator"})
public class AnnouncementsAndNewsFragment extends BaseFragment implements IServiceResponse {
    List<DUYURULAR> duyurularList;
    @InjectView(2131558581)
    ListView lv;
    List<SERTIFIKALAR> sertifikalarList;
    @InjectView(2131558660)
    TextView tvNoRecord;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.activity.setTitle(R.string.announcements_and_news);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ButterKnife.inject((Object) this, view);
        if ((this.duyurularList == null || this.duyurularList.size() <= 0) && (this.sertifikalarList == null || this.sertifikalarList.size() <= 0)) {
            ServiceItem serviceItem = new ServiceItem(REQUEST_TYPE.ANNOUNCEMENTS_AND_NEWS);
            ServiceBase serviceBase = new ServiceBase(this);
            serviceBase.getClass();
            new Retrieve2(serviceItem, this.activity).execute(new Void[0]);
            return;
        }
        setView();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    public void onDetach() {
        super.onDetach();
    }

    public int getLayoutResource() {
        return R.layout.fragment_announcements_and_news;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
    }

    public void onResponse(ServiceItem serviceItem) {
        if (serviceItem.object != null) {
            DUYURULAR_PARENT duyurular_parent = (DUYURULAR_PARENT) serviceItem.object;
            this.duyurularList = duyurular_parent.duyurularList;
            List<SERTIFIKALAR> list = duyurular_parent.sertifikaList;
            if (list != null && list.size() > 0) {
                this.sertifikalarList = new ArrayList();
                for (SERTIFIKALAR sertifikalar : list) {
                    if (sertifikalar.PDF == null || !sertifikalar.PDF.equals("X")) {
                        this.sertifikalarList.add(sertifikalar);
                    }
                }
            }
        }
        setView();
    }

    private void setView() {
        int i;
        if (this.duyurularList == null || this.duyurularList.size() <= 0) {
            this.duyurularList = new ArrayList();
            i = 0;
        } else {
            i = this.duyurularList.size();
        }
        if (this.sertifikalarList == null || this.sertifikalarList.size() <= 0) {
            this.sertifikalarList = new ArrayList();
        } else {
            i += this.sertifikalarList.size();
        }
        if (i > 0) {
            this.tvNoRecord.setVisibility(4);
            this.lv.setAdapter(new AnnouncementsAndNewsBaseAdapter(this.activity, this.duyurularList, this.sertifikalarList));
            return;
        }
        this.tvNoRecord.setVisibility(0);
    }

    @OnItemClick({2131558581})
    void onItemClickLV(int i) {
        if (this.duyurularList != null) {
            i -= this.duyurularList.size();
        }
        if (i >= 0) {
            startActivity(new Intent(this.activity, ImageViewerActivity.class).putExtra(PlusShare.KEY_CALL_TO_ACTION_URL, ((SERTIFIKALAR) this.sertifikalarList.get(i)).SERTIFIKA_ADRESI));
        }
    }
}
