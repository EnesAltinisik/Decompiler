.class Lcom/google/android/gms/internal/zzaen$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzaen;->e()Ljava/lang/Runnable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/zzaen;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzaen;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzaen$2;->a:Lcom/google/android/gms/internal/zzaen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaen$2;->a:Lcom/google/android/gms/internal/zzaen;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzaen;->g(Lcom/google/android/gms/internal/zzaen;)Lcom/google/android/gms/internal/zzaen$a;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaen$2;->a:Lcom/google/android/gms/internal/zzaen;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzaen;->g(Lcom/google/android/gms/internal/zzaen;)Lcom/google/android/gms/internal/zzaen$a;

    move-result-object v0

    const-string v1, "0"

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/zzaen$a;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaen$2;->a:Lcom/google/android/gms/internal/zzaen;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzaen;->c(Lcom/google/android/gms/internal/zzaen;)V

    :cond_0
    return-void
.end method
