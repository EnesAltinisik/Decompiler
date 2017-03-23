package com.google.android.gms.b;

import android.os.Handler;
import com.google.android.gms.ads.internal.l;
import com.google.android.gms.ads.internal.v;
import java.util.LinkedList;
import java.util.List;

@vz
class sk {
    private final List<a> a = new LinkedList();

    interface a {
        void a(sl slVar);
    }

    sk() {
    }

    void a(l lVar) {
        lVar.a(new com.google.android.gms.b.og.a(this) {
            final /* synthetic */ sk a;

            {
                this.a = r1;
            }

            public void a() {
                this.a.a.add(new a(this) {
                    public void a(sl slVar) {
                        if (slVar.a != null) {
                            slVar.a.a();
                        }
                        v.t().a();
                    }
                });
            }

            public void a(final int i) {
                this.a.a.add(new a(this) {
                    public void a(sl slVar) {
                        if (slVar.a != null) {
                            slVar.a.a(i);
                        }
                    }
                });
                ze.a("Pooled interstitial failed to load.");
            }

            public void b() {
                this.a.a.add(new a(this) {
                    public void a(sl slVar) {
                        if (slVar.a != null) {
                            slVar.a.b();
                        }
                    }
                });
            }

            public void c() {
                this.a.a.add(new a(this) {
                    public void a(sl slVar) {
                        if (slVar.a != null) {
                            slVar.a.c();
                        }
                    }
                });
                ze.a("Pooled interstitial loaded.");
            }

            public void d() {
                this.a.a.add(new a(this) {
                    public void a(sl slVar) {
                        if (slVar.a != null) {
                            slVar.a.d();
                        }
                    }
                });
            }
        });
        lVar.a(new com.google.android.gms.b.om.a(this) {
            final /* synthetic */ sk a;

            {
                this.a = r1;
            }

            public void a(final String str, final String str2) {
                this.a.a.add(new a(this) {
                    public void a(sl slVar) {
                        if (slVar.b != null) {
                            slVar.b.a(str, str2);
                        }
                    }
                });
            }
        });
        lVar.a(new com.google.android.gms.b.uv.a(this) {
            final /* synthetic */ sk a;

            {
                this.a = r1;
            }

            public void a(final uu uuVar) {
                this.a.a.add(new a(this) {
                    public void a(sl slVar) {
                        if (slVar.c != null) {
                            slVar.c.a(uuVar);
                        }
                    }
                });
            }
        });
        lVar.a(new com.google.android.gms.b.qe.a(this) {
            final /* synthetic */ sk a;

            {
                this.a = r1;
            }

            public void a(final qd qdVar) {
                this.a.a.add(new a(this) {
                    public void a(sl slVar) {
                        if (slVar.d != null) {
                            slVar.d.a(qdVar);
                        }
                    }
                });
            }
        });
        lVar.a(new com.google.android.gms.b.of.a(this) {
            final /* synthetic */ sk a;

            {
                this.a = r1;
            }

            public void a() {
                this.a.a.add(new a(this) {
                    public void a(sl slVar) {
                        if (slVar.e != null) {
                            slVar.e.a();
                        }
                    }
                });
            }
        });
        lVar.a(new com.google.android.gms.b.xs.a(this) {
            final /* synthetic */ sk a;

            {
                this.a = r1;
            }

            public void a() {
                this.a.a.add(new a(this) {
                    public void a(sl slVar) {
                        if (slVar.f != null) {
                            slVar.f.a();
                        }
                    }
                });
            }

            public void a(final int i) {
                this.a.a.add(new a(this) {
                    public void a(sl slVar) {
                        if (slVar.f != null) {
                            slVar.f.a(i);
                        }
                    }
                });
            }

            public void a(final xp xpVar) {
                this.a.a.add(new a(this) {
                    public void a(sl slVar) {
                        if (slVar.f != null) {
                            slVar.f.a(xpVar);
                        }
                    }
                });
            }

            public void b() {
                this.a.a.add(new a(this) {
                    public void a(sl slVar) {
                        if (slVar.f != null) {
                            slVar.f.b();
                        }
                    }
                });
            }

            public void c() {
                this.a.a.add(new a(this) {
                    public void a(sl slVar) {
                        if (slVar.f != null) {
                            slVar.f.c();
                        }
                    }
                });
            }

            public void d() {
                this.a.a.add(new a(this) {
                    public void a(sl slVar) {
                        if (slVar.f != null) {
                            slVar.f.d();
                        }
                    }
                });
            }

            public void e() {
                this.a.a.add(new a(this) {
                    public void a(sl slVar) {
                        if (slVar.f != null) {
                            slVar.f.e();
                        }
                    }
                });
            }
        });
    }

    void a(final sl slVar) {
        Handler handler = zi.a;
        for (final a aVar : this.a) {
            handler.post(new Runnable(this) {
                public void run() {
                    try {
                        aVar.a(slVar);
                    } catch (Throwable e) {
                        zy.c("Could not propagate interstitial ad event.", e);
                    }
                }
            });
        }
        this.a.clear();
    }
}
