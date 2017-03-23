package com.pinarsu.siparis.ui.fragment;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.app.TimePickerDialog.OnTimeSetListener;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.widget.TimePicker;
import com.pinarsu.siparis.interfaces.IDatePickerListener;
import com.pinarsu.siparis.interfaces.ITimePickerListener;

public class TimePickerFragment extends DialogFragment implements OnTimeSetListener {
    private ITimePickerListener delegate;

    public static TimePickerFragment newInstance(IDatePickerListener iDatePickerListener, int i, int i2) {
        TimePickerFragment timePickerFragment = new TimePickerFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("delegate", iDatePickerListener);
        bundle.putInt("hourOfDay", i);
        bundle.putInt("minute", i2);
        timePickerFragment.setArguments(bundle);
        return timePickerFragment;
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Bundle arguments = getArguments();
        this.delegate = (ITimePickerListener) arguments.getSerializable("delegate");
        return new TimePickerDialog(getActivity(), this, arguments.getInt("hourOfDay"), arguments.getInt("minute"), true);
    }

    public void show(AppCompatActivity appCompatActivity) {
        show(appCompatActivity.getSupportFragmentManager(), "Date Picker");
    }

    public void onTimeSet(TimePicker timePicker, int i, int i2) {
        this.delegate.onTimeSet(i, i2);
    }
}
