package com.pinarsu.siparis.ui.fragment;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import com.pinarsu.siparis.Preferences;
import com.pinarsu.siparis.R;
import com.pinarsu.siparis.adapter.Order2BaseAdapter;
import com.pinarsu.siparis.api.service.ServiceBase;
import com.pinarsu.siparis.api.service.ServiceBase.Retrieve2;
import com.pinarsu.siparis.api.service.ServiceItem;
import com.pinarsu.siparis.api.service.ServiceItem.REQUEST_TYPE;
import com.pinarsu.siparis.api.service.ServiceItemRequestParameter;
import com.pinarsu.siparis.interfaces.IBackPressed;
import com.pinarsu.siparis.interfaces.IServiceResponse;
import com.pinarsu.siparis.model.data.MALZEMELER;
import com.pinarsu.siparis.model.data.SIPARIS_TUTARI_PARENT;
import com.pinarsu.siparis.ui.activity.MainActivity.FRAGMENT_TYPE;
import com.pinarsu.siparis.ui.activity.OrderActivity;
import com.pinarsu.siparis.ui.activity.ProductListActivity;
import java.io.Serializable;
import java.util.List;
import org.b.a.h;

@SuppressLint({"ParcelCreator"})
public class Order2Fragment extends Fragment implements Parcelable, IBackPressed, IServiceResponse {
    private OrderActivity activity;
    private Order2BaseAdapter adapter;
    @InjectView(2131558581)
    ListView lv;
    private List<MALZEMELER> productList;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.activity = (OrderActivity) getActivity();
        this.productList = this.activity.productList;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_order2, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ButterKnife.inject(this, view);
        if (this.productList.size() > 0) {
            this.adapter = new Order2BaseAdapter(this.activity, this.productList);
            this.lv.setAdapter(this.adapter);
        }
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

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
    }

    @OnClick({2131558646})
    void clickContinue() {
        if (this.productList.size() == 0) {
            InfoCallAlertDialogFragment.show(this.activity, "Lütfen ürün ekleyiniz.");
            return;
        }
        ServiceItem serviceItem = new ServiceItem(REQUEST_TYPE.CALCULATE_ORDER_TOTAL);
        serviceItem.parameterList.add(new ServiceItemRequestParameter("BAYI_NO  ", Preferences.ADDRESS.BAYI_NO));
        serviceItem.parameterList.add(new ServiceItemRequestParameter("TELEFON_NO ", Preferences.PHONE_NUMBER));
        h hVar = new h("", "URUNLER");
        for (MALZEMELER malzemeler : this.productList) {
            h hVar2 = new h("", "item");
            hVar2.b("MALZEME_NO", malzemeler.MALZEME);
            hVar2.b("MIKTAR", Integer.valueOf(malzemeler.MIKTAR));
            hVar.a(hVar2);
        }
        serviceItem.parameterList.add(new ServiceItemRequestParameter("", hVar));
        ServiceBase serviceBase = new ServiceBase(this);
        serviceBase.getClass();
        new Retrieve2(serviceBase, serviceItem, this.activity).execute(new Void[0]);
    }

    public void onBackPressed() {
        this.activity.displayView(FRAGMENT_TYPE.ORDER1, null);
    }

    @OnClick({2131558670})
    void clickAddAnotherProduct() {
        startActivityForResult(new Intent(this.activity, ProductListActivity.class).putExtra("productListParent", (Serializable) this.activity.productListParent), 222);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        OrderActivity orderActivity = this.activity;
        if (i2 == -1 && i == 222) {
            MALZEMELER malzemeler = (MALZEMELER) intent.getSerializableExtra("product");
            this.productList.add(malzemeler);
            this.activity.productList = this.productList;
            this.activity.removeProductFromProductParentList(malzemeler);
            if (this.adapter != null) {
                this.adapter.notifyDataSetChanged();
            }
        }
    }

    public void onResponse(ServiceItem serviceItem) {
        if (serviceItem.serviceErrorItem == null) {
            if (serviceItem.type == REQUEST_TYPE.CALCULATE_ORDER_TOTAL) {
                SIPARIS_TUTARI_PARENT siparis_tutari_parent = (SIPARIS_TUTARI_PARENT) serviceItem.object;
                Bundle bundle = new Bundle();
                if (siparis_tutari_parent != null) {
                    bundle.putSerializable("SIPARIS_TUTARI_PARENT", siparis_tutari_parent);
                    this.activity.displayView(FRAGMENT_TYPE.ORDER3, bundle);
                    return;
                }
                InfoCallAlertDialogFragment.show(this.activity, "İşlem başarısız.");
            }
        } else if (serviceItem.type == REQUEST_TYPE.CALCULATE_ORDER_TOTAL) {
            InfoCallAlertDialogFragment.show(this.activity, serviceItem.serviceErrorItem.detail);
        }
    }
}
