package com.google.android.gms.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.adjust.sdk.Constants;
import com.google.android.gms.internal.zzagi.zza;
import com.google.firebase.analytics.FirebaseAnalytics.Param;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class zzadq implements zzage {
    static final /* synthetic */ boolean $assertionsDisabled = (!zzadq.class.desiredAssertionStatus());
    private static final Charset zzaiI = Charset.forName(Constants.ENCODING);
    private final SQLiteDatabase zzbHU;
    private final zzahf zzbHV;
    private boolean zzbHW;
    private long zzbHX = 0;

    private static class a extends SQLiteOpenHelper {
        static final /* synthetic */ boolean a = (!zzadq.class.desiredAssertionStatus());

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

    public zzadq(Context context, zzaeu com_google_android_gms_internal_zzaeu, String str) {
        try {
            this.zzbHU = new a(context, URLEncoder.encode(str, "utf-8")).getWritableDatabase();
            this.zzbHV = com_google_android_gms_internal_zzaeu.zzib("Persistence");
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    private zzahu zzH(byte[] bArr) {
        try {
            return zzahv.zzaq(zzaim.zzik(new String(bArr, zzaiI)));
        } catch (Throwable e) {
            Throwable th = e;
            String str = "Could not deserialize node: ";
            String valueOf = String.valueOf(new String(bArr, zzaiI));
            throw new RuntimeException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), th);
        }
    }

    private byte[] zzO(List<byte[]> list) {
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

    private void zzPt() {
        zzaiv.zzb(this.zzbHW, "Transaction expected to already be in progress.");
    }

    private int zza(zzafa com_google_android_gms_internal_zzafa, List<String> list, int i) {
        int i2 = i + 1;
        String zzc = zzc(com_google_android_gms_internal_zzafa);
        if (((String) list.get(i)).startsWith(zzc)) {
            while (i2 < list.size() && ((String) list.get(i2)).equals(zza(com_google_android_gms_internal_zzafa, i2 - i))) {
                i2++;
            }
            if (i2 < list.size()) {
                String str = (String) list.get(i2);
                String valueOf = String.valueOf(zzc);
                zzc = String.valueOf(".part-");
                if (str.startsWith(zzc.length() != 0 ? valueOf.concat(zzc) : new String(valueOf))) {
                    throw new IllegalStateException("Run did not finish with all parts");
                }
            }
            return i2 - i;
        }
        throw new IllegalStateException("Extracting split nodes needs to start with path prefix");
    }

    private int zza(String str, zzafa com_google_android_gms_internal_zzafa) {
        String zzhO = zzhO(zzc(com_google_android_gms_internal_zzafa));
        return this.zzbHU.delete(str, "path >= ? AND path < ?", new String[]{r1, zzhO});
    }

    private Cursor zza(zzafa com_google_android_gms_internal_zzafa, String[] strArr) {
        String zzc = zzc(com_google_android_gms_internal_zzafa);
        String zzhO = zzhO(zzc);
        String[] strArr2 = new String[(com_google_android_gms_internal_zzafa.size() + 3)];
        String valueOf = String.valueOf(zzb(com_google_android_gms_internal_zzafa, strArr2));
        String valueOf2 = String.valueOf(" OR (path > ? AND path < ?)");
        valueOf2 = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        strArr2[com_google_android_gms_internal_zzafa.size() + 1] = zzc;
        strArr2[com_google_android_gms_internal_zzafa.size() + 2] = zzhO;
        return this.zzbHU.query("serverCache", strArr, valueOf2, strArr2, null, null, "path");
    }

    private String zza(zzafa com_google_android_gms_internal_zzafa, int i) {
        String valueOf = String.valueOf(zzc(com_google_android_gms_internal_zzafa));
        String valueOf2 = String.valueOf(String.format(".part-%04d", new Object[]{Integer.valueOf(i)}));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    private void zza(zzafa com_google_android_gms_internal_zzafa, long j, String str, byte[] bArr) {
        zzPt();
        this.zzbHU.delete("writes", "id = ?", new String[]{String.valueOf(j)});
        if (bArr.length >= 262144) {
            List zzb = zzb(bArr, 262144);
            for (int i = 0; i < zzb.size(); i++) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("id", Long.valueOf(j));
                contentValues.put("path", zzc(com_google_android_gms_internal_zzafa));
                contentValues.put("type", str);
                contentValues.put("part", Integer.valueOf(i));
                contentValues.put("node", (byte[]) zzb.get(i));
                this.zzbHU.insertWithOnConflict("writes", null, contentValues, 5);
            }
            return;
        }
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("id", Long.valueOf(j));
        contentValues2.put("path", zzc(com_google_android_gms_internal_zzafa));
        contentValues2.put("type", str);
        contentValues2.put("part", null);
        contentValues2.put("node", bArr);
        this.zzbHU.insertWithOnConflict("writes", null, contentValues2, 5);
    }

    private void zza(zzafa com_google_android_gms_internal_zzafa, zzafa com_google_android_gms_internal_zzafa2, zzagi<Long> com_google_android_gms_internal_zzagi_java_lang_Long, final zzagi<Long> com_google_android_gms_internal_zzagi_java_lang_Long2, zzagf com_google_android_gms_internal_zzagf, List<zzais<zzafa, zzahu>> list) {
        if (com_google_android_gms_internal_zzagi_java_lang_Long.getValue() != null) {
            if (((Integer) com_google_android_gms_internal_zzagf.zza(Integer.valueOf(0), new zza<Void, Integer>(this) {
                final /* synthetic */ zzadq b;

                public Integer a(zzafa com_google_android_gms_internal_zzafa, Void voidR, Integer num) {
                    return Integer.valueOf(com_google_android_gms_internal_zzagi_java_lang_Long2.zzK(com_google_android_gms_internal_zzafa) == null ? num.intValue() + 1 : num.intValue());
                }

                public /* synthetic */ Object zza(zzafa com_google_android_gms_internal_zzafa, Object obj, Object obj2) {
                    return a(com_google_android_gms_internal_zzafa, (Void) obj, (Integer) obj2);
                }
            })).intValue() > 0) {
                zzafa zzh = com_google_android_gms_internal_zzafa.zzh(com_google_android_gms_internal_zzafa2);
                if (this.zzbHV.zzTe()) {
                    this.zzbHV.zzh(String.format("Need to rewrite %d nodes below path %s", new Object[]{Integer.valueOf(r0), zzh}), new Object[0]);
                }
                final zzahu zzb = zzb(zzh);
                final zzagi<Long> com_google_android_gms_internal_zzagi_java_lang_Long3 = com_google_android_gms_internal_zzagi_java_lang_Long2;
                final List<zzais<zzafa, zzahu>> list2 = list;
                final zzafa com_google_android_gms_internal_zzafa3 = com_google_android_gms_internal_zzafa2;
                com_google_android_gms_internal_zzagf.zza(null, new zza<Void, Void>(this) {
                    final /* synthetic */ zzadq e;

                    public Void a(zzafa com_google_android_gms_internal_zzafa, Void voidR, Void voidR2) {
                        if (com_google_android_gms_internal_zzagi_java_lang_Long3.zzK(com_google_android_gms_internal_zzafa) == null) {
                            list2.add(new zzais(com_google_android_gms_internal_zzafa3.zzh(com_google_android_gms_internal_zzafa), zzb.zzO(com_google_android_gms_internal_zzafa)));
                        }
                        return null;
                    }

                    public /* synthetic */ Object zza(zzafa com_google_android_gms_internal_zzafa, Object obj, Object obj2) {
                        return a(com_google_android_gms_internal_zzafa, (Void) obj, (Void) obj2);
                    }
                });
                return;
            }
            return;
        }
        Iterator it = com_google_android_gms_internal_zzagi_java_lang_Long.zzSp().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            zzahi com_google_android_gms_internal_zzahi = (zzahi) entry.getKey();
            zzagf zzd = com_google_android_gms_internal_zzagf.zzd((zzahi) entry.getKey());
            zza(com_google_android_gms_internal_zzafa, com_google_android_gms_internal_zzafa2.zza(com_google_android_gms_internal_zzahi), (zzagi) entry.getValue(), com_google_android_gms_internal_zzagi_java_lang_Long2.zze(com_google_android_gms_internal_zzahi), zzd, list);
        }
    }

    private void zza(zzafa com_google_android_gms_internal_zzafa, zzahu com_google_android_gms_internal_zzahu, boolean z) {
        int i;
        int i2;
        long currentTimeMillis = System.currentTimeMillis();
        if (z) {
            i = 0;
            i2 = 0;
            for (zzaht com_google_android_gms_internal_zzaht : com_google_android_gms_internal_zzahu) {
                i2 += zza("serverCache", com_google_android_gms_internal_zzafa.zza(com_google_android_gms_internal_zzaht.zzTK()));
                i = zzc(com_google_android_gms_internal_zzafa.zza(com_google_android_gms_internal_zzaht.zzTK()), com_google_android_gms_internal_zzaht.zzPj()) + i;
            }
        } else {
            i2 = zza("serverCache", com_google_android_gms_internal_zzafa);
            i = zzc(com_google_android_gms_internal_zzafa, com_google_android_gms_internal_zzahu);
        }
        currentTimeMillis = System.currentTimeMillis() - currentTimeMillis;
        if (this.zzbHV.zzTe()) {
            this.zzbHV.zzh(String.format("Persisted a total of %d rows and deleted %d rows for a set at %s in %dms", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), com_google_android_gms_internal_zzafa.toString(), Long.valueOf(currentTimeMillis)}), new Object[0]);
        }
    }

    private byte[] zzac(Object obj) {
        try {
            return zzaim.zzas(obj).getBytes(zzaiI);
        } catch (Throwable e) {
            throw new RuntimeException("Could not serialize leaf node", e);
        }
    }

    private zzahu zzb(zzafa com_google_android_gms_internal_zzafa) {
        List arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        long currentTimeMillis = System.currentTimeMillis();
        Cursor zza = zza(com_google_android_gms_internal_zzafa, new String[]{"path", Param.VALUE});
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        long currentTimeMillis3 = System.currentTimeMillis();
        while (zza.moveToNext()) {
            try {
                arrayList.add(zza.getString(0));
                arrayList2.add(zza.getBlob(1));
            } finally {
                zza.close();
            }
        }
        long currentTimeMillis4 = System.currentTimeMillis() - currentTimeMillis3;
        long currentTimeMillis5 = System.currentTimeMillis();
        zzahu zzTA = zzahn.zzTA();
        Object obj = null;
        Map hashMap = new HashMap();
        int i = 0;
        while (i < arrayList2.size()) {
            int zza2;
            zzafa com_google_android_gms_internal_zzafa2;
            zzahu zzH;
            Object obj2;
            zzahu com_google_android_gms_internal_zzahu;
            if (((String) arrayList.get(i)).endsWith(".part-0000")) {
                String str = (String) arrayList.get(i);
                zzafa com_google_android_gms_internal_zzafa3 = new zzafa(str.substring(0, str.length() - ".part-0000".length()));
                zza2 = zza(com_google_android_gms_internal_zzafa3, arrayList, i);
                if (this.zzbHV.zzTe()) {
                    this.zzbHV.zzh("Loading split node with " + zza2 + " parts.", new Object[0]);
                }
                byte[] zzO = zzO(arrayList2.subList(i, i + zza2));
                zza2 = (i + zza2) - 1;
                com_google_android_gms_internal_zzafa2 = com_google_android_gms_internal_zzafa3;
                zzH = zzH(zzO);
            } else {
                zzahu zzH2 = zzH((byte[]) arrayList2.get(i));
                zzafa com_google_android_gms_internal_zzafa4 = new zzafa((String) arrayList.get(i));
                zzH = zzH2;
                zza2 = i;
                com_google_android_gms_internal_zzafa2 = com_google_android_gms_internal_zzafa4;
            }
            if (com_google_android_gms_internal_zzafa2.zzRw() != null && com_google_android_gms_internal_zzafa2.zzRw().zzTl()) {
                hashMap.put(com_google_android_gms_internal_zzafa2, zzH);
                obj2 = obj;
                com_google_android_gms_internal_zzahu = zzTA;
            } else if (com_google_android_gms_internal_zzafa2.zzi(com_google_android_gms_internal_zzafa)) {
                zzaiv.zzb(obj == null, "Descendants of path must come after ancestors.");
                Object obj3 = obj;
                com_google_android_gms_internal_zzahu = zzH.zzO(zzafa.zza(com_google_android_gms_internal_zzafa2, com_google_android_gms_internal_zzafa));
                obj2 = obj3;
            } else if (com_google_android_gms_internal_zzafa.zzi(com_google_android_gms_internal_zzafa2)) {
                obj2 = 1;
                com_google_android_gms_internal_zzahu = zzTA.zzl(zzafa.zza(com_google_android_gms_internal_zzafa, com_google_android_gms_internal_zzafa2), zzH);
            } else {
                throw new IllegalStateException(String.format("Loading an unrelated row with path %s for %s", new Object[]{com_google_android_gms_internal_zzafa2, com_google_android_gms_internal_zzafa}));
            }
            i = zza2 + 1;
            zzTA = com_google_android_gms_internal_zzahu;
            obj = obj2;
        }
        for (Entry entry : hashMap.entrySet()) {
            zzTA = zzTA.zzl(zzafa.zza(com_google_android_gms_internal_zzafa, (zzafa) entry.getKey()), (zzahu) entry.getValue());
        }
        long currentTimeMillis6 = System.currentTimeMillis() - currentTimeMillis5;
        long currentTimeMillis7 = System.currentTimeMillis() - currentTimeMillis;
        if (this.zzbHV.zzTe()) {
            this.zzbHV.zzh(String.format("Loaded a total of %d rows for a total of %d nodes at %s in %dms (Query: %dms, Loading: %dms, Serializing: %dms)", new Object[]{Integer.valueOf(arrayList2.size()), Integer.valueOf(zzaiq.zzt(zzTA)), com_google_android_gms_internal_zzafa, Long.valueOf(currentTimeMillis7), Long.valueOf(currentTimeMillis2), Long.valueOf(currentTimeMillis4), Long.valueOf(currentTimeMillis6)}), new Object[0]);
        }
        return zzTA;
    }

    private static String zzb(zzafa com_google_android_gms_internal_zzafa, String[] strArr) {
        if ($assertionsDisabled || strArr.length >= com_google_android_gms_internal_zzafa.size() + 1) {
            int i = 0;
            StringBuilder stringBuilder = new StringBuilder("(");
            while (!com_google_android_gms_internal_zzafa.isEmpty()) {
                stringBuilder.append("path");
                stringBuilder.append(" = ? OR ");
                strArr[i] = zzc(com_google_android_gms_internal_zzafa);
                com_google_android_gms_internal_zzafa = com_google_android_gms_internal_zzafa.zzRv();
                i++;
            }
            stringBuilder.append("path");
            stringBuilder.append(" = ?)");
            strArr[i] = zzc(zzafa.zzRq());
            return stringBuilder.toString();
        }
        throw new AssertionError();
    }

    private static List<byte[]> zzb(byte[] bArr, int i) {
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

    private int zzc(zzafa com_google_android_gms_internal_zzafa, zzahu com_google_android_gms_internal_zzahu) {
        long zzs = zzaiq.zzs(com_google_android_gms_internal_zzahu);
        if (!(com_google_android_gms_internal_zzahu instanceof zzahj) || zzs <= 16384) {
            zzd(com_google_android_gms_internal_zzafa, com_google_android_gms_internal_zzahu);
            return 1;
        }
        if (this.zzbHV.zzTe()) {
            this.zzbHV.zzh(String.format("Node estimated serialized size at path %s of %d bytes exceeds limit of %d bytes. Splitting up.", new Object[]{com_google_android_gms_internal_zzafa, Long.valueOf(zzs), Integer.valueOf(16384)}), new Object[0]);
        }
        int i = 0;
        for (zzaht com_google_android_gms_internal_zzaht : com_google_android_gms_internal_zzahu) {
            i = zzc(com_google_android_gms_internal_zzafa.zza(com_google_android_gms_internal_zzaht.zzTK()), com_google_android_gms_internal_zzaht.zzPj()) + i;
        }
        if (!com_google_android_gms_internal_zzahu.zzTp().isEmpty()) {
            zzd(com_google_android_gms_internal_zzafa.zza(zzahi.zzTj()), com_google_android_gms_internal_zzahu.zzTp());
            i++;
        }
        zzd(com_google_android_gms_internal_zzafa, zzahn.zzTA());
        return i + 1;
    }

    private static String zzc(zzafa com_google_android_gms_internal_zzafa) {
        return com_google_android_gms_internal_zzafa.isEmpty() ? "/" : String.valueOf(com_google_android_gms_internal_zzafa.toString()).concat("/");
    }

    private void zzd(zzafa com_google_android_gms_internal_zzafa, zzahu com_google_android_gms_internal_zzahu) {
        byte[] zzac = zzac(com_google_android_gms_internal_zzahu.getValue(true));
        if (zzac.length >= 262144) {
            List zzb = zzb(zzac, 262144);
            if (this.zzbHV.zzTe()) {
                this.zzbHV.zzh("Saving huge leaf node with " + zzb.size() + " parts.", new Object[0]);
            }
            for (int i = 0; i < zzb.size(); i++) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("path", zza(com_google_android_gms_internal_zzafa, i));
                contentValues.put(Param.VALUE, (byte[]) zzb.get(i));
                this.zzbHU.insertWithOnConflict("serverCache", null, contentValues, 5);
            }
            return;
        }
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("path", zzc(com_google_android_gms_internal_zzafa));
        contentValues2.put(Param.VALUE, zzac);
        this.zzbHU.insertWithOnConflict("serverCache", null, contentValues2, 5);
    }

    private static String zzhO(String str) {
        if ($assertionsDisabled || str.endsWith("/")) {
            String valueOf = String.valueOf(str.substring(0, str.length() - 1));
            return new StringBuilder(String.valueOf(valueOf).length() + 1).append(valueOf).append('0').toString();
        }
        throw new AssertionError("Path keys must end with a '/'");
    }

    private String zzk(Collection<Long> collection) {
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

    public void beginTransaction() {
        zzaiv.zzb(!this.zzbHW, "runInTransaction called when an existing transaction is already in progress.");
        if (this.zzbHV.zzTe()) {
            this.zzbHV.zzh("Starting transaction.", new Object[0]);
        }
        this.zzbHU.beginTransaction();
        this.zzbHW = true;
        this.zzbHX = System.currentTimeMillis();
    }

    public void endTransaction() {
        this.zzbHU.endTransaction();
        this.zzbHW = false;
        long currentTimeMillis = System.currentTimeMillis() - this.zzbHX;
        if (this.zzbHV.zzTe()) {
            this.zzbHV.zzh(String.format("Transaction completed. Elapsed: %dms", new Object[]{Long.valueOf(currentTimeMillis)}), new Object[0]);
        }
    }

    public void setTransactionSuccessful() {
        this.zzbHU.setTransactionSuccessful();
    }

    public List<zzafn> zzPp() {
        String[] strArr = new String[]{"id", "path", "type", "part", "node"};
        long currentTimeMillis = System.currentTimeMillis();
        Cursor query = this.zzbHU.query("writes", strArr, null, null, null, null, "id, part");
        List<zzafn> arrayList = new ArrayList();
        while (query.moveToNext()) {
            try {
                byte[] blob;
                Object com_google_android_gms_internal_zzafn;
                long j = query.getLong(0);
                zzafa com_google_android_gms_internal_zzafa = new zzafa(query.getString(1));
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
                    blob = zzO(arrayList2);
                }
                Object zzik = zzaim.zzik(new String(blob, zzaiI));
                if ("o".equals(string)) {
                    com_google_android_gms_internal_zzafn = new zzafn(j, com_google_android_gms_internal_zzafa, zzahv.zzaq(zzik), true);
                } else if ("m".equals(string)) {
                    com_google_android_gms_internal_zzafn = new zzafn(j, com_google_android_gms_internal_zzafa, zzaes.zzax((Map) zzik));
                } else {
                    String str = "Got invalid write type: ";
                    String valueOf = String.valueOf(string);
                    throw new IllegalStateException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                }
                arrayList.add(com_google_android_gms_internal_zzafn);
            } catch (Throwable e) {
                throw new RuntimeException("Failed to load writes", e);
            } catch (Throwable th) {
                query.close();
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.zzbHV.zzTe()) {
            this.zzbHV.zzh(String.format("Loaded %d writes in %dms", new Object[]{Integer.valueOf(arrayList.size()), Long.valueOf(currentTimeMillis2)}), new Object[0]);
        }
        query.close();
        return arrayList;
    }

    public long zzPq() {
        long j = null;
        Cursor rawQuery = this.zzbHU.rawQuery(String.format("SELECT sum(length(%s) + length(%s)) FROM %s", new Object[]{Param.VALUE, "path", "serverCache"}), null);
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

    public List<zzagg> zzPr() {
        String[] strArr = new String[]{"id", "path", "queryParams", "lastUse", "complete", "active"};
        long currentTimeMillis = System.currentTimeMillis();
        Cursor query = this.zzbHU.query("trackedQueries", strArr, null, null, null, null, "id");
        List<zzagg> arrayList = new ArrayList();
        while (query.moveToNext()) {
            try {
                arrayList.add(new zzagg(query.getLong(0), zzagu.zzb(new zzafa(query.getString(1)), zzaim.zzij(query.getString(2))), query.getLong(3), query.getInt(4) != 0, query.getInt(5) != 0));
            } catch (Throwable e) {
                throw new RuntimeException(e);
            } catch (Throwable th) {
                query.close();
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.zzbHV.zzTe()) {
            this.zzbHV.zzh(String.format("Loaded %d tracked queries in %dms", new Object[]{Integer.valueOf(arrayList.size()), Long.valueOf(currentTimeMillis2)}), new Object[0]);
        }
        query.close();
        return arrayList;
    }

    public void zzPs() {
        zzPt();
        long currentTimeMillis = System.currentTimeMillis();
        int delete = this.zzbHU.delete("writes", null, null);
        currentTimeMillis = System.currentTimeMillis() - currentTimeMillis;
        if (this.zzbHV.zzTe()) {
            this.zzbHV.zzh(String.format("Deleted %d (all) write(s) in %dms", new Object[]{Integer.valueOf(delete), Long.valueOf(currentTimeMillis)}), new Object[0]);
        }
    }

    public zzahu zza(zzafa com_google_android_gms_internal_zzafa) {
        return zzb(com_google_android_gms_internal_zzafa);
    }

    public void zza(long j, Set<zzahi> set) {
        zzPt();
        long currentTimeMillis = System.currentTimeMillis();
        String valueOf = String.valueOf(j);
        this.zzbHU.delete("trackedKeys", "id = ?", new String[]{valueOf});
        for (zzahi com_google_android_gms_internal_zzahi : set) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Long.valueOf(j));
            contentValues.put("key", com_google_android_gms_internal_zzahi.asString());
            this.zzbHU.insertWithOnConflict("trackedKeys", null, contentValues, 5);
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.zzbHV.zzTe()) {
            this.zzbHV.zzh(String.format("Set %d tracked query keys for tracked query %d in %dms", new Object[]{Integer.valueOf(set.size()), Long.valueOf(j), Long.valueOf(currentTimeMillis2)}), new Object[0]);
        }
    }

    public void zza(long j, Set<zzahi> set, Set<zzahi> set2) {
        zzPt();
        long currentTimeMillis = System.currentTimeMillis();
        String str = "id = ? AND key = ?";
        String valueOf = String.valueOf(j);
        for (zzahi com_google_android_gms_internal_zzahi : set2) {
            this.zzbHU.delete("trackedKeys", str, new String[]{valueOf, com_google_android_gms_internal_zzahi.asString()});
        }
        for (zzahi com_google_android_gms_internal_zzahi2 : set) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Long.valueOf(j));
            contentValues.put("key", com_google_android_gms_internal_zzahi2.asString());
            this.zzbHU.insertWithOnConflict("trackedKeys", null, contentValues, 5);
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.zzbHV.zzTe()) {
            this.zzbHV.zzh(String.format("Updated tracked query keys (%d added, %d removed) for tracked query id %d in %dms", new Object[]{Integer.valueOf(set.size()), Integer.valueOf(set2.size()), Long.valueOf(j), Long.valueOf(currentTimeMillis2)}), new Object[0]);
        }
    }

    public void zza(zzafa com_google_android_gms_internal_zzafa, zzaes com_google_android_gms_internal_zzaes) {
        zzPt();
        long currentTimeMillis = System.currentTimeMillis();
        Iterator it = com_google_android_gms_internal_zzaes.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            i += zza("serverCache", com_google_android_gms_internal_zzafa.zzh((zzafa) entry.getKey()));
            i2 = zzc(com_google_android_gms_internal_zzafa.zzh((zzafa) entry.getKey()), (zzahu) entry.getValue()) + i2;
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.zzbHV.zzTe()) {
            this.zzbHV.zzh(String.format("Persisted a total of %d rows and deleted %d rows for a merge at %s in %dms", new Object[]{Integer.valueOf(i2), Integer.valueOf(i), com_google_android_gms_internal_zzafa.toString(), Long.valueOf(currentTimeMillis2)}), new Object[0]);
        }
    }

    public void zza(zzafa com_google_android_gms_internal_zzafa, zzaes com_google_android_gms_internal_zzaes, long j) {
        zzPt();
        long currentTimeMillis = System.currentTimeMillis();
        zzafa com_google_android_gms_internal_zzafa2 = com_google_android_gms_internal_zzafa;
        long j2 = j;
        zza(com_google_android_gms_internal_zzafa2, j2, "m", zzac(com_google_android_gms_internal_zzaes.zzaQ(true)));
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.zzbHV.zzTe()) {
            this.zzbHV.zzh(String.format("Persisted user merge in %dms", new Object[]{Long.valueOf(currentTimeMillis2)}), new Object[0]);
        }
    }

    public void zza(zzafa com_google_android_gms_internal_zzafa, zzagf com_google_android_gms_internal_zzagf) {
        if (com_google_android_gms_internal_zzagf.zzSj()) {
            zzPt();
            long currentTimeMillis = System.currentTimeMillis();
            Cursor zza = zza(com_google_android_gms_internal_zzafa, new String[]{"rowid", "path"});
            zzagi com_google_android_gms_internal_zzagi = new zzagi(null);
            zzagi com_google_android_gms_internal_zzagi2 = new zzagi(null);
            while (zza.moveToNext()) {
                long j = zza.getLong(0);
                zzafa com_google_android_gms_internal_zzafa2 = new zzafa(zza.getString(1));
                zzahf com_google_android_gms_internal_zzahf;
                String valueOf;
                String valueOf2;
                if (com_google_android_gms_internal_zzafa.zzi(com_google_android_gms_internal_zzafa2)) {
                    zzafa zza2 = zzafa.zza(com_google_android_gms_internal_zzafa, com_google_android_gms_internal_zzafa2);
                    if (com_google_android_gms_internal_zzagf.zzw(zza2)) {
                        com_google_android_gms_internal_zzagi = com_google_android_gms_internal_zzagi.zzb(zza2, Long.valueOf(j));
                    } else if (com_google_android_gms_internal_zzagf.zzx(zza2)) {
                        com_google_android_gms_internal_zzagi2 = com_google_android_gms_internal_zzagi2.zzb(zza2, Long.valueOf(j));
                    } else {
                        com_google_android_gms_internal_zzahf = this.zzbHV;
                        valueOf = String.valueOf(com_google_android_gms_internal_zzafa);
                        valueOf2 = String.valueOf(com_google_android_gms_internal_zzafa2);
                        com_google_android_gms_internal_zzahf.warn(new StringBuilder((String.valueOf(valueOf).length() + 88) + String.valueOf(valueOf2).length()).append("We are pruning at ").append(valueOf).append(" and have data at ").append(valueOf2).append(" that isn't marked for pruning or keeping. Ignoring.").toString());
                    }
                } else {
                    com_google_android_gms_internal_zzahf = this.zzbHV;
                    valueOf = String.valueOf(com_google_android_gms_internal_zzafa);
                    valueOf2 = String.valueOf(com_google_android_gms_internal_zzafa2);
                    com_google_android_gms_internal_zzahf.warn(new StringBuilder((String.valueOf(valueOf).length() + 67) + String.valueOf(valueOf2).length()).append("We are pruning at ").append(valueOf).append(" but we have data stored higher up at ").append(valueOf2).append(". Ignoring.").toString());
                }
            }
            int i = 0;
            int i2 = 0;
            if (!com_google_android_gms_internal_zzagi.isEmpty()) {
                List<zzais> arrayList = new ArrayList();
                zza(com_google_android_gms_internal_zzafa, zzafa.zzRq(), com_google_android_gms_internal_zzagi, com_google_android_gms_internal_zzagi2, com_google_android_gms_internal_zzagf, arrayList);
                Collection values = com_google_android_gms_internal_zzagi.values();
                String valueOf3 = String.valueOf(zzk(values));
                this.zzbHU.delete("serverCache", new StringBuilder(String.valueOf(valueOf3).length() + 11).append("rowid IN (").append(valueOf3).append(")").toString(), null);
                for (zzais com_google_android_gms_internal_zzais : arrayList) {
                    zzc(com_google_android_gms_internal_zzafa.zzh((zzafa) com_google_android_gms_internal_zzais.getFirst()), (zzahu) com_google_android_gms_internal_zzais.zzUj());
                }
                i = values.size();
                i2 = arrayList.size();
            }
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            if (this.zzbHV.zzTe()) {
                this.zzbHV.zzh(String.format("Pruned %d rows with %d nodes resaved in %dms", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(currentTimeMillis2)}), new Object[0]);
            }
        }
    }

    public void zza(zzafa com_google_android_gms_internal_zzafa, zzahu com_google_android_gms_internal_zzahu) {
        zzPt();
        zza(com_google_android_gms_internal_zzafa, com_google_android_gms_internal_zzahu, false);
    }

    public void zza(zzafa com_google_android_gms_internal_zzafa, zzahu com_google_android_gms_internal_zzahu, long j) {
        zzPt();
        long currentTimeMillis = System.currentTimeMillis();
        zzafa com_google_android_gms_internal_zzafa2 = com_google_android_gms_internal_zzafa;
        long j2 = j;
        zza(com_google_android_gms_internal_zzafa2, j2, "o", zzac(com_google_android_gms_internal_zzahu.getValue(true)));
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.zzbHV.zzTe()) {
            this.zzbHV.zzh(String.format("Persisted user overwrite in %dms", new Object[]{Long.valueOf(currentTimeMillis2)}), new Object[0]);
        }
    }

    public void zza(zzagg com_google_android_gms_internal_zzagg) {
        zzPt();
        long currentTimeMillis = System.currentTimeMillis();
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Long.valueOf(com_google_android_gms_internal_zzagg.id));
        contentValues.put("path", zzc(com_google_android_gms_internal_zzagg.zzbOQ.zzPn()));
        contentValues.put("queryParams", com_google_android_gms_internal_zzagg.zzbOQ.zzSR().zzSP());
        contentValues.put("lastUse", Long.valueOf(com_google_android_gms_internal_zzagg.zzbOR));
        contentValues.put("complete", Boolean.valueOf(com_google_android_gms_internal_zzagg.zzbOS));
        contentValues.put("active", Boolean.valueOf(com_google_android_gms_internal_zzagg.zzbOT));
        this.zzbHU.insertWithOnConflict("trackedQueries", null, contentValues, 5);
        currentTimeMillis = System.currentTimeMillis() - currentTimeMillis;
        if (this.zzbHV.zzTe()) {
            this.zzbHV.zzh(String.format("Saved new tracked query in %dms", new Object[]{Long.valueOf(currentTimeMillis)}), new Object[0]);
        }
    }

    public void zzat(long j) {
        zzPt();
        long currentTimeMillis = System.currentTimeMillis();
        int delete = this.zzbHU.delete("writes", "id = ?", new String[]{String.valueOf(j)});
        currentTimeMillis = System.currentTimeMillis() - currentTimeMillis;
        if (this.zzbHV.zzTe()) {
            this.zzbHV.zzh(String.format("Deleted %d write(s) with writeId %d in %dms", new Object[]{Integer.valueOf(delete), Long.valueOf(j), Long.valueOf(currentTimeMillis)}), new Object[0]);
        }
    }

    public void zzau(long j) {
        zzPt();
        String valueOf = String.valueOf(j);
        this.zzbHU.delete("trackedQueries", "id = ?", new String[]{valueOf});
        this.zzbHU.delete("trackedKeys", "id = ?", new String[]{valueOf});
    }

    public void zzav(long j) {
        zzPt();
        long currentTimeMillis = System.currentTimeMillis();
        ContentValues contentValues = new ContentValues();
        contentValues.put("active", Boolean.valueOf(false));
        contentValues.put("lastUse", Long.valueOf(j));
        this.zzbHU.updateWithOnConflict("trackedQueries", contentValues, "active = 1", new String[0], 5);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.zzbHV.zzTe()) {
            this.zzbHV.zzh(String.format("Reset active tracked queries in %dms", new Object[]{Long.valueOf(currentTimeMillis2)}), new Object[0]);
        }
    }

    public Set<zzahi> zzaw(long j) {
        return zzg(Collections.singleton(Long.valueOf(j)));
    }

    public void zzb(zzafa com_google_android_gms_internal_zzafa, zzahu com_google_android_gms_internal_zzahu) {
        zzPt();
        zza(com_google_android_gms_internal_zzafa, com_google_android_gms_internal_zzahu, true);
    }

    public Set<zzahi> zzg(Set<Long> set) {
        String[] strArr = new String[]{"key"};
        long currentTimeMillis = System.currentTimeMillis();
        String valueOf = String.valueOf("id IN (");
        String valueOf2 = String.valueOf(zzk(set));
        Cursor query = this.zzbHU.query(true, "trackedKeys", strArr, new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(valueOf2).length()).append(valueOf).append(valueOf2).append(")").toString(), null, null, null, null, null);
        Set<zzahi> hashSet = new HashSet();
        while (query.moveToNext()) {
            try {
                hashSet.add(zzahi.zzig(query.getString(0)));
            } catch (Throwable th) {
                query.close();
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (this.zzbHV.zzTe()) {
            this.zzbHV.zzh(String.format("Loaded %d tracked queries keys for tracked queries %s in %dms", new Object[]{Integer.valueOf(hashSet.size()), set.toString(), Long.valueOf(currentTimeMillis2)}), new Object[0]);
        }
        query.close();
        return hashSet;
    }
}
