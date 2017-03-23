package com.pinarsu.siparis.ui.fragment;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.pinarsu.siparis.R;

public class MainLastOrderDialogFragment extends DialogFragment {
    private MainLastOrderDialogFragment newInstance() {
        MainLastOrderDialogFragment mainLastOrderDialogFragment = new MainLastOrderDialogFragment();
        mainLastOrderDialogFragment.setArguments(new Bundle());
        return mainLastOrderDialogFragment;
    }

    @OnClick({2131558617})
    void clickOk() {
        dismiss();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = new Dialog(getContext());
        dialog.requestWindowFeature(1);
        dialog.setContentView(R.layout.view_main_last_order_popup);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        ButterKnife.inject(this, dialog);
        getArguments();
        return dialog;
    }

    public static void show(AppCompatActivity appCompatActivity, int i) {
        new MainLastOrderDialogFragment().newInstance().show(appCompatActivity.getSupportFragmentManager(), "dialog");
    }
}
