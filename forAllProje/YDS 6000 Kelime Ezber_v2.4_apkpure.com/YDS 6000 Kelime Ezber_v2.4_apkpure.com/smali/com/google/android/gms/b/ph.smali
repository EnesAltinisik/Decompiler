.class public Lcom/google/android/gms/b/ph;
.super Lcom/google/android/gms/common/internal/safeparcel/a;


# annotations
.annotation runtime Lcom/google/android/gms/b/vz;
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/b/ph;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:I

.field public final b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/b/pi;

    invoke-direct {v0}, Lcom/google/android/gms/b/pi;-><init>()V

    sput-object v0, Lcom/google/android/gms/b/ph;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(IZ)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/a;-><init>()V

    iput p1, p0, Lcom/google/android/gms/b/ph;->a:I

    iput-boolean p2, p0, Lcom/google/android/gms/b/ph;->b:Z

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/ads/k;)V
    .locals 2

    const/4 v0, 0x1

    invoke-virtual {p1}, Lcom/google/android/gms/ads/k;->a()Z

    move-result v1

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/b/ph;-><init>(IZ)V

    return-void
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/b/pi;->a(Lcom/google/android/gms/b/ph;Landroid/os/Parcel;I)V

    return-void
.end method
