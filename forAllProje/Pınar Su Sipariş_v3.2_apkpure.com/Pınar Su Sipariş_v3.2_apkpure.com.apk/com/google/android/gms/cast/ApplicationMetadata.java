package com.google.android.gms.cast;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.cast.internal.zzf;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzz;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ApplicationMetadata extends AbstractSafeParcelable {
    public static final Creator<ApplicationMetadata> CREATOR = new zza();
    String mName;
    private final int mVersionCode;
    List<WebImage> zzAD;
    String zzaeg;
    List<String> zzaeh;
    String zzaei;
    Uri zzaej;

    private ApplicationMetadata() {
        this.mVersionCode = 1;
        this.zzAD = new ArrayList();
        this.zzaeh = new ArrayList();
    }

    ApplicationMetadata(int i, String str, String str2, List<WebImage> list, List<String> list2, String str3, Uri uri) {
        this.mVersionCode = i;
        this.zzaeg = str;
        this.mName = str2;
        this.zzAD = list;
        this.zzaeh = list2;
        this.zzaei = str3;
        this.zzaej = uri;
    }

    public boolean areNamespacesSupported(List<String> list) {
        return this.zzaeh != null && this.zzaeh.containsAll(list);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ApplicationMetadata)) {
            return false;
        }
        ApplicationMetadata applicationMetadata = (ApplicationMetadata) obj;
        return zzf.zza(this.zzaeg, applicationMetadata.zzaeg) && zzf.zza(this.zzAD, applicationMetadata.zzAD) && zzf.zza(this.mName, applicationMetadata.mName) && zzf.zza(this.zzaeh, applicationMetadata.zzaeh) && zzf.zza(this.zzaei, applicationMetadata.zzaei) && zzf.zza(this.zzaej, applicationMetadata.zzaej);
    }

    public String getApplicationId() {
        return this.zzaeg;
    }

    public List<WebImage> getImages() {
        return this.zzAD;
    }

    public String getName() {
        return this.mName;
    }

    public String getSenderAppIdentifier() {
        return this.zzaei;
    }

    public List<String> getSupportedNamespaces() {
        return Collections.unmodifiableList(this.zzaeh);
    }

    int getVersionCode() {
        return this.mVersionCode;
    }

    public int hashCode() {
        return zzz.hashCode(Integer.valueOf(this.mVersionCode), this.zzaeg, this.mName, this.zzAD, this.zzaeh, this.zzaei, this.zzaej);
    }

    public boolean isNamespaceSupported(String str) {
        return this.zzaeh != null && this.zzaeh.contains(str);
    }

    public String toString() {
        int i = 0;
        StringBuilder append = new StringBuilder().append("applicationId: ").append(this.zzaeg).append(", name: ").append(this.mName).append(", images.count: ").append(this.zzAD == null ? 0 : this.zzAD.size()).append(", namespaces.count: ");
        if (this.zzaeh != null) {
            i = this.zzaeh.size();
        }
        return append.append(i).append(", senderAppIdentifier: ").append(this.zzaei).append(", senderAppLaunchUrl: ").append(this.zzaej).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zza.zza(this, parcel, i);
    }

    public Uri zzpF() {
        return this.zzaej;
    }
}
