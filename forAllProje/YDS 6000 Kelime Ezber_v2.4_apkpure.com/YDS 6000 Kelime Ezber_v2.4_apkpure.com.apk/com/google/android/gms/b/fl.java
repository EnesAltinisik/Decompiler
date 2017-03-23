package com.google.android.gms.b;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.firebase.database.c;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class fl implements ic {
    static final /* synthetic */ boolean a = (!fl.class.desiredAssertionStatus());
    private static final Charset b = Charset.forName("UTF-8");
    private final SQLiteDatabase c;
    private final jb d;
    private boolean e;
    private long f = 0;

    private static class a extends SQLiteOpenHelper {
        static final /* synthetic */ boolean a = (!fl.class.desiredAssertionStatus());

        public a(Context context, String str) {
            super(context, str, null, 2);
        }

        private void a(SQLiteDatabase sQLiteDatabase, String str) {
            String str2 = "DROP TABLE IF EXISTS ";
            String valueOf = String.valueOf(str);
            sQLiteDatabase.execSQL(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("CREATE TABLE serverCache (path TEXT PRIMARY KEY, value BLOB);");
            sQLiteDatabase.execSQL("CREATE TABLE writes (id INTEGER, path TEXT, type TEXT, part INTEGER, node BLOB, UNIQUE (id, part));");
            sQLiteDatabase.execSQL("CREATE TABLE trackedQueries (id INTEGER PRIMARY KEY, path TEXT, queryParams TEXT, lastUse INTEGER, complete INTEGER, active INTEGER);");
            sQLiteDatabase.execSQL("CREATE TABLE trackedKeys (id INTEGER, key TEXT);");
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            if (!a && i2 != 2) {
                throw new AssertionError("Why is onUpgrade() called with a different version?");
            } else if (i <= 1) {
                a(sQLiteDatabase, "serverCache");
                sQLiteDatabase.execSQL("CREATE TABLE serverCache (path TEXT PRIMARY KEY, value BLOB);");
                a(sQLiteDatabase, "complete");
                sQLiteDatabase.execSQL("CREATE TABLE trackedKeys (id INTEGER, key TEXT);");
                sQLiteDatabase.execSQL("CREATE TABLE trackedQueries (id INTEGER PRIMARY KEY, path TEXT, queryParams TEXT, lastUse INTEGER, complete INTEGER, active INTEGER);");
            } else {
                throw new AssertionError("We don't handle upgrading to " + i2);
            }
        }
    }

    public fl(Context context, gq gqVar, String str) {
        try {
            String encode = URLEncoder.encode(str, "utf-8");
            this.d = gqVar.a("Persistence");
            this.c = a(context, encode);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    private int a(gx gxVar, List<String> list, int i) {
        int i2 = i + 1;
        String b = b(gxVar);
        if (((String) list.get(i)).startsWith(b)) {
            while (i2 < list.size() && ((String) list.get(i2)).equals(a(gxVar, i2 - i))) {
                i2++;
            }
            if (i2 < list.size()) {
                String str = (String) list.get(i2);
                String valueOf = String.valueOf(b);
                b = String.valueOf(".part-");
                if (str.startsWith(b.length() != 0 ? valueOf.concat(b) : new String(valueOf))) {
                    throw new IllegalStateException("Run did not finish with all parts");
                }
            }
            return i2 - i;
        }
        throw new IllegalStateException("Extracting split nodes needs to start with path prefix");
    }

    private int a(String str, gx gxVar) {
        String a = a(b(gxVar));
        return this.c.delete(str, "path >= ? AND path < ?", new String[]{r1, a});
    }

    private Cursor a(gx gxVar, String[] strArr) {
        String b = b(gxVar);
        String a = a(b);
        String[] strArr2 = new String[(gxVar.i() + 3)];
        String valueOf = String.valueOf(b(gxVar, strArr2));
        String valueOf2 = String.valueOf(" OR (path > ? AND path < ?)");
        valueOf2 = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        strArr2[gxVar.i() + 1] = b;
        strArr2[gxVar.i() + 2] = a;
        return this.c.query("serverCache", strArr, valueOf2, strArr2, null, null, "path");
    }

    private SQLiteDatabase a(Context context, String str) {
        try {
            SQLiteDatabase writableDatabase = new a(context, str).getWritableDatabase();
            writableDatabase.rawQuery("PRAGMA locking_mode = EXCLUSIVE", null).close();
            writableDatabase.beginTransaction();
            writableDatabase.endTransaction();
            return writableDatabase;
        } catch (Throwable e) {
            if (e instanceof SQLiteDatabaseLockedException) {
                throw new c("Failed to gain exclusive lock to Firebase Database's offline persistence. This generally means you are using Firebase Database from multiple processes in your app. Keep in mind that multi-process Android apps execute the code in your Application class in all processes, so you may need to avoid initializing FirebaseDatabase in your Application class. If you are intentionally using Firebase Database from multiple processes, you can only enable offline persistence (i.e. call setPersistenceEnabled(true)) in one of them.", e);
            }
            throw e;
        }
    }

    private jr a(gx gxVar) {
        List arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        long currentTimeMillis = System.currentTimeMillis();
        Cursor a = a(gxVar, new String[]{"path", "value"});
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        long currentTimeMillis3 = System.currentTimeMillis();
        while (a.moveToNext()) {
            try {
                arrayList.add(a.getString(0));
                arrayList2.add(a.getBlob(1));
            } finally {
                a.close();
            }
        }
        long currentTimeMillis4 = System.currentTimeMillis() - currentTimeMillis3;
        long currentTimeMillis5 = System.currentTimeMillis();
        jr f = jj.f();
        Object obj = null;
        Map hashMap = new HashMap();
        int i = 0;
        while (i < arrayList2.size()) {
            int a2;
            gx gxVar2;
            jr a3;
            Object obj2;
            jr jrVar;
            if (((String) arrayList.get(i)).endsWith(".part-0000")) {
                String str = (String) arrayList.get(i);
                gx gxVar3 = new gx(str.substring(0, str.length() - ".part-0000".length()));
                a2 = a(gxVar3, arrayList, i);
                if (this.d.a()) {
                    this.d.a("Loading split node with " + a2 + " parts.", new Object[0]);
                }
                byte[] a4 = a(arrayList2.subList(i, i + a2));
                a2 = (i + a2) - 1;
                gxVar2 = gxVar3;
                a3 = a(a4);
            } else {
                jr a5 = a((byte[]) arrayList2.get(i));
                gx gxVar4 = new gx((String) arrayList.get(i));
                a3 = a5;
                a2 = i;
                gxVar2 = gxVar4;
            }
            if (gxVar2.g() != null && gxVar2.g().e()) {
                hashMap.put(gxVar2, a3);
                obj2 = obj;
                jrVar = f;
            } else if (gxVar2.b(gxVar)) {
                kt.a(obj == null, "Descendants of path must come after ancestors.");
                Object obj3 = obj;
                jrVar = a3.a(gx.a(gxVar2, gxVar));
                obj2 = obj3;
            } else if (gxVar.b(gxVar2)) {
                obj2 = 1;
                jrVar = f.a(gx.a(gxVar, gxVar2), a3);
            } else {
                throw new IllegalStateException(String.format("Loading an unrelated row with path %s for %s", new Object[]{gxVar2, gxVar}));
            }
            i = a2 + 1;
            f = jrVar;
            obj = obj2;
        }
        for (Entry entry : hashMap.entrySet()) {
            f = f.a(gx.a(gxVar, (gx) entry.getKey()), (jr) entry.getValue());
        }
        long currentTimeMillis6 = System.currentTimeMillis() - currentTimeMillis5;
        long currentTimeMillis7 = System.currentTimeMillis() - currentTimeMillis;
        if (this.d.a()) {
            this.d.a(String.format("Loaded a total of %d rows for a total of %d nodes at %s in %dms (Query: %dms, Loading: %dms, Serializing: %dms)", new Object[]{Integer.valueOf(arrayList2.size()), Integer.valueOf(kp.b(f)), gxVar, Long.valueOf(currentTimeMillis7), Long.valueOf(currentTimeMillis2), Long.valueOf(currentTimeMillis4), Long.valueOf(currentTimeMillis6)}), new Object[0]);
        }
        return f;
    }

    private jr a(byte[] bArr) {
        try {
            return js.a(kk.b(new String(bArr, b)));
        } catch (Throwable e) {
            Throwable th = e;
            String str = "Could not deserialize node: ";
            String valueOf = String.valueOf(new String(bArr, b));
            throw new RuntimeException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), th);
        }
    }

    private String a(gx gxVar, int i) {
        String valueOf = String.valueOf(b(gxVar));
        String valueOf2 = String.valueOf(String.format(".part-%04d", new Object[]{Integer.valueOf(i)}));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    private static String a(String str) {
        if (a || str.endsWith("/")) {
            String valueOf = String.valueOf(str.substring(0, str.length() - 1));
            return new StringBuilder(String.valueOf(valueOf).length() + 1).append(valueOf).append('0').toString();
        }
        throw new AssertionError("Path keys must end with a '/'");
    }

    private String a(Collection<Long> collection) {
        StringBuilder stringBuilder = new StringBuilder();
        Object obj = 1;
        for (Long longValue : collection) {
            long longValue2 = longValue.longValue();
            if (obj == null) {
                stringBuilder.append(",");
            }
            stringBuilder.append(longValue2);
            obj = null;
        }
        return stringBuilder.toString();
    }

    private static List<byte[]> a(byte[] bArr, int i) {
        int length = ((bArr.length - 1) / i) + 1;
        List<byte[]> arrayList = new ArrayList(length);
        for (int i2 = 0; i2 < length; i2++) {
            int min = Math.min(i, bArr.length - (i2 * i));
            Object obj = new byte[min];
            System.arraycopy(bArr, i2 * i, obj, 0, min);
            arrayList.add(obj);
        }
        return arrayList;
    }

    private void a(gx gxVar, long j, String str, byte[] bArr) {
        g();
        this.c.delete("writes", "id = ?", new String[]{String.valueOf(j)});
        if (bArr.length >= 262144) {
            List a = a(bArr, 262144);
            for (int i = 0; i < a.size(); i++) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("id", Long.valueOf(j));
                contentValues.put("path", b(gxVar));
                contentValues.put("type", str);
                contentValues.put("part", Integer.valueOf(i));
                contentValues.put("node", (byte[]) a.get(i));
                this.c.insertWithOnConflict("writes", null, contentValues, 5);
            }
            return;
        }
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("id", Long.valueOf(j));
        contentValues2.put("path", b(gxVar));
        contentValues2.put("type", str);
        contentValues2.put("part", null);
        contentValues2.put("node", bArr);
        this.c.insertWithOnConflict("writes", null, contentValues2, 5);
    }

    private void a(gx gxVar, gx gxVar2, ig<Long> igVar, final ig<Long> igVar2, id idVar, List<kr<gx, jr>> list) {
        if (igVar.b() != null) {
            if (((Integer) idVar.a(Integer.valueOf(0), new com.google.android.gms.b.ig.a<Void, Integer>(this) {
                public Integer a(gx gxVar, Void voidR, Integer num) {
                    return Integer.valueOf(igVar2.e(gxVar) == null ? num.intValue() + 1 : num.intValue());
                }
            })).intValue() > 0) {
                gx a = gxVar.a(gxVar2);
                if (this.d.a()) {
                    this.d.a(String.format("Need to rewrite %d nodes below path %s", new Object[]{Integer.valueOf(r0), a}), new Object[0]);
                }
                final jr a2 = a(a);
                final ig<Long> igVar3 = igVar2;
                final List<kr<gx, jr>> list2 = list;
                final gx gxVar3 = gxVar2;
                idVar.a(null, new com.google.android.gms.b.ig.a<Void, Void>(this) {
                    public Void a(gx gxVar, Void voidR, Void voidR2) {
                        if (igVar3.e(gxVar) == null) {
                            list2.add(new kr(gxVar3.a(gxVar), a2.a(gxVar)));
                        }
                        return null;
                    }
                });
                return;
            }
            return;
        }
        Iterator it = igVar.c().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            je jeVar = (je) entry.getKey();
            id a3 = idVar.a((je) entry.getKey());
            a(gxVar, gxVar2.a(jeVar), (ig) entry.getValue(), igVar2.a(jeVar), a3, list);
        }
    }

    private void a(gx gxVar, jr jrVar, boolean z) {
        int i;
        int i2;
        long currentTimeMillis = System.currentTimeMillis();
        if (z) {
            i = 0;
            i2 = 0;
            for (jq jqVar : jrVar) {
                i2 += a("serverCache", gxVar.a(jqVar.a()));
                i = c(gxVar.a(jqVar.a()), jqVar.b()) + i;
            }
        } else {
            i2 = a("serverCache", gxVar);
            i = c(gxVar, jrVar);
        }
        currentTimeMillis = System.currentTimeMillis() - currentTimeMillis;
        if (this.d.a()) {
            this.d.a(String.format("Persisted a total of %d rows and deleted %d rows for a set at %s in %dms", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), gxVar.toString(), Long.valueOf(currentTimeMillis)}), new Object[0]);
        }
    }

    private byte[] a(Object obj) {
        try {
            return kk.a(obj).getBytes(b);
        } catch (Throwable e) {
            throw new RuntimeException("Could not serialize leaf node", e);
        }
    }

    private byte[] a(List<byte[]> list) {
        int i = 0;
        for (byte[] length : list) {
            i = length.length + i;
        }
        Object obj = new byte[i];
        i = 0;
        for (byte[] length2 : list) {
            System.arraycopy(length2, 0, obj, i, length2.length);
            i = length2.length + i;
        }
        return obj;
    }

    private static String b(gx gxVar) {
        return gxVar.h() ? "/" : String.valueOf(gxVar.toString()).concat("/");
    }

    private static String b(gx gxVar, String[] strArr) {
        if (a || strArr.length >= gxVar.i() + 1) {
            int i = 0;
            StringBuilder stringBuilder = new StringBuilder("(");
            while (!gxVar.h()) {
                stringBuilder.append("path");
                stringBuilder.append(" = ? OR ");
                strArr[i] = b(gxVar);
                gxVar = gxVar.f();
                i++;
            }
            stringBuilder.append("path");
            stringBuilder.append(" = ?)");
            strArr[i] = b(gx.a());
            return stringBuilder.toString();
        }
        throw new AssertionError();
    }

    private int c(gx gxVar, jr jrVar) {
        long a = kp.a(jrVar);
        if (!(jrVar instanceof jf) || a <= 16384) {
            d(gxVar, jrVar);
            return 1;
        }
        if (this.d.a()) {
            this.d.a(String.format("Node estimated serialized size at path %s of %d bytes exceeds limit of %d bytes. Splitting up.", new Object[]{gxVar, Long.valueOf(a), Integer.valueOf(16384)}), new Object[0]);
        }
        int i = 0;
        for (jq jqVar : jrVar) {
            i = c(gxVar.a(jqVar.a()), jqVar.b()) + i;
        }
        if (!jrVar.e().b()) {
            d(gxVar.a(je.c()), jrVar.e());
            i++;
        }
        d(gxVar, jj.f());
        return i + 1;
    }

    private void d(gx gxVar, jr jrVar) {
        byte[] a = a(jrVar.a(true));
        if (a.length >= 262144) {
            List a2 = a(a, 262144);
            if (this.d.a()) {
                this.d.a("Saving huge leaf node with " + a2.size() + " parts.", new Object[0]);
            }
            for (int i = 0; i < a2.size(); i++) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("path", a(gxVar, i));
                contentValues.put("value", (byte[]) a2.get(i));
                this.c.insertWithOnConflict("serverCache", null, contentValues, 5);
            }
            return;
        }
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("path", b(gxVar));
        contentValues2.put("value", a);
        this.c.insertWithOnConflict("serverCache", null, contentValues2, 5);
    }

    private void g() {
        kt.a(this.e, "Transaction expected to already be in progress.");
    }

    public List<hl> a() {
        String[] strArr = new String[]{"id", "path", "type", "part", "node"};
        long currentTimeMillis = System.currentTimeMillis();
        Cursor query = this.c.query("writes", strArr, null, null, null, null, "id, part");
        List<hl> arrayList = new ArrayList();
        while (query.moveToNext()) {
            try {
                byte[] blob;
                Object hlVar;
                long j = query.getLong(0);
                gx gxVar = new gx(query.getString(1));
                String string = query.getString(2);
                if (query.isNull(3)) {
                    blob = query.getBlob(4);
                } else {
                    List arrayList2 = new ArrayList();
                    do {
                        arrayList2.add(query.getBlob(4));
                        if (!query.moveToNext()) {
                            break;
                        }
                    } while (query.getLong(0) == j);
                    query.moveToPrevious();
                    blob = a(arrayList2);
                }
                Object b = kk.b(new String(blob, b));
                if ("o".equals(string)) {
                    hlVar = new hl(j, gxVar, js.a(b), true);
                } else if ("m".equals(string)) {
                    hlVar = new hl(j, gxVar, go.a((Map) b));
                } else {
                    String str = "Got invalid write type: ";
                    String valueOf = String.valueOf(string);
                    throw new IllegalStateException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                }
                arrayList.add(hlVar);
            } catch (Throwable e) {
                throw new RuntimeException("Failed to load writes", e);
            } catch (Throwable th) {
                query.close();
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.d.a()) {
            this.d.a(String.format("Loaded %d writes in %dms", new Object[]{Integer.valueOf(arrayList.size()), Long.valueOf(currentTimeMillis2)}), new Object[0]);
        }
        query.close();
        return arrayList;
    }

    public void a(long j) {
        g();
        long currentTimeMillis = System.currentTimeMillis();
        int delete = this.c.delete("writes", "id = ?", new String[]{String.valueOf(j)});
        currentTimeMillis = System.currentTimeMillis() - currentTimeMillis;
        if (this.d.a()) {
            this.d.a(String.format("Deleted %d write(s) with writeId %d in %dms", new Object[]{Integer.valueOf(delete), Long.valueOf(j), Long.valueOf(currentTimeMillis)}), new Object[0]);
        }
    }

    public void a(long j, Set<je> set, Set<je> set2) {
        g();
        long currentTimeMillis = System.currentTimeMillis();
        String str = "id = ? AND key = ?";
        String valueOf = String.valueOf(j);
        for (je jeVar : set2) {
            this.c.delete("trackedKeys", str, new String[]{valueOf, jeVar.d()});
        }
        for (je jeVar2 : set) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Long.valueOf(j));
            contentValues.put("key", jeVar2.d());
            this.c.insertWithOnConflict("trackedKeys", null, contentValues, 5);
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.d.a()) {
            this.d.a(String.format("Updated tracked query keys (%d added, %d removed) for tracked query id %d in %dms", new Object[]{Integer.valueOf(set.size()), Integer.valueOf(set2.size()), Long.valueOf(j), Long.valueOf(currentTimeMillis2)}), new Object[0]);
        }
    }

    public void a(gx gxVar, go goVar) {
        g();
        long currentTimeMillis = System.currentTimeMillis();
        Iterator it = goVar.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            i += a("serverCache", gxVar.a((gx) entry.getKey()));
            i2 = c(gxVar.a((gx) entry.getKey()), (jr) entry.getValue()) + i2;
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.d.a()) {
            this.d.a(String.format("Persisted a total of %d rows and deleted %d rows for a merge at %s in %dms", new Object[]{Integer.valueOf(i2), Integer.valueOf(i), gxVar.toString(), Long.valueOf(currentTimeMillis2)}), new Object[0]);
        }
    }

    public void a(gx gxVar, go goVar, long j) {
        g();
        long currentTimeMillis = System.currentTimeMillis();
        gx gxVar2 = gxVar;
        long j2 = j;
        a(gxVar2, j2, "m", a(goVar.a(true)));
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.d.a()) {
            this.d.a(String.format("Persisted user merge in %dms", new Object[]{Long.valueOf(currentTimeMillis2)}), new Object[0]);
        }
    }

    public void a(gx gxVar, id idVar) {
        if (idVar.a()) {
            g();
            long currentTimeMillis = System.currentTimeMillis();
            Cursor a = a(gxVar, new String[]{"rowid", "path"});
            ig igVar = new ig(null);
            ig igVar2 = new ig(null);
            while (a.moveToNext()) {
                long j = a.getLong(0);
                gx gxVar2 = new gx(a.getString(1));
                jb jbVar;
                String valueOf;
                String valueOf2;
                if (gxVar.b(gxVar2)) {
                    gx a2 = gx.a(gxVar, gxVar2);
                    if (idVar.a(a2)) {
                        igVar = igVar.a(a2, Long.valueOf(j));
                    } else if (idVar.b(a2)) {
                        igVar2 = igVar2.a(a2, Long.valueOf(j));
                    } else {
                        jbVar = this.d;
                        valueOf = String.valueOf(gxVar);
                        valueOf2 = String.valueOf(gxVar2);
                        jbVar.a(new StringBuilder((String.valueOf(valueOf).length() + 88) + String.valueOf(valueOf2).length()).append("We are pruning at ").append(valueOf).append(" and have data at ").append(valueOf2).append(" that isn't marked for pruning or keeping. Ignoring.").toString());
                    }
                } else {
                    jbVar = this.d;
                    valueOf = String.valueOf(gxVar);
                    valueOf2 = String.valueOf(gxVar2);
                    jbVar.a(new StringBuilder((String.valueOf(valueOf).length() + 67) + String.valueOf(valueOf2).length()).append("We are pruning at ").append(valueOf).append(" but we have data stored higher up at ").append(valueOf2).append(". Ignoring.").toString());
                }
            }
            int i = 0;
            int i2 = 0;
            if (!igVar.d()) {
                List<kr> arrayList = new ArrayList();
                a(gxVar, gx.a(), igVar, igVar2, idVar, arrayList);
                Collection e = igVar.e();
                String valueOf3 = String.valueOf(a(e));
                this.c.delete("serverCache", new StringBuilder(String.valueOf(valueOf3).length() + 11).append("rowid IN (").append(valueOf3).append(")").toString(), null);
                for (kr krVar : arrayList) {
                    c(gxVar.a((gx) krVar.a()), (jr) krVar.b());
                }
                i = e.size();
                i2 = arrayList.size();
            }
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            if (this.d.a()) {
                this.d.a(String.format("Pruned %d rows with %d nodes resaved in %dms", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(currentTimeMillis2)}), new Object[0]);
            }
        }
    }

    public void a(gx gxVar, jr jrVar) {
        g();
        a(gxVar, jrVar, false);
    }

    public void a(gx gxVar, jr jrVar, long j) {
        g();
        long currentTimeMillis = System.currentTimeMillis();
        gx gxVar2 = gxVar;
        long j2 = j;
        a(gxVar2, j2, "o", a(jrVar.a(true)));
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.d.a()) {
            this.d.a(String.format("Persisted user overwrite in %dms", new Object[]{Long.valueOf(currentTimeMillis2)}), new Object[0]);
        }
    }

    public void a(ie ieVar) {
        g();
        long currentTimeMillis = System.currentTimeMillis();
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Long.valueOf(ieVar.a));
        contentValues.put("path", b(ieVar.b.a()));
        contentValues.put("queryParams", ieVar.b.b().h());
        contentValues.put("lastUse", Long.valueOf(ieVar.c));
        contentValues.put("complete", Boolean.valueOf(ieVar.d));
        contentValues.put("active", Boolean.valueOf(ieVar.e));
        this.c.insertWithOnConflict("trackedQueries", null, contentValues, 5);
        currentTimeMillis = System.currentTimeMillis() - currentTimeMillis;
        if (this.d.a()) {
            this.d.a(String.format("Saved new tracked query in %dms", new Object[]{Long.valueOf(currentTimeMillis)}), new Object[0]);
        }
    }

    public long b() {
        long j = null;
        Cursor rawQuery = this.c.rawQuery(String.format("SELECT sum(length(%s) + length(%s)) FROM %s", new Object[]{"value", "path", "serverCache"}), null);
        try {
            if (rawQuery.moveToFirst()) {
                j = rawQuery.getLong(0);
                return j;
            }
            throw new IllegalStateException("Couldn't read database result!");
        } finally {
            rawQuery.close();
        }
    }

    public void b(long j) {
        g();
        String valueOf = String.valueOf(j);
        this.c.delete("trackedQueries", "id = ?", new String[]{valueOf});
        this.c.delete("trackedKeys", "id = ?", new String[]{valueOf});
    }

    public void b(gx gxVar, jr jrVar) {
        g();
        a(gxVar, jrVar, true);
    }

    public List<ie> c() {
        String[] strArr = new String[]{"id", "path", "queryParams", "lastUse", "complete", "active"};
        long currentTimeMillis = System.currentTimeMillis();
        Cursor query = this.c.query("trackedQueries", strArr, null, null, null, null, "id");
        List<ie> arrayList = new ArrayList();
        while (query.moveToNext()) {
            try {
                arrayList.add(new ie(query.getLong(0), it.a(new gx(query.getString(1)), kk.a(query.getString(2))), query.getLong(3), query.getInt(4) != 0, query.getInt(5) != 0));
            } catch (Throwable e) {
                throw new RuntimeException(e);
            } catch (Throwable th) {
                query.close();
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.d.a()) {
            this.d.a(String.format("Loaded %d tracked queries in %dms", new Object[]{Integer.valueOf(arrayList.size()), Long.valueOf(currentTimeMillis2)}), new Object[0]);
        }
        query.close();
        return arrayList;
    }

    public void c(long j) {
        g();
        long currentTimeMillis = System.currentTimeMillis();
        ContentValues contentValues = new ContentValues();
        contentValues.put("active", Boolean.valueOf(false));
        contentValues.put("lastUse", Long.valueOf(j));
        this.c.updateWithOnConflict("trackedQueries", contentValues, "active = 1", new String[0], 5);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.d.a()) {
            this.d.a(String.format("Reset active tracked queries in %dms", new Object[]{Long.valueOf(currentTimeMillis2)}), new Object[0]);
        }
    }

    public void d() {
        kt.a(!this.e, "runInTransaction called when an existing transaction is already in progress.");
        if (this.d.a()) {
            this.d.a("Starting transaction.", new Object[0]);
        }
        this.c.beginTransaction();
        this.e = true;
        this.f = System.currentTimeMillis();
    }

    public void e() {
        this.c.endTransaction();
        this.e = false;
        long currentTimeMillis = System.currentTimeMillis() - this.f;
        if (this.d.a()) {
            this.d.a(String.format("Transaction completed. Elapsed: %dms", new Object[]{Long.valueOf(currentTimeMillis)}), new Object[0]);
        }
    }

    public void f() {
        this.c.setTransactionSuccessful();
    }
}
