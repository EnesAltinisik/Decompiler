package com.google.android.gms.measurement.internal;

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
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.internal.zzamb;
import com.google.android.gms.internal.zzamc;
import com.google.android.gms.internal.zzsn;
import com.google.android.gms.internal.zzsp.zzb;
import com.google.android.gms.internal.zzsp.zzc;
import com.google.android.gms.internal.zzsp.zzf;
import com.google.firebase.analytics.FirebaseAnalytics.Param;
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

class zze extends b {
    private static final Map<String, String> a = new android.support.v4.h.a(16);
    private final b b = new b(this, getContext(), e());
    private final d c = new d(zzlQ());

    interface a {
        void a(com.google.android.gms.internal.zzsp.zze com_google_android_gms_internal_zzsp_zze);

        boolean a(long j, zzb com_google_android_gms_internal_zzsp_zzb);
    }

    private class b extends SQLiteOpenHelper {
        final /* synthetic */ zze a;

        b(zze com_google_android_gms_measurement_internal_zze, Context context, String str) {
            this.a = com_google_android_gms_measurement_internal_zze;
            super(context, str, null, 1);
        }

        private void a(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, Map<String, String> map) throws SQLiteException {
            if (!a(sQLiteDatabase, str)) {
                sQLiteDatabase.execSQL(str2);
            }
            try {
                a(sQLiteDatabase, str, str3, map);
            } catch (SQLiteException e) {
                this.a.zzFm().zzFE().zzj("Failed to verify columns on table that was just created", str);
                throw e;
            }
        }

        private void a(SQLiteDatabase sQLiteDatabase, String str, String str2, Map<String, String> map) throws SQLiteException {
            Set b = b(sQLiteDatabase, str);
            String[] split = str2.split(",");
            int length = split.length;
            int i = 0;
            while (i < length) {
                String str3 = split[i];
                if (b.remove(str3)) {
                    i++;
                } else {
                    throw new SQLiteException(new StringBuilder((String.valueOf(str).length() + 35) + String.valueOf(str3).length()).append("Table ").append(str).append(" is missing required column: ").append(str3).toString());
                }
            }
            if (map != null) {
                for (Entry entry : map.entrySet()) {
                    if (!b.remove(entry.getKey())) {
                        sQLiteDatabase.execSQL((String) entry.getValue());
                    }
                }
            }
            if (!b.isEmpty()) {
                throw new SQLiteException(new StringBuilder(String.valueOf(str).length() + 30).append("Table ").append(str).append(" table has extra columns").toString());
            }
        }

        private boolean a(SQLiteDatabase sQLiteDatabase, String str) {
            Object e;
            Throwable th;
            Cursor cursor = null;
            Cursor query;
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
                        this.a.zzFm().zzFG().zze("Error querying for table", str, e);
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
                this.a.zzFm().zzFG().zze("Error querying for table", str, e);
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

        private Set<String> b(SQLiteDatabase sQLiteDatabase, String str) {
            Set<String> hashSet = new HashSet();
            Cursor rawQuery = sQLiteDatabase.rawQuery(new StringBuilder(String.valueOf(str).length() + 22).append("SELECT * FROM ").append(str).append(" LIMIT 0").toString(), null);
            try {
                Collections.addAll(hashSet, rawQuery.getColumnNames());
                return hashSet;
            } finally {
                rawQuery.close();
            }
        }

        public SQLiteDatabase getWritableDatabase() {
            if (this.a.c.a(this.a.zzFo().zzEJ())) {
                SQLiteDatabase writableDatabase;
                try {
                    writableDatabase = super.getWritableDatabase();
                } catch (SQLiteException e) {
                    this.a.c.a();
                    this.a.zzFm().zzFE().log("Opening the database failed, dropping and recreating it");
                    this.a.getContext().getDatabasePath(this.a.e()).delete();
                    try {
                        writableDatabase = super.getWritableDatabase();
                        this.a.c.b();
                    } catch (SQLiteException e2) {
                        this.a.zzFm().zzFE().zzj("Failed to open freshly created database", e2);
                        throw e2;
                    }
                }
                return writableDatabase;
            }
            throw new SQLiteException("Database open failed");
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            if (VERSION.SDK_INT >= 9) {
                File file = new File(sQLiteDatabase.getPath());
                file.setReadable(false, false);
                file.setWritable(false, false);
                file.setReadable(true, true);
                file.setWritable(true, true);
            }
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
            a(sQLiteDatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", null);
            a(sQLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", null);
            a(sQLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", zze.a);
            a(sQLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", null);
            a(sQLiteDatabase, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
            a(sQLiteDatabase, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", null);
            a(sQLiteDatabase, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", null);
            a(sQLiteDatabase, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", null);
            a(sQLiteDatabase, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        }
    }

    public static class zza {
        long zzbbX;
        long zzbbY;
        long zzbbZ;
        long zzbca;
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
    }

    zze(zzx com_google_android_gms_measurement_internal_zzx) {
        super(com_google_android_gms_measurement_internal_zzx);
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
            cursor = d().rawQuery(str, strArr);
            if (cursor.moveToFirst()) {
                long j = cursor.getLong(0);
                if (cursor != null) {
                    cursor.close();
                }
                return j;
            }
            throw new SQLiteException("Database returned empty set");
        } catch (SQLiteException e) {
            zzFm().zzFE().zze("Database error", str, e);
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
            cursor = d().rawQuery(str, strArr);
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
            zzFm().zzFE().zze("Database error", str, e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    private void a(String str, com.google.android.gms.internal.zzsn.zza com_google_android_gms_internal_zzsn_zza) {
        Object obj = null;
        zzma();
        zzkN();
        zzaa.zzdl(str);
        zzaa.zzz(com_google_android_gms_internal_zzsn_zza);
        zzaa.zzz(com_google_android_gms_internal_zzsn_zza.zzbgk);
        zzaa.zzz(com_google_android_gms_internal_zzsn_zza.zzbgj);
        if (com_google_android_gms_internal_zzsn_zza.zzbgi == null) {
            zzFm().zzFG().log("Audience with no ID");
            return;
        }
        int intValue = com_google_android_gms_internal_zzsn_zza.zzbgi.intValue();
        for (zzsn.zzb com_google_android_gms_internal_zzsn_zzb : com_google_android_gms_internal_zzsn_zza.zzbgk) {
            if (com_google_android_gms_internal_zzsn_zzb.zzbgm == null) {
                zzFm().zzFG().zze("Event filter with no ID. Audience definition ignored. appId, audienceId", str, com_google_android_gms_internal_zzsn_zza.zzbgi);
                return;
            }
        }
        for (com.google.android.gms.internal.zzsn.zze com_google_android_gms_internal_zzsn_zze : com_google_android_gms_internal_zzsn_zza.zzbgj) {
            if (com_google_android_gms_internal_zzsn_zze.zzbgm == null) {
                zzFm().zzFG().zze("Property filter with no ID. Audience definition ignored. appId, audienceId", str, com_google_android_gms_internal_zzsn_zza.zzbgi);
                return;
            }
        }
        Object obj2 = 1;
        for (zzsn.zzb a : com_google_android_gms_internal_zzsn_zza.zzbgk) {
            if (!a(str, intValue, a)) {
                obj2 = null;
                break;
            }
        }
        if (obj2 != null) {
            for (com.google.android.gms.internal.zzsn.zze a2 : com_google_android_gms_internal_zzsn_zza.zzbgj) {
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

    private boolean a(String str, int i, zzsn.zzb com_google_android_gms_internal_zzsn_zzb) {
        zzma();
        zzkN();
        zzaa.zzdl(str);
        zzaa.zzz(com_google_android_gms_internal_zzsn_zzb);
        if (TextUtils.isEmpty(com_google_android_gms_internal_zzsn_zzb.zzbgn)) {
            zzFm().zzFG().zze("Event filter had no event name. Audience definition ignored. audienceId, filterId", Integer.valueOf(i), String.valueOf(com_google_android_gms_internal_zzsn_zzb.zzbgm));
            return false;
        }
        try {
            byte[] bArr = new byte[com_google_android_gms_internal_zzsn_zzb.getSerializedSize()];
            zzamc zzO = zzamc.zzO(bArr);
            com_google_android_gms_internal_zzsn_zzb.writeTo(zzO);
            zzO.zzWU();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("audience_id", Integer.valueOf(i));
            contentValues.put("filter_id", com_google_android_gms_internal_zzsn_zzb.zzbgm);
            contentValues.put("event_name", com_google_android_gms_internal_zzsn_zzb.zzbgn);
            contentValues.put("data", bArr);
            try {
                if (d().insertWithOnConflict("event_filters", null, contentValues, 5) == -1) {
                    zzFm().zzFE().log("Failed to insert event filter (got -1)");
                }
                return true;
            } catch (SQLiteException e) {
                zzFm().zzFE().zzj("Error storing event filter", e);
                return false;
            }
        } catch (IOException e2) {
            zzFm().zzFE().zzj("Configuration loss. Failed to serialize event filter", e2);
            return false;
        }
    }

    private boolean a(String str, int i, com.google.android.gms.internal.zzsn.zze com_google_android_gms_internal_zzsn_zze) {
        zzma();
        zzkN();
        zzaa.zzdl(str);
        zzaa.zzz(com_google_android_gms_internal_zzsn_zze);
        if (TextUtils.isEmpty(com_google_android_gms_internal_zzsn_zze.zzbgC)) {
            zzFm().zzFG().zze("Property filter had no property name. Audience definition ignored. audienceId, filterId", Integer.valueOf(i), String.valueOf(com_google_android_gms_internal_zzsn_zze.zzbgm));
            return false;
        }
        try {
            byte[] bArr = new byte[com_google_android_gms_internal_zzsn_zze.getSerializedSize()];
            zzamc zzO = zzamc.zzO(bArr);
            com_google_android_gms_internal_zzsn_zze.writeTo(zzO);
            zzO.zzWU();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("audience_id", Integer.valueOf(i));
            contentValues.put("filter_id", com_google_android_gms_internal_zzsn_zze.zzbgm);
            contentValues.put("property_name", com_google_android_gms_internal_zzsn_zze.zzbgC);
            contentValues.put("data", bArr);
            try {
                if (d().insertWithOnConflict("property_filters", null, contentValues, 5) != -1) {
                    return true;
                }
                zzFm().zzFE().log("Failed to insert property filter (got -1)");
                return false;
            } catch (SQLiteException e) {
                zzFm().zzFE().zzj("Error storing property filter", e);
                return false;
            }
        } catch (IOException e2) {
            zzFm().zzFE().zzj("Configuration loss. Failed to serialize property filter", e2);
            return false;
        }
    }

    private boolean m() {
        return getContext().getDatabasePath(e()).exists();
    }

    public h a(String str, String str2) {
        Object e;
        Cursor cursor;
        Throwable th;
        Cursor cursor2 = null;
        zzaa.zzdl(str);
        zzaa.zzdl(str2);
        zzkN();
        zzma();
        try {
            Cursor query = d().query("events", new String[]{"lifetime_count", "current_bundle_count", "last_fire_timestamp"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                if (query.moveToFirst()) {
                    h hVar = new h(str, str2, query.getLong(0), query.getLong(1), query.getLong(2));
                    if (query.moveToNext()) {
                        zzFm().zzFE().log("Got multiple records for event aggregates, expected one");
                    }
                    if (query == null) {
                        return hVar;
                    }
                    query.close();
                    return hVar;
                }
                if (query != null) {
                    query.close();
                }
                return null;
            } catch (SQLiteException e2) {
                e = e2;
                cursor = query;
                try {
                    zzFm().zzFE().zzd("Error querying events", str, str2, e);
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
            zzFm().zzFE().zzd("Error querying events", str, str2, e);
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

    public zza a(long j, String str, boolean z, boolean z2, boolean z3) {
        Cursor query;
        Object e;
        Throwable th;
        zzaa.zzdl(str);
        zzkN();
        zzma();
        String[] strArr = new String[]{str};
        zza com_google_android_gms_measurement_internal_zze_zza = new zza();
        try {
            SQLiteDatabase d = d();
            query = d.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                if (query.moveToFirst()) {
                    if (query.getLong(0) == j) {
                        com_google_android_gms_measurement_internal_zze_zza.zzbbY = query.getLong(1);
                        com_google_android_gms_measurement_internal_zze_zza.zzbbX = query.getLong(2);
                        com_google_android_gms_measurement_internal_zze_zza.zzbbZ = query.getLong(3);
                        com_google_android_gms_measurement_internal_zze_zza.zzbca = query.getLong(4);
                    }
                    com_google_android_gms_measurement_internal_zze_zza.zzbbY++;
                    if (z) {
                        com_google_android_gms_measurement_internal_zze_zza.zzbbX++;
                    }
                    if (z2) {
                        com_google_android_gms_measurement_internal_zze_zza.zzbbZ++;
                    }
                    if (z3) {
                        com_google_android_gms_measurement_internal_zze_zza.zzbca++;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("day", Long.valueOf(j));
                    contentValues.put("daily_public_events_count", Long.valueOf(com_google_android_gms_measurement_internal_zze_zza.zzbbX));
                    contentValues.put("daily_events_count", Long.valueOf(com_google_android_gms_measurement_internal_zze_zza.zzbbY));
                    contentValues.put("daily_conversions_count", Long.valueOf(com_google_android_gms_measurement_internal_zze_zza.zzbbZ));
                    contentValues.put("daily_error_events_count", Long.valueOf(com_google_android_gms_measurement_internal_zze_zza.zzbca));
                    d.update("apps", contentValues, "app_id=?", strArr);
                    if (query != null) {
                        query.close();
                    }
                    return com_google_android_gms_measurement_internal_zze_zza;
                }
                zzFm().zzFG().zzj("Not updating daily counts, app is not known", str);
                if (query != null) {
                    query.close();
                }
                return com_google_android_gms_measurement_internal_zze_zza;
            } catch (SQLiteException e2) {
                e = e2;
                try {
                    zzFm().zzFE().zzj("Error updating daily counts", e);
                    if (query != null) {
                        query.close();
                    }
                    return com_google_android_gms_measurement_internal_zze_zza;
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
            zzFm().zzFE().zzj("Error updating daily counts", e);
            if (query != null) {
                query.close();
            }
            return com_google_android_gms_measurement_internal_zze_zza;
        } catch (Throwable th3) {
            th = th3;
            query = null;
            if (query != null) {
                query.close();
            }
            throw th;
        }
    }

    public List<e> a(String str) {
        Object e;
        Cursor cursor;
        Throwable th;
        Cursor cursor2 = null;
        zzaa.zzdl(str);
        zzkN();
        zzma();
        List<e> arrayList = new ArrayList();
        try {
            Cursor query = d().query("user_attributes", new String[]{"name", "set_timestamp", Param.VALUE}, "app_id=?", new String[]{str}, null, null, "rowid", String.valueOf(zzFo().zzEI()));
            try {
                if (query.moveToFirst()) {
                    do {
                        String string = query.getString(0);
                        long j = query.getLong(1);
                        Object b = b(query, 2);
                        if (b == null) {
                            zzFm().zzFE().log("Read invalid user property value, ignoring it");
                        } else {
                            arrayList.add(new e(str, string, j, b));
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
                zzFm().zzFE().zze("Error querying user properties", str, e);
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

    public List<Pair<com.google.android.gms.internal.zzsp.zze, Long>> a(String str, int i, int i2) {
        Object e;
        Cursor cursor;
        Throwable th;
        boolean z = true;
        zzkN();
        zzma();
        zzaa.zzaj(i > 0);
        if (i2 <= 0) {
            z = false;
        }
        zzaa.zzaj(z);
        zzaa.zzdl(str);
        Cursor query;
        List<Pair<com.google.android.gms.internal.zzsp.zze, Long>> emptyList;
        try {
            query = d().query("queue", new String[]{"rowid", "data"}, "app_id=?", new String[]{str}, null, null, "rowid", String.valueOf(i));
            try {
                if (query.moveToFirst()) {
                    List<Pair<com.google.android.gms.internal.zzsp.zze, Long>> arrayList = new ArrayList();
                    int i3 = 0;
                    while (true) {
                        long j = query.getLong(0);
                        int length;
                        try {
                            byte[] zzr = zzFi().zzr(query.getBlob(1));
                            if (!arrayList.isEmpty() && zzr.length + i3 > i2) {
                                break;
                            }
                            zzamb zzN = zzamb.zzN(zzr);
                            com.google.android.gms.internal.zzsp.zze com_google_android_gms_internal_zzsp_zze = new com.google.android.gms.internal.zzsp.zze();
                            try {
                                com.google.android.gms.internal.zzsp.zze com_google_android_gms_internal_zzsp_zze2 = (com.google.android.gms.internal.zzsp.zze) com_google_android_gms_internal_zzsp_zze.mergeFrom(zzN);
                                length = zzr.length + i3;
                                arrayList.add(Pair.create(com_google_android_gms_internal_zzsp_zze, Long.valueOf(j)));
                            } catch (IOException e2) {
                                zzFm().zzFE().zze("Failed to merge queued bundle", str, e2);
                                length = i3;
                            }
                            if (!query.moveToNext() || length > i2) {
                                break;
                            }
                            i3 = length;
                        } catch (IOException e22) {
                            zzFm().zzFE().zze("Failed to unzip queued bundle", str, e22);
                            length = i3;
                        }
                    }
                    if (query != null) {
                        query.close();
                    }
                    return arrayList;
                }
                emptyList = Collections.emptyList();
                if (query == null) {
                    return emptyList;
                }
                query.close();
                return emptyList;
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
                zzFm().zzFE().zze("Error querying bundles", str, e);
                emptyList = Collections.emptyList();
                if (cursor == null) {
                    return emptyList;
                }
                cursor.close();
                return emptyList;
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
    }

    public void a() {
        zzma();
        d().beginTransaction();
    }

    public void a(long j) {
        zzkN();
        zzma();
        if (d().delete("queue", "rowid=?", new String[]{String.valueOf(j)}) != 1) {
            zzFm().zzFE().log("Deleted fewer rows from queue than expected");
        }
    }

    void a(ContentValues contentValues, String str, Object obj) {
        zzaa.zzdl(str);
        zzaa.zzz(obj);
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

    public void a(com.google.android.gms.internal.zzsp.zze com_google_android_gms_internal_zzsp_zze) {
        zzkN();
        zzma();
        zzaa.zzz(com_google_android_gms_internal_zzsp_zze);
        zzaa.zzdl(com_google_android_gms_internal_zzsp_zze.appId);
        zzaa.zzz(com_google_android_gms_internal_zzsp_zze.zzbhi);
        g();
        long currentTimeMillis = zzlQ().currentTimeMillis();
        if (com_google_android_gms_internal_zzsp_zze.zzbhi.longValue() < currentTimeMillis - zzFo().zzEO() || com_google_android_gms_internal_zzsp_zze.zzbhi.longValue() > zzFo().zzEO() + currentTimeMillis) {
            zzFm().zzFG().zze("Storing bundle outside of the max uploading time span. now, timestamp", Long.valueOf(currentTimeMillis), com_google_android_gms_internal_zzsp_zze.zzbhi);
        }
        try {
            byte[] bArr = new byte[com_google_android_gms_internal_zzsp_zze.getSerializedSize()];
            zzamc zzO = zzamc.zzO(bArr);
            com_google_android_gms_internal_zzsp_zze.writeTo(zzO);
            zzO.zzWU();
            bArr = zzFi().zzh(bArr);
            zzFm().zzFL().zzj("Saving bundle, size", Integer.valueOf(bArr.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", com_google_android_gms_internal_zzsp_zze.appId);
            contentValues.put("bundle_end_timestamp", com_google_android_gms_internal_zzsp_zze.zzbhi);
            contentValues.put("data", bArr);
            try {
                if (d().insert("queue", null, contentValues) == -1) {
                    zzFm().zzFE().log("Failed to insert bundle (got -1)");
                }
            } catch (SQLiteException e) {
                zzFm().zzFE().zzj("Error storing bundle", e);
            }
        } catch (IOException e2) {
            zzFm().zzFE().zzj("Data loss. Failed to serialize bundle", e2);
        }
    }

    public void a(a aVar) {
        zzaa.zzz(aVar);
        zzkN();
        zzma();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", aVar.b());
        contentValues.put("app_instance_id", aVar.c());
        contentValues.put("gmp_app_id", aVar.d());
        contentValues.put("resettable_device_id_hash", aVar.e());
        contentValues.put("last_bundle_index", Long.valueOf(aVar.o()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(aVar.g()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(aVar.h()));
        contentValues.put("app_version", aVar.i());
        contentValues.put("app_store", aVar.k());
        contentValues.put("gmp_version", Long.valueOf(aVar.l()));
        contentValues.put("dev_cert_hash", Long.valueOf(aVar.m()));
        contentValues.put("measurement_enabled", Boolean.valueOf(aVar.n()));
        contentValues.put("day", Long.valueOf(aVar.s()));
        contentValues.put("daily_public_events_count", Long.valueOf(aVar.t()));
        contentValues.put("daily_events_count", Long.valueOf(aVar.u()));
        contentValues.put("daily_conversions_count", Long.valueOf(aVar.v()));
        contentValues.put("config_fetched_time", Long.valueOf(aVar.p()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(aVar.q()));
        contentValues.put("app_version_int", Long.valueOf(aVar.j()));
        contentValues.put("firebase_instance_id", aVar.f());
        contentValues.put("daily_error_events_count", Long.valueOf(aVar.w()));
        try {
            if (d().insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                zzFm().zzFE().log("Failed to insert/update app (got -1)");
            }
        } catch (SQLiteException e) {
            zzFm().zzFE().zzj("Error storing app", e);
        }
    }

    public void a(h hVar) {
        zzaa.zzz(hVar);
        zzkN();
        zzma();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", hVar.a);
        contentValues.put("name", hVar.b);
        contentValues.put("lifetime_count", Long.valueOf(hVar.c));
        contentValues.put("current_bundle_count", Long.valueOf(hVar.d));
        contentValues.put("last_fire_timestamp", Long.valueOf(hVar.e));
        try {
            if (d().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                zzFm().zzFE().log("Failed to insert/update event aggregates (got -1)");
            }
        } catch (SQLiteException e) {
            zzFm().zzFE().zzj("Error storing event aggregates", e);
        }
    }

    public void a(zzh com_google_android_gms_measurement_internal_zzh, long j) {
        zzkN();
        zzma();
        zzaa.zzz(com_google_android_gms_measurement_internal_zzh);
        zzaa.zzdl(com_google_android_gms_measurement_internal_zzh.zzPx);
        zzb com_google_android_gms_internal_zzsp_zzb = new zzb();
        com_google_android_gms_internal_zzsp_zzb.zzbgY = Long.valueOf(com_google_android_gms_measurement_internal_zzh.zzbci);
        com_google_android_gms_internal_zzsp_zzb.zzbgW = new zzc[com_google_android_gms_measurement_internal_zzh.zzbcj.size()];
        Iterator it = com_google_android_gms_measurement_internal_zzh.zzbcj.iterator();
        int i = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            zzc com_google_android_gms_internal_zzsp_zzc = new zzc();
            int i2 = i + 1;
            com_google_android_gms_internal_zzsp_zzb.zzbgW[i] = com_google_android_gms_internal_zzsp_zzc;
            com_google_android_gms_internal_zzsp_zzc.name = str;
            zzFi().zza(com_google_android_gms_internal_zzsp_zzc, com_google_android_gms_measurement_internal_zzh.zzbcj.get(str));
            i = i2;
        }
        try {
            byte[] bArr = new byte[com_google_android_gms_internal_zzsp_zzb.getSerializedSize()];
            zzamc zzO = zzamc.zzO(bArr);
            com_google_android_gms_internal_zzsp_zzb.writeTo(zzO);
            zzO.zzWU();
            zzFm().zzFL().zze("Saving event, name, data size", com_google_android_gms_measurement_internal_zzh.mName, Integer.valueOf(bArr.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", com_google_android_gms_measurement_internal_zzh.zzPx);
            contentValues.put("name", com_google_android_gms_measurement_internal_zzh.mName);
            contentValues.put("timestamp", Long.valueOf(com_google_android_gms_measurement_internal_zzh.zzajg));
            contentValues.put("metadata_fingerprint", Long.valueOf(j));
            contentValues.put("data", bArr);
            try {
                if (d().insert("raw_events", null, contentValues) == -1) {
                    zzFm().zzFE().log("Failed to insert raw event (got -1)");
                }
            } catch (SQLiteException e) {
                zzFm().zzFE().zzj("Error storing raw event", e);
            }
        } catch (IOException e2) {
            zzFm().zzFE().zzj("Data loss. Failed to serialize event params/data", e2);
        }
    }

    public void a(String str, int i) {
        zzaa.zzdl(str);
        zzkN();
        zzma();
        try {
            d().execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);", new String[]{str, str, String.valueOf(i)});
        } catch (SQLiteException e) {
            zzFm().zzFE().zze("Error pruning currencies", str, e);
        }
    }

    void a(String str, int i, zzf com_google_android_gms_internal_zzsp_zzf) {
        zzma();
        zzkN();
        zzaa.zzdl(str);
        zzaa.zzz(com_google_android_gms_internal_zzsp_zzf);
        try {
            byte[] bArr = new byte[com_google_android_gms_internal_zzsp_zzf.getSerializedSize()];
            zzamc zzO = zzamc.zzO(bArr);
            com_google_android_gms_internal_zzsp_zzf.writeTo(zzO);
            zzO.zzWU();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("audience_id", Integer.valueOf(i));
            contentValues.put("current_results", bArr);
            try {
                if (d().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                    zzFm().zzFE().log("Failed to insert filter results (got -1)");
                }
            } catch (SQLiteException e) {
                zzFm().zzFE().zzj("Error storing filter results", e);
            }
        } catch (IOException e2) {
            zzFm().zzFE().zzj("Configuration loss. Failed to serialize filter results", e2);
        }
    }

    public void a(String str, long j, a aVar) {
        Cursor cursor;
        Object e;
        Throwable th;
        Cursor cursor2 = null;
        zzaa.zzz(aVar);
        zzkN();
        zzma();
        try {
            Object string;
            String str2;
            SQLiteDatabase d = d();
            String string2;
            if (TextUtils.isEmpty(str)) {
                cursor2 = d.rawQuery("select app_id, metadata_fingerprint from raw_events where app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;", new String[]{String.valueOf(j)});
                if (cursor2.moveToFirst()) {
                    string = cursor2.getString(0);
                    string2 = cursor2.getString(1);
                    cursor2.close();
                    str2 = string2;
                    cursor = cursor2;
                } else if (cursor2 != null) {
                    cursor2.close();
                    return;
                } else {
                    return;
                }
            }
            cursor2 = d.rawQuery("select metadata_fingerprint from raw_events where app_id = ? order by rowid limit 1;", new String[]{str});
            if (cursor2.moveToFirst()) {
                string2 = cursor2.getString(0);
                cursor2.close();
                str2 = string2;
                cursor = cursor2;
            } else if (cursor2 != null) {
                cursor2.close();
                return;
            } else {
                return;
            }
            try {
                cursor = d.query("raw_events_metadata", new String[]{"metadata"}, "app_id=? and metadata_fingerprint=?", new String[]{string, str2}, null, null, "rowid", "2");
                if (cursor.moveToFirst()) {
                    zzamb zzN = zzamb.zzN(cursor.getBlob(0));
                    com.google.android.gms.internal.zzsp.zze com_google_android_gms_internal_zzsp_zze = new com.google.android.gms.internal.zzsp.zze();
                    try {
                        com.google.android.gms.internal.zzsp.zze com_google_android_gms_internal_zzsp_zze2 = (com.google.android.gms.internal.zzsp.zze) com_google_android_gms_internal_zzsp_zze.mergeFrom(zzN);
                        if (cursor.moveToNext()) {
                            zzFm().zzFG().log("Get multiple raw event metadata records, expected one");
                        }
                        cursor.close();
                        aVar.a(com_google_android_gms_internal_zzsp_zze);
                        cursor2 = d.query("raw_events", new String[]{"rowid", "name", "timestamp", "data"}, "app_id=? and metadata_fingerprint=?", new String[]{string, str2}, null, null, "rowid", null);
                        if (cursor2.moveToFirst()) {
                            do {
                                long j2 = cursor2.getLong(0);
                                zzamb zzN2 = zzamb.zzN(cursor2.getBlob(3));
                                zzb com_google_android_gms_internal_zzsp_zzb = new zzb();
                                try {
                                    zzb com_google_android_gms_internal_zzsp_zzb2 = (zzb) com_google_android_gms_internal_zzsp_zzb.mergeFrom(zzN2);
                                    com_google_android_gms_internal_zzsp_zzb.name = cursor2.getString(1);
                                    com_google_android_gms_internal_zzsp_zzb.zzbgX = Long.valueOf(cursor2.getLong(2));
                                    if (!aVar.a(j2, com_google_android_gms_internal_zzsp_zzb)) {
                                        if (cursor2 != null) {
                                            cursor2.close();
                                            return;
                                        }
                                        return;
                                    }
                                } catch (IOException e2) {
                                    try {
                                        zzFm().zzFE().zze("Data loss. Failed to merge raw event", string, e2);
                                    } catch (SQLiteException e3) {
                                        e = e3;
                                    }
                                }
                            } while (cursor2.moveToNext());
                            if (cursor2 != null) {
                                cursor2.close();
                                return;
                            }
                            return;
                        }
                        zzFm().zzFG().log("Raw event data disappeared while in transaction");
                        if (cursor2 != null) {
                            cursor2.close();
                            return;
                        }
                        return;
                    } catch (IOException e22) {
                        zzFm().zzFE().zze("Data loss. Failed to merge raw event metadata", string, e22);
                        if (cursor != null) {
                            cursor.close();
                            return;
                        }
                        return;
                    }
                }
                zzFm().zzFE().log("Raw event metadata record is missing");
                if (cursor != null) {
                    cursor.close();
                }
            } catch (SQLiteException e4) {
                e = e4;
                cursor2 = cursor;
                try {
                    zzFm().zzFE().zzj("Data loss. Error selecting raw event", e);
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = cursor2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e32) {
            e = e32;
        } catch (Throwable th4) {
            th = th4;
            cursor = cursor2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public void a(String str, byte[] bArr) {
        zzaa.zzdl(str);
        zzkN();
        zzma();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        try {
            if (((long) d().update("apps", contentValues, "app_id = ?", new String[]{str})) == 0) {
                zzFm().zzFE().log("Failed to update remote config (got 0)");
            }
        } catch (SQLiteException e) {
            zzFm().zzFE().zzj("Error storing remote config", e);
        }
    }

    void a(String str, com.google.android.gms.internal.zzsn.zza[] com_google_android_gms_internal_zzsn_zzaArr) {
        zzma();
        zzkN();
        zzaa.zzdl(str);
        zzaa.zzz(com_google_android_gms_internal_zzsn_zzaArr);
        SQLiteDatabase d = d();
        d.beginTransaction();
        try {
            e(str);
            for (com.google.android.gms.internal.zzsn.zza a : com_google_android_gms_internal_zzsn_zzaArr) {
                a(str, a);
            }
            d.setTransactionSuccessful();
        } finally {
            d.endTransaction();
        }
    }

    public void a(List<Long> list) {
        zzaa.zzz(list);
        zzkN();
        zzma();
        StringBuilder stringBuilder = new StringBuilder("rowid in (");
        for (int i = 0; i < list.size(); i++) {
            if (i != 0) {
                stringBuilder.append(",");
            }
            stringBuilder.append(((Long) list.get(i)).longValue());
        }
        stringBuilder.append(")");
        int delete = d().delete("raw_events", stringBuilder.toString(), null);
        if (delete != list.size()) {
            zzFm().zzFE().zze("Deleted fewer rows from raw events table than expected", Integer.valueOf(delete), Integer.valueOf(list.size()));
        }
    }

    public boolean a(e eVar) {
        zzaa.zzz(eVar);
        zzkN();
        zzma();
        if (c(eVar.a, eVar.b) == null) {
            if (zzal.zzfG(eVar.b)) {
                if (a("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{eVar.a}) >= ((long) zzFo().zzEH())) {
                    return false;
                }
            }
            if (a("select count(1) from user_attributes where app_id=?", new String[]{eVar.a}) >= ((long) zzFo().zzEI())) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", eVar.a);
        contentValues.put("name", eVar.b);
        contentValues.put("set_timestamp", Long.valueOf(eVar.c));
        a(contentValues, Param.VALUE, eVar.d);
        try {
            if (d().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                zzFm().zzFE().log("Failed to insert/update user property (got -1)");
            }
        } catch (SQLiteException e) {
            zzFm().zzFE().zzj("Error storing user property", e);
        }
        return true;
    }

    public long b(com.google.android.gms.internal.zzsp.zze com_google_android_gms_internal_zzsp_zze) throws IOException {
        zzkN();
        zzma();
        zzaa.zzz(com_google_android_gms_internal_zzsp_zze);
        zzaa.zzdl(com_google_android_gms_internal_zzsp_zze.appId);
        try {
            byte[] bArr = new byte[com_google_android_gms_internal_zzsp_zze.getSerializedSize()];
            zzamc zzO = zzamc.zzO(bArr);
            com_google_android_gms_internal_zzsp_zze.writeTo(zzO);
            zzO.zzWU();
            long zzt = zzFi().zzt(bArr);
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", com_google_android_gms_internal_zzsp_zze.appId);
            contentValues.put("metadata_fingerprint", Long.valueOf(zzt));
            contentValues.put("metadata", bArr);
            try {
                d().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
                return zzt;
            } catch (SQLiteException e) {
                zzFm().zzFE().zzj("Error storing raw event metadata", e);
                throw e;
            }
        } catch (IOException e2) {
            zzFm().zzFE().zzj("Data loss. Failed to serialize event metadata", e2);
            throw e2;
        }
    }

    public a b(String str) {
        Cursor query;
        Object e;
        Throwable th;
        zzaa.zzdl(str);
        zzkN();
        zzma();
        try {
            query = d().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                if (query.moveToFirst()) {
                    a aVar = new a(this.zzbbl, str);
                    aVar.a(query.getString(0));
                    aVar.b(query.getString(1));
                    aVar.c(query.getString(2));
                    aVar.f(query.getLong(3));
                    aVar.a(query.getLong(4));
                    aVar.b(query.getLong(5));
                    aVar.e(query.getString(6));
                    aVar.f(query.getString(7));
                    aVar.d(query.getLong(8));
                    aVar.e(query.getLong(9));
                    aVar.a((query.isNull(10) ? 1 : query.getInt(10)) != 0);
                    aVar.i(query.getLong(11));
                    aVar.j(query.getLong(12));
                    aVar.k(query.getLong(13));
                    aVar.l(query.getLong(14));
                    aVar.g(query.getLong(15));
                    aVar.h(query.getLong(16));
                    aVar.c(query.isNull(17) ? -2147483648L : (long) query.getInt(17));
                    aVar.d(query.getString(18));
                    aVar.m(query.getLong(19));
                    aVar.a();
                    if (query.moveToNext()) {
                        zzFm().zzFE().log("Got multiple records for app, expected one");
                    }
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
            } catch (SQLiteException e2) {
                e = e2;
                try {
                    zzFm().zzFE().zze("Error querying app", str, e);
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
            zzFm().zzFE().zze("Error querying app", str, e);
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
                zzFm().zzFE().log("Loaded invalid null value from database");
                return null;
            case 1:
                return Long.valueOf(cursor.getLong(i));
            case 2:
                return Double.valueOf(cursor.getDouble(i));
            case 3:
                return cursor.getString(i);
            case 4:
                zzFm().zzFE().log("Loaded invalid blob type value, ignoring it");
                return null;
            default:
                zzFm().zzFE().zzj("Loaded invalid unknown value type, ignoring it", Integer.valueOf(a));
                return null;
        }
    }

    public String b(long j) {
        Cursor rawQuery;
        Object e;
        Throwable th;
        String str = null;
        zzkN();
        zzma();
        try {
            rawQuery = d().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf(j)});
            try {
                if (rawQuery.moveToFirst()) {
                    str = rawQuery.getString(0);
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                } else {
                    zzFm().zzFL().log("No expired configs for apps with pending events");
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                }
            } catch (SQLiteException e2) {
                e = e2;
                try {
                    zzFm().zzFE().zzj("Error selecting expired configs", e);
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
            zzFm().zzFE().zzj("Error selecting expired configs", e);
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

    public void b() {
        zzma();
        d().setTransactionSuccessful();
    }

    void b(String str, int i) {
        zzma();
        zzkN();
        zzaa.zzdl(str);
        SQLiteDatabase d = d();
        d.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(i)});
        d.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(i)});
    }

    public void b(String str, String str2) {
        zzaa.zzdl(str);
        zzaa.zzdl(str2);
        zzkN();
        zzma();
        try {
            zzFm().zzFL().zzj("Deleted user attribute rows:", Integer.valueOf(d().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2})));
        } catch (SQLiteException e) {
            zzFm().zzFE().zzd("Error deleting user attribute", str, str2, e);
        }
    }

    public long c(String str) {
        zzaa.zzdl(str);
        zzkN();
        zzma();
        try {
            SQLiteDatabase d = d();
            String valueOf = String.valueOf(zzFo().zzfi(str));
            return (long) d.delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, valueOf});
        } catch (SQLiteException e) {
            zzFm().zzFE().zzj("Error deleting over the limit events", e);
            return 0;
        }
    }

    public e c(String str, String str2) {
        Object e;
        Cursor cursor;
        Throwable th;
        Cursor cursor2 = null;
        zzaa.zzdl(str);
        zzaa.zzdl(str2);
        zzkN();
        zzma();
        try {
            Cursor query = d().query("user_attributes", new String[]{"set_timestamp", Param.VALUE}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                if (query.moveToFirst()) {
                    e eVar = new e(str, str2, query.getLong(0), b(query, 1));
                    if (query.moveToNext()) {
                        zzFm().zzFE().log("Got multiple records for user property, expected one");
                    }
                    if (query == null) {
                        return eVar;
                    }
                    query.close();
                    return eVar;
                }
                if (query != null) {
                    query.close();
                }
                return null;
            } catch (SQLiteException e2) {
                e = e2;
                cursor = query;
                try {
                    zzFm().zzFE().zzd("Error querying user property", str, str2, e);
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
            zzFm().zzFE().zzd("Error querying user property", str, str2, e);
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

    public void c() {
        zzma();
        d().endTransaction();
    }

    SQLiteDatabase d() {
        zzkN();
        try {
            return this.b.getWritableDatabase();
        } catch (SQLiteException e) {
            zzFm().zzFG().zzj("Error opening database", e);
            throw e;
        }
    }

    Map<Integer, List<zzsn.zzb>> d(String str, String str2) {
        Object e;
        Throwable th;
        zzma();
        zzkN();
        zzaa.zzdl(str);
        zzaa.zzdl(str2);
        Map<Integer, List<zzsn.zzb>> aVar = new android.support.v4.h.a();
        Cursor query;
        try {
            query = d().query("event_filters", new String[]{"audience_id", "data"}, "app_id=? AND event_name=?", new String[]{str, str2}, null, null, null);
            if (query.moveToFirst()) {
                do {
                    try {
                        zzamb zzN = zzamb.zzN(query.getBlob(1));
                        zzsn.zzb com_google_android_gms_internal_zzsn_zzb = new zzsn.zzb();
                        try {
                            zzsn.zzb com_google_android_gms_internal_zzsn_zzb2 = (zzsn.zzb) com_google_android_gms_internal_zzsn_zzb.mergeFrom(zzN);
                            int i = query.getInt(0);
                            List list = (List) aVar.get(Integer.valueOf(i));
                            if (list == null) {
                                list = new ArrayList();
                                aVar.put(Integer.valueOf(i), list);
                            }
                            list.add(com_google_android_gms_internal_zzsn_zzb);
                        } catch (IOException e2) {
                            zzFm().zzFE().zze("Failed to merge filter", str, e2);
                        }
                    } catch (SQLiteException e3) {
                        e = e3;
                    }
                } while (query.moveToNext());
                if (query != null) {
                    query.close();
                }
                return aVar;
            }
            Map<Integer, List<zzsn.zzb>> emptyMap = Collections.emptyMap();
            if (query == null) {
                return emptyMap;
            }
            query.close();
            return emptyMap;
        } catch (SQLiteException e4) {
            e = e4;
            query = null;
            try {
                zzFm().zzFE().zzj("Database error querying filters", e);
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
        Cursor query;
        Object e;
        Throwable th;
        zzaa.zzdl(str);
        zzkN();
        zzma();
        try {
            query = d().query("apps", new String[]{"remote_config"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                if (query.moveToFirst()) {
                    byte[] blob = query.getBlob(0);
                    if (query.moveToNext()) {
                        zzFm().zzFE().log("Got multiple records for app config, expected one");
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
                    zzFm().zzFE().zze("Error querying remote config", str, e);
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
            zzFm().zzFE().zze("Error querying remote config", str, e);
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

    String e() {
        if (!zzFo().zzmW()) {
            return zzFo().zznw();
        }
        if (zzFo().zzmX()) {
            return zzFo().zznw();
        }
        zzFm().zzFH().log("Using secondary database");
        return zzFo().zznx();
    }

    Map<Integer, List<com.google.android.gms.internal.zzsn.zze>> e(String str, String str2) {
        Object e;
        Throwable th;
        zzma();
        zzkN();
        zzaa.zzdl(str);
        zzaa.zzdl(str2);
        Map<Integer, List<com.google.android.gms.internal.zzsn.zze>> aVar = new android.support.v4.h.a();
        Cursor query;
        try {
            query = d().query("property_filters", new String[]{"audience_id", "data"}, "app_id=? AND property_name=?", new String[]{str, str2}, null, null, null);
            if (query.moveToFirst()) {
                do {
                    try {
                        zzamb zzN = zzamb.zzN(query.getBlob(1));
                        com.google.android.gms.internal.zzsn.zze com_google_android_gms_internal_zzsn_zze = new com.google.android.gms.internal.zzsn.zze();
                        try {
                            com.google.android.gms.internal.zzsn.zze com_google_android_gms_internal_zzsn_zze2 = (com.google.android.gms.internal.zzsn.zze) com_google_android_gms_internal_zzsn_zze.mergeFrom(zzN);
                            int i = query.getInt(0);
                            List list = (List) aVar.get(Integer.valueOf(i));
                            if (list == null) {
                                list = new ArrayList();
                                aVar.put(Integer.valueOf(i), list);
                            }
                            list.add(com_google_android_gms_internal_zzsn_zze);
                        } catch (IOException e2) {
                            zzFm().zzFE().zze("Failed to merge filter", str, e2);
                        }
                    } catch (SQLiteException e3) {
                        e = e3;
                    }
                } while (query.moveToNext());
                if (query != null) {
                    query.close();
                }
                return aVar;
            }
            Map<Integer, List<com.google.android.gms.internal.zzsn.zze>> emptyMap = Collections.emptyMap();
            if (query == null) {
                return emptyMap;
            }
            query.close();
            return emptyMap;
        } catch (SQLiteException e4) {
            e = e4;
            query = null;
            try {
                zzFm().zzFE().zzj("Database error querying filters", e);
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
        zzma();
        zzkN();
        zzaa.zzdl(str);
        SQLiteDatabase d = d();
        d.delete("property_filters", "app_id=?", new String[]{str});
        d.delete("event_filters", "app_id=?", new String[]{str});
    }

    public String f() {
        Object e;
        Throwable th;
        String str = null;
        Cursor rawQuery;
        try {
            rawQuery = d().rawQuery("select app_id from queue where app_id not in (select app_id from apps where measurement_enabled=0) order by rowid limit 1;", null);
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
                    zzFm().zzFE().zzj("Database error getting next bundle app id", e);
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
            zzFm().zzFE().zzj("Database error getting next bundle app id", e);
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

    Map<Integer, zzf> f(String str) {
        Object e;
        Cursor cursor;
        Throwable th;
        zzma();
        zzkN();
        zzaa.zzdl(str);
        Cursor query;
        try {
            query = d().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                if (query.moveToFirst()) {
                    Map<Integer, zzf> aVar = new android.support.v4.h.a();
                    do {
                        int i = query.getInt(0);
                        zzamb zzN = zzamb.zzN(query.getBlob(1));
                        zzf com_google_android_gms_internal_zzsp_zzf = new zzf();
                        try {
                            zzf com_google_android_gms_internal_zzsp_zzf2 = (zzf) com_google_android_gms_internal_zzsp_zzf.mergeFrom(zzN);
                            aVar.put(Integer.valueOf(i), com_google_android_gms_internal_zzsp_zzf);
                        } catch (IOException e2) {
                            zzFm().zzFE().zzd("Failed to merge filter results. appId, audienceId, error", str, Integer.valueOf(i), e2);
                        }
                    } while (query.moveToNext());
                    if (query != null) {
                        query.close();
                    }
                    return aVar;
                }
                if (query != null) {
                    query.close();
                }
                return null;
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
                zzFm().zzFE().zzj("Database error querying filter results", e);
                if (cursor != null) {
                    cursor.close();
                }
                return null;
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
    }

    void g() {
        zzkN();
        zzma();
        if (m()) {
            long j = zzFn().f.get();
            long elapsedRealtime = zzlQ().elapsedRealtime();
            if (Math.abs(elapsedRealtime - j) > zzFo().zzEP()) {
                zzFn().f.set(elapsedRealtime);
                h();
            }
        }
    }

    void g(String str) {
        zzma();
        zzkN();
        zzaa.zzdl(str);
        try {
            SQLiteDatabase d = d();
            String[] strArr = new String[]{str};
            int delete = d.delete("audience_filter_values", "app_id=?", strArr) + (((((((d.delete("events", "app_id=?", strArr) + 0) + d.delete("user_attributes", "app_id=?", strArr)) + d.delete("apps", "app_id=?", strArr)) + d.delete("raw_events", "app_id=?", strArr)) + d.delete("raw_events_metadata", "app_id=?", strArr)) + d.delete("event_filters", "app_id=?", strArr)) + d.delete("property_filters", "app_id=?", strArr));
            if (delete > 0) {
                zzFm().zzFL().zze("Deleted application data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            zzFm().zzFE().zze("Error deleting application data. appId, error", str, e);
        }
    }

    void h() {
        zzkN();
        zzma();
        if (m()) {
            int delete = d().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(zzlQ().currentTimeMillis()), String.valueOf(zzFo().zzEO())});
            if (delete > 0) {
                zzFm().zzFL().zzj("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
            }
        }
    }

    public void h(String str) {
        try {
            d().execSQL("delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)", new String[]{str, str});
        } catch (SQLiteException e) {
            zzFm().zzFE().zzj("Failed to remove unused event metadata", e);
        }
    }

    public long i() {
        return a("select max(bundle_end_timestamp) from queue", null, 0);
    }

    public long i(String str) {
        zzaa.zzdl(str);
        return a("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0);
    }

    public long j() {
        return a("select max(timestamp) from raw_events", null, 0);
    }

    public boolean k() {
        return a("select count(1) > 0 from raw_events", null) != 0;
    }

    protected void zzkO() {
    }
}
