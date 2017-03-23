package com.pinarsu.siparis.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ImageView;
import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import com.pinarsu.siparis.R;
import com.pinarsu.siparis.adapter.DeliveryHoursAnimatedExpandableAdapter;
import com.pinarsu.siparis.model.Category;
import com.pinarsu.siparis.model.data.TESLIMAT_SAATLERI;
import com.pinarsu.siparis.tools.CustomComparatorInt;
import com.pinarsu.siparis.view.AnimatedExpandableListView;
import com.pinarsu.siparis.view.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DeliveryHoursActivity extends AppCompatActivity {
    List<Category> catList;
    List<TESLIMAT_SAATLERI> deliveryList;
    @InjectView(2131558627)
    ImageView imBack;
    @InjectView(2131558742)
    ImageView imLeftMenu;
    @InjectView(2131558743)
    ImageView imLogo;
    @InjectView(2131558581)
    AnimatedExpandableListView lv;
    Map<String, List<TESLIMAT_SAATLERI>> map;
    @InjectView(2131558577)
    TextView tvTitle;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_delivery_hours);
        setTitle(R.string.delivery_hours);
        ButterKnife.inject((Activity) this);
        this.imLeftMenu.setVisibility(8);
        this.imLogo.setVisibility(8);
        this.imBack.setVisibility(0);
        this.tvTitle.setVisibility(0);
        this.tvTitle.setText(getString(R.string.delivery_hours));
        this.deliveryList = (List) getIntent().getExtras().getSerializable("deliveryList");
        this.map = new HashMap();
        for (TESLIMAT_SAATLERI teslimat_saatleri : this.deliveryList) {
            if (this.map.containsKey(teslimat_saatleri.TARIH)) {
                ((List) this.map.get(teslimat_saatleri.TARIH)).add(teslimat_saatleri);
            } else {
                List arrayList = new ArrayList();
                arrayList.add(teslimat_saatleri);
                this.map.put(teslimat_saatleri.TARIH, arrayList);
            }
        }
        this.catList = new ArrayList();
        for (String str : this.map.keySet()) {
            this.catList.add(new Category(str, (List) this.map.get(str), Integer.parseInt(str.replace("-", ""))));
        }
        Collections.sort(this.catList, new CustomComparatorInt("dateInt", "dateInt"));
        ExpandableListAdapter deliveryHoursAnimatedExpandableAdapter = new DeliveryHoursAnimatedExpandableAdapter(this.catList, getApplicationContext());
        this.lv = (AnimatedExpandableListView) findViewById(R.id.lv);
        this.lv.setAdapter(deliveryHoursAnimatedExpandableAdapter);
        this.lv.setOnGroupClickListener(new OnGroupClickListener() {
            public boolean onGroupClick(ExpandableListView expandableListView, View view, int i, long j) {
                if (DeliveryHoursActivity.this.lv.isGroupExpanded(i)) {
                    DeliveryHoursActivity.this.lv.collapseGroupWithAnimation(i);
                } else {
                    DeliveryHoursActivity.this.lv.expandGroupWithAnimation(i);
                }
                return true;
            }
        });
        this.lv.setOnChildClickListener(new OnChildClickListener() {
            public boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i2, long j) {
                Log.d("MNTTAG", "groupPosition : " + i);
                Log.d("MNTTAG", "childPosition : " + i2);
                TESLIMAT_SAATLERI teslimat_saatleri = (TESLIMAT_SAATLERI) ((Category) DeliveryHoursActivity.this.catList.get(i)).list.get(i2);
                Intent intent = new Intent();
                intent.putExtra("deliveryHours", teslimat_saatleri);
                DeliveryHoursActivity.this.setResult(-1, intent);
                DeliveryHoursActivity.this.finish();
                return true;
            }
        });
    }

    @OnClick({2131558627})
    void clickBack() {
        finish();
    }
}
