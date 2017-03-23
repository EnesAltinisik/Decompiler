package com.pinarsu.siparis.ui.fragment;

import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.widget.DatePicker;
import com.pinarsu.siparis.interfaces.IDatePickerListener;

public class DatePickerFragment extends DialogFragment implements OnDateSetListener {
    private IDatePickerListener delegate;

    public static DatePickerFragment newInstance(IDatePickerListener iDatePickerListener, int i, int i2, int i3) {
        DatePickerFragment datePickerFragment = new DatePickerFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("delegate", iDatePickerListener);
        bundle.putInt("year", i);
        bundle.putInt("month", i2);
        bundle.putInt("day", i3);
        datePickerFragment.setArguments(bundle);
        return datePickerFragment;
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Bundle arguments = getArguments();
        this.delegate = (IDatePickerListener) arguments.getSerializable("delegate");
        return new DatePickerDialog(getActivity(), this, arguments.getInt("year"), arguments.getInt("month"), arguments.getInt("day"));
    }

    public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        this.delegate.onDateSet(i, i2, i3);
    }

    public void show(AppCompatActivity appCompatActivity) {
        show(appCompatActivity.getSupportFragmentManager(), "Date Picker");
    }

    public void onSaveInstanceState(Bundle bundle) {
    }
}
