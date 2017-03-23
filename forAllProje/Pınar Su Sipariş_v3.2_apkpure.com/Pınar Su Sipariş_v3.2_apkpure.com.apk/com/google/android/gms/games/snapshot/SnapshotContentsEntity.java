package com.google.android.gms.games.snapshot;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.util.zzo;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.internal.GamesLog;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;

public final class SnapshotContentsEntity extends AbstractSafeParcelable implements SnapshotContents {
    public static final SnapshotContentsEntityCreator CREATOR = new SnapshotContentsEntityCreator();
    private static final Object zzaRL = new Object();
    private final int mVersionCode;
    private Contents zzaxB;

    SnapshotContentsEntity(int i, Contents contents) {
        this.mVersionCode = i;
        this.zzaxB = contents;
    }

    public SnapshotContentsEntity(Contents contents) {
        this(1, contents);
    }

    private boolean zza(int i, byte[] bArr, int i2, int i3, boolean z) {
        zzaa.zza(!isClosed(), (Object) "Must provide a previously opened SnapshotContents");
        synchronized (zzaRL) {
            OutputStream fileOutputStream = new FileOutputStream(this.zzaxB.getParcelFileDescriptor().getFileDescriptor());
            OutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            try {
                FileChannel channel = fileOutputStream.getChannel();
                channel.position((long) i);
                bufferedOutputStream.write(bArr, i2, i3);
                if (z) {
                    channel.truncate((long) bArr.length);
                }
                bufferedOutputStream.flush();
            } catch (Throwable e) {
                GamesLog.zza("SnapshotContentsEntity", "Failed to write snapshot data", e);
                return false;
            }
        }
        return true;
    }

    public void close() {
        this.zzaxB = null;
    }

    public ParcelFileDescriptor getParcelFileDescriptor() {
        zzaa.zza(!isClosed(), (Object) "Cannot mutate closed contents!");
        return this.zzaxB.getParcelFileDescriptor();
    }

    public int getVersionCode() {
        return this.mVersionCode;
    }

    public boolean isClosed() {
        return this.zzaxB == null;
    }

    public boolean modifyBytes(int i, byte[] bArr, int i2, int i3) {
        return zza(i, bArr, i2, bArr.length, false);
    }

    public byte[] readFully() throws IOException {
        byte[] zza;
        boolean z = false;
        if (!isClosed()) {
            z = true;
        }
        zzaa.zza(z, (Object) "Must provide a previously opened Snapshot");
        synchronized (zzaRL) {
            InputStream fileInputStream = new FileInputStream(this.zzaxB.getParcelFileDescriptor().getFileDescriptor());
            InputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            try {
                fileInputStream.getChannel().position(0);
                zza = zzo.zza(bufferedInputStream, false);
                fileInputStream.getChannel().position(0);
            } catch (Throwable e) {
                GamesLog.zzb("SnapshotContentsEntity", "Failed to read snapshot data", e);
                throw e;
            }
        }
        return zza;
    }

    public boolean writeBytes(byte[] bArr) {
        return zza(0, bArr, 0, bArr.length, true);
    }

    public void writeToParcel(Parcel parcel, int i) {
        SnapshotContentsEntityCreator.zza(this, parcel, i);
    }

    public Contents zzvG() {
        return this.zzaxB;
    }
}
