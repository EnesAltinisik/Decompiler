package com.google.android.gms.internal;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Map;

@zzig
public class zzkd {
    private final Context mContext;
    private int mState;
    private final float zzGx;
    private String zzQD;
    private float zzQE;
    private float zzQF;
    private float zzQG;

    public zzkd(Context context) {
        this.mState = 0;
        this.mContext = context;
        this.zzGx = context.getResources().getDisplayMetrics().density;
    }

    public zzkd(Context context, String str) {
        this(context);
        this.zzQD = str;
    }

    private void showDialog() {
        if (this.mContext instanceof Activity) {
            final Object zzaS = zzaS(this.zzQD);
            Builder builder = new Builder(this.mContext);
            builder.setMessage(zzaS);
            builder.setTitle("Ad Information");
            builder.setPositiveButton("Share", new OnClickListener(this) {
                final /* synthetic */ zzkd b;

                public void onClick(DialogInterface dialogInterface, int i) {
                    zzu.zzck().zzb(this.b.mContext, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", zzaS), "Share via"));
                }
            });
            builder.setNegativeButton("Close", new OnClickListener(this) {
                final /* synthetic */ zzkd a;

                {
                    this.a = r1;
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                }
            });
            builder.create().show();
            return;
        }
        zzb.zzaV("Can not create dialog without Activity Context");
    }

    static String zzaS(String str) {
        if (TextUtils.isEmpty(str)) {
            return "No debug information";
        }
        Uri build = new Uri.Builder().encodedQuery(str.replaceAll("\\+", "%20")).build();
        StringBuilder stringBuilder = new StringBuilder();
        Map zzf = zzu.zzck().zzf(build);
        for (String str2 : zzf.keySet()) {
            stringBuilder.append(str2).append(" = ").append((String) zzf.get(str2)).append("\n\n");
        }
        Object trim = stringBuilder.toString().trim();
        return TextUtils.isEmpty(trim) ? "No debug information" : trim;
    }

    void zza(int i, float f, float f2) {
        if (i == 0) {
            this.mState = 0;
            this.zzQE = f;
            this.zzQF = f2;
            this.zzQG = f2;
        } else if (this.mState == -1) {
        } else {
            if (i == 2) {
                if (f2 > this.zzQF) {
                    this.zzQF = f2;
                } else if (f2 < this.zzQG) {
                    this.zzQG = f2;
                }
                if (this.zzQF - this.zzQG > BitmapDescriptorFactory.HUE_ORANGE * this.zzGx) {
                    this.mState = -1;
                    return;
                }
                if (this.mState == 0 || this.mState == 2) {
                    if (f - this.zzQE >= 50.0f * this.zzGx) {
                        this.zzQE = f;
                        this.mState++;
                    }
                } else if ((this.mState == 1 || this.mState == 3) && f - this.zzQE <= -50.0f * this.zzGx) {
                    this.zzQE = f;
                    this.mState++;
                }
                if (this.mState == 1 || this.mState == 3) {
                    if (f > this.zzQE) {
                        this.zzQE = f;
                    }
                } else if (this.mState == 2 && f < this.zzQE) {
                    this.zzQE = f;
                }
            } else if (i == 1 && this.mState == 4) {
                showDialog();
            }
        }
    }

    public void zzaR(String str) {
        this.zzQD = str;
    }

    public void zze(MotionEvent motionEvent) {
        int historySize = motionEvent.getHistorySize();
        for (int i = 0; i < historySize; i++) {
            zza(motionEvent.getActionMasked(), motionEvent.getHistoricalX(0, i), motionEvent.getHistoricalY(0, i));
        }
        zza(motionEvent.getActionMasked(), motionEvent.getX(), motionEvent.getY());
    }
}
