package com.pinarsu.siparis.ui.fragment;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.pinarsu.siparis.MyApplication;
import com.pinarsu.siparis.ui.activity.MainActivity;

public abstract class BaseFragment extends Fragment implements Parcelable {
    public MainActivity activity;
    public MyApplication myApplication;
    public Resources resources;

    public abstract int getLayoutResource();

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.activity = (MainActivity) getActivity();
        this.resources = this.activity.getResources();
        this.myApplication = MyApplication.getInstance();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(getLayoutResource(), viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    public void onDetach() {
        super.onDetach();
    }
}
