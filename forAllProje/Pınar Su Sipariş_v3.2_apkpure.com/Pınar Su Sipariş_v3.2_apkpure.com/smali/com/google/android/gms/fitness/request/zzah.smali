.class public Lcom/google/android/gms/fitness/request/zzah;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/google/android/gms/fitness/request/UnsubscribeRequest;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static zza(Lcom/google/android/gms/fitness/request/UnsubscribeRequest;Landroid/os/Parcel;I)V
    .locals 4

    const/4 v3, 0x0

    invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/zzb;->zzar(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {p0}, Lcom/google/android/gms/fitness/request/UnsubscribeRequest;->getDataType()Lcom/google/android/gms/fitness/data/DataType;

    move-result-object v2

    invoke-static {p1, v1, v2, p2, v3}, Lcom/google/android/gms/common/internal/safeparcel/zzb;->zza(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 v1, 0x2

    invoke-virtual {p0}, Lcom/google/android/gms/fitness/request/UnsubscribeRequest;->getDataSource()Lcom/google/android/gms/fitness/data/DataSource;

    move-result-object v2

    invoke-static {p1, v1, v2, p2, v3}, Lcom/google/android/gms/common/internal/safeparcel/zzb;->zza(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 v1, 0x3

    invoke-virtual {p0}, Lcom/google/android/gms/fitness/request/UnsubscribeRequest;->getCallbackBinder()Landroid/os/IBinder;

    move-result-object v2

    invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/zzb;->zza(Landroid/os/Parcel;ILandroid/os/IBinder;Z)V

    const/16 v1, 0x3e8

    invoke-virtual {p0}, Lcom/google/android/gms/fitness/request/UnsubscribeRequest;->getVersionCode()I

    move-result v2

    invoke-static {p1, v1, v2}, Lcom/google/android/gms/common/internal/safeparcel/zzb;->zzc(Landroid/os/Parcel;II)V

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/zzb;->zzJ(Landroid/os/Parcel;I)V

    return-void
.end method


# virtual methods
.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/fitness/request/zzah;->zzdM(Landroid/os/Parcel;)Lcom/google/android/gms/fitness/request/UnsubscribeRequest;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/fitness/request/zzah;->zzgd(I)[Lcom/google/android/gms/fitness/request/UnsubscribeRequest;

    move-result-object v0

    return-object v0
.end method

.method public zzdM(Landroid/os/Parcel;)Lcom/google/android/gms/fitness/request/UnsubscribeRequest;
    .locals 8

    const/4 v1, 0x0

    invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/zza;->zzaq(Landroid/os/Parcel;)I

    move-result v5

    const/4 v4, 0x0

    move-object v2, v1

    move-object v3, v1

    :goto_0
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v0

    if-ge v0, v5, :cond_0

    invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/zza;->zzap(Landroid/os/Parcel;)I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/common/internal/safeparcel/zza;->zzcj(I)I

    move-result v6

    sparse-switch v6, :sswitch_data_0

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/zza;->zzb(Landroid/os/Parcel;I)V

    move-object v0, v1

    move-object v1, v2

    move-object v2, v3

    move v3, v4

    :goto_1
    move v4, v3

    move-object v3, v2

    move-object v2, v1

    move-object v1, v0

    goto :goto_0

    :sswitch_0
    sget-object v3, Lcom/google/android/gms/fitness/data/DataType;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p1, v0, v3}, Lcom/google/android/gms/common/internal/safeparcel/zza;->zza(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/fitness/data/DataType;

    move v3, v4

    move-object v7, v2

    move-object v2, v0

    move-object v0, v1

    move-object v1, v7

    goto :goto_1

    :sswitch_1
    sget-object v2, Lcom/google/android/gms/fitness/data/DataSource;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p1, v0, v2}, Lcom/google/android/gms/common/internal/safeparcel/zza;->zza(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/fitness/data/DataSource;

    move-object v2, v3

    move v3, v4

    move-object v7, v1

    move-object v1, v0

    move-object v0, v7

    goto :goto_1

    :sswitch_2
    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/zza;->zzr(Landroid/os/Parcel;I)Landroid/os/IBinder;

    move-result-object v0

    move-object v1, v2

    move-object v2, v3

    move v3, v4

    goto :goto_1

    :sswitch_3
    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/zza;->zzg(Landroid/os/Parcel;I)I

    move-result v0

    move-object v7, v1

    move-object v1, v2

    move-object v2, v3

    move v3, v0

    move-object v0, v7

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v0

    if-eq v0, v5, :cond_1

    new-instance v0, Lcom/google/android/gms/common/internal/safeparcel/zza$zza;

    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x25

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Overread allowed size end="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lcom/google/android/gms/common/internal/safeparcel/zza$zza;-><init>(Ljava/lang/String;Landroid/os/Parcel;)V

    throw v0

    :cond_1
    new-instance v0, Lcom/google/android/gms/fitness/request/UnsubscribeRequest;

    invoke-direct {v0, v4, v3, v2, v1}, Lcom/google/android/gms/fitness/request/UnsubscribeRequest;-><init>(ILcom/google/android/gms/fitness/data/DataType;Lcom/google/android/gms/fitness/data/DataSource;Landroid/os/IBinder;)V

    return-object v0

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
        0x3 -> :sswitch_2
        0x3e8 -> :sswitch_3
    .end sparse-switch
.end method

.method public zzgd(I)[Lcom/google/android/gms/fitness/request/UnsubscribeRequest;
    .locals 1

    new-array v0, p1, [Lcom/google/android/gms/fitness/request/UnsubscribeRequest;

    return-object v0
.end method
