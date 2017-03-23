package com.pinarsu.siparis.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import butterknife.ButterKnife;
import butterknife.InjectView;
import com.pinarsu.siparis.R;
import com.pinarsu.siparis.interfaces.IBackPressed;
import com.pinarsu.siparis.model.data.MALZEMELER;
import com.pinarsu.siparis.model.data.TESLIMAT_SAATLERI;
import com.pinarsu.siparis.ui.activity.MainActivity.FRAGMENT_TYPE;
import com.pinarsu.siparis.view.TextView;
import java.util.ArrayList;
import java.util.List;

public class OrderActivity extends BaseActivity {
    public OrderActivity activity;
    private IBackPressed delegateIBackPressed;
    public List<TESLIMAT_SAATLERI> deliveryList;
    private MALZEMELER product;
    public List<MALZEMELER> productList;
    public List<MALZEMELER> productListParent;
    @InjectView(2131558748)
    TextView tvStep1;
    @InjectView(2131558749)
    TextView tvStep2;
    @InjectView(2131558750)
    TextView tvStep3;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle((int) R.string.order);
        ButterKnife.inject((Activity) this);
        Bundle extras = getIntent().getExtras();
        this.product = (MALZEMELER) extras.getSerializable("product");
        if (extras.containsKey("deliveryList")) {
            this.deliveryList = (List) extras.getSerializable("deliveryList");
        }
        if (extras.containsKey("productListParent")) {
            this.productListParent = (List) extras.getSerializable("productListParent");
        }
        this.productList = new ArrayList();
        this.productList.add(this.product);
        removeProductFromProductParentList(this.product);
        displayView(FRAGMENT_TYPE.ORDER1, null);
    }

    public int getLayoutResource() {
        return R.layout.activity_order;
    }

    public void onBackPressed() {
        if (this.delegateIBackPressed != null) {
            this.delegateIBackPressed.onBackPressed();
            this.delegateIBackPressed = null;
            return;
        }
        super.onBackPressed();
    }

    public void displayView(FRAGMENT_TYPE fragment_type, Bundle bundle) {
        Object obj = null;
        try {
            obj = fragment_type.clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        }
        Fragment fragment = (Fragment) obj;
        if (bundle != null) {
            fragment.setArguments(bundle);
        }
        if (fragment != null) {
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            beginTransaction.replace(R.id.container_body, fragment);
            beginTransaction.commit();
        }
        setStepsView(fragment_type);
    }

    public void setStepsView(FRAGMENT_TYPE fragment_type) {
        if (fragment_type == FRAGMENT_TYPE.ORDER1) {
            this.tvStep1.setBackgroundResource(R.drawable.circle_white);
            this.tvStep1.setTextColor(this.resources.getColor(R.color.blue_dark));
            this.tvStep1.setText("1");
            this.tvStep2.setBackgroundResource(R.drawable.circle_dark_blue);
            this.tvStep2.setTextColor(this.resources.getColor(17170443));
            this.tvStep2.setText("2");
            this.tvStep3.setBackgroundResource(R.drawable.circle_dark_blue);
            this.tvStep3.setTextColor(this.resources.getColor(17170443));
            this.tvStep3.setText("3");
        } else if (fragment_type == FRAGMENT_TYPE.ORDER2) {
            this.tvStep1.setBackgroundResource(R.drawable.check_green_white);
            this.tvStep1.setText("");
            this.tvStep2.setBackgroundResource(R.drawable.circle_white);
            this.tvStep2.setTextColor(this.resources.getColor(R.color.blue_dark));
            this.tvStep2.setText("2");
            this.tvStep3.setBackgroundResource(R.drawable.circle_dark_blue);
            this.tvStep3.setTextColor(this.resources.getColor(17170443));
            this.tvStep3.setText("3");
        } else if (fragment_type == FRAGMENT_TYPE.ORDER3) {
            this.tvStep1.setBackgroundResource(R.drawable.check_green_white);
            this.tvStep1.setText("");
            this.tvStep2.setBackgroundResource(R.drawable.check_green_white);
            this.tvStep2.setText("");
            this.tvStep3.setText("3");
            this.tvStep3.setBackgroundResource(R.drawable.circle_white);
            this.tvStep3.setTextColor(this.resources.getColor(R.color.blue_dark));
        }
    }

    public void setDelegateIBackPressed(IBackPressed iBackPressed) {
        this.delegateIBackPressed = iBackPressed;
    }

    public void removeProductFromProductParentList(MALZEMELER malzemeler) {
        int i = 0;
        while (i < this.productListParent.size()) {
            if (((MALZEMELER) this.productListParent.get(i)).MALZEME.equals(malzemeler.MALZEME)) {
                break;
            }
            i++;
        }
        i = -1;
        if (i != -1) {
            this.productListParent.remove(i);
        }
    }

    public void addProductFromProductParentList(MALZEMELER malzemeler) {
        malzemeler.MIKTAR = 1;
        this.productListParent.add(malzemeler);
    }
}
