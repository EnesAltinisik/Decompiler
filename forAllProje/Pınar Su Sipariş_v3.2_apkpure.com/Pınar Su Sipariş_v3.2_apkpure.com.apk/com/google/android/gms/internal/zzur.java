package com.google.android.gms.internal;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.google.android.gms.R;

public class zzur {
    private final Intent mIntent;
    private final Context zzaCt;
    private final Context zzaeV;
    private final zzvb zzbrB;

    public zzur(Intent intent, Context context, Context context2, zzvb com_google_android_gms_internal_zzvb) {
        this.zzaeV = context;
        this.zzaCt = context2;
        this.mIntent = intent;
        this.zzbrB = com_google_android_gms_internal_zzvb;
    }

    private void zzm(String str, String str2, String str3) {
        AlertDialog create = new Builder(this.zzaeV).create();
        create.setTitle(str);
        create.setMessage(str2);
        create.setButton(-1, str3, new OnClickListener(this) {
            final /* synthetic */ zzur a;

            {
                this.a = r1;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                String packageName = this.a.zzaeV.getPackageName();
                Intent launchIntentForPackage = this.a.zzaeV.getPackageManager().getLaunchIntentForPackage(packageName);
                if (launchIntentForPackage != null) {
                    String str = "Invoke the launch activity for package name: ";
                    packageName = String.valueOf(packageName);
                    zzun.zzaV(packageName.length() != 0 ? str.concat(packageName) : new String(str));
                    this.a.zzaeV.startActivity(launchIntentForPackage);
                    return;
                }
                String str2 = "No launch activity found for package name: ";
                packageName = String.valueOf(packageName);
                zzun.zzaW(packageName.length() != 0 ? str2.concat(packageName) : new String(str2));
            }
        });
        create.show();
    }

    public void zzLh() {
        try {
            this.zzbrB.zzt(this.mIntent.getData());
            zzm(this.zzaCt.getResources().getString(R.string.tagmanager_preview_dialog_title), this.zzaCt.getResources().getString(R.string.tagmanager_preview_dialog_message), this.zzaCt.getResources().getString(R.string.tagmanager_preview_dialog_button));
        } catch (Exception e) {
            String str = "Calling preview threw an exception: ";
            String valueOf = String.valueOf(e.getMessage());
            zzun.e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
    }
}
