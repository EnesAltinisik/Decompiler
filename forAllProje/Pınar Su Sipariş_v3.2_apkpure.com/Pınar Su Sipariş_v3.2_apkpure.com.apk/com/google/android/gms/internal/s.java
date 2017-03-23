package com.google.android.gms.internal;

import android.os.Handler;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.internal.client.zzq.zza;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.reward.client.zzd;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.ads.internal.zzu;
import java.util.LinkedList;
import java.util.List;

@zzig
class s {
    private final List<a> a = new LinkedList();

    interface a {
        void a(t tVar) throws RemoteException;
    }

    s() {
    }

    void a(zzl com_google_android_gms_ads_internal_zzl) {
        com_google_android_gms_ads_internal_zzl.zza(new zza(this) {
            final /* synthetic */ s a;

            {
                this.a = r1;
            }

            public void onAdClosed() throws RemoteException {
                this.a.a.add(new a(this) {
                    final /* synthetic */ AnonymousClass1 a;

                    {
                        this.a = r1;
                    }

                    public void a(t tVar) throws RemoteException {
                        if (tVar.a != null) {
                            tVar.a.onAdClosed();
                        }
                        zzu.zzcv().zzfi();
                    }
                });
            }

            public void onAdFailedToLoad(final int i) throws RemoteException {
                this.a.a.add(new a(this) {
                    final /* synthetic */ AnonymousClass1 b;

                    public void a(t tVar) throws RemoteException {
                        if (tVar.a != null) {
                            tVar.a.onAdFailedToLoad(i);
                        }
                    }
                });
                zzjw.v("Pooled interstitial failed to load.");
            }

            public void onAdLeftApplication() throws RemoteException {
                this.a.a.add(new a(this) {
                    final /* synthetic */ AnonymousClass1 a;

                    {
                        this.a = r1;
                    }

                    public void a(t tVar) throws RemoteException {
                        if (tVar.a != null) {
                            tVar.a.onAdLeftApplication();
                        }
                    }
                });
            }

            public void onAdLoaded() throws RemoteException {
                this.a.a.add(new a(this) {
                    final /* synthetic */ AnonymousClass1 a;

                    {
                        this.a = r1;
                    }

                    public void a(t tVar) throws RemoteException {
                        if (tVar.a != null) {
                            tVar.a.onAdLoaded();
                        }
                    }
                });
                zzjw.v("Pooled interstitial loaded.");
            }

            public void onAdOpened() throws RemoteException {
                this.a.a.add(new a(this) {
                    final /* synthetic */ AnonymousClass1 a;

                    {
                        this.a = r1;
                    }

                    public void a(t tVar) throws RemoteException {
                        if (tVar.a != null) {
                            tVar.a.onAdOpened();
                        }
                    }
                });
            }
        });
        com_google_android_gms_ads_internal_zzl.zza(new zzw.zza(this) {
            final /* synthetic */ s a;

            {
                this.a = r1;
            }

            public void onAppEvent(final String str, final String str2) throws RemoteException {
                this.a.a.add(new a(this) {
                    final /* synthetic */ AnonymousClass2 c;

                    public void a(t tVar) throws RemoteException {
                        if (tVar.b != null) {
                            tVar.b.onAppEvent(str, str2);
                        }
                    }
                });
            }
        });
        com_google_android_gms_ads_internal_zzl.zza(new zzhh.zza(this) {
            final /* synthetic */ s a;

            {
                this.a = r1;
            }

            public void zza(final zzhg com_google_android_gms_internal_zzhg) throws RemoteException {
                this.a.a.add(new a(this) {
                    final /* synthetic */ AnonymousClass3 b;

                    public void a(t tVar) throws RemoteException {
                        if (tVar.c != null) {
                            tVar.c.zza(com_google_android_gms_internal_zzhg);
                        }
                    }
                });
            }
        });
        com_google_android_gms_ads_internal_zzl.zza(new zzdg.zza(this) {
            final /* synthetic */ s a;

            {
                this.a = r1;
            }

            public void zza(final zzdf com_google_android_gms_internal_zzdf) throws RemoteException {
                this.a.a.add(new a(this) {
                    final /* synthetic */ AnonymousClass4 b;

                    public void a(t tVar) throws RemoteException {
                        if (tVar.d != null) {
                            tVar.d.zza(com_google_android_gms_internal_zzdf);
                        }
                    }
                });
            }
        });
        com_google_android_gms_ads_internal_zzl.zza(new zzp.zza(this) {
            final /* synthetic */ s a;

            {
                this.a = r1;
            }

            public void onAdClicked() throws RemoteException {
                this.a.a.add(new a(this) {
                    final /* synthetic */ AnonymousClass5 a;

                    {
                        this.a = r1;
                    }

                    public void a(t tVar) throws RemoteException {
                        if (tVar.e != null) {
                            tVar.e.onAdClicked();
                        }
                    }
                });
            }
        });
        com_google_android_gms_ads_internal_zzl.zza(new zzd.zza(this) {
            final /* synthetic */ s a;

            {
                this.a = r1;
            }

            public void onRewardedVideoAdClosed() throws RemoteException {
                this.a.a.add(new a(this) {
                    final /* synthetic */ AnonymousClass6 a;

                    {
                        this.a = r1;
                    }

                    public void a(t tVar) throws RemoteException {
                        if (tVar.f != null) {
                            tVar.f.onRewardedVideoAdClosed();
                        }
                    }
                });
            }

            public void onRewardedVideoAdFailedToLoad(final int i) throws RemoteException {
                this.a.a.add(new a(this) {
                    final /* synthetic */ AnonymousClass6 b;

                    public void a(t tVar) throws RemoteException {
                        if (tVar.f != null) {
                            tVar.f.onRewardedVideoAdFailedToLoad(i);
                        }
                    }
                });
            }

            public void onRewardedVideoAdLeftApplication() throws RemoteException {
                this.a.a.add(new a(this) {
                    final /* synthetic */ AnonymousClass6 a;

                    {
                        this.a = r1;
                    }

                    public void a(t tVar) throws RemoteException {
                        if (tVar.f != null) {
                            tVar.f.onRewardedVideoAdLeftApplication();
                        }
                    }
                });
            }

            public void onRewardedVideoAdLoaded() throws RemoteException {
                this.a.a.add(new a(this) {
                    final /* synthetic */ AnonymousClass6 a;

                    {
                        this.a = r1;
                    }

                    public void a(t tVar) throws RemoteException {
                        if (tVar.f != null) {
                            tVar.f.onRewardedVideoAdLoaded();
                        }
                    }
                });
            }

            public void onRewardedVideoAdOpened() throws RemoteException {
                this.a.a.add(new a(this) {
                    final /* synthetic */ AnonymousClass6 a;

                    {
                        this.a = r1;
                    }

                    public void a(t tVar) throws RemoteException {
                        if (tVar.f != null) {
                            tVar.f.onRewardedVideoAdOpened();
                        }
                    }
                });
            }

            public void onRewardedVideoStarted() throws RemoteException {
                this.a.a.add(new a(this) {
                    final /* synthetic */ AnonymousClass6 a;

                    {
                        this.a = r1;
                    }

                    public void a(t tVar) throws RemoteException {
                        if (tVar.f != null) {
                            tVar.f.onRewardedVideoStarted();
                        }
                    }
                });
            }

            public void zza(final com.google.android.gms.ads.internal.reward.client.zza com_google_android_gms_ads_internal_reward_client_zza) throws RemoteException {
                this.a.a.add(new a(this) {
                    final /* synthetic */ AnonymousClass6 b;

                    public void a(t tVar) throws RemoteException {
                        if (tVar.f != null) {
                            tVar.f.zza(com_google_android_gms_ads_internal_reward_client_zza);
                        }
                    }
                });
            }
        });
    }

    void a(final t tVar) {
        Handler handler = zzka.zzQu;
        for (final a aVar : this.a) {
            handler.post(new Runnable(this) {
                final /* synthetic */ s c;

                public void run() {
                    try {
                        aVar.a(tVar);
                    } catch (Throwable e) {
                        zzb.zzd("Could not propagate interstitial ad event.", e);
                    }
                }
            });
        }
    }
}
