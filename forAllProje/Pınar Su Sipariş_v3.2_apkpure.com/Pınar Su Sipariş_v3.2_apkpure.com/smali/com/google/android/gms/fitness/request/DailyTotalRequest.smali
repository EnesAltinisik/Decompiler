.class public Lcom/google/android/gms/fitness/request/DailyTotalRequest;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/fitness/request/DailyTotalRequest;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final mVersionCode:I

.field private zzaCH:Lcom/google/android/gms/fitness/data/DataType;

.field private final zzaHr:Lcom/google/android/gms/internal/zzqz;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/fitness/request/zzc;

    invoke-direct {v0}, Lcom/google/android/gms/fitness/request/zzc;-><init>()V

    sput-object v0, Lcom/google/android/gms/fitness/request/DailyTotalRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILandroid/os/IBinder;Lcom/google/android/gms/fitness/data/DataType;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/fitness/request/DailyTotalRequest;->mVersionCode:I

    invoke-static {p2}, Lcom/google/android/gms/internal/zzqz$zza;->zzbJ(Landroid/os/IBinder;)Lcom/google/android/gms/internal/zzqz;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/fitness/request/DailyTotalRequest;->zzaHr:Lcom/google/android/gms/internal/zzqz;

    iput-object p3, p0, Lcom/google/android/gms/fitness/request/DailyTotalRequest;->zzaCH:Lcom/google/android/gms/fitness/data/DataType;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/zzqz;Lcom/google/android/gms/fitness/data/DataType;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    const/4 v0, 0x2

    iput v0, p0, Lcom/google/android/gms/fitness/request/DailyTotalRequest;->mVersionCode:I

    iput-object p1, p0, Lcom/google/android/gms/fitness/request/DailyTotalRequest;->zzaHr:Lcom/google/android/gms/internal/zzqz;

    iput-object p2, p0, Lcom/google/android/gms/fitness/request/DailyTotalRequest;->zzaCH:Lcom/google/android/gms/fitness/data/DataType;

    return-void
.end method


# virtual methods
.method public getCallbackBinder()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DailyTotalRequest;->zzaHr:Lcom/google/android/gms/internal/zzqz;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzqz;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    return-object v0
.end method

.method public getDataType()Lcom/google/android/gms/fitness/data/DataType;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DailyTotalRequest;->zzaCH:Lcom/google/android/gms/fitness/data/DataType;

    return-object v0
.end method

.method getVersionCode()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/fitness/request/DailyTotalRequest;->mVersionCode:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    const-string v0, "DailyTotalRequest{%s}"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/google/android/gms/fitness/request/DailyTotalRequest;->zzaCH:Lcom/google/android/gms/fitness/data/DataType;

    invoke-virtual {v3}, Lcom/google/android/gms/fitness/data/DataType;->zzxy()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/fitness/request/zzc;->zza(Lcom/google/android/gms/fitness/request/DailyTotalRequest;Landroid/os/Parcel;I)V

    return-void
.end method
