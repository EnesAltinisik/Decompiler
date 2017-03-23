package com.google.firebase.messaging;

import android.app.PendingIntent;
import android.app.PendingIntent.CanceledException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.b.p;
import android.util.Log;
import com.google.android.gms.gcm.GoogleCloudMessaging;
import com.google.firebase.iid.FirebaseInstanceIdInternalReceiver;
import com.google.firebase.iid.zzb;
import java.util.Iterator;

public class FirebaseMessagingService extends zzb {
    private void zzD(Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (CanceledException e) {
                Log.e("FirebaseMessaging", "Notification pending intent canceled");
            }
        }
        if (zzT(intent.getExtras())) {
            b.b(this, intent);
        }
    }

    private String zzE(Intent intent) {
        String stringExtra = intent.getStringExtra("google.message_id");
        return stringExtra == null ? intent.getStringExtra("message_id") : stringExtra;
    }

    static boolean zzT(Bundle bundle) {
        return "1".equals(bundle.getString("google.c.a.e"));
    }

    private void zzn(Intent intent) {
        String stringExtra = intent.getStringExtra("message_type");
        if (stringExtra == null) {
            stringExtra = GoogleCloudMessaging.MESSAGE_TYPE_MESSAGE;
        }
        Object obj = -1;
        switch (stringExtra.hashCode()) {
            case -2062414158:
                if (stringExtra.equals(GoogleCloudMessaging.MESSAGE_TYPE_DELETED)) {
                    obj = 1;
                    break;
                }
                break;
            case 102161:
                if (stringExtra.equals(GoogleCloudMessaging.MESSAGE_TYPE_MESSAGE)) {
                    obj = null;
                    break;
                }
                break;
            case 814694033:
                if (stringExtra.equals(GoogleCloudMessaging.MESSAGE_TYPE_SEND_ERROR)) {
                    obj = 3;
                    break;
                }
                break;
            case 814800675:
                if (stringExtra.equals(GoogleCloudMessaging.MESSAGE_TYPE_SEND_EVENT)) {
                    obj = 2;
                    break;
                }
                break;
        }
        switch (obj) {
            case null:
                if (zzT(intent.getExtras())) {
                    b.a(this, intent);
                }
                zzo(intent);
                return;
            case 1:
                onDeletedMessages();
                return;
            case 2:
                onMessageSent(intent.getStringExtra("google.message_id"));
                return;
            case 3:
                onSendError(zzE(intent), new SendException(intent.getStringExtra("error")));
                return;
            default:
                String str = "FirebaseMessaging";
                String str2 = "Received message with unknown type: ";
                stringExtra = String.valueOf(stringExtra);
                Log.w(str, stringExtra.length() != 0 ? str2.concat(stringExtra) : new String(str2));
                return;
        }
    }

    private void zzo(Intent intent) {
        Bundle extras = intent.getExtras();
        extras.remove("android.support.content.wakelockid");
        if (a.a(extras)) {
            if (!a.b((Context) this)) {
                a.a((Context) this).b(extras);
                return;
            } else if (zzT(intent.getExtras())) {
                b.d(this, intent);
            }
        }
        onMessageReceived(new RemoteMessage(extras));
    }

    static void zzz(Bundle bundle) {
        Iterator it = bundle.keySet().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str != null && str.startsWith("google.c.")) {
                it.remove();
            }
        }
    }

    public void onDeletedMessages() {
    }

    public void onMessageReceived(RemoteMessage remoteMessage) {
    }

    public void onMessageSent(String str) {
    }

    public void onSendError(String str, Exception exception) {
    }

    protected int zzA(Intent intent) {
        if (!"com.google.firebase.messaging.NOTIFICATION_OPEN".equals(intent.getAction())) {
            return super.zzA(intent);
        }
        zzD(intent);
        zzBL();
        p.completeWakefulIntent(intent);
        return 3;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void zzm(android.content.Intent r5) {
        /*
        r4 = this;
        r1 = r5.getAction();	 Catch:{ all -> 0x0047 }
        r0 = -1;
        r2 = r1.hashCode();	 Catch:{ all -> 0x0047 }
        switch(r2) {
            case 75300319: goto L_0x0039;
            case 366519424: goto L_0x002f;
            default: goto L_0x000c;
        };	 Catch:{ all -> 0x0047 }
    L_0x000c:
        switch(r0) {
            case 0: goto L_0x0043;
            case 1: goto L_0x004c;
            default: goto L_0x000f;
        };	 Catch:{ all -> 0x0047 }
    L_0x000f:
        r1 = "FirebaseMessaging";
        r2 = "Unknown intent action: ";
        r0 = r5.getAction();	 Catch:{ all -> 0x0047 }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x0047 }
        r3 = r0.length();	 Catch:{ all -> 0x0047 }
        if (r3 == 0) goto L_0x005a;
    L_0x0021:
        r0 = r2.concat(r0);	 Catch:{ all -> 0x0047 }
    L_0x0025:
        android.util.Log.d(r1, r0);	 Catch:{ all -> 0x0047 }
    L_0x0028:
        r4.zzBL();	 Catch:{ all -> 0x0047 }
        android.support.v4.b.p.completeWakefulIntent(r5);
        return;
    L_0x002f:
        r2 = "com.google.android.c2dm.intent.RECEIVE";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0047 }
        if (r1 == 0) goto L_0x000c;
    L_0x0037:
        r0 = 0;
        goto L_0x000c;
    L_0x0039:
        r2 = "com.google.firebase.messaging.NOTIFICATION_DISMISS";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0047 }
        if (r1 == 0) goto L_0x000c;
    L_0x0041:
        r0 = 1;
        goto L_0x000c;
    L_0x0043:
        r4.zzn(r5);	 Catch:{ all -> 0x0047 }
        goto L_0x0028;
    L_0x0047:
        r0 = move-exception;
        android.support.v4.b.p.completeWakefulIntent(r5);
        throw r0;
    L_0x004c:
        r0 = r5.getExtras();	 Catch:{ all -> 0x0047 }
        r0 = zzT(r0);	 Catch:{ all -> 0x0047 }
        if (r0 == 0) goto L_0x0028;
    L_0x0056:
        com.google.firebase.messaging.b.c(r4, r5);	 Catch:{ all -> 0x0047 }
        goto L_0x0028;
    L_0x005a:
        r0 = new java.lang.String;	 Catch:{ all -> 0x0047 }
        r0.<init>(r2);	 Catch:{ all -> 0x0047 }
        goto L_0x0025;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.zzm(android.content.Intent):void");
    }

    protected Intent zzz(Intent intent) {
        return FirebaseInstanceIdInternalReceiver.zzUr();
    }
}
