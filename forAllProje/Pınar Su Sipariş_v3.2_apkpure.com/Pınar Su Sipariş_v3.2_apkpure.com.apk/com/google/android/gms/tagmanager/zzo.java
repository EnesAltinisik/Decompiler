package com.google.android.gms.tagmanager;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tagmanager.ContainerHolder.ContainerAvailableListener;

class zzo implements ContainerHolder {
    private final Looper a;
    private Container b;
    private Container c;
    private Status d;
    private a e;
    private zza f;
    private boolean g;
    private TagManager h;

    private class a extends Handler {
        final /* synthetic */ zzo a;
        private final ContainerAvailableListener b;

        public a(zzo com_google_android_gms_tagmanager_zzo, ContainerAvailableListener containerAvailableListener, Looper looper) {
            this.a = com_google_android_gms_tagmanager_zzo;
            super(looper);
            this.b = containerAvailableListener;
        }

        public void a(String str) {
            sendMessage(obtainMessage(1, str));
        }

        protected void b(String str) {
            this.b.onContainerAvailable(this.a, str);
        }

        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    b((String) message.obj);
                    return;
                default:
                    zzbn.e("Don't know how to handle this message.");
                    return;
            }
        }
    }

    public interface zza {
        String zzJm();

        void zzJo();

        void zzgn(String str);
    }

    public zzo(Status status) {
        this.d = status;
        this.a = null;
    }

    public zzo(TagManager tagManager, Looper looper, Container container, zza com_google_android_gms_tagmanager_zzo_zza) {
        this.h = tagManager;
        if (looper == null) {
            looper = Looper.getMainLooper();
        }
        this.a = looper;
        this.b = container;
        this.f = com_google_android_gms_tagmanager_zzo_zza;
        this.d = Status.zzalw;
        tagManager.zza(this);
    }

    private void c() {
        if (this.e != null) {
            this.e.a(this.c.zzJk());
        }
    }

    String a() {
        if (!this.g) {
            return this.b.getContainerId();
        }
        zzbn.e("getContainerId called on a released ContainerHolder.");
        return "";
    }

    public synchronized void a(Container container) {
        if (!this.g) {
            if (container == null) {
                zzbn.e("Unexpected null container.");
            } else {
                this.c = container;
                c();
            }
        }
    }

    public synchronized void a(String str) {
        if (!this.g) {
            this.b.zzgl(str);
        }
    }

    String b() {
        if (!this.g) {
            return this.f.zzJm();
        }
        zzbn.e("setCtfeUrlPathAndQuery called on a released ContainerHolder.");
        return "";
    }

    void b(String str) {
        if (this.g) {
            zzbn.e("setCtfeUrlPathAndQuery called on a released ContainerHolder.");
        } else {
            this.f.zzgn(str);
        }
    }

    public synchronized Container getContainer() {
        Container container = null;
        synchronized (this) {
            if (this.g) {
                zzbn.e("ContainerHolder is released.");
            } else {
                if (this.c != null) {
                    this.b = this.c;
                    this.c = null;
                }
                container = this.b;
            }
        }
        return container;
    }

    public Status getStatus() {
        return this.d;
    }

    public synchronized void refresh() {
        if (this.g) {
            zzbn.e("Refreshing a released ContainerHolder.");
        } else {
            this.f.zzJo();
        }
    }

    public synchronized void release() {
        if (this.g) {
            zzbn.e("Releasing a released ContainerHolder.");
        } else {
            this.g = true;
            this.h.zzb(this);
            this.b.release();
            this.b = null;
            this.c = null;
            this.f = null;
            this.e = null;
        }
    }

    public synchronized void setContainerAvailableListener(ContainerAvailableListener containerAvailableListener) {
        if (this.g) {
            zzbn.e("ContainerHolder is released.");
        } else if (containerAvailableListener == null) {
            this.e = null;
        } else {
            this.e = new a(this, containerAvailableListener, this.a);
            if (this.c != null) {
                c();
            }
        }
    }
}
