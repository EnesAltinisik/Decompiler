.class Lcom/google/android/gms/internal/zztn$b$1;
.super Lcom/google/android/gms/internal/zztj;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/zztn$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/zztn$b;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zztn$b;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zztn$b$1;->a:Lcom/google/android/gms/internal/zztn$b;

    invoke-direct {p0}, Lcom/google/android/gms/internal/zztj;-><init>()V

    return-void
.end method


# virtual methods
.method public zza(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/safetynet/AttestationData;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zztn$b$1;->a:Lcom/google/android/gms/internal/zztn$b;

    new-instance v1, Lcom/google/android/gms/internal/zztn$a;

    invoke-direct {v1, p1, p2}, Lcom/google/android/gms/internal/zztn$a;-><init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/safetynet/AttestationData;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zztn$b;->zzb(Lcom/google/android/gms/common/api/Result;)V

    return-void
.end method
