.class public final Lcom/google/android/gms/nearby/internal/connection/StartAdvertisingParams;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/nearby/internal/connection/StartAdvertisingParams;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final durationMillis:J

.field private final name:Ljava/lang/String;

.field final versionCode:I

.field private final zzbhT:Lcom/google/android/gms/nearby/connection/Strategy;

.field private final zzbiH:Lcom/google/android/gms/nearby/connection/AppMetadata;

.field private final zzbib:Lcom/google/android/gms/nearby/internal/connection/zzi;

.field private final zzbie:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/nearby/internal/connection/zzn;

    invoke-direct {v0}, Lcom/google/android/gms/nearby/internal/connection/zzn;-><init>()V

    sput-object v0, Lcom/google/android/gms/nearby/internal/connection/StartAdvertisingParams;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILandroid/os/IBinder;Ljava/lang/String;Lcom/google/android/gms/nearby/connection/AppMetadata;JLcom/google/android/gms/nearby/connection/Strategy;J)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/nearby/internal/connection/StartAdvertisingParams;->versionCode:I

    invoke-static {p2}, Lcom/google/android/gms/nearby/internal/connection/zzi$zza;->zzdE(Landroid/os/IBinder;)Lcom/google/android/gms/nearby/internal/connection/zzi;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/nearby/internal/connection/StartAdvertisingParams;->zzbib:Lcom/google/android/gms/nearby/internal/connection/zzi;

    iput-object p3, p0, Lcom/google/android/gms/nearby/internal/connection/StartAdvertisingParams;->name:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/nearby/internal/connection/StartAdvertisingParams;->zzbiH:Lcom/google/android/gms/nearby/connection/AppMetadata;

    iput-wide p5, p0, Lcom/google/android/gms/nearby/internal/connection/StartAdvertisingParams;->durationMillis:J

    iput-object p7, p0, Lcom/google/android/gms/nearby/internal/connection/StartAdvertisingParams;->zzbhT:Lcom/google/android/gms/nearby/connection/Strategy;

    iput-wide p8, p0, Lcom/google/android/gms/nearby/internal/connection/StartAdvertisingParams;->zzbie:J

    return-void
.end method


# virtual methods
.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/internal/connection/StartAdvertisingParams;->name:Ljava/lang/String;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/nearby/internal/connection/zzn;->zza(Lcom/google/android/gms/nearby/internal/connection/StartAdvertisingParams;Landroid/os/Parcel;I)V

    return-void
.end method

.method public zzHA()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/nearby/internal/connection/StartAdvertisingParams;->zzbie:J

    return-wide v0
.end method

.method public zzHG()Lcom/google/android/gms/nearby/connection/AppMetadata;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/internal/connection/StartAdvertisingParams;->zzbiH:Lcom/google/android/gms/nearby/connection/AppMetadata;

    return-object v0
.end method

.method public zzHw()Lcom/google/android/gms/nearby/connection/Strategy;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/internal/connection/StartAdvertisingParams;->zzbhT:Lcom/google/android/gms/nearby/connection/Strategy;

    return-object v0
.end method

.method public zzHy()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/internal/connection/StartAdvertisingParams;->zzbib:Lcom/google/android/gms/nearby/internal/connection/zzi;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/nearby/internal/connection/StartAdvertisingParams;->zzbib:Lcom/google/android/gms/nearby/internal/connection/zzi;

    invoke-interface {v0}, Lcom/google/android/gms/nearby/internal/connection/zzi;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0
.end method

.method public zzuD()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/nearby/internal/connection/StartAdvertisingParams;->durationMillis:J

    return-wide v0
.end method
