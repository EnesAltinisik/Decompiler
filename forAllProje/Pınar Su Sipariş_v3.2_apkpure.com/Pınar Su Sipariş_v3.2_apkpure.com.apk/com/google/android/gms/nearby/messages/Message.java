package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.nearby.messages.devices.NearbyDevice;
import java.util.Arrays;

public class Message extends AbstractSafeParcelable {
    public static final Creator<Message> CREATOR = new zzc();
    public static final int MAX_CONTENT_SIZE_BYTES = 102400;
    public static final int MAX_TYPE_LENGTH = 32;
    private static final NearbyDevice[] zzbiL = new NearbyDevice[]{NearbyDevice.zzbjr};
    private final byte[] content;
    private final String type;
    final int versionCode;
    private final String zzasB;
    private final NearbyDevice[] zzbiM;

    Message(int i, byte[] bArr, String str, String str2, NearbyDevice[] nearbyDeviceArr) {
        this.versionCode = i;
        this.type = (String) zzaa.zzz(str2);
        if (str == null) {
            str = "";
        }
        this.zzasB = str;
        if (zzaa(this.zzasB, this.type)) {
            zzaa.zzb(bArr == null, (Object) "Content must be null for a device presence message.");
        } else {
            zzaa.zzz(bArr);
            zzaa.zzb(bArr.length <= MAX_CONTENT_SIZE_BYTES, "Content length(%d) must not exceed MAX_CONTENT_SIZE_BYTES(%d)", Integer.valueOf(bArr.length), Integer.valueOf(MAX_CONTENT_SIZE_BYTES));
        }
        this.content = bArr;
        if (nearbyDeviceArr == null || nearbyDeviceArr.length == 0) {
            nearbyDeviceArr = zzbiL;
        }
        this.zzbiM = nearbyDeviceArr;
        zzaa.zzb(str2.length() <= 32, "Type length(%d) must not exceed MAX_TYPE_LENGTH(%d)", Integer.valueOf(str2.length()), Integer.valueOf(32));
    }

    public Message(byte[] bArr) {
        this(bArr, "", "");
    }

    public Message(byte[] bArr, String str) {
        this(bArr, "", str);
    }

    public Message(byte[] bArr, String str, String str2) {
        this(bArr, str, str2, zzbiL);
    }

    public Message(byte[] bArr, String str, String str2, NearbyDevice[] nearbyDeviceArr) {
        this(2, bArr, str, str2, nearbyDeviceArr);
    }

    @Deprecated
    public static boolean zzaa(String str, String str2) {
        return str.equals("__reserved_namespace") && str2.equals("__device_presence");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Message)) {
            return false;
        }
        Message message = (Message) obj;
        return TextUtils.equals(this.zzasB, message.zzasB) && TextUtils.equals(this.type, message.type) && Arrays.equals(this.content, message.content);
    }

    public byte[] getContent() {
        return this.content;
    }

    public String getNamespace() {
        return this.zzasB;
    }

    public String getType() {
        return this.type;
    }

    public int hashCode() {
        return zzz.hashCode(this.zzasB, this.type, Integer.valueOf(Arrays.hashCode(this.content)));
    }

    public String toString() {
        String str = this.zzasB;
        String str2 = this.type;
        int length = this.content == null ? 0 : this.content.length;
        String valueOf = String.valueOf(Arrays.toString(zzHL()));
        return new StringBuilder(((String.valueOf(str).length() + 69) + String.valueOf(str2).length()) + String.valueOf(valueOf).length()).append("Message{namespace='").append(str).append("', type='").append(str2).append("', content=[").append(length).append(" bytes], devices=").append(valueOf).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzc.zza(this, parcel, i);
    }

    public NearbyDevice[] zzHL() {
        return this.zzbiM;
    }
}
