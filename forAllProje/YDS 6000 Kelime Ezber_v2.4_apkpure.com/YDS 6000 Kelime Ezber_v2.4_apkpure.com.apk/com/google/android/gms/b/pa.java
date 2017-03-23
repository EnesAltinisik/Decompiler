package com.google.android.gms.b;

public class pa extends com.google.android.gms.b.oi.a {
    private og a;

    private class a extends com.google.android.gms.b.oh.a {
        final /* synthetic */ pa a;

        private a(pa paVar) {
            this.a = paVar;
        }

        public String a() {
            return null;
        }

        public void a(ns nsVar) {
            zy.c("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
            zx.a.post(new Runnable(this) {
                final /* synthetic */ a a;

                {
                    this.a = r1;
                }

                public void run() {
                    if (this.a.a.a != null) {
                        try {
                            this.a.a.a.a(1);
                        } catch (Throwable e) {
                            zy.c("Could not notify onAdFailedToLoad event.", e);
                        }
                    }
                }
            });
        }

        public boolean b() {
            return false;
        }
    }

    public oh a() {
        return new a();
    }

    public void a(og ogVar) {
        this.a = ogVar;
    }

    public void a(oo ooVar) {
    }

    public void a(qr qrVar) {
    }

    public void a(re reVar) {
    }

    public void a(rf rfVar) {
    }

    public void a(String str, rh rhVar, rg rgVar) {
    }
}
