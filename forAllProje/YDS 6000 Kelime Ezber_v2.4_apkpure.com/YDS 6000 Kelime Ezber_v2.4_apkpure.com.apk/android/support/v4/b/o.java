package android.support.v4.b;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.support.v4.i.k;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class o {
    private final p<?> a;

    private o(p<?> pVar) {
        this.a = pVar;
    }

    public static final o a(p<?> pVar) {
        return new o(pVar);
    }

    public l a(String str) {
        return this.a.d.b(str);
    }

    public q a() {
        return this.a.i();
    }

    public View a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.a.d.a(view, str, context, attributeSet);
    }

    public void a(Configuration configuration) {
        this.a.d.a(configuration);
    }

    public void a(Parcelable parcelable, s sVar) {
        this.a.d.a(parcelable, sVar);
    }

    public void a(l lVar) {
        this.a.d.a(this.a, this.a, lVar);
    }

    public void a(k<String, aa> kVar) {
        this.a.a((k) kVar);
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.a.b(str, fileDescriptor, printWriter, strArr);
    }

    public void a(boolean z) {
        this.a.d.a(z);
    }

    public boolean a(Menu menu) {
        return this.a.d.a(menu);
    }

    public boolean a(Menu menu, MenuInflater menuInflater) {
        return this.a.d.a(menu, menuInflater);
    }

    public boolean a(MenuItem menuItem) {
        return this.a.d.a(menuItem);
    }

    public void b() {
        this.a.d.i();
    }

    public void b(Menu menu) {
        this.a.d.b(menu);
    }

    public void b(boolean z) {
        this.a.d.b(z);
    }

    public boolean b(MenuItem menuItem) {
        return this.a.d.b(menuItem);
    }

    public Parcelable c() {
        return this.a.d.h();
    }

    public void c(boolean z) {
        this.a.a(z);
    }

    public s d() {
        return this.a.d.g();
    }

    public void e() {
        this.a.d.j();
    }

    public void f() {
        this.a.d.k();
    }

    public void g() {
        this.a.d.l();
    }

    public void h() {
        this.a.d.m();
    }

    public void i() {
        this.a.d.n();
    }

    public void j() {
        this.a.d.o();
    }

    public void k() {
        this.a.d.p();
    }

    public void l() {
        this.a.d.r();
    }

    public void m() {
        this.a.d.s();
    }

    public boolean n() {
        return this.a.d.d();
    }

    public void o() {
        this.a.k();
    }

    public void p() {
        this.a.l();
    }

    public void q() {
        this.a.m();
    }

    public k<String, aa> r() {
        return this.a.n();
    }
}
