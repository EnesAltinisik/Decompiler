package com.google.android.gms.fitness;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.zzc;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.fitness.request.SessionInsertRequest;
import com.google.android.gms.fitness.request.SessionReadRequest;
import com.google.android.gms.fitness.result.SessionReadResult;
import com.google.android.gms.fitness.result.SessionStopResult;

public interface SessionsApi {

    public static class ViewIntentBuilder {
        private final Context mContext;
        private String zzaCK;
        private Session zzaCL;
        private boolean zzaCM = false;

        public ViewIntentBuilder(Context context) {
            this.mContext = context;
        }

        private Intent zzk(Intent intent) {
            if (this.zzaCK == null) {
                return intent;
            }
            Intent intent2 = new Intent(intent).setPackage(this.zzaCK);
            ResolveInfo resolveActivity = this.mContext.getPackageManager().resolveActivity(intent2, 0);
            if (resolveActivity == null) {
                return intent;
            }
            intent2.setComponent(new ComponentName(this.zzaCK, resolveActivity.activityInfo.name));
            return intent2;
        }

        public Intent build() {
            zzaa.zza(this.zzaCL != null, (Object) "Session must be set");
            Intent intent = new Intent(Fitness.ACTION_VIEW);
            intent.setType(Session.getMimeType(this.zzaCL.getActivity()));
            zzc.zza(this.zzaCL, intent, Session.EXTRA_SESSION);
            if (!this.zzaCM) {
                this.zzaCK = this.zzaCL.getAppPackageName();
            }
            return zzk(intent);
        }

        public ViewIntentBuilder setPreferredApplication(String str) {
            this.zzaCK = str;
            this.zzaCM = true;
            return this;
        }

        public ViewIntentBuilder setSession(Session session) {
            this.zzaCL = session;
            return this;
        }
    }

    PendingResult<Status> insertSession(GoogleApiClient googleApiClient, SessionInsertRequest sessionInsertRequest);

    PendingResult<SessionReadResult> readSession(GoogleApiClient googleApiClient, SessionReadRequest sessionReadRequest);

    PendingResult<Status> registerForSessions(GoogleApiClient googleApiClient, PendingIntent pendingIntent);

    PendingResult<Status> startSession(GoogleApiClient googleApiClient, Session session);

    PendingResult<SessionStopResult> stopSession(GoogleApiClient googleApiClient, String str);

    PendingResult<Status> unregisterForSessions(GoogleApiClient googleApiClient, PendingIntent pendingIntent);
}
