package com.google.android.gms.dynamite;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.k;
import com.google.android.gms.common.util.DynamiteApi;
import dalvik.system.PathClassLoader;
import java.lang.reflect.Field;
import java.util.HashMap;

public final class DynamiteModule {
    public static final b a = new b() {
        public b a(Context context, String str, a aVar) {
            b bVar = new b();
            bVar.b = aVar.a(context, str, true);
            if (bVar.b != 0) {
                bVar.c = 1;
            } else {
                bVar.a = aVar.a(context, str);
                if (bVar.a != 0) {
                    bVar.c = -1;
                }
            }
            return bVar;
        }
    };
    public static final b b = new b() {
        public b a(Context context, String str, a aVar) {
            b bVar = new b();
            bVar.a = aVar.a(context, str);
            if (bVar.a != 0) {
                bVar.c = -1;
            } else {
                bVar.b = aVar.a(context, str, true);
                if (bVar.b != 0) {
                    bVar.c = 1;
                }
            }
            return bVar;
        }
    };
    public static final b c = new b() {
        public b a(Context context, String str, a aVar) {
            b bVar = new b();
            bVar.a = aVar.a(context, str);
            bVar.b = aVar.a(context, str, true);
            if (bVar.a == 0 && bVar.b == 0) {
                bVar.c = 0;
            } else if (bVar.a >= bVar.b) {
                bVar.c = -1;
            } else {
                bVar.c = 1;
            }
            return bVar;
        }
    };
    public static final b d = new b() {
        public b a(Context context, String str, a aVar) {
            b bVar = new b();
            bVar.a = aVar.a(context, str);
            bVar.b = aVar.a(context, str, true);
            if (bVar.a == 0 && bVar.b == 0) {
                bVar.c = 0;
            } else if (bVar.b >= bVar.a) {
                bVar.c = 1;
            } else {
                bVar.c = -1;
            }
            return bVar;
        }
    };
    public static final b e = new b() {
        public b a(Context context, String str, a aVar) {
            b bVar = new b();
            bVar.a = aVar.a(context, str);
            if (bVar.a != 0) {
                bVar.b = aVar.a(context, str, false);
            } else {
                bVar.b = aVar.a(context, str, true);
            }
            if (bVar.a == 0 && bVar.b == 0) {
                bVar.c = 0;
            } else if (bVar.b >= bVar.a) {
                bVar.c = 1;
            } else {
                bVar.c = -1;
            }
            return bVar;
        }
    };
    private static a f;
    private static final HashMap<String, byte[]> g = new HashMap();
    private static String h;
    private static final a i = new a() {
        public int a(Context context, String str) {
            return DynamiteModule.a(context, str);
        }

        public int a(Context context, String str, boolean z) {
            return DynamiteModule.a(context, str, z);
        }

        public DynamiteModule a(Context context, String str, int i) {
            return DynamiteModule.c(context, str, i);
        }
    };
    private static final a j = new a() {
        public int a(Context context, String str) {
            return DynamiteModule.a(context, str);
        }

        public int a(Context context, String str, boolean z) {
            return DynamiteModule.b(context, str, z);
        }

        public DynamiteModule a(Context context, String str, int i) {
            return DynamiteModule.d(context, str, i);
        }
    };
    private final Context k;

    public interface b {

        public interface a {
            int a(Context context, String str);

            int a(Context context, String str, boolean z);

            DynamiteModule a(Context context, String str, int i);
        }

        public static class b {
            public int a = 0;
            public int b = 0;
            public int c = 0;
        }

        b a(Context context, String str, a aVar);
    }

    class AnonymousClass8 implements a {
        final /* synthetic */ int a;

        AnonymousClass8(int i) {
            this.a = i;
        }

        public int a(Context context, String str) {
            return this.a;
        }

        public int a(Context context, String str, boolean z) {
            return 0;
        }

        public DynamiteModule a(Context context, String str, int i) {
            throw new a("local only VersionPolicy should not load from remote");
        }
    }

    class AnonymousClass9 extends PathClassLoader {
        AnonymousClass9(String str, ClassLoader classLoader) {
            super(str, classLoader);
        }

        protected Class<?> loadClass(String str, boolean z) {
            if (!(str.startsWith("java.") || str.startsWith("android."))) {
                try {
                    return findClass(str);
                } catch (ClassNotFoundException e) {
                }
            }
            return super.loadClass(str, z);
        }
    }

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    public static class a extends Exception {
        private a(String str) {
            super(str);
        }

        private a(String str, Throwable th) {
            super(str, th);
        }
    }

    private DynamiteModule(Context context) {
        this.k = (Context) c.a((Object) context);
    }

    public static int a(Context context, String str) {
        String valueOf;
        String valueOf2;
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            valueOf2 = String.valueOf("com.google.android.gms.dynamite.descriptors.");
            valueOf = String.valueOf("ModuleDescriptor");
            Class loadClass = classLoader.loadClass(new StringBuilder(((String.valueOf(valueOf2).length() + 1) + String.valueOf(str).length()) + String.valueOf(valueOf).length()).append(valueOf2).append(str).append(".").append(valueOf).toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (declaredField.get(null).equals(str)) {
                return declaredField2.getInt(null);
            }
            valueOf2 = String.valueOf(declaredField.get(null));
            Log.e("DynamiteModule", new StringBuilder((String.valueOf(valueOf2).length() + 51) + String.valueOf(str).length()).append("Module descriptor id '").append(valueOf2).append("' didn't match expected id '").append(str).append("'").toString());
            return 0;
        } catch (ClassNotFoundException e) {
            Log.w("DynamiteModule", new StringBuilder(String.valueOf(str).length() + 45).append("Local module descriptor class for ").append(str).append(" not found.").toString());
            return 0;
        } catch (Exception e2) {
            valueOf2 = "DynamiteModule";
            valueOf = "Failed to load module descriptor class: ";
            String valueOf3 = String.valueOf(e2.getMessage());
            Log.e(valueOf2, valueOf3.length() != 0 ? valueOf.concat(valueOf3) : new String(valueOf));
            return 0;
        }
    }

    public static int a(Context context, String str, boolean z) {
        a a = a(context);
        if (a == null) {
            return 0;
        }
        try {
            return a.a(com.google.android.gms.a.b.a((Object) context), str, z);
        } catch (RemoteException e) {
            String str2 = "DynamiteModule";
            String str3 = "Failed to retrieve remote module version: ";
            String valueOf = String.valueOf(e.getMessage());
            Log.w(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            return 0;
        }
    }

    private static Context a(Context context, String str, byte[] bArr, String str2) {
        if (str2 == null || str2.isEmpty()) {
            Log.e("DynamiteModule", "No valid DynamiteLoader APK path");
            return null;
        }
        try {
            return (Context) com.google.android.gms.a.b.a(com.google.android.gms.dynamite.b.a.a((IBinder) c(context, str2).loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0])).a(com.google.android.gms.a.b.a((Object) context), str, bArr));
        } catch (Exception e) {
            String str3 = "DynamiteModule";
            String str4 = "Failed to load DynamiteLoader: ";
            String valueOf = String.valueOf(e.toString());
            Log.e(str3, valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4));
            return null;
        }
    }

    public static DynamiteModule a(Context context, b bVar, String str) {
        if ("com.google.android.gms".equals(context.getApplicationContext().getPackageName())) {
            return a(context, bVar, str, i);
        }
        try {
            return a(context, bVar, str, j);
        } catch (a e) {
            String str2 = "DynamiteModule";
            String str3 = "Failed to load module via fast route";
            String valueOf = String.valueOf(e.toString());
            Log.w(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            return a(context, bVar, str, i);
        }
    }

    public static DynamiteModule a(Context context, b bVar, String str, a aVar) {
        b a = bVar.a(context, str, aVar);
        Log.i("DynamiteModule", new StringBuilder((String.valueOf(str).length() + 68) + String.valueOf(str).length()).append("Considering local module ").append(str).append(":").append(a.a).append(" and remote module ").append(str).append(":").append(a.b).toString());
        if (a.c == 0 || ((a.c == -1 && a.a == 0) || (a.c == 1 && a.b == 0))) {
            throw new a("No acceptable module found. Local version is " + a.a + " and remote version is " + a.b + ".");
        } else if (a.c == -1) {
            return b(context, str);
        } else {
            if (a.c == 1) {
                try {
                    return aVar.a(context, str, a.b);
                } catch (Throwable e) {
                    Throwable th = e;
                    String str2 = "DynamiteModule";
                    String str3 = "Failed to load remote module: ";
                    String valueOf = String.valueOf(th.getMessage());
                    Log.w(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
                    if (a.a != 0 && bVar.a(context, str, new AnonymousClass8(a.a)).c == -1) {
                        return b(context, str);
                    }
                    throw new a("Remote load failed. No local fallback found.", th);
                }
            }
            throw new a("VersionPolicy returned invalid code:" + a.c);
        }
    }

    private static a a(Context context) {
        synchronized (DynamiteModule.class) {
            a aVar;
            if (f != null) {
                aVar = f;
                return aVar;
            } else if (k.b().a(context) != 0) {
                return null;
            } else {
                try {
                    aVar = com.google.android.gms.dynamite.a.a.a((IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance());
                    if (aVar != null) {
                        f = aVar;
                        return aVar;
                    }
                } catch (Exception e) {
                    String str = "DynamiteModule";
                    String str2 = "Failed to load IDynamiteLoader from GmsCore: ";
                    String valueOf = String.valueOf(e.getMessage());
                    Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                    return null;
                }
            }
        }
    }

    public static int b(Context context, String str, boolean z) {
        String str2;
        Throwable e;
        Cursor cursor;
        Cursor cursor2 = null;
        if (z) {
            try {
                str2 = "api_force_staging";
            } catch (Exception e2) {
                e = e2;
                cursor = null;
                try {
                    if (e instanceof a) {
                        throw e;
                    }
                    throw new a("V2 version check failed", e);
                } catch (Throwable th) {
                    e = th;
                    cursor2 = cursor;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    throw e;
                }
            } catch (Throwable th2) {
                e = th2;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw e;
            }
        }
        str2 = "api";
        String valueOf = String.valueOf("content://com.google.android.gms.chimera/");
        Uri parse = Uri.parse(new StringBuilder(((String.valueOf(valueOf).length() + 1) + String.valueOf(str2).length()) + String.valueOf(str).length()).append(valueOf).append(str2).append("/").append(str).toString());
        if (context != null) {
            ContentResolver contentResolver = context.getContentResolver();
            if (contentResolver != null) {
                cursor = contentResolver.query(parse, null, null, null, null);
                if (cursor != null) {
                    try {
                        if (cursor.moveToFirst()) {
                            int i = cursor.getInt(0);
                            if (i > 0) {
                                synchronized (DynamiteModule.class) {
                                    g.put(new StringBuilder(String.valueOf(str).length() + 12).append(str).append(":").append(i).toString(), Base64.decode(cursor.getString(3), 0));
                                    h = cursor.getString(2);
                                }
                            }
                            if (cursor != null) {
                                cursor.close();
                            }
                            return i;
                        }
                    } catch (Exception e3) {
                        e = e3;
                    }
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new a("Failed to connect to dynamite module ContentResolver.");
            }
        }
        throw new a("Failed to get dynamite module ContentResolver.");
    }

    private static DynamiteModule b(Context context, String str) {
        String str2 = "DynamiteModule";
        String str3 = "Selected local version of ";
        String valueOf = String.valueOf(str);
        Log.i(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
        return new DynamiteModule(context.getApplicationContext());
    }

    private static DynamiteModule c(Context context, String str, int i) {
        Log.i("DynamiteModule", new StringBuilder(String.valueOf(str).length() + 51).append("Selected remote version of ").append(str).append(", version >= ").append(i).toString());
        a a = a(context);
        if (a == null) {
            throw new a("Failed to create IDynamiteLoader.");
        }
        try {
            com.google.android.gms.a.a a2 = a.a(com.google.android.gms.a.b.a((Object) context), str, i);
            if (com.google.android.gms.a.b.a(a2) != null) {
                return new DynamiteModule((Context) com.google.android.gms.a.b.a(a2));
            }
            throw new a("Failed to load remote module.");
        } catch (Throwable e) {
            throw new a("Failed to load remote module.", e);
        }
    }

    private static ClassLoader c(Context context, String str) {
        ClassLoader classLoader;
        synchronized (DynamiteLoaderClassLoader.class) {
            if (DynamiteLoaderClassLoader.sClassLoader != null) {
                classLoader = DynamiteLoaderClassLoader.sClassLoader;
            } else {
                Class loadClass = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName());
                Field declaredField = loadClass.getDeclaredField("sClassLoader");
                synchronized (loadClass) {
                    DynamiteLoaderClassLoader.sClassLoader = (ClassLoader) declaredField.get(null);
                    if (DynamiteLoaderClassLoader.sClassLoader != null) {
                        classLoader = DynamiteLoaderClassLoader.sClassLoader;
                    } else {
                        DynamiteLoaderClassLoader.sClassLoader = new AnonymousClass9(str, ClassLoader.getSystemClassLoader());
                        declaredField.set(null, DynamiteLoaderClassLoader.sClassLoader);
                        classLoader = DynamiteLoaderClassLoader.sClassLoader;
                    }
                }
            }
        }
        return classLoader;
    }

    private static DynamiteModule d(Context context, String str, int i) {
        Log.i("DynamiteModule", new StringBuilder(String.valueOf(str).length() + 51).append("Selected remote version of ").append(str).append(", version >= ").append(i).toString());
        synchronized (DynamiteModule.class) {
            byte[] bArr = (byte[]) g.get(new StringBuilder(String.valueOf(str).length() + 12).append(str).append(":").append(i).toString());
            String str2 = h;
        }
        if (bArr == null) {
            throw new a("Module implementation could not be found.");
        }
        Context a = a(context.getApplicationContext(), str, bArr, str2);
        if (a != null) {
            return new DynamiteModule(a);
        }
        throw new a("Failed to get module context");
    }

    public Context a() {
        return this.k;
    }

    public IBinder a(String str) {
        Throwable e;
        String str2;
        String valueOf;
        try {
            return (IBinder) this.k.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException e2) {
            e = e2;
            str2 = "Failed to instantiate module class: ";
            valueOf = String.valueOf(str);
            throw new a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), e);
        } catch (InstantiationException e3) {
            e = e3;
            str2 = "Failed to instantiate module class: ";
            valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
            }
            throw new a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), e);
        } catch (IllegalAccessException e4) {
            e = e4;
            str2 = "Failed to instantiate module class: ";
            valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
            }
            throw new a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), e);
        }
    }
}
