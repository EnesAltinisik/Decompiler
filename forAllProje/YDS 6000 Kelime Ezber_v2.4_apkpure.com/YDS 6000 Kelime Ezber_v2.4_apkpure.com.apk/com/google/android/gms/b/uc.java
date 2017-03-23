package com.google.android.gms.b;

import com.google.ads.a.a;
import com.google.ads.a.b;
import com.google.android.gms.ads.l;
import java.util.Date;
import java.util.HashSet;

@vz
public final class uc {

    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[b.values().length];

        static {
            b = new int[a.values().length];
            try {
                b[a.INTERNAL_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                b[a.INVALID_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                b[a.NETWORK_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                b[a.NO_FILL.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                a[b.FEMALE.ordinal()] = 1;
            } catch (NoSuchFieldError e5) {
            }
            try {
                a[b.MALE.ordinal()] = 2;
            } catch (NoSuchFieldError e6) {
            }
            try {
                a[b.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError e7) {
            }
        }
    }

    public static int a(a aVar) {
        switch (aVar) {
            case INVALID_REQUEST:
                return 1;
            case NETWORK_ERROR:
                return 2;
            case NO_FILL:
                return 3;
            default:
                return 0;
        }
    }

    public static b a(int i) {
        switch (i) {
            case 1:
                return b.MALE;
            case 2:
                return b.FEMALE;
            default:
                return b.UNKNOWN;
        }
    }

    public static com.google.ads.b a(nx nxVar) {
        int i = 0;
        com.google.ads.b[] bVarArr = new com.google.ads.b[]{com.google.ads.b.a, com.google.ads.b.b, com.google.ads.b.c, com.google.ads.b.d, com.google.ads.b.e, com.google.ads.b.f};
        while (i < 6) {
            if (bVarArr[i].a() == nxVar.f && bVarArr[i].b() == nxVar.c) {
                return bVarArr[i];
            }
            i++;
        }
        return new com.google.ads.b(l.a(nxVar.f, nxVar.c, nxVar.b));
    }

    public static com.google.ads.mediation.b a(ns nsVar) {
        return new com.google.ads.mediation.b(new Date(nsVar.b), a(nsVar.d), nsVar.e != null ? new HashSet(nsVar.e) : null, nsVar.f, nsVar.k);
    }
}
