package a.a.a.a.a.b;

import a.a.a.a.a.a.b;
import a.a.a.a.a.a.d;
import a.a.a.a.c;
import android.content.Context;

/* compiled from: InstallerPackageNameProvider */
public class p {
    private final d<String> a = new d<String>(this) {
        final /* synthetic */ p a;

        {
            this.a = r1;
        }

        public /* synthetic */ Object load(Context context) throws Exception {
            return a(context);
        }

        public String a(Context context) throws Exception {
            String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
            return installerPackageName == null ? "" : installerPackageName;
        }
    };
    private final b<String> b = new b();

    public String a(Context context) {
        try {
            String str = (String) this.b.a(context, this.a);
            if ("".equals(str)) {
                return null;
            }
            return str;
        } catch (Throwable e) {
            c.h().e("Fabric", "Failed to determine installer package name", e);
            return null;
        }
    }
}
