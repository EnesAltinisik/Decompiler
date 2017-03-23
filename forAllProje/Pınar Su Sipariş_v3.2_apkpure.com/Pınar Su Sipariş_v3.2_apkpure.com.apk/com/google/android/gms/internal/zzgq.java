package com.google.android.gms.internal;

import a.a.a.a.a.b.a;
import android.annotation.TargetApi;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract.Events;
import android.text.TextUtils;
import com.google.android.gms.R;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.drive.DriveFile;
import com.google.android.gms.plus.PlusShare;
import com.google.firebase.analytics.FirebaseAnalytics.Param;
import java.util.Map;

@zzig
public class zzgq extends zzgw {
    private final Context mContext;
    private final Map<String, String> zzAd;
    private String zzFR;
    private long zzFS;
    private long zzFT;
    private String zzFU;
    private String zzFV;

    public zzgq(zzla com_google_android_gms_internal_zzla, Map<String, String> map) {
        super(com_google_android_gms_internal_zzla, "createCalendarEvent");
        this.zzAd = map;
        this.mContext = com_google_android_gms_internal_zzla.zzjy();
        zzfN();
    }

    private String zzap(String str) {
        return TextUtils.isEmpty((CharSequence) this.zzAd.get(str)) ? "" : (String) this.zzAd.get(str);
    }

    private long zzaq(String str) {
        String str2 = (String) this.zzAd.get(str);
        if (str2 == null) {
            return -1;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private void zzfN() {
        this.zzFR = zzap(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_DESCRIPTION);
        this.zzFU = zzap("summary");
        this.zzFS = zzaq("start_ticks");
        this.zzFT = zzaq("end_ticks");
        this.zzFV = zzap(Param.LOCATION);
    }

    @TargetApi(14)
    Intent createIntent() {
        Intent data = new Intent("android.intent.action.EDIT").setData(Events.CONTENT_URI);
        data.putExtra(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE, this.zzFR);
        data.putExtra("eventLocation", this.zzFV);
        data.putExtra(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_DESCRIPTION, this.zzFU);
        if (this.zzFS > -1) {
            data.putExtra("beginTime", this.zzFS);
        }
        if (this.zzFT > -1) {
            data.putExtra("endTime", this.zzFT);
        }
        data.setFlags(DriveFile.MODE_READ_ONLY);
        return data;
    }

    public void execute() {
        if (this.mContext == null) {
            zzas("Activity context is not available.");
        } else if (zzu.zzck().zzF(this.mContext).zzeo()) {
            Builder zzE = zzu.zzck().zzE(this.mContext);
            Resources resources = zzu.zzcn().getResources();
            zzE.setTitle(resources != null ? resources.getString(R.string.create_calendar_title) : "Create calendar event");
            zzE.setMessage(resources != null ? resources.getString(R.string.create_calendar_message) : "Allow Ad to create a calendar event?");
            zzE.setPositiveButton(resources != null ? resources.getString(R.string.accept) : a.HEADER_ACCEPT, new OnClickListener(this) {
                final /* synthetic */ zzgq a;

                {
                    this.a = r1;
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                    zzu.zzck().zzb(this.a.mContext, this.a.createIntent());
                }
            });
            zzE.setNegativeButton(resources != null ? resources.getString(R.string.decline) : "Decline", new OnClickListener(this) {
                final /* synthetic */ zzgq a;

                {
                    this.a = r1;
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                    this.a.zzas("Operation denied by user.");
                }
            });
            zzE.create().show();
        } else {
            zzas("This feature is not available on the device.");
        }
    }
}
