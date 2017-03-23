package com.google.android.gms.games.request;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class GameRequestEntity extends AbstractSafeParcelable implements GameRequest {
    public static final Creator<GameRequestEntity> CREATOR = new GameRequestEntityCreator();
    private final int mVersionCode;
    private final int zzDO;
    private final String zzII;
    private final GameEntity zzaOX;
    private final long zzaQH;
    private final PlayerEntity zzaRH;
    private final ArrayList<PlayerEntity> zzaRI;
    private final long zzaRJ;
    private final Bundle zzaRK;
    private final byte[] zzaRo;
    private final int zzagd;

    GameRequestEntity(int i, GameEntity gameEntity, PlayerEntity playerEntity, byte[] bArr, String str, ArrayList<PlayerEntity> arrayList, int i2, long j, long j2, Bundle bundle, int i3) {
        this.mVersionCode = i;
        this.zzaOX = gameEntity;
        this.zzaRH = playerEntity;
        this.zzaRo = bArr;
        this.zzII = str;
        this.zzaRI = arrayList;
        this.zzagd = i2;
        this.zzaQH = j;
        this.zzaRJ = j2;
        this.zzaRK = bundle;
        this.zzDO = i3;
    }

    public GameRequestEntity(GameRequest gameRequest) {
        this.mVersionCode = 2;
        this.zzaOX = new GameEntity(gameRequest.getGame());
        this.zzaRH = new PlayerEntity(gameRequest.getSender());
        this.zzII = gameRequest.getRequestId();
        this.zzagd = gameRequest.getType();
        this.zzaQH = gameRequest.getCreationTimestamp();
        this.zzaRJ = gameRequest.getExpirationTimestamp();
        this.zzDO = gameRequest.getStatus();
        Object data = gameRequest.getData();
        if (data == null) {
            this.zzaRo = null;
        } else {
            this.zzaRo = new byte[data.length];
            System.arraycopy(data, 0, this.zzaRo, 0, data.length);
        }
        List recipients = gameRequest.getRecipients();
        int size = recipients.size();
        this.zzaRI = new ArrayList(size);
        this.zzaRK = new Bundle();
        for (int i = 0; i < size; i++) {
            Player player = (Player) ((Player) recipients.get(i)).freeze();
            String playerId = player.getPlayerId();
            this.zzaRI.add((PlayerEntity) player);
            this.zzaRK.putInt(playerId, gameRequest.getRecipientStatus(playerId));
        }
    }

    static int zza(GameRequest gameRequest) {
        return zzz.hashCode(gameRequest.getGame(), gameRequest.getRecipients(), gameRequest.getRequestId(), gameRequest.getSender(), zzb(gameRequest), Integer.valueOf(gameRequest.getType()), Long.valueOf(gameRequest.getCreationTimestamp()), Long.valueOf(gameRequest.getExpirationTimestamp()));
    }

    static boolean zza(GameRequest gameRequest, Object obj) {
        if (!(obj instanceof GameRequest)) {
            return false;
        }
        if (gameRequest == obj) {
            return true;
        }
        GameRequest gameRequest2 = (GameRequest) obj;
        return zzz.equal(gameRequest2.getGame(), gameRequest.getGame()) && zzz.equal(gameRequest2.getRecipients(), gameRequest.getRecipients()) && zzz.equal(gameRequest2.getRequestId(), gameRequest.getRequestId()) && zzz.equal(gameRequest2.getSender(), gameRequest.getSender()) && Arrays.equals(zzb(gameRequest2), zzb(gameRequest)) && zzz.equal(Integer.valueOf(gameRequest2.getType()), Integer.valueOf(gameRequest.getType())) && zzz.equal(Long.valueOf(gameRequest2.getCreationTimestamp()), Long.valueOf(gameRequest.getCreationTimestamp())) && zzz.equal(Long.valueOf(gameRequest2.getExpirationTimestamp()), Long.valueOf(gameRequest.getExpirationTimestamp()));
    }

    private static int[] zzb(GameRequest gameRequest) {
        List recipients = gameRequest.getRecipients();
        int size = recipients.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = gameRequest.getRecipientStatus(((Player) recipients.get(i)).getPlayerId());
        }
        return iArr;
    }

    static String zzc(GameRequest gameRequest) {
        return zzz.zzy(gameRequest).zzg("Game", gameRequest.getGame()).zzg("Sender", gameRequest.getSender()).zzg("Recipients", gameRequest.getRecipients()).zzg("Data", gameRequest.getData()).zzg("RequestId", gameRequest.getRequestId()).zzg("Type", Integer.valueOf(gameRequest.getType())).zzg("CreationTimestamp", Long.valueOf(gameRequest.getCreationTimestamp())).zzg("ExpirationTimestamp", Long.valueOf(gameRequest.getExpirationTimestamp())).toString();
    }

    public boolean equals(Object obj) {
        return zza(this, obj);
    }

    public GameRequest freeze() {
        return this;
    }

    public long getCreationTimestamp() {
        return this.zzaQH;
    }

    public byte[] getData() {
        return this.zzaRo;
    }

    public long getExpirationTimestamp() {
        return this.zzaRJ;
    }

    public Game getGame() {
        return this.zzaOX;
    }

    public int getRecipientStatus(String str) {
        return this.zzaRK.getInt(str, 0);
    }

    public List<Player> getRecipients() {
        return new ArrayList(this.zzaRI);
    }

    public String getRequestId() {
        return this.zzII;
    }

    public Player getSender() {
        return this.zzaRH;
    }

    public int getStatus() {
        return this.zzDO;
    }

    public int getType() {
        return this.zzagd;
    }

    public int getVersionCode() {
        return this.mVersionCode;
    }

    public int hashCode() {
        return zza(this);
    }

    public boolean isConsumed(String str) {
        return getRecipientStatus(str) == 1;
    }

    public boolean isDataValid() {
        return true;
    }

    public String toString() {
        return zzc(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        GameRequestEntityCreator.zza(this, parcel, i);
    }

    public Bundle zzBx() {
        return this.zzaRK;
    }
}
