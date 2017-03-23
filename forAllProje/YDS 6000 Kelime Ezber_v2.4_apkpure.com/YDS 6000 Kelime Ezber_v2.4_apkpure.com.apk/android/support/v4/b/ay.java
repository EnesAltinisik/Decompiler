package android.support.v4.b;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import net.sqlcipher.database.SQLiteDatabase;

public final class ay implements Iterable<Intent> {
    private static final b a;
    private final ArrayList<Intent> b = new ArrayList();
    private final Context c;

    public interface a {
        Intent a();
    }

    interface b {
    }

    static class c implements b {
        c() {
        }
    }

    static class d implements b {
        d() {
        }
    }

    static {
        if (VERSION.SDK_INT >= 11) {
            a = new d();
        } else {
            a = new c();
        }
    }

    private ay(Context context) {
        this.c = context;
    }

    public static ay a(Context context) {
        return new ay(context);
    }

    public ay a(Activity activity) {
        Intent intent = null;
        if (activity instanceof a) {
            intent = ((a) activity).a();
        }
        Intent a = intent == null ? ac.a(activity) : intent;
        if (a != null) {
            ComponentName component = a.getComponent();
            if (component == null) {
                component = a.resolveActivity(this.c.getPackageManager());
            }
            a(component);
            a(a);
        }
        return this;
    }

    public ay a(ComponentName componentName) {
        int size = this.b.size();
        try {
            Intent a = ac.a(this.c, componentName);
            while (a != null) {
                this.b.add(size, a);
                a = ac.a(this.c, a.getComponent());
            }
            return this;
        } catch (Throwable e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    public ay a(Intent intent) {
        this.b.add(intent);
        return this;
    }

    public void a() {
        a(null);
    }

    public void a(Bundle bundle) {
        if (this.b.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.b.toArray(new Intent[this.b.size()]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (!android.support.v4.c.a.a(this.c, intentArr, bundle)) {
            Intent intent = new Intent(intentArr[intentArr.length - 1]);
            intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
            this.c.startActivity(intent);
        }
    }

    @Deprecated
    public Iterator<Intent> iterator() {
        return this.b.iterator();
    }
}
