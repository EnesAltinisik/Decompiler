.class public Lcom/google/android/gms/config/internal/PackageConfigTable;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Lcom/google/android/gms/config/internal/zzi;


# instance fields
.field private final mVersionCode:I

.field private final zzauS:Landroid/os/Bundle;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/config/internal/zzi;

    invoke-direct {v0}, Lcom/google/android/gms/config/internal/zzi;-><init>()V

    sput-object v0, Lcom/google/android/gms/config/internal/PackageConfigTable;->CREATOR:Lcom/google/android/gms/config/internal/zzi;

    return-void
.end method

.method constructor <init>(ILandroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/config/internal/PackageConfigTable;->mVersionCode:I

    iput-object p2, p0, Lcom/google/android/gms/config/internal/PackageConfigTable;->zzauS:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public getVersionCode()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/config/internal/PackageConfigTable;->mVersionCode:I

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/config/internal/zzi;->zza(Lcom/google/android/gms/config/internal/PackageConfigTable;Landroid/os/Parcel;I)V

    return-void
.end method

.method public zzvC()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/config/internal/PackageConfigTable;->zzauS:Landroid/os/Bundle;

    return-object v0
.end method
