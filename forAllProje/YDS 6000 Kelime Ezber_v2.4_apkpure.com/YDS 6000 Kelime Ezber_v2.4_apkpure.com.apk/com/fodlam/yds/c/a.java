package com.fodlam.yds.c;

import android.content.ContentValues;
import android.content.Context;
import android.util.Log;
import com.fodlam.yds.f.e;
import com.fodlam.yds.f.f;
import com.fodlam.yds.f.h;
import com.fodlam.yds.utility.c;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import net.sqlcipher.Cursor;
import net.sqlcipher.database.SQLiteDatabase;
import net.sqlcipher.database.SQLiteOpenHelper;

public class a extends SQLiteOpenHelper {
    public static final String[] a = new String[]{"id", "category", "categoryorder", "learning", "chooseword", "findword", "listen", "listenandchoose", "matchword", "listenandwrite", "writeword", "issent"};
    public static final String[] b = new String[]{"day", "duration", "memocount", "rightanswer", "wronganswer"};
    private static a e = null;
    HashMap<Integer, e> c = null;
    HashMap<String, f> d = null;

    private a(Context context) {
        super(context, "user.sqlite3", null, 1);
        SQLiteDatabase.loadLibs(context);
        this.c = k();
        d();
        c().execSQL("CREATE TABLE if not exists favourite  (\n id Integer NOT NULL,\n PRIMARY KEY(id)\n)");
    }

    public static synchronized a a(Context context) {
        a aVar;
        synchronized (a.class) {
            if (e == null) {
                e = new a(context);
            }
            aVar = e;
        }
        return aVar;
    }

    private HashMap<String, f> j() {
        HashMap<String, f> hashMap = new HashMap();
        Cursor rawQuery = c().rawQuery("SELECT * FROM statistic", null);
        if (rawQuery.moveToFirst()) {
            do {
                f fVar = new f(rawQuery.getString(0), rawQuery.getInt(1), rawQuery.getInt(2), rawQuery.getInt(3), rawQuery.getInt(4));
                hashMap.put(fVar.a, fVar);
            } while (rawQuery.moveToNext());
        }
        rawQuery.close();
        return hashMap;
    }

    private HashMap<Integer, e> k() {
        HashMap<Integer, e> hashMap = new HashMap();
        Cursor rawQuery = c().rawQuery("SELECT * FROM score", null);
        if (rawQuery.moveToFirst()) {
            do {
                e eVar = new e(rawQuery.getInt(0), rawQuery.getInt(1), rawQuery.getInt(2));
                for (int i = 3; i < 11; i++) {
                    eVar.a(a[i], rawQuery.getInt(i));
                }
                hashMap.put(Integer.valueOf(eVar.a), eVar);
            } while (rawQuery.moveToNext());
        }
        rawQuery.close();
        return hashMap;
    }

    public int a(e eVar) {
        SQLiteDatabase c = c();
        ContentValues contentValues = new ContentValues();
        for (Entry entry : eVar.a()) {
            contentValues.put((String) entry.getKey(), (Integer) entry.getValue());
        }
        return c.update("score", contentValues, "id = ?", new String[]{String.valueOf(eVar.a)});
    }

    public long a(int i, com.fodlam.yds.f.h.a aVar) {
        try {
            SQLiteDatabase c = c();
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Integer.valueOf(i));
            contentValues.put("sent_en", aVar.b);
            contentValues.put("sent_tr", aVar.a);
            return c.insert("sentence", null, contentValues);
        } catch (Exception e) {
            Log.e("Oxford", e.getMessage());
            return 0;
        }
    }

    public f a(String str) {
        f fVar = null;
        if (this.d.containsKey(str)) {
            return (f) this.d.get(str);
        }
        Cursor rawQuery = c().rawQuery("SELECT * FROM statistic where day='" + str + "';", null);
        if (rawQuery.moveToFirst()) {
            fVar = new f(rawQuery.getString(0), rawQuery.getInt(1), rawQuery.getInt(2), rawQuery.getInt(3), rawQuery.getInt(4));
        }
        rawQuery.close();
        return fVar;
    }

    public void a() {
        this.c = null;
        this.d = null;
        close();
        SQLiteDatabase.releaseMemory();
        e = null;
    }

    public void a(f fVar) {
        SQLiteDatabase c = c();
        ContentValues contentValues = new ContentValues();
        contentValues.put("day", fVar.a);
        contentValues.put(b[1], Integer.valueOf(fVar.b));
        contentValues.put(b[2], Integer.valueOf(fVar.c));
        contentValues.put(b[3], Integer.valueOf(fVar.d));
        contentValues.put(b[4], Integer.valueOf(fVar.e));
        c.insert("statistic", null, contentValues);
        c.close();
        this.d.put(fVar.a, fVar);
    }

    public void a(h hVar) {
        SQLiteDatabase c = c();
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(hVar.c));
        c.insert("favourite", null, contentValues);
        hVar.a(true);
    }

    public void a(HashMap<Integer, e> hashMap) {
        this.c = hashMap;
        Collection<e> values = hashMap.values();
        SQLiteDatabase c = c();
        c.beginTransaction();
        for (e eVar : values) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Integer.valueOf(eVar.a));
            contentValues.put("category", Integer.valueOf(eVar.b));
            contentValues.put("categoryOrder", Integer.valueOf(eVar.c));
            for (Entry entry : eVar.a()) {
                contentValues.put((String) entry.getKey(), (Integer) entry.getValue());
            }
            c.insert("score", null, contentValues);
        }
        c.setTransactionSuccessful();
        c.endTransaction();
    }

    public float[] a(int i) {
        Date date = new Date();
        Calendar instance = Calendar.getInstance();
        float[] fArr = new float[i];
        for (int i2 = (-i) + 1; i2 <= 0; i2++) {
            instance.setTime(date);
            instance.add(5, i2);
            f a = a(c.a(instance.getTime()));
            if (a != null) {
                fArr[-i2] = (float) a.c;
            }
        }
        return fArr;
    }

    public float b(String str) {
        f a = a(str);
        if (a == null || a.d + a.e == 0) {
            return -1.0f;
        }
        return ((float) a.d) / (((float) a.e) + (1.0f * ((float) a.d)));
    }

    public int b(f fVar) {
        SQLiteDatabase c = c();
        ContentValues contentValues = new ContentValues();
        contentValues.put(b[1], Integer.valueOf(fVar.b));
        contentValues.put(b[2], Integer.valueOf(fVar.c));
        contentValues.put(b[3], Integer.valueOf(fVar.d));
        contentValues.put(b[4], Integer.valueOf(fVar.e));
        return c.update("statistic", contentValues, "day = ?", new String[]{fVar.a});
    }

    public HashSet<Integer> b() {
        HashSet<Integer> hashSet = new HashSet();
        Cursor rawQuery = c().rawQuery("SELECT id FROM favourite", null);
        if (rawQuery.moveToFirst()) {
            do {
                hashSet.add(Integer.valueOf(rawQuery.getInt(0)));
            } while (rawQuery.moveToNext());
        }
        rawQuery.close();
        return hashSet;
    }

    public void b(h hVar) {
        c().delete("favourite", "id=?", new String[]{"" + hVar.c});
        hVar.a(false);
    }

    public float[] b(int i) {
        Date date = new Date();
        Calendar instance = Calendar.getInstance();
        float[] fArr = new float[i];
        for (int i2 = (-i) + 1; i2 <= 0; i2++) {
            instance.setTime(date);
            instance.add(5, i2);
            f a = a(c.a(instance.getTime()));
            if (a != null) {
                fArr[-i2] = ((float) a.b) / 60.0f;
            }
        }
        return fArr;
    }

    public synchronized SQLiteDatabase c() {
        return super.getWritableDatabase("com.fodlam.yds");
    }

    public HashMap<String, f> d() {
        if (this.d == null) {
            this.d = j();
        }
        return this.d;
    }

    public HashMap<Integer, e> e() {
        if (this.c == null) {
            this.c = k();
        }
        return this.c;
    }

    public f f() {
        String a = c.a(new Date());
        f a2 = a(a);
        if (a2 != null) {
            return a2;
        }
        a2 = new f(a);
        a(a2);
        return a2;
    }

    public float[] g() {
        float[] fArr = new float[4];
        f f = f();
        fArr[0] = (float) (f == null ? 0 : f.c);
        Collection<f> values = this.d.values();
        for (f f2 : values) {
            fArr[3] = fArr[3] + ((float) f2.b);
            fArr[2] = ((float) f2.c) + fArr[2];
        }
        fArr[1] = (fArr[3] / ((float) (values.size() + 1))) / 60.0f;
        fArr[3] = fArr[3] / 3600.0f;
        return fArr;
    }

    public float[] h() {
        float[] fArr = new float[4];
        for (e eVar : this.c.values()) {
            int a = eVar.a(com.fodlam.yds.OxfordApplication.a.LEARNING.c());
            int a2 = eVar.a(com.fodlam.yds.OxfordApplication.a.LISTEN.c());
            int a3 = eVar.a(com.fodlam.yds.OxfordApplication.a.LISTENANDCHOOSE.c());
            int a4 = eVar.a(com.fodlam.yds.OxfordApplication.a.CHOOSEWORD.c());
            int a5 = eVar.a(com.fodlam.yds.OxfordApplication.a.FINDWORD.c());
            int a6 = eVar.a(com.fodlam.yds.OxfordApplication.a.MATCHWORD.c());
            int a7 = eVar.a(com.fodlam.yds.OxfordApplication.a.WRITEWORD.c());
            int a8 = eVar.a(com.fodlam.yds.OxfordApplication.a.LISTENANDWRITE.c());
            fArr[0] = ((float) a) + fArr[0];
            fArr[1] = fArr[1] + ((float) ((a2 + a3) + a8));
            fArr[2] = fArr[2] + ((float) ((a4 + a5) + a6));
            fArr[3] = ((float) (a8 + a7)) + fArr[3];
        }
        fArr[0] = fArr[0] / ((float) (this.c.size() * 1));
        fArr[1] = fArr[1] / ((float) (this.c.size() * 3));
        fArr[2] = fArr[2] / ((float) (this.c.size() * 3));
        fArr[3] = fArr[3] / ((float) (this.c.size() * 2));
        for (a8 = 0; a8 < fArr.length; a8++) {
            fArr[a8] = fArr[a8] * 100.0f;
        }
        return fArr;
    }

    public HashSet<Integer> i() {
        HashSet<Integer> hashSet = new HashSet();
        Cursor query = c().query("sentence", new String[]{"id"}, null, null, null, null, null);
        if (query.moveToFirst()) {
            do {
                hashSet.add(Integer.valueOf(query.getInt(0)));
            } while (query.moveToNext());
        }
        query.close();
        return hashSet;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE score (\n id INTEGER NOT NULL,\n category INTEGER NOT NULL,\n categoryorder INTEGER NOT NULL,\n learning INTEGER,\n chooseword INTEGER,\n findword INTEGER,\n listen INTEGER,\n listenandchoose INTEGER,\n matchword INTEGER,\n listenandwrite INTEGER,\n writeword INTEGER,\n issent INTEGER,\n PRIMARY KEY(id)\n)");
        sQLiteDatabase.execSQL("CREATE TABLE statistic  (\n day TEXT NOT NULL,\n duration INTEGER,\n memocount INTEGER,\n rightanswer INTEGER,\n wronganswer INTEGER,\n PRIMARY KEY(day)\n)");
        sQLiteDatabase.execSQL("CREATE TABLE sentence  (\n id Integer NOT NULL,\n sent_en TEXT NOT NULL,\n sent_tr TEXT, \n PRIMARY KEY(id, sent_en)\n)");
        sQLiteDatabase.execSQL("CREATE TABLE teststate  (\n id Integer NOT NULL,\n category Integer NOT NULL,\n memocount Integer, \n isactive Integer, \n PRIMARY KEY(id, category)\n)");
        sQLiteDatabase.execSQL("CREATE TABLE favourite  (\n id Integer NOT NULL,\n PRIMARY KEY(id)\n)");
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS score");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS statistic");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS sentence");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS teststate");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS favourite");
        onCreate(sQLiteDatabase);
    }
}
