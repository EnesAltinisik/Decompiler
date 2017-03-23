package com.fodlam.yds.c;

import android.content.Context;
import android.util.Log;
import com.fodlam.yds.OxfordApplication;
import com.fodlam.yds.f.c;
import com.fodlam.yds.f.d;
import com.fodlam.yds.f.e;
import com.fodlam.yds.f.g;
import com.fodlam.yds.f.h;
import com.fodlam.yds.f.h.a;
import com.google.firebase.crash.FirebaseCrash;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import net.sqlcipher.Cursor;
import net.sqlcipher.database.SQLiteDatabase;

public class b {
    public static String a = "applaudme.mp3";
    public static String b = "applaudme.mp3";
    static b c = null;
    private static String g;
    SQLiteDatabase d;
    Context e;
    com.fodlam.yds.f.b[] f;

    static {
        g = "";
        g = "/data/data/com.fodlam.yds/databases/";
    }

    private b(Context context, boolean z) {
        this.e = context;
        SQLiteDatabase.loadLibs(context);
        File file = new File(g + a);
        if (!file.exists()) {
            m();
        }
        if (file.exists()) {
            this.d = SQLiteDatabase.openDatabase(new File(g + a).getAbsolutePath(), "com.fodlam.yds", null, 0);
        }
        if (z) {
            try {
                l();
            } catch (Exception e) {
                FirebaseCrash.a(e.getMessage());
            }
        }
    }

    public static synchronized b a() {
        b bVar;
        synchronized (b.class) {
            bVar = c;
        }
        return bVar;
    }

    public static synchronized b a(Context context, boolean z) {
        b bVar;
        synchronized (b.class) {
            if (c == null) {
                c = new b(context, z);
            }
            bVar = c;
        }
        return bVar;
    }

    private void l() {
        Object obj;
        this.f = new com.fodlam.yds.f.b[4];
        this.f[0] = new com.fodlam.yds.f.b("Yeni Başlayan", true, 0);
        this.f[1] = new com.fodlam.yds.f.b("Orta", true, 1);
        this.f[2] = new com.fodlam.yds.f.b("İleri", true, 2);
        this.f[3] = new c("Favori Kelimeler", true, 3);
        HashMap e = a.a(this.e).e();
        HashSet b = a.a(this.e).b();
        Cursor query = this.d.query("word", new String[]{"id", "category", "categoryorder", "word", "type", "def_en", "def_tr", "test"}, null, null, null, null, "id");
        if (query.moveToFirst()) {
            Object obj2 = null;
            while (true) {
                h hVar = new h(query.getInt(0), query.getInt(1), query.getInt(2), query.getString(3).toLowerCase(Locale.ENGLISH), query.getString(4), query.getString(5), query.getString(6).toLowerCase(), query.getInt(7));
                hVar.l = (e) e.get(Integer.valueOf(hVar.c));
                if (hVar.l == null) {
                    hVar.l = new e(hVar);
                    e.put(Integer.valueOf(hVar.c), hVar.l);
                    obj = 1;
                } else {
                    obj = obj2;
                }
                hVar.b(b.contains(Integer.valueOf(hVar.c)));
                this.f[hVar.d].a(hVar);
                if (hVar.a()) {
                    a(hVar, true);
                }
                if (!query.moveToNext()) {
                    break;
                }
                obj2 = obj;
            }
        } else {
            obj = null;
        }
        query.close();
        if (obj != null) {
            a.a(this.e).a(e);
        }
        for (int i = 0; i < 3; i++) {
            this.f[i].g();
        }
    }

    private void m() {
        try {
            new File(g).mkdirs();
            String str = g + a;
            InputStream open = this.e.getResources().getAssets().open(b);
            OutputStream fileOutputStream = new FileOutputStream(str);
            byte[] bArr = new byte[open.available()];
            open.read(bArr);
            fileOutputStream.write(bArr);
            fileOutputStream.close();
            open.close();
        } catch (Exception e) {
            Log.e("TestDatabase :", e.getLocalizedMessage());
        }
    }

    public h a(int i) {
        com.fodlam.yds.f.b bVar = this.f[(i + 1) % 3];
        return bVar.a(com.fodlam.yds.utility.c.c(bVar.d())).e();
    }

    public void a(h hVar) {
        a.a(this.e).b(hVar);
        ((c) this.f[3]).b(hVar);
    }

    public void a(h hVar, boolean z) {
        if (!z) {
            a.a(this.e).a(hVar);
        }
        this.f[3].a(hVar);
    }

    public void a(Set<String> set) {
        if (set != null && !set.isEmpty()) {
            a a = a.a(null);
            Iterator it = c().iterator();
            while (it.hasNext()) {
                h hVar = (h) it.next();
                for (String split : set) {
                    String[] split2 = split.split("--");
                    if (hVar.h.equals(split2[0])) {
                        a.a(hVar.c, new a(split2[1], split2.length == 3 ? split2[2] : ""));
                    }
                }
            }
        }
    }

    public g b() {
        return this.f[OxfordApplication.g].a(OxfordApplication.i);
    }

    public void b(int i) {
        this.f[i].c = true;
        this.f[i].g();
    }

    public com.fodlam.yds.f.b c(int i) {
        return this.f[i];
    }

    public ArrayList<h> c() {
        Object arrayList = new ArrayList();
        for (int i = 0; i < 3; i++) {
            arrayList.addAll(this.f[i].e());
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public String d(int i) {
        String str = "";
        Cursor query = this.d.query("wordnet", new String[]{"definition"}, "id=?", new String[]{i + ""}, null, null, null);
        String string = query.moveToFirst() ? query.getString(0) : str;
        query.close();
        return string;
    }

    public ArrayList<h> d() {
        return this.f[OxfordApplication.g].f();
    }

    public h e() {
        int i = 0;
        h hVar = new h();
        hVar.h = "Test";
        hVar.k = "Test";
        try {
            if (OxfordApplication.g != 3) {
                i = OxfordApplication.g;
            }
            int c = (OxfordApplication.j * 15) + com.fodlam.yds.utility.c.c(15);
            Cursor query = this.d.query("word", new String[]{"id", "category", "categoryorder", "word", "type", "def_en", "def_tr", "test"}, "category =? and categoryorder=?", new String[]{"" + i, "" + c}, null, null, null);
            h hVar2 = query.moveToFirst() ? new h(query.getInt(0), query.getInt(1), query.getInt(2), query.getString(3).toLowerCase(), query.getString(4), query.getString(5), query.getString(6).toLowerCase(), query.getInt(7)) : hVar;
            try {
                query.close();
                return hVar2;
            } catch (Exception e) {
                return hVar2;
            }
        } catch (Exception e2) {
            return hVar;
        }
    }

    public h f() {
        int i = ((OxfordApplication.g * 1020) + (OxfordApplication.j * 15)) + 15;
        Cursor query = this.d.query("word", new String[]{"id", "category", "categoryorder", "word", "type", "def_en", "def_tr", "test"}, "id =?", new String[]{"" + com.fodlam.yds.utility.c.c(i)}, null, null, null);
        h hVar = query.moveToFirst() ? new h(query.getInt(0), query.getInt(1), query.getInt(2), query.getString(3).toLowerCase(), query.getString(4), query.getString(5), query.getString(6).toLowerCase(), query.getInt(7)) : null;
        query.close();
        return hVar;
    }

    public com.fodlam.yds.f.b g() {
        return this.f[OxfordApplication.g];
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void h() {
        /*
        r1 = this;
        monitor-enter(r1);
        r0 = 0;
        r1.f = r0;	 Catch:{ Exception -> 0x0016, all -> 0x0013 }
        r0 = 0;
        c = r0;	 Catch:{ Exception -> 0x0016, all -> 0x0013 }
        r0 = r1.d;	 Catch:{ Exception -> 0x0016, all -> 0x0013 }
        r0.close();	 Catch:{ Exception -> 0x0016, all -> 0x0013 }
    L_0x000c:
        net.sqlcipher.database.SQLiteDatabase.releaseMemory();	 Catch:{ Exception -> 0x0011, all -> 0x0013 }
    L_0x000f:
        monitor-exit(r1);
        return;
    L_0x0011:
        r0 = move-exception;
        goto L_0x000f;
    L_0x0013:
        r0 = move-exception;
        monitor-exit(r1);
        throw r0;
    L_0x0016:
        r0 = move-exception;
        goto L_0x000c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fodlam.yds.c.b.h():void");
    }

    public ArrayList<d> i() {
        ArrayList<d> arrayList = new ArrayList();
        ArrayList f = b().f();
        Collections.shuffle(f);
        for (int i = 0; i < f.size(); i++) {
            int i2;
            int size;
            ArrayList arrayList2 = new ArrayList();
            for (i2 = 0; i2 < f.size(); i2++) {
                if (i2 != i) {
                    arrayList2.add(f.get(i2));
                }
            }
            Collections.shuffle(arrayList2);
            Object arrayList3 = new ArrayList();
            for (i2 = 0; i2 < Math.min(arrayList2.size(), 4); i2++) {
                arrayList3.add(arrayList2.get(i2));
            }
            for (size = arrayList3.size(); size < 4; size++) {
                arrayList3.add(a(((h) f.get(i)).d));
            }
            Collections.shuffle(arrayList3);
            int c = com.fodlam.yds.utility.c.c(4);
            h[] hVarArr = new h[4];
            for (size = 0; size < hVarArr.length; size++) {
                hVarArr[size] = (h) arrayList3.get(size);
            }
            hVarArr[c] = (h) f.get(i);
            arrayList.add(new d(hVarArr, c));
        }
        if (OxfordApplication.f) {
            arrayList.add(arrayList.size() / 2, new d());
        }
        return arrayList;
    }

    public void j() {
        ((c) this.f[3]).j();
    }

    public ArrayList<h> k() {
        ArrayList<h> arrayList = new ArrayList();
        ArrayList c = c();
        HashSet i = a.a(this.e).i();
        Iterator it = c.iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            if (i.contains(Integer.valueOf(hVar.c))) {
                arrayList.add(hVar);
            }
        }
        return arrayList;
    }
}
