package com.google.android.gms.ads.internal.overlay;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnInfoListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.net.Uri;
import android.os.Build.VERSION;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View.MeasureSpec;
import com.google.android.gms.ads.internal.v;
import com.google.android.gms.b.vz;
import com.google.android.gms.b.ze;
import com.google.android.gms.b.zi;
import com.google.android.gms.b.zy;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@TargetApi(14)
@vz
public class f extends l implements OnBufferingUpdateListener, OnCompletionListener, OnErrorListener, OnInfoListener, OnPreparedListener, OnVideoSizeChangedListener, SurfaceTextureListener {
    private static final Map<Integer, String> c = new HashMap();
    private final ab d;
    private final boolean e;
    private int f = 0;
    private int g = 0;
    private MediaPlayer h;
    private Uri i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private aa o;
    private boolean p;
    private int q;
    private k r;

    static {
        if (VERSION.SDK_INT >= 17) {
            c.put(Integer.valueOf(-1004), "MEDIA_ERROR_IO");
            c.put(Integer.valueOf(-1007), "MEDIA_ERROR_MALFORMED");
            c.put(Integer.valueOf(-1010), "MEDIA_ERROR_UNSUPPORTED");
            c.put(Integer.valueOf(-110), "MEDIA_ERROR_TIMED_OUT");
            c.put(Integer.valueOf(3), "MEDIA_INFO_VIDEO_RENDERING_START");
        }
        c.put(Integer.valueOf(100), "MEDIA_ERROR_SERVER_DIED");
        c.put(Integer.valueOf(1), "MEDIA_ERROR_UNKNOWN");
        c.put(Integer.valueOf(1), "MEDIA_INFO_UNKNOWN");
        c.put(Integer.valueOf(700), "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        c.put(Integer.valueOf(701), "MEDIA_INFO_BUFFERING_START");
        c.put(Integer.valueOf(702), "MEDIA_INFO_BUFFERING_END");
        c.put(Integer.valueOf(800), "MEDIA_INFO_BAD_INTERLEAVING");
        c.put(Integer.valueOf(801), "MEDIA_INFO_NOT_SEEKABLE");
        c.put(Integer.valueOf(802), "MEDIA_INFO_METADATA_UPDATE");
        if (VERSION.SDK_INT >= 19) {
            c.put(Integer.valueOf(901), "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
            c.put(Integer.valueOf(902), "MEDIA_INFO_SUBTITLE_TIMED_OUT");
        }
    }

    public f(Context context, boolean z, boolean z2, ab abVar) {
        super(context);
        setSurfaceTextureListener(this);
        this.d = abVar;
        this.p = z;
        this.e = z2;
        this.d.a((l) this);
    }

    private void a(boolean z) {
        ze.a("AdMediaPlayerView release");
        if (this.o != null) {
            this.o.b();
            this.o = null;
        }
        if (this.h != null) {
            this.h.reset();
            this.h.release();
            this.h = null;
            b(0);
            if (z) {
                this.g = 0;
                c(0);
            }
        }
    }

    private void b(float f) {
        if (this.h != null) {
            try {
                this.h.setVolume(f, f);
                return;
            } catch (IllegalStateException e) {
                return;
            }
        }
        zy.e("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
    }

    private void b(int i) {
        if (i == 3) {
            this.d.c();
            this.b.b();
        } else if (this.f == 3) {
            this.d.d();
            this.b.c();
        }
        this.f = i;
    }

    private void c(int i) {
        this.g = i;
    }

    private void h() {
        Throwable e;
        String valueOf;
        ze.a("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.i != null && surfaceTexture != null) {
            a(false);
            try {
                SurfaceTexture c;
                this.h = v.v().a();
                this.h.setOnBufferingUpdateListener(this);
                this.h.setOnCompletionListener(this);
                this.h.setOnErrorListener(this);
                this.h.setOnInfoListener(this);
                this.h.setOnPreparedListener(this);
                this.h.setOnVideoSizeChangedListener(this);
                this.l = 0;
                if (this.p) {
                    this.o = new aa(getContext());
                    this.o.a(surfaceTexture, getWidth(), getHeight());
                    this.o.start();
                    c = this.o.c();
                    if (c == null) {
                        this.o.b();
                        this.o = null;
                    }
                    this.h.setDataSource(getContext(), this.i);
                    this.h.setSurface(v.w().a(c));
                    this.h.setAudioStreamType(3);
                    this.h.setScreenOnWhilePlaying(true);
                    this.h.prepareAsync();
                    b(1);
                }
                c = surfaceTexture;
                this.h.setDataSource(getContext(), this.i);
                this.h.setSurface(v.w().a(c));
                this.h.setAudioStreamType(3);
                this.h.setScreenOnWhilePlaying(true);
                this.h.prepareAsync();
                b(1);
            } catch (IOException e2) {
                e = e2;
                valueOf = String.valueOf(this.i);
                zy.c(new StringBuilder(String.valueOf(valueOf).length() + 36).append("Failed to initialize MediaPlayer at ").append(valueOf).toString(), e);
                onError(this.h, 1, 0);
            } catch (IllegalArgumentException e3) {
                e = e3;
                valueOf = String.valueOf(this.i);
                zy.c(new StringBuilder(String.valueOf(valueOf).length() + 36).append("Failed to initialize MediaPlayer at ").append(valueOf).toString(), e);
                onError(this.h, 1, 0);
            } catch (IllegalStateException e4) {
                e = e4;
                valueOf = String.valueOf(this.i);
                zy.c(new StringBuilder(String.valueOf(valueOf).length() + 36).append("Failed to initialize MediaPlayer at ").append(valueOf).toString(), e);
                onError(this.h, 1, 0);
            }
        }
    }

    private void i() {
        if (this.e && j() && this.h.getCurrentPosition() > 0 && this.g != 3) {
            ze.a("AdMediaPlayerView nudging MediaPlayer");
            b(0.0f);
            this.h.start();
            int currentPosition = this.h.getCurrentPosition();
            long a = v.k().a();
            while (j() && this.h.getCurrentPosition() == currentPosition) {
                if (v.k().a() - a > 250) {
                    break;
                }
            }
            this.h.pause();
            a();
        }
    }

    private boolean j() {
        return (this.h == null || this.f == -1 || this.f == 0 || this.f == 1) ? false : true;
    }

    public void a() {
        b(this.b.a());
    }

    public void a(float f, float f2) {
        if (this.o != null) {
            this.o.a(f, f2);
        }
    }

    public void a(int i) {
        ze.a("AdMediaPlayerView seek " + i);
        if (j()) {
            this.h.seekTo(i);
            this.q = 0;
            return;
        }
        this.q = i;
    }

    public void a(k kVar) {
        this.r = kVar;
    }

    public String b() {
        String str = "MediaPlayer";
        String valueOf = String.valueOf(this.p ? " spherical" : "");
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }

    public void c() {
        ze.a("AdMediaPlayerView stop");
        if (this.h != null) {
            this.h.stop();
            this.h.release();
            this.h = null;
            b(0);
            c(0);
        }
        this.d.b();
    }

    public void d() {
        ze.a("AdMediaPlayerView play");
        if (j()) {
            this.h.start();
            b(3);
            this.a.a();
            zi.a.post(new Runnable(this) {
                final /* synthetic */ f a;

                {
                    this.a = r1;
                }

                public void run() {
                    if (this.a.r != null) {
                        this.a.r.c();
                    }
                }
            });
        }
        c(3);
    }

    public void e() {
        ze.a("AdMediaPlayerView pause");
        if (j() && this.h.isPlaying()) {
            this.h.pause();
            b(4);
            zi.a.post(new Runnable(this) {
                final /* synthetic */ f a;

                {
                    this.a = r1;
                }

                public void run() {
                    if (this.a.r != null) {
                        this.a.r.d();
                    }
                }
            });
        }
        c(4);
    }

    public int getCurrentPosition() {
        return j() ? this.h.getCurrentPosition() : 0;
    }

    public int getDuration() {
        return j() ? this.h.getDuration() : -1;
    }

    public int getVideoHeight() {
        return this.h != null ? this.h.getVideoHeight() : 0;
    }

    public int getVideoWidth() {
        return this.h != null ? this.h.getVideoWidth() : 0;
    }

    public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        this.l = i;
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        ze.a("AdMediaPlayerView completion");
        b(5);
        c(5);
        zi.a.post(new Runnable(this) {
            final /* synthetic */ f a;

            {
                this.a = r1;
            }

            public void run() {
                if (this.a.r != null) {
                    this.a.r.e();
                }
            }
        });
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        final String str = (String) c.get(Integer.valueOf(i));
        final String str2 = (String) c.get(Integer.valueOf(i2));
        zy.e(new StringBuilder((String.valueOf(str).length() + 38) + String.valueOf(str2).length()).append("AdMediaPlayerView MediaPlayer error: ").append(str).append(":").append(str2).toString());
        b(-1);
        c(-1);
        zi.a.post(new Runnable(this) {
            final /* synthetic */ f c;

            public void run() {
                if (this.c.r != null) {
                    this.c.r.a(str, str2);
                }
            }
        });
        return true;
    }

    public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        String str = (String) c.get(Integer.valueOf(i));
        String str2 = (String) c.get(Integer.valueOf(i2));
        ze.a(new StringBuilder((String.valueOf(str).length() + 37) + String.valueOf(str2).length()).append("AdMediaPlayerView MediaPlayer info: ").append(str).append(":").append(str2).toString());
        return true;
    }

    protected void onMeasure(int i, int i2) {
        int defaultSize = getDefaultSize(this.j, i);
        int defaultSize2 = getDefaultSize(this.k, i2);
        if (this.j > 0 && this.k > 0 && this.o == null) {
            int mode = MeasureSpec.getMode(i);
            int size = MeasureSpec.getSize(i);
            int mode2 = MeasureSpec.getMode(i2);
            defaultSize2 = MeasureSpec.getSize(i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                if (this.j * defaultSize2 < this.k * size) {
                    defaultSize = (this.j * defaultSize2) / this.k;
                } else if (this.j * defaultSize2 > this.k * size) {
                    defaultSize2 = (this.k * size) / this.j;
                    defaultSize = size;
                } else {
                    defaultSize = size;
                }
            } else if (mode == 1073741824) {
                defaultSize = (this.k * size) / this.j;
                if (mode2 != Integer.MIN_VALUE || defaultSize <= defaultSize2) {
                    defaultSize2 = defaultSize;
                    defaultSize = size;
                } else {
                    defaultSize = size;
                }
            } else if (mode2 == 1073741824) {
                defaultSize = (this.j * defaultSize2) / this.k;
                if (mode == Integer.MIN_VALUE && defaultSize > size) {
                    defaultSize = size;
                }
            } else {
                int i3 = this.j;
                defaultSize = this.k;
                if (mode2 != Integer.MIN_VALUE || defaultSize <= defaultSize2) {
                    defaultSize2 = defaultSize;
                    defaultSize = i3;
                } else {
                    defaultSize = (this.j * defaultSize2) / this.k;
                }
                if (mode == Integer.MIN_VALUE && r1 > size) {
                    defaultSize2 = (this.k * size) / this.j;
                    defaultSize = size;
                }
            }
        }
        setMeasuredDimension(defaultSize, defaultSize2);
        if (this.o != null) {
            this.o.a(defaultSize, defaultSize2);
        }
        if (VERSION.SDK_INT == 16) {
            if ((this.m > 0 && this.m != defaultSize) || (this.n > 0 && this.n != defaultSize2)) {
                i();
            }
            this.m = defaultSize;
            this.n = defaultSize2;
        }
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        ze.a("AdMediaPlayerView prepared");
        b(2);
        this.d.a();
        zi.a.post(new Runnable(this) {
            final /* synthetic */ f a;

            {
                this.a = r1;
            }

            public void run() {
                if (this.a.r != null) {
                    this.a.r.b();
                }
            }
        });
        this.j = mediaPlayer.getVideoWidth();
        this.k = mediaPlayer.getVideoHeight();
        if (this.q != 0) {
            a(this.q);
        }
        i();
        int i = this.j;
        zy.d("AdMediaPlayerView stream dimensions: " + i + " x " + this.k);
        if (this.g == 3) {
            d();
        }
        a();
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        ze.a("AdMediaPlayerView surface created");
        h();
        zi.a.post(new Runnable(this) {
            final /* synthetic */ f a;

            {
                this.a = r1;
            }

            public void run() {
                if (this.a.r != null) {
                    this.a.r.a();
                }
            }
        });
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        ze.a("AdMediaPlayerView surface destroyed");
        if (this.h != null && this.q == 0) {
            this.q = this.h.getCurrentPosition();
        }
        if (this.o != null) {
            this.o.b();
        }
        zi.a.post(new Runnable(this) {
            final /* synthetic */ f a;

            {
                this.a = r1;
            }

            public void run() {
                if (this.a.r != null) {
                    this.a.r.d();
                    this.a.r.f();
                }
            }
        });
        a(true);
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, final int i, final int i2) {
        Object obj = 1;
        ze.a("AdMediaPlayerView surface changed");
        Object obj2 = this.g == 3 ? 1 : null;
        if (!(this.j == i && this.k == i2)) {
            obj = null;
        }
        if (!(this.h == null || obj2 == null || r1 == null)) {
            if (this.q != 0) {
                a(this.q);
            }
            d();
        }
        if (this.o != null) {
            this.o.a(i, i2);
        }
        zi.a.post(new Runnable(this) {
            final /* synthetic */ f c;

            public void run() {
                if (this.c.r != null) {
                    this.c.r.a(i, i2);
                }
            }
        });
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.d.b(this);
        this.a.a(surfaceTexture, this.r);
    }

    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        ze.a("AdMediaPlayerView size changed: " + i + " x " + i2);
        this.j = mediaPlayer.getVideoWidth();
        this.k = mediaPlayer.getVideoHeight();
        if (this.j != 0 && this.k != 0) {
            requestLayout();
        }
    }

    public void setVideoPath(String str) {
        setVideoURI(Uri.parse(str));
    }

    public void setVideoURI(Uri uri) {
        this.i = uri;
        this.q = 0;
        h();
        requestLayout();
        invalidate();
    }

    public String toString() {
        String valueOf = String.valueOf(getClass().getName());
        String valueOf2 = String.valueOf(Integer.toHexString(hashCode()));
        return new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(valueOf2).length()).append(valueOf).append("@").append(valueOf2).toString();
    }
}
