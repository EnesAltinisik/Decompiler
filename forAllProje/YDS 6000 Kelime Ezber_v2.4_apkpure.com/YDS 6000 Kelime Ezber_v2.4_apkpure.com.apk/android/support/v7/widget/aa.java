package android.support.v7.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

@TargetApi(21)
class aa implements ad {
    aa() {
    }

    private az j(ab abVar) {
        return (az) abVar.c();
    }

    public float a(ab abVar) {
        return j(abVar).a();
    }

    public void a() {
    }

    public void a(ab abVar, float f) {
        j(abVar).a(f);
    }

    public void a(ab abVar, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        abVar.a(new az(colorStateList, f));
        View d = abVar.d();
        d.setClipToOutline(true);
        d.setElevation(f2);
        b(abVar, f3);
    }

    public void a(ab abVar, ColorStateList colorStateList) {
        j(abVar).a(colorStateList);
    }

    public float b(ab abVar) {
        return d(abVar) * 2.0f;
    }

    public void b(ab abVar, float f) {
        j(abVar).a(f, abVar.a(), abVar.b());
        f(abVar);
    }

    public float c(ab abVar) {
        return d(abVar) * 2.0f;
    }

    public void c(ab abVar, float f) {
        abVar.d().setElevation(f);
    }

    public float d(ab abVar) {
        return j(abVar).b();
    }

    public float e(ab abVar) {
        return abVar.d().getElevation();
    }

    public void f(ab abVar) {
        if (abVar.a()) {
            float a = a(abVar);
            float d = d(abVar);
            int ceil = (int) Math.ceil((double) ba.b(a, d, abVar.b()));
            int ceil2 = (int) Math.ceil((double) ba.a(a, d, abVar.b()));
            abVar.a(ceil, ceil2, ceil, ceil2);
            return;
        }
        abVar.a(0, 0, 0, 0);
    }

    public void g(ab abVar) {
        b(abVar, a(abVar));
    }

    public void h(ab abVar) {
        b(abVar, a(abVar));
    }

    public ColorStateList i(ab abVar) {
        return j(abVar).c();
    }
}
