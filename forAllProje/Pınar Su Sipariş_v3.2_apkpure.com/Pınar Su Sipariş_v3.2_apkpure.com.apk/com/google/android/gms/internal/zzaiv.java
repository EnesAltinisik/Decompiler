package com.google.android.gms.internal;

import android.util.Base64;
import com.adjust.sdk.Constants;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.DatabaseReference.CompletionListener;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

public class zzaiv {

    class AnonymousClass1 implements CompletionListener {
        final /* synthetic */ TaskCompletionSource a;

        AnonymousClass1(TaskCompletionSource taskCompletionSource) {
            this.a = taskCompletionSource;
        }

        public void onComplete(DatabaseError databaseError, DatabaseReference databaseReference) {
            if (databaseError != null) {
                this.a.setException(databaseError.toException());
            } else {
                this.a.setResult(null);
            }
        }
    }

    public static int zzC(int i, int i2) {
        return i < i2 ? -1 : i == i2 ? 0 : 1;
    }

    public static void zzaN(boolean z) {
        zzb(z, "");
    }

    public static zzais<Task<Void>, CompletionListener> zzb(CompletionListener completionListener) {
        if (completionListener != null) {
            return new zzais(null, completionListener);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        return new zzais(taskCompletionSource.getTask(), new AnonymousClass1(taskCompletionSource));
    }

    public static void zzb(boolean z, String str) {
        if (!z) {
            String str2 = "hardAssert failed: ";
            String valueOf = String.valueOf(str);
            throw new AssertionError(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
    }

    public static int zzf(long j, long j2) {
        return j < j2 ? -1 : j == j2 ? 0 : 1;
    }

    public static zzait zzil(String str) throws DatabaseException {
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
                        stringBuilder.append(URLEncoder.encode(split[i], Constants.ENCODING));
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
            zzaiw.zzir(valueOf);
            zzafa com_google_android_gms_internal_zzafa = new zzafa(valueOf);
            valueOf = uri.getScheme();
            zzafd com_google_android_gms_internal_zzafd = new zzafd();
            com_google_android_gms_internal_zzafd.zzbJa = uri.getHost().toLowerCase();
            indexOf = uri.getPort();
            if (indexOf != -1) {
                com_google_android_gms_internal_zzafd.zzbJb = valueOf.equals(Constants.SCHEME);
                valueOf = String.valueOf(com_google_android_gms_internal_zzafd.zzbJa);
                com_google_android_gms_internal_zzafd.zzbJa = new StringBuilder(String.valueOf(valueOf).length() + 12).append(valueOf).append(":").append(indexOf).toString();
            } else {
                com_google_android_gms_internal_zzafd.zzbJb = true;
            }
            com_google_android_gms_internal_zzafd.zzasB = com_google_android_gms_internal_zzafd.zzbJa.split("\\.")[0].toLowerCase();
            com_google_android_gms_internal_zzafd.zzbMV = com_google_android_gms_internal_zzafd.zzbJa;
            zzait com_google_android_gms_internal_zzait = new zzait();
            com_google_android_gms_internal_zzait.zzbHw = com_google_android_gms_internal_zzafa;
            com_google_android_gms_internal_zzait.zzbHm = com_google_android_gms_internal_zzafd;
            return com_google_android_gms_internal_zzait;
        } catch (Throwable e) {
            throw new DatabaseException("Invalid Firebase Database url specified", e);
        } catch (Throwable e2) {
            throw new DatabaseException("Failed to URLEncode the path", e2);
        }
    }

    public static String zzim(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance(Constants.SHA1);
            instance.update(str.getBytes(Constants.ENCODING));
            return Base64.encodeToString(instance.digest(), 2);
        } catch (Throwable e) {
            throw new RuntimeException("Missing SHA-1 MessageDigest provider.", e);
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("UTF-8 encoding is required for Firebase Database to run!");
        }
    }

    public static String zzin(String str) {
        String replace = str.indexOf(92) != -1 ? str.replace("\\", "\\\\") : str;
        if (str.indexOf(34) != -1) {
            replace = replace.replace("\"", "\\\"");
        }
        return new StringBuilder(String.valueOf(replace).length() + 2).append("\"").append(replace).append("\"").toString();
    }

    public static Integer zzio(String str) {
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
Method generation error in method: com.google.android.gms.internal.zzaiv.zzio(java.lang.String):java.lang.Integer
jadx.core.utils.exceptions.CodegenException: Error generate insn: PHI: (r1_3 'i2' int) = (r1_2 'i2' int), (r1_0 'i2' int) binds: {(r1_2 'i2' int)=B:10:0x0023, (r1_0 'i2' int)=B:29:0x0066} in method: com.google.android.gms.internal.zzaiv.zzio(java.lang.String):java.lang.Integer
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

        public static String zzn(double d) {
            StringBuilder stringBuilder = new StringBuilder(16);
            ByteBuffer.wrap(new byte[8]).putDouble(d);
            for (int i = 0; i < 8; i++) {
                stringBuilder.append(String.format("%02x", new Object[]{Byte.valueOf(r3[i])}));
            }
            return stringBuilder.toString();
        }
    }
