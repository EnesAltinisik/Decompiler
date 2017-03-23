.class public final Lcom/google/android/gms/nearby/internal/connection/SendMessageParams;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/nearby/internal/connection/SendMessageParams;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final versionCode:I

.field private final zzbiG:[Ljava/lang/String;

.field private final zzbid:[B

.field private final zzbie:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/nearby/internal/connection/zzm;

    invoke-direct {v0}, Lcom/google/android/gms/nearby/internal/connection/zzm;-><init>()V

    sput-object v0, Lcom/google/android/gms/nearby/internal/connection/SendMessageParams;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(I[Ljava/lang/String;[BJ)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/nearby/internal/connection/SendMessageParams;->versionCode:I

    iput-object p2, p0, Lcom/google/android/gms/nearby/internal/connection/SendMessageParams;->zzbiG:[Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/nearby/internal/connection/SendMessageParams;->zzbid:[B

    iput-wide p4, p0, Lcom/google/android/gms/nearby/internal/connection/SendMessageParams;->zzbie:J

    return-void
.end method


# virtual methods
.method public getPayload()[B
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/internal/connection/SendMessageParams;->zzbid:[B

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/nearby/internal/connection/zzm;->zza(Lcom/google/android/gms/nearby/internal/connection/SendMessageParams;Landroid/os/Parcel;I)V

    return-void
.end method

.method public zzHA()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/nearby/internal/connection/SendMessageParams;->zzbie:J

    return-wide v0
.end method

.method public zzHF()[Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/internal/connection/SendMessageParams;->zzbiG:[Ljava/lang/String;

    return-object v0
.end method
