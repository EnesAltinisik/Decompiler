.class public abstract Lcom/google/android/gms/vision/text/internal/client/zzb$zza;
.super Landroid/os/Binder;

# interfaces
.implements Lcom/google/android/gms/vision/text/internal/client/zzb;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/vision/text/internal/client/zzb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "zza"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/vision/text/internal/client/zzb$zza$a;
    }
.end annotation


# direct methods
.method public static zzeq(Landroid/os/IBinder;)Lcom/google/android/gms/vision/text/internal/client/zzb;
    .locals 2

    if-nez p0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    const-string v0, "com.google.android.gms.vision.text.internal.client.INativeTextRecognizer"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    if-eqz v0, :cond_1

    instance-of v1, v0, Lcom/google/android/gms/vision/text/internal/client/zzb;

    if-eqz v1, :cond_1

    check-cast v0, Lcom/google/android/gms/vision/text/internal/client/zzb;

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/google/android/gms/vision/text/internal/client/zzb$zza$a;

    invoke-direct {v0, p0}, Lcom/google/android/gms/vision/text/internal/client/zzb$zza$a;-><init>(Landroid/os/IBinder;)V

    goto :goto_0
.end method


# virtual methods
.method public onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const/4 v1, 0x0

    const/4 v3, 0x1

    sparse-switch p1, :sswitch_data_0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v0

    :goto_0
    return v0

    :sswitch_0
    const-string v0, "com.google.android.gms.vision.text.internal.client.INativeTextRecognizer"

    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    move v0, v3

    goto :goto_0

    :sswitch_1
    const-string v0, "com.google.android.gms.vision.text.internal.client.INativeTextRecognizer"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/dynamic/zzd$zza;->zzbz(Landroid/os/IBinder;)Lcom/google/android/gms/dynamic/zzd;

    move-result-object v2

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/android/gms/vision/internal/client/FrameMetadataParcel;->CREATOR:Lcom/google/android/gms/vision/internal/client/zza;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/vision/internal/client/zza;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/vision/internal/client/FrameMetadataParcel;

    :goto_1
    invoke-virtual {p0, v2, v0}, Lcom/google/android/gms/vision/text/internal/client/zzb$zza;->zzd(Lcom/google/android/gms/dynamic/zzd;Lcom/google/android/gms/vision/internal/client/FrameMetadataParcel;)[Lcom/google/android/gms/vision/text/internal/client/LineBoxParcel;

    move-result-object v0

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-virtual {p3, v0, v3}, Landroid/os/Parcel;->writeTypedArray([Landroid/os/Parcelable;I)V

    move v0, v3

    goto :goto_0

    :cond_0
    move-object v0, v1

    goto :goto_1

    :sswitch_2
    const-string v0, "com.google.android.gms.vision.text.internal.client.INativeTextRecognizer"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/dynamic/zzd$zza;->zzbz(Landroid/os/IBinder;)Lcom/google/android/gms/dynamic/zzd;

    move-result-object v4

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/google/android/gms/vision/internal/client/FrameMetadataParcel;->CREATOR:Lcom/google/android/gms/vision/internal/client/zza;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/vision/internal/client/zza;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/vision/internal/client/FrameMetadataParcel;

    move-object v2, v0

    :goto_2
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lcom/google/android/gms/vision/text/internal/client/RecognitionOptions;->CREATOR:Lcom/google/android/gms/vision/text/internal/client/zzf;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/vision/text/internal/client/zzf;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/vision/text/internal/client/RecognitionOptions;

    :goto_3
    invoke-virtual {p0, v4, v2, v0}, Lcom/google/android/gms/vision/text/internal/client/zzb$zza;->zza(Lcom/google/android/gms/dynamic/zzd;Lcom/google/android/gms/vision/internal/client/FrameMetadataParcel;Lcom/google/android/gms/vision/text/internal/client/RecognitionOptions;)[Lcom/google/android/gms/vision/text/internal/client/LineBoxParcel;

    move-result-object v0

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-virtual {p3, v0, v3}, Landroid/os/Parcel;->writeTypedArray([Landroid/os/Parcelable;I)V

    move v0, v3

    goto :goto_0

    :cond_1
    move-object v2, v1

    goto :goto_2

    :cond_2
    move-object v0, v1

    goto :goto_3

    :sswitch_3
    const-string v0, "com.google.android.gms.vision.text.internal.client.INativeTextRecognizer"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/gms/vision/text/internal/client/zzb$zza;->zzNc()V

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    move v0, v3

    goto :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_1
        0x2 -> :sswitch_3
        0x3 -> :sswitch_2
        0x5f4e5446 -> :sswitch_0
    .end sparse-switch
.end method
