package com.google.android.gms.b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.b.dm.b;
import com.google.android.gms.b.dm.c;
import com.google.android.gms.b.dm.d;
import com.google.android.gms.b.dm.e;
import com.google.android.gms.b.dm.f;
import com.google.android.gms.b.do.a;
import com.google.android.gms.b.do.g;
import com.google.android.gms.measurement.AppMeasurement;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.BitSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.security.auth.x500.X500Principal;

public class dl extends cy {
    private final AtomicLong a = new AtomicLong(0);
    private int b;

    dl(cv cvVar) {
        super(cvVar);
    }

    private Object a(int i, Object obj, boolean z) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf((long) ((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf((long) ((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf((long) ((Short) obj).shortValue());
        }
        if (!(obj instanceof Boolean)) {
            return obj instanceof Float ? Double.valueOf(((Float) obj).doubleValue()) : ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) ? a(String.valueOf(obj), i, z) : null;
        } else {
            return Long.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
        }
    }

    public static String a(b bVar) {
        int i = 0;
        if (bVar == null) {
            return "null";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\nevent_filter {\n");
        a(stringBuilder, 0, "filter_id", bVar.a);
        a(stringBuilder, 0, "event_name", bVar.b);
        a(stringBuilder, 1, "event_count_filter", bVar.e);
        stringBuilder.append("  filters {\n");
        c[] cVarArr = bVar.c;
        int length = cVarArr.length;
        while (i < length) {
            a(stringBuilder, 2, cVarArr[i]);
            i++;
        }
        a(stringBuilder, 1);
        stringBuilder.append("}\n}\n");
        return stringBuilder.toString();
    }

    public static String a(e eVar) {
        if (eVar == null) {
            return "null";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\nproperty_filter {\n");
        a(stringBuilder, 0, "filter_id", eVar.a);
        a(stringBuilder, 0, "property_name", eVar.b);
        a(stringBuilder, 1, eVar.c);
        stringBuilder.append("}\n");
        return stringBuilder.toString();
    }

    private static void a(StringBuilder stringBuilder, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            stringBuilder.append("  ");
        }
    }

    private static void a(StringBuilder stringBuilder, int i, c cVar) {
        if (cVar != null) {
            a(stringBuilder, i);
            stringBuilder.append("filter {\n");
            a(stringBuilder, i, "complement", cVar.c);
            a(stringBuilder, i, "param_name", cVar.d);
            a(stringBuilder, i + 1, "string_filter", cVar.a);
            a(stringBuilder, i + 1, "number_filter", cVar.b);
            a(stringBuilder, i);
            stringBuilder.append("}\n");
        }
    }

    private static void a(StringBuilder stringBuilder, int i, do.e eVar) {
        if (eVar != null) {
            a(stringBuilder, i);
            stringBuilder.append("bundle {\n");
            a(stringBuilder, i, "protocol_version", eVar.a);
            a(stringBuilder, i, "platform", eVar.i);
            a(stringBuilder, i, "gmp_version", eVar.q);
            a(stringBuilder, i, "uploading_gmp_version", eVar.r);
            a(stringBuilder, i, "config_version", eVar.G);
            a(stringBuilder, i, "gmp_app_id", eVar.y);
            a(stringBuilder, i, "app_id", eVar.o);
            a(stringBuilder, i, "app_version", eVar.p);
            a(stringBuilder, i, "app_version_major", eVar.C);
            a(stringBuilder, i, "firebase_instance_id", eVar.B);
            a(stringBuilder, i, "dev_cert_hash", eVar.v);
            a(stringBuilder, i, "app_store", eVar.n);
            a(stringBuilder, i, "upload_timestamp_millis", eVar.d);
            a(stringBuilder, i, "start_timestamp_millis", eVar.e);
            a(stringBuilder, i, "end_timestamp_millis", eVar.f);
            a(stringBuilder, i, "previous_bundle_start_timestamp_millis", eVar.g);
            a(stringBuilder, i, "previous_bundle_end_timestamp_millis", eVar.h);
            a(stringBuilder, i, "app_instance_id", eVar.u);
            a(stringBuilder, i, "resettable_device_id", eVar.s);
            a(stringBuilder, i, "device_id", eVar.F);
            a(stringBuilder, i, "limited_ad_tracking", eVar.t);
            a(stringBuilder, i, "os_version", eVar.j);
            a(stringBuilder, i, "device_model", eVar.k);
            a(stringBuilder, i, "user_default_language", eVar.l);
            a(stringBuilder, i, "time_zone_offset_minutes", eVar.m);
            a(stringBuilder, i, "bundle_sequential_index", eVar.w);
            a(stringBuilder, i, "service_upload", eVar.z);
            a(stringBuilder, i, "health_monitor", eVar.x);
            a(stringBuilder, i, eVar.c);
            a(stringBuilder, i, eVar.A);
            a(stringBuilder, i, eVar.b);
            a(stringBuilder, i);
            stringBuilder.append("}\n");
        }
    }

    private static void a(StringBuilder stringBuilder, int i, String str, d dVar) {
        if (dVar != null) {
            a(stringBuilder, i);
            stringBuilder.append(str);
            stringBuilder.append(" {\n");
            if (dVar.a != null) {
                Object obj = "UNKNOWN_COMPARISON_TYPE";
                switch (dVar.a.intValue()) {
                    case 1:
                        obj = "LESS_THAN";
                        break;
                    case 2:
                        obj = "GREATER_THAN";
                        break;
                    case 3:
                        obj = "EQUAL";
                        break;
                    case 4:
                        obj = "BETWEEN";
                        break;
                }
                a(stringBuilder, i, "comparison_type", obj);
            }
            a(stringBuilder, i, "match_as_float", dVar.b);
            a(stringBuilder, i, "comparison_value", dVar.c);
            a(stringBuilder, i, "min_comparison_value", dVar.d);
            a(stringBuilder, i, "max_comparison_value", dVar.e);
            a(stringBuilder, i);
            stringBuilder.append("}\n");
        }
    }

    private static void a(StringBuilder stringBuilder, int i, String str, f fVar) {
        if (fVar != null) {
            a(stringBuilder, i);
            stringBuilder.append(str);
            stringBuilder.append(" {\n");
            if (fVar.a != null) {
                Object obj = "UNKNOWN_MATCH_TYPE";
                switch (fVar.a.intValue()) {
                    case 1:
                        obj = "REGEXP";
                        break;
                    case 2:
                        obj = "BEGINS_WITH";
                        break;
                    case 3:
                        obj = "ENDS_WITH";
                        break;
                    case 4:
                        obj = "PARTIAL";
                        break;
                    case 5:
                        obj = "EXACT";
                        break;
                    case 6:
                        obj = "IN_LIST";
                        break;
                }
                a(stringBuilder, i, "match_type", obj);
            }
            a(stringBuilder, i, "expression", fVar.b);
            a(stringBuilder, i, "case_sensitive", fVar.c);
            if (fVar.d.length > 0) {
                a(stringBuilder, i + 1);
                stringBuilder.append("expression_list {\n");
                for (String str2 : fVar.d) {
                    a(stringBuilder, i + 2);
                    stringBuilder.append(str2);
                    stringBuilder.append("\n");
                }
                stringBuilder.append("}\n");
            }
            a(stringBuilder, i);
            stringBuilder.append("}\n");
        }
    }

    private static void a(StringBuilder stringBuilder, int i, String str, do.f fVar) {
        int i2 = 0;
        if (fVar != null) {
            int i3;
            int i4;
            int i5 = i + 1;
            a(stringBuilder, i5);
            stringBuilder.append(str);
            stringBuilder.append(" {\n");
            if (fVar.b != null) {
                a(stringBuilder, i5 + 1);
                stringBuilder.append("results: ");
                long[] jArr = fVar.b;
                int length = jArr.length;
                i3 = 0;
                i4 = 0;
                while (i3 < length) {
                    Long valueOf = Long.valueOf(jArr[i3]);
                    int i6 = i4 + 1;
                    if (i4 != 0) {
                        stringBuilder.append(", ");
                    }
                    stringBuilder.append(valueOf);
                    i3++;
                    i4 = i6;
                }
                stringBuilder.append('\n');
            }
            if (fVar.a != null) {
                a(stringBuilder, i5 + 1);
                stringBuilder.append("status: ");
                long[] jArr2 = fVar.a;
                int length2 = jArr2.length;
                i3 = 0;
                while (i2 < length2) {
                    Long valueOf2 = Long.valueOf(jArr2[i2]);
                    i4 = i3 + 1;
                    if (i3 != 0) {
                        stringBuilder.append(", ");
                    }
                    stringBuilder.append(valueOf2);
                    i2++;
                    i3 = i4;
                }
                stringBuilder.append('\n');
            }
            a(stringBuilder, i5);
            stringBuilder.append("}\n");
        }
    }

    private static void a(StringBuilder stringBuilder, int i, String str, Object obj) {
        if (obj != null) {
            a(stringBuilder, i + 1);
            stringBuilder.append(str);
            stringBuilder.append(": ");
            stringBuilder.append(obj);
            stringBuilder.append('\n');
        }
    }

    private static void a(StringBuilder stringBuilder, int i, a[] aVarArr) {
        if (aVarArr != null) {
            int i2 = i + 1;
            for (a aVar : aVarArr) {
                if (aVar != null) {
                    a(stringBuilder, i2);
                    stringBuilder.append("audience_membership {\n");
                    a(stringBuilder, i2, "audience_id", aVar.a);
                    a(stringBuilder, i2, "new_audience", aVar.d);
                    a(stringBuilder, i2, "current_data", aVar.b);
                    a(stringBuilder, i2, "previous_data", aVar.c);
                    a(stringBuilder, i2);
                    stringBuilder.append("}\n");
                }
            }
        }
    }

    private static void a(StringBuilder stringBuilder, int i, do.b[] bVarArr) {
        if (bVarArr != null) {
            int i2 = i + 1;
            for (do.b bVar : bVarArr) {
                if (bVar != null) {
                    a(stringBuilder, i2);
                    stringBuilder.append("event {\n");
                    a(stringBuilder, i2, "name", bVar.b);
                    a(stringBuilder, i2, "timestamp_millis", bVar.c);
                    a(stringBuilder, i2, "previous_timestamp_millis", bVar.d);
                    a(stringBuilder, i2, "count", bVar.e);
                    a(stringBuilder, i2, bVar.a);
                    a(stringBuilder, i2);
                    stringBuilder.append("}\n");
                }
            }
        }
    }

    private static void a(StringBuilder stringBuilder, int i, do.c[] cVarArr) {
        if (cVarArr != null) {
            int i2 = i + 1;
            for (do.c cVar : cVarArr) {
                if (cVar != null) {
                    a(stringBuilder, i2);
                    stringBuilder.append("param {\n");
                    a(stringBuilder, i2, "name", cVar.a);
                    a(stringBuilder, i2, "string_value", cVar.b);
                    a(stringBuilder, i2, "int_value", cVar.c);
                    a(stringBuilder, i2, "double_value", cVar.e);
                    a(stringBuilder, i2);
                    stringBuilder.append("}\n");
                }
            }
        }
    }

    private static void a(StringBuilder stringBuilder, int i, g[] gVarArr) {
        if (gVarArr != null) {
            int i2 = i + 1;
            for (g gVar : gVarArr) {
                if (gVar != null) {
                    a(stringBuilder, i2);
                    stringBuilder.append("user_property {\n");
                    a(stringBuilder, i2, "set_timestamp_millis", gVar.a);
                    a(stringBuilder, i2, "name", gVar.b);
                    a(stringBuilder, i2, "string_value", gVar.c);
                    a(stringBuilder, i2, "int_value", gVar.d);
                    a(stringBuilder, i2, "double_value", gVar.f);
                    a(stringBuilder, i2);
                    stringBuilder.append("}\n");
                }
            }
        }
    }

    public static boolean a(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 4);
            return serviceInfo != null && serviceInfo.enabled;
        } catch (NameNotFoundException e) {
            return false;
        }
    }

    public static boolean a(Context context, String str, boolean z) {
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            ActivityInfo receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, str), 2);
            return (receiverInfo == null || !receiverInfo.enabled) ? false : !z || receiverInfo.exported;
        } catch (NameNotFoundException e) {
            return false;
        }
    }

    static boolean a(ch chVar, bv bvVar) {
        com.google.android.gms.common.internal.c.a((Object) chVar);
        com.google.android.gms.common.internal.c.a((Object) bvVar);
        return !TextUtils.isEmpty(bvVar.c) || "_in".equals(chVar.b);
    }

    static boolean a(String str) {
        com.google.android.gms.common.internal.c.a(str);
        return str.charAt(0) != '_';
    }

    public static boolean a(long[] jArr, int i) {
        return i < jArr.length * 64 && (jArr[i / 64] & (1 << (i % 64))) != 0;
    }

    public static long[] a(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        long[] jArr = new long[length];
        int i = 0;
        while (i < length) {
            jArr[i] = 0;
            int i2 = 0;
            while (i2 < 64 && (i * 64) + i2 < bitSet.length()) {
                if (bitSet.get((i * 64) + i2)) {
                    jArr[i] = jArr[i] | (1 << i2);
                }
                i2++;
            }
            i++;
        }
        return jArr;
    }

    public static String b(do.d dVar) {
        if (dVar == null) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\nbatch {\n");
        if (dVar.a != null) {
            for (do.e eVar : dVar.a) {
                if (eVar != null) {
                    a(stringBuilder, 1, eVar);
                }
            }
        }
        stringBuilder.append("}\n");
        return stringBuilder.toString();
    }

    static long c(byte[] bArr) {
        long j = null;
        com.google.android.gms.common.internal.c.a((Object) bArr);
        com.google.android.gms.common.internal.c.a(bArr.length > 0);
        long j2 = 0;
        int length = bArr.length - 1;
        while (length >= 0 && length >= bArr.length - 8) {
            j2 += (((long) bArr[length]) & 255) << j;
            j += 8;
            length--;
        }
        return j2;
    }

    public static boolean c(String str, String str2) {
        return (str == null && str2 == null) ? true : str == null ? false : str.equals(str2);
    }

    static MessageDigest h(String str) {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance(str);
                if (instance != null) {
                    return instance;
                }
                i++;
            } catch (NoSuchAlgorithmException e) {
            }
        }
        return null;
    }

    public static boolean j(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    static boolean l(String str) {
        return str != null && str.matches("(\\+|-)?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    private int o(String str) {
        return "_ldl".equals(str) ? w().E() : w().D();
    }

    public Bundle a(Uri uri) {
        Bundle bundle = null;
        if (uri != null) {
            try {
                Object queryParameter;
                Object queryParameter2;
                Object queryParameter3;
                Object queryParameter4;
                if (uri.isHierarchical()) {
                    queryParameter = uri.getQueryParameter("utm_campaign");
                    queryParameter2 = uri.getQueryParameter("utm_source");
                    queryParameter3 = uri.getQueryParameter("utm_medium");
                    queryParameter4 = uri.getQueryParameter("gclid");
                } else {
                    queryParameter4 = null;
                    queryParameter3 = null;
                    queryParameter2 = null;
                    queryParameter = null;
                }
                if (!(TextUtils.isEmpty(queryParameter) && TextUtils.isEmpty(queryParameter2) && TextUtils.isEmpty(queryParameter3) && TextUtils.isEmpty(queryParameter4))) {
                    bundle = new Bundle();
                    if (!TextUtils.isEmpty(queryParameter)) {
                        bundle.putString("campaign", queryParameter);
                    }
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        bundle.putString("source", queryParameter2);
                    }
                    if (!TextUtils.isEmpty(queryParameter3)) {
                        bundle.putString("medium", queryParameter3);
                    }
                    if (!TextUtils.isEmpty(queryParameter4)) {
                        bundle.putString("gclid", queryParameter4);
                    }
                    queryParameter4 = uri.getQueryParameter("utm_term");
                    if (!TextUtils.isEmpty(queryParameter4)) {
                        bundle.putString("term", queryParameter4);
                    }
                    queryParameter4 = uri.getQueryParameter("utm_content");
                    if (!TextUtils.isEmpty(queryParameter4)) {
                        bundle.putString("content", queryParameter4);
                    }
                    queryParameter4 = uri.getQueryParameter("aclid");
                    if (!TextUtils.isEmpty(queryParameter4)) {
                        bundle.putString("aclid", queryParameter4);
                    }
                    queryParameter4 = uri.getQueryParameter("cp1");
                    if (!TextUtils.isEmpty(queryParameter4)) {
                        bundle.putString("cp1", queryParameter4);
                    }
                    queryParameter4 = uri.getQueryParameter("anid");
                    if (!TextUtils.isEmpty(queryParameter4)) {
                        bundle.putString("anid", queryParameter4);
                    }
                }
            } catch (UnsupportedOperationException e) {
                u().z().a("Install referrer url isn't a hierarchical URI", e);
            }
        }
        return bundle;
    }

    public Bundle a(String str, Bundle bundle, List<String> list, boolean z) {
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        w().x();
        int i = 0;
        for (String str2 : bundle.keySet()) {
            int d;
            if (list == null || !list.contains(str2)) {
                d = z ? d(str2) : 0;
                if (d == 0) {
                    d = e(str2);
                }
            } else {
                d = 0;
            }
            if (d != 0) {
                if (a(bundle2, d)) {
                    bundle2.putString("_ev", a(str2, w().A(), true));
                    if (d == 3) {
                        a(bundle2, (Object) str2);
                    }
                }
                bundle2.remove(str2);
            } else if (a(str2, bundle.get(str2)) || "_ev".equals(str2)) {
                if (a(str2)) {
                    i++;
                    if (i > 25) {
                        u().x().a("Event can't contain more then " + 25 + " params", str, bundle);
                        a(bundle2, 5);
                        bundle2.remove(str2);
                    }
                }
                i = i;
            } else {
                if (a(bundle2, 4)) {
                    bundle2.putString("_ev", a(str2, w().A(), true));
                    a(bundle2, bundle.get(str2));
                }
                bundle2.remove(str2);
            }
        }
        return bundle2;
    }

    public String a(String str, int i, boolean z) {
        return str.length() > i ? z ? String.valueOf(str.substring(0, i)).concat("...") : null : str;
    }

    protected void a() {
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                u().z().a("Utils falling back to Random for random id");
            }
        }
        this.a.set(nextLong);
    }

    public void a(int i, String str, String str2, int i2) {
        a(null, i, str, str2, i2);
    }

    public void a(Bundle bundle, Object obj) {
        com.google.android.gms.common.internal.c.a((Object) bundle);
        if (obj == null) {
            return;
        }
        if ((obj instanceof String) || (obj instanceof CharSequence)) {
            bundle.putLong("_el", (long) String.valueOf(obj).length());
        }
    }

    public void a(Bundle bundle, String str, Object obj) {
        if (bundle != null) {
            if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof String) {
                bundle.putString(str, String.valueOf(obj));
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (str != null) {
                u().A().a("Not putting event parameter. Invalid value type. name, type", str, obj != null ? obj.getClass().getSimpleName() : null);
            }
        }
    }

    public void a(do.c cVar, Object obj) {
        com.google.android.gms.common.internal.c.a(obj);
        cVar.b = null;
        cVar.c = null;
        cVar.e = null;
        if (obj instanceof String) {
            cVar.b = (String) obj;
        } else if (obj instanceof Long) {
            cVar.c = (Long) obj;
        } else if (obj instanceof Double) {
            cVar.e = (Double) obj;
        } else {
            u().x().a("Ignoring invalid (type) event param value", obj);
        }
    }

    public void a(g gVar, Object obj) {
        com.google.android.gms.common.internal.c.a(obj);
        gVar.c = null;
        gVar.d = null;
        gVar.f = null;
        if (obj instanceof String) {
            gVar.c = (String) obj;
        } else if (obj instanceof Long) {
            gVar.d = (Long) obj;
        } else if (obj instanceof Double) {
            gVar.f = (Double) obj;
        } else {
            u().x().a("Ignoring invalid (type) user attribute value", obj);
        }
    }

    public void a(String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        a(bundle, i);
        if (!TextUtils.isEmpty(str2)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", (long) i2);
        }
        this.n.d().R();
        this.n.l().a("auto", "_err", bundle);
    }

    public boolean a(long j, long j2) {
        return j == 0 || j2 <= 0 || Math.abs(m().a() - j) > j2;
    }

    public boolean a(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra);
    }

    public boolean a(Bundle bundle, int i) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", (long) i);
        return true;
    }

    boolean a(String str, int i, String str2) {
        if (str2 == null) {
            u().x().a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() <= i) {
            return true;
        } else {
            u().x().a("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
            return false;
        }
    }

    public boolean a(String str, Object obj) {
        return j(str) ? a("param", str, w().C(), obj) : a("param", str, w().B(), obj);
    }

    boolean a(String str, String str2) {
        if (str2 == null) {
            u().x().a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            u().x().a("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (Character.isLetter(codePointAt)) {
                int length = str2.length();
                codePointAt = Character.charCount(codePointAt);
                while (codePointAt < length) {
                    int codePointAt2 = str2.codePointAt(codePointAt);
                    if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                        codePointAt += Character.charCount(codePointAt2);
                    } else {
                        u().x().a("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                        return false;
                    }
                }
                return true;
            }
            u().x().a("Name must start with a letter. Type, name", str, str2);
            return false;
        }
    }

    boolean a(String str, String str2, int i, Object obj) {
        if (obj == null || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Boolean) || (obj instanceof Double)) {
            return true;
        }
        if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
            return false;
        }
        String valueOf = String.valueOf(obj);
        if (valueOf.length() <= i) {
            return true;
        }
        u().z().a("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(valueOf.length()));
        return false;
    }

    boolean a(String str, Map<String, String> map, String str2) {
        if (str2 == null) {
            u().x().a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.startsWith("firebase_")) {
            u().x().a("Name starts with reserved prefix. Type, name", str, str2);
            return false;
        } else if (map == null || !map.containsKey(str2)) {
            return true;
        } else {
            u().x().a("Name is reserved. Type, name", str, str2);
            return false;
        }
    }

    public byte[] a(do.d dVar) {
        try {
            byte[] bArr = new byte[dVar.f()];
            lg a = lg.a(bArr);
            dVar.a(a);
            a.b();
            return bArr;
        } catch (IOException e) {
            u().x().a("Data loss. Failed to serialize batch", e);
            return null;
        }
    }

    public byte[] a(byte[] bArr) {
        try {
            OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            u().x().a("Failed to gzip content", e);
            throw e;
        }
    }

    public int b(String str) {
        return !b("event", str) ? 2 : !a("event", AppMeasurement.a.a, str) ? 13 : a("event", w().y(), str) ? 0 : 2;
    }

    long b(Context context, String str) {
        e();
        com.google.android.gms.common.internal.c.a((Object) context);
        com.google.android.gms.common.internal.c.a(str);
        PackageManager packageManager = context.getPackageManager();
        MessageDigest h = h("MD5");
        if (h == null) {
            u().x().a("Could not get MD5 instance");
            return -1;
        }
        if (packageManager != null) {
            try {
                if (!c(context, str)) {
                    PackageInfo b = at.b(context).b(n().getPackageName(), 64);
                    if (b.signatures != null && b.signatures.length > 0) {
                        return c(h.digest(b.signatures[0].toByteArray()));
                    }
                    u().z().a("Could not get signatures");
                    return -1;
                }
            } catch (NameNotFoundException e) {
                u().x().a("Package name not found", e);
            }
        }
        return 0;
    }

    public Object b(String str, Object obj) {
        if ("_ev".equals(str)) {
            return a(w().C(), obj, true);
        }
        return a(j(str) ? w().C() : w().B(), obj, false);
    }

    public /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    boolean b(String str, String str2) {
        if (str2 == null) {
            u().x().a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            u().x().a("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (Character.isLetter(codePointAt) || codePointAt == 95) {
                int length = str2.length();
                codePointAt = Character.charCount(codePointAt);
                while (codePointAt < length) {
                    int codePointAt2 = str2.codePointAt(codePointAt);
                    if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                        codePointAt += Character.charCount(codePointAt2);
                    } else {
                        u().x().a("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                        return false;
                    }
                }
                return true;
            }
            u().x().a("Name must start with a letter or _ (underscore). Type, name", str, str2);
            return false;
        }
    }

    public byte[] b(byte[] bArr) {
        try {
            InputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read <= 0) {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
        } catch (IOException e) {
            u().x().a("Failed to ungzip content", e);
            throw e;
        }
    }

    public int c(String str) {
        return !b("user property", str) ? 6 : !a("user property", AppMeasurement.g.a, str) ? 15 : a("user property", w().z(), str) ? 0 : 6;
    }

    public int c(String str, Object obj) {
        return "_ldl".equals(str) ? a("user property referrer", str, o(str), obj) : a("user property", str, o(str), obj) ? 0 : 7;
    }

    public /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    boolean c(Context context, String str) {
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo b = at.b(context).b(str, 64);
            if (!(b == null || b.signatures == null || b.signatures.length <= 0)) {
                return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(b.signatures[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
            }
        } catch (CertificateException e) {
            u().x().a("Error obtaining certificate", e);
        } catch (NameNotFoundException e2) {
            u().x().a("Package name not found", e2);
        }
        return true;
    }

    public int d(String str) {
        return !a("event param", str) ? 3 : !a("event param", null, str) ? 14 : a("event param", w().A(), str) ? 0 : 3;
    }

    public long d(byte[] bArr) {
        com.google.android.gms.common.internal.c.a((Object) bArr);
        e();
        MessageDigest h = h("MD5");
        if (h != null) {
            return c(h.digest(bArr));
        }
        u().x().a("Failed to get MD5");
        return 0;
    }

    public Object d(String str, Object obj) {
        return "_ldl".equals(str) ? a(o(str), obj, true) : a(o(str), obj, false);
    }

    public /* bridge */ /* synthetic */ void d() {
        super.d();
    }

    public int e(String str) {
        return !b("event param", str) ? 3 : !a("event param", null, str) ? 14 : a("event param", w().A(), str) ? 0 : 3;
    }

    public /* bridge */ /* synthetic */ void e() {
        super.e();
    }

    public /* bridge */ /* synthetic */ bt f() {
        return super.f();
    }

    public boolean f(String str) {
        if (TextUtils.isEmpty(str)) {
            u().x().a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            return false;
        } else if (g(str)) {
            return true;
        } else {
            u().x().a("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", str);
            return false;
        }
    }

    public /* bridge */ /* synthetic */ bx g() {
        return super.g();
    }

    boolean g(String str) {
        com.google.android.gms.common.internal.c.a((Object) str);
        return str.matches("^1:\\d+:android:[a-f0-9]+$");
    }

    public /* bridge */ /* synthetic */ da h() {
        return super.h();
    }

    public /* bridge */ /* synthetic */ cl i() {
        return super.i();
    }

    public boolean i(String str) {
        e();
        if (at.b(n()).a(str) == 0) {
            return true;
        }
        u().C().a("Permission not granted", str);
        return false;
    }

    public /* bridge */ /* synthetic */ cb j() {
        return super.j();
    }

    public /* bridge */ /* synthetic */ dc k() {
        return super.k();
    }

    public boolean k(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String ap = w().ap();
        w().R();
        return ap.equals(str);
    }

    public /* bridge */ /* synthetic */ db l() {
        return super.l();
    }

    public /* bridge */ /* synthetic */ com.google.android.gms.common.util.c m() {
        return super.m();
    }

    boolean m(String str) {
        return "1".equals(r().a(str, "measurement.upload.blacklist_internal"));
    }

    public /* bridge */ /* synthetic */ Context n() {
        return super.n();
    }

    boolean n(String str) {
        return "1".equals(r().a(str, "measurement.upload.blacklist_public"));
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

    public long x() {
        long nextLong;
        if (this.a.get() == 0) {
            synchronized (this.a) {
                nextLong = new Random(System.nanoTime() ^ m().a()).nextLong();
                int i = this.b + 1;
                this.b = i;
                nextLong += (long) i;
            }
        } else {
            synchronized (this.a) {
                this.a.compareAndSet(-1, 1);
                nextLong = this.a.getAndIncrement();
            }
        }
        return nextLong;
    }
}
