package com.google.android.gms.b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.a.b;

@vz
public class ob {
    private on a;
    private final Object b = new Object();
    private final nr c;
    private final nq d;
    private final oz e;
    private final ri f;
    private final xu g;
    private final vc h;
    private final um i;

    abstract class a<T> {
        final /* synthetic */ ob f;

        a(ob obVar) {
            this.f = obVar;
        }

        protected abstract T b();

        protected abstract T b(on onVar);

        protected final T c() {
            T t = null;
            on a = this.f.b();
            if (a == null) {
                zy.e("ClientApi class cannot be loaded.");
            } else {
                try {
                    t = b(a);
                } catch (Throwable e) {
                    zy.c("Cannot invoke local loader using ClientApi class", e);
                }
            }
            return t;
        }

        protected final T d() {
            try {
                return b();
            } catch (Throwable e) {
                zy.c("Cannot invoke remote loader", e);
                return null;
            }
        }
    }

    public ob(nr nrVar, nq nqVar, oz ozVar, ri riVar, xu xuVar, vc vcVar, um umVar) {
        this.c = nrVar;
        this.d = nqVar;
        this.e = ozVar;
        this.f = riVar;
        this.g = xuVar;
        this.h = vcVar;
        this.i = umVar;
    }

    private static on a() {
        try {
            Object newInstance = ob.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").newInstance();
            if (newInstance instanceof IBinder) {
                return com.google.android.gms.b.on.a.asInterface((IBinder) newInstance);
            }
            zy.e("ClientApi class is not an instance of IBinder");
            return null;
        } catch (Throwable e) {
            zy.c("Failed to instantiate ClientApi class.", e);
            return null;
        }
    }

    private void a(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        oc.a().a(context, null, "gmob-apps", bundle, true);
    }

    private static boolean a(Activity activity, String str) {
        Intent intent = activity.getIntent();
        if (intent.hasExtra(str)) {
            return intent.getBooleanExtra(str, false);
        }
        zy.c("useClientJar flag not found in activity intent extras.");
        return false;
    }

    private on b() {
        on onVar;
        synchronized (this.b) {
            if (this.a == null) {
                this.a = a();
            }
            onVar = this.a;
        }
        return onVar;
    }

    public oi a(final Context context, final String str, final tn tnVar) {
        return (oi) a(context, false, new a<oi>(this) {
            final /* synthetic */ ob d;

            public oi a() {
                oi a = this.d.d.a(context, str, tnVar);
                if (a != null) {
                    return a;
                }
                this.d.a(context, "native_ad");
                return new pa();
            }

            public oi a(on onVar) {
                return onVar.createAdLoaderBuilder(b.a(context), str, tnVar, 10084000);
            }

            public /* synthetic */ Object b() {
                return a();
            }

            public /* synthetic */ Object b(on onVar) {
                return a(onVar);
            }
        });
    }

    public ok a(final Context context, final nx nxVar, final String str) {
        return (ok) a(context, false, new a<ok>(this) {
            final /* synthetic */ ob d;

            public ok a() {
                ok a = this.d.c.a(context, nxVar, str, null, 3);
                if (a != null) {
                    return a;
                }
                this.d.a(context, "search");
                return new pb();
            }

            public ok a(on onVar) {
                return onVar.createSearchAdManager(b.a(context), nxVar, str, 10084000);
            }

            public /* synthetic */ Object b() {
                return a();
            }

            public /* synthetic */ Object b(on onVar) {
                return a(onVar);
            }
        });
    }

    public ok a(Context context, nx nxVar, String str, tn tnVar) {
        final Context context2 = context;
        final nx nxVar2 = nxVar;
        final String str2 = str;
        final tn tnVar2 = tnVar;
        return (ok) a(context, false, new a<ok>(this) {
            final /* synthetic */ ob e;

            public ok a() {
                ok a = this.e.c.a(context2, nxVar2, str2, tnVar2, 1);
                if (a != null) {
                    return a;
                }
                this.e.a(context2, "banner");
                return new pb();
            }

            public ok a(on onVar) {
                return onVar.createBannerAdManager(b.a(context2), nxVar2, str2, tnVar2, 10084000);
            }

            public /* synthetic */ Object b() {
                return a();
            }

            public /* synthetic */ Object b(on onVar) {
                return a(onVar);
            }
        });
    }

    public op a(final Context context) {
        return (op) a(context, false, new a<op>(this) {
            final /* synthetic */ ob b;

            public op a() {
                op b = this.b.e.b(context);
                if (b != null) {
                    return b;
                }
                this.b.a(context, "mobile_ads_settings");
                return new pc();
            }

            public op a(on onVar) {
                return onVar.getMobileAdsSettingsManagerWithClientJarVersion(b.a(context), 10084000);
            }

            public /* synthetic */ Object b() {
                return a();
            }

            public /* synthetic */ Object b(on onVar) {
                return a(onVar);
            }
        });
    }

    public ux a(final Activity activity) {
        return (ux) a((Context) activity, a(activity, "com.google.android.gms.ads.internal.purchase.useClientJar"), new a<ux>(this) {
            final /* synthetic */ ob b;

            public ux a() {
                ux a = this.b.h.a(activity);
                if (a != null) {
                    return a;
                }
                this.b.a(activity, "iap");
                return null;
            }

            public ux a(on onVar) {
                return onVar.createInAppPurchaseManager(b.a(activity));
            }

            public /* synthetic */ Object b() {
                return a();
            }

            public /* synthetic */ Object b(on onVar) {
                return a(onVar);
            }
        });
    }

    <T> T a(Context context, boolean z, a<T> aVar) {
        if (!(z || oc.a().b(context))) {
            zy.b("Google Play Services is not available");
            z = true;
        }
        T c;
        if (z) {
            c = aVar.c();
            return c == null ? aVar.d() : c;
        } else {
            c = aVar.d();
            return c == null ? aVar.c() : c;
        }
    }

    public ok b(Context context, nx nxVar, String str, tn tnVar) {
        final Context context2 = context;
        final nx nxVar2 = nxVar;
        final String str2 = str;
        final tn tnVar2 = tnVar;
        return (ok) a(context, false, new a<ok>(this) {
            final /* synthetic */ ob e;

            public ok a() {
                ok a = this.e.c.a(context2, nxVar2, str2, tnVar2, 2);
                if (a != null) {
                    return a;
                }
                this.e.a(context2, "interstitial");
                return new pb();
            }

            public ok a(on onVar) {
                return onVar.createInterstitialAdManager(b.a(context2), nxVar2, str2, tnVar2, 10084000);
            }

            public /* synthetic */ Object b() {
                return a();
            }

            public /* synthetic */ Object b(on onVar) {
                return a(onVar);
            }
        });
    }

    public un b(final Activity activity) {
        return (un) a((Context) activity, a(activity, "com.google.android.gms.ads.internal.overlay.useClientJar"), new a<un>(this) {
            final /* synthetic */ ob b;

            public un a() {
                un a = this.b.i.a(activity);
                if (a != null) {
                    return a;
                }
                this.b.a(activity, "ad_overlay");
                return null;
            }

            public un a(on onVar) {
                return onVar.createAdOverlay(b.a(activity));
            }

            public /* synthetic */ Object b() {
                return a();
            }

            public /* synthetic */ Object b(on onVar) {
                return a(onVar);
            }
        });
    }
}
