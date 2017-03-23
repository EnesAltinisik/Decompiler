package com.pinarsu.siparis.ui.fragment;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import com.pinarsu.siparis.R;
import com.pinarsu.siparis.interfaces.IDelegateOneObjectLister;
import com.pinarsu.siparis.tools.ToastHelper;

public class EditTextDialogFragment extends DialogFragment {
    @InjectView(2131558624)
    Button btnOk;
    IDelegateOneObjectLister delegate;
    @InjectView(2131558613)
    EditText edPhoneNumber;

    public static EditTextDialogFragment newInstance(IDelegateOneObjectLister iDelegateOneObjectLister) {
        EditTextDialogFragment editTextDialogFragment = new EditTextDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("delegate", iDelegateOneObjectLister);
        editTextDialogFragment.setArguments(bundle);
        return editTextDialogFragment;
    }

    @OnClick({2131558624})
    void clickOk() {
        dismiss();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (this.delegate != null) {
            String trim = this.edPhoneNumber.getText().toString().trim();
            if (!trim.isEmpty()) {
                if (trim.length() != 10) {
                    new ToastHelper(getActivity(), "Telefon numaranızı eksiksiz giriniz.").show();
                    return;
                } else if (trim.startsWith("0")) {
                    new ToastHelper(getActivity(), "Telefon numaranızı kontrol ediniz.").show();
                    return;
                } else if (trim.startsWith("5")) {
                    this.delegate.onObject(trim, 0);
                } else {
                    new ToastHelper(getActivity(), "Lütfen geçerli bir cep telefonu numarası giriniz.").show();
                    return;
                }
            }
        }
        super.onDismiss(dialogInterface);
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = new Dialog(getContext());
        dialog.requestWindowFeature(1);
        dialog.setContentView(R.layout.dialog_edittext);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        ButterKnife.inject((Object) this, dialog);
        this.delegate = (IDelegateOneObjectLister) getArguments().getSerializable("delegate");
        return dialog;
    }

    public void show(AppCompatActivity appCompatActivity) {
        show(appCompatActivity.getSupportFragmentManager(), "dialog");
    }

    public void onSaveInstanceState(Bundle bundle) {
    }
}
