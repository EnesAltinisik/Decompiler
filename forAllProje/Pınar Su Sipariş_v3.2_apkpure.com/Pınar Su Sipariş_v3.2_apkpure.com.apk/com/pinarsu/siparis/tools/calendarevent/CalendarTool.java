package com.pinarsu.siparis.tools.calendarevent;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.net.Uri.Builder;
import android.provider.CalendarContract.Events;
import android.provider.CalendarContract.Instances;
import android.provider.CalendarContract.Reminders;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import com.google.android.gms.plus.PlusShare;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

public class CalendarTool {
    static final long CALENDAR_ID = 1;
    public AppCompatActivity activity;
    private ContentResolver cr;

    public CalendarTool(AppCompatActivity appCompatActivity) {
        this.activity = appCompatActivity;
        this.cr = appCompatActivity.getContentResolver();
    }

    public Long createEvent(String str, String str2, int i, int i2, int i3, int i4, int i5) {
        Calendar instance = Calendar.getInstance();
        instance.set(i, i2, i3, i4, i5, 0);
        long timeInMillis = instance.getTimeInMillis();
        instance = (Calendar) instance.clone();
        instance.add(11, 1);
        long timeInMillis2 = instance.getTimeInMillis();
        ContentValues contentValues = new ContentValues();
        contentValues.put("dtstart", Long.valueOf(timeInMillis));
        contentValues.put("dtend", Long.valueOf(timeInMillis2));
        contentValues.put(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE, str);
        contentValues.put(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_DESCRIPTION, str2);
        contentValues.put("calendar_id", Long.valueOf(1));
        contentValues.put("eventTimezone", TimeZone.getDefault().getID());
        contentValues.put("customAppPackage", this.activity.getPackageName());
        contentValues.put("hasAlarm", Boolean.valueOf(true));
        Uri insert = this.cr.insert(Events.CONTENT_URI, contentValues);
        Log.d("MNTTAG", " createEvent id : " + Long.parseLong(insert.getLastPathSegment()));
        return Long.valueOf(Long.parseLong(insert.getLastPathSegment()));
    }

    public Long createReminder(long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("minutes", Integer.valueOf(5));
        contentValues.put("event_id", Long.valueOf(j));
        contentValues.put("method", Integer.valueOf(1));
        Uri insert = this.cr.insert(Reminders.CONTENT_URI, contentValues);
        Log.d("MNTTAG", " createReminder id : " + Long.parseLong(insert.getLastPathSegment()));
        return Long.valueOf(Long.parseLong(insert.getLastPathSegment()));
    }

    public int updateEvent(long j, String str, String str2, int i, int i2, int i3, int i4, int i5) {
        long j2 = 0;
        long j3 = 0;
        if (i > 0) {
            Calendar instance = Calendar.getInstance();
            instance.set(i, i2, i3, i4, i5, 0);
            j2 = instance.getTimeInMillis();
            instance = (Calendar) instance.clone();
            instance.add(11, 1);
            j3 = instance.getTimeInMillis();
        }
        ContentValues contentValues = new ContentValues();
        if (j2 > 0) {
            contentValues.put("dtstart", Long.valueOf(j2));
        }
        if (j3 > 0) {
            contentValues.put("dtend", Long.valueOf(j3));
        }
        contentValues.put(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE, str);
        contentValues.put(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_DESCRIPTION, str2);
        int update = this.cr.update(ContentUris.withAppendedId(Events.CONTENT_URI, j), contentValues, null, null);
        Log.d("MNTTAG", "Rows updated: " + update);
        return update;
    }

    public void deleteEvent(long j) {
        Log.d("MNTTAG", "Rows deleted: " + this.cr.delete(ContentUris.withAppendedId(Events.CONTENT_URI, j), null, null));
    }

    public void deleteEventPassedTime() {
        List<CalendarItem> allEventList = getAllEventList(true);
        if (allEventList != null && allEventList.size() > 0) {
            for (CalendarItem calendarItem : allEventList) {
                deleteEvent(calendarItem.eventID.longValue());
            }
        }
    }

    public List<CalendarItem> getAllEventList(boolean z) {
        String[] strArr = new String[]{"event_id", PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE, PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_DESCRIPTION, "dtstart", "dtend"};
        String str = "customAppPackage = ?";
        String[] strArr2 = new String[]{this.activity.getPackageName()};
        Builder buildUpon = Instances.CONTENT_URI.buildUpon();
        Calendar instance = Calendar.getInstance();
        instance.set(2000, 0, 1, 0, 0, 0);
        long timeInMillis = instance.getTimeInMillis();
        instance = Calendar.getInstance();
        if (!z) {
            instance.set(2030, 11, 31, 23, 59, 59);
        }
        long timeInMillis2 = instance.getTimeInMillis();
        ContentUris.appendId(buildUpon, timeInMillis);
        ContentUris.appendId(buildUpon, timeInMillis2);
        Cursor query = this.cr.query(buildUpon.build(), strArr, str, strArr2, "event_id DESC");
        List<CalendarItem> list = null;
        if (query.moveToFirst()) {
            list = new ArrayList();
            do {
                CalendarItem calendarItem = new CalendarItem();
                calendarItem.eventID = Long.valueOf(query.getLong(0));
                calendarItem.title = query.getString(1);
                calendarItem.description = query.getString(2);
                calendarItem.start = Long.valueOf(query.getLong(3));
                calendarItem.end = Long.valueOf(query.getLong(4));
                list.add(calendarItem);
                Log.d("MNTTAG", "item.eventID : " + calendarItem.eventID);
                Log.d("MNTTAG", "item.title : " + calendarItem.title);
                Log.d("MNTTAG", "item.description : " + calendarItem.description);
                Log.d("MNTTAG", "item.begin : " + calendarItem.start);
                Log.d("MNTTAG", "item.end : " + calendarItem.end);
            } while (query.moveToNext());
        }
        return list;
    }
}
