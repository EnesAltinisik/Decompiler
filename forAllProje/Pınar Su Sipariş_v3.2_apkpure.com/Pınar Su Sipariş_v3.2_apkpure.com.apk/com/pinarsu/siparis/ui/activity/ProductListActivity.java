package com.pinarsu.siparis.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnItemClick;
import com.pinarsu.siparis.Preferences;
import com.pinarsu.siparis.R;
import com.pinarsu.siparis.adapter.ProductAdapter;
import com.pinarsu.siparis.api.service.ServiceBase;
import com.pinarsu.siparis.api.service.ServiceBase.Retrieve2;
import com.pinarsu.siparis.api.service.ServiceItem;
import com.pinarsu.siparis.api.service.ServiceItem.REQUEST_TYPE;
import com.pinarsu.siparis.api.service.ServiceItemRequestParameter;
import com.pinarsu.siparis.interfaces.IServiceResponse;
import com.pinarsu.siparis.model.data.MALZEMELER;
import com.pinarsu.siparis.model.data.MALZEMELER_PARENT;
import com.pinarsu.siparis.view.TextView;
import java.util.List;

public class ProductListActivity extends BaseActivity implements IServiceResponse {
    @InjectView(2131558581)
    ListView lv;
    private List<MALZEMELER> productList;
    @InjectView(2131558626)
    TextView tvAddedAll;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle((int) R.string.add_new_product);
        ButterKnife.inject((Activity) this);
        this.productList = (List) getIntent().getExtras().getSerializable("productListParent");
        if (this.productList == null) {
            ServiceBase serviceBase = new ServiceBase(this);
            ServiceItem serviceItem = new ServiceItem(REQUEST_TYPE.PRODUCTS_IN_ADDRESS);
            serviceItem.parameterList.add(new ServiceItemRequestParameter("BAYI_NO", Preferences.ADDRESS.BAYI_NO));
            serviceItem.parameterList.add(new ServiceItemRequestParameter("TELEFON_NO", Preferences.PHONE_NUMBER));
            serviceBase.getClass();
            new Retrieve2(serviceItem, this).execute(new Void[0]);
        } else if (this.productList.size() > 0) {
            setView();
        } else {
            this.tvAddedAll.setVisibility(0);
        }
    }

    private void setView() {
        this.lv.setAdapter(new ProductAdapter(this, this.productList));
    }

    public int getLayoutResource() {
        return R.layout.activity_product_list;
    }

    public void onResponse(ServiceItem serviceItem) {
        if (serviceItem.serviceErrorItem == null) {
            MALZEMELER_PARENT malzemeler_parent = (MALZEMELER_PARENT) serviceItem.object;
            if (malzemeler_parent != null) {
                this.productList = malzemeler_parent.productList;
                setView();
            }
        }
    }

    @OnItemClick({2131558581})
    void onItemClick(int i) {
        MALZEMELER malzemeler = (MALZEMELER) this.productList.get(i);
        Intent intent = new Intent();
        intent.putExtra("product", malzemeler);
        setResult(-1, intent);
        finish();
        this.productList.remove(i);
    }
}
