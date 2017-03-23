package com.pinarsu.siparis.ui.fragment;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import com.pinarsu.siparis.R;
import com.pinarsu.siparis.interfaces.IDismissListener;
import com.pinarsu.siparis.tools.Tools;

public class InfoCallAlertDialogFragment extends DialogFragment {
    private AppCompatActivity activity;
    @InjectView(2131558659)
    Button btnCall;
    @InjectView(2131558624)
    Button btnOk;
    private IDismissListener delegate;
    private boolean isHasPhoneNumber;
    private String number;
    private int requestCode;
    @InjectView(2131558657)
    TextView tvDetail;
    @InjectView(2131558658)
    View viewGap;

    private InfoCallAlertDialogFragment newInstance(String str, IDismissListener iDismissListener, int i) {
        InfoCallAlertDialogFragment infoCallAlertDialogFragment = new InfoCallAlertDialogFragment();
        infoCallAlertDialogFragment.setCancelable(false);
        Bundle bundle = new Bundle();
        bundle.putString("message", str);
        bundle.putSerializable("delegate", iDismissListener);
        bundle.putInt("requestCode", i);
        infoCallAlertDialogFragment.setArguments(bundle);
        return infoCallAlertDialogFragment;
    }

    public Dialog onCreateDialog(Bundle bundle) {
        this.activity = (AppCompatActivity) getActivity();
        Dialog dialog = new Dialog(getContext());
        dialog.requestWindowFeature(1);
        dialog.setContentView(R.layout.dialog_info_call_alert);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        ButterKnife.inject(this, dialog);
        Bundle arguments = getArguments();
        this.delegate = (IDismissListener) arguments.getSerializable("delegate");
        this.requestCode = arguments.getInt("requestCode");
        CharSequence string = arguments.getString("message");
        this.isHasPhoneNumber = string.contains("#");
        if (this.isHasPhoneNumber) {
            String[] split = string.split("#");
            this.tvDetail.setText(split[0]);
            this.number = split[1];
            Log.d("MNTTAG", this.number);
        } else {
            this.tvDetail.setText(string);
            this.btnCall.setVisibility(8);
            this.viewGap.setVisibility(8);
        }
        return dialog;
    }

    public static void show(AppCompatActivity appCompatActivity, String str) {
        new InfoCallAlertDialogFragment().newInstance(str, null, 0).show(appCompatActivity.getSupportFragmentManager(), "dialog");
    }

    public static void show(AppCompatActivity appCompatActivity, String str, IDismissListener iDismissListener, int i) {
        FragmentManager supportFragmentManager = appCompatActivity.getSupportFragmentManager();
        DialogFragment newInstance = new InfoCallAlertDialogFragment().newInstance(str, iDismissListener, i);
        newInstance.setCancelable(false);
        newInstance.show(supportFragmentManager, "dialog");
    }

    @OnClick({2131558624})
    void clickYes() {
        dismiss();
        if (this.delegate != null) {
            this.delegate.onDismissListener(this.requestCode);
        }
    }

    @OnClick({2131558659})
    void clickNo() {
        if (this.isHasPhoneNumber) {
            Tools.callNumber(this.activity, this.number);
        }
        dismiss();
    }

    public void onSaveInstanceState(Bundle bundle) {
    }
}
