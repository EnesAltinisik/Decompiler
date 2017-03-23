.class public Lcom/google/android/gms/nearby/messages/devices/NearbyDeviceFilter;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/nearby/messages/devices/NearbyDeviceFilter;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final mVersionCode:I

.field final zzbjw:I

.field final zzbjx:[B

.field final zzbjy:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/nearby/messages/devices/zzg;

    invoke-direct {v0}, Lcom/google/android/gms/nearby/messages/devices/zzg;-><init>()V

    sput-object v0, Lcom/google/android/gms/nearby/messages/devices/NearbyDeviceFilter;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(II[BZ)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/nearby/messages/devices/NearbyDeviceFilter;->mVersionCode:I

    iput p2, p0, Lcom/google/android/gms/nearby/messages/devices/NearbyDeviceFilter;->zzbjw:I

    iput-object p3, p0, Lcom/google/android/gms/nearby/messages/devices/NearbyDeviceFilter;->zzbjx:[B

    iput-boolean p4, p0, Lcom/google/android/gms/nearby/messages/devices/NearbyDeviceFilter;->zzbjy:Z

    return-void
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/nearby/messages/devices/zzg;->zza(Lcom/google/android/gms/nearby/messages/devices/NearbyDeviceFilter;Landroid/os/Parcel;I)V

    return-void
.end method
