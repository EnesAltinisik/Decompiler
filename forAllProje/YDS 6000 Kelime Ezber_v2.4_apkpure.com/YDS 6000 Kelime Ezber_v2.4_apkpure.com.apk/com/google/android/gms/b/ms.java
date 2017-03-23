package com.google.android.gms.b;

import com.google.android.gms.ads.internal.v;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@vz
public class ms {
    private final Object a = new Object();
    private int b;
    private List<mr> c = new LinkedList();

    public mr a() {
        mr mrVar = null;
        int i = 0;
        synchronized (this.a) {
            if (this.c.size() == 0) {
                zy.b("Queue empty");
                return null;
            } else if (this.c.size() >= 2) {
                int i2 = Integer.MIN_VALUE;
                int i3 = 0;
                for (mr mrVar2 : this.c) {
                    mr mrVar3;
                    int i4;
                    int i5 = mrVar2.i();
                    if (i5 > i2) {
                        i = i5;
                        mrVar3 = mrVar2;
                        i4 = i3;
                    } else {
                        i4 = i;
                        mrVar3 = mrVar;
                        i = i2;
                    }
                    i3++;
                    i2 = i;
                    mrVar = mrVar3;
                    i = i4;
                }
                this.c.remove(i);
                return mrVar;
            } else {
                mrVar2 = (mr) this.c.get(0);
                mrVar2.e();
                return mrVar2;
            }
        }
    }

    public boolean a(mr mrVar) {
        boolean z;
        synchronized (this.a) {
            if (this.c.contains(mrVar)) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public boolean b(mr mrVar) {
        synchronized (this.a) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                mr mrVar2 = (mr) it.next();
                if (!((Boolean) pr.ae.c()).booleanValue() || v.i().b()) {
                    if (((Boolean) pr.ag.c()).booleanValue() && !v.i().c() && mrVar != mrVar2 && mrVar2.d().equals(mrVar.d())) {
                        it.remove();
                        return true;
                    }
                } else if (mrVar != mrVar2 && mrVar2.b().equals(mrVar.b())) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    public void c(mr mrVar) {
        synchronized (this.a) {
            if (this.c.size() >= 10) {
                zy.b("Queue is full, current size = " + this.c.size());
                this.c.remove(0);
            }
            int i = this.b;
            this.b = i + 1;
            mrVar.a(i);
            this.c.add(mrVar);
        }
    }
}
