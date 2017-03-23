.class public Lcom/google/android/gms/vision/text/internal/client/RecognitionOptions;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Lcom/google/android/gms/vision/text/internal/client/zzf;


# instance fields
.field final versionCode:I

.field public final zzbyH:Landroid/graphics/Rect;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/vision/text/internal/client/zzf;

    invoke-direct {v0}, Lcom/google/android/gms/vision/text/internal/client/zzf;-><init>()V

    sput-object v0, Lcom/google/android/gms/vision/text/internal/client/RecognitionOptions;->CREATOR:Lcom/google/android/gms/vision/text/internal/client/zzf;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/vision/text/internal/client/RecognitionOptions;->versionCode:I

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/vision/text/internal/client/RecognitionOptions;->zzbyH:Landroid/graphics/Rect;

    return-void
.end method

.method public constructor <init>(ILandroid/graphics/Rect;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/vision/text/internal/client/RecognitionOptions;->versionCode:I

    iput-object p2, p0, Lcom/google/android/gms/vision/text/internal/client/RecognitionOptions;->zzbyH:Landroid/graphics/Rect;

    return-void
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/vision/text/internal/client/zzf;->zza(Lcom/google/android/gms/vision/text/internal/client/RecognitionOptions;Landroid/os/Parcel;I)V

    return-void
.end method
