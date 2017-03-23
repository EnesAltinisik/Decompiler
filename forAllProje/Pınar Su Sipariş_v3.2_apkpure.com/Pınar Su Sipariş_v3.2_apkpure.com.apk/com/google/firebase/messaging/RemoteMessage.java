package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.h.a;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Map;
import java.util.Map.Entry;

public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Creator<RemoteMessage> CREATOR = new zzc();
    final int mVersionCode;
    private Map<String, String> zzUu;
    Bundle zzaay;
    private Notification zzbTa;

    public static class Builder {
        private final Map<String, String> zzUu = new a();
        private final Bundle zzaay = new Bundle();

        public Builder(String str) {
            if (TextUtils.isEmpty(str)) {
                String str2 = "Invalid to: ";
                String valueOf = String.valueOf(str);
                throw new IllegalArgumentException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            }
            this.zzaay.putString("google.to", str);
        }

        public Builder addData(String str, String str2) {
            this.zzUu.put(str, str2);
            return this;
        }

        public RemoteMessage build() {
            Bundle bundle = new Bundle();
            for (Entry entry : this.zzUu.entrySet()) {
                bundle.putString((String) entry.getKey(), (String) entry.getValue());
            }
            bundle.putAll(this.zzaay);
            return new RemoteMessage(bundle);
        }

        public Builder clearData() {
            this.zzUu.clear();
            return this;
        }

        public Builder setCollapseKey(String str) {
            this.zzaay.putString("collapse_key", str);
            return this;
        }

        public Builder setData(Map<String, String> map) {
            this.zzUu.clear();
            this.zzUu.putAll(map);
            return this;
        }

        public Builder setMessageId(String str) {
            this.zzaay.putString("google.message_id", str);
            return this;
        }

        public Builder setMessageType(String str) {
            this.zzaay.putString("message_type", str);
            return this;
        }

        public Builder setTtl(int i) {
            this.zzaay.putString("google.ttl", String.valueOf(i));
            return this;
        }
    }

    public static class Notification {
        private final String mTag;
        private final String zzAE;
        private final String zzaBk;
        private final String zzavG;
        private final String zzbTb;
        private final String[] zzbTc;
        private final String zzbTd;
        private final String[] zzbTe;
        private final String zzbTf;
        private final String zzbTg;
        private final String zzbTh;

        private Notification(Bundle bundle) {
            this.zzavG = a.a(bundle, "gcm.n.title");
            this.zzbTb = a.b(bundle, "gcm.n.title");
            this.zzbTc = zzj(bundle, "gcm.n.title");
            this.zzAE = a.a(bundle, "gcm.n.body");
            this.zzbTd = a.b(bundle, "gcm.n.body");
            this.zzbTe = zzj(bundle, "gcm.n.body");
            this.zzbTf = a.a(bundle, "gcm.n.icon");
            this.zzbTg = a.c(bundle);
            this.mTag = a.a(bundle, "gcm.n.tag");
            this.zzaBk = a.a(bundle, "gcm.n.color");
            this.zzbTh = a.a(bundle, "gcm.n.click_action");
        }

        private String[] zzj(Bundle bundle, String str) {
            Object[] c = a.c(bundle, str);
            if (c == null) {
                return null;
            }
            String[] strArr = new String[c.length];
            for (int i = 0; i < c.length; i++) {
                strArr[i] = String.valueOf(c[i]);
            }
            return strArr;
        }

        public String getBody() {
            return this.zzAE;
        }

        public String[] getBodyLocalizationArgs() {
            return this.zzbTe;
        }

        public String getBodyLocalizationKey() {
            return this.zzbTd;
        }

        public String getClickAction() {
            return this.zzbTh;
        }

        public String getColor() {
            return this.zzaBk;
        }

        public String getIcon() {
            return this.zzbTf;
        }

        public String getSound() {
            return this.zzbTg;
        }

        public String getTag() {
            return this.mTag;
        }

        public String getTitle() {
            return this.zzavG;
        }

        public String[] getTitleLocalizationArgs() {
            return this.zzbTc;
        }

        public String getTitleLocalizationKey() {
            return this.zzbTb;
        }
    }

    RemoteMessage(int i, Bundle bundle) {
        this.mVersionCode = i;
        this.zzaay = bundle;
    }

    RemoteMessage(Bundle bundle) {
        this(1, bundle);
    }

    public String getCollapseKey() {
        return this.zzaay.getString("collapse_key");
    }

    public Map<String, String> getData() {
        if (this.zzUu == null) {
            this.zzUu = new a();
            for (String str : this.zzaay.keySet()) {
                Object obj = this.zzaay.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!(str.startsWith("google.") || str.startsWith("gcm.") || str.equals("from") || str.equals("message_type") || str.equals("collapse_key"))) {
                        this.zzUu.put(str, str2);
                    }
                }
            }
        }
        return this.zzUu;
    }

    public String getFrom() {
        return this.zzaay.getString("from");
    }

    public String getMessageId() {
        String string = this.zzaay.getString("google.message_id");
        return string == null ? this.zzaay.getString("message_id") : string;
    }

    public String getMessageType() {
        return this.zzaay.getString("message_type");
    }

    public Notification getNotification() {
        if (this.zzbTa == null && a.a(this.zzaay)) {
            this.zzbTa = new Notification(this.zzaay);
        }
        return this.zzbTa;
    }

    public long getSentTime() {
        return this.zzaay.getLong("google.sent_time");
    }

    public String getTo() {
        return this.zzaay.getString("google.to");
    }

    public int getTtl() {
        Object obj = this.zzaay.get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof String) {
            try {
                return Integer.parseInt((String) obj);
            } catch (NumberFormatException e) {
                String valueOf = String.valueOf(obj);
                Log.w("FirebaseMessaging", new StringBuilder(String.valueOf(valueOf).length() + 13).append("Invalid TTL: ").append(valueOf).toString());
            }
        }
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzc.zza(this, parcel, i);
    }

    void zzF(Intent intent) {
        intent.putExtras(this.zzaay);
    }
}
