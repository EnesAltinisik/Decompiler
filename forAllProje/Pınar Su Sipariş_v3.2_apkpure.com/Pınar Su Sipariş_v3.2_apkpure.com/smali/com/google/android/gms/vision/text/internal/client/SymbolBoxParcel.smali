.class public Lcom/google/android/gms/vision/text/internal/client/SymbolBoxParcel;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Lcom/google/android/gms/vision/text/internal/client/zzg;


# instance fields
.field public final versionCode:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/vision/text/internal/client/zzg;

    invoke-direct {v0}, Lcom/google/android/gms/vision/text/internal/client/zzg;-><init>()V

    sput-object v0, Lcom/google/android/gms/vision/text/internal/client/SymbolBoxParcel;->CREATOR:Lcom/google/android/gms/vision/text/internal/client/zzg;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/vision/text/internal/client/SymbolBoxParcel;->versionCode:I

    return-void
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/vision/text/internal/client/zzg;->zza(Lcom/google/android/gms/vision/text/internal/client/SymbolBoxParcel;Landroid/os/Parcel;I)V

    return-void
.end method
