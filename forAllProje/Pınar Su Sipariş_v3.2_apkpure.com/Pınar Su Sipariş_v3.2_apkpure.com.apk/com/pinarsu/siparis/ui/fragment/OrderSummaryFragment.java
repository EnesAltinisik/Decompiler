package com.pinarsu.siparis.ui.fragment;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import butterknife.ButterKnife;
import butterknife.InjectView;
import com.pinarsu.siparis.R;
import com.pinarsu.siparis.adapter.OrderSummaryBaseAdapter;
import com.pinarsu.siparis.api.service.ServiceBase;
import com.pinarsu.siparis.api.service.ServiceBase.Retrieve2;
import com.pinarsu.siparis.api.service.ServiceItem;
import com.pinarsu.siparis.api.service.ServiceItem.REQUEST_TYPE;
import com.pinarsu.siparis.api.service.ServiceItemRequestParameter;
import com.pinarsu.siparis.interfaces.IClickListener;
import com.pinarsu.siparis.interfaces.IDelegateOneObjectLister;
import com.pinarsu.siparis.interfaces.IServiceResponse;
import com.pinarsu.siparis.model.data.SIPARISLER;
import com.pinarsu.siparis.tools.ToastHelper;

@SuppressLint({"ParcelCreator"})
public class OrderSummaryFragment extends BaseFragment implements IClickListener, IDelegateOneObjectLister, IServiceResponse {
    private OrderSummaryBaseAdapter adapter;
    @InjectView(2131558581)
    ListView lv;
    int position;
    ServiceBase serviceBase;
    @InjectView(2131558601)
    TextView tvInfo;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.serviceBase = new ServiceBase(this);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ButterKnife.inject(this, view);
        this.activity.setTitle(R.string.order_summary);
        if (this.activity.orderList == null || this.activity.orderList.size() <= 0) {
            this.tvInfo.setVisibility(0);
            this.lv.setVisibility(8);
            return;
        }
        this.adapter = new OrderSummaryBaseAdapter(this.activity, this.activity.orderList, this);
        this.lv.setAdapter(this.adapter);
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    public void onDetach() {
        super.onDetach();
    }

    public int getLayoutResource() {
        return R.layout.fragment_order_summary;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
    }

    public void onResponse(ServiceItem serviceItem) {
        if (serviceItem.serviceErrorItem != null) {
            InfoCallAlertDialogFragment.show(this.activity, serviceItem.serviceErrorItem.detail);
        } else if (serviceItem.type == REQUEST_TYPE.DELETE_ORDER) {
            new ToastHelper(this.activity, "Sipariş başarıyla iptal edildi.").show();
            this.activity.orderList.remove(this.position);
            if (this.activity.orderList.size() == 0) {
                this.tvInfo.setVisibility(0);
                this.lv.setVisibility(8);
                this.activity.leftDrawerFragment.setItemVisibility(3, false);
                return;
            }
            this.adapter.notifyDataSetChanged();
        }
    }

    public void onClickListener(int i) {
        this.position = i;
        YesOrNoFragment.show(this.activity, this, "Bilgi", "Silmek istediğinizden emin misiniz?");
    }

    public void onObject(Object obj, int i) {
        if (obj != null) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            Log.d("MNTTAG", "" + booleanValue);
            if (booleanValue) {
                String str = ((SIPARISLER) this.activity.orderList.get(this.position)).SIPARIS;
                Log.d("MNTTAG", "SIPARIS_NO : " + str);
                ServiceItem serviceItem = new ServiceItem(REQUEST_TYPE.DELETE_ORDER);
                serviceItem.parameterList.add(new ServiceItemRequestParameter("SIPARIS_NO", str));
                ServiceBase serviceBase = this.serviceBase;
                serviceBase.getClass();
                new Retrieve2(serviceBase, serviceItem, this.activity).execute(new Void[0]);
            }
        }
    }
}
