package com.pinarsu.siparis.ui.fragment;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import butterknife.ButterKnife;
import com.pinarsu.siparis.R;

public class ProgressDialogFragment extends DialogFragment {
    public static ProgressDialogFragment newInstance() {
        ProgressDialogFragment progressDialogFragment = new ProgressDialogFragment();
        progressDialogFragment.setCancelable(false);
        return progressDialogFragment;
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = new Dialog(getContext());
        dialog.requestWindowFeature(1);
        dialog.setContentView(R.layout.dialog_progress_dialog);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        ButterKnife.inject(this, dialog);
        return dialog;
    }

    public void show(AppCompatActivity appCompatActivity) {
        show(appCompatActivity.getSupportFragmentManager(), "ProgressDialogFragment");
    }

    public void onSaveInstanceState(Bundle bundle) {
    }
}
