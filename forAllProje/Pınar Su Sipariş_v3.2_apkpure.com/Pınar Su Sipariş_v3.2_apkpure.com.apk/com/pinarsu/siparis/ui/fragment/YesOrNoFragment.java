package com.pinarsu.siparis.ui.fragment;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;
import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.plus.PlusShare;
import com.pinarsu.siparis.R;
import com.pinarsu.siparis.interfaces.IDelegateOneObjectLister;

public class YesOrNoFragment extends DialogFragment {
    @InjectView(2131558688)
    Button btnNo;
    @InjectView(2131558687)
    Button btnYes;
    private IDelegateOneObjectLister delegate;
    Boolean isYes = null;
    public boolean mIsStateAlreadySaved = false;
    private int requestCode = 0;
    @InjectView(2131558657)
    TextView tvDetail;
    @InjectView(2131558577)
    TextView tvTitle;

    private static YesOrNoFragment newInstance(IDelegateOneObjectLister iDelegateOneObjectLister, String str, String str2) {
        YesOrNoFragment yesOrNoFragment = new YesOrNoFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("delegate", iDelegateOneObjectLister);
        bundle.putString(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE, str);
        bundle.putString(ProductAction.ACTION_DETAIL, str2);
        yesOrNoFragment.setArguments(bundle);
        return yesOrNoFragment;
    }

    private static YesOrNoFragment newInstance(IDelegateOneObjectLister iDelegateOneObjectLister, int i, String str, String str2, String str3, String str4) {
        YesOrNoFragment yesOrNoFragment = new YesOrNoFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("delegate", iDelegateOneObjectLister);
        bundle.putString(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE, str);
        bundle.putString(ProductAction.ACTION_DETAIL, str2);
        bundle.putString("yesTitle", str3);
        bundle.putString("noTitle", str4);
        bundle.putInt("requestCode", i);
        yesOrNoFragment.setArguments(bundle);
        yesOrNoFragment.setCancelable(false);
        return yesOrNoFragment;
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = new Dialog(getContext());
        dialog.requestWindowFeature(1);
        dialog.setContentView(R.layout.fragment_yes_or_no);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        ButterKnife.inject(this, dialog);
        Bundle arguments = getArguments();
        CharSequence string = arguments.getString(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE);
        CharSequence string2 = arguments.getString(ProductAction.ACTION_DETAIL);
        if (arguments.containsKey("yesTitle") && arguments.containsKey("noTitle")) {
            CharSequence string3 = arguments.getString("yesTitle");
            CharSequence string4 = arguments.getString("noTitle");
            this.btnYes.setText(string3);
            this.btnNo.setText(string4);
        }
        if (arguments.containsKey("requestCode")) {
            this.requestCode = arguments.getInt("requestCode");
        }
        if (string == null || string.isEmpty()) {
            this.tvTitle.setVisibility(8);
        } else {
            this.tvTitle.setText(string);
        }
        this.tvDetail.setText(string2);
        this.delegate = (IDelegateOneObjectLister) arguments.getSerializable("delegate");
        return dialog;
    }

    public static void show(AppCompatActivity appCompatActivity, IDelegateOneObjectLister iDelegateOneObjectLister, String str, String str2) {
        FragmentManager supportFragmentManager = appCompatActivity.getSupportFragmentManager();
        YesOrNoFragment newInstance = newInstance(iDelegateOneObjectLister, str, str2);
        newInstance.setCancelable(false);
        newInstance.show(supportFragmentManager, "dialog");
    }

    public static void show(AppCompatActivity appCompatActivity, IDelegateOneObjectLister iDelegateOneObjectLister, int i, String str, String str2, String str3, String str4) {
        FragmentManager supportFragmentManager = appCompatActivity.getSupportFragmentManager();
        YesOrNoFragment newInstance = newInstance(iDelegateOneObjectLister, i, str, str2, str3, str4);
        newInstance.setCancelable(false);
        newInstance.show(supportFragmentManager, "dialog");
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.delegate != null) {
            this.delegate.onObject(this.isYes, this.requestCode);
        }
    }

    @OnClick({2131558687})
    void clickEdit() {
        this.isYes = Boolean.valueOf(true);
        dismiss();
    }

    @OnClick({2131558688})
    void clickDelete() {
        this.isYes = Boolean.valueOf(false);
        dismiss();
    }

    public void onResume() {
        super.onResume();
    }

    public void onPause() {
        super.onPause();
    }

    public void onSaveInstanceState(Bundle bundle) {
    }
}
