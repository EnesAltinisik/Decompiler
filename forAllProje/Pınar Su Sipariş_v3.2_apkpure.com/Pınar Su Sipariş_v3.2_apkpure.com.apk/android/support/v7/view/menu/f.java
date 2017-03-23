package android.support.v7.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.view.d;
import android.support.v4.view.q;
import android.util.SparseArray;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyCharacterMap.KeyData;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import com.google.android.gms.games.request.GameRequest;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: MenuBuilder */
public class f implements android.support.v4.e.a.a {
    private static final int[] d = new int[]{1, 4, 5, 3, 2, 0};
    CharSequence a;
    Drawable b;
    View c;
    private final Context e;
    private final Resources f;
    private boolean g;
    private boolean h;
    private a i;
    private ArrayList<h> j;
    private ArrayList<h> k;
    private boolean l;
    private ArrayList<h> m;
    private ArrayList<h> n;
    private boolean o;
    private int p = 0;
    private ContextMenuInfo q;
    private boolean r = false;
    private boolean s = false;
    private boolean t = false;
    private boolean u = false;
    private ArrayList<h> v = new ArrayList();
    private CopyOnWriteArrayList<WeakReference<l>> w = new CopyOnWriteArrayList();
    private h x;
    private boolean y;

    /* compiled from: MenuBuilder */
    public interface a {
        boolean onMenuItemSelected(f fVar, MenuItem menuItem);

        void onMenuModeChange(f fVar);
    }

    /* compiled from: MenuBuilder */
    public interface b {
        boolean a(h hVar);
    }

    public f(Context context) {
        this.e = context;
        this.f = context.getResources();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = true;
        this.m = new ArrayList();
        this.n = new ArrayList();
        this.o = true;
        e(true);
    }

    public f a(int i) {
        this.p = i;
        return this;
    }

    public void a(l lVar) {
        a(lVar, this.e);
    }

    public void a(l lVar, Context context) {
        this.w.add(new WeakReference(lVar));
        lVar.a(context, this);
        this.o = true;
    }

    public void b(l lVar) {
        Iterator it = this.w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            l lVar2 = (l) weakReference.get();
            if (lVar2 == null || lVar2 == lVar) {
                this.w.remove(weakReference);
            }
        }
    }

    private void d(boolean z) {
        if (!this.w.isEmpty()) {
            g();
            Iterator it = this.w.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                l lVar = (l) weakReference.get();
                if (lVar == null) {
                    this.w.remove(weakReference);
                } else {
                    lVar.b(z);
                }
            }
            h();
        }
    }

    private boolean a(p pVar, l lVar) {
        boolean z = false;
        if (this.w.isEmpty()) {
            return false;
        }
        if (lVar != null) {
            z = lVar.a(pVar);
        }
        Iterator it = this.w.iterator();
        boolean z2 = z;
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            l lVar2 = (l) weakReference.get();
            if (lVar2 == null) {
                this.w.remove(weakReference);
                z = z2;
            } else if (z2) {
                z = z2;
            } else {
                z = lVar2.a(pVar);
            }
            z2 = z;
        }
        return z2;
    }

    private void e(Bundle bundle) {
        if (!this.w.isEmpty()) {
            SparseArray sparseArray = new SparseArray();
            Iterator it = this.w.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                l lVar = (l) weakReference.get();
                if (lVar == null) {
                    this.w.remove(weakReference);
                } else {
                    int c = lVar.c();
                    if (c > 0) {
                        Parcelable d = lVar.d();
                        if (d != null) {
                            sparseArray.put(c, d);
                        }
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        }
    }

    private void f(Bundle bundle) {
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null && !this.w.isEmpty()) {
            Iterator it = this.w.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                l lVar = (l) weakReference.get();
                if (lVar == null) {
                    this.w.remove(weakReference);
                } else {
                    int c = lVar.c();
                    if (c > 0) {
                        Parcelable parcelable = (Parcelable) sparseParcelableArray.get(c);
                        if (parcelable != null) {
                            lVar.a(parcelable);
                        }
                    }
                }
            }
        }
    }

    public void a(Bundle bundle) {
        e(bundle);
    }

    public void b(Bundle bundle) {
        f(bundle);
    }

    public void c(Bundle bundle) {
        int size = size();
        int i = 0;
        SparseArray sparseArray = null;
        while (i < size) {
            MenuItem item = getItem(i);
            View a = q.a(item);
            if (!(a == null || a.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                a.saveHierarchyState(sparseArray);
                if (q.c(item)) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            SparseArray sparseArray2 = sparseArray;
            if (item.hasSubMenu()) {
                ((p) item.getSubMenu()).c(bundle);
            }
            i++;
            sparseArray = sparseArray2;
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(a(), sparseArray);
        }
    }

    public void d(Bundle bundle) {
        if (bundle != null) {
            MenuItem item;
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(a());
            int size = size();
            for (int i = 0; i < size; i++) {
                item = getItem(i);
                View a = q.a(item);
                if (!(a == null || a.getId() == -1)) {
                    a.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((p) item.getSubMenu()).d(bundle);
                }
            }
            int i2 = bundle.getInt("android:menu:expandedactionview");
            if (i2 > 0) {
                item = findItem(i2);
                if (item != null) {
                    q.b(item);
                }
            }
        }
    }

    protected String a() {
        return "android:menu:actionviewstates";
    }

    public void a(a aVar) {
        this.i = aVar;
    }

    protected MenuItem a(int i, int i2, int i3, CharSequence charSequence) {
        int d = d(i3);
        MenuItem a = a(i, i2, i3, d, charSequence, this.p);
        if (this.q != null) {
            a.a(this.q);
        }
        this.j.add(a(this.j, d), a);
        b(true);
        return a;
    }

    private h a(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        return new h(this, i, i2, i3, i4, charSequence, i5);
    }

    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    public MenuItem add(int i) {
        return a(0, 0, 0, this.f.getString(i));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return a(i, i2, i3, charSequence);
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return a(i, i2, i3, this.f.getString(i4));
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f.getString(i));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        h hVar = (h) a(i, i2, i3, charSequence);
        p pVar = new p(this.e, this, hVar);
        hVar.a(pVar);
        return pVar;
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f.getString(i4));
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        PackageManager packageManager = this.e.getPackageManager();
        List queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i5 = 0; i5 < size; i5++) {
            Intent intent2;
            ResolveInfo resolveInfo = (ResolveInfo) queryIntentActivityOptions.get(i5);
            if (resolveInfo.specificIndex < 0) {
                intent2 = intent;
            } else {
                intent2 = intentArr[resolveInfo.specificIndex];
            }
            Intent intent3 = new Intent(intent2);
            intent3.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            MenuItem intent4 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent3);
            if (menuItemArr != null && resolveInfo.specificIndex >= 0) {
                menuItemArr[resolveInfo.specificIndex] = intent4;
            }
        }
        return size;
    }

    public void removeItem(int i) {
        a(b(i), true);
    }

    public void removeGroup(int i) {
        int c = c(i);
        if (c >= 0) {
            int size = this.j.size() - c;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= size || ((h) this.j.get(c)).getGroupId() != i) {
                    b(true);
                } else {
                    a(c, false);
                    i2 = i3;
                }
            }
            b(true);
        }
    }

    private void a(int i, boolean z) {
        if (i >= 0 && i < this.j.size()) {
            this.j.remove(i);
            if (z) {
                b(true);
            }
        }
    }

    public void clear() {
        if (this.x != null) {
            d(this.x);
        }
        this.j.clear();
        b(true);
    }

    void a(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.j.size();
        for (int i = 0; i < size; i++) {
            MenuItem menuItem2 = (h) this.j.get(i);
            if (menuItem2.getGroupId() == groupId && menuItem2.g() && menuItem2.isCheckable()) {
                menuItem2.b(menuItem2 == menuItem);
            }
        }
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.j.size();
        for (int i2 = 0; i2 < size; i2++) {
            h hVar = (h) this.j.get(i2);
            if (hVar.getGroupId() == i) {
                hVar.a(z2);
                hVar.setCheckable(z);
            }
        }
    }

    public void setGroupVisible(int i, boolean z) {
        int size = this.j.size();
        int i2 = 0;
        boolean z2 = false;
        while (i2 < size) {
            boolean z3;
            h hVar = (h) this.j.get(i2);
            if (hVar.getGroupId() == i && hVar.c(z)) {
                z3 = true;
            } else {
                z3 = z2;
            }
            i2++;
            z2 = z3;
        }
        if (z2) {
            b(true);
        }
    }

    public void setGroupEnabled(int i, boolean z) {
        int size = this.j.size();
        for (int i2 = 0; i2 < size; i2++) {
            h hVar = (h) this.j.get(i2);
            if (hVar.getGroupId() == i) {
                hVar.setEnabled(z);
            }
        }
    }

    public boolean hasVisibleItems() {
        if (this.y) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (((h) this.j.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public MenuItem findItem(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            h hVar = (h) this.j.get(i2);
            if (hVar.getItemId() == i) {
                return hVar;
            }
            if (hVar.hasSubMenu()) {
                MenuItem findItem = hVar.getSubMenu().findItem(i);
                if (findItem != null) {
                    return findItem;
                }
            }
        }
        return null;
    }

    public int b(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((h) this.j.get(i2)).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    public int c(int i) {
        return a(i, 0);
    }

    public int a(int i, int i2) {
        int size = size();
        if (i2 < 0) {
            i2 = 0;
        }
        for (int i3 = i2; i3 < size; i3++) {
            if (((h) this.j.get(i3)).getGroupId() == i) {
                return i3;
            }
        }
        return -1;
    }

    public int size() {
        return this.j.size();
    }

    public MenuItem getItem(int i) {
        return (MenuItem) this.j.get(i);
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return a(i, keyEvent) != null;
    }

    public void setQwertyMode(boolean z) {
        this.g = z;
        b(false);
    }

    private static int d(int i) {
        int i2 = (-65536 & i) >> 16;
        if (i2 >= 0 && i2 < d.length) {
            return (d[i2] << 16) | (GameRequest.TYPE_ALL & i);
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    boolean b() {
        return this.g;
    }

    private void e(boolean z) {
        boolean z2 = true;
        if (!(z && this.f.getConfiguration().keyboard != 1 && this.f.getBoolean(android.support.v7.a.a.b.abc_config_showMenuShortcutsWhenKeyboardPresent))) {
            z2 = false;
        }
        this.h = z2;
    }

    public boolean c() {
        return this.h;
    }

    Resources d() {
        return this.f;
    }

    public Context e() {
        return this.e;
    }

    boolean a(f fVar, MenuItem menuItem) {
        return this.i != null && this.i.onMenuItemSelected(fVar, menuItem);
    }

    public void f() {
        if (this.i != null) {
            this.i.onMenuModeChange(this);
        }
    }

    private static int a(ArrayList<h> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((h) arrayList.get(size)).c() <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        MenuItem a = a(i, keyEvent);
        boolean z = false;
        if (a != null) {
            z = a(a, i2);
        }
        if ((i2 & 2) != 0) {
            a(true);
        }
        return z;
    }

    void a(List<h> list, int i, KeyEvent keyEvent) {
        boolean b = b();
        int metaState = keyEvent.getMetaState();
        KeyData keyData = new KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.j.size();
            for (int i2 = 0; i2 < size; i2++) {
                h hVar = (h) this.j.get(i2);
                if (hVar.hasSubMenu()) {
                    ((f) hVar.getSubMenu()).a((List) list, i, keyEvent);
                }
                char alphabeticShortcut = b ? hVar.getAlphabeticShortcut() : hVar.getNumericShortcut();
                if ((metaState & 5) == 0 && alphabeticShortcut != '\u0000' && ((alphabeticShortcut == keyData.meta[0] || alphabeticShortcut == keyData.meta[2] || (b && alphabeticShortcut == '\b' && i == 67)) && hVar.isEnabled())) {
                    list.add(hVar);
                }
            }
        }
    }

    h a(int i, KeyEvent keyEvent) {
        List list = this.v;
        list.clear();
        a(list, i, keyEvent);
        if (list.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyData keyData = new KeyData();
        keyEvent.getKeyData(keyData);
        int size = list.size();
        if (size == 1) {
            return (h) list.get(0);
        }
        boolean b = b();
        for (int i2 = 0; i2 < size; i2++) {
            h hVar = (h) list.get(i2);
            char alphabeticShortcut = b ? hVar.getAlphabeticShortcut() : hVar.getNumericShortcut();
            if (alphabeticShortcut == keyData.meta[0] && (metaState & 2) == 0) {
                return hVar;
            }
            if (alphabeticShortcut == keyData.meta[2] && (metaState & 2) != 0) {
                return hVar;
            }
            if (b && alphabeticShortcut == '\b' && i == 67) {
                return hVar;
            }
        }
        return null;
    }

    public boolean performIdentifierAction(int i, int i2) {
        return a(findItem(i), i2);
    }

    public boolean a(MenuItem menuItem, int i) {
        return a(menuItem, null, i);
    }

    public boolean a(MenuItem menuItem, l lVar, int i) {
        h hVar = (h) menuItem;
        if (hVar == null || !hVar.isEnabled()) {
            return false;
        }
        boolean z;
        boolean b = hVar.b();
        d a = hVar.a();
        if (a == null || !a.hasSubMenu()) {
            z = false;
        } else {
            z = true;
        }
        boolean expandActionView;
        if (hVar.n()) {
            expandActionView = hVar.expandActionView() | b;
            if (!expandActionView) {
                return expandActionView;
            }
            a(true);
            return expandActionView;
        } else if (hVar.hasSubMenu() || z) {
            a(false);
            if (!hVar.hasSubMenu()) {
                hVar.a(new p(e(), this, hVar));
            }
            p pVar = (p) hVar.getSubMenu();
            if (z) {
                a.onPrepareSubMenu(pVar);
            }
            expandActionView = a(pVar, lVar) | b;
            if (expandActionView) {
                return expandActionView;
            }
            a(true);
            return expandActionView;
        } else {
            if ((i & 1) == 0) {
                a(true);
            }
            return b;
        }
    }

    public final void a(boolean z) {
        if (!this.u) {
            this.u = true;
            Iterator it = this.w.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                l lVar = (l) weakReference.get();
                if (lVar == null) {
                    this.w.remove(weakReference);
                } else {
                    lVar.a(this, z);
                }
            }
            this.u = false;
        }
    }

    public void close() {
        a(true);
    }

    public void b(boolean z) {
        if (this.r) {
            this.s = true;
            return;
        }
        if (z) {
            this.l = true;
            this.o = true;
        }
        d(z);
    }

    public void g() {
        if (!this.r) {
            this.r = true;
            this.s = false;
        }
    }

    public void h() {
        this.r = false;
        if (this.s) {
            this.s = false;
            b(true);
        }
    }

    void a(h hVar) {
        this.l = true;
        b(true);
    }

    void b(h hVar) {
        this.o = true;
        b(true);
    }

    public ArrayList<h> i() {
        if (!this.l) {
            return this.k;
        }
        this.k.clear();
        int size = this.j.size();
        for (int i = 0; i < size; i++) {
            h hVar = (h) this.j.get(i);
            if (hVar.isVisible()) {
                this.k.add(hVar);
            }
        }
        this.l = false;
        this.o = true;
        return this.k;
    }

    public void j() {
        ArrayList i = i();
        if (this.o) {
            Iterator it = this.w.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                int i3;
                WeakReference weakReference = (WeakReference) it.next();
                l lVar = (l) weakReference.get();
                if (lVar == null) {
                    this.w.remove(weakReference);
                    i3 = i2;
                } else {
                    i3 = lVar.b() | i2;
                }
                i2 = i3;
            }
            if (i2 != 0) {
                this.m.clear();
                this.n.clear();
                i2 = i.size();
                for (int i4 = 0; i4 < i2; i4++) {
                    h hVar = (h) i.get(i4);
                    if (hVar.j()) {
                        this.m.add(hVar);
                    } else {
                        this.n.add(hVar);
                    }
                }
            } else {
                this.m.clear();
                this.n.clear();
                this.n.addAll(i());
            }
            this.o = false;
        }
    }

    public ArrayList<h> k() {
        j();
        return this.m;
    }

    public ArrayList<h> l() {
        j();
        return this.n;
    }

    public void clearHeader() {
        this.b = null;
        this.a = null;
        this.c = null;
        b(false);
    }

    private void a(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources d = d();
        if (view != null) {
            this.c = view;
            this.a = null;
            this.b = null;
        } else {
            if (i > 0) {
                this.a = d.getText(i);
            } else if (charSequence != null) {
                this.a = charSequence;
            }
            if (i2 > 0) {
                this.b = android.support.v4.b.b.getDrawable(e(), i2);
            } else if (drawable != null) {
                this.b = drawable;
            }
            this.c = null;
        }
        b(false);
    }

    protected f a(CharSequence charSequence) {
        a(0, charSequence, 0, null, null);
        return this;
    }

    protected f a(Drawable drawable) {
        a(0, null, 0, drawable, null);
        return this;
    }

    protected f a(View view) {
        a(0, null, 0, null, view);
        return this;
    }

    public CharSequence m() {
        return this.a;
    }

    public Drawable n() {
        return this.b;
    }

    public View o() {
        return this.c;
    }

    public f p() {
        return this;
    }

    boolean q() {
        return this.t;
    }

    public boolean c(h hVar) {
        boolean z = false;
        if (!this.w.isEmpty()) {
            g();
            Iterator it = this.w.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                l lVar = (l) weakReference.get();
                if (lVar == null) {
                    this.w.remove(weakReference);
                    z = z2;
                } else {
                    z = lVar.a(this, hVar);
                    if (z) {
                        break;
                    }
                }
                z2 = z;
            }
            z = z2;
            h();
            if (z) {
                this.x = hVar;
            }
        }
        return z;
    }

    public boolean d(h hVar) {
        boolean z = false;
        if (!this.w.isEmpty() && this.x == hVar) {
            g();
            Iterator it = this.w.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                l lVar = (l) weakReference.get();
                if (lVar == null) {
                    this.w.remove(weakReference);
                    z = z2;
                } else {
                    z = lVar.b(this, hVar);
                    if (z) {
                        break;
                    }
                }
                z2 = z;
            }
            z = z2;
            h();
            if (z) {
                this.x = null;
            }
        }
        return z;
    }

    public h r() {
        return this.x;
    }

    public void c(boolean z) {
        this.y = z;
    }
}
