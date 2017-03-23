package com.google.android.gms.vision;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.ImageFormat;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.hardware.Camera.CameraInfo;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.PreviewCallback;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.WindowManager;
import com.google.android.gms.common.images.Size;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.nearby.messages.Strategy;
import java.io.IOException;
import java.lang.Thread.State;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CameraSource {
    @SuppressLint({"InlinedApi"})
    public static final int CAMERA_FACING_BACK = 0;
    @SuppressLint({"InlinedApi"})
    public static final int CAMERA_FACING_FRONT = 1;
    private Context mContext;
    private int zzGA;
    private final Object zzbwH;
    private Camera zzbwI;
    private int zzbwJ;
    private Size zzbwK;
    private float zzbwL;
    private int zzbwM;
    private int zzbwN;
    private boolean zzbwO;
    private SurfaceView zzbwP;
    private SurfaceTexture zzbwQ;
    private boolean zzbwR;
    private Thread zzbwS;
    private b zzbwT;
    private Map<byte[], ByteBuffer> zzbwU;

    public static class Builder {
        private final Detector<?> zzbwV;
        private CameraSource zzbwW = new CameraSource();

        public Builder(Context context, Detector<?> detector) {
            if (context == null) {
                throw new IllegalArgumentException("No context supplied.");
            } else if (detector == null) {
                throw new IllegalArgumentException("No detector supplied.");
            } else {
                this.zzbwV = detector;
                this.zzbwW.mContext = context;
            }
        }

        public CameraSource build() {
            CameraSource cameraSource = this.zzbwW;
            CameraSource cameraSource2 = this.zzbwW;
            cameraSource2.getClass();
            cameraSource.zzbwT = new b(cameraSource2, this.zzbwV);
            return this.zzbwW;
        }

        public Builder setAutoFocusEnabled(boolean z) {
            this.zzbwW.zzbwO = z;
            return this;
        }

        public Builder setFacing(int i) {
            if (i == 0 || i == 1) {
                this.zzbwW.zzbwJ = i;
                return this;
            }
            throw new IllegalArgumentException("Invalid camera: " + i);
        }

        public Builder setRequestedFps(float f) {
            if (f <= 0.0f) {
                throw new IllegalArgumentException("Invalid fps: " + f);
            }
            this.zzbwW.zzbwL = f;
            return this;
        }

        public Builder setRequestedPreviewSize(int i, int i2) {
            if (i <= 0 || i > 1000000 || i2 <= 0 || i2 > 1000000) {
                throw new IllegalArgumentException("Invalid preview size: " + i + "x" + i2);
            }
            this.zzbwW.zzbwM = i;
            this.zzbwW.zzbwN = i2;
            return this;
        }
    }

    public interface PictureCallback {
        void onPictureTaken(byte[] bArr);
    }

    public interface ShutterCallback {
        void onShutter();
    }

    private class a implements PreviewCallback {
        final /* synthetic */ CameraSource a;

        private a(CameraSource cameraSource) {
            this.a = cameraSource;
        }

        public void onPreviewFrame(byte[] bArr, Camera camera) {
            this.a.zzbwT.a(bArr, camera);
        }
    }

    private class b implements Runnable {
        static final /* synthetic */ boolean a = (!CameraSource.class.desiredAssertionStatus());
        final /* synthetic */ CameraSource b;
        private Detector<?> c;
        private long d = SystemClock.elapsedRealtime();
        private final Object e = new Object();
        private boolean f = true;
        private long g;
        private int h = 0;
        private ByteBuffer i;

        b(CameraSource cameraSource, Detector<?> detector) {
            this.b = cameraSource;
            this.c = detector;
        }

        @SuppressLint({"Assert"})
        void a() {
            if (a || this.b.zzbwS.getState() == State.TERMINATED) {
                this.c.release();
                this.c = null;
                return;
            }
            throw new AssertionError();
        }

        void a(boolean z) {
            synchronized (this.e) {
                this.f = z;
                this.e.notifyAll();
            }
        }

        void a(byte[] bArr, Camera camera) {
            synchronized (this.e) {
                if (this.i != null) {
                    camera.addCallbackBuffer(this.i.array());
                    this.i = null;
                }
                if (this.b.zzbwU.containsKey(bArr)) {
                    this.g = SystemClock.elapsedRealtime() - this.d;
                    this.h++;
                    this.i = (ByteBuffer) this.b.zzbwU.get(bArr);
                    this.e.notifyAll();
                    return;
                }
                Log.d("CameraSource", "Skipping frame. Could not find ByteBuffer associated with the image data from the camera.");
            }
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        @android.annotation.SuppressLint({"InlinedApi"})
        public void run() {
            /*
            r6 = this;
        L_0x0000:
            r1 = r6.e;
            monitor-enter(r1);
        L_0x0003:
            r0 = r6.f;	 Catch:{ all -> 0x0021 }
            if (r0 == 0) goto L_0x001b;
        L_0x0007:
            r0 = r6.i;	 Catch:{ all -> 0x0021 }
            if (r0 != 0) goto L_0x001b;
        L_0x000b:
            r0 = r6.e;	 Catch:{ InterruptedException -> 0x0011 }
            r0.wait();	 Catch:{ InterruptedException -> 0x0011 }
            goto L_0x0003;
        L_0x0011:
            r0 = move-exception;
            r2 = "CameraSource";
            r3 = "Frame processing loop terminated.";
            android.util.Log.d(r2, r3, r0);	 Catch:{ all -> 0x0021 }
            monitor-exit(r1);	 Catch:{ all -> 0x0021 }
        L_0x001a:
            return;
        L_0x001b:
            r0 = r6.f;	 Catch:{ all -> 0x0021 }
            if (r0 != 0) goto L_0x0024;
        L_0x001f:
            monitor-exit(r1);	 Catch:{ all -> 0x0021 }
            goto L_0x001a;
        L_0x0021:
            r0 = move-exception;
            monitor-exit(r1);	 Catch:{ all -> 0x0021 }
            throw r0;
        L_0x0024:
            r0 = new com.google.android.gms.vision.Frame$Builder;	 Catch:{ all -> 0x0021 }
            r0.<init>();	 Catch:{ all -> 0x0021 }
            r2 = r6.i;	 Catch:{ all -> 0x0021 }
            r3 = r6.b;	 Catch:{ all -> 0x0021 }
            r3 = r3.zzbwK;	 Catch:{ all -> 0x0021 }
            r3 = r3.getWidth();	 Catch:{ all -> 0x0021 }
            r4 = r6.b;	 Catch:{ all -> 0x0021 }
            r4 = r4.zzbwK;	 Catch:{ all -> 0x0021 }
            r4 = r4.getHeight();	 Catch:{ all -> 0x0021 }
            r5 = 17;
            r0 = r0.setImageData(r2, r3, r4, r5);	 Catch:{ all -> 0x0021 }
            r2 = r6.h;	 Catch:{ all -> 0x0021 }
            r0 = r0.setId(r2);	 Catch:{ all -> 0x0021 }
            r2 = r6.g;	 Catch:{ all -> 0x0021 }
            r0 = r0.setTimestampMillis(r2);	 Catch:{ all -> 0x0021 }
            r2 = r6.b;	 Catch:{ all -> 0x0021 }
            r2 = r2.zzGA;	 Catch:{ all -> 0x0021 }
            r0 = r0.setRotation(r2);	 Catch:{ all -> 0x0021 }
            r0 = r0.build();	 Catch:{ all -> 0x0021 }
            r2 = r6.i;	 Catch:{ all -> 0x0021 }
            r3 = 0;
            r6.i = r3;	 Catch:{ all -> 0x0021 }
            monitor-exit(r1);	 Catch:{ all -> 0x0021 }
            r1 = r6.c;	 Catch:{ Throwable -> 0x0078 }
            r1.receiveFrame(r0);	 Catch:{ Throwable -> 0x0078 }
            r0 = r6.b;
            r0 = r0.zzbwI;
            r1 = r2.array();
            r0.addCallbackBuffer(r1);
            goto L_0x0000;
        L_0x0078:
            r0 = move-exception;
            r1 = "CameraSource";
            r3 = "Exception thrown from receiver.";
            android.util.Log.e(r1, r3, r0);	 Catch:{ all -> 0x008f }
            r0 = r6.b;
            r0 = r0.zzbwI;
            r1 = r2.array();
            r0.addCallbackBuffer(r1);
            goto L_0x0000;
        L_0x008f:
            r0 = move-exception;
            r1 = r6.b;
            r1 = r1.zzbwI;
            r2 = r2.array();
            r1.addCallbackBuffer(r2);
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.vision.CameraSource.b.run():void");
        }
    }

    private class c implements android.hardware.Camera.PictureCallback {
        final /* synthetic */ CameraSource a;
        private PictureCallback b;

        private c(CameraSource cameraSource) {
            this.a = cameraSource;
        }

        public void onPictureTaken(byte[] bArr, Camera camera) {
            if (this.b != null) {
                this.b.onPictureTaken(bArr);
            }
            synchronized (this.a.zzbwH) {
                if (this.a.zzbwI != null) {
                    this.a.zzbwI.startPreview();
                }
            }
        }
    }

    private class d implements android.hardware.Camera.ShutterCallback {
        final /* synthetic */ CameraSource a;
        private ShutterCallback b;

        private d(CameraSource cameraSource) {
            this.a = cameraSource;
        }

        public void onShutter() {
            if (this.b != null) {
                this.b.onShutter();
            }
        }
    }

    static class e {
        private Size a;
        private Size b;

        public e(Camera.Size size, Camera.Size size2) {
            this.a = new Size(size.width, size.height);
            if (size2 != null) {
                this.b = new Size(size2.width, size2.height);
            }
        }

        public Size a() {
            return this.a;
        }

        public Size b() {
            return this.b;
        }
    }

    private CameraSource() {
        this.zzbwH = new Object();
        this.zzbwJ = 0;
        this.zzbwL = BitmapDescriptorFactory.HUE_ORANGE;
        this.zzbwM = 1024;
        this.zzbwN = 768;
        this.zzbwO = false;
        this.zzbwU = new HashMap();
    }

    @SuppressLint({"InlinedApi"})
    private Camera zzMR() {
        int zzld = zzld(this.zzbwJ);
        if (zzld == -1) {
            throw new RuntimeException("Could not find requested camera.");
        }
        Camera open = Camera.open(zzld);
        e zza = zza(open, this.zzbwM, this.zzbwN);
        if (zza == null) {
            throw new RuntimeException("Could not find suitable preview size.");
        }
        Size b = zza.b();
        this.zzbwK = zza.a();
        int[] zza2 = zza(open, this.zzbwL);
        if (zza2 == null) {
            throw new RuntimeException("Could not find suitable preview frames per second range.");
        }
        Parameters parameters = open.getParameters();
        if (b != null) {
            parameters.setPictureSize(b.getWidth(), b.getHeight());
        }
        parameters.setPreviewSize(this.zzbwK.getWidth(), this.zzbwK.getHeight());
        parameters.setPreviewFpsRange(zza2[0], zza2[1]);
        parameters.setPreviewFormat(17);
        zza(open, parameters, zzld);
        if (this.zzbwO) {
            if (parameters.getSupportedFocusModes().contains("continuous-video")) {
                parameters.setFocusMode("continuous-video");
            } else {
                Log.i("CameraSource", "Camera auto focus is not supported on this device.");
            }
        }
        open.setParameters(parameters);
        open.setPreviewCallbackWithBuffer(new a());
        open.addCallbackBuffer(zza(this.zzbwK));
        open.addCallbackBuffer(zza(this.zzbwK));
        open.addCallbackBuffer(zza(this.zzbwK));
        open.addCallbackBuffer(zza(this.zzbwK));
        return open;
    }

    static e zza(Camera camera, int i, int i2) {
        List<e> zza = zza(camera);
        e eVar = null;
        int i3 = Strategy.TTL_SECONDS_INFINITE;
        for (e eVar2 : zza) {
            e eVar3;
            int i4;
            Size a = eVar2.a();
            int abs = Math.abs(a.getHeight() - i2) + Math.abs(a.getWidth() - i);
            if (abs < i3) {
                int i5 = abs;
                eVar3 = eVar2;
                i4 = i5;
            } else {
                i4 = i3;
                eVar3 = eVar;
            }
            i3 = i4;
            eVar = eVar3;
        }
        return eVar;
    }

    static List<e> zza(Camera camera) {
        Parameters parameters = camera.getParameters();
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        List<Camera.Size> supportedPictureSizes = parameters.getSupportedPictureSizes();
        List<e> arrayList = new ArrayList();
        for (Camera.Size size : supportedPreviewSizes) {
            float f = ((float) size.width) / ((float) size.height);
            for (Camera.Size size2 : supportedPictureSizes) {
                if (Math.abs(f - (((float) size2.width) / ((float) size2.height))) < 0.01f) {
                    arrayList.add(new e(size, size2));
                    break;
                }
            }
        }
        if (arrayList.size() == 0) {
            Log.w("CameraSource", "No preview sizes have a corresponding same-aspect-ratio picture size");
            for (Camera.Size size3 : supportedPreviewSizes) {
                arrayList.add(new e(size3, null));
            }
        }
        return arrayList;
    }

    private void zza(Camera camera, Parameters parameters, int i) {
        int i2;
        int rotation = ((WindowManager) this.mContext.getSystemService("window")).getDefaultDisplay().getRotation();
        switch (rotation) {
            case 0:
                rotation = 0;
                break;
            case 1:
                rotation = 90;
                break;
            case 2:
                rotation = 180;
                break;
            case 3:
                rotation = 270;
                break;
            default:
                Log.e("CameraSource", "Bad rotation value: " + rotation);
                rotation = 0;
                break;
        }
        CameraInfo cameraInfo = new CameraInfo();
        Camera.getCameraInfo(i, cameraInfo);
        if (cameraInfo.facing == 1) {
            i2 = (rotation + cameraInfo.orientation) % 360;
            rotation = (360 - i2) % 360;
        } else {
            rotation = ((cameraInfo.orientation - rotation) + 360) % 360;
            i2 = rotation;
        }
        this.zzGA = i2 / 90;
        camera.setDisplayOrientation(rotation);
        parameters.setRotation(i2);
    }

    @SuppressLint({"InlinedApi"})
    private byte[] zza(Size size) {
        Object obj = new byte[(((int) Math.ceil(((double) ((long) (ImageFormat.getBitsPerPixel(17) * (size.getHeight() * size.getWidth())))) / 8.0d)) + 1)];
        ByteBuffer wrap = ByteBuffer.wrap(obj);
        if (wrap.hasArray() && wrap.array() == obj) {
            this.zzbwU.put(obj, wrap);
            return obj;
        }
        throw new IllegalStateException("Failed to create valid buffer for camera source.");
    }

    @SuppressLint({"InlinedApi"})
    static int[] zza(Camera camera, float f) {
        int i = (int) (1000.0f * f);
        int[] iArr = null;
        int i2 = Strategy.TTL_SECONDS_INFINITE;
        for (int[] iArr2 : camera.getParameters().getSupportedPreviewFpsRange()) {
            int[] iArr3;
            int i3;
            int abs = Math.abs(i - iArr2[0]) + Math.abs(i - iArr2[1]);
            if (abs < i2) {
                int i4 = abs;
                iArr3 = iArr2;
                i3 = i4;
            } else {
                i3 = i2;
                iArr3 = iArr;
            }
            i2 = i3;
            iArr = iArr3;
        }
        return iArr;
    }

    private static int zzld(int i) {
        CameraInfo cameraInfo = new CameraInfo();
        for (int i2 = 0; i2 < Camera.getNumberOfCameras(); i2++) {
            Camera.getCameraInfo(i2, cameraInfo);
            if (cameraInfo.facing == i) {
                return i2;
            }
        }
        return -1;
    }

    public int getCameraFacing() {
        return this.zzbwJ;
    }

    public Size getPreviewSize() {
        return this.zzbwK;
    }

    public void release() {
        synchronized (this.zzbwH) {
            stop();
            this.zzbwT.a();
        }
    }

    public CameraSource start() throws IOException {
        synchronized (this.zzbwH) {
            if (this.zzbwI != null) {
            } else {
                this.zzbwI = zzMR();
                if (VERSION.SDK_INT >= 11) {
                    this.zzbwQ = new SurfaceTexture(100);
                    this.zzbwI.setPreviewTexture(this.zzbwQ);
                    this.zzbwR = true;
                } else {
                    this.zzbwP = new SurfaceView(this.mContext);
                    this.zzbwI.setPreviewDisplay(this.zzbwP.getHolder());
                    this.zzbwR = false;
                }
                this.zzbwI.startPreview();
                this.zzbwS = new Thread(this.zzbwT);
                this.zzbwT.a(true);
                this.zzbwS.start();
            }
        }
        return this;
    }

    public CameraSource start(SurfaceHolder surfaceHolder) throws IOException {
        synchronized (this.zzbwH) {
            if (this.zzbwI != null) {
            } else {
                this.zzbwI = zzMR();
                this.zzbwI.setPreviewDisplay(surfaceHolder);
                this.zzbwI.startPreview();
                this.zzbwS = new Thread(this.zzbwT);
                this.zzbwT.a(true);
                this.zzbwS.start();
                this.zzbwR = false;
            }
        }
        return this;
    }

    public void stop() {
        synchronized (this.zzbwH) {
            this.zzbwT.a(false);
            if (this.zzbwS != null) {
                try {
                    this.zzbwS.join();
                } catch (InterruptedException e) {
                    Log.d("CameraSource", "Frame processing thread interrupted on release.");
                }
                this.zzbwS = null;
            }
            if (this.zzbwI != null) {
                this.zzbwI.stopPreview();
                this.zzbwI.setPreviewCallbackWithBuffer(null);
                try {
                    if (this.zzbwR) {
                        this.zzbwI.setPreviewTexture(null);
                    } else {
                        this.zzbwI.setPreviewDisplay(null);
                    }
                } catch (Exception e2) {
                    String valueOf = String.valueOf(e2);
                    Log.e("CameraSource", new StringBuilder(String.valueOf(valueOf).length() + 32).append("Failed to clear camera preview: ").append(valueOf).toString());
                }
                this.zzbwI.release();
                this.zzbwI = null;
            }
            this.zzbwU.clear();
        }
    }

    public void takePicture(ShutterCallback shutterCallback, PictureCallback pictureCallback) {
        synchronized (this.zzbwH) {
            if (this.zzbwI != null) {
                android.hardware.Camera.ShutterCallback dVar = new d();
                dVar.b = shutterCallback;
                android.hardware.Camera.PictureCallback cVar = new c();
                cVar.b = pictureCallback;
                this.zzbwI.takePicture(dVar, null, null, cVar);
            }
        }
    }
}
