package com.google.android.gms.b;

import android.util.Base64;
import com.google.android.gms.c.e;
import com.google.firebase.database.b;
import com.google.firebase.database.c;
import com.google.firebase.database.d;
import com.google.firebase.database.d.a;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.security.MessageDigest;

public class kt {
    private static final char[] a = "0123456789abcdef".toCharArray();

    class AnonymousClass1 implements a {
        final /* synthetic */ e a;

        AnonymousClass1(e eVar) {
            this.a = eVar;
        }

        public void a(b bVar, d dVar) {
            if (bVar != null) {
                this.a.a(bVar.b());
            } else {
                this.a.a(null);
            }
        }
    }

    public static int a(int i, int i2) {
        return i < i2 ? -1 : i == i2 ? 0 : 1;
    }

    public static int a(long j, long j2) {
        return j < j2 ? -1 : j == j2 ? 0 : 1;
    }

    public static kr<com.google.android.gms.c.d<Void>, a> a(a aVar) {
        if (aVar != null) {
            return new kr(null, aVar);
        }
        e eVar = new e();
        return new kr(eVar.a(), new AnonymousClass1(eVar));
    }

    public static ks a(String str) {
        try {
            int indexOf = str.indexOf("//");
            if (indexOf == -1) {
                throw new URISyntaxException(str, "Invalid scheme specified");
            }
            String valueOf;
            int indexOf2 = str.substring(indexOf + 2).indexOf("/");
            if (indexOf2 != -1) {
                indexOf = (indexOf + 2) + indexOf2;
                String[] split = str.substring(indexOf).split("/");
                StringBuilder stringBuilder = new StringBuilder();
                for (int i = 0; i < split.length; i++) {
                    if (!split[i].equals("")) {
                        stringBuilder.append("/");
                        stringBuilder.append(URLEncoder.encode(split[i], "UTF-8"));
                    }
                }
                String valueOf2 = String.valueOf(str.substring(0, indexOf));
                valueOf = String.valueOf(stringBuilder.toString());
                valueOf = valueOf.length() != 0 ? valueOf2.concat(valueOf) : new String(valueOf2);
            } else {
                valueOf = str;
            }
            URI uri = new URI(valueOf);
            valueOf = uri.getPath().replace("+", " ");
            ku.b(valueOf);
            gx gxVar = new gx(valueOf);
            valueOf = uri.getScheme();
            ha haVar = new ha();
            haVar.a = uri.getHost().toLowerCase();
            indexOf = uri.getPort();
            if (indexOf != -1) {
                haVar.b = valueOf.equals("https");
                valueOf = String.valueOf(haVar.a);
                haVar.a = new StringBuilder(String.valueOf(valueOf).length() + 12).append(valueOf).append(":").append(indexOf).toString();
            } else {
                haVar.b = true;
            }
            haVar.c = haVar.a.split("\\.")[0].toLowerCase();
            haVar.d = haVar.a;
            ks ksVar = new ks();
            ksVar.b = gxVar;
            ksVar.a = haVar;
            return ksVar;
        } catch (Throwable e) {
            throw new c("Invalid Firebase Database url specified", e);
        } catch (Throwable e2) {
            throw new c("Failed to URLEncode the path", e2);
        }
    }

    public static String a(double d) {
        StringBuilder stringBuilder = new StringBuilder(16);
        long doubleToLongBits = Double.doubleToLongBits(d);
        for (int i = 7; i >= 0; i--) {
            int i2 = (int) ((doubleToLongBits >>> (i * 8)) & 255);
            int i3 = (i2 >> 4) & 15;
            i2 &= 15;
            stringBuilder.append(a[i3]);
            stringBuilder.append(a[i2]);
        }
        return stringBuilder.toString();
    }

    public static void a(boolean z) {
        a(z, "");
    }

    public static void a(boolean z, String str) {
        if (!z) {
            String str2 = "hardAssert failed: ";
            String valueOf = String.valueOf(str);
            throw new AssertionError(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
    }

    public static String b(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-1");
            instance.update(str.getBytes("UTF-8"));
            return Base64.encodeToString(instance.digest(), 2);
        } catch (Throwable e) {
            throw new RuntimeException("Missing SHA-1 MessageDigest provider.", e);
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("UTF-8 encoding is required for Firebase Database to run!");
        }
    }

    public static String c(String str) {
        String replace = str.indexOf(92) != -1 ? str.replace("\\", "\\\\") : str;
        if (str.indexOf(34) != -1) {
            replace = replace.replace("\"", "\\\"");
        }
        return new StringBuilder(String.valueOf(replace).length() + 2).append("\"").append(replace).append("\"").toString();
    }

    public static Integer d(String str) {
        int i = 1;
        int i2 = 0;
        if (str.length() > 11 || str.length() == 0) {
            return null;
        }
        if (str.charAt(0) != '-') {
            i = 0;
        } else if (str.length() == 1) {
            return null;
        } else {
            i2 = 1;
        }
        long j = 0;
        for (i2 = 
/*
Method generation error in method: com.google.android.gms.b.kt.d(java.lang.String):java.lang.Integer
jadx.core.utils.exceptions.CodegenException: Error generate insn: PHI: (r1_3 'i2' int) = (r1_2 'i2' int), (r1_0 'i2' int) binds: {(r1_2 'i2' int)=B:10:0x0023, (r1_0 'i2' int)=B:29:0x0066} in method: com.google.android.gms.b.kt.d(java.lang.String):java.lang.Integer
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:226)
	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:184)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:61)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:183)
	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:328)
	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:265)
	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:228)
	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:118)
	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:83)
	at jadx.core.codegen.CodeGen.visit(CodeGen.java:19)
	at jadx.core.ProcessClass.process(ProcessClass.java:43)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
Caused by: jadx.core.utils.exceptions.CodegenException: PHI can be used only in fallback mode
	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:530)
	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:514)
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:220)
	... 19 more

*/
    }
