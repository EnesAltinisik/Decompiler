.class public Lcom/google/android/gms/vision/barcode/internal/client/zzd;
.super Ljava/lang/Object;


# instance fields
.field private final mContext:Landroid/content/Context;

.field private final zzbxD:Lcom/google/android/gms/vision/barcode/internal/client/BarcodeDetectorOptions;

.field private zzbxF:Lcom/google/android/gms/vision/barcode/internal/client/zzb;

.field private zzbxG:Z

.field private final zzpp:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/vision/barcode/internal/client/BarcodeDetectorOptions;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/vision/barcode/internal/client/zzd;->zzpp:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/vision/barcode/internal/client/zzd;->zzbxF:Lcom/google/android/gms/vision/barcode/internal/client/zzb;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/vision/barcode/internal/client/zzd;->zzbxG:Z

    iput-object p1, p0, Lcom/google/android/gms/vision/barcode/internal/client/zzd;->mContext:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/vision/barcode/internal/client/zzd;->zzbxD:Lcom/google/android/gms/vision/barcode/internal/client/BarcodeDetectorOptions;

    invoke-direct {p0}, Lcom/google/android/gms/vision/barcode/internal/client/zzd;->zzMX()Lcom/google/android/gms/vision/barcode/internal/client/zzb;

    return-void
.end method

.method private zzMX()Lcom/google/android/gms/vision/barcode/internal/client/zzb;
    .locals 4

    iget-object v1, p0, Lcom/google/android/gms/vision/barcode/internal/client/zzd;->zzpp:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/vision/barcode/internal/client/zzd;->zzbxF:Lcom/google/android/gms/vision/barcode/internal/client/zzb;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/vision/barcode/internal/client/zzd;->zzbxF:Lcom/google/android/gms/vision/barcode/internal/client/zzb;

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    return-object v0

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/vision/barcode/internal/client/zzd;->mContext:Landroid/content/Context;

    sget-object v2, Lcom/google/android/gms/internal/zzqi;->zzaCr:Lcom/google/android/gms/internal/zzqi$zzb;

    const-string v3, "com.google.android.gms.vision.dynamite"

    invoke-static {v0, v2, v3}, Lcom/google/android/gms/internal/zzqi;->zza(Landroid/content/Context;Lcom/google/android/gms/internal/zzqi$zzb;Ljava/lang/String;)Lcom/google/android/gms/internal/zzqi;

    move-result-object v0

    const-string v2, "com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator"

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/zzqi;->zzdM(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/vision/barcode/internal/client/zzc$zza;->zzen(Landroid/os/IBinder;)Lcom/google/android/gms/vision/barcode/internal/client/zzc;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/vision/barcode/internal/client/zzd;->mContext:Landroid/content/Context;

    invoke-static {v2}, Lcom/google/android/gms/dynamic/zze;->zzD(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/zzd;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/vision/barcode/internal/client/zzd;->zzbxD:Lcom/google/android/gms/vision/barcode/internal/client/BarcodeDetectorOptions;

    invoke-interface {v0, v2, v3}, Lcom/google/android/gms/vision/barcode/internal/client/zzc;->zza(Lcom/google/android/gms/dynamic/zzd;Lcom/google/android/gms/vision/barcode/internal/client/BarcodeDetectorOptions;)Lcom/google/android/gms/vision/barcode/internal/client/zzb;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/vision/barcode/internal/client/zzd;->zzbxF:Lcom/google/android/gms/vision/barcode/internal/client/zzb;
    :try_end_1
    .catch Lcom/google/android/gms/internal/zzqi$zza; {:try_start_1 .. :try_end_1} :catch_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    :try_start_2
    iget-boolean v0, p0, Lcom/google/android/gms/vision/barcode/internal/client/zzd;->zzbxG:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/vision/barcode/internal/client/zzd;->zzbxF:Lcom/google/android/gms/vision/barcode/internal/client/zzb;

    if-nez v0, :cond_2

    const-string v0, "NativeBarcodeDetectorHandle"

    const-string v2, "Native barcode detector not yet available.  Reverting to no-op detection."

    invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/vision/barcode/internal/client/zzd;->zzbxG:Z

    :cond_1
    :goto_2
    iget-object v0, p0, Lcom/google/android/gms/vision/barcode/internal/client/zzd;->zzbxF:Lcom/google/android/gms/vision/barcode/internal/client/zzb;

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :catch_0
    move-exception v0

    :goto_3
    :try_start_3
    const-string v2, "NativeBarcodeDetectorHandle"

    const-string v3, "Error creating remote native barcode detector"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1

    :cond_2
    iget-boolean v0, p0, Lcom/google/android/gms/vision/barcode/internal/client/zzd;->zzbxG:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/vision/barcode/internal/client/zzd;->zzbxF:Lcom/google/android/gms/vision/barcode/internal/client/zzb;

    if-eqz v0, :cond_1

    const-string v0, "NativeBarcodeDetectorHandle"

    const-string v2, "Native barcode detector is now available."

    invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_2

    :catch_1
    move-exception v0

    goto :goto_3
.end method


# virtual methods
.method public isOperational()Z
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/vision/barcode/internal/client/zzd;->zzMX()Lcom/google/android/gms/vision/barcode/internal/client/zzb;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public zzMW()V
    .locals 4

    iget-object v1, p0, Lcom/google/android/gms/vision/barcode/internal/client/zzd;->zzpp:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/vision/barcode/internal/client/zzd;->zzbxF:Lcom/google/android/gms/vision/barcode/internal/client/zzb;

    if-nez v0, :cond_0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/vision/barcode/internal/client/zzd;->zzbxF:Lcom/google/android/gms/vision/barcode/internal/client/zzb;

    invoke-interface {v0}, Lcom/google/android/gms/vision/barcode/internal/client/zzb;->zzMW()V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    :try_start_2
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :catch_0
    move-exception v0

    :try_start_3
    const-string v2, "NativeBarcodeDetectorHandle"

    const-string v3, "Could not finalize native barcode detector"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_1
.end method

.method public zza(Landroid/graphics/Bitmap;Lcom/google/android/gms/vision/internal/client/FrameMetadataParcel;)[Lcom/google/android/gms/vision/barcode/Barcode;
    .locals 4

    const/4 v3, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/vision/barcode/internal/client/zzd;->isOperational()Z

    move-result v0

    if-nez v0, :cond_0

    new-array v0, v3, [Lcom/google/android/gms/vision/barcode/Barcode;

    :goto_0
    return-object v0

    :cond_0
    :try_start_0
    invoke-static {p1}, Lcom/google/android/gms/dynamic/zze;->zzD(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/zzd;

    move-result-object v0

    invoke-direct {p0}, Lcom/google/android/gms/vision/barcode/internal/client/zzd;->zzMX()Lcom/google/android/gms/vision/barcode/internal/client/zzb;

    move-result-object v1

    invoke-interface {v1, v0, p2}, Lcom/google/android/gms/vision/barcode/internal/client/zzb;->zzb(Lcom/google/android/gms/dynamic/zzd;Lcom/google/android/gms/vision/internal/client/FrameMetadataParcel;)[Lcom/google/android/gms/vision/barcode/Barcode;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "NativeBarcodeDetectorHandle"

    const-string v2, "Error calling native barcode detector"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    new-array v0, v3, [Lcom/google/android/gms/vision/barcode/Barcode;

    goto :goto_0
.end method

.method public zza(Ljava/nio/ByteBuffer;Lcom/google/android/gms/vision/internal/client/FrameMetadataParcel;)[Lcom/google/android/gms/vision/barcode/Barcode;
    .locals 4

    const/4 v3, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/vision/barcode/internal/client/zzd;->isOperational()Z

    move-result v0

    if-nez v0, :cond_0

    new-array v0, v3, [Lcom/google/android/gms/vision/barcode/Barcode;

    :goto_0
    return-object v0

    :cond_0
    :try_start_0
    invoke-static {p1}, Lcom/google/android/gms/dynamic/zze;->zzD(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/zzd;

    move-result-object v0

    invoke-direct {p0}, Lcom/google/android/gms/vision/barcode/internal/client/zzd;->zzMX()Lcom/google/android/gms/vision/barcode/internal/client/zzb;

    move-result-object v1

    invoke-interface {v1, v0, p2}, Lcom/google/android/gms/vision/barcode/internal/client/zzb;->zza(Lcom/google/android/gms/dynamic/zzd;Lcom/google/android/gms/vision/internal/client/FrameMetadataParcel;)[Lcom/google/android/gms/vision/barcode/Barcode;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "NativeBarcodeDetectorHandle"

    const-string v2, "Error calling native barcode detector"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    new-array v0, v3, [Lcom/google/android/gms/vision/barcode/Barcode;

    goto :goto_0
.end method
