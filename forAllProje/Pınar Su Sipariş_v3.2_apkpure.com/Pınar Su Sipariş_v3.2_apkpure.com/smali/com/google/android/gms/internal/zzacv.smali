.class public final Lcom/google/android/gms/internal/zzacv;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/zzacv$zza;
    }
.end annotation


# static fields
.field public static final zzaaz:Lcom/google/android/gms/common/api/Api$zzf;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/Api$zzf",
            "<",
            "Lcom/google/android/gms/internal/zzaco;",
            ">;"
        }
    .end annotation
.end field

.field private static final zzbFy:Lcom/google/android/gms/common/api/Api$zza;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/Api$zza",
            "<",
            "Lcom/google/android/gms/internal/zzaco;",
            "Lcom/google/android/gms/internal/zzacv$zza;",
            ">;"
        }
    .end annotation
.end field

.field public static final zzbFz:Lcom/google/android/gms/common/api/Api;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/Api",
            "<",
            "Lcom/google/android/gms/internal/zzacv$zza;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/google/android/gms/common/api/Api$zzf;

    invoke-direct {v0}, Lcom/google/android/gms/common/api/Api$zzf;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/zzacv;->zzaaz:Lcom/google/android/gms/common/api/Api$zzf;

    new-instance v0, Lcom/google/android/gms/internal/zzacv$1;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzacv$1;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/zzacv;->zzbFy:Lcom/google/android/gms/common/api/Api$zza;

    new-instance v0, Lcom/google/android/gms/common/api/Api;

    const-string v1, "InternalFirebaseAuth.FIREBASE_AUTH_API"

    sget-object v2, Lcom/google/android/gms/internal/zzacv;->zzbFy:Lcom/google/android/gms/common/api/Api$zza;

    sget-object v3, Lcom/google/android/gms/internal/zzacv;->zzaaz:Lcom/google/android/gms/common/api/Api$zzf;

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/common/api/Api;-><init>(Ljava/lang/String;Lcom/google/android/gms/common/api/Api$zza;Lcom/google/android/gms/common/api/Api$zzf;)V

    sput-object v0, Lcom/google/android/gms/internal/zzacv;->zzbFz:Lcom/google/android/gms/common/api/Api;

    return-void
.end method

.method public static zza(Landroid/content/Context;Lcom/google/android/gms/internal/zzacv$zza;)Lcom/google/android/gms/internal/zzacn;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/zzacn;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/zzacn;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/zzacv$zza;)V

    return-object v0
.end method
