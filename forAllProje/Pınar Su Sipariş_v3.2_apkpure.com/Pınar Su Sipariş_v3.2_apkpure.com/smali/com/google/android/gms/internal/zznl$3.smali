.class Lcom/google/android/gms/internal/zznl$3;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zznl;->zza(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/internal/zznl$a;)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/common/api/GoogleApiClient;

.field final synthetic b:Lcom/google/android/gms/internal/zznl$a;

.field final synthetic c:Lcom/google/android/gms/internal/zznl;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zznl;Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/internal/zznl$a;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zznl$3;->c:Lcom/google/android/gms/internal/zznl;

    iput-object p2, p0, Lcom/google/android/gms/internal/zznl$3;->a:Lcom/google/android/gms/common/api/GoogleApiClient;

    iput-object p3, p0, Lcom/google/android/gms/internal/zznl$3;->b:Lcom/google/android/gms/internal/zznl$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zznl$3;->a:Lcom/google/android/gms/common/api/GoogleApiClient;

    iget-object v1, p0, Lcom/google/android/gms/internal/zznl$3;->b:Lcom/google/android/gms/internal/zznl$a;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/GoogleApiClient;->zzc(Lcom/google/android/gms/internal/zznt$zza;)Lcom/google/android/gms/internal/zznt$zza;

    return-void
.end method
