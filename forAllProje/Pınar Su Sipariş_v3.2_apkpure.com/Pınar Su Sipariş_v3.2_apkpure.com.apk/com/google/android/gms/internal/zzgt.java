package com.google.android.gms.internal;

import a.a.a.a.a.b.a;
import android.app.AlertDialog.Builder;
import android.app.DownloadManager;
import android.app.DownloadManager.Request;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.R;
import com.google.android.gms.ads.internal.zzu;
import java.util.Map;

@zzig
public class zzgt extends zzgw {
    private final Context mContext;
    private final Map<String, String> zzAd;

    public zzgt(zzla com_google_android_gms_internal_zzla, Map<String, String> map) {
        super(com_google_android_gms_internal_zzla, "storePicture");
        this.zzAd = map;
        this.mContext = com_google_android_gms_internal_zzla.zzjy();
    }

    public void execute() {
        if (this.mContext == null) {
            zzas("Activity context is not available");
        } else if (zzu.zzck().zzF(this.mContext).zzel()) {
            final String str = (String) this.zzAd.get("iurl");
            if (TextUtils.isEmpty(str)) {
                zzas("Image url cannot be empty.");
            } else if (URLUtil.isValidUrl(str)) {
                final String zzar = zzar(str);
                if (zzu.zzck().zzaP(zzar)) {
                    Resources resources = zzu.zzcn().getResources();
                    Builder zzE = zzu.zzck().zzE(this.mContext);
                    zzE.setTitle(resources != null ? resources.getString(R.string.store_picture_title) : "Save image");
                    zzE.setMessage(resources != null ? resources.getString(R.string.store_picture_message) : "Allow Ad to store image in Picture gallery?");
                    zzE.setPositiveButton(resources != null ? resources.getString(R.string.accept) : a.HEADER_ACCEPT, new OnClickListener(this) {
                        final /* synthetic */ zzgt c;

                        public void onClick(DialogInterface dialogInterface, int i) {
                            try {
                                ((DownloadManager) this.c.mContext.getSystemService("download")).enqueue(this.c.zzi(str, zzar));
                            } catch (IllegalStateException e) {
                                this.c.zzas("Could not store picture.");
                            }
                        }
                    });
                    zzE.setNegativeButton(resources != null ? resources.getString(R.string.decline) : "Decline", new OnClickListener(this) {
                        final /* synthetic */ zzgt a;

                        {
                            this.a = r1;
                        }

                        public void onClick(DialogInterface dialogInterface, int i) {
                            this.a.zzas("User canceled the download.");
                        }
                    });
                    zzE.create().show();
                    return;
                }
                r1 = "Image type not recognized: ";
                str = String.valueOf(zzar);
                zzas(str.length() != 0 ? r1.concat(str) : new String(r1));
            } else {
                r1 = "Invalid image url: ";
                str = String.valueOf(str);
                zzas(str.length() != 0 ? r1.concat(str) : new String(r1));
            }
        } else {
            zzas("Feature is not supported by the device.");
        }
    }

    String zzar(String str) {
        return Uri.parse(str).getLastPathSegment();
    }

    Request zzi(String str, String str2) {
        Request request = new Request(Uri.parse(str));
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
        zzu.zzcm().zza(request);
        return request;
    }
}
