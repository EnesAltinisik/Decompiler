package com.google.android.gms.internal;

import android.net.Uri;
import com.adjust.sdk.Constants;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class zzus {
    private static zzus zzbsW;
    private static Integer zzbsY;
    private volatile String zzbnR;
    private volatile String zzbqe;
    private volatile a zzbsX;

    enum a {
        NONE,
        CONTAINER
    }

    zzus() {
        clear();
    }

    public static zzus zzLi() {
        zzus com_google_android_gms_internal_zzus;
        synchronized (zzus.class) {
            if (zzbsW == null) {
                zzbsW = new zzus();
            }
            com_google_android_gms_internal_zzus = zzbsW;
        }
        return com_google_android_gms_internal_zzus;
    }

    void clear() {
        this.zzbsX = a.NONE;
        this.zzbqe = null;
        this.zzbnR = null;
        zzbsY = null;
    }

    public String getContainerId() {
        return this.zzbnR;
    }

    public boolean isPreview() {
        return this.zzbsX == a.CONTAINER;
    }

    public String zzLj() {
        return this.zzbqe;
    }

    public synchronized boolean zzc(String str, Uri uri) {
        boolean z = false;
        synchronized (this) {
            String decode;
            try {
                decode = URLDecoder.decode(uri.toString(), Constants.ENCODING);
                String queryParameter;
                if (decode.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\S+")) {
                    queryParameter = uri.getQueryParameter("id");
                    String queryParameter2 = uri.getQueryParameter("gtm_auth");
                    String queryParameter3 = uri.getQueryParameter("gtm_preview");
                    if (!str.equals(queryParameter)) {
                        zzun.zzaW("Preview fails (container doesn't match the container specified by the asset)");
                    } else if (queryParameter == null || queryParameter.length() <= 0) {
                        queryParameter = "Bad preview url: ";
                        decode = String.valueOf(decode);
                        zzun.zzaW(decode.length() != 0 ? queryParameter.concat(decode) : new String(queryParameter));
                    } else {
                        if (queryParameter3 == null || queryParameter3.length() != 0) {
                            if (queryParameter3 == null || queryParameter3.length() <= 0 || queryParameter2 == null || queryParameter2.length() <= 0) {
                                queryParameter = "Bad preview url: ";
                                decode = String.valueOf(decode);
                                zzun.zzaW(decode.length() != 0 ? queryParameter.concat(decode) : new String(queryParameter));
                            } else {
                                this.zzbsX = a.CONTAINER;
                                this.zzbqe = uri.getQuery();
                                this.zzbnR = queryParameter;
                                if (zzbsY == null) {
                                    zzbsY = Integer.valueOf(zzun.getLogLevel());
                                }
                                zzun.zzLd();
                            }
                        } else if (!queryParameter.equals(this.zzbnR) || this.zzbsX == a.NONE) {
                            zzun.zzaW("Error in exiting preview mode. The container is not in preview.");
                        } else {
                            decode = "Exit preview mode for container: ";
                            String valueOf = String.valueOf(this.zzbnR);
                            zzun.v(valueOf.length() != 0 ? decode.concat(valueOf) : new String(decode));
                            this.zzbsX = a.NONE;
                            this.zzbnR = null;
                            this.zzbqe = null;
                            if (zzbsY == null) {
                                zzun.zzaW("Fail to restore log level (previous log level is null)");
                            } else {
                                zzun.v("Restore the previous log level");
                                zzun.setLogLevel(zzbsY.intValue());
                                zzbsY = null;
                            }
                        }
                        z = true;
                    }
                } else {
                    queryParameter = "Bad preview url: ";
                    decode = String.valueOf(decode);
                    zzun.zzaW(decode.length() != 0 ? queryParameter.concat(decode) : new String(queryParameter));
                }
            } catch (UnsupportedEncodingException e) {
                decode = String.valueOf(e);
                zzun.zzaW(new StringBuilder(String.valueOf(decode).length() + 32).append("Error decoding the preview url: ").append(decode).toString());
            }
        }
        return z;
    }
}
