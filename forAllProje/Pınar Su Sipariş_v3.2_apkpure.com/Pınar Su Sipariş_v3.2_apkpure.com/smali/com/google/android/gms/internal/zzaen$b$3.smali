.class Lcom/google/android/gms/internal/zzaen$b$3;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzaen$b;->onClose()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/zzaen$b;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzaen$b;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzaen$b$3;->a:Lcom/google/android/gms/internal/zzaen$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaen$b$3;->a:Lcom/google/android/gms/internal/zzaen$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzaen$b;->a:Lcom/google/android/gms/internal/zzaen;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzaen;->b(Lcom/google/android/gms/internal/zzaen;)Lcom/google/android/gms/internal/zzahf;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzahf;->zzTe()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaen$b$3;->a:Lcom/google/android/gms/internal/zzaen$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzaen$b;->a:Lcom/google/android/gms/internal/zzaen;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzaen;->b(Lcom/google/android/gms/internal/zzaen;)Lcom/google/android/gms/internal/zzahf;

    move-result-object v0

    const-string v1, "closed"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/zzahf;->zzh(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzaen$b$3;->a:Lcom/google/android/gms/internal/zzaen$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzaen$b;->a:Lcom/google/android/gms/internal/zzaen;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzaen;->e(Lcom/google/android/gms/internal/zzaen;)V

    return-void
.end method
