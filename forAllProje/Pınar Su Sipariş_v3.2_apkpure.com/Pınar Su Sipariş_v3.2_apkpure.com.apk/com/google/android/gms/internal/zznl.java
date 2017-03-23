package com.google.android.gms.internal;

import android.os.Process;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.clearcut.zzc;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.zze;
import com.google.android.gms.common.util.zzh;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

public class zznl implements zzc {
    private static final Object zzajR = new Object();
    private static ScheduledExecutorService zzajS;
    private static final c zzajT = new c();
    private static final long zzajU = TimeUnit.MILLISECONDS.convert(2, TimeUnit.MINUTES);
    private GoogleApiClient zzaeN;
    private final zza zzajV;
    private final Object zzajW;
    private long zzajX;
    private final long zzajY;
    private ScheduledFuture<?> zzajZ;
    private final Runnable zzaka;
    private final zze zzsd;

    static abstract class a<R extends Result> extends com.google.android.gms.internal.zznt.zza<R, zznm> {
        public a(GoogleApiClient googleApiClient) {
            super(com.google.android.gms.clearcut.zzb.zzaaz, googleApiClient);
        }
    }

    static final class b extends a<Status> {
        private final LogEventParcelable a;

        b(LogEventParcelable logEventParcelable, GoogleApiClient googleApiClient) {
            super(googleApiClient);
            this.a = logEventParcelable;
        }

        protected Status a(Status status) {
            return status;
        }

        protected void a(zznm com_google_android_gms_internal_zznm) throws RemoteException {
            zznn anonymousClass1 = new com.google.android.gms.internal.zznn.zza(this) {
                final /* synthetic */ b a;

                {
                    this.a = r1;
                }

                public void zzu(Status status) {
                    this.a.zzb(status);
                }
            };
            try {
                zznl.zza(this.a);
                com_google_android_gms_internal_zznm.zza(anonymousClass1, this.a);
            } catch (Throwable e) {
                Log.e("ClearcutLoggerApiImpl", "derived ClearcutLogger.MessageNanoProducer", e);
                zzx(new Status(10, "MessageProducer"));
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            return this.a.equals(((b) obj).a);
        }

        public String toString() {
            String valueOf = String.valueOf(this.a);
            return new StringBuilder(String.valueOf(valueOf).length() + 12).append("MethodImpl(").append(valueOf).append(")").toString();
        }

        protected /* synthetic */ void zza(com.google.android.gms.common.api.Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
            a((zznm) com_google_android_gms_common_api_Api_zzb);
        }

        protected /* synthetic */ Result zzc(Status status) {
            return a(status);
        }
    }

    private static final class c {
        private int a;

        private c() {
            this.a = 0;
        }

        public synchronized void a() {
            this.a++;
        }

        public synchronized void b() {
            if (this.a == 0) {
                throw new RuntimeException("too many decrements");
            }
            this.a--;
            if (this.a == 0) {
                notifyAll();
            }
        }
    }

    public interface zza {
    }

    public static class zzb implements zza {
    }

    public zznl() {
        this(new zzh(), zzajU, new zzb());
    }

    public zznl(zze com_google_android_gms_common_util_zze, long j, zza com_google_android_gms_internal_zznl_zza) {
        this.zzajW = new Object();
        this.zzajX = 0;
        this.zzajZ = null;
        this.zzaeN = null;
        this.zzaka = new Runnable(this) {
            final /* synthetic */ zznl a;

            {
                this.a = r1;
            }

            public void run() {
                synchronized (this.a.zzajW) {
                    if (0 <= this.a.zzsd.elapsedRealtime() && this.a.zzaeN != null) {
                        Log.i("ClearcutLoggerApiImpl", "disconnect managed GoogleApiClient");
                        this.a.zzaeN.disconnect();
                        this.a.zzaeN = null;
                    }
                }
            }
        };
        this.zzsd = com_google_android_gms_common_util_zze;
        this.zzajY = j;
        this.zzajV = com_google_android_gms_internal_zznl_zza;
    }

    private PendingResult<Status> zza(final GoogleApiClient googleApiClient, final a<Status> aVar) {
        zzqQ().execute(new Runnable(this) {
            final /* synthetic */ zznl c;

            public void run() {
                googleApiClient.zzc(aVar);
            }
        });
        return aVar;
    }

    private static void zza(LogEventParcelable logEventParcelable) {
        if (logEventParcelable.zzajP != null && logEventParcelable.zzajO.zzcaM.length == 0) {
            logEventParcelable.zzajO.zzcaM = logEventParcelable.zzajP.zzqP();
        }
        if (logEventParcelable.zzajQ != null && logEventParcelable.zzajO.zzcaT.length == 0) {
            logEventParcelable.zzajO.zzcaT = logEventParcelable.zzajQ.zzqP();
        }
        logEventParcelable.zzajM = zzamj.toByteArray(logEventParcelable.zzajO);
    }

    private b zzb(GoogleApiClient googleApiClient, LogEventParcelable logEventParcelable) {
        zzajT.a();
        b bVar = new b(logEventParcelable, googleApiClient);
        bVar.zza(new com.google.android.gms.common.api.PendingResult.zza(this) {
            final /* synthetic */ zznl a;

            {
                this.a = r1;
            }

            public void zzt(Status status) {
                zznl.zzajT.b();
            }
        });
        return bVar;
    }

    private ScheduledExecutorService zzqQ() {
        synchronized (zzajR) {
            if (zzajS == null) {
                zzajS = Executors.newSingleThreadScheduledExecutor(new ThreadFactory(this) {
                    final /* synthetic */ zznl a;

                    {
                        this.a = r1;
                    }

                    public Thread newThread(final Runnable runnable) {
                        return new Thread(new Runnable(this) {
                            final /* synthetic */ AnonymousClass2 b;

                            public void run() {
                                Process.setThreadPriority(10);
                                runnable.run();
                            }
                        }, "ClearcutLoggerApiImpl");
                    }
                });
            }
        }
        return zzajS;
    }

    public PendingResult<Status> zza(GoogleApiClient googleApiClient, LogEventParcelable logEventParcelable) {
        return zza(googleApiClient, zzb(googleApiClient, logEventParcelable));
    }
}
