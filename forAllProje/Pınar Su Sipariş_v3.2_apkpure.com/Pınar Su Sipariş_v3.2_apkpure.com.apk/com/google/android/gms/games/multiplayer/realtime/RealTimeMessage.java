package com.google.android.gms.games.multiplayer.realtime;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.zzaa;

public final class RealTimeMessage implements Parcelable {
    public static final Creator<RealTimeMessage> CREATOR = new Creator<RealTimeMessage>() {
        public RealTimeMessage a(Parcel parcel) {
            return new RealTimeMessage(parcel);
        }

        public RealTimeMessage[] a(int i) {
            return new RealTimeMessage[i];
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return a(i);
        }
    };
    public static final int RELIABLE = 1;
    public static final int UNRELIABLE = 0;
    private final String zzaQT;
    private final byte[] zzaQU;
    private final int zzaQV;

    private RealTimeMessage(Parcel parcel) {
        this(parcel.readString(), parcel.createByteArray(), parcel.readInt());
    }

    public RealTimeMessage(String str, byte[] bArr, int i) {
        this.zzaQT = (String) zzaa.zzz(str);
        this.zzaQU = (byte[]) ((byte[]) zzaa.zzz(bArr)).clone();
        this.zzaQV = i;
    }

    public int describeContents() {
        return 0;
    }

    public byte[] getMessageData() {
        return this.zzaQU;
    }

    public String getSenderParticipantId() {
        return this.zzaQT;
    }

    public boolean isReliable() {
        return this.zzaQV == 1;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzaQT);
        parcel.writeByteArray(this.zzaQU);
        parcel.writeInt(this.zzaQV);
    }
}
