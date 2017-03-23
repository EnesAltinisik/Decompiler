package com.google.android.gms.drive.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.drive.MetadataBuffer;
import com.google.android.gms.drive.events.ChangeEvent;
import com.google.android.gms.drive.events.ChangeListener;
import com.google.android.gms.drive.events.ChangesAvailableEvent;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.drive.events.CompletionListener;
import com.google.android.gms.drive.events.DriveEvent;
import com.google.android.gms.drive.events.QueryResultEventParcelable;
import com.google.android.gms.drive.events.TransferProgressEvent;
import com.google.android.gms.drive.events.zzc;
import com.google.android.gms.drive.events.zzf;
import com.google.android.gms.drive.events.zzi;
import com.google.android.gms.drive.events.zzk;
import com.google.android.gms.drive.events.zzm;
import com.google.android.gms.drive.internal.zzao.zza;
import java.util.ArrayList;
import java.util.List;

public class zzae extends zza {
    private final int zzatd;
    private final zzf zzayd;
    private final a zzaye;
    private final List<Integer> zzayf = new ArrayList();

    private static class a extends Handler {
        private final Context a;

        class AnonymousClass1 implements zzk {
            final /* synthetic */ MetadataBuffer a;

            AnonymousClass1(MetadataBuffer metadataBuffer) {
                this.a = metadataBuffer;
            }
        }

        private a(Looper looper, Context context) {
            super(looper);
            this.a = context;
        }

        private static void a(zzm com_google_android_gms_drive_events_zzm, QueryResultEventParcelable queryResultEventParcelable) {
            DataHolder zzwg = queryResultEventParcelable.zzwg();
            if (zzwg != null) {
                com_google_android_gms_drive_events_zzm.zza(new AnonymousClass1(new MetadataBuffer(zzwg)));
            }
            if (queryResultEventParcelable.zzwh()) {
                com_google_android_gms_drive_events_zzm.zzcZ(queryResultEventParcelable.zzwi());
            }
        }

        public void a(zzf com_google_android_gms_drive_events_zzf, DriveEvent driveEvent) {
            sendMessage(obtainMessage(1, new Pair(com_google_android_gms_drive_events_zzf, driveEvent)));
        }

        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    Pair pair = (Pair) message.obj;
                    zzf com_google_android_gms_drive_events_zzf = (zzf) pair.first;
                    DriveEvent driveEvent = (DriveEvent) pair.second;
                    switch (driveEvent.getType()) {
                        case 1:
                            ((ChangeListener) com_google_android_gms_drive_events_zzf).onChange((ChangeEvent) driveEvent);
                            return;
                        case 2:
                            ((CompletionListener) com_google_android_gms_drive_events_zzf).onCompletion((CompletionEvent) driveEvent);
                            return;
                        case 3:
                            a((zzm) com_google_android_gms_drive_events_zzf, (QueryResultEventParcelable) driveEvent);
                            return;
                        case 4:
                            ((zzc) com_google_android_gms_drive_events_zzf).zza((ChangesAvailableEvent) driveEvent);
                            return;
                        case 8:
                            ((zzi) com_google_android_gms_drive_events_zzf).zza(new com.google.android.gms.drive.events.internal.zza(((TransferProgressEvent) driveEvent).zzwj()));
                            return;
                        default:
                            String valueOf = String.valueOf(driveEvent);
                            zzz.zzD("EventCallback", new StringBuilder(String.valueOf(valueOf).length() + 18).append("Unexpected event: ").append(valueOf).toString());
                            return;
                    }
                default:
                    zzz.zze(this.a, "EventCallback", "Don't know how to handle this event");
                    return;
            }
        }
    }

    public zzae(Looper looper, Context context, int i, zzf com_google_android_gms_drive_events_zzf) {
        this.zzatd = i;
        this.zzayd = com_google_android_gms_drive_events_zzf;
        this.zzaye = new a(looper, context);
    }

    public void zzc(OnEventResponse onEventResponse) throws RemoteException {
        DriveEvent zzwy = onEventResponse.zzwy();
        zzaa.zzai(this.zzatd == zzwy.getType());
        zzaa.zzai(this.zzayf.contains(Integer.valueOf(zzwy.getType())));
        this.zzaye.a(this.zzayd, zzwy);
    }

    public void zzdw(int i) {
        this.zzayf.add(Integer.valueOf(i));
    }

    public boolean zzdx(int i) {
        return this.zzayf.contains(Integer.valueOf(i));
    }
}
