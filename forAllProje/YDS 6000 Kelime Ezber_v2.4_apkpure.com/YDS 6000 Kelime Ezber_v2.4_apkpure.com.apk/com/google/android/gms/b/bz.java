package com.google.android.gms.b;

import android.annotation.TargetApi;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.CursorWindow;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.b.do.e;
import com.google.android.gms.b.do.f;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class bz extends cy {
    private static final Map<String, String> a = new android.support.v4.i.a(18);
    private static final Map<String, String> b = new android.support.v4.i.a(1);
    private static final Map<String, String> c = new android.support.v4.i.a(1);
    private static final Map<String, String> d = new android.support.v4.i.a(1);
    private final c e = new c(this, n(), B());
    private final df f = new df(m());

    public static class a {
        long a;
        long b;
        long c;
        long d;
        long e;
    }

    interface b {
        void a(e eVar);

        boolean a(long j, com.google.android.gms.b.do.b bVar);
    }

    private class c extends SQLiteOpenHelper {
        final /* synthetic */ bz a;

        c(bz bzVar, Context context, String str) {
            this.a = bzVar;
            super(context, str, null, 1);
        }

        public SQLiteDatabase getWritableDatabase() {
            if (this.a.f.a(this.a.w().K())) {
                SQLiteDatabase writableDatabase;
                try {
                    writableDatabase = super.getWritableDatabase();
                } catch (SQLiteException e) {
                    this.a.f.a();
                    this.a.u().x().a("Opening the database failed, dropping and recreating it");
                    String B = this.a.B();
                    if (!this.a.n().getDatabasePath(B).delete()) {
                        this.a.u().x().a("Failed to delete corrupted db file", B);
                    }
                    try {
                        writableDatabase = super.getWritableDatabase();
                        this.a.f.b();
                    } catch (SQLiteException e2) {
                        this.a.u().x().a("Failed to open freshly created database", e2);
                        throw e2;
                    }
                }
                return writableDatabase;
            }
            throw new SQLiteException("Database open failed");
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            bz.a(this.a.u(), sQLiteDatabase);
        }

        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (VERSION.SDK_INT < 15) {
                Cursor rawQuery = sQLiteDatabase.rawQuery("PRAGMA journal_mode=memory", null);
                try {
                    rawQuery.moveToFirst();
                } finally {
                    rawQuery.close();
                }
            }
            bz.a(this.a.u(), sQLiteDatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", null);
            bz.a(this.a.u(), sQLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", null);
            bz.a(this.a.u(), sQLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", bz.a);
            bz.a(this.a.u(), sQLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", bz.c);
            bz.a(this.a.u(), sQLiteDatabase, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
            bz.a(this.a.u(), sQLiteDatabase, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", bz.b);
            bz.a(this.a.u(), sQLiteDatabase, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", null);
            bz.a(this.a.u(), sQLiteDatabase, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", null);
            bz.a(this.a.u(), sQLiteDatabase, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
            bz.a(this.a.u(), sQLiteDatabase, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", bz.d);
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        }
    }

    static {
        a.put("app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;");
        a.put("app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;");
        a.put("gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;");
        a.put("dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;");
        a.put("measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;");
        a.put("last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;");
        a.put("day", "ALTER TABLE apps ADD COLUMN day INTEGER;");
        a.put("daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;");
        a.put("daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;");
        a.put("daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;");
        a.put("remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;");
        a.put("config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;");
        a.put("failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;");
        a.put("app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;");
        a.put("firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;");
        a.put("daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;");
        a.put("daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;");
        a.put("health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;");
        b.put("realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;");
        c.put("has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;");
        d.put("previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;");
    }

    bz(cv cvVar) {
        super(cvVar);
    }

    private boolean S() {
        return n().getDatabasePath(B()).exists();
    }

    @TargetApi(11)
    static int a(Cursor cursor, int i) {
        if (VERSION.SDK_INT >= 11) {
            return cursor.getType(i);
        }
        CursorWindow window = ((SQLiteCursor) cursor).getWindow();
        int position = cursor.getPosition();
        return window.isNull(position, i) ? 0 : window.isLong(position, i) ? 1 : window.isFloat(position, i) ? 2 : window.isString(position, i) ? 3 : window.isBlob(position, i) ? 4 : -1;
    }

    private long a(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            cursor = A().rawQuery(str, strArr);
            if (cursor.moveToFirst()) {
                long j = cursor.getLong(0);
                if (cursor != null) {
                    cursor.close();
                }
                return j;
            }
            throw new SQLiteException("Database returned empty set");
        } catch (SQLiteException e) {
            u().x().a("Database error", str, e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    private long a(String str, String[] strArr, long j) {
        Cursor cursor = null;
        try {
            cursor = A().rawQuery(str, strArr);
            if (cursor.moveToFirst()) {
                j = cursor.getLong(0);
                if (cursor != null) {
                    cursor.close();
                }
            } else if (cursor != null) {
                cursor.close();
            }
            return j;
        } catch (SQLiteException e) {
            u().x().a("Database error", str, e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    static Set<String> a(SQLiteDatabase sQLiteDatabase, String str) {
        Set<String> hashSet = new HashSet();
        Cursor rawQuery = sQLiteDatabase.rawQuery(new StringBuilder(String.valueOf(str).length() + 22).append("SELECT * FROM ").append(str).append(" LIMIT 0").toString(), null);
        try {
            Collections.addAll(hashSet, rawQuery.getColumnNames());
            return hashSet;
        } finally {
            rawQuery.close();
        }
    }

    static void a(co coVar, SQLiteDatabase sQLiteDatabase) {
        if (coVar == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        } else if (VERSION.SDK_INT >= 9) {
            File file = new File(sQLiteDatabase.getPath());
            if (!file.setReadable(false, false)) {
                coVar.z().a("Failed to turn off database read permission");
            }
            if (!file.setWritable(false, false)) {
                coVar.z().a("Failed to turn off database write permission");
            }
            if (!file.setReadable(true, true)) {
                coVar.z().a("Failed to turn on database read permission for owner");
            }
            if (!file.setWritable(true, true)) {
                coVar.z().a("Failed to turn on database write permission for owner");
            }
        }
    }

    static void a(co coVar, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, Map<String, String> map) {
        if (coVar == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        if (!a(coVar, sQLiteDatabase, str)) {
            sQLiteDatabase.execSQL(str2);
        }
        try {
            a(coVar, sQLiteDatabase, str, str3, map);
        } catch (SQLiteException e) {
            coVar.x().a("Failed to verify columns on table that was just created", str);
            throw e;
        }
    }

    static void a(co coVar, SQLiteDatabase sQLiteDatabase, String str, String str2, Map<String, String> map) {
        if (coVar == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        Iterable a = a(sQLiteDatabase, str);
        String[] split = str2.split(",");
        int length = split.length;
        int i = 0;
        while (i < length) {
            String str3 = split[i];
            if (a.remove(str3)) {
                i++;
            } else {
                throw new SQLiteException(new StringBuilder((String.valueOf(str).length() + 35) + String.valueOf(str3).length()).append("Table ").append(str).append(" is missing required column: ").append(str3).toString());
            }
        }
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                if (!a.remove(entry.getKey())) {
                    sQLiteDatabase.execSQL((String) entry.getValue());
                }
            }
        }
        if (!a.isEmpty()) {
            coVar.z().a("Table has extra columns. table, columns", str, TextUtils.join(", ", a));
        }
    }

    private void a(String str, com.google.android.gms.b.dm.a aVar) {
        Object obj = null;
        Q();
        e();
        com.google.android.gms.common.internal.c.a(str);
        com.google.android.gms.common.internal.c.a((Object) aVar);
        com.google.android.gms.common.internal.c.a(aVar.c);
        com.google.android.gms.common.internal.c.a(aVar.b);
        if (aVar.a == null) {
            u().z().a("Audience with no ID. appId", co.a(str));
            return;
        }
        int intValue = aVar.a.intValue();
        for (com.google.android.gms.b.dm.b bVar : aVar.c) {
            if (bVar.a == null) {
                u().z().a("Event filter with no ID. Audience definition ignored. appId, audienceId", co.a(str), aVar.a);
                return;
            }
        }
        for (dm.e eVar : aVar.b) {
            if (eVar.a == null) {
                u().z().a("Property filter with no ID. Audience definition ignored. appId, audienceId", co.a(str), aVar.a);
                return;
            }
        }
        Object obj2 = 1;
        for (com.google.android.gms.b.dm.b a : aVar.c) {
            if (!a(str, intValue, a)) {
                obj2 = null;
                break;
            }
        }
        if (obj2 != null) {
            for (dm.e a2 : aVar.b) {
                if (!a(str, intValue, a2)) {
                    break;
                }
            }
        }
        obj = obj2;
        if (obj == null) {
            b(str, intValue);
        }
    }

    static boolean a(co coVar, SQLiteDatabase sQLiteDatabase, String str) {
        Cursor query;
        Object e;
        Throwable th;
        Cursor cursor = null;
        if (coVar == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        try {
            SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
            query = sQLiteDatabase2.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
            try {
                boolean moveToFirst = query.moveToFirst();
                if (query == null) {
                    return moveToFirst;
                }
                query.close();
                return moveToFirst;
            } catch (SQLiteException e2) {
                e = e2;
                try {
                    coVar.z().a("Error querying for table", str, e);
                    if (query != null) {
                        query.close();
                    }
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    cursor = query;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
        } catch (SQLiteException e3) {
            e = e3;
            query = null;
            coVar.z().a("Error querying for table", str, e);
            if (query != null) {
                query.close();
            }
            return false;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    private boolean a(String str, int i, com.google.android.gms.b.dm.b bVar) {
        Q();
        e();
        com.google.android.gms.common.internal.c.a(str);
        com.google.android.gms.common.internal.c.a((Object) bVar);
        if (TextUtils.isEmpty(bVar.b)) {
            u().z().a("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", co.a(str), Integer.valueOf(i), String.valueOf(bVar.a));
            return false;
        }
        try {
            byte[] bArr = new byte[bVar.f()];
            lg a = lg.a(bArr);
            bVar.a(a);
            a.b();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("audience_id", Integer.valueOf(i));
            contentValues.put("filter_id", bVar.a);
            contentValues.put("event_name", bVar.b);
            contentValues.put("data", bArr);
            try {
                if (A().insertWithOnConflict("event_filters", null, contentValues, 5) == -1) {
                    u().x().a("Failed to insert event filter (got -1). appId", co.a(str));
                }
                return true;
            } catch (SQLiteException e) {
                u().x().a("Error storing event filter. appId", co.a(str), e);
                return false;
            }
        } catch (IOException e2) {
            u().x().a("Configuration loss. Failed to serialize event filter. appId", co.a(str), e2);
            return false;
        }
    }

    private boolean a(String str, int i, dm.e eVar) {
        Q();
        e();
        com.google.android.gms.common.internal.c.a(str);
        com.google.android.gms.common.internal.c.a((Object) eVar);
        if (TextUtils.isEmpty(eVar.b)) {
            u().z().a("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", co.a(str), Integer.valueOf(i), String.valueOf(eVar.a));
            return false;
        }
        try {
            byte[] bArr = new byte[eVar.f()];
            lg a = lg.a(bArr);
            eVar.a(a);
            a.b();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("audience_id", Integer.valueOf(i));
            contentValues.put("filter_id", eVar.a);
            contentValues.put("property_name", eVar.b);
            contentValues.put("data", bArr);
            try {
                if (A().insertWithOnConflict("property_filters", null, contentValues, 5) != -1) {
                    return true;
                }
                u().x().a("Failed to insert property filter (got -1). appId", co.a(str));
                return false;
            } catch (SQLiteException e) {
                u().x().a("Error storing property filter. appId", co.a(str), e);
                return false;
            }
        } catch (IOException e2) {
            u().x().a("Configuration loss. Failed to serialize property filter. appId", co.a(str), e2);
            return false;
        }
    }

    SQLiteDatabase A() {
        e();
        try {
            return this.e.getWritableDatabase();
        } catch (SQLiteException e) {
            u().z().a("Error opening database", e);
            throw e;
        }
    }

    String B() {
        return w().O();
    }

    public String C() {
        Cursor rawQuery;
        Object e;
        Throwable th;
        String str = null;
        try {
            rawQuery = A().rawQuery("select app_id from queue where app_id not in (select app_id from apps where measurement_enabled=0) order by has_realtime desc, rowid asc limit 1;", null);
            try {
                if (rawQuery.moveToFirst()) {
                    str = rawQuery.getString(0);
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                } else if (rawQuery != null) {
                    rawQuery.close();
                }
            } catch (SQLiteException e2) {
                e = e2;
                try {
                    u().x().a("Database error getting next bundle app id", e);
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    return str;
                } catch (Throwable th2) {
                    th = th2;
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    throw th;
                }
            }
        } catch (SQLiteException e3) {
            e = e3;
            rawQuery = null;
            u().x().a("Database error getting next bundle app id", e);
            if (rawQuery != null) {
                rawQuery.close();
            }
            return str;
        } catch (Throwable th3) {
            rawQuery = null;
            th = th3;
            if (rawQuery != null) {
                rawQuery.close();
            }
            throw th;
        }
        return str;
    }

    public boolean D() {
        return a("select count(1) > 0 from queue where has_realtime = 1", null) != 0;
    }

    void E() {
        e();
        Q();
        if (S()) {
            long a = v().f.a();
            long b = m().b();
            if (Math.abs(b - a) > w().X()) {
                v().f.a(b);
                F();
            }
        }
    }

    void F() {
        e();
        Q();
        if (S()) {
            int delete = A().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(m().a()), String.valueOf(w().W())});
            if (delete > 0) {
                u().D().a("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
            }
        }
    }

    public long G() {
        return a("select max(bundle_end_timestamp) from queue", null, 0);
    }

    public long H() {
        return a("select max(timestamp) from raw_events", null, 0);
    }

    public boolean I() {
        return a("select count(1) > 0 from raw_events", null) != 0;
    }

    public boolean J() {
        return a("select count(1) > 0 from raw_events where realtime = 1", null) != 0;
    }

    public long K() {
        long j = -1;
        Cursor cursor = null;
        try {
            cursor = A().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
            if (cursor.moveToFirst()) {
                j = cursor.getLong(0);
                if (cursor != null) {
                    cursor.close();
                }
            } else if (cursor != null) {
                cursor.close();
            }
        } catch (SQLiteException e) {
            u().x().a("Error querying raw events", e);
            if (cursor != null) {
                cursor.close();
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
        }
        return j;
    }

    public long a(e eVar) {
        e();
        Q();
        com.google.android.gms.common.internal.c.a((Object) eVar);
        com.google.android.gms.common.internal.c.a(eVar.o);
        try {
            byte[] bArr = new byte[eVar.f()];
            lg a = lg.a(bArr);
            eVar.a(a);
            a.b();
            long d = q().d(bArr);
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", eVar.o);
            contentValues.put("metadata_fingerprint", Long.valueOf(d));
            contentValues.put("metadata", bArr);
            try {
                A().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
                return d;
            } catch (SQLiteException e) {
                u().x().a("Error storing raw event metadata. appId", co.a(eVar.o), e);
                throw e;
            }
        } catch (IOException e2) {
            u().x().a("Data loss. Failed to serialize event metadata. appId", co.a(eVar.o), e2);
            throw e2;
        }
    }

    public a a(long j, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Cursor query;
        Object e;
        Throwable th;
        com.google.android.gms.common.internal.c.a(str);
        e();
        Q();
        String[] strArr = new String[]{str};
        a aVar = new a();
        try {
            SQLiteDatabase A = A();
            query = A.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                if (query.moveToFirst()) {
                    if (query.getLong(0) == j) {
                        aVar.b = query.getLong(1);
                        aVar.a = query.getLong(2);
                        aVar.c = query.getLong(3);
                        aVar.d = query.getLong(4);
                        aVar.e = query.getLong(5);
                    }
                    if (z) {
                        aVar.b++;
                    }
                    if (z2) {
                        aVar.a++;
                    }
                    if (z3) {
                        aVar.c++;
                    }
                    if (z4) {
                        aVar.d++;
                    }
                    if (z5) {
                        aVar.e++;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("day", Long.valueOf(j));
                    contentValues.put("daily_public_events_count", Long.valueOf(aVar.a));
                    contentValues.put("daily_events_count", Long.valueOf(aVar.b));
                    contentValues.put("daily_conversions_count", Long.valueOf(aVar.c));
                    contentValues.put("daily_error_events_count", Long.valueOf(aVar.d));
                    contentValues.put("daily_realtime_events_count", Long.valueOf(aVar.e));
                    A.update("apps", contentValues, "app_id=?", strArr);
                    if (query != null) {
                        query.close();
                    }
                    return aVar;
                }
                u().z().a("Not updating daily counts, app is not known. appId", co.a(str));
                if (query != null) {
                    query.close();
                }
                return aVar;
            } catch (SQLiteException e2) {
                e = e2;
                try {
                    u().x().a("Error updating daily counts. appId", co.a(str), e);
                    if (query != null) {
                        query.close();
                    }
                    return aVar;
                } catch (Throwable th2) {
                    th = th2;
                    if (query != null) {
                        query.close();
                    }
                    throw th;
                }
            }
        } catch (SQLiteException e3) {
            e = e3;
            query = null;
            u().x().a("Error updating daily counts. appId", co.a(str), e);
            if (query != null) {
                query.close();
            }
            return aVar;
        } catch (Throwable th3) {
            th = th3;
            query = null;
            if (query != null) {
                query.close();
            }
            throw th;
        }
    }

    public cd a(String str, String str2) {
        Object e;
        Cursor cursor;
        Throwable th;
        Cursor cursor2 = null;
        com.google.android.gms.common.internal.c.a(str);
        com.google.android.gms.common.internal.c.a(str2);
        e();
        Q();
        try {
            Cursor query = A().query("events", new String[]{"lifetime_count", "current_bundle_count", "last_fire_timestamp"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                if (query.moveToFirst()) {
                    cd cdVar = new cd(str, str2, query.getLong(0), query.getLong(1), query.getLong(2));
                    if (query.moveToNext()) {
                        u().x().a("Got multiple records for event aggregates, expected one. appId", co.a(str));
                    }
                    if (query == null) {
                        return cdVar;
                    }
                    query.close();
                    return cdVar;
                }
                if (query != null) {
                    query.close();
                }
                return null;
            } catch (SQLiteException e2) {
                e = e2;
                cursor = query;
                try {
                    u().x().a("Error querying events. appId", co.a(str), str2, e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    cursor2 = cursor;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                cursor2 = query;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursor = null;
            u().x().a("Error querying events. appId", co.a(str), str2, e);
            if (cursor != null) {
                cursor.close();
            }
            return null;
        } catch (Throwable th4) {
            th = th4;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    public List<dk> a(String str) {
        Object e;
        Cursor cursor;
        Throwable th;
        Cursor cursor2 = null;
        com.google.android.gms.common.internal.c.a(str);
        e();
        Q();
        List<dk> arrayList = new ArrayList();
        try {
            Cursor query = A().query("user_attributes", new String[]{"name", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", String.valueOf(w().J()));
            try {
                if (query.moveToFirst()) {
                    do {
                        String string = query.getString(0);
                        long j = query.getLong(1);
                        Object b = b(query, 2);
                        if (b == null) {
                            u().x().a("Read invalid user property value, ignoring it. appId", co.a(str));
                        } else {
                            arrayList.add(new dk(str, string, j, b));
                        }
                    } while (query.moveToNext());
                    if (query != null) {
                        query.close();
                    }
                    return arrayList;
                }
                if (query != null) {
                    query.close();
                }
                return arrayList;
            } catch (SQLiteException e2) {
                e = e2;
                cursor = query;
            } catch (Throwable th2) {
                th = th2;
                cursor2 = query;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursor = null;
            try {
                u().x().a("Error querying user properties. appId", co.a(str), e);
                if (cursor != null) {
                    cursor.close();
                }
                return null;
            } catch (Throwable th3) {
                th = th3;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    public List<Pair<e, Long>> a(String str, int i, int i2) {
        List<Pair<e, Long>> arrayList;
        Object e;
        Cursor cursor;
        Throwable th;
        boolean z = true;
        e();
        Q();
        com.google.android.gms.common.internal.c.b(i > 0);
        if (i2 <= 0) {
            z = false;
        }
        com.google.android.gms.common.internal.c.b(z);
        com.google.android.gms.common.internal.c.a(str);
        Cursor query;
        try {
            query = A().query("queue", new String[]{"rowid", "data"}, "app_id=?", new String[]{str}, null, null, "rowid", String.valueOf(i));
            try {
                if (query.moveToFirst()) {
                    arrayList = new ArrayList();
                    int i3 = 0;
                    while (true) {
                        long j = query.getLong(0);
                        int length;
                        try {
                            byte[] b = q().b(query.getBlob(1));
                            if (!arrayList.isEmpty() && b.length + i3 > i2) {
                                break;
                            }
                            lf a = lf.a(b);
                            e eVar = new e();
                            try {
                                eVar.b(a);
                                length = b.length + i3;
                                arrayList.add(Pair.create(eVar, Long.valueOf(j)));
                            } catch (IOException e2) {
                                u().x().a("Failed to merge queued bundle. appId", co.a(str), e2);
                                length = i3;
                            }
                            if (!query.moveToNext() || length > i2) {
                                break;
                            }
                            i3 = length;
                        } catch (IOException e22) {
                            u().x().a("Failed to unzip queued bundle. appId", co.a(str), e22);
                            length = i3;
                        }
                    }
                    if (query != null) {
                        query.close();
                    }
                } else {
                    arrayList = Collections.emptyList();
                    if (query != null) {
                        query.close();
                    }
                }
            } catch (SQLiteException e3) {
                e = e3;
                cursor = query;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (SQLiteException e4) {
            e = e4;
            cursor = null;
            try {
                u().x().a("Error querying bundles. appId", co.a(str), e);
                arrayList = Collections.emptyList();
                if (cursor != null) {
                    cursor.close();
                }
                return arrayList;
            } catch (Throwable th3) {
                th = th3;
                query = cursor;
                if (query != null) {
                    query.close();
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            query = null;
            if (query != null) {
                query.close();
            }
            throw th;
        }
        return arrayList;
    }

    protected void a() {
    }

    public void a(long j) {
        e();
        Q();
        if (A().delete("queue", "rowid=?", new String[]{String.valueOf(j)}) != 1) {
            u().x().a("Deleted fewer rows from queue than expected");
        }
    }

    void a(ContentValues contentValues, String str, Object obj) {
        com.google.android.gms.common.internal.c.a(str);
        com.google.android.gms.common.internal.c.a(obj);
        if (obj instanceof String) {
            contentValues.put(str, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put(str, (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    public void a(bu buVar) {
        com.google.android.gms.common.internal.c.a((Object) buVar);
        e();
        Q();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", buVar.b());
        contentValues.put("app_instance_id", buVar.c());
        contentValues.put("gmp_app_id", buVar.d());
        contentValues.put("resettable_device_id_hash", buVar.e());
        contentValues.put("last_bundle_index", Long.valueOf(buVar.o()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(buVar.g()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(buVar.h()));
        contentValues.put("app_version", buVar.i());
        contentValues.put("app_store", buVar.k());
        contentValues.put("gmp_version", Long.valueOf(buVar.l()));
        contentValues.put("dev_cert_hash", Long.valueOf(buVar.m()));
        contentValues.put("measurement_enabled", Boolean.valueOf(buVar.n()));
        contentValues.put("day", Long.valueOf(buVar.s()));
        contentValues.put("daily_public_events_count", Long.valueOf(buVar.t()));
        contentValues.put("daily_events_count", Long.valueOf(buVar.u()));
        contentValues.put("daily_conversions_count", Long.valueOf(buVar.v()));
        contentValues.put("config_fetched_time", Long.valueOf(buVar.p()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(buVar.q()));
        contentValues.put("app_version_int", Long.valueOf(buVar.j()));
        contentValues.put("firebase_instance_id", buVar.f());
        contentValues.put("daily_error_events_count", Long.valueOf(buVar.x()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(buVar.w()));
        contentValues.put("health_monitor_sample", buVar.y());
        try {
            if (A().insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                u().x().a("Failed to insert/update app (got -1). appId", co.a(buVar.b()));
            }
        } catch (SQLiteException e) {
            u().x().a("Error storing app. appId", co.a(buVar.b()), e);
        }
    }

    public void a(cc ccVar, long j, boolean z) {
        int i = 0;
        e();
        Q();
        com.google.android.gms.common.internal.c.a((Object) ccVar);
        com.google.android.gms.common.internal.c.a(ccVar.a);
        com.google.android.gms.b.do.b bVar = new com.google.android.gms.b.do.b();
        bVar.d = Long.valueOf(ccVar.e);
        bVar.a = new com.google.android.gms.b.do.c[ccVar.f.a()];
        Iterator it = ccVar.f.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            com.google.android.gms.b.do.c cVar = new com.google.android.gms.b.do.c();
            int i3 = i2 + 1;
            bVar.a[i2] = cVar;
            cVar.a = str;
            q().a(cVar, ccVar.f.a(str));
            i2 = i3;
        }
        try {
            byte[] bArr = new byte[bVar.f()];
            lg a = lg.a(bArr);
            bVar.a(a);
            a.b();
            u().D().a("Saving event, name, data size", ccVar.b, Integer.valueOf(bArr.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", ccVar.a);
            contentValues.put("name", ccVar.b);
            contentValues.put("timestamp", Long.valueOf(ccVar.d));
            contentValues.put("metadata_fingerprint", Long.valueOf(j));
            contentValues.put("data", bArr);
            str = "realtime";
            if (z) {
                i = 1;
            }
            contentValues.put(str, Integer.valueOf(i));
            try {
                if (A().insert("raw_events", null, contentValues) == -1) {
                    u().x().a("Failed to insert raw event (got -1). appId", co.a(ccVar.a));
                }
            } catch (SQLiteException e) {
                u().x().a("Error storing raw event. appId", co.a(ccVar.a), e);
            }
        } catch (IOException e2) {
            u().x().a("Data loss. Failed to serialize event params/data. appId", co.a(ccVar.a), e2);
        }
    }

    public void a(cd cdVar) {
        com.google.android.gms.common.internal.c.a((Object) cdVar);
        e();
        Q();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", cdVar.a);
        contentValues.put("name", cdVar.b);
        contentValues.put("lifetime_count", Long.valueOf(cdVar.c));
        contentValues.put("current_bundle_count", Long.valueOf(cdVar.d));
        contentValues.put("last_fire_timestamp", Long.valueOf(cdVar.e));
        try {
            if (A().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                u().x().a("Failed to insert/update event aggregates (got -1). appId", co.a(cdVar.a));
            }
        } catch (SQLiteException e) {
            u().x().a("Error storing event aggregates. appId", co.a(cdVar.a), e);
        }
    }

    public void a(e eVar, boolean z) {
        e();
        Q();
        com.google.android.gms.common.internal.c.a((Object) eVar);
        com.google.android.gms.common.internal.c.a(eVar.o);
        com.google.android.gms.common.internal.c.a(eVar.f);
        E();
        long a = m().a();
        if (eVar.f.longValue() < a - w().W() || eVar.f.longValue() > w().W() + a) {
            u().z().a("Storing bundle outside of the max uploading time span. appId, now, timestamp", co.a(eVar.o), Long.valueOf(a), eVar.f);
        }
        try {
            byte[] bArr = new byte[eVar.f()];
            lg a2 = lg.a(bArr);
            eVar.a(a2);
            a2.b();
            bArr = q().a(bArr);
            u().D().a("Saving bundle, size", Integer.valueOf(bArr.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", eVar.o);
            contentValues.put("bundle_end_timestamp", eVar.f);
            contentValues.put("data", bArr);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            try {
                if (A().insert("queue", null, contentValues) == -1) {
                    u().x().a("Failed to insert bundle (got -1). appId", co.a(eVar.o));
                }
            } catch (SQLiteException e) {
                u().x().a("Error storing bundle. appId", co.a(eVar.o), e);
            }
        } catch (IOException e2) {
            u().x().a("Data loss. Failed to serialize bundle. appId", co.a(eVar.o), e2);
        }
    }

    public void a(String str, int i) {
        com.google.android.gms.common.internal.c.a(str);
        e();
        Q();
        try {
            A().execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);", new String[]{str, str, String.valueOf(i)});
        } catch (SQLiteException e) {
            u().x().a("Error pruning currencies. appId", co.a(str), e);
        }
    }

    void a(String str, int i, f fVar) {
        Q();
        e();
        com.google.android.gms.common.internal.c.a(str);
        com.google.android.gms.common.internal.c.a((Object) fVar);
        try {
            byte[] bArr = new byte[fVar.f()];
            lg a = lg.a(bArr);
            fVar.a(a);
            a.b();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("audience_id", Integer.valueOf(i));
            contentValues.put("current_results", bArr);
            try {
                if (A().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                    u().x().a("Failed to insert filter results (got -1). appId", co.a(str));
                }
            } catch (SQLiteException e) {
                u().x().a("Error storing filter results. appId", co.a(str), e);
            }
        } catch (IOException e2) {
            u().x().a("Configuration loss. Failed to serialize filter results. appId", co.a(str), e2);
        }
    }

    public void a(String str, long j, long j2, b bVar) {
        Object e;
        Throwable th;
        com.google.android.gms.common.internal.c.a((Object) bVar);
        e();
        Q();
        Cursor cursor = null;
        SQLiteDatabase A = A();
        String str2;
        if (TextUtils.isEmpty(str)) {
            String[] strArr = j2 != -1 ? new String[]{String.valueOf(j2), String.valueOf(j)} : new String[]{String.valueOf(j)};
            str2 = j2 != -1 ? "rowid <= ? and " : "";
            cursor = A.rawQuery(new StringBuilder(String.valueOf(str2).length() + 148).append("select app_id, metadata_fingerprint from raw_events where ").append(str2).append("app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;").toString(), strArr);
            if (cursor.moveToFirst()) {
                str = cursor.getString(0);
                str2 = cursor.getString(1);
                cursor.close();
                String str3 = str2;
                Cursor cursor2 = cursor;
            } else if (cursor != null) {
                cursor.close();
                return;
            } else {
                return;
            }
        }
        strArr = j2 != -1 ? new String[]{str, String.valueOf(j2)} : new String[]{str};
        str2 = j2 != -1 ? " and rowid <= ?" : "";
        cursor = A.rawQuery(new StringBuilder(String.valueOf(str2).length() + 84).append("select metadata_fingerprint from raw_events where app_id = ?").append(str2).append(" order by rowid limit 1;").toString(), strArr);
        if (cursor.moveToFirst()) {
            str2 = cursor.getString(0);
            cursor.close();
            str3 = str2;
            cursor2 = cursor;
        } else if (cursor != null) {
            cursor.close();
            return;
        } else {
            return;
        }
        try {
            cursor2 = A.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str, str3}, null, null, "rowid", "2");
            if (cursor2.moveToFirst()) {
                lf a = lf.a(cursor2.getBlob(0));
                e eVar = new e();
                try {
                    String str4;
                    String[] strArr2;
                    eVar.b(a);
                    if (cursor2.moveToNext()) {
                        u().z().a("Get multiple raw event metadata records, expected one. appId", co.a(str));
                    }
                    cursor2.close();
                    bVar.a(eVar);
                    if (j2 != -1) {
                        str4 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                        strArr2 = new String[]{str, str3, String.valueOf(j2)};
                    } else {
                        str4 = "app_id = ? and metadata_fingerprint = ?";
                        strArr2 = new String[]{str, str3};
                    }
                    cursor = A.query("raw_events", new String[]{"rowid", "name", "timestamp", "data"}, str4, strArr2, null, null, "rowid", null);
                    if (cursor.moveToFirst()) {
                        do {
                            try {
                                long j3 = cursor.getLong(0);
                                lf a2 = lf.a(cursor.getBlob(3));
                                com.google.android.gms.b.do.b bVar2 = new com.google.android.gms.b.do.b();
                                try {
                                    bVar2.b(a2);
                                    bVar2.b = cursor.getString(1);
                                    bVar2.c = Long.valueOf(cursor.getLong(2));
                                    if (!bVar.a(j3, bVar2)) {
                                        if (cursor != null) {
                                            cursor.close();
                                            return;
                                        }
                                        return;
                                    }
                                } catch (IOException e2) {
                                    u().x().a("Data loss. Failed to merge raw event. appId", co.a(str), e2);
                                }
                            } catch (SQLiteException e3) {
                                e = e3;
                            }
                        } while (cursor.moveToNext());
                        if (cursor != null) {
                            cursor.close();
                            return;
                        }
                        return;
                    }
                    u().z().a("Raw event data disappeared while in transaction. appId", co.a(str));
                    if (cursor != null) {
                        cursor.close();
                        return;
                    }
                    return;
                } catch (IOException e22) {
                    u().x().a("Data loss. Failed to merge raw event metadata. appId", co.a(str), e22);
                    if (cursor2 != null) {
                        cursor2.close();
                        return;
                    }
                    return;
                }
            }
            u().x().a("Raw event metadata record is missing. appId", co.a(str));
            if (cursor2 != null) {
                cursor2.close();
            }
        } catch (SQLiteException e4) {
            e = e4;
            cursor = cursor2;
            try {
                u().x().a("Data loss. Error selecting raw event. appId", co.a(str), e);
                if (cursor != null) {
                    cursor.close();
                }
            } catch (Throwable th2) {
                th = th2;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            cursor = cursor2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public void a(String str, byte[] bArr) {
        com.google.android.gms.common.internal.c.a(str);
        e();
        Q();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        try {
            if (((long) A().update("apps", contentValues, "app_id = ?", new String[]{str})) == 0) {
                u().x().a("Failed to update remote config (got 0). appId", co.a(str));
            }
        } catch (SQLiteException e) {
            u().x().a("Error storing remote config. appId", co.a(str), e);
        }
    }

    void a(String str, com.google.android.gms.b.dm.a[] aVarArr) {
        int i = 0;
        Q();
        e();
        com.google.android.gms.common.internal.c.a(str);
        com.google.android.gms.common.internal.c.a((Object) aVarArr);
        SQLiteDatabase A = A();
        A.beginTransaction();
        try {
            e(str);
            for (com.google.android.gms.b.dm.a a : aVarArr) {
                a(str, a);
            }
            List arrayList = new ArrayList();
            int length = aVarArr.length;
            while (i < length) {
                arrayList.add(aVarArr[i].a);
                i++;
            }
            a(str, arrayList);
            A.setTransactionSuccessful();
        } finally {
            A.endTransaction();
        }
    }

    public void a(List<Long> list) {
        com.google.android.gms.common.internal.c.a((Object) list);
        e();
        Q();
        StringBuilder stringBuilder = new StringBuilder("rowid in (");
        for (int i = 0; i < list.size(); i++) {
            if (i != 0) {
                stringBuilder.append(",");
            }
            stringBuilder.append(((Long) list.get(i)).longValue());
        }
        stringBuilder.append(")");
        int delete = A().delete("raw_events", stringBuilder.toString(), null);
        if (delete != list.size()) {
            u().x().a("Deleted fewer rows from raw events table than expected", Integer.valueOf(delete), Integer.valueOf(list.size()));
        }
    }

    public boolean a(dk dkVar) {
        com.google.android.gms.common.internal.c.a((Object) dkVar);
        e();
        Q();
        if (c(dkVar.a, dkVar.b) == null) {
            long a;
            if (dl.a(dkVar.b)) {
                a = a("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{dkVar.a});
                w().I();
                if (a >= 25) {
                    return false;
                }
            }
            a = a("select count(1) from user_attributes where app_id=?", new String[]{dkVar.a});
            w().J();
            if (a >= 50) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", dkVar.a);
        contentValues.put("name", dkVar.b);
        contentValues.put("set_timestamp", Long.valueOf(dkVar.c));
        a(contentValues, "value", dkVar.d);
        try {
            if (A().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                u().x().a("Failed to insert/update user property (got -1). appId", co.a(dkVar.a));
            }
        } catch (SQLiteException e) {
            u().x().a("Error storing user property. appId", co.a(dkVar.a), e);
        }
        return true;
    }

    boolean a(String str, List<Integer> list) {
        com.google.android.gms.common.internal.c.a(str);
        Q();
        e();
        SQLiteDatabase A = A();
        try {
            if (a("select count(1) from audience_filter_values where app_id=?", new String[]{str}) <= ((long) w().f(str))) {
                return false;
            }
            Iterable arrayList = new ArrayList();
            if (list != null) {
                for (int i = 0; i < list.size(); i++) {
                    Integer num = (Integer) list.get(i);
                    if (num == null || !(num instanceof Integer)) {
                        return false;
                    }
                    arrayList.add(Integer.toString(num.intValue()));
                }
            }
            String valueOf = String.valueOf(TextUtils.join(",", arrayList));
            valueOf = new StringBuilder(String.valueOf(valueOf).length() + 2).append("(").append(valueOf).append(")").toString();
            return A.delete("audience_filter_values", new StringBuilder(String.valueOf(valueOf).length() + 140).append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ").append(valueOf).append(" order by rowid desc limit -1 offset ?)").toString(), new String[]{str, Integer.toString(r5)}) > 0;
        } catch (SQLiteException e) {
            u().x().a("Database error querying filters. appId", co.a(str), e);
            return false;
        }
    }

    public bu b(String str) {
        Cursor query;
        Object e;
        Throwable th;
        com.google.android.gms.common.internal.c.a(str);
        e();
        Q();
        try {
            query = A().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                if (query.moveToFirst()) {
                    bu buVar = new bu(this.n, str);
                    buVar.a(query.getString(0));
                    buVar.b(query.getString(1));
                    buVar.c(query.getString(2));
                    buVar.f(query.getLong(3));
                    buVar.a(query.getLong(4));
                    buVar.b(query.getLong(5));
                    buVar.e(query.getString(6));
                    buVar.f(query.getString(7));
                    buVar.d(query.getLong(8));
                    buVar.e(query.getLong(9));
                    buVar.a((query.isNull(10) ? 1 : query.getInt(10)) != 0);
                    buVar.i(query.getLong(11));
                    buVar.j(query.getLong(12));
                    buVar.k(query.getLong(13));
                    buVar.l(query.getLong(14));
                    buVar.g(query.getLong(15));
                    buVar.h(query.getLong(16));
                    buVar.c(query.isNull(17) ? -2147483648L : (long) query.getInt(17));
                    buVar.d(query.getString(18));
                    buVar.n(query.getLong(19));
                    buVar.m(query.getLong(20));
                    buVar.g(query.getString(21));
                    buVar.a();
                    if (query.moveToNext()) {
                        u().x().a("Got multiple records for app, expected one. appId", co.a(str));
                    }
                    if (query == null) {
                        return buVar;
                    }
                    query.close();
                    return buVar;
                }
                if (query != null) {
                    query.close();
                }
                return null;
            } catch (SQLiteException e2) {
                e = e2;
                try {
                    u().x().a("Error querying app. appId", co.a(str), e);
                    if (query != null) {
                        query.close();
                    }
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    if (query != null) {
                        query.close();
                    }
                    throw th;
                }
            }
        } catch (SQLiteException e3) {
            e = e3;
            query = null;
            u().x().a("Error querying app. appId", co.a(str), e);
            if (query != null) {
                query.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            query = null;
            if (query != null) {
                query.close();
            }
            throw th;
        }
    }

    Object b(Cursor cursor, int i) {
        int a = a(cursor, i);
        switch (a) {
            case 0:
                u().x().a("Loaded invalid null value from database");
                return null;
            case 1:
                return Long.valueOf(cursor.getLong(i));
            case 2:
                return Double.valueOf(cursor.getDouble(i));
            case 3:
                return cursor.getString(i);
            case 4:
                u().x().a("Loaded invalid blob type value, ignoring it");
                return null;
            default:
                u().x().a("Loaded invalid unknown value type, ignoring it", Integer.valueOf(a));
                return null;
        }
    }

    public String b(long j) {
        Object e;
        Throwable th;
        String str = null;
        e();
        Q();
        Cursor rawQuery;
        try {
            rawQuery = A().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf(j)});
            try {
                if (rawQuery.moveToFirst()) {
                    str = rawQuery.getString(0);
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                } else {
                    u().D().a("No expired configs for apps with pending events");
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                }
            } catch (SQLiteException e2) {
                e = e2;
                try {
                    u().x().a("Error selecting expired configs", e);
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    return str;
                } catch (Throwable th2) {
                    th = th2;
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    throw th;
                }
            }
        } catch (SQLiteException e3) {
            e = e3;
            rawQuery = str;
            u().x().a("Error selecting expired configs", e);
            if (rawQuery != null) {
                rawQuery.close();
            }
            return str;
        } catch (Throwable th3) {
            rawQuery = str;
            th = th3;
            if (rawQuery != null) {
                rawQuery.close();
            }
            throw th;
        }
        return str;
    }

    void b(String str, int i) {
        Q();
        e();
        com.google.android.gms.common.internal.c.a(str);
        SQLiteDatabase A = A();
        A.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(i)});
        A.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(i)});
    }

    public void b(String str, String str2) {
        com.google.android.gms.common.internal.c.a(str);
        com.google.android.gms.common.internal.c.a(str2);
        e();
        Q();
        try {
            u().D().a("Deleted user attribute rows:", Integer.valueOf(A().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2})));
        } catch (SQLiteException e) {
            u().x().a("Error deleting user attribute. appId", co.a(str), str2, e);
        }
    }

    public long c(String str) {
        com.google.android.gms.common.internal.c.a(str);
        e();
        Q();
        try {
            SQLiteDatabase A = A();
            String valueOf = String.valueOf(w().j(str));
            return (long) A.delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, valueOf});
        } catch (SQLiteException e) {
            u().x().a("Error deleting over the limit events. appId", co.a(str), e);
            return 0;
        }
    }

    public dk c(String str, String str2) {
        Object e;
        Cursor cursor;
        Throwable th;
        Cursor cursor2 = null;
        com.google.android.gms.common.internal.c.a(str);
        com.google.android.gms.common.internal.c.a(str2);
        e();
        Q();
        try {
            Cursor query = A().query("user_attributes", new String[]{"set_timestamp", "value"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                if (query.moveToFirst()) {
                    dk dkVar = new dk(str, str2, query.getLong(0), b(query, 1));
                    if (query.moveToNext()) {
                        u().x().a("Got multiple records for user property, expected one. appId", co.a(str));
                    }
                    if (query == null) {
                        return dkVar;
                    }
                    query.close();
                    return dkVar;
                }
                if (query != null) {
                    query.close();
                }
                return null;
            } catch (SQLiteException e2) {
                e = e2;
                cursor = query;
                try {
                    u().x().a("Error querying user property. appId", co.a(str), str2, e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    cursor2 = cursor;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                cursor2 = query;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursor = null;
            u().x().a("Error querying user property. appId", co.a(str), str2, e);
            if (cursor != null) {
                cursor.close();
            }
            return null;
        } catch (Throwable th4) {
            th = th4;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    Map<Integer, List<com.google.android.gms.b.dm.b>> d(String str, String str2) {
        Object e;
        Throwable th;
        Q();
        e();
        com.google.android.gms.common.internal.c.a(str);
        com.google.android.gms.common.internal.c.a(str2);
        Map<Integer, List<com.google.android.gms.b.dm.b>> aVar = new android.support.v4.i.a();
        Cursor query;
        try {
            query = A().query("event_filters", new String[]{"audience_id", "data"}, "app_id=? AND event_name=?", new String[]{str, str2}, null, null, null);
            if (query.moveToFirst()) {
                do {
                    lf a = lf.a(query.getBlob(1));
                    com.google.android.gms.b.dm.b bVar = new com.google.android.gms.b.dm.b();
                    try {
                        bVar.b(a);
                        int i = query.getInt(0);
                        List list = (List) aVar.get(Integer.valueOf(i));
                        if (list == null) {
                            list = new ArrayList();
                            aVar.put(Integer.valueOf(i), list);
                        }
                        list.add(bVar);
                    } catch (IOException e2) {
                        try {
                            u().x().a("Failed to merge filter. appId", co.a(str), e2);
                        } catch (SQLiteException e3) {
                            e = e3;
                        }
                    }
                } while (query.moveToNext());
                if (query != null) {
                    query.close();
                }
                return aVar;
            }
            Map<Integer, List<com.google.android.gms.b.dm.b>> emptyMap = Collections.emptyMap();
            if (query == null) {
                return emptyMap;
            }
            query.close();
            return emptyMap;
        } catch (SQLiteException e4) {
            e = e4;
            query = null;
            try {
                u().x().a("Database error querying filters. appId", co.a(str), e);
                if (query != null) {
                    query.close();
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                if (query != null) {
                    query.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            query = null;
            if (query != null) {
                query.close();
            }
            throw th;
        }
    }

    public byte[] d(String str) {
        Object e;
        Throwable th;
        com.google.android.gms.common.internal.c.a(str);
        e();
        Q();
        Cursor query;
        try {
            query = A().query("apps", new String[]{"remote_config"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                if (query.moveToFirst()) {
                    byte[] blob = query.getBlob(0);
                    if (query.moveToNext()) {
                        u().x().a("Got multiple records for app config, expected one. appId", co.a(str));
                    }
                    if (query == null) {
                        return blob;
                    }
                    query.close();
                    return blob;
                }
                if (query != null) {
                    query.close();
                }
                return null;
            } catch (SQLiteException e2) {
                e = e2;
                try {
                    u().x().a("Error querying remote config. appId", co.a(str), e);
                    if (query != null) {
                        query.close();
                    }
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    if (query != null) {
                        query.close();
                    }
                    throw th;
                }
            }
        } catch (SQLiteException e3) {
            e = e3;
            query = null;
            u().x().a("Error querying remote config. appId", co.a(str), e);
            if (query != null) {
                query.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            query = null;
            if (query != null) {
                query.close();
            }
            throw th;
        }
    }

    Map<Integer, List<dm.e>> e(String str, String str2) {
        Object e;
        Throwable th;
        Q();
        e();
        com.google.android.gms.common.internal.c.a(str);
        com.google.android.gms.common.internal.c.a(str2);
        Map<Integer, List<dm.e>> aVar = new android.support.v4.i.a();
        Cursor query;
        try {
            query = A().query("property_filters", new String[]{"audience_id", "data"}, "app_id=? AND property_name=?", new String[]{str, str2}, null, null, null);
            if (query.moveToFirst()) {
                do {
                    lf a = lf.a(query.getBlob(1));
                    dm.e eVar = new dm.e();
                    try {
                        eVar.b(a);
                        int i = query.getInt(0);
                        List list = (List) aVar.get(Integer.valueOf(i));
                        if (list == null) {
                            list = new ArrayList();
                            aVar.put(Integer.valueOf(i), list);
                        }
                        list.add(eVar);
                    } catch (IOException e2) {
                        try {
                            u().x().a("Failed to merge filter", co.a(str), e2);
                        } catch (SQLiteException e3) {
                            e = e3;
                        }
                    }
                } while (query.moveToNext());
                if (query != null) {
                    query.close();
                }
                return aVar;
            }
            Map<Integer, List<dm.e>> emptyMap = Collections.emptyMap();
            if (query == null) {
                return emptyMap;
            }
            query.close();
            return emptyMap;
        } catch (SQLiteException e4) {
            e = e4;
            query = null;
            try {
                u().x().a("Database error querying filters. appId", co.a(str), e);
                if (query != null) {
                    query.close();
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                if (query != null) {
                    query.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            query = null;
            if (query != null) {
                query.close();
            }
            throw th;
        }
    }

    void e(String str) {
        Q();
        e();
        com.google.android.gms.common.internal.c.a(str);
        SQLiteDatabase A = A();
        A.delete("property_filters", "app_id=?", new String[]{str});
        A.delete("event_filters", "app_id=?", new String[]{str});
    }

    protected long f(String str, String str2) {
        Object e;
        com.google.android.gms.common.internal.c.a(str);
        com.google.android.gms.common.internal.c.a(str2);
        e();
        Q();
        SQLiteDatabase A = A();
        A.beginTransaction();
        long a;
        try {
            a = a(new StringBuilder(String.valueOf(str2).length() + 32).append("select ").append(str2).append(" from app2 where app_id=?").toString(), new String[]{str}, -1);
            if (a == -1) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str);
                contentValues.put("first_open_count", Integer.valueOf(0));
                contentValues.put("previous_install_count", Integer.valueOf(0));
                if (A.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                    u().x().a("Failed to insert column (got -1). appId", co.a(str), str2);
                    A.endTransaction();
                    return -1;
                }
                a = 0;
            }
            try {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("app_id", str);
                contentValues2.put(str2, Long.valueOf(1 + a));
                if (((long) A.update("app2", contentValues2, "app_id = ?", new String[]{str})) == 0) {
                    u().x().a("Failed to update column (got 0). appId", co.a(str), str2);
                    A.endTransaction();
                    return -1;
                }
                A.setTransactionSuccessful();
                A.endTransaction();
                return a;
            } catch (SQLiteException e2) {
                e = e2;
                try {
                    u().x().a("Error inserting column. appId", co.a(str), str2, e);
                    return a;
                } finally {
                    A.endTransaction();
                }
            }
        } catch (SQLiteException e3) {
            e = e3;
            a = 0;
            u().x().a("Error inserting column. appId", co.a(str), str2, e);
            return a;
        }
    }

    Map<Integer, f> f(String str) {
        Object e;
        Throwable th;
        Q();
        e();
        com.google.android.gms.common.internal.c.a(str);
        Cursor query;
        try {
            query = A().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str}, null, null, null);
            if (query.moveToFirst()) {
                Map<Integer, f> aVar = new android.support.v4.i.a();
                do {
                    int i = query.getInt(0);
                    lf a = lf.a(query.getBlob(1));
                    f fVar = new f();
                    try {
                        fVar.b(a);
                        try {
                            aVar.put(Integer.valueOf(i), fVar);
                        } catch (SQLiteException e2) {
                            e = e2;
                        }
                    } catch (IOException e3) {
                        u().x().a("Failed to merge filter results. appId, audienceId, error", co.a(str), Integer.valueOf(i), e3);
                    }
                } while (query.moveToNext());
                if (query == null) {
                    return aVar;
                }
                query.close();
                return aVar;
            }
            if (query != null) {
                query.close();
            }
            return null;
        } catch (SQLiteException e4) {
            e = e4;
            query = null;
            try {
                u().x().a("Database error querying filter results. appId", co.a(str), e);
                if (query != null) {
                    query.close();
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                if (query != null) {
                    query.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            query = null;
            if (query != null) {
                query.close();
            }
            throw th;
        }
    }

    void g(String str) {
        Q();
        e();
        com.google.android.gms.common.internal.c.a(str);
        try {
            SQLiteDatabase A = A();
            String[] strArr = new String[]{str};
            int delete = A.delete("audience_filter_values", "app_id=?", strArr) + (((((((A.delete("events", "app_id=?", strArr) + 0) + A.delete("user_attributes", "app_id=?", strArr)) + A.delete("apps", "app_id=?", strArr)) + A.delete("raw_events", "app_id=?", strArr)) + A.delete("raw_events_metadata", "app_id=?", strArr)) + A.delete("event_filters", "app_id=?", strArr)) + A.delete("property_filters", "app_id=?", strArr));
            if (delete > 0) {
                u().D().a("Deleted application data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            u().x().a("Error deleting application data. appId, error", co.a(str), e);
        }
    }

    public long h(String str) {
        com.google.android.gms.common.internal.c.a(str);
        e();
        Q();
        return f(str, "first_open_count");
    }

    public void i(String str) {
        try {
            A().execSQL("delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)", new String[]{str, str});
        } catch (SQLiteException e) {
            u().x().a("Failed to remove unused event metadata. appId", co.a(str), e);
        }
    }

    public long j(String str) {
        com.google.android.gms.common.internal.c.a(str);
        return a("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0);
    }

    public void x() {
        Q();
        A().beginTransaction();
    }

    public void y() {
        Q();
        A().setTransactionSuccessful();
    }

    public void z() {
        Q();
        A().endTransaction();
    }
}
