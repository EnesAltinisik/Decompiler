package com.google.android.gms.b;

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
import com.google.android.gms.ads.internal.v;
import java.util.Map;

@vz
public class uh extends uk {
    private final Map<String, String> a;
    private final Context b;

    public uh(aaq com_google_android_gms_b_aaq, Map<String, String> map) {
        super(com_google_android_gms_b_aaq, "storePicture");
        this.a = map;
        this.b = com_google_android_gms_b_aaq.f();
    }

    Request a(String str, String str2) {
        Request request = new Request(Uri.parse(str));
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
        v.g().a(request);
        return request;
    }

    String a(String str) {
        return Uri.parse(str).getLastPathSegment();
    }

    public void a() {
        if (this.b == null) {
            b("Activity context is not available");
        } else if (v.e().e(this.b).c()) {
            final String str = (String) this.a.get("iurl");
            if (TextUtils.isEmpty(str)) {
                b("Image url cannot be empty.");
            } else if (URLUtil.isValidUrl(str)) {
                final String a = a(str);
                if (v.e().c(a)) {
                    Resources s = v.i().s();
                    Builder d = v.e().d(this.b);
                    d.setTitle(s != null ? s.getString(R.string.store_picture_title) : "Save image");
                    d.setMessage(s != null ? s.getString(R.string.store_picture_message) : "Allow Ad to store image in Picture gallery?");
                    d.setPositiveButton(s != null ? s.getString(R.string.accept) : "Accept", new OnClickListener(this) {
                        final /* synthetic */ uh c;

                        public void onClick(DialogInterface dialogInterface, int i) {
                            try {
                                ((DownloadManager) this.c.b.getSystemService("download")).enqueue(this.c.a(str, a));
                            } catch (IllegalStateException e) {
                                this.c.b("Could not store picture.");
                            }
                        }
                    });
                    d.setNegativeButton(s != null ? s.getString(R.string.decline) : "Decline", new OnClickListener(this) {
                        final /* synthetic */ uh a;

                        {
                            this.a = r1;
                        }

                        public void onClick(DialogInterface dialogInterface, int i) {
                            this.a.b("User canceled the download.");
                        }
                    });
                    d.create().show();
                    return;
                }
                r1 = "Image type not recognized: ";
                str = String.valueOf(a);
                b(str.length() != 0 ? r1.concat(str) : new String(r1));
            } else {
                r1 = "Invalid image url: ";
                str = String.valueOf(str);
                b(str.length() != 0 ? r1.concat(str) : new String(r1));
            }
        } else {
            b("Feature is not supported by the device.");
        }
    }
}
