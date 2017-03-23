package com.google.android.gms.games.internal.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzb;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.request.GameRequest;
import com.google.android.gms.games.request.GameRequestEntity;
import java.util.ArrayList;
import java.util.List;

public final class GameRequestCluster extends AbstractSafeParcelable implements GameRequest {
    public static final GameRequestClusterCreator CREATOR = new GameRequestClusterCreator();
    private final int mVersionCode;
    private final ArrayList<GameRequestEntity> zzaPZ;

    GameRequestCluster(int i, ArrayList<GameRequestEntity> arrayList) {
        this.mVersionCode = i;
        this.zzaPZ = arrayList;
        zzAT();
    }

    private void zzAT() {
        zzb.zzai(!this.zzaPZ.isEmpty());
        GameRequest gameRequest = (GameRequest) this.zzaPZ.get(0);
        int size = this.zzaPZ.size();
        for (int i = 1; i < size; i++) {
            GameRequest gameRequest2 = (GameRequest) this.zzaPZ.get(i);
            zzb.zza(gameRequest.getType() == gameRequest2.getType(), "All the requests must be of the same type");
            zzb.zza(gameRequest.getSender().equals(gameRequest2.getSender()), "All the requests must be from the same sender");
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GameRequestCluster)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        GameRequestCluster gameRequestCluster = (GameRequestCluster) obj;
        if (gameRequestCluster.zzaPZ.size() != this.zzaPZ.size()) {
            return false;
        }
        int size = this.zzaPZ.size();
        for (int i = 0; i < size; i++) {
            if (!((GameRequest) this.zzaPZ.get(i)).equals((GameRequest) gameRequestCluster.zzaPZ.get(i))) {
                return false;
            }
        }
        return true;
    }

    public GameRequest freeze() {
        return this;
    }

    public long getCreationTimestamp() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public byte[] getData() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public long getExpirationTimestamp() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public Game getGame() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public int getRecipientStatus(String str) {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public /* synthetic */ List getRecipients() {
        return zzBk();
    }

    public String getRequestId() {
        return ((GameRequestEntity) this.zzaPZ.get(0)).getRequestId();
    }

    public Player getSender() {
        return ((GameRequestEntity) this.zzaPZ.get(0)).getSender();
    }

    public int getStatus() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public int getType() {
        return ((GameRequestEntity) this.zzaPZ.get(0)).getType();
    }

    public int getVersionCode() {
        return this.mVersionCode;
    }

    public int hashCode() {
        return zzz.hashCode(this.zzaPZ.toArray());
    }

    public boolean isConsumed(String str) {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public boolean isDataValid() {
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        GameRequestClusterCreator.zza(this, parcel, i);
    }

    public ArrayList<GameRequest> zzBj() {
        return new ArrayList(this.zzaPZ);
    }

    public ArrayList<Player> zzBk() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }
}
