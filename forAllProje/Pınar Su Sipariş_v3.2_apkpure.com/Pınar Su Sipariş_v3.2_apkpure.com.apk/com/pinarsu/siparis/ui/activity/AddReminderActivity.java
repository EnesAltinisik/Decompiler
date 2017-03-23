package com.pinarsu.siparis.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.b.b;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import com.pinarsu.siparis.R;
import com.pinarsu.siparis.interfaces.IDatePickerListener;
import com.pinarsu.siparis.interfaces.ITimePickerListener;
import com.pinarsu.siparis.tools.DateTimeTool;
import com.pinarsu.siparis.tools.DateTimeTool.DATETIMEFORMAT;
import com.pinarsu.siparis.tools.ToastHelper;
import com.pinarsu.siparis.tools.calendarevent.CalendarItem;
import com.pinarsu.siparis.tools.calendarevent.CalendarTool;
import com.pinarsu.siparis.ui.fragment.DatePickerFragment;
import com.pinarsu.siparis.ui.fragment.InfoCallAlertDialogFragment;
import com.pinarsu.siparis.ui.fragment.TimePickerFragment;
import java.util.Calendar;

public class AddReminderActivity extends BaseActivity implements IDatePickerListener, ITimePickerListener {
    CalendarTool calendarTool;
    int day;
    @InjectView(2131558573)
    EditText edDesc;
    int hourOfDay;
    CalendarItem item = null;
    int minute;
    int month;
    private int thisDay;
    private int thisHourOfDay;
    private int thisMinute;
    private int thisMonth;
    private int thisYear;
    @InjectView(2131558574)
    TextView tvAddReminder;
    @InjectView(2131558572)
    TextView tvSelectedDate;
    @InjectView(2131558570)
    TextView tvTime;
    int year;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle((int) R.string.reminding);
        ButterKnife.inject((Activity) this);
        Bundle extras = getIntent().getExtras();
        if (extras != null && extras.containsKey("item")) {
            this.item = (CalendarItem) extras.getSerializable("item");
            this.edDesc.setText("" + this.item.description);
            this.tvAddReminder.setText("Düzenlemeyi Bitir");
        }
        this.calendarTool = new CalendarTool(this);
        Calendar instance = Calendar.getInstance();
        this.thisYear = instance.get(1);
        this.thisMonth = instance.get(2);
        this.thisDay = instance.get(5);
        this.thisHourOfDay = instance.get(11);
        this.thisMinute = instance.get(12);
        if (this.item == null) {
            this.year = this.thisYear;
            this.month = this.thisMonth;
            this.day = this.thisDay;
            this.hourOfDay = this.thisHourOfDay;
            this.minute = this.thisMinute;
        } else {
            instance.setTimeInMillis(this.item.start.longValue());
            this.year = instance.get(1);
            this.month = instance.get(2);
            this.day = instance.get(5);
            this.hourOfDay = instance.get(11);
            this.minute = instance.get(12);
        }
        setTime();
        setDate();
    }

    public int getLayoutResource() {
        return R.layout.activity_add_reminder;
    }

    @OnClick({2131558571})
    void clickLinearSelectCalendar() {
        DatePickerFragment.newInstance(this, this.year, this.month, this.day).show(this.activity);
    }

    @OnClick({2131558569})
    void clickLinearTime() {
        TimePickerFragment.newInstance(this, this.hourOfDay, this.minute).show(this.activity);
    }

    @OnClick({2131558574})
    void clickAddReminder() {
        String string = getString(R.string.app_name);
        if (string.isEmpty()) {
            new ToastHelper(this.activity, "Hatırlatma Başlığı boş bırakılamaz").show();
            return;
        }
        Calendar instance = Calendar.getInstance();
        this.thisYear = instance.get(1);
        this.thisMonth = instance.get(2);
        this.thisDay = instance.get(5);
        this.thisHourOfDay = instance.get(11);
        this.thisMinute = instance.get(12);
        String str = this.thisDay + "." + this.thisMonth + "." + this.thisYear + " " + this.thisHourOfDay + ":" + (this.thisMinute + 1) + ":00";
        String str2 = this.day + "." + this.month + "." + this.year + " " + this.hourOfDay + ":" + this.minute + ":00";
        if (DateTimeTool.getDateTime(str, DATETIMEFORMAT.DATETIME).getTimeInMillis() > DateTimeTool.getDateTime(str2, DATETIMEFORMAT.DATETIME).getTimeInMillis()) {
            new ToastHelper(this.activity, "Geçmiş tarihe Hatırlatma ekleyemezsiniz.").show();
        } else if (b.checkSelfPermission(this, "android.permission.WRITE_CALENDAR") != 0) {
            InfoCallAlertDialogFragment.show(this.activity, "Hatırlatma ekleyebilmek için izin veriniz.");
        } else {
            str = "";
            str2 = this.edDesc.getText().toString().trim();
            if (this.item == null) {
                Long createEvent = this.calendarTool.createEvent(string, str2, this.year, this.month, this.day, this.hourOfDay, this.minute);
                if (createEvent != null && createEvent.longValue() > 0) {
                    createEvent = this.calendarTool.createReminder(createEvent.longValue());
                    if (createEvent != null && createEvent.longValue() > 0) {
                        new ToastHelper(this.activity, "Hatırlatma kaydedildi.").show();
                        setResult(-1);
                        finish();
                        return;
                    }
                }
            }
            if (this.calendarTool.updateEvent(this.item.eventID.longValue(), string, str2, this.year, this.month, this.day, this.hourOfDay, this.minute) > 0) {
                new ToastHelper(this.activity, "Hatırlatma güncellendi.").show();
                setResult(-1);
                finish();
                return;
            }
            new ToastHelper(this.activity, "Hatırlatma kaydetme başarısız.").show();
        }
    }

    public void onDateSet(int i, int i2, int i3) {
        this.year = i;
        this.month = i2;
        this.day = i3;
        setDate();
        Log.d("MNTTAG", "year : " + i);
        Log.d("MNTTAG", "month : " + i2);
        Log.d("MNTTAG", "day : " + i3);
    }

    private void setDate() {
        this.tvSelectedDate.setText("(" + String.format("%02d", new Object[]{Integer.valueOf(this.day)}) + " " + DateTimeTool.MONTHS[this.month] + " " + this.year + ")");
    }

    public void onTimeSet(int i, int i2) {
        this.hourOfDay = i;
        this.minute = i2;
        setTime();
        Log.d("MNTTAG", "hourOfDay : " + i);
        Log.d("MNTTAG", "minute : " + i2);
    }

    void setTime() {
        String format = String.format("%02d", new Object[]{Integer.valueOf(this.hourOfDay)});
        this.tvTime.setText(format + ":" + String.format("%02d", new Object[]{Integer.valueOf(this.minute)}));
    }
}
