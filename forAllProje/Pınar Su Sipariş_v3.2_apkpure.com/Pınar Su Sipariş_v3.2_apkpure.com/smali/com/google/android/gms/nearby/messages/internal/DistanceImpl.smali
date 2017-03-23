.class public Lcom/google/android/gms/nearby/messages/internal/DistanceImpl;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;

# interfaces
.implements Lcom/google/android/gms/nearby/messages/zzb;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/nearby/messages/internal/DistanceImpl;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final accuracy:I

.field final mVersionCode:I

.field public final zzbjH:D


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/nearby/messages/internal/zzc;

    invoke-direct {v0}, Lcom/google/android/gms/nearby/messages/internal/zzc;-><init>()V

    sput-object v0, Lcom/google/android/gms/nearby/messages/internal/DistanceImpl;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ID)V
    .locals 2

    const/4 v0, 0x1

    invoke-direct {p0, v0, p1, p2, p3}, Lcom/google/android/gms/nearby/messages/internal/DistanceImpl;-><init>(IID)V

    return-void
.end method

.method constructor <init>(IID)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/nearby/messages/internal/DistanceImpl;->mVersionCode:I

    iput p2, p0, Lcom/google/android/gms/nearby/messages/internal/DistanceImpl;->accuracy:I

    iput-wide p3, p0, Lcom/google/android/gms/nearby/messages/internal/DistanceImpl;->zzbjH:D

    return-void
.end method

.method private static zzjZ(I)Ljava/lang/String;
    .locals 1

    packed-switch p0, :pswitch_data_0

    const-string v0, "UNKNOWN"

    :goto_0
    return-object v0

    :pswitch_0
    const-string v0, "LOW"

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public synthetic compareTo(Ljava/lang/Object;)I
    .locals 1

    check-cast p1, Lcom/google/android/gms/nearby/messages/zzb;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/nearby/messages/internal/DistanceImpl;->zza(Lcom/google/android/gms/nearby/messages/zzb;)I

    move-result v0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p0, p1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    instance-of v2, p1, Lcom/google/android/gms/nearby/messages/internal/DistanceImpl;

    if-nez v2, :cond_2

    move v0, v1

    goto :goto_0

    :cond_2
    check-cast p1, Lcom/google/android/gms/nearby/messages/internal/DistanceImpl;

    invoke-virtual {p0}, Lcom/google/android/gms/nearby/messages/internal/DistanceImpl;->getAccuracy()I

    move-result v2

    invoke-virtual {p1}, Lcom/google/android/gms/nearby/messages/internal/DistanceImpl;->getAccuracy()I

    move-result v3

    if-ne v2, v3, :cond_3

    invoke-virtual {p0, p1}, Lcom/google/android/gms/nearby/messages/internal/DistanceImpl;->zza(Lcom/google/android/gms/nearby/messages/zzb;)I

    move-result v2

    if-eqz v2, :cond_0

    :cond_3
    move v0, v1

    goto :goto_0
.end method

.method public getAccuracy()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/nearby/messages/internal/DistanceImpl;->accuracy:I

    return v0
.end method

.method public hashCode()I
    .locals 4

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/nearby/messages/internal/DistanceImpl;->getAccuracy()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    invoke-virtual {p0}, Lcom/google/android/gms/nearby/messages/internal/DistanceImpl;->zzHK()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/zzz;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v1, "(%.1fm, %s)"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-wide v4, p0, Lcom/google/android/gms/nearby/messages/internal/DistanceImpl;->zzbjH:D

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    iget v4, p0, Lcom/google/android/gms/nearby/messages/internal/DistanceImpl;->accuracy:I

    invoke-static {v4}, Lcom/google/android/gms/nearby/messages/internal/DistanceImpl;->zzjZ(I)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/nearby/messages/internal/zzc;->zza(Lcom/google/android/gms/nearby/messages/internal/DistanceImpl;Landroid/os/Parcel;I)V

    return-void
.end method

.method public zzHK()D
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/nearby/messages/internal/DistanceImpl;->zzbjH:D

    return-wide v0
.end method

.method public zza(Lcom/google/android/gms/nearby/messages/zzb;)I
    .locals 4

    invoke-virtual {p0}, Lcom/google/android/gms/nearby/messages/internal/DistanceImpl;->zzHK()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lcom/google/android/gms/nearby/messages/zzb;->zzHK()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/nearby/messages/internal/DistanceImpl;->zzHK()D

    move-result-wide v0

    invoke-interface {p1}, Lcom/google/android/gms/nearby/messages/zzb;->zzHK()D

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Double;->compare(DD)I

    move-result v0

    goto :goto_0
.end method
