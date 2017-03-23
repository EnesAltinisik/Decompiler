package com.google.firebase.storage;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.internal.zzajp;
import com.google.firebase.FirebaseApp;
import java.util.HashMap;
import java.util.Map;

public class FirebaseStorage {
    static final /* synthetic */ boolean $assertionsDisabled = (!FirebaseStorage.class.desiredAssertionStatus());
    private static final Map<FirebaseApp, FirebaseStorage> zzbTZ = new HashMap();
    private final FirebaseApp zzbSD;
    private long zzbUa = 600000;
    private long zzbUb = 600000;
    private long zzbUc = 120000;

    private FirebaseStorage(FirebaseApp firebaseApp) {
        this.zzbSD = firebaseApp;
    }

    public static FirebaseStorage getInstance() {
        FirebaseApp instance = FirebaseApp.getInstance();
        zzaa.zzb(instance != null, (Object) "You must call FirebaseApp.initialize() first.");
        if ($assertionsDisabled || instance != null) {
            return getInstance(instance);
        }
        throw new AssertionError();
    }

    public static FirebaseStorage getInstance(FirebaseApp firebaseApp) {
        FirebaseStorage firebaseStorage;
        zzaa.zzb(firebaseApp != null, (Object) "Null is not a valid value for the FirebaseApp.");
        synchronized (zzbTZ) {
            firebaseStorage = (FirebaseStorage) zzbTZ.get(firebaseApp);
            if (firebaseStorage == null) {
                firebaseStorage = new FirebaseStorage(firebaseApp);
                zzbTZ.put(firebaseApp, firebaseStorage);
            }
        }
        return firebaseStorage;
    }

    private String zzUR() {
        return this.zzbSD.getOptions().getStorageBucket();
    }

    private StorageReference zzv(Uri uri) {
        zzaa.zzb((Object) uri, (Object) "uri must not be null");
        Object zzUR = zzUR();
        boolean z = TextUtils.isEmpty(zzUR) || uri.getAuthority().equalsIgnoreCase(zzUR);
        zzaa.zzb(z, (Object) "The supplied bucketname is not available to this project.");
        return new StorageReference(uri, this);
    }

    public FirebaseApp getApp() {
        return this.zzbSD;
    }

    public long getMaxDownloadRetryTimeMillis() {
        return this.zzbUb;
    }

    public long getMaxOperationRetryTimeMillis() {
        return this.zzbUc;
    }

    public long getMaxUploadRetryTimeMillis() {
        return this.zzbUa;
    }

    public StorageReference getReference() {
        if (!TextUtils.isEmpty(zzUR())) {
            return zzv(new Builder().scheme("gs").authority(zzUR()).path("/").build());
        }
        throw new IllegalStateException("FirebaseApp was not initialized with a bucket name.");
    }

    public StorageReference getReference(String str) {
        zzaa.zzb(!TextUtils.isEmpty(str), (Object) "location must not be null or empty");
        String toLowerCase = str.toLowerCase();
        if (!toLowerCase.startsWith("gs://") && !toLowerCase.startsWith("https://") && !toLowerCase.startsWith("http://")) {
            return getReference().child(str);
        }
        throw new IllegalArgumentException("location should not be a full URL.");
    }

    public StorageReference getReferenceFromUrl(String str) {
        zzaa.zzb(!TextUtils.isEmpty(str), (Object) "location must not be null or empty");
        String toLowerCase = str.toLowerCase();
        if (toLowerCase.startsWith("gs://") || toLowerCase.startsWith("https://") || toLowerCase.startsWith("http://")) {
            try {
                Uri zzc = zzajp.zzc(this.zzbSD, str);
                if (zzc != null) {
                    return zzv(zzc);
                }
                throw new IllegalArgumentException("The storage Uri could not be parsed.");
            } catch (Throwable e) {
                Throwable th = e;
                String str2 = "FirebaseStorage";
                String str3 = "Unable to parse location:";
                toLowerCase = String.valueOf(str);
                Log.e(str2, toLowerCase.length() != 0 ? str3.concat(toLowerCase) : new String(str3), th);
                throw new IllegalArgumentException("The storage Uri could not be parsed.");
            }
        }
        throw new IllegalArgumentException("The storage Uri could not be parsed.");
    }

    public void setMaxDownloadRetryTimeMillis(long j) {
        this.zzbUb = j;
    }

    public void setMaxOperationRetryTimeMillis(long j) {
        this.zzbUc = j;
    }

    public void setMaxUploadRetryTimeMillis(long j) {
        this.zzbUa = j;
    }
}
