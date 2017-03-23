package com.google.android.gms.games.internal.notification;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.plus.PlusShare;

public final class GameNotificationRef extends zzc implements GameNotification {
    GameNotificationRef(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    public long getId() {
        return getLong("_id");
    }

    public String getText() {
        return getString("text");
    }

    public String getTitle() {
        return getString(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE);
    }

    public int getType() {
        return getInteger("type");
    }

    public String toString() {
        return zzz.zzy(this).zzg("Id", Long.valueOf(getId())).zzg("NotificationId", zzAV()).zzg("Type", Integer.valueOf(getType())).zzg("Title", getTitle()).zzg("Ticker", zzAW()).zzg("Text", getText()).zzg("CoalescedText", zzAX()).zzg("isAcknowledged", Boolean.valueOf(zzAY())).zzg("isSilent", Boolean.valueOf(zzAZ())).zzg("isQuiet", Boolean.valueOf(zzBa())).toString();
    }

    public String zzAV() {
        return getString("notification_id");
    }

    public String zzAW() {
        return getString("ticker");
    }

    public String zzAX() {
        return getString("coalesced_text");
    }

    public boolean zzAY() {
        return getInteger("acknowledged") > 0;
    }

    public boolean zzAZ() {
        return getInteger("alert_level") == 0;
    }

    public boolean zzBa() {
        return getInteger("alert_level") == 2;
    }
}
