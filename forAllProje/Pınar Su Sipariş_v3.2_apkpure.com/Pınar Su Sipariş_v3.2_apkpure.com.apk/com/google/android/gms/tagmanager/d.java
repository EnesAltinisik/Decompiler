package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.tagmanager.ModuleDescriptor;
import com.google.android.gms.internal.zzqi;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.AppMeasurement.zzb;
import com.google.android.gms.measurement.AppMeasurement.zzc;
import com.google.android.gms.tagmanager.zzba.zza;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

final class d {
    private static volatile zzqi a;
    private static volatile zzbb b;
    private static final Map<String, CustomTagProvider> c = new HashMap();
    private static final Map<String, CustomVariableProvider> d = new HashMap();

    class AnonymousClass1 extends zza {
        final /* synthetic */ AppMeasurement a;

        AnonymousClass1(AppMeasurement appMeasurement) {
            this.a = appMeasurement;
        }

        public Map<String, Object> zzJJ() {
            return this.a.zzav(true);
        }

        public void zza(final zzay com_google_android_gms_tagmanager_zzay) {
            this.a.zza(new zzc(this) {
                final /* synthetic */ AnonymousClass1 b;

                public void zzc(String str, String str2, Bundle bundle, long j) {
                    try {
                        com_google_android_gms_tagmanager_zzay.zzc(str, str2, bundle, j);
                    } catch (Throwable e) {
                        throw new IllegalStateException(e);
                    }
                }
            });
        }

        public void zza(final zzaz com_google_android_gms_tagmanager_zzaz) {
            this.a.zza(new zzb(this) {
                final /* synthetic */ AnonymousClass1 b;

                public void zzb(String str, String str2, Bundle bundle, long j) {
                    try {
                        com_google_android_gms_tagmanager_zzaz.zzb(str, str2, bundle, j);
                    } catch (Throwable e) {
                        throw new IllegalStateException(e);
                    }
                }
            });
        }

        public void zza(String str, String str2, Bundle bundle, long j) {
            this.a.zza(str, str2, bundle, j);
        }
    }

    private d() {
    }

    static IBinder a(Context context) {
        try {
            return zzbc.zza.asInterface(d(context).zzdM("com.google.android.gms.tagmanager.TagManagerServiceProviderImpl")).getService(zze.zzD(context), e(context), a()).asBinder();
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        } catch (Throwable e2) {
            throw new RuntimeException(e2);
        }
    }

    static zzax a() {
        return new zzax.zza() {
            public void zze(String str, Map map) {
                CustomTagProvider customTagProvider;
                if (d.c.containsKey(str)) {
                    customTagProvider = (CustomTagProvider) d.c.get(str);
                } else {
                    customTagProvider = (CustomTagProvider) d.b(str, CustomTagProvider.class);
                    d.c.put(str, customTagProvider);
                }
                if (customTagProvider != null) {
                    customTagProvider.execute(map);
                }
            }

            public String zzf(String str, Map map) {
                CustomVariableProvider customVariableProvider;
                if (d.d.containsKey(str)) {
                    customVariableProvider = (CustomVariableProvider) d.d.get(str);
                } else {
                    customVariableProvider = (CustomVariableProvider) d.b(str, CustomVariableProvider.class);
                    d.d.put(str, customVariableProvider);
                }
                return customVariableProvider != null ? customVariableProvider.getValue(map) : null;
            }
        };
    }

    static void a(Intent intent, Context context) {
        zzbb c = c(context);
        synchronized (d.class) {
            try {
                c.previewIntent(intent, zze.zzD(context), zze.zzD(a.zzxi()), e(context), a());
            } catch (Throwable e) {
                throw new IllegalStateException(e);
            }
        }
    }

    private static Object b(String str, Class<?> cls) {
        Object obj = null;
        Object obj2 = null;
        try {
            Class cls2 = Class.forName(str);
            for (Object equals : cls2.getInterfaces()) {
                if (equals.equals(cls)) {
                    obj = 1;
                    break;
                }
            }
            if (obj == null) {
                String valueOf = String.valueOf(cls.getCanonicalName());
                Log.e("GoogleTagManagerAPI", new StringBuilder((String.valueOf(str).length() + 30) + String.valueOf(valueOf).length()).append(str).append(" doesn't implement ").append(valueOf).append(" interface.").toString());
            } else {
                try {
                    obj2 = cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (NoSuchMethodException e) {
                    Log.e("GoogleTagManagerAPI", String.valueOf(str).concat(" doesn't have a valid no-arg constructor"));
                } catch (SecurityException e2) {
                    Log.e("GoogleTagManagerAPI", String.valueOf(str).concat(" doesn't have an accessible no-arg constructor"));
                } catch (InvocationTargetException e3) {
                    Log.e("GoogleTagManagerAPI", String.valueOf(str).concat(" construction threw an exception."));
                } catch (InstantiationException e4) {
                    Log.e("GoogleTagManagerAPI", String.valueOf(str).concat(" is an abstract class."));
                } catch (IllegalAccessException e5) {
                    Log.e("GoogleTagManagerAPI", String.valueOf(str).concat(" doesn't have an accessible no-arg constructor"));
                }
            }
        } catch (ClassNotFoundException e6) {
            Log.e("GoogleTagManagerAPI", String.valueOf(str).concat(" can't be found in the application."));
        }
        return obj2;
    }

    static void b(Context context) {
        zzbb c = c(context);
        synchronized (d.class) {
            try {
                c.initialize(zze.zzD(context), e(context), a());
            } catch (Throwable e) {
                throw new IllegalStateException(e);
            }
        }
    }

    private static zzbb c(Context context) {
        zzbb com_google_android_gms_tagmanager_zzbb = b;
        if (com_google_android_gms_tagmanager_zzbb == null) {
            synchronized (d.class) {
                com_google_android_gms_tagmanager_zzbb = b;
                if (com_google_android_gms_tagmanager_zzbb == null) {
                    try {
                        com_google_android_gms_tagmanager_zzbb = zzbb.zza.asInterface(d(context).zzdM("com.google.android.gms.tagmanager.TagManagerApiImpl"));
                        b = com_google_android_gms_tagmanager_zzbb;
                    } catch (Throwable e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
        return com_google_android_gms_tagmanager_zzbb;
    }

    private static zzqi d(Context context) throws zzqi.zza {
        zzqi com_google_android_gms_internal_zzqi = a;
        if (com_google_android_gms_internal_zzqi == null) {
            synchronized (d.class) {
                com_google_android_gms_internal_zzqi = a;
                if (a == null) {
                    com_google_android_gms_internal_zzqi = zzqi.zza(context, zzqi.zzaCq, ModuleDescriptor.MODULE_ID);
                    a = com_google_android_gms_internal_zzqi;
                }
            }
        }
        return com_google_android_gms_internal_zzqi;
    }

    private static zzba e(Context context) {
        return new AnonymousClass1(AppMeasurement.getInstance(context));
    }
}
