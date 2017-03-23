package com.pinarsu.siparis.ui.fragment;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import com.pinarsu.siparis.R;
import com.pinarsu.siparis.interfaces.IDismissListener;
import com.pinarsu.siparis.view.TextView;

public class InternetConnectionDialogFragment extends DialogFragment {
    IDismissListener delegate;
    private String message = "";
    private int requestCode = 0;
    @InjectView(2131558622)
    TextView tvMessage;

    private InternetConnectionDialogFragment newInstance(IDismissListener iDismissListener, String str, int i) {
        InternetConnectionDialogFragment internetConnectionDialogFragment = new InternetConnectionDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("delegate", iDismissListener);
        bundle.putString("message", str);
        bundle.putInt("requestCode", i);
        internetConnectionDialogFragment.setArguments(bundle);
        return internetConnectionDialogFragment;
    }

    @OnClick({2131558624})
    void clickOk() {
        dismiss();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.delegate != null) {
            this.delegate.onDismissListener(this.requestCode);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = new Dialog(getContext());
        dialog.requestWindowFeature(1);
        dialog.setContentView(R.layout.dialog_internet_connection);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        ButterKnife.inject(this, dialog);
        Bundle arguments = getArguments();
        this.delegate = (IDismissListener) arguments.getSerializable("delegate");
        this.message = arguments.getString("message");
        this.requestCode = arguments.getInt("requestCode");
        this.tvMessage.setText(this.message);
        return dialog;
    }

    public static void show(AppCompatActivity appCompatActivity, IDismissListener iDismissListener, String str, int i) {
        try {
            new InternetConnectionDialogFragment().newInstance(iDismissListener, str, i).show(appCompatActivity.getSupportFragmentManager(), "dialog");
        } catch (IllegalStateException e) {
            Log.w("MNTTAG", "progressDialogFragment.dismiss() error");
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
    }
}
