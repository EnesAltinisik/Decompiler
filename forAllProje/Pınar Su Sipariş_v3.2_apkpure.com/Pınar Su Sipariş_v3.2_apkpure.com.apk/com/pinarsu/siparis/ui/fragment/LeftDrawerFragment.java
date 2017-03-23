package com.pinarsu.siparis.ui.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import butterknife.OnItemClick;
import com.pinarsu.siparis.Preferences;
import com.pinarsu.siparis.R;
import com.pinarsu.siparis.adapter.LeftNavigationBaseAdapter;
import com.pinarsu.siparis.interfaces.IRequestPermissionsResult;
import com.pinarsu.siparis.model.NavDrawerItem;
import com.pinarsu.siparis.tools.PermissionHelper;
import com.pinarsu.siparis.tools.Tools;
import com.pinarsu.siparis.ui.activity.MainActivity;
import java.util.ArrayList;
import java.util.List;

public class LeftDrawerFragment extends Fragment implements IRequestPermissionsResult {
    static final String PINAR_CUSTOMER_PHONE_NUMBER = "4449900";
    private static Integer[] drawableIds = new Integer[]{Integer.valueOf(R.drawable.ic_home), Integer.valueOf(R.drawable.user), Integer.valueOf(R.drawable.ic_campaign), Integer.valueOf(R.drawable.mybasket), Integer.valueOf(R.drawable.list), Integer.valueOf(R.drawable.alarm), Integer.valueOf(R.drawable.info_app)};
    private MainActivity activity;
    private LeftNavigationBaseAdapter adapter;
    @InjectView(2131558581)
    ListView lv;
    public DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mDrawerToggle;
    private PermissionHelper permissionHelper;

    public void openLeftDrawer() {
        this.mDrawerLayout.e(3);
    }

    public void closeLeftDrawer() {
        this.mDrawerLayout.f(3);
    }

    public boolean isDrawerOpen() {
        return this.mDrawerLayout.g(3);
    }

    public static List<NavDrawerItem> getData() {
        List<NavDrawerItem> arrayList = new ArrayList();
        if (Preferences.PHONE_NUMBER == null || Preferences.PHONE_NUMBER.isEmpty()) {
            MainActivity.TRY_APP = true;
        } else {
            MainActivity.TRY_APP = false;
        }
        int i = 0;
        while (i < drawableIds.length) {
            Object navDrawerItem;
            if (!MainActivity.TRY_APP) {
                navDrawerItem = new NavDrawerItem(drawableIds[i].intValue(), true);
            } else if (i == 1 || i == 3) {
                navDrawerItem = new NavDrawerItem(drawableIds[i].intValue(), false);
            } else {
                navDrawerItem = new NavDrawerItem(drawableIds[i].intValue(), true);
            }
            arrayList.add(navDrawerItem);
            i++;
        }
        return arrayList;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.activity = (MainActivity) getActivity();
        this.permissionHelper = new PermissionHelper(this.activity);
        return layoutInflater.inflate(R.layout.fragment_navigation_drawer, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ButterKnife.inject(this, view);
        this.adapter = new LeftNavigationBaseAdapter(this.activity, getData());
        this.lv.setAdapter(this.adapter);
    }

    @OnClick({2131558666})
    void clickCall() {
        this.activity.setRequestPermissionsDelegate(this);
        String[] strArr = new String[]{"android.permission.CALL_PHONE"};
        if (!this.permissionHelper.isAndroidVersion6AndGreater()) {
            Tools.callNumber(this.activity, PINAR_CUSTOMER_PHONE_NUMBER);
        } else if (this.permissionHelper.checkPermissionGranted(strArr)) {
            Tools.callNumber(this.activity, PINAR_CUSTOMER_PHONE_NUMBER);
        } else {
            this.permissionHelper.requestPermissions(strArr);
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (this.permissionHelper.onRequestPermissionsResult(i, strArr, iArr)) {
            Tools.callNumber(this.activity, PINAR_CUSTOMER_PHONE_NUMBER);
        }
    }

    public void setUp(int i, DrawerLayout drawerLayout, Toolbar toolbar) {
        this.mDrawerLayout = drawerLayout;
        this.mDrawerToggle = new ActionBarDrawerToggle(this.activity, drawerLayout, toolbar, R.string.drawer_open, R.string.drawer_close) {
            public void onDrawerOpened(View view) {
                super.onDrawerOpened(view);
                LeftDrawerFragment.this.getActivity().invalidateOptionsMenu();
            }

            public void onDrawerClosed(View view) {
                super.onDrawerClosed(view);
                LeftDrawerFragment.this.getActivity().invalidateOptionsMenu();
            }

            public void onDrawerSlide(View view, float f) {
                super.onDrawerSlide(view, f);
            }
        };
        this.mDrawerToggle.setDrawerIndicatorEnabled(false);
        this.mDrawerLayout.setDrawerListener(this.mDrawerToggle);
        this.mDrawerLayout.post(new Runnable() {
            public void run() {
                LeftDrawerFragment.this.mDrawerToggle.syncState();
            }
        });
    }

    @OnItemClick({2131558581})
    void itemClick(View view, int i) {
        if (this.adapter.getItem(i).isActive) {
            this.activity.onItemClick(view, i);
        }
        Log.d("MNTTAG", "position : " + i);
    }

    public void remove(int i) {
        this.adapter.remove(i);
    }

    public void setItemVisibility(int i, boolean z) {
        this.adapter.setItemVisibility(i, z);
    }
}
