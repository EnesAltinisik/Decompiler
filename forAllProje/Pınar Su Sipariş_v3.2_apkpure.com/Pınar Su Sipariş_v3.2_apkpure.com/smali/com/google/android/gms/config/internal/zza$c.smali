.class abstract Lcom/google/android/gms/config/internal/zza$c;
.super Lcom/google/android/gms/config/internal/zza$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/config/internal/zza;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/config/internal/zza$b",
        "<",
        "Lcom/google/android/gms/internal/zzpy$zzb;",
        ">;"
    }
.end annotation


# instance fields
.field protected c:Lcom/google/android/gms/config/internal/zzg;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/google/android/gms/config/internal/zza$b;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

    new-instance v0, Lcom/google/android/gms/config/internal/zza$c$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/config/internal/zza$c$1;-><init>(Lcom/google/android/gms/config/internal/zza$c;)V

    iput-object v0, p0, Lcom/google/android/gms/config/internal/zza$c;->c:Lcom/google/android/gms/config/internal/zzg;

    return-void
.end method
