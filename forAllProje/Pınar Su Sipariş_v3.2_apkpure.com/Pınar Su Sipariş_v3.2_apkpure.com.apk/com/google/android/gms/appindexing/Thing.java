package com.google.android.gms.appindexing;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.plus.PlusShare;
import java.util.ArrayList;

public class Thing {
    final Bundle zzaax;

    public static class Builder {
        final Bundle zzaay = new Bundle();

        public Thing build() {
            return new Thing(this.zzaay);
        }

        public Builder put(String str, Thing thing) {
            zzaa.zzz(str);
            if (thing != null) {
                this.zzaay.putParcelable(str, thing.zzaax);
            }
            return this;
        }

        public Builder put(String str, String str2) {
            zzaa.zzz(str);
            if (str2 != null) {
                this.zzaay.putString(str, str2);
            }
            return this;
        }

        public Builder put(String str, boolean z) {
            zzaa.zzz(str);
            this.zzaay.putBoolean(str, z);
            return this;
        }

        public Builder put(String str, Thing[] thingArr) {
            zzaa.zzz(str);
            if (thingArr != null) {
                ArrayList arrayList = new ArrayList();
                for (Thing thing : thingArr) {
                    if (thing != null) {
                        arrayList.add(thing.zzaax);
                    }
                }
                this.zzaay.putParcelableArray(str, (Parcelable[]) arrayList.toArray(new Bundle[arrayList.size()]));
            }
            return this;
        }

        public Builder put(String str, String[] strArr) {
            zzaa.zzz(str);
            if (strArr != null) {
                this.zzaay.putStringArray(str, strArr);
            }
            return this;
        }

        public Builder setDescription(String str) {
            put(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_DESCRIPTION, str);
            return this;
        }

        public Builder setId(String str) {
            if (str != null) {
                put("id", str);
            }
            return this;
        }

        public Builder setName(String str) {
            zzaa.zzz(str);
            put("name", str);
            return this;
        }

        public Builder setType(String str) {
            put("type", str);
            return this;
        }

        public Builder setUrl(Uri uri) {
            zzaa.zzz(uri);
            put(PlusShare.KEY_CALL_TO_ACTION_URL, uri.toString());
            return this;
        }
    }

    Thing(Bundle bundle) {
        this.zzaax = bundle;
    }

    public Bundle zzoN() {
        return this.zzaax;
    }
}
