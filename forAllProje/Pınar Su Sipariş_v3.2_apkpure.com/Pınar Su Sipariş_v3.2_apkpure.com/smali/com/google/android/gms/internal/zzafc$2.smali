.class Lcom/google/android/gms/internal/zzafc$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzafc;->zzb(Ljava/util/List;Lcom/google/android/gms/internal/zzafa;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/zzafc$a;

.field final synthetic b:Lcom/google/android/gms/internal/zzafc;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzafc;Lcom/google/android/gms/internal/zzafc$a;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzafc$2;->b:Lcom/google/android/gms/internal/zzafc;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzafc$2;->a:Lcom/google/android/gms/internal/zzafc$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc$2;->b:Lcom/google/android/gms/internal/zzafc;

    new-instance v1, Lcom/google/android/gms/internal/zzafp;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzafc$2;->b:Lcom/google/android/gms/internal/zzafc;

    iget-object v3, p0, Lcom/google/android/gms/internal/zzafc$2;->a:Lcom/google/android/gms/internal/zzafc$a;

    invoke-static {v3}, Lcom/google/android/gms/internal/zzafc$a;->j(Lcom/google/android/gms/internal/zzafc$a;)Lcom/google/firebase/database/ValueEventListener;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/gms/internal/zzafc$2;->a:Lcom/google/android/gms/internal/zzafc$a;

    invoke-static {v4}, Lcom/google/android/gms/internal/zzafc$a;->f(Lcom/google/android/gms/internal/zzafc$a;)Lcom/google/android/gms/internal/zzafa;

    move-result-object v4

    invoke-static {v4}, Lcom/google/android/gms/internal/zzagu;->zzN(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzagu;

    move-result-object v4

    invoke-direct {v1, v2, v3, v4}, Lcom/google/android/gms/internal/zzafp;-><init>(Lcom/google/android/gms/internal/zzafc;Lcom/google/firebase/database/ValueEventListener;Lcom/google/android/gms/internal/zzagu;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzafc;->zze(Lcom/google/android/gms/internal/zzaew;)V

    return-void
.end method
