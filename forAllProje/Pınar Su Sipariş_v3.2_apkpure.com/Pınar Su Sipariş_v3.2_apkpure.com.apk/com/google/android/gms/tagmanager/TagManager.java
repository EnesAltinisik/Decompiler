package com.google.android.gms.tagmanager;

import android.annotation.TargetApi;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.PendingResult;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class TagManager {
    private static TagManager zzbry;
    private final Context mContext;
    private final DataLayer zzbnS;
    private final ci zzbqs;
    private final zza zzbrv;
    private final zzda zzbrw;
    private final ConcurrentMap<zzo, Boolean> zzbrx;

    public interface zza {
        zzp zza(Context context, TagManager tagManager, Looper looper, String str, int i, ci ciVar);
    }

    TagManager(Context context, zza com_google_android_gms_tagmanager_TagManager_zza, DataLayer dataLayer, zzda com_google_android_gms_tagmanager_zzda) {
        if (context == null) {
            throw new NullPointerException("context cannot be null");
        }
        this.mContext = context.getApplicationContext();
        this.zzbrw = com_google_android_gms_tagmanager_zzda;
        this.zzbrv = com_google_android_gms_tagmanager_TagManager_zza;
        this.zzbrx = new ConcurrentHashMap();
        this.zzbnS = dataLayer;
        this.zzbnS.zza(new b(this) {
            final /* synthetic */ TagManager a;

            {
                this.a = r1;
            }

            public void a(Map<String, Object> map) {
                Object obj = map.get("event");
                if (obj != null) {
                    this.a.zzgJ(obj.toString());
                }
            }
        });
        this.zzbnS.zza(new bo(this.mContext));
        this.zzbqs = new ci();
        zzKH();
    }

    public static TagManager getInstance(Context context) {
        TagManager tagManager;
        synchronized (TagManager.class) {
            if (zzbry == null) {
                if (context == null) {
                    zzbn.e("TagManager.getInstance requires non-null context.");
                    throw new NullPointerException();
                }
                zzbry = new TagManager(context, new zza() {
                    public zzp zza(Context context, TagManager tagManager, Looper looper, String str, int i, ci ciVar) {
                        return new zzp(context, tagManager, looper, str, i, ciVar);
                    }
                }, new DataLayer(new cl(context)), zzdb.a());
            }
            tagManager = zzbry;
        }
        return tagManager;
    }

    @TargetApi(14)
    private void zzKH() {
        if (VERSION.SDK_INT >= 14) {
            this.mContext.registerComponentCallbacks(new ComponentCallbacks2(this) {
                final /* synthetic */ TagManager a;

                {
                    this.a = r1;
                }

                public void onConfigurationChanged(Configuration configuration) {
                }

                public void onLowMemory() {
                }

                public void onTrimMemory(int i) {
                    if (i == 20) {
                        this.a.dispatch();
                    }
                }
            });
        }
    }

    private void zzgJ(String str) {
        for (zzo a : this.zzbrx.keySet()) {
            a.a(str);
        }
    }

    public void dispatch() {
        this.zzbrw.dispatch();
    }

    public DataLayer getDataLayer() {
        return this.zzbnS;
    }

    public PendingResult<ContainerHolder> loadContainerDefaultOnly(String str, int i) {
        PendingResult zza = this.zzbrv.zza(this.mContext, this, null, str, i, this.zzbqs);
        zza.zzJp();
        return zza;
    }

    public PendingResult<ContainerHolder> loadContainerDefaultOnly(String str, int i, Handler handler) {
        PendingResult zza = this.zzbrv.zza(this.mContext, this, handler.getLooper(), str, i, this.zzbqs);
        zza.zzJp();
        return zza;
    }

    public PendingResult<ContainerHolder> loadContainerPreferFresh(String str, int i) {
        PendingResult zza = this.zzbrv.zza(this.mContext, this, null, str, i, this.zzbqs);
        zza.zzJr();
        return zza;
    }

    public PendingResult<ContainerHolder> loadContainerPreferFresh(String str, int i, Handler handler) {
        PendingResult zza = this.zzbrv.zza(this.mContext, this, handler.getLooper(), str, i, this.zzbqs);
        zza.zzJr();
        return zza;
    }

    public PendingResult<ContainerHolder> loadContainerPreferNonDefault(String str, int i) {
        PendingResult zza = this.zzbrv.zza(this.mContext, this, null, str, i, this.zzbqs);
        zza.zzJq();
        return zza;
    }

    public PendingResult<ContainerHolder> loadContainerPreferNonDefault(String str, int i, Handler handler) {
        PendingResult zza = this.zzbrv.zza(this.mContext, this, handler.getLooper(), str, i, this.zzbqs);
        zza.zzJq();
        return zza;
    }

    public void setVerboseLoggingEnabled(boolean z) {
        zzbn.setLogLevel(z ? 2 : 5);
    }

    public void zza(zzo com_google_android_gms_tagmanager_zzo) {
        this.zzbrx.put(com_google_android_gms_tagmanager_zzo, Boolean.valueOf(true));
    }

    public boolean zzb(zzo com_google_android_gms_tagmanager_zzo) {
        return this.zzbrx.remove(com_google_android_gms_tagmanager_zzo) != null;
    }

    synchronized boolean zzr(Uri uri) {
        boolean z;
        aw a = aw.a();
        if (a.a(uri)) {
            String d = a.d();
            switch (a.b()) {
                case NONE:
                    for (zzo com_google_android_gms_tagmanager_zzo : this.zzbrx.keySet()) {
                        if (com_google_android_gms_tagmanager_zzo.a().equals(d)) {
                            com_google_android_gms_tagmanager_zzo.b(null);
                            com_google_android_gms_tagmanager_zzo.refresh();
                        }
                    }
                    break;
                case CONTAINER:
                case CONTAINER_DEBUG:
                    for (zzo com_google_android_gms_tagmanager_zzo2 : this.zzbrx.keySet()) {
                        if (com_google_android_gms_tagmanager_zzo2.a().equals(d)) {
                            com_google_android_gms_tagmanager_zzo2.b(a.c());
                            com_google_android_gms_tagmanager_zzo2.refresh();
                        } else if (com_google_android_gms_tagmanager_zzo2.b() != null) {
                            com_google_android_gms_tagmanager_zzo2.b(null);
                            com_google_android_gms_tagmanager_zzo2.refresh();
                        }
                    }
                    break;
            }
            z = true;
        } else {
            z = false;
        }
        return z;
    }
}
