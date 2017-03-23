package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;

public class zzaq {
    private static final String[] zzoo = new String[]{"/aclk", "/pcs/click"};
    private String zzok = "googleads.g.doubleclick.net";
    private String zzol = "/pagead/ads";
    private String zzom = "ad.doubleclick.net";
    private String[] zzon = new String[]{".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
    private zzal zzop;

    public zzaq(zzal com_google_android_gms_internal_zzal) {
        this.zzop = com_google_android_gms_internal_zzal;
    }

    private Uri zza(Uri uri, Context context, String str, boolean z) throws zzar {
        try {
            boolean zzb = zzb(uri);
            if (zzb) {
                if (uri.toString().contains("dc_ms=")) {
                    throw new zzar("Parameter already exists: dc_ms");
                }
            } else if (uri.getQueryParameter("ms") != null) {
                throw new zzar("Query parameter already exists: ms");
            }
            String zzb2 = z ? this.zzop.zzb(context, str) : this.zzop.zzb(context);
            return zzb ? zzb(uri, "dc_ms", zzb2) : zza(uri, "ms", zzb2);
        } catch (UnsupportedOperationException e) {
            throw new zzar("Provided Uri is not in a valid state");
        }
    }

    private Uri zza(Uri uri, String str, String str2) throws UnsupportedOperationException {
        String uri2 = uri.toString();
        int indexOf = uri2.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = uri2.indexOf("?adurl");
        }
        return indexOf != -1 ? Uri.parse(new StringBuilder(uri2.substring(0, indexOf + 1)).append(str).append("=").append(str2).append("&").append(uri2.substring(indexOf + 1)).toString()) : uri.buildUpon().appendQueryParameter(str, str2).build();
    }

    private Uri zzb(Uri uri, String str, String str2) {
        String uri2 = uri.toString();
        int indexOf = uri2.indexOf(";adurl");
        if (indexOf != -1) {
            return Uri.parse(new StringBuilder(uri2.substring(0, indexOf + 1)).append(str).append("=").append(str2).append(";").append(uri2.substring(indexOf + 1)).toString());
        }
        String encodedPath = uri.getEncodedPath();
        int indexOf2 = uri2.indexOf(encodedPath);
        return Uri.parse(new StringBuilder(uri2.substring(0, encodedPath.length() + indexOf2)).append(";").append(str).append("=").append(str2).append(";").append(uri2.substring(encodedPath.length() + indexOf2)).toString());
    }

    public zzal zzW() {
        return this.zzop;
    }

    public Uri zza(Uri uri, Context context) throws zzar {
        return zza(uri, context, null, false);
    }

    public void zza(MotionEvent motionEvent) {
        this.zzop.zza(motionEvent);
    }

    public boolean zza(Uri uri) {
        if (uri == null) {
            throw new NullPointerException();
        }
        try {
            return uri.getHost().equals(this.zzok) && uri.getPath().equals(this.zzol);
        } catch (NullPointerException e) {
            return false;
        }
    }

    public Uri zzb(Uri uri, Context context) throws zzar {
        try {
            return zza(uri, context, uri.getQueryParameter("ai"), true);
        } catch (UnsupportedOperationException e) {
            throw new zzar("Provided Uri is not in a valid state");
        }
    }

    public void zzb(String str, String str2) {
        this.zzok = str;
        this.zzol = str2;
    }

    public boolean zzb(Uri uri) {
        if (uri == null) {
            throw new NullPointerException();
        }
        try {
            return uri.getHost().equals(this.zzom);
        } catch (NullPointerException e) {
            return false;
        }
    }

    public boolean zzc(Uri uri) {
        if (uri == null) {
            throw new NullPointerException();
        }
        try {
            String host = uri.getHost();
            for (String endsWith : this.zzon) {
                if (host.endsWith(endsWith)) {
                    return true;
                }
            }
            return false;
        } catch (NullPointerException e) {
            return false;
        }
    }

    public boolean zzd(Uri uri) {
        if (!zzc(uri)) {
            return false;
        }
        for (String endsWith : zzoo) {
            if (uri.getPath().endsWith(endsWith)) {
                return true;
            }
        }
        return false;
    }

    public void zzk(String str) {
        this.zzon = str.split(",");
    }
}
