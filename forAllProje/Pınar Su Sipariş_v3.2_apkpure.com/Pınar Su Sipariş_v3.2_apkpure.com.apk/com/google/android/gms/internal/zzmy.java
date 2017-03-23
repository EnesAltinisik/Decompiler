package com.google.android.gms.internal;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.Cast.CastApi;
import com.google.android.gms.cast.Cast.MessageReceivedCallback;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.CastStatusCodes;
import com.google.android.gms.cast.games.GameManagerClient;
import com.google.android.gms.cast.games.GameManagerClient.GameManagerInstanceResult;
import com.google.android.gms.cast.games.GameManagerClient.GameManagerResult;
import com.google.android.gms.cast.games.GameManagerClient.Listener;
import com.google.android.gms.cast.games.GameManagerState;
import com.google.android.gms.cast.games.PlayerInfo;
import com.google.android.gms.cast.internal.zze;
import com.google.android.gms.cast.internal.zzf;
import com.google.android.gms.cast.internal.zzl;
import com.google.android.gms.cast.internal.zzo;
import com.google.android.gms.cast.internal.zzp;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

public class zzmy extends com.google.android.gms.cast.internal.zzc {
    static final String NAMESPACE = zzf.zzcF("com.google.cast.games");
    private static final zzl zzaeJ = new zzl("GameManagerChannel");
    private final Map<String, String> zzahb = new ConcurrentHashMap();
    private final List<zzp> zzahc;
    private final String zzahd;
    private final CastApi zzahe;
    private final GoogleApiClient zzahf;
    private zzmz zzahg;
    private boolean zzahh = false;
    private GameManagerState zzahi;
    private GameManagerState zzahj;
    private String zzahk;
    private JSONObject zzahl;
    private long zzahm = 0;
    private Listener zzahn;
    private String zzaho;
    private final SharedPreferences zzwV;

    public abstract class zzb<R extends Result> extends com.google.android.gms.cast.internal.zzb<R> {
        protected zzo zzagO;
        final /* synthetic */ zzmy zzahp;

        public zzb(zzmy com_google_android_gms_internal_zzmy) {
            this.zzahp = com_google_android_gms_internal_zzmy;
            super(com_google_android_gms_internal_zzmy.zzahf);
        }

        public abstract void execute();

        protected void zza(zze com_google_android_gms_cast_internal_zze) {
            execute();
        }

        public zzo zzqf() {
            return this.zzagO;
        }
    }

    public abstract class zzc extends zzb<GameManagerInstanceResult> {
        final /* synthetic */ zzmy zzahp;
        private GameManagerClient zzahx;

        public zzc(final zzmy com_google_android_gms_internal_zzmy, GameManagerClient gameManagerClient) {
            this.zzahp = com_google_android_gms_internal_zzmy;
            super(com_google_android_gms_internal_zzmy);
            this.zzahx = gameManagerClient;
            this.zzagO = new zzo(this) {
                final /* synthetic */ zzc b;

                public void zzA(long j) {
                    this.b.zzb((GameManagerInstanceResult) this.b.zzc(new Status(2103)));
                }

                public void zza(long j, int i, Object obj) {
                    if (obj == null) {
                        try {
                            this.b.zzb(new a(new Status(i, null, null), this.b.zzahx));
                            return;
                        } catch (ClassCastException e) {
                            this.b.zzb((GameManagerInstanceResult) this.b.zzc(new Status(13)));
                            return;
                        }
                    }
                    zzna com_google_android_gms_internal_zzna = (zzna) obj;
                    zzmz zzqm = com_google_android_gms_internal_zzna.zzqm();
                    if (zzqm == null || zzf.zza("1.0.0", zzqm.getVersion())) {
                        this.b.zzb(new a(new Status(i, com_google_android_gms_internal_zzna.zzqi(), null), this.b.zzahx));
                        return;
                    }
                    this.b.zzahp.zzahg = null;
                    this.b.zzb((GameManagerInstanceResult) this.b.zzc(new Status(GameManagerClient.STATUS_INCORRECT_VERSION, String.format(Locale.ROOT, "Incorrect Game Manager SDK version. Receiver: %s Sender: %s", new Object[]{zzqm.getVersion(), "1.0.0"}))));
                }
            };
        }

        public /* synthetic */ Result zzc(Status status) {
            return zzr(status);
        }

        public GameManagerInstanceResult zzr(Status status) {
            return new a(status, null);
        }
    }

    public abstract class zza extends zzb<GameManagerResult> {
        final /* synthetic */ zzmy zzahp;

        public zza(final zzmy com_google_android_gms_internal_zzmy) {
            this.zzahp = com_google_android_gms_internal_zzmy;
            super(com_google_android_gms_internal_zzmy);
            this.zzagO = new zzo(this) {
                final /* synthetic */ zza b;

                public void zzA(long j) {
                    this.b.zzb((GameManagerResult) this.b.zzc(new Status(2103)));
                }

                public void zza(long j, int i, Object obj) {
                    if (obj == null) {
                        try {
                            this.b.zzb(new b(new Status(i, null, null), null, j, null));
                            return;
                        } catch (ClassCastException e) {
                            this.b.zzb((GameManagerResult) this.b.zzc(new Status(13)));
                            return;
                        }
                    }
                    zzna com_google_android_gms_internal_zzna = (zzna) obj;
                    String playerId = com_google_android_gms_internal_zzna.getPlayerId();
                    if (i == 0 && playerId != null) {
                        this.b.zzahp.zzaho = playerId;
                    }
                    this.b.zzb(new b(new Status(i, com_google_android_gms_internal_zzna.zzqi(), null), playerId, com_google_android_gms_internal_zzna.getRequestId(), com_google_android_gms_internal_zzna.getExtraMessageData()));
                }
            };
        }

        public /* synthetic */ Result zzc(Status status) {
            return zzq(status);
        }

        public GameManagerResult zzq(Status status) {
            return new b(status, null, -1, null);
        }
    }

    private static final class a implements GameManagerInstanceResult {
        private final Status a;
        private final GameManagerClient b;

        a(Status status, GameManagerClient gameManagerClient) {
            this.a = status;
            this.b = gameManagerClient;
        }

        public GameManagerClient getGameManagerClient() {
            return this.b;
        }

        public Status getStatus() {
            return this.a;
        }
    }

    private static final class b implements GameManagerResult {
        private final Status a;
        private final String b;
        private final long c;
        private final JSONObject d;

        b(Status status, String str, long j, JSONObject jSONObject) {
            this.a = status;
            this.b = str;
            this.c = j;
            this.d = jSONObject;
        }

        public JSONObject getExtraMessageData() {
            return this.d;
        }

        public String getPlayerId() {
            return this.b;
        }

        public long getRequestId() {
            return this.c;
        }

        public Status getStatus() {
            return this.a;
        }
    }

    public zzmy(GoogleApiClient googleApiClient, String str, CastApi castApi) throws IllegalArgumentException, IllegalStateException {
        super(NAMESPACE, "CastGameManagerChannel", null);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("castSessionId cannot be null.");
        } else if (googleApiClient != null && googleApiClient.isConnected() && googleApiClient.hasConnectedApi(Cast.API)) {
            this.zzahc = new ArrayList();
            this.zzahd = str;
            this.zzahe = castApi;
            this.zzahf = googleApiClient;
            this.zzwV = r0.getApplicationContext().getSharedPreferences(String.format(Locale.ROOT, "%s.%s", new Object[]{googleApiClient.getContext().getApplicationContext().getPackageName(), "game_manager_channel_data"}), 0);
            this.zzahj = null;
            this.zzahi = new zznc(0, 0, "", null, new ArrayList(), "", -1);
        } else {
            throw new IllegalArgumentException("googleApiClient needs to be connected and contain the Cast.API API.");
        }
    }

    private JSONObject zza(long j, String str, int i, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("requestId", j);
            jSONObject2.put("type", i);
            jSONObject2.put("extraMessageData", jSONObject);
            jSONObject2.put("playerId", str);
            jSONObject2.put("playerToken", zzcB(str));
            return jSONObject2;
        } catch (JSONException e) {
            zzaeJ.zzf("JSONException when trying to create a message: %s", e.getMessage());
            return null;
        }
    }

    private synchronized void zza(zzna com_google_android_gms_internal_zzna) {
        Object obj = 1;
        synchronized (this) {
            if (com_google_android_gms_internal_zzna.zzqh() != 1) {
                obj = null;
            }
            this.zzahj = this.zzahi;
            if (!(obj == null || com_google_android_gms_internal_zzna.zzqm() == null)) {
                this.zzahg = com_google_android_gms_internal_zzna.zzqm();
            }
            if (isInitialized()) {
                Collection arrayList = new ArrayList();
                for (zzne com_google_android_gms_internal_zzne : com_google_android_gms_internal_zzna.zzqj()) {
                    String playerId = com_google_android_gms_internal_zzne.getPlayerId();
                    arrayList.add(new zznd(playerId, com_google_android_gms_internal_zzne.getPlayerState(), com_google_android_gms_internal_zzne.getPlayerData(), this.zzahb.containsKey(playerId)));
                }
                this.zzahi = new zznc(com_google_android_gms_internal_zzna.getLobbyState(), com_google_android_gms_internal_zzna.getGameplayState(), com_google_android_gms_internal_zzna.zzqk(), com_google_android_gms_internal_zzna.getGameData(), arrayList, this.zzahg.zzqg(), this.zzahg.getMaxPlayers());
                PlayerInfo player = this.zzahi.getPlayer(com_google_android_gms_internal_zzna.getPlayerId());
                if (player != null && player.isControllable() && com_google_android_gms_internal_zzna.zzqh() == 2) {
                    this.zzahk = com_google_android_gms_internal_zzna.getPlayerId();
                    this.zzahl = com_google_android_gms_internal_zzna.getExtraMessageData();
                }
            }
        }
    }

    private void zza(String str, int i, JSONObject jSONObject, zzo com_google_android_gms_cast_internal_zzo) {
        final long j = 1 + this.zzahm;
        this.zzahm = j;
        JSONObject zza = zza(j, str, i, jSONObject);
        if (zza == null) {
            com_google_android_gms_cast_internal_zzo.zza(-1, 2001, null);
            zzaeJ.zzf("Not sending request because it was invalid.", new Object[0]);
            return;
        }
        zzp com_google_android_gms_cast_internal_zzp = new zzp(30000);
        com_google_android_gms_cast_internal_zzp.zza(j, com_google_android_gms_cast_internal_zzo);
        this.zzahc.add(com_google_android_gms_cast_internal_zzp);
        zzae(true);
        this.zzahe.sendMessage(this.zzahf, getNamespace(), zza.toString()).setResultCallback(new ResultCallback<Status>(this) {
            final /* synthetic */ zzmy b;

            public void a(Status status) {
                if (!status.isSuccess()) {
                    this.b.zzb(j, status.getStatusCode());
                }
            }

            public /* synthetic */ void onResult(Result result) {
                a((Status) result);
            }
        });
    }

    private void zzb(long j, int i, Object obj) {
        Iterator it = this.zzahc.iterator();
        while (it.hasNext()) {
            if (((zzp) it.next()).zzc(j, i, obj)) {
                it.remove();
            }
        }
    }

    private int zzbn(int i) {
        switch (i) {
            case 0:
                return 0;
            case 1:
                return 2001;
            case 2:
                return CastStatusCodes.NOT_ALLOWED;
            case 3:
                return GameManagerClient.STATUS_INCORRECT_VERSION;
            case 4:
                return GameManagerClient.STATUS_TOO_MANY_PLAYERS;
            default:
                zzaeJ.zzf("Unknown GameManager protocol status code: " + i, new Object[0]);
                return 13;
        }
    }

    private synchronized void zzqa() throws IllegalStateException {
        if (!isInitialized()) {
            throw new IllegalStateException("Attempted to perform an operation on the GameManagerChannel before it is initialized.");
        } else if (isDisposed()) {
            throw new IllegalStateException("Attempted to perform an operation on the GameManagerChannel after it has been disposed.");
        }
    }

    private void zzqb() {
        if (this.zzahn != null) {
            if (!(this.zzahj == null || this.zzahi.equals(this.zzahj))) {
                this.zzahn.onStateChanged(this.zzahi, this.zzahj);
            }
            if (!(this.zzahl == null || this.zzahk == null)) {
                this.zzahn.onGameMessageReceived(this.zzahk, this.zzahl);
            }
        }
        this.zzahj = null;
        this.zzahk = null;
        this.zzahl = null;
    }

    private synchronized void zzqc() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("castSessionId", this.zzahd);
            jSONObject.put("playerTokenMap", new JSONObject(this.zzahb));
            this.zzwV.edit().putString("save_data", jSONObject.toString()).commit();
        } catch (JSONException e) {
            zzaeJ.zzf("Error while saving data: %s", e.getMessage());
        }
    }

    private synchronized void zzqd() {
        String string = this.zzwV.getString("save_data", null);
        if (string != null) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                if (this.zzahd.equals(jSONObject.getString("castSessionId"))) {
                    jSONObject = jSONObject.getJSONObject("playerTokenMap");
                    Iterator keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        string = (String) keys.next();
                        this.zzahb.put(string, jSONObject.getString(string));
                    }
                    this.zzahm = 0;
                }
            } catch (JSONException e) {
                zzaeJ.zzf("Error while loading data: %s", e.getMessage());
            }
        }
    }

    public synchronized void dispose() throws IllegalStateException {
        if (!this.zzahh) {
            this.zzahi = null;
            this.zzahj = null;
            this.zzahk = null;
            this.zzahl = null;
            this.zzahh = true;
            try {
                this.zzahe.removeMessageReceivedCallbacks(this.zzahf, getNamespace());
            } catch (IOException e) {
                zzaeJ.zzf("Exception while detaching game manager channel.", e);
            }
        }
    }

    public synchronized GameManagerState getCurrentState() throws IllegalStateException {
        zzqa();
        return this.zzahi;
    }

    public synchronized String getLastUsedPlayerId() throws IllegalStateException {
        zzqa();
        return this.zzaho;
    }

    public synchronized boolean isDisposed() {
        return this.zzahh;
    }

    public synchronized boolean isInitialized() {
        return this.zzahg != null;
    }

    public synchronized void sendGameMessage(String str, JSONObject jSONObject) throws IllegalStateException {
        zzqa();
        long j = 1 + this.zzahm;
        this.zzahm = j;
        JSONObject zza = zza(j, str, 7, jSONObject);
        if (zza != null) {
            this.zzahe.sendMessage(this.zzahf, getNamespace(), zza.toString());
        }
    }

    public synchronized PendingResult<GameManagerResult> sendGameRequest(final String str, final JSONObject jSONObject) throws IllegalStateException {
        zzqa();
        return this.zzahf.zzd(new zza(this) {
            final /* synthetic */ zzmy c;

            public void execute() {
                this.c.zza(str, 6, jSONObject, zzqf());
            }
        });
    }

    public synchronized void setListener(Listener listener) {
        this.zzahn = listener;
    }

    protected boolean zzB(long j) {
        boolean z;
        Iterator it = this.zzahc.iterator();
        while (it.hasNext()) {
            if (((zzp) it.next()).zzd(j, 15)) {
                it.remove();
            }
        }
        synchronized (zzp.zznS) {
            for (zzp zzqK : this.zzahc) {
                if (zzqK.zzqK()) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        return z;
    }

    public synchronized PendingResult<GameManagerInstanceResult> zza(GameManagerClient gameManagerClient) throws IllegalArgumentException {
        if (gameManagerClient == null) {
            throw new IllegalArgumentException("gameManagerClient can't be null.");
        }
        return this.zzahf.zzd(new zzc(this, gameManagerClient) {
            final /* synthetic */ zzmy a;

            public void execute() {
                try {
                    this.a.zzahe.setMessageReceivedCallbacks(this.a.zzahf, this.a.getNamespace(), new MessageReceivedCallback(this) {
                        final /* synthetic */ AnonymousClass1 a;

                        {
                            this.a = r1;
                        }

                        public void onMessageReceived(CastDevice castDevice, String str, String str2) {
                            this.a.a.zzcC(str2);
                        }
                    });
                    this.a.zzqd();
                    this.a.zzqc();
                    this.a.zza(null, 1100, null, zzqf());
                } catch (IOException e) {
                    zzqf().zza(-1, 8, null);
                } catch (IllegalStateException e2) {
                    zzqf().zza(-1, 8, null);
                }
            }
        });
    }

    public synchronized PendingResult<GameManagerResult> zza(final String str, final int i, final JSONObject jSONObject) throws IllegalStateException {
        zzqa();
        return this.zzahf.zzd(new zza(this) {
            final /* synthetic */ zzmy d;

            public void execute() {
                int a = af.a(i);
                if (a == 0) {
                    zzqf().zza(-1, 2001, null);
                    zzmy.zzaeJ.zzf("sendPlayerRequest for unsupported playerState: %d", Integer.valueOf(i));
                    return;
                }
                this.d.zza(str, a, jSONObject, zzqf());
            }
        });
    }

    public void zzb(long j, int i) {
        zzb(j, i, null);
    }

    public synchronized String zzcB(String str) throws IllegalStateException {
        return str == null ? null : (String) this.zzahb.get(str);
    }

    public final void zzcC(String str) {
        zzaeJ.zzb("message received: %s", str);
        try {
            zzna zzk = zzna.zzk(new JSONObject(str));
            if (zzk == null) {
                zzaeJ.zzf("Could not parse game manager message from string: %s", str);
            } else if ((isInitialized() || zzk.zzqm() != null) && !isDisposed()) {
                int i = zzk.zzqh() == 1 ? 1 : 0;
                if (!(i == 0 || TextUtils.isEmpty(zzk.zzql()))) {
                    this.zzahb.put(zzk.getPlayerId(), zzk.zzql());
                    zzqc();
                }
                if (zzk.getStatusCode() == 0) {
                    zza(zzk);
                } else {
                    zzaeJ.zzf("Not updating from game message because the message contains error code: %d", Integer.valueOf(zzk.getStatusCode()));
                }
                int zzbn = zzbn(zzk.getStatusCode());
                if (i != 0) {
                    zzb(zzk.getRequestId(), zzbn, zzk);
                }
                if (isInitialized() && zzbn == 0) {
                    zzqb();
                }
            }
        } catch (JSONException e) {
            zzaeJ.zzf("Message is malformed (%s); ignoring: %s", e.getMessage(), str);
        }
    }
}
