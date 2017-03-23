package com.google.android.gms.internal;

import com.google.android.gms.internal.zzaeq.zzb;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.FirebaseApiNotAvailableException;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseApp.zza;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GetTokenResult;
import java.util.concurrent.ScheduledExecutorService;

public class zzadn implements zzaeq {
    private final ScheduledExecutorService zzbHI;
    private final FirebaseApp zzbHJ;

    public zzadn(FirebaseApp firebaseApp, ScheduledExecutorService scheduledExecutorService) {
        this.zzbHJ = firebaseApp;
        this.zzbHI = scheduledExecutorService;
    }

    public void zza(final zzb com_google_android_gms_internal_zzaeq_zzb) {
        this.zzbHJ.zza(new zza(this) {
            final /* synthetic */ zzadn b;

            public void zzb(zzaja com_google_android_gms_internal_zzaja, FirebaseUser firebaseUser) {
                this.b.zzbHI.execute(new Runnable(this) {
                    final /* synthetic */ AnonymousClass3 a;

                    {
                        this.a = r1;
                    }

                    public void run() {
                        com_google_android_gms_internal_zzaeq_zzb.zzQL();
                    }
                });
            }
        });
    }

    public void zza(boolean z, final zzaeq.zza com_google_android_gms_internal_zzaeq_zza) {
        this.zzbHJ.getToken(z).addOnSuccessListener(this.zzbHI, new OnSuccessListener<GetTokenResult>(this) {
            final /* synthetic */ zzadn b;

            public void a(GetTokenResult getTokenResult) {
                com_google_android_gms_internal_zzaeq_zza.zzhT(getTokenResult.getToken());
            }

            public /* synthetic */ void onSuccess(Object obj) {
                a((GetTokenResult) obj);
            }
        }).addOnFailureListener(this.zzbHI, new OnFailureListener(this) {
            final /* synthetic */ zzadn b;

            private boolean a(Exception exception) {
                return (exception instanceof FirebaseApiNotAvailableException) || (exception instanceof zzajb);
            }

            public void onFailure(Exception exception) {
                if (a(exception)) {
                    com_google_android_gms_internal_zzaeq_zza.zzhT(null);
                } else {
                    com_google_android_gms_internal_zzaeq_zza.onError(exception.getMessage());
                }
            }
        });
    }
}
