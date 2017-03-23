.class public Lcom/google/android/gms/nearby/bootstrap/request/StartScanRequest;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Lcom/google/android/gms/nearby/bootstrap/request/zzg;


# instance fields
.field final versionCode:I

.field private final zzbhO:Lcom/google/android/gms/internal/zzsu;

.field private final zzbhR:B

.field private final zzbhS:Lcom/google/android/gms/internal/zzsw;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/nearby/bootstrap/request/zzg;

    invoke-direct {v0}, Lcom/google/android/gms/nearby/bootstrap/request/zzg;-><init>()V

    sput-object v0, Lcom/google/android/gms/nearby/bootstrap/request/StartScanRequest;->CREATOR:Lcom/google/android/gms/nearby/bootstrap/request/zzg;

    return-void
.end method

.method constructor <init>(IBLandroid/os/IBinder;Landroid/os/IBinder;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/nearby/bootstrap/request/StartScanRequest;->versionCode:I

    iput-byte p2, p0, Lcom/google/android/gms/nearby/bootstrap/request/StartScanRequest;->zzbhR:B

    invoke-static {p3}, Lcom/google/android/gms/common/internal/zzaa;->zzz(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, Lcom/google/android/gms/internal/zzsw$zza;->zzdC(Landroid/os/IBinder;)Lcom/google/android/gms/internal/zzsw;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/StartScanRequest;->zzbhS:Lcom/google/android/gms/internal/zzsw;

    invoke-static {p4}, Lcom/google/android/gms/common/internal/zzaa;->zzz(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p4}, Lcom/google/android/gms/internal/zzsu$zza;->zzdA(Landroid/os/IBinder;)Lcom/google/android/gms/internal/zzsu;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/StartScanRequest;->zzbhO:Lcom/google/android/gms/internal/zzsu;

    return-void
.end method


# virtual methods
.method public getCallbackBinder()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/StartScanRequest;->zzbhO:Lcom/google/android/gms/internal/zzsu;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/StartScanRequest;->zzbhO:Lcom/google/android/gms/internal/zzsu;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzsu;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/nearby/bootstrap/request/StartScanRequest;->CREATOR:Lcom/google/android/gms/nearby/bootstrap/request/zzg;

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/nearby/bootstrap/request/zzg;->zza(Lcom/google/android/gms/nearby/bootstrap/request/StartScanRequest;Landroid/os/Parcel;I)V

    return-void
.end method

.method public zzHs()B
    .locals 1

    iget-byte v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/StartScanRequest;->zzbhR:B

    return v0
.end method

.method public zzHv()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/StartScanRequest;->zzbhS:Lcom/google/android/gms/internal/zzsw;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/nearby/bootstrap/request/StartScanRequest;->zzbhS:Lcom/google/android/gms/internal/zzsw;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzsw;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0
.end method
