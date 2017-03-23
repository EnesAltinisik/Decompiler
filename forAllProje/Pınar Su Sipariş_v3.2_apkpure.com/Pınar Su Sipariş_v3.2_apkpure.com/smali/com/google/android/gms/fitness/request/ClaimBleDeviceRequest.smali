.class public Lcom/google/android/gms/fitness/request/ClaimBleDeviceRequest;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/fitness/request/ClaimBleDeviceRequest;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final mVersionCode:I

.field private final zzaHo:Ljava/lang/String;

.field private final zzaHp:Lcom/google/android/gms/fitness/data/BleDevice;

.field private final zzaHq:Lcom/google/android/gms/internal/zzrp;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/fitness/request/zzb;

    invoke-direct {v0}, Lcom/google/android/gms/fitness/request/zzb;-><init>()V

    sput-object v0, Lcom/google/android/gms/fitness/request/ClaimBleDeviceRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILjava/lang/String;Lcom/google/android/gms/fitness/data/BleDevice;Landroid/os/IBinder;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/fitness/request/ClaimBleDeviceRequest;->mVersionCode:I

    iput-object p2, p0, Lcom/google/android/gms/fitness/request/ClaimBleDeviceRequest;->zzaHo:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/fitness/request/ClaimBleDeviceRequest;->zzaHp:Lcom/google/android/gms/fitness/data/BleDevice;

    invoke-static {p4}, Lcom/google/android/gms/internal/zzrp$zza;->zzbZ(Landroid/os/IBinder;)Lcom/google/android/gms/internal/zzrp;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/fitness/request/ClaimBleDeviceRequest;->zzaHq:Lcom/google/android/gms/internal/zzrp;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/google/android/gms/fitness/data/BleDevice;Lcom/google/android/gms/internal/zzrp;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    const/4 v0, 0x4

    iput v0, p0, Lcom/google/android/gms/fitness/request/ClaimBleDeviceRequest;->mVersionCode:I

    iput-object p1, p0, Lcom/google/android/gms/fitness/request/ClaimBleDeviceRequest;->zzaHo:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/fitness/request/ClaimBleDeviceRequest;->zzaHp:Lcom/google/android/gms/fitness/data/BleDevice;

    iput-object p3, p0, Lcom/google/android/gms/fitness/request/ClaimBleDeviceRequest;->zzaHq:Lcom/google/android/gms/internal/zzrp;

    return-void
.end method


# virtual methods
.method public getCallbackBinder()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/ClaimBleDeviceRequest;->zzaHq:Lcom/google/android/gms/internal/zzrp;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/fitness/request/ClaimBleDeviceRequest;->zzaHq:Lcom/google/android/gms/internal/zzrp;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzrp;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0
.end method

.method public getDeviceAddress()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/ClaimBleDeviceRequest;->zzaHo:Ljava/lang/String;

    return-object v0
.end method

.method getVersionCode()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/fitness/request/ClaimBleDeviceRequest;->mVersionCode:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    const-string v0, "ClaimBleDeviceRequest{%s %s}"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/google/android/gms/fitness/request/ClaimBleDeviceRequest;->zzaHo:Ljava/lang/String;

    aput-object v3, v1, v2

    const/4 v2, 0x1

    iget-object v3, p0, Lcom/google/android/gms/fitness/request/ClaimBleDeviceRequest;->zzaHp:Lcom/google/android/gms/fitness/data/BleDevice;

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/fitness/request/zzb;->zza(Lcom/google/android/gms/fitness/request/ClaimBleDeviceRequest;Landroid/os/Parcel;I)V

    return-void
.end method

.method public zzxU()Lcom/google/android/gms/fitness/data/BleDevice;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/ClaimBleDeviceRequest;->zzaHp:Lcom/google/android/gms/fitness/data/BleDevice;

    return-object v0
.end method
