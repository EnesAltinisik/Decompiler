package com.google.firebase.storage;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.nearby.messages.Strategy;
import com.google.android.gms.wallet.WalletConstants;
import com.google.firebase.FirebaseException;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class StorageException extends FirebaseException {
    static final /* synthetic */ boolean $assertionsDisabled = (!StorageException.class.desiredAssertionStatus());
    public static final int ERROR_BUCKET_NOT_FOUND = -13011;
    public static final int ERROR_CANCELED = -13040;
    public static final int ERROR_INVALID_CHECKSUM = -13031;
    public static final int ERROR_NOT_AUTHENTICATED = -13020;
    public static final int ERROR_NOT_AUTHORIZED = -13021;
    public static final int ERROR_OBJECT_NOT_FOUND = -13010;
    public static final int ERROR_PROJECT_NOT_FOUND = -13012;
    public static final int ERROR_QUOTA_EXCEEDED = -13013;
    public static final int ERROR_RETRY_LIMIT_EXCEEDED = -13030;
    public static final int ERROR_UNKNOWN = -13000;
    static IOException zzbUe = new IOException("The operation was canceled.");
    private final int zzKa;
    private final int zzbUf;
    private String zzbUg;
    private Throwable zzbUh;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ErrorCode {
    }

    StorageException(int i, Throwable th, int i2) {
        this.zzbUg = zznM(i);
        this.zzbUh = th;
        this.zzKa = i;
        this.zzbUf = i2;
        String str = this.zzbUg;
        String valueOf = String.valueOf(Integer.toString(this.zzKa));
        String valueOf2 = String.valueOf(Integer.toString(this.zzbUf));
        Log.e("StorageException", new StringBuilder(((String.valueOf(str).length() + 52) + String.valueOf(valueOf).length()) + String.valueOf(valueOf2).length()).append("StorageException has occurred.\n").append(str).append("\n Code: ").append(valueOf).append(" HttpResult: ").append(valueOf2).toString());
        if (this.zzbUh != null) {
            Log.e("StorageException", this.zzbUh.getMessage(), this.zzbUh);
        }
    }

    StorageException(Status status) {
        this(zzbP(status), null, 0);
    }

    StorageException(Throwable th, int i) {
        this(zza(th, i), th, i);
    }

    public static StorageException fromErrorStatus(Status status) {
        zzaa.zzz(status);
        zzaa.zzaj(!status.isSuccess());
        return new StorageException(status);
    }

    public static StorageException fromException(Throwable th) {
        StorageException fromExceptionAndHttpCode = fromExceptionAndHttpCode(th, 0);
        if ($assertionsDisabled || fromExceptionAndHttpCode != null) {
            return fromExceptionAndHttpCode;
        }
        throw new AssertionError();
    }

    public static StorageException fromExceptionAndHttpCode(Throwable th, int i) {
        return th instanceof StorageException ? (StorageException) th : (zznL(i) && th == null) ? null : new StorageException(th, i);
    }

    private static int zza(Throwable th, int i) {
        if (th == zzbUe) {
            return ERROR_CANCELED;
        }
        switch (i) {
            case -2:
                return ERROR_RETRY_LIMIT_EXCEEDED;
            case 401:
                return ERROR_NOT_AUTHENTICATED;
            case 403:
                return ERROR_NOT_AUTHORIZED;
            case WalletConstants.ERROR_CODE_INVALID_PARAMETERS /*404*/:
                return ERROR_OBJECT_NOT_FOUND;
            default:
                return ERROR_UNKNOWN;
        }
    }

    private static int zzbP(Status status) {
        return status.isCanceled() ? ERROR_CANCELED : status == Status.zzalz ? ERROR_RETRY_LIMIT_EXCEEDED : ERROR_UNKNOWN;
    }

    private static boolean zznL(int i) {
        return i == 0 || (i >= 200 && i < Strategy.TTL_SECONDS_DEFAULT);
    }

    static String zznM(int i) {
        switch (i) {
            case ERROR_CANCELED /*-13040*/:
                return "The operation was cancelled.";
            case ERROR_INVALID_CHECKSUM /*-13031*/:
                return "Object has a checksum which does not match. Please retry the operation.";
            case ERROR_RETRY_LIMIT_EXCEEDED /*-13030*/:
                return "The operation retry limit has been exceeded.";
            case ERROR_NOT_AUTHORIZED /*-13021*/:
                return "User does not have permission to access this object.";
            case ERROR_NOT_AUTHENTICATED /*-13020*/:
                return "User is not authenticated, please authenticate using Firebase Authentication and try again.";
            case ERROR_QUOTA_EXCEEDED /*-13013*/:
                return "Quota for bucket exceeded, please view quota on www.firebase.google.com/storage.";
            case ERROR_PROJECT_NOT_FOUND /*-13012*/:
                return "Project does not exist.";
            case ERROR_BUCKET_NOT_FOUND /*-13011*/:
                return "Bucket does not exist.";
            case ERROR_OBJECT_NOT_FOUND /*-13010*/:
                return "Object does not exist at location.";
            case ERROR_UNKNOWN /*-13000*/:
                return "An unknown error occurred, please check the HTTP result code and inner exception for server response.";
            default:
                return "An unknown error occurred, please check the HTTP result code and inner exception for server response.";
        }
    }

    public Throwable getCause() {
        return this.zzbUh == this ? null : this.zzbUh;
    }

    public int getErrorCode() {
        return this.zzKa;
    }

    public int getHttpResultCode() {
        return this.zzbUf;
    }

    public boolean getIsRecoverableException() {
        return getErrorCode() == ERROR_RETRY_LIMIT_EXCEEDED;
    }

    public String getMessage() {
        return this.zzbUg;
    }
}
