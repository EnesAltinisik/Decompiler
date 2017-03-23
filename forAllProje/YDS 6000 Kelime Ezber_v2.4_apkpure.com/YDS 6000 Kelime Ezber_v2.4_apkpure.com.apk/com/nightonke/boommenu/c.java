package com.nightonke.boommenu;

import com.nightonke.boommenu.a.b;
import com.nightonke.boommenu.b.d;
import java.util.ArrayList;

class c {
    private static c a = new c();

    private c() {
    }

    private static void a(b bVar) {
        if (bVar == null || bVar == b.Unknown) {
            throw new RuntimeException("Unknown boom-enum!");
        }
    }

    private static void a(d dVar) {
        if (dVar == null || dVar == d.Unknown) {
            throw new RuntimeException("Unknown button-place-enum!");
        }
    }

    private static void a(b bVar) {
        if (bVar == null || bVar == b.Unknown) {
            throw new RuntimeException("Unknown button-enum!");
        }
    }

    private static void a(com.nightonke.boommenu.c.d dVar) {
        if (dVar == null || dVar == com.nightonke.boommenu.c.d.Unknown) {
            throw new RuntimeException("Unknown piece-place-enum!");
        }
    }

    static void a(com.nightonke.boommenu.c.d dVar, d dVar2, b bVar, b bVar2, ArrayList<com.nightonke.boommenu.b.b> arrayList) {
        a(dVar);
        a(dVar2);
        a(bVar);
        a(bVar2);
        a((ArrayList) arrayList);
        int a = dVar.a();
        int a2 = dVar2.a();
        int size = arrayList.size();
        if (a == -1 && com.nightonke.boommenu.c.d.Share == dVar) {
            int b = dVar.b();
            int c = dVar.c();
            if (dVar2.a() < b || dVar2.a() > c) {
                throw new RuntimeException("ButtonPlaceEnum(" + dVar2 + ") is not match for PiecePlaceEnum(" + dVar + ")!");
            } else if (size < b || size > c) {
                throw new RuntimeException("Number of builders(" + size + ") is not match for PiecePlaceEnum(" + dVar + ")!");
            } else if (bVar == b.Ham) {
                throw new RuntimeException("Share style BMB is not support ham-boom-buttons");
            }
        }
        if (a != a2 && dVar2 != d.Horizontal && dVar2 != d.Vertical && dVar != com.nightonke.boommenu.c.d.Share) {
            throw new RuntimeException("Number of pieces is not equal to buttons'!");
        } else if (a != size && dVar != com.nightonke.boommenu.c.d.Share) {
            throw new RuntimeException("Number of builders is not equal to buttons'!");
        }
    }

    private static void a(ArrayList<com.nightonke.boommenu.b.b> arrayList) {
        if (arrayList == null || arrayList.size() == 0) {
            throw new RuntimeException("Empty builders!");
        }
    }
}
