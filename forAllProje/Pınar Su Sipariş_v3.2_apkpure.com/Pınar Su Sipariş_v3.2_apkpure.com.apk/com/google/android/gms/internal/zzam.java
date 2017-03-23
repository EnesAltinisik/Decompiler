package com.google.android.gms.internal;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import com.google.ads.afma.nano.Google3NanoAfmaSignals.AFMASignals;
import com.google.android.gms.cast.TextTrackStyle;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.LinkedList;

public abstract class zzam implements zzal {
    protected MotionEvent zznT;
    protected LinkedList<MotionEvent> zznU = new LinkedList();
    protected long zznV = 0;
    protected long zznW = 0;
    protected long zznX = 0;
    protected long zznY = 0;
    protected long zznZ = 0;
    private boolean zzoa = false;
    protected DisplayMetrics zzob;

    protected zzam(Context context) {
        h.a();
        try {
            this.zzob = context.getResources().getDisplayMetrics();
        } catch (UnsupportedOperationException e) {
            this.zzob = new DisplayMetrics();
            this.zzob.density = TextTrackStyle.DEFAULT_FONT_SCALE;
        }
    }

    private void zzV() {
        if (((Boolean) zzcu.zzyU.get()).booleanValue()) {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            int i = 0;
            int length = stackTrace.length - 1;
            while (length >= 0) {
                i++;
                if (stackTrace[length].toString().startsWith("com.google.android.ads.") || stackTrace[length].toString().startsWith("com.google.android.gms.")) {
                    break;
                }
                length--;
            }
            this.zznZ = (long) i;
        }
    }

    private String zza(Context context, String str, boolean z) {
        AFMASignals aFMASignals;
        if (z) {
            try {
                AFMASignals zzd = zzd(context);
                this.zzoa = true;
                aFMASignals = zzd;
            } catch (NoSuchAlgorithmException e) {
                return Integer.toString(7);
            } catch (UnsupportedEncodingException e2) {
                return Integer.toString(7);
            } catch (Throwable th) {
                return Integer.toString(3);
            }
        }
        aFMASignals = zzc(context);
        return (aFMASignals == null || aFMASignals.getSerializedSize() == 0) ? Integer.toString(5) : h.a(aFMASignals, str, ((Boolean) zzcu.zzyM.get()).booleanValue());
    }

    public void zza(int i, int i2, int i3) {
        if (this.zznT != null) {
            this.zznT.recycle();
        }
        this.zznT = MotionEvent.obtain(0, (long) i3, 1, ((float) i) * this.zzob.density, ((float) i2) * this.zzob.density, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
    }

    public void zza(MotionEvent motionEvent) {
        if (this.zzoa) {
            this.zznY = 0;
            this.zznX = 0;
            this.zznW = 0;
            this.zznV = 0;
            this.zznZ = 0;
            Iterator it = this.zznU.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            this.zznU.clear();
            this.zznT = null;
            this.zzoa = false;
        }
        switch (motionEvent.getAction()) {
            case 0:
                this.zznV++;
                return;
            case 1:
                this.zznT = MotionEvent.obtain(motionEvent);
                this.zznU.add(this.zznT);
                if (this.zznU.size() > 6) {
                    ((MotionEvent) this.zznU.remove()).recycle();
                }
                this.zznX++;
                zzV();
                return;
            case 2:
                this.zznW += (long) (motionEvent.getHistorySize() + 1);
                return;
            case 3:
                this.zznY++;
                return;
            default:
                return;
        }
    }

    public String zzb(Context context) {
        return zza(context, null, false);
    }

    public String zzb(Context context, String str) {
        return zza(context, str, true);
    }

    protected abstract AFMASignals zzc(Context context);

    protected abstract AFMASignals zzd(Context context);
}
