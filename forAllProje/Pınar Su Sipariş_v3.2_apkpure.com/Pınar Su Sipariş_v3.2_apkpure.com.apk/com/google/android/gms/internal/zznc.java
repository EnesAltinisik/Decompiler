package com.google.android.gms.internal;

import com.google.android.gms.cast.games.GameManagerState;
import com.google.android.gms.cast.games.PlayerInfo;
import com.google.android.gms.cast.internal.zzf;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.common.util.zzp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class zznc implements GameManagerState {
    private final String zzahC;
    private final int zzahD;
    private final int zzahI;
    private final int zzahJ;
    private final JSONObject zzahL;
    private final String zzahM;
    private final Map<String, PlayerInfo> zzahO;

    public zznc(int i, int i2, String str, JSONObject jSONObject, Collection<PlayerInfo> collection, String str2, int i3) {
        this.zzahJ = i;
        this.zzahI = i2;
        this.zzahM = str;
        this.zzahL = jSONObject;
        this.zzahC = str2;
        this.zzahD = i3;
        this.zzahO = new HashMap(collection.size());
        for (PlayerInfo playerInfo : collection) {
            this.zzahO.put(playerInfo.getPlayerId(), playerInfo);
        }
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == null || !(obj instanceof GameManagerState)) {
            return false;
        }
        GameManagerState gameManagerState = (GameManagerState) obj;
        if (getPlayers().size() != gameManagerState.getPlayers().size()) {
            return false;
        }
        for (PlayerInfo playerInfo : getPlayers()) {
            boolean z2 = false;
            for (PlayerInfo playerInfo2 : gameManagerState.getPlayers()) {
                boolean z3;
                if (!zzf.zza(playerInfo.getPlayerId(), playerInfo2.getPlayerId())) {
                    z3 = z2;
                } else if (!zzf.zza(playerInfo, playerInfo2)) {
                    return false;
                } else {
                    z3 = true;
                }
                z2 = z3;
            }
            if (!z2) {
                return false;
            }
        }
        if (!(this.zzahJ == gameManagerState.getLobbyState() && this.zzahI == gameManagerState.getGameplayState() && this.zzahD == gameManagerState.getMaxPlayers() && zzf.zza(this.zzahC, gameManagerState.getApplicationName()) && zzf.zza(this.zzahM, gameManagerState.getGameStatusText()) && zzp.zzf(this.zzahL, gameManagerState.getGameData()))) {
            z = false;
        }
        return z;
    }

    public CharSequence getApplicationName() {
        return this.zzahC;
    }

    public List<PlayerInfo> getConnectedControllablePlayers() {
        List arrayList = new ArrayList();
        for (PlayerInfo playerInfo : getPlayers()) {
            if (playerInfo.isConnected() && playerInfo.isControllable()) {
                arrayList.add(playerInfo);
            }
        }
        return arrayList;
    }

    public List<PlayerInfo> getConnectedPlayers() {
        List arrayList = new ArrayList();
        for (PlayerInfo playerInfo : getPlayers()) {
            if (playerInfo.isConnected()) {
                arrayList.add(playerInfo);
            }
        }
        return arrayList;
    }

    public List<PlayerInfo> getControllablePlayers() {
        List arrayList = new ArrayList();
        for (PlayerInfo playerInfo : getPlayers()) {
            if (playerInfo.isControllable()) {
                arrayList.add(playerInfo);
            }
        }
        return arrayList;
    }

    public JSONObject getGameData() {
        return this.zzahL;
    }

    public CharSequence getGameStatusText() {
        return this.zzahM;
    }

    public int getGameplayState() {
        return this.zzahI;
    }

    public Collection<String> getListOfChangedPlayers(GameManagerState gameManagerState) {
        Collection hashSet = new HashSet();
        for (PlayerInfo playerInfo : getPlayers()) {
            PlayerInfo player = gameManagerState.getPlayer(playerInfo.getPlayerId());
            if (player == null || !playerInfo.equals(player)) {
                hashSet.add(playerInfo.getPlayerId());
            }
        }
        for (PlayerInfo playerInfo2 : gameManagerState.getPlayers()) {
            if (getPlayer(playerInfo2.getPlayerId()) == null) {
                hashSet.add(playerInfo2.getPlayerId());
            }
        }
        return hashSet;
    }

    public int getLobbyState() {
        return this.zzahJ;
    }

    public int getMaxPlayers() {
        return this.zzahD;
    }

    public PlayerInfo getPlayer(String str) {
        return str == null ? null : (PlayerInfo) this.zzahO.get(str);
    }

    public Collection<PlayerInfo> getPlayers() {
        return Collections.unmodifiableCollection(this.zzahO.values());
    }

    public List<PlayerInfo> getPlayersInState(int i) {
        List arrayList = new ArrayList();
        for (PlayerInfo playerInfo : getPlayers()) {
            if (playerInfo.getPlayerState() == i) {
                arrayList.add(playerInfo);
            }
        }
        return arrayList;
    }

    public boolean hasGameDataChanged(GameManagerState gameManagerState) {
        return !zzp.zzf(this.zzahL, gameManagerState.getGameData());
    }

    public boolean hasGameStatusTextChanged(GameManagerState gameManagerState) {
        return !zzf.zza(this.zzahM, gameManagerState.getGameStatusText());
    }

    public boolean hasGameplayStateChanged(GameManagerState gameManagerState) {
        return this.zzahI != gameManagerState.getGameplayState();
    }

    public boolean hasLobbyStateChanged(GameManagerState gameManagerState) {
        return this.zzahJ != gameManagerState.getLobbyState();
    }

    public boolean hasPlayerChanged(String str, GameManagerState gameManagerState) {
        return !zzf.zza(getPlayer(str), gameManagerState.getPlayer(str));
    }

    public boolean hasPlayerDataChanged(String str, GameManagerState gameManagerState) {
        PlayerInfo player = getPlayer(str);
        PlayerInfo player2 = gameManagerState.getPlayer(str);
        return (player == null && player2 == null) ? false : player == null || player2 == null || !zzp.zzf(player.getPlayerData(), player2.getPlayerData());
    }

    public boolean hasPlayerStateChanged(String str, GameManagerState gameManagerState) {
        PlayerInfo player = getPlayer(str);
        PlayerInfo player2 = gameManagerState.getPlayer(str);
        return (player == null && player2 == null) ? false : player == null || player2 == null || player.getPlayerState() != player2.getPlayerState();
    }

    public int hashCode() {
        return zzz.hashCode(Integer.valueOf(this.zzahJ), Integer.valueOf(this.zzahI), this.zzahO, this.zzahM, this.zzahL, this.zzahC, Integer.valueOf(this.zzahD));
    }
}
