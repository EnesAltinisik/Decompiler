.class public final Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest$Builder;,
        Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest$Status;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final mVersionCode:I

.field status:I

.field zzbAe:Ljava/lang/String;

.field zzbyT:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/wallet/zzn;

    invoke-direct {v0}, Lcom/google/android/gms/wallet/zzn;-><init>()V

    sput-object v0, Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;->mVersionCode:I

    return-void
.end method

.method constructor <init>(ILjava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;->mVersionCode:I

    iput-object p2, p0, Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;->zzbyT:Ljava/lang/String;

    iput p3, p0, Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;->status:I

    iput-object p4, p0, Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;->zzbAe:Ljava/lang/String;

    return-void
.end method

.method public static newBuilder()Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest$Builder;
    .locals 3

    new-instance v0, Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest$Builder;

    new-instance v1, Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;

    invoke-direct {v1}, Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;-><init>()V

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest$Builder;-><init>(Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest$1;)V

    return-object v0
.end method


# virtual methods
.method public getDetailedReason()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;->zzbAe:Ljava/lang/String;

    return-object v0
.end method

.method public getGoogleTransactionId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;->zzbyT:Ljava/lang/String;

    return-object v0
.end method

.method public getStatus()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;->status:I

    return v0
.end method

.method public getVersionCode()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;->mVersionCode:I

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/wallet/zzn;->zza(Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;Landroid/os/Parcel;I)V

    return-void
.end method
