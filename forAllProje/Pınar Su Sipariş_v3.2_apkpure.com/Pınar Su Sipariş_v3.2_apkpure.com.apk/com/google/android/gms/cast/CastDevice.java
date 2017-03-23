package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.internal.zzf;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CastDevice extends AbstractSafeParcelable {
    public static final int CAPABILITY_AUDIO_IN = 8;
    public static final int CAPABILITY_AUDIO_OUT = 4;
    public static final int CAPABILITY_MULTIZONE_GROUP = 32;
    public static final int CAPABILITY_VIDEO_IN = 2;
    public static final int CAPABILITY_VIDEO_OUT = 1;
    public static final Creator<CastDevice> CREATOR = new zzb();
    private final int mVersionCode;
    private int zzDO;
    private String zzaeA;
    private String zzaeB;
    private String zzaeC;
    private int zzaeD;
    private List<WebImage> zzaeE;
    private int zzaeF;
    private String zzaeG;
    private String zzaex;
    String zzaey;
    private Inet4Address zzaez;

    private CastDevice() {
        this(4, null, null, null, null, null, -1, new ArrayList(), 0, -1, null);
    }

    CastDevice(int i, String str, String str2, String str3, String str4, String str5, int i2, List<WebImage> list, int i3, int i4, String str6) {
        List arrayList;
        this.mVersionCode = i;
        this.zzaex = zzcw(str);
        this.zzaey = zzcw(str2);
        if (!TextUtils.isEmpty(this.zzaey)) {
            try {
                InetAddress byName = InetAddress.getByName(this.zzaey);
                if (byName instanceof Inet4Address) {
                    this.zzaez = (Inet4Address) byName;
                }
            } catch (UnknownHostException e) {
                String str7 = this.zzaey;
                String valueOf = String.valueOf(e.getMessage());
                Log.i("CastDevice", new StringBuilder((String.valueOf(str7).length() + 48) + String.valueOf(valueOf).length()).append("Unable to convert host address (").append(str7).append(") to ipaddress: ").append(valueOf).toString());
            }
        }
        this.zzaeA = zzcw(str3);
        this.zzaeB = zzcw(str4);
        this.zzaeC = zzcw(str5);
        this.zzaeD = i2;
        if (list == null) {
            arrayList = new ArrayList();
        }
        this.zzaeE = arrayList;
        this.zzaeF = i3;
        this.zzDO = i4;
        this.zzaeG = zzcw(str6);
    }

    public static CastDevice getFromBundle(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(CastDevice.class.getClassLoader());
        return (CastDevice) bundle.getParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE");
    }

    private static String zzcw(String str) {
        return str == null ? "" : str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CastDevice)) {
            return false;
        }
        CastDevice castDevice = (CastDevice) obj;
        return this.zzaex == null ? castDevice.zzaex == null : zzf.zza(this.zzaex, castDevice.zzaex) && zzf.zza(this.zzaez, castDevice.zzaez) && zzf.zza(this.zzaeB, castDevice.zzaeB) && zzf.zza(this.zzaeA, castDevice.zzaeA) && zzf.zza(this.zzaeC, castDevice.zzaeC) && this.zzaeD == castDevice.zzaeD && zzf.zza(this.zzaeE, castDevice.zzaeE) && this.zzaeF == castDevice.zzaeF && this.zzDO == castDevice.zzDO && zzf.zza(this.zzaeG, castDevice.zzaeG);
    }

    public int getCapabilities() {
        return this.zzaeF;
    }

    public String getDeviceId() {
        return this.zzaex.startsWith("__cast_nearby__") ? this.zzaex.substring("__cast_nearby__".length() + 1) : this.zzaex;
    }

    public String getDeviceVersion() {
        return this.zzaeC;
    }

    public String getFriendlyName() {
        return this.zzaeA;
    }

    public WebImage getIcon(int i, int i2) {
        WebImage webImage = null;
        if (this.zzaeE.isEmpty()) {
            return null;
        }
        if (i <= 0 || i2 <= 0) {
            return (WebImage) this.zzaeE.get(0);
        }
        WebImage webImage2 = null;
        for (WebImage webImage3 : this.zzaeE) {
            WebImage webImage32;
            int width = webImage32.getWidth();
            int height = webImage32.getHeight();
            if (width < i || height < i2) {
                if (width < i && height < i2 && (webImage == null || (webImage.getWidth() < width && webImage.getHeight() < height))) {
                    webImage = webImage2;
                }
                webImage32 = webImage;
                webImage = webImage2;
            } else {
                if (webImage2 == null || (webImage2.getWidth() > width && webImage2.getHeight() > height)) {
                    WebImage webImage4 = webImage;
                    webImage = webImage32;
                    webImage32 = webImage4;
                }
                webImage32 = webImage;
                webImage = webImage2;
            }
            webImage2 = webImage;
            webImage = webImage32;
        }
        if (webImage2 == null) {
            webImage2 = webImage != null ? webImage : (WebImage) this.zzaeE.get(0);
        }
        return webImage2;
    }

    public List<WebImage> getIcons() {
        return Collections.unmodifiableList(this.zzaeE);
    }

    public Inet4Address getIpAddress() {
        return this.zzaez;
    }

    public String getModelName() {
        return this.zzaeB;
    }

    public int getServicePort() {
        return this.zzaeD;
    }

    public int getStatus() {
        return this.zzDO;
    }

    int getVersionCode() {
        return this.mVersionCode;
    }

    public boolean hasCapabilities(int[] iArr) {
        if (iArr == null) {
            return false;
        }
        for (int hasCapability : iArr) {
            if (!hasCapability(hasCapability)) {
                return false;
            }
        }
        return true;
    }

    public boolean hasCapability(int i) {
        return (this.zzaeF & i) == i;
    }

    public boolean hasIcons() {
        return !this.zzaeE.isEmpty();
    }

    public int hashCode() {
        return this.zzaex == null ? 0 : this.zzaex.hashCode();
    }

    public boolean isOnLocalNetwork() {
        return !this.zzaex.startsWith("__cast_nearby__");
    }

    public boolean isSameDevice(CastDevice castDevice) {
        return castDevice == null ? false : this.zzaex == null ? castDevice.zzaex == null : zzf.zza(this.zzaex, castDevice.zzaex);
    }

    public void putInBundle(Bundle bundle) {
        if (bundle != null) {
            bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", this);
        }
    }

    public String toString() {
        return String.format("\"%s\" (%s)", new Object[]{this.zzaeA, this.zzaex});
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzb.zza(this, parcel, i);
    }

    public String zzpG() {
        return this.zzaex;
    }

    public String zzpH() {
        return this.zzaeG;
    }
}
