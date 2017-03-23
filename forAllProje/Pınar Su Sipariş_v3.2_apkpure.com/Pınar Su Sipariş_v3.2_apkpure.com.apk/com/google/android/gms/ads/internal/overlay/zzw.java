package com.google.android.gms.ads.internal.overlay;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.util.Log;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.cast.TextTrackStyle;
import com.google.android.gms.gcm.Task;
import com.google.android.gms.internal.zzcq;
import com.google.android.gms.internal.zzcu;
import com.google.android.gms.internal.zzig;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

@TargetApi(14)
@zzig
public class zzw extends Thread implements OnFrameAvailableListener, a {
    private static final float[] zzIk = new float[]{-1.0f, -1.0f, -1.0f, TextTrackStyle.DEFAULT_FONT_SCALE, -1.0f, -1.0f, -1.0f, TextTrackStyle.DEFAULT_FONT_SCALE, -1.0f, TextTrackStyle.DEFAULT_FONT_SCALE, TextTrackStyle.DEFAULT_FONT_SCALE, -1.0f};
    private final CountDownLatch zzIA;
    private final Object zzIB;
    private EGL10 zzIC;
    private EGLDisplay zzID;
    private EGLContext zzIE;
    private EGLSurface zzIF;
    private volatile boolean zzIG;
    private volatile boolean zzIH;
    private final float[] zzIg;
    private final a zzIl;
    private final float[] zzIm;
    private final float[] zzIn;
    private final float[] zzIo;
    private final float[] zzIp;
    private final float[] zzIq;
    private final float[] zzIr;
    private float zzIs;
    private float zzIt;
    private SurfaceTexture zzIu;
    private SurfaceTexture zzIv;
    private int zzIw;
    private int zzIx;
    private int zzIy;
    private FloatBuffer zzIz = ByteBuffer.allocateDirect(zzIk.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    private int zzpi;
    private int zzpj;

    zzw(Context context) {
        super("SphericalVideoProcessor");
        this.zzIz.put(zzIk).position(0);
        this.zzIg = new float[9];
        this.zzIm = new float[9];
        this.zzIn = new float[9];
        this.zzIo = new float[9];
        this.zzIp = new float[9];
        this.zzIq = new float[9];
        this.zzIr = new float[9];
        this.zzIs = Float.NaN;
        this.zzIl = new a(context);
        this.zzIl.a((a) this);
        this.zzIA = new CountDownLatch(1);
        this.zzIB = new Object();
    }

    private void zza(float[] fArr, float f) {
        fArr[0] = TextTrackStyle.DEFAULT_FONT_SCALE;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = (float) Math.cos((double) f);
        fArr[5] = (float) (-Math.sin((double) f));
        fArr[6] = 0.0f;
        fArr[7] = (float) Math.sin((double) f);
        fArr[8] = (float) Math.cos((double) f);
    }

    private void zza(float[] fArr, float[] fArr2, float[] fArr3) {
        fArr[0] = ((fArr2[0] * fArr3[0]) + (fArr2[1] * fArr3[3])) + (fArr2[2] * fArr3[6]);
        fArr[1] = ((fArr2[0] * fArr3[1]) + (fArr2[1] * fArr3[4])) + (fArr2[2] * fArr3[7]);
        fArr[2] = ((fArr2[0] * fArr3[2]) + (fArr2[1] * fArr3[5])) + (fArr2[2] * fArr3[8]);
        fArr[3] = ((fArr2[3] * fArr3[0]) + (fArr2[4] * fArr3[3])) + (fArr2[5] * fArr3[6]);
        fArr[4] = ((fArr2[3] * fArr3[1]) + (fArr2[4] * fArr3[4])) + (fArr2[5] * fArr3[7]);
        fArr[5] = ((fArr2[3] * fArr3[2]) + (fArr2[4] * fArr3[5])) + (fArr2[5] * fArr3[8]);
        fArr[6] = ((fArr2[6] * fArr3[0]) + (fArr2[7] * fArr3[3])) + (fArr2[8] * fArr3[6]);
        fArr[7] = ((fArr2[6] * fArr3[1]) + (fArr2[7] * fArr3[4])) + (fArr2[8] * fArr3[7]);
        fArr[8] = ((fArr2[6] * fArr3[2]) + (fArr2[7] * fArr3[5])) + (fArr2[8] * fArr3[8]);
    }

    private float[] zza(float[] fArr, float[] fArr2) {
        return new float[]{((fArr[0] * fArr2[0]) + (fArr[1] * fArr2[1])) + (fArr[2] * fArr2[2]), ((fArr[3] * fArr2[0]) + (fArr[4] * fArr2[1])) + (fArr[5] * fArr2[2]), ((fArr[6] * fArr2[0]) + (fArr[7] * fArr2[1])) + (fArr[8] * fArr2[2])};
    }

    private void zzaw(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            Log.e("SphericalVideoRenderer", new StringBuilder(String.valueOf(str).length() + 21).append(str).append(": glError ").append(glGetError).toString());
        }
    }

    private void zzb(float[] fArr, float f) {
        fArr[0] = (float) Math.cos((double) f);
        fArr[1] = (float) (-Math.sin((double) f));
        fArr[2] = 0.0f;
        fArr[3] = (float) Math.sin((double) f);
        fArr[4] = (float) Math.cos((double) f);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = TextTrackStyle.DEFAULT_FONT_SCALE;
    }

    private float zzc(float[] fArr) {
        float[] zza = zza(fArr, new float[]{0.0f, TextTrackStyle.DEFAULT_FONT_SCALE, 0.0f});
        return ((float) Math.atan2((double) zza[1], (double) zza[0])) - 1.5707964f;
    }

    private int zzc(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        zzaw("createShader");
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, str);
            zzaw("shaderSource");
            GLES20.glCompileShader(glCreateShader);
            zzaw("compileShader");
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            zzaw("getShaderiv");
            if (iArr[0] == 0) {
                Log.e("SphericalVideoRenderer", "Could not compile shader " + i + ":");
                Log.e("SphericalVideoRenderer", GLES20.glGetShaderInfoLog(glCreateShader));
                GLES20.glDeleteShader(glCreateShader);
                zzaw("deleteShader");
                return 0;
            }
        }
        return glCreateShader;
    }

    private void zzgU() {
        GLES20.glViewport(0, 0, this.zzpi, this.zzpj);
        zzaw("viewport");
        int glGetUniformLocation = GLES20.glGetUniformLocation(this.zzIw, "uFOVx");
        int glGetUniformLocation2 = GLES20.glGetUniformLocation(this.zzIw, "uFOVy");
        if (this.zzpi > this.zzpj) {
            GLES20.glUniform1f(glGetUniformLocation, 0.87266463f);
            GLES20.glUniform1f(glGetUniformLocation2, (((float) this.zzpj) * 0.87266463f) / ((float) this.zzpi));
            return;
        }
        GLES20.glUniform1f(glGetUniformLocation, (((float) this.zzpi) * 0.87266463f) / ((float) this.zzpj));
        GLES20.glUniform1f(glGetUniformLocation2, 0.87266463f);
    }

    private int zzgW() {
        int zzc = zzc(35633, zzgZ());
        if (zzc == 0) {
            return 0;
        }
        int zzc2 = zzc(35632, zzha());
        if (zzc2 == 0) {
            return 0;
        }
        int glCreateProgram = GLES20.glCreateProgram();
        zzaw("createProgram");
        if (glCreateProgram != 0) {
            GLES20.glAttachShader(glCreateProgram, zzc);
            zzaw("attachShader");
            GLES20.glAttachShader(glCreateProgram, zzc2);
            zzaw("attachShader");
            GLES20.glLinkProgram(glCreateProgram);
            zzaw("linkProgram");
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
            zzaw("getProgramiv");
            if (iArr[0] != 1) {
                Log.e("SphericalVideoRenderer", "Could not link program: ");
                Log.e("SphericalVideoRenderer", GLES20.glGetProgramInfoLog(glCreateProgram));
                GLES20.glDeleteProgram(glCreateProgram);
                zzaw("deleteProgram");
                return 0;
            }
            GLES20.glValidateProgram(glCreateProgram);
            zzaw("validateProgram");
        }
        return glCreateProgram;
    }

    private EGLConfig zzgY() {
        int[] iArr = new int[1];
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        return !this.zzIC.eglChooseConfig(this.zzID, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12325, 16, 12344}, eGLConfigArr, 1, iArr) ? null : iArr[0] > 0 ? eGLConfigArr[0] : null;
    }

    private String zzgZ() {
        zzcq com_google_android_gms_internal_zzcq = zzcu.zzyn;
        return !((String) com_google_android_gms_internal_zzcq.get()).equals(com_google_android_gms_internal_zzcq.zzeq()) ? (String) com_google_android_gms_internal_zzcq.get() : "attribute highp vec3 aPosition;varying vec3 pos;void main() {  gl_Position = vec4(aPosition, 1.0);  pos = aPosition;}";
    }

    private String zzha() {
        zzcq com_google_android_gms_internal_zzcq = zzcu.zzyo;
        return !((String) com_google_android_gms_internal_zzcq.get()).equals(com_google_android_gms_internal_zzcq.zzeq()) ? (String) com_google_android_gms_internal_zzcq.get() : "#extension GL_OES_EGL_image_external : require\n#define INV_PI 0.3183\nprecision highp float;varying vec3 pos;uniform samplerExternalOES uSplr;uniform mat3 uVMat;uniform float uFOVx;uniform float uFOVy;void main() {  vec3 ray = vec3(pos.x * tan(uFOVx), pos.y * tan(uFOVy), -1);  ray = (uVMat * ray).xyz;  ray = normalize(ray);  vec2 texCrd = vec2(    0.5 + atan(ray.x, - ray.z) * INV_PI * 0.5, acos(ray.y) * INV_PI);  gl_FragColor = vec4(texture2D(uSplr, texCrd).xyz, 1.0);}";
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.zzIy++;
        synchronized (this.zzIB) {
            this.zzIB.notifyAll();
        }
    }

    public void run() {
        boolean z = false;
        if (this.zzIv == null) {
            zzb.e("SphericalVideoProcessor started with no output texture.");
            this.zzIA.countDown();
            return;
        }
        boolean zzgX = zzgX();
        int zzgV = zzgV();
        if (this.zzIw != 0) {
            z = true;
        }
        if (zzgX && r0) {
            this.zzIu = new SurfaceTexture(zzgV);
            this.zzIu.setOnFrameAvailableListener(this);
            this.zzIA.countDown();
            this.zzIl.b();
            try {
                this.zzIG = true;
                while (!this.zzIH) {
                    zzgT();
                    if (this.zzIG) {
                        zzgU();
                        this.zzIG = false;
                    }
                    try {
                        synchronized (this.zzIB) {
                            if (!(this.zzIH || this.zzIG || this.zzIy != 0)) {
                                this.zzIB.wait();
                            }
                        }
                    } catch (InterruptedException e) {
                    }
                }
            } catch (IllegalStateException e2) {
                zzb.zzaW("SphericalVideoProcessor halted unexpectedly.");
            } catch (Throwable th) {
                zzb.zzb("SphericalVideoProcessor died.", th);
                zzu.zzcn().zzb(th, true);
            } finally {
                this.zzIl.c();
                this.zzIu.setOnFrameAvailableListener(null);
                this.zzIu = null;
                zzhb();
            }
        } else {
            String str = "EGL initialization failed: ";
            String valueOf = String.valueOf(GLUtils.getEGLErrorString(this.zzIC.eglGetError()));
            valueOf = valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
            zzb.e(valueOf);
            zzu.zzcn().zzb(new Throwable(valueOf), true);
            zzhb();
            this.zzIA.countDown();
        }
    }

    void zza(SurfaceTexture surfaceTexture, int i, int i2) {
        this.zzpi = i;
        this.zzpj = i2;
        this.zzIv = surfaceTexture;
    }

    void zzb(float f, float f2) {
        float f3;
        float f4;
        if (this.zzpi > this.zzpj) {
            f3 = (1.7453293f * f) / ((float) this.zzpi);
            f4 = (1.7453293f * f2) / ((float) this.zzpi);
        } else {
            f3 = (1.7453293f * f) / ((float) this.zzpj);
            f4 = (1.7453293f * f2) / ((float) this.zzpj);
        }
        this.zzIs -= f3;
        this.zzIt -= f4;
        if (this.zzIt < -1.5707964f) {
            this.zzIt = -1.5707964f;
        }
        if (this.zzIt > 1.5707964f) {
            this.zzIt = 1.5707964f;
        }
    }

    void zzg(int i, int i2) {
        synchronized (this.zzIB) {
            this.zzpi = i;
            this.zzpj = i2;
            this.zzIG = true;
            this.zzIB.notifyAll();
        }
    }

    void zzgR() {
        synchronized (this.zzIB) {
            this.zzIH = true;
            this.zzIv = null;
            this.zzIB.notifyAll();
        }
    }

    public SurfaceTexture zzgS() {
        if (this.zzIv == null) {
            return null;
        }
        try {
            this.zzIA.await();
        } catch (InterruptedException e) {
        }
        return this.zzIu;
    }

    void zzgT() {
        while (this.zzIy > 0) {
            this.zzIu.updateTexImage();
            this.zzIy--;
        }
        if (this.zzIl.b(this.zzIg)) {
            if (Float.isNaN(this.zzIs)) {
                this.zzIs = -zzc(this.zzIg);
            }
            zzb(this.zzIq, this.zzIs);
        } else {
            zza(this.zzIg, -1.5707964f);
            zzb(this.zzIq, 0.0f);
        }
        zza(this.zzIm, 1.5707964f);
        zza(this.zzIn, this.zzIq, this.zzIm);
        zza(this.zzIo, this.zzIg, this.zzIn);
        zza(this.zzIp, this.zzIt);
        zza(this.zzIr, this.zzIp, this.zzIo);
        GLES20.glUniformMatrix3fv(this.zzIx, 1, false, this.zzIr, 0);
        GLES20.glDrawArrays(5, 0, 4);
        zzaw("drawArrays");
        GLES20.glFinish();
        this.zzIC.eglSwapBuffers(this.zzID, this.zzIF);
    }

    int zzgV() {
        this.zzIw = zzgW();
        GLES20.glUseProgram(this.zzIw);
        zzaw("useProgram");
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.zzIw, "aPosition");
        GLES20.glVertexAttribPointer(glGetAttribLocation, 3, 5126, false, 12, this.zzIz);
        zzaw("vertexAttribPointer");
        GLES20.glEnableVertexAttribArray(glGetAttribLocation);
        zzaw("enableVertexAttribArray");
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        zzaw("genTextures");
        glGetAttribLocation = iArr[0];
        GLES20.glBindTexture(36197, glGetAttribLocation);
        zzaw("bindTextures");
        GLES20.glTexParameteri(36197, Task.EXTRAS_LIMIT_BYTES, 9729);
        zzaw("texParameteri");
        GLES20.glTexParameteri(36197, 10241, 9729);
        zzaw("texParameteri");
        GLES20.glTexParameteri(36197, 10242, 33071);
        zzaw("texParameteri");
        GLES20.glTexParameteri(36197, 10243, 33071);
        zzaw("texParameteri");
        this.zzIx = GLES20.glGetUniformLocation(this.zzIw, "uVMat");
        GLES20.glUniformMatrix3fv(this.zzIx, 1, false, new float[]{TextTrackStyle.DEFAULT_FONT_SCALE, 0.0f, 0.0f, 0.0f, TextTrackStyle.DEFAULT_FONT_SCALE, 0.0f, 0.0f, 0.0f, TextTrackStyle.DEFAULT_FONT_SCALE}, 0);
        return glGetAttribLocation;
    }

    boolean zzgX() {
        this.zzIC = (EGL10) EGLContext.getEGL();
        this.zzID = this.zzIC.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        if (this.zzID == EGL10.EGL_NO_DISPLAY) {
            return false;
        }
        if (!this.zzIC.eglInitialize(this.zzID, new int[2])) {
            return false;
        }
        EGLConfig zzgY = zzgY();
        if (zzgY == null) {
            return false;
        }
        this.zzIE = this.zzIC.eglCreateContext(this.zzID, zzgY, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
        if (this.zzIE == null || this.zzIE == EGL10.EGL_NO_CONTEXT) {
            return false;
        }
        this.zzIF = this.zzIC.eglCreateWindowSurface(this.zzID, zzgY, this.zzIv, null);
        return (this.zzIF == null || this.zzIF == EGL10.EGL_NO_SURFACE) ? false : this.zzIC.eglMakeCurrent(this.zzID, this.zzIF, this.zzIF, this.zzIE);
    }

    public void zzgt() {
        synchronized (this.zzIB) {
            this.zzIB.notifyAll();
        }
    }

    boolean zzhb() {
        boolean z = false;
        if (!(this.zzIF == null || this.zzIF == EGL10.EGL_NO_SURFACE)) {
            z = (this.zzIC.eglMakeCurrent(this.zzID, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT) | 0) | this.zzIC.eglDestroySurface(this.zzID, this.zzIF);
            this.zzIF = null;
        }
        if (this.zzIE != null) {
            z |= this.zzIC.eglDestroyContext(this.zzID, this.zzIE);
            this.zzIE = null;
        }
        if (this.zzID == null) {
            return z;
        }
        z |= this.zzIC.eglTerminate(this.zzID);
        this.zzID = null;
        return z;
    }
}
