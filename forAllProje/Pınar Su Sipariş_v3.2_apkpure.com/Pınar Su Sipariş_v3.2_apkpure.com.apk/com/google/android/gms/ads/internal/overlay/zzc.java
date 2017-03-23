package com.google.android.gms.ads.internal.overlay;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;
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
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.cast.TextTrackStyle;
import com.google.android.gms.internal.zzamj;
import com.google.android.gms.internal.zzig;
import com.google.android.gms.internal.zzjw;
import com.google.android.gms.internal.zzka;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@TargetApi(14)
@zzig
public class zzc extends zzi implements OnAudioFocusChangeListener, OnBufferingUpdateListener, OnCompletionListener, OnErrorListener, OnInfoListener, OnPreparedListener, OnVideoSizeChangedListener, SurfaceTextureListener {
    private static final Map<Integer, String> zzGK = new HashMap();
    private final zzx zzGL;
    private final boolean zzGM;
    private int zzGN = 0;
    private int zzGO = 0;
    private MediaPlayer zzGP;
    private Uri zzGQ;
    private int zzGR;
    private int zzGS;
    private int zzGT;
    private int zzGU;
    private int zzGV;
    private float zzGW = TextTrackStyle.DEFAULT_FONT_SCALE;
    private boolean zzGX;
    private boolean zzGY;
    private zzw zzGZ;
    private boolean zzHa;
    private int zzHb;
    private zzh zzHc;

    static {
        zzGK.put(Integer.valueOf(-1004), "MEDIA_ERROR_IO");
        zzGK.put(Integer.valueOf(-1007), "MEDIA_ERROR_MALFORMED");
        zzGK.put(Integer.valueOf(-1010), "MEDIA_ERROR_UNSUPPORTED");
        zzGK.put(Integer.valueOf(-110), "MEDIA_ERROR_TIMED_OUT");
        zzGK.put(Integer.valueOf(100), "MEDIA_ERROR_SERVER_DIED");
        zzGK.put(Integer.valueOf(1), "MEDIA_ERROR_UNKNOWN");
        zzGK.put(Integer.valueOf(1), "MEDIA_INFO_UNKNOWN");
        zzGK.put(Integer.valueOf(700), "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        zzGK.put(Integer.valueOf(3), "MEDIA_INFO_VIDEO_RENDERING_START");
        zzGK.put(Integer.valueOf(701), "MEDIA_INFO_BUFFERING_START");
        zzGK.put(Integer.valueOf(702), "MEDIA_INFO_BUFFERING_END");
        zzGK.put(Integer.valueOf(800), "MEDIA_INFO_BAD_INTERLEAVING");
        zzGK.put(Integer.valueOf(801), "MEDIA_INFO_NOT_SEEKABLE");
        zzGK.put(Integer.valueOf(802), "MEDIA_INFO_METADATA_UPDATE");
        zzGK.put(Integer.valueOf(901), "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
        zzGK.put(Integer.valueOf(902), "MEDIA_INFO_SUBTITLE_TIMED_OUT");
    }

    public zzc(Context context, boolean z, boolean z2, zzx com_google_android_gms_ads_internal_overlay_zzx) {
        super(context);
        setSurfaceTextureListener(this);
        this.zzGL = com_google_android_gms_ads_internal_overlay_zzx;
        this.zzHa = z;
        this.zzGM = z2;
        this.zzGL.zza((zzi) this);
    }

    private void zzB(int i) {
        if (i == 3) {
            this.zzGL.zzhd();
        } else if (this.zzGN == 3) {
            this.zzGL.zzhe();
        }
        this.zzGN = i;
    }

    private void zzC(int i) {
        this.zzGO = i;
    }

    private void zzb(float f) {
        if (this.zzGP != null) {
            try {
                this.zzGP.setVolume(f, f);
                return;
            } catch (IllegalStateException e) {
                return;
            }
        }
        zzb.zzaW("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
    }

    private void zzgd() {
        Throwable e;
        String valueOf;
        zzjw.v("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.zzGQ != null && surfaceTexture != null) {
            zzx(false);
            try {
                SurfaceTexture zzgS;
                this.zzGP = zzu.zzcx().zzgQ();
                this.zzGP.setOnBufferingUpdateListener(this);
                this.zzGP.setOnCompletionListener(this);
                this.zzGP.setOnErrorListener(this);
                this.zzGP.setOnInfoListener(this);
                this.zzGP.setOnPreparedListener(this);
                this.zzGP.setOnVideoSizeChangedListener(this);
                this.zzGT = 0;
                if (this.zzHa) {
                    this.zzGZ = new zzw(getContext());
                    this.zzGZ.zza(surfaceTexture, getWidth(), getHeight());
                    this.zzGZ.start();
                    zzgS = this.zzGZ.zzgS();
                    if (zzgS == null) {
                        this.zzGZ.zzgR();
                        this.zzGZ = null;
                    }
                    this.zzGP.setDataSource(getContext(), this.zzGQ);
                    this.zzGP.setSurface(zzu.zzcy().zza(zzgS));
                    this.zzGP.setAudioStreamType(3);
                    this.zzGP.setScreenOnWhilePlaying(true);
                    this.zzGP.prepareAsync();
                    zzB(1);
                }
                zzgS = surfaceTexture;
                this.zzGP.setDataSource(getContext(), this.zzGQ);
                this.zzGP.setSurface(zzu.zzcy().zza(zzgS));
                this.zzGP.setAudioStreamType(3);
                this.zzGP.setScreenOnWhilePlaying(true);
                this.zzGP.prepareAsync();
                zzB(1);
            } catch (IOException e2) {
                e = e2;
                valueOf = String.valueOf(this.zzGQ);
                zzb.zzd(new StringBuilder(String.valueOf(valueOf).length() + 36).append("Failed to initialize MediaPlayer at ").append(valueOf).toString(), e);
                onError(this.zzGP, 1, 0);
            } catch (IllegalArgumentException e3) {
                e = e3;
                valueOf = String.valueOf(this.zzGQ);
                zzb.zzd(new StringBuilder(String.valueOf(valueOf).length() + 36).append("Failed to initialize MediaPlayer at ").append(valueOf).toString(), e);
                onError(this.zzGP, 1, 0);
            } catch (IllegalStateException e4) {
                e = e4;
                valueOf = String.valueOf(this.zzGQ);
                zzb.zzd(new StringBuilder(String.valueOf(valueOf).length() + 36).append("Failed to initialize MediaPlayer at ").append(valueOf).toString(), e);
                onError(this.zzGP, 1, 0);
            }
        }
    }

    private void zzge() {
        if (this.zzGM && zzgh() && this.zzGP.getCurrentPosition() > 0 && this.zzGO != 3) {
            zzjw.v("AdMediaPlayerView nudging MediaPlayer");
            zzb(0.0f);
            this.zzGP.start();
            int currentPosition = this.zzGP.getCurrentPosition();
            long currentTimeMillis = zzu.zzco().currentTimeMillis();
            while (zzgh() && this.zzGP.getCurrentPosition() == currentPosition) {
                if (zzu.zzco().currentTimeMillis() - currentTimeMillis > 250) {
                    break;
                }
            }
            this.zzGP.pause();
            zzgm();
        }
    }

    private void zzgf() {
        AudioManager zzgn = zzgn();
        if (zzgn != null && !this.zzGY) {
            if (zzgn.requestAudioFocus(this, 3, 2) == 1) {
                zzgk();
            } else {
                zzb.zzaW("AdMediaPlayerView audio focus request failed");
            }
        }
    }

    private void zzgg() {
        zzjw.v("AdMediaPlayerView abandon audio focus");
        AudioManager zzgn = zzgn();
        if (zzgn != null && this.zzGY) {
            if (zzgn.abandonAudioFocus(this) == 1) {
                this.zzGY = false;
            } else {
                zzb.zzaW("AdMediaPlayerView abandon audio focus failed");
            }
        }
    }

    private boolean zzgh() {
        return (this.zzGP == null || this.zzGN == -1 || this.zzGN == 0 || this.zzGN == 1) ? false : true;
    }

    private void zzgk() {
        zzjw.v("AdMediaPlayerView audio focus gained");
        this.zzGY = true;
        zzgm();
    }

    private void zzgl() {
        zzjw.v("AdMediaPlayerView audio focus lost");
        this.zzGY = false;
        zzgm();
    }

    private void zzgm() {
        if (this.zzGX || !this.zzGY) {
            zzb(0.0f);
        } else {
            zzb(this.zzGW);
        }
    }

    private AudioManager zzgn() {
        return (AudioManager) getContext().getSystemService("audio");
    }

    private void zzx(boolean z) {
        zzjw.v("AdMediaPlayerView release");
        if (this.zzGZ != null) {
            this.zzGZ.zzgR();
            this.zzGZ = null;
        }
        if (this.zzGP != null) {
            this.zzGP.reset();
            this.zzGP.release();
            this.zzGP = null;
            zzB(0);
            if (z) {
                this.zzGO = 0;
                zzC(0);
            }
            zzgg();
        }
    }

    public int getCurrentPosition() {
        return zzgh() ? this.zzGP.getCurrentPosition() : 0;
    }

    public int getDuration() {
        return zzgh() ? this.zzGP.getDuration() : -1;
    }

    public int getVideoHeight() {
        return this.zzGP != null ? this.zzGP.getVideoHeight() : 0;
    }

    public int getVideoWidth() {
        return this.zzGP != null ? this.zzGP.getVideoWidth() : 0;
    }

    public void onAudioFocusChange(int i) {
        if (i > 0) {
            zzgk();
        } else if (i < 0) {
            zzgl();
        }
    }

    public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        this.zzGT = i;
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        zzjw.v("AdMediaPlayerView completion");
        zzB(5);
        zzC(5);
        zzka.zzQu.post(new Runnable(this) {
            final /* synthetic */ zzc a;

            {
                this.a = r1;
            }

            public void run() {
                if (this.a.zzHc != null) {
                    this.a.zzHc.zzgF();
                }
            }
        });
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        final String str = (String) zzGK.get(Integer.valueOf(i));
        final String str2 = (String) zzGK.get(Integer.valueOf(i2));
        zzb.zzaW(new StringBuilder((String.valueOf(str).length() + 38) + String.valueOf(str2).length()).append("AdMediaPlayerView MediaPlayer error: ").append(str).append(":").append(str2).toString());
        zzB(-1);
        zzC(-1);
        zzka.zzQu.post(new Runnable(this) {
            final /* synthetic */ zzc c;

            public void run() {
                if (this.c.zzHc != null) {
                    this.c.zzHc.zzj(str, str2);
                }
            }
        });
        return true;
    }

    public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        String str = (String) zzGK.get(Integer.valueOf(i));
        String str2 = (String) zzGK.get(Integer.valueOf(i2));
        zzjw.v(new StringBuilder((String.valueOf(str).length() + 37) + String.valueOf(str2).length()).append("AdMediaPlayerView MediaPlayer info: ").append(str).append(":").append(str2).toString());
        return true;
    }

    protected void onMeasure(int i, int i2) {
        int defaultSize = getDefaultSize(this.zzGR, i);
        int defaultSize2 = getDefaultSize(this.zzGS, i2);
        if (this.zzGR > 0 && this.zzGS > 0 && this.zzGZ == null) {
            int mode = MeasureSpec.getMode(i);
            int size = MeasureSpec.getSize(i);
            int mode2 = MeasureSpec.getMode(i2);
            defaultSize2 = MeasureSpec.getSize(i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                if (this.zzGR * defaultSize2 < this.zzGS * size) {
                    defaultSize = (this.zzGR * defaultSize2) / this.zzGS;
                } else if (this.zzGR * defaultSize2 > this.zzGS * size) {
                    defaultSize2 = (this.zzGS * size) / this.zzGR;
                    defaultSize = size;
                } else {
                    defaultSize = size;
                }
            } else if (mode == 1073741824) {
                defaultSize = (this.zzGS * size) / this.zzGR;
                if (mode2 != zzamj.UNSET_ENUM_VALUE || defaultSize <= defaultSize2) {
                    defaultSize2 = defaultSize;
                    defaultSize = size;
                } else {
                    defaultSize = size;
                }
            } else if (mode2 == 1073741824) {
                defaultSize = (this.zzGR * defaultSize2) / this.zzGS;
                if (mode == zzamj.UNSET_ENUM_VALUE && defaultSize > size) {
                    defaultSize = size;
                }
            } else {
                int i3 = this.zzGR;
                defaultSize = this.zzGS;
                if (mode2 != zzamj.UNSET_ENUM_VALUE || defaultSize <= defaultSize2) {
                    defaultSize2 = defaultSize;
                    defaultSize = i3;
                } else {
                    defaultSize = (this.zzGR * defaultSize2) / this.zzGS;
                }
                if (mode == zzamj.UNSET_ENUM_VALUE && r1 > size) {
                    defaultSize2 = (this.zzGS * size) / this.zzGR;
                    defaultSize = size;
                }
            }
        }
        setMeasuredDimension(defaultSize, defaultSize2);
        if (this.zzGZ != null) {
            this.zzGZ.zzg(defaultSize, defaultSize2);
        }
        if (VERSION.SDK_INT == 16) {
            if ((this.zzGU > 0 && this.zzGU != defaultSize) || (this.zzGV > 0 && this.zzGV != defaultSize2)) {
                zzge();
            }
            this.zzGU = defaultSize;
            this.zzGV = defaultSize2;
        }
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        zzjw.v("AdMediaPlayerView prepared");
        zzB(2);
        this.zzGL.zzgD();
        zzka.zzQu.post(new Runnable(this) {
            final /* synthetic */ zzc a;

            {
                this.a = r1;
            }

            public void run() {
                if (this.a.zzHc != null) {
                    this.a.zzHc.zzgD();
                }
            }
        });
        this.zzGR = mediaPlayer.getVideoWidth();
        this.zzGS = mediaPlayer.getVideoHeight();
        if (this.zzHb != 0) {
            seekTo(this.zzHb);
        }
        zzge();
        int i = this.zzGR;
        zzb.zzaV("AdMediaPlayerView stream dimensions: " + i + " x " + this.zzGS);
        if (this.zzGO == 3) {
            play();
        }
        zzgf();
        zzgm();
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        zzjw.v("AdMediaPlayerView surface created");
        zzgd();
        zzka.zzQu.post(new Runnable(this) {
            final /* synthetic */ zzc a;

            {
                this.a = r1;
            }

            public void run() {
                if (this.a.zzHc != null) {
                    this.a.zzHc.zzgC();
                }
            }
        });
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzjw.v("AdMediaPlayerView surface destroyed");
        if (this.zzGP != null && this.zzHb == 0) {
            this.zzHb = this.zzGP.getCurrentPosition();
        }
        if (this.zzGZ != null) {
            this.zzGZ.zzgR();
        }
        zzka.zzQu.post(new Runnable(this) {
            final /* synthetic */ zzc a;

            {
                this.a = r1;
            }

            public void run() {
                if (this.a.zzHc != null) {
                    this.a.zzHc.onPaused();
                    this.a.zzHc.zzgG();
                }
            }
        });
        zzx(true);
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        Object obj = 1;
        zzjw.v("AdMediaPlayerView surface changed");
        Object obj2 = this.zzGO == 3 ? 1 : null;
        if (!(this.zzGR == i && this.zzGS == i2)) {
            obj = null;
        }
        if (!(this.zzGP == null || obj2 == null || r1 == null)) {
            if (this.zzHb != 0) {
                seekTo(this.zzHb);
            }
            play();
        }
        if (this.zzGZ != null) {
            this.zzGZ.zzg(i, i2);
        }
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zzGL.zzb(this);
    }

    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        zzjw.v("AdMediaPlayerView size changed: " + i + " x " + i2);
        this.zzGR = mediaPlayer.getVideoWidth();
        this.zzGS = mediaPlayer.getVideoHeight();
        if (this.zzGR != 0 && this.zzGS != 0) {
            requestLayout();
        }
    }

    public void pause() {
        zzjw.v("AdMediaPlayerView pause");
        if (zzgh() && this.zzGP.isPlaying()) {
            this.zzGP.pause();
            zzB(4);
            zzka.zzQu.post(new Runnable(this) {
                final /* synthetic */ zzc a;

                {
                    this.a = r1;
                }

                public void run() {
                    if (this.a.zzHc != null) {
                        this.a.zzHc.onPaused();
                    }
                }
            });
        }
        zzC(4);
    }

    public void play() {
        zzjw.v("AdMediaPlayerView play");
        if (zzgh()) {
            this.zzGP.start();
            zzB(3);
            zzka.zzQu.post(new Runnable(this) {
                final /* synthetic */ zzc a;

                {
                    this.a = r1;
                }

                public void run() {
                    if (this.a.zzHc != null) {
                        this.a.zzHc.zzgE();
                    }
                }
            });
        }
        zzC(3);
    }

    public void seekTo(int i) {
        zzjw.v("AdMediaPlayerView seek " + i);
        if (zzgh()) {
            this.zzGP.seekTo(i);
            this.zzHb = 0;
            return;
        }
        this.zzHb = i;
    }

    public void setMimeType(String str) {
    }

    public void setVideoPath(String str) {
        setVideoURI(Uri.parse(str));
    }

    public void setVideoURI(Uri uri) {
        this.zzGQ = uri;
        this.zzHb = 0;
        zzgd();
        requestLayout();
        invalidate();
    }

    public void stop() {
        zzjw.v("AdMediaPlayerView stop");
        if (this.zzGP != null) {
            this.zzGP.stop();
            this.zzGP.release();
            this.zzGP = null;
            zzB(0);
            zzC(0);
            zzgg();
        }
        this.zzGL.onStop();
    }

    public String toString() {
        String valueOf = String.valueOf(getClass().getName());
        String valueOf2 = String.valueOf(Integer.toHexString(hashCode()));
        return new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(valueOf2).length()).append(valueOf).append("@").append(valueOf2).toString();
    }

    public void zza(float f) {
        this.zzGW = f;
        zzgm();
    }

    public void zza(float f, float f2) {
        if (this.zzGZ != null) {
            this.zzGZ.zzb(f, f2);
        }
    }

    public void zza(zzh com_google_android_gms_ads_internal_overlay_zzh) {
        this.zzHc = com_google_android_gms_ads_internal_overlay_zzh;
    }

    public String zzgc() {
        String str = "MediaPlayer";
        String valueOf = String.valueOf(this.zzHa ? " spherical" : "");
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }

    public void zzgi() {
        this.zzGX = true;
        zzgm();
    }

    public void zzgj() {
        this.zzGX = false;
        zzgm();
    }
}
