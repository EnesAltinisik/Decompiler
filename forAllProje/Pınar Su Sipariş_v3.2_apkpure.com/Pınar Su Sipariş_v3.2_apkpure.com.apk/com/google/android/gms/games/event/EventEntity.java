package com.google.android.gms.games.event;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.common.util.zzg;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;

public final class EventEntity extends AbstractSafeParcelable implements Event {
    public static final EventEntityCreator CREATOR = new EventEntityCreator();
    private final String mName;
    private final int mVersionCode;
    private final long zzVv;
    private final String zzVw;
    private final Uri zzaIU;
    private final String zzaJf;
    private final String zzaKM;
    private final String zzaKN;
    private final PlayerEntity zzaKi;
    private final boolean zztv;

    EventEntity(int i, String str, String str2, String str3, Uri uri, String str4, Player player, long j, String str5, boolean z) {
        this.mVersionCode = i;
        this.zzaKM = str;
        this.mName = str2;
        this.zzVw = str3;
        this.zzaIU = uri;
        this.zzaJf = str4;
        this.zzaKi = new PlayerEntity(player);
        this.zzVv = j;
        this.zzaKN = str5;
        this.zztv = z;
    }

    public EventEntity(Event event) {
        this.mVersionCode = 1;
        this.zzaKM = event.getEventId();
        this.mName = event.getName();
        this.zzVw = event.getDescription();
        this.zzaIU = event.getIconImageUri();
        this.zzaJf = event.getIconImageUrl();
        this.zzaKi = (PlayerEntity) event.getPlayer().freeze();
        this.zzVv = event.getValue();
        this.zzaKN = event.getFormattedValue();
        this.zztv = event.isVisible();
    }

    static int zza(Event event) {
        return zzz.hashCode(event.getEventId(), event.getName(), event.getDescription(), event.getIconImageUri(), event.getIconImageUrl(), event.getPlayer(), Long.valueOf(event.getValue()), event.getFormattedValue(), Boolean.valueOf(event.isVisible()));
    }

    static boolean zza(Event event, Object obj) {
        if (!(obj instanceof Event)) {
            return false;
        }
        if (event == obj) {
            return true;
        }
        Event event2 = (Event) obj;
        return zzz.equal(event2.getEventId(), event.getEventId()) && zzz.equal(event2.getName(), event.getName()) && zzz.equal(event2.getDescription(), event.getDescription()) && zzz.equal(event2.getIconImageUri(), event.getIconImageUri()) && zzz.equal(event2.getIconImageUrl(), event.getIconImageUrl()) && zzz.equal(event2.getPlayer(), event.getPlayer()) && zzz.equal(Long.valueOf(event2.getValue()), Long.valueOf(event.getValue())) && zzz.equal(event2.getFormattedValue(), event.getFormattedValue()) && zzz.equal(Boolean.valueOf(event2.isVisible()), Boolean.valueOf(event.isVisible()));
    }

    static String zzb(Event event) {
        return zzz.zzy(event).zzg("Id", event.getEventId()).zzg("Name", event.getName()).zzg("Description", event.getDescription()).zzg("IconImageUri", event.getIconImageUri()).zzg("IconImageUrl", event.getIconImageUrl()).zzg("Player", event.getPlayer()).zzg("Value", Long.valueOf(event.getValue())).zzg("FormattedValue", event.getFormattedValue()).zzg("isVisible", Boolean.valueOf(event.isVisible())).toString();
    }

    public boolean equals(Object obj) {
        return zza(this, obj);
    }

    public Event freeze() {
        return this;
    }

    public String getDescription() {
        return this.zzVw;
    }

    public void getDescription(CharArrayBuffer charArrayBuffer) {
        zzg.zzb(this.zzVw, charArrayBuffer);
    }

    public String getEventId() {
        return this.zzaKM;
    }

    public String getFormattedValue() {
        return this.zzaKN;
    }

    public void getFormattedValue(CharArrayBuffer charArrayBuffer) {
        zzg.zzb(this.zzaKN, charArrayBuffer);
    }

    public Uri getIconImageUri() {
        return this.zzaIU;
    }

    public String getIconImageUrl() {
        return this.zzaJf;
    }

    public String getName() {
        return this.mName;
    }

    public void getName(CharArrayBuffer charArrayBuffer) {
        zzg.zzb(this.mName, charArrayBuffer);
    }

    public Player getPlayer() {
        return this.zzaKi;
    }

    public long getValue() {
        return this.zzVv;
    }

    public int getVersionCode() {
        return this.mVersionCode;
    }

    public int hashCode() {
        return zza(this);
    }

    public boolean isDataValid() {
        return true;
    }

    public boolean isVisible() {
        return this.zztv;
    }

    public String toString() {
        return zzb(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        EventEntityCreator.zza(this, parcel, i);
    }
}
