package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.purchase.b;
import com.google.android.gms.b.nn;
import com.google.android.gms.b.ou;
import com.google.android.gms.b.zy;

class e extends ViewGroup {
    protected final ou a;

    public e(Context context, int i) {
        super(context);
        this.a = new ou(this, i);
    }

    public e(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.a = new ou(this, attributeSet, false, i);
    }

    public e(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.a = new ou(this, attributeSet, false, i2);
    }

    public void a() {
        this.a.j();
    }

    public void a(c cVar) {
        this.a.a(cVar.a());
    }

    public void b() {
        this.a.i();
    }

    public void c() {
        this.a.a();
    }

    public a getAdListener() {
        return this.a.b();
    }

    public d getAdSize() {
        return this.a.c();
    }

    public String getAdUnitId() {
        return this.a.e();
    }

    public b getInAppPurchaseListener() {
        return this.a.g();
    }

    public String getMediationAdapterClassName() {
        return this.a.k();
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null && childAt.getVisibility() != 8) {
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i5 = ((i3 - i) - measuredWidth) / 2;
            int i6 = ((i4 - i2) - measuredHeight) / 2;
            childAt.layout(i5, i6, measuredWidth + i5, measuredHeight + i6);
        }
    }

    protected void onMeasure(int i, int i2) {
        int b;
        int i3 = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            d adSize;
            d dVar = null;
            try {
                adSize = getAdSize();
            } catch (Throwable e) {
                zy.b("Unable to retrieve ad size.", e);
                adSize = dVar;
            }
            if (adSize != null) {
                Context context = getContext();
                b = adSize.b(context);
                i3 = adSize.a(context);
            } else {
                b = 0;
            }
        } else {
            measureChild(childAt, i, i2);
            b = childAt.getMeasuredWidth();
            i3 = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(b, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(i3, getSuggestedMinimumHeight()), i2));
    }

    public void setAdListener(a aVar) {
        this.a.a(aVar);
        if (aVar != null && (aVar instanceof nn)) {
            this.a.a((nn) aVar);
        } else if (aVar == null) {
            this.a.a(null);
        }
    }

    public void setAdSize(d dVar) {
        this.a.a(dVar);
    }

    public void setAdUnitId(String str) {
        this.a.a(str);
    }

    public void setInAppPurchaseListener(b bVar) {
        this.a.a(bVar);
    }
}
