.class public Lcom/google/android/gms/drive/internal/FetchThumbnailRequest;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/drive/internal/FetchThumbnailRequest;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final mVersionCode:I

.field final zzawJ:Lcom/google/android/gms/drive/DriveId;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/drive/internal/zzaf;

    invoke-direct {v0}, Lcom/google/android/gms/drive/internal/zzaf;-><init>()V

    sput-object v0, Lcom/google/android/gms/drive/internal/FetchThumbnailRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILcom/google/android/gms/drive/DriveId;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/drive/internal/FetchThumbnailRequest;->mVersionCode:I

    iput-object p2, p0, Lcom/google/android/gms/drive/internal/FetchThumbnailRequest;->zzawJ:Lcom/google/android/gms/drive/DriveId;

    return-void
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/internal/zzaf;->zza(Lcom/google/android/gms/drive/internal/FetchThumbnailRequest;Landroid/os/Parcel;I)V

    return-void
.end method
