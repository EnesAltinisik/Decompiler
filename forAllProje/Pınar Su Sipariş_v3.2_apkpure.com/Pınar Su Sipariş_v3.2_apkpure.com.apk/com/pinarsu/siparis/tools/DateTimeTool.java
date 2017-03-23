package com.pinarsu.siparis.tools;

import android.annotation.SuppressLint;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTimeTool {
    public static String[] DAYS = new String[]{"Pazar", "Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi"};
    public static final String INVALID_DATETIME = "1900-01-01T00:00:00";
    public static String[] MONTHS = new String[]{"Ocak", "Şubat", "Mart", "Nisan", "Mayıs", "Haziran", "Temmuz", "Ağustos", "Eylül", "Ekim", "Kasım", "Aralık"};

    public enum DATETIMEFORMAT {
        ONLYDATE("dd.MM.yyyy"),
        ONLYTIME("HH:mm:ss"),
        DATETIME("dd.MM.yyyy HH:mm:ss"),
        TIMEDATE("HH:mm:ss dd.MM.yyyy"),
        TIMEDATE_SHORT("HH:mm - dd.MM.yyyy"),
        TIMEDATESLASH("HH:mm:ss MM/dd/yyyy"),
        DATESLASH("dd/MM/yyyy"),
        TIMEDATESLASH_AM_PM("hh:mm:ss MM/dd/yyyy a"),
        ONLYDATE_INT("yyyyMMdd"),
        EKMOB("yyyy-MM-dd'T'HH:mm:ss.SSS"),
        AROX("yyyy-MM-dd"),
        AROX2("dd-MM-yyyy"),
        ONLYTIME_WITHOUT_SECOND("HH:mm");
        
        public String value;

        private DATETIMEFORMAT(String str) {
            this.value = str;
        }
    }

    public static int getLogoTimeCode(int i, int i2, int i3) {
        return ((16777216 * i) + (65536 * i2)) + (i3 * 256);
    }

    public static int getLogoDateInt(Calendar calendar) {
        return (calendar.get(5) + (calendar.get(2) * 256)) + (calendar.get(1) * 65536);
    }

    @SuppressLint({"SimpleDateFormat"})
    public static Calendar getDateTime(String str, DATETIMEFORMAT datetimeformat) {
        Calendar instance = Calendar.getInstance();
        try {
            instance.setTime(new SimpleDateFormat(datetimeformat.value).parse(str));
        } catch (ParseException e) {
            instance.setTime(instance.getTime());
        }
        return instance;
    }

    @SuppressLint({"SimpleDateFormat"})
    public static String getDateWithFormat(Calendar calendar, DATETIMEFORMAT datetimeformat) {
        return new SimpleDateFormat(datetimeformat.value).format(calendar.getTime()).toString();
    }

    public static String getDateWithMonthName(Date date) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(date.getTime());
        return instance.get(5) + " " + MONTHS[instance.get(2)] + " " + instance.get(1);
    }

    public static String getDayWithMonthName(String str, DATETIMEFORMAT datetimeformat) {
        Calendar dateTime;
        try {
            dateTime = getDateTime(str, datetimeformat);
        } catch (Exception e) {
            dateTime = Calendar.getInstance();
        }
        return dateTime.get(5) + " " + MONTHS[dateTime.get(2)];
    }

    public static String getDateWithMonthName(String str, DATETIMEFORMAT datetimeformat) {
        Calendar dateTime = getDateTime(str, datetimeformat);
        return dateTime.get(5) + " " + MONTHS[dateTime.get(2)] + " " + dateTime.get(1);
    }

    public static String getDateWithMonthDayName(String str, DATETIMEFORMAT datetimeformat) {
        Calendar dateTime = getDateTime(str, datetimeformat);
        return dateTime.get(5) + " " + MONTHS[dateTime.get(2)] + " " + dateTime.get(1) + " " + DAYS[dateTime.get(7) - 1];
    }

    public static String getNowHourMinute() {
        Calendar instance = Calendar.getInstance();
        String format = String.format("%02d", new Object[]{Integer.valueOf(instance.get(11))});
        return format + "." + String.format("%02d", new Object[]{Integer.valueOf(instance.get(12))});
    }

    public static String getHourMinute(String str) {
        return str.substring(0, 5);
    }

    public static Calendar getCalendarFromTimeMillis(long j) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        return instance;
    }
}
