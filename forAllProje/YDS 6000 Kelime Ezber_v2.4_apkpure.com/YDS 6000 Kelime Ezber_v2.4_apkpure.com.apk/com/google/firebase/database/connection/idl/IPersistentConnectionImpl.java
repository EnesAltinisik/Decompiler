package com.google.firebase.database.connection.idl;

import android.content.Context;
import com.google.android.gms.a.b;
import com.google.android.gms.b.fy;
import com.google.android.gms.b.ga;
import com.google.android.gms.b.gb;
import com.google.android.gms.b.ge;
import com.google.android.gms.b.gf;
import com.google.android.gms.b.gg;
import com.google.android.gms.b.gh;
import com.google.android.gms.b.gi;
import com.google.android.gms.b.iz;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.firebase_database.ModuleDescriptor;
import com.google.firebase.database.connection.idl.k.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;

@DynamiteApi
public class IPersistentConnectionImpl extends a {
    private gf a;

    class AnonymousClass2 implements gi {
        final /* synthetic */ m a;

        AnonymousClass2(m mVar) {
            this.a = mVar;
        }

        public void a(String str, String str2) {
            try {
                this.a.a(str, str2);
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
    }

    class AnonymousClass3 extends l.a {
        final /* synthetic */ gf.a a;

        AnonymousClass3(gf.a aVar) {
            this.a = aVar;
        }

        public void a() {
            this.a.a();
        }

        public void a(com.google.android.gms.a.a aVar) {
            this.a.a((Map) b.a(aVar));
        }

        public void a(List<String> list, com.google.android.gms.a.a aVar, boolean z, long j) {
            this.a.a(list, b.a(aVar), z, IPersistentConnectionImpl.b(j));
        }

        public void a(List<String> list, List<n> list2, com.google.android.gms.a.a aVar, long j) {
            List list3 = (List) b.a(aVar);
            List arrayList = new ArrayList(list2.size());
            for (int i = 0; i < list2.size(); i++) {
                arrayList.add(n.a((n) list2.get(i), list3.get(i)));
            }
            this.a.a(list, arrayList, IPersistentConnectionImpl.b(j));
        }

        public void a(boolean z) {
            this.a.a(z);
        }

        public void b() {
            this.a.b();
        }
    }

    class AnonymousClass4 implements gf.a {
        final /* synthetic */ l a;

        AnonymousClass4(l lVar) {
            this.a = lVar;
        }

        public void a() {
            try {
                this.a.a();
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }

        public void a(List<String> list, Object obj, boolean z, Long l) {
            try {
                this.a.a((List) list, b.a(obj), z, IPersistentConnectionImpl.b(l));
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }

        public void a(List<String> list, List<gh> list2, Long l) {
            List arrayList = new ArrayList(list2.size());
            Object arrayList2 = new ArrayList(list2.size());
            for (gh ghVar : list2) {
                arrayList.add(n.a(ghVar));
                arrayList2.add(ghVar.c());
            }
            try {
                this.a.a((List) list, arrayList, b.a(arrayList2), IPersistentConnectionImpl.b(l));
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }

        public void a(Map<String, Object> map) {
            try {
                this.a.a(b.a((Object) map));
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }

        public void a(boolean z) {
            try {
                this.a.a(z);
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }

        public void b() {
            try {
                this.a.b();
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
    }

    class AnonymousClass5 extends h.a {
        final /* synthetic */ ga a;

        AnonymousClass5(ga gaVar) {
            this.a = gaVar;
        }

        public void a(boolean z, final i iVar) {
            this.a.a(z, new ga.a(this) {
                public void a(String str) {
                    try {
                        iVar.a(str);
                    } catch (Throwable e) {
                        throw new RuntimeException(e);
                    }
                }

                public void b(String str) {
                    try {
                        iVar.b(str);
                    } catch (Throwable e) {
                        throw new RuntimeException(e);
                    }
                }
            });
        }
    }

    class AnonymousClass6 implements ga {
        final /* synthetic */ h a;

        AnonymousClass6(h hVar) {
            this.a = hVar;
        }

        public void a(boolean z, final ga.a aVar) {
            try {
                this.a.a(z, new i.a(this) {
                    public void a(String str) {
                        aVar.a(str);
                    }

                    public void b(String str) {
                        aVar.b(str);
                    }
                });
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
    }

    private static ga a(h hVar) {
        return new AnonymousClass6(hVar);
    }

    private static gf.a a(l lVar) {
        return new AnonymousClass4(lVar);
    }

    private static gi a(m mVar) {
        return new AnonymousClass2(mVar);
    }

    private static h a(ga gaVar) {
        return new AnonymousClass5(gaVar);
    }

    private static l a(gf.a aVar) {
        return new AnonymousClass3(aVar);
    }

    private static long b(Long l) {
        if (l == null) {
            return -1;
        }
        if (l.longValue() != -1) {
            return l.longValue();
        }
        throw new IllegalArgumentException("Tag parameter clashed with NO_TAG value");
    }

    private static Long b(long j) {
        return j == -1 ? null : Long.valueOf(j);
    }

    public static k loadDynamic(Context context, c cVar, ga gaVar, ScheduledExecutorService scheduledExecutorService, gf.a aVar) {
        try {
            k asInterface = a.asInterface(DynamiteModule.a(context, DynamiteModule.d, ModuleDescriptor.MODULE_ID).a("com.google.firebase.database.connection.idl.IPersistentConnectionImpl"));
            asInterface.setup(cVar, a(gaVar), b.a((Object) scheduledExecutorService), a(aVar));
            return asInterface;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        } catch (Throwable e2) {
            throw new RuntimeException(e2);
        }
    }

    public void compareAndPut(List<String> list, com.google.android.gms.a.a aVar, String str, m mVar) {
        this.a.a(list, b.a(aVar), str, a(mVar));
    }

    public void initialize() {
        this.a.a();
    }

    public void interrupt(String str) {
        this.a.d(str);
    }

    public boolean isInterrupted(String str) {
        return this.a.f(str);
    }

    public void listen(List<String> list, com.google.android.gms.a.a aVar, final j jVar, long j, m mVar) {
        Long b = b(j);
        List<String> list2 = list;
        this.a.a(list2, (Map) b.a(aVar), new ge(this) {
            public String a() {
                try {
                    return jVar.a();
                } catch (Throwable e) {
                    throw new RuntimeException(e);
                }
            }

            public boolean b() {
                try {
                    return jVar.b();
                } catch (Throwable e) {
                    throw new RuntimeException(e);
                }
            }

            public fy c() {
                try {
                    return a.a(jVar.c());
                } catch (Throwable e) {
                    throw new RuntimeException(e);
                }
            }
        }, b, a(mVar));
    }

    public void merge(List<String> list, com.google.android.gms.a.a aVar, m mVar) {
        this.a.a((List) list, (Map) b.a(aVar), a(mVar));
    }

    public void onDisconnectCancel(List<String> list, m mVar) {
        this.a.a((List) list, a(mVar));
    }

    public void onDisconnectMerge(List<String> list, com.google.android.gms.a.a aVar, m mVar) {
        this.a.b((List) list, (Map) b.a(aVar), a(mVar));
    }

    public void onDisconnectPut(List<String> list, com.google.android.gms.a.a aVar, m mVar) {
        this.a.b((List) list, b.a(aVar), a(mVar));
    }

    public void purgeOutstandingWrites() {
        this.a.d();
    }

    public void put(List<String> list, com.google.android.gms.a.a aVar, m mVar) {
        this.a.a((List) list, b.a(aVar), a(mVar));
    }

    public void refreshAuthToken() {
        this.a.c();
    }

    public void refreshAuthToken2(String str) {
        this.a.c(str);
    }

    public void resume(String str) {
        this.a.e(str);
    }

    public void setup(c cVar, h hVar, com.google.android.gms.a.a aVar, l lVar) {
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) b.a(aVar);
        this.a = new gg(new gb(new iz(cVar.a(), cVar.b()), a(hVar), scheduledExecutorService, cVar.e, cVar.f, cVar.g), f.a(cVar.b), a(lVar));
    }

    public void shutdown() {
        this.a.b();
    }

    public void unlisten(List<String> list, com.google.android.gms.a.a aVar) {
        this.a.a((List) list, (Map) b.a(aVar));
    }
}
