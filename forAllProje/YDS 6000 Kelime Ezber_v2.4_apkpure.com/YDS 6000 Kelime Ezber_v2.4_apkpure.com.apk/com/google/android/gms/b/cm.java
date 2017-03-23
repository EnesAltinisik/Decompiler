package com.google.android.gms.b;

import android.annotation.TargetApi;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.common.util.c;
import java.util.ArrayList;
import java.util.List;

public class cm extends cy {
    private final a a = new a(this, n(), z());
    private boolean b;

    @TargetApi(11)
    private class a extends SQLiteOpenHelper {
        final /* synthetic */ cm a;

        a(cm cmVar, Context context, String str) {
            this.a = cmVar;
            super(context, str, null, 1);
        }

        public SQLiteDatabase getWritableDatabase() {
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e) {
                if (VERSION.SDK_INT < 11 || !(e instanceof SQLiteDatabaseLockedException)) {
                    this.a.u().x().a("Opening the local database failed, dropping and recreating it");
                    String z = this.a.z();
                    if (!this.a.n().getDatabasePath(z).delete()) {
                        this.a.u().x().a("Failed to delete corrupted local db file", z);
                    }
                    try {
                        return super.getWritableDatabase();
                    } catch (SQLiteException e2) {
                        this.a.u().x().a("Failed to open local database. Events will bypass local storage", e2);
                        return null;
                    }
                }
                throw e2;
            }
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
            bz.a(this.a.u(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", null);
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        }
    }

    cm(cv cvVar) {
        super(cvVar);
    }

    @TargetApi(11)
    private boolean a(int i, byte[] bArr) {
        c();
        e();
        if (this.b) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("type", Integer.valueOf(i));
        contentValues.put("entry", bArr);
        w().ad();
        int i2 = 0;
        int i3 = 5;
        while (i2 < 5) {
            SQLiteDatabase sQLiteDatabase = null;
            try {
                sQLiteDatabase = x();
                if (sQLiteDatabase == null) {
                    this.b = true;
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.close();
                    }
                    return false;
                }
                sQLiteDatabase.beginTransaction();
                long j = 0;
                Cursor rawQuery = sQLiteDatabase.rawQuery("select count(1) from messages", null);
                if (rawQuery != null && rawQuery.moveToFirst()) {
                    j = rawQuery.getLong(0);
                }
                if (j >= 100000) {
                    u().x().a("Data loss, local db full");
                    j = (100000 - j) + 1;
                    long delete = (long) sQLiteDatabase.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", new String[]{Long.toString(j)});
                    if (delete != j) {
                        u().x().a("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j), Long.valueOf(delete), Long.valueOf(j - delete));
                    }
                }
                sQLiteDatabase.insertOrThrow("messages", null, contentValues);
                sQLiteDatabase.setTransactionSuccessful();
                sQLiteDatabase.endTransaction();
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                return true;
            } catch (SQLiteFullException e) {
                u().x().a("Error writing entry to local database", e);
                this.b = true;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                i2++;
            } catch (SQLiteException e2) {
                if (VERSION.SDK_INT < 11 || !(e2 instanceof SQLiteDatabaseLockedException)) {
                    if (sQLiteDatabase != null) {
                        if (sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                    }
                    u().x().a("Error writing entry to local database", e2);
                    this.b = true;
                } else {
                    SystemClock.sleep((long) i3);
                    i3 += 20;
                }
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                i2++;
            } catch (Throwable th) {
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
            }
        }
        u().z().a("Failed to write entry to local database");
        return false;
    }

    @TargetApi(11)
    public List<com.google.android.gms.common.internal.safeparcel.a> a(int i) {
        Object obj;
        Throwable th;
        int i2;
        e();
        c();
        if (VERSION.SDK_INT < 11) {
            return null;
        }
        if (this.b) {
            return null;
        }
        List<com.google.android.gms.common.internal.safeparcel.a> arrayList = new ArrayList();
        if (!y()) {
            return arrayList;
        }
        int i3 = 5;
        int i4 = 0;
        while (i4 < 5) {
            SQLiteDatabase sQLiteDatabase = null;
            try {
                SQLiteDatabase x = x();
                if (x == null) {
                    try {
                        this.b = true;
                        if (x != null) {
                            x.close();
                        }
                        return null;
                    } catch (SQLiteFullException e) {
                        SQLiteFullException sQLiteFullException = e;
                        sQLiteDatabase = x;
                        obj = sQLiteFullException;
                    } catch (SQLiteException e2) {
                        SQLiteException sQLiteException = e2;
                        sQLiteDatabase = x;
                        obj = sQLiteException;
                    } catch (Throwable th2) {
                        Throwable th3 = th2;
                        sQLiteDatabase = x;
                        th = th3;
                    }
                } else {
                    x.beginTransaction();
                    Cursor query = x.query("messages", new String[]{"rowid", "type", "entry"}, null, null, null, null, "rowid asc", Integer.toString(i));
                    long j = -1;
                    while (query.moveToNext()) {
                        long j2 = query.getLong(0);
                        int i5 = query.getInt(1);
                        byte[] blob = query.getBlob(2);
                        Object obj2;
                        if (i5 == 0) {
                            Parcel obtain = Parcel.obtain();
                            try {
                                obtain.unmarshall(blob, 0, blob.length);
                                obtain.setDataPosition(0);
                                obj2 = (ch) ch.CREATOR.createFromParcel(obtain);
                                if (obj2 != null) {
                                    arrayList.add(obj2);
                                }
                            } catch (com.google.android.gms.common.internal.safeparcel.b.a e3) {
                                obj2 = u().x();
                                obj2.a("Failed to load event from local database");
                                j = j2;
                            } finally {
                                obtain.recycle();
                            }
                        } else if (i5 == 1) {
                            Parcel obtain2 = Parcel.obtain();
                            try {
                                obtain2.unmarshall(blob, 0, blob.length);
                                obtain2.setDataPosition(0);
                                obj2 = (di) di.CREATOR.createFromParcel(obtain2);
                            } catch (com.google.android.gms.common.internal.safeparcel.b.a e4) {
                                obj2 = u().x();
                                obj2.a("Failed to load user property from local database");
                                obj2 = null;
                                if (obj2 != null) {
                                    arrayList.add(obj2);
                                }
                                j = j2;
                            } finally {
                                obtain2.recycle();
                            }
                            if (obj2 != null) {
                                arrayList.add(obj2);
                            }
                        } else {
                            u().x().a("Unknown record type in local database");
                        }
                        j = j2;
                    }
                    query.close();
                    if (x.delete("messages", "rowid <= ?", new String[]{Long.toString(j)}) < arrayList.size()) {
                        u().x().a("Fewer entries removed from local database than expected");
                    }
                    x.setTransactionSuccessful();
                    x.endTransaction();
                    if (x != null) {
                        x.close();
                    }
                    return arrayList;
                }
            } catch (SQLiteFullException e5) {
                obj = e5;
                try {
                    u().x().a("Error reading entries from local database", obj);
                    this.b = true;
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.close();
                        i2 = i3;
                    } else {
                        i2 = i3;
                    }
                    i4++;
                    i3 = i2;
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (SQLiteException e6) {
                obj = e6;
                if (VERSION.SDK_INT < 11 || !(obj instanceof SQLiteDatabaseLockedException)) {
                    if (sQLiteDatabase != null) {
                        if (sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                    }
                    u().x().a("Error reading entries from local database", obj);
                    this.b = true;
                    i2 = i3;
                } else {
                    SystemClock.sleep((long) i3);
                    i2 = i3 + 20;
                }
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                i4++;
                i3 = i2;
            }
        }
        u().z().a("Failed to read events from database in reasonable time");
        return null;
        if (sQLiteDatabase != null) {
            sQLiteDatabase.close();
        }
        throw th;
    }

    protected void a() {
    }

    public boolean a(ch chVar) {
        if (VERSION.SDK_INT < 11) {
            return false;
        }
        Parcel obtain = Parcel.obtain();
        chVar.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return a(0, marshall);
        }
        u().z().a("Event is too long for local database. Sending event directly to service");
        return false;
    }

    public boolean a(di diVar) {
        if (VERSION.SDK_INT < 11) {
            return false;
        }
        Parcel obtain = Parcel.obtain();
        diVar.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return a(1, marshall);
        }
        u().z().a("User property too long for local database. Sending directly to service");
        return false;
    }

    public /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    public /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    public /* bridge */ /* synthetic */ void d() {
        super.d();
    }

    public /* bridge */ /* synthetic */ void e() {
        super.e();
    }

    public /* bridge */ /* synthetic */ bt f() {
        return super.f();
    }

    public /* bridge */ /* synthetic */ bx g() {
        return super.g();
    }

    public /* bridge */ /* synthetic */ da h() {
        return super.h();
    }

    public /* bridge */ /* synthetic */ cl i() {
        return super.i();
    }

    public /* bridge */ /* synthetic */ cb j() {
        return super.j();
    }

    public /* bridge */ /* synthetic */ dc k() {
        return super.k();
    }

    public /* bridge */ /* synthetic */ db l() {
        return super.l();
    }

    public /* bridge */ /* synthetic */ c m() {
        return super.m();
    }

    public /* bridge */ /* synthetic */ Context n() {
        return super.n();
    }

    public /* bridge */ /* synthetic */ cm o() {
        return super.o();
    }

    public /* bridge */ /* synthetic */ bz p() {
        return super.p();
    }

    public /* bridge */ /* synthetic */ dl q() {
        return super.q();
    }

    public /* bridge */ /* synthetic */ ct r() {
        return super.r();
    }

    public /* bridge */ /* synthetic */ de s() {
        return super.s();
    }

    public /* bridge */ /* synthetic */ cu t() {
        return super.t();
    }

    public /* bridge */ /* synthetic */ co u() {
        return super.u();
    }

    public /* bridge */ /* synthetic */ cr v() {
        return super.v();
    }

    public /* bridge */ /* synthetic */ by w() {
        return super.w();
    }

    SQLiteDatabase x() {
        if (VERSION.SDK_INT < 11 || this.b) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.b = true;
        return null;
    }

    boolean y() {
        return n().getDatabasePath(z()).exists();
    }

    String z() {
        return w().P();
    }
}
