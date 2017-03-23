.class Lcom/google/android/gms/internal/zzaen$b$4;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzaen$b;->zza(Lcom/google/android/gms/internal/zzaig;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/zzaig;

.field final synthetic b:Lcom/google/android/gms/internal/zzaen$b;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzaen$b;Lcom/google/android/gms/internal/zzaig;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzaen$b$4;->b:Lcom/google/android/gms/internal/zzaen$b;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzaen$b$4;->a:Lcom/google/android/gms/internal/zzaig;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    const/4 v4, 0x0

    const-string v0, "had an error"

    iget-object v1, p0, Lcom/google/android/gms/internal/zzaen$b$4;->b:Lcom/google/android/gms/internal/zzaen$b;

    iget-object v1, v1, Lcom/google/android/gms/internal/zzaen$b;->a:Lcom/google/android/gms/internal/zzaen;

    invoke-static {v1}, Lcom/google/android/gms/internal/zzaen;->b(Lcom/google/android/gms/internal/zzaen;)Lcom/google/android/gms/internal/zzahf;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzahf;->zzTe()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzaen$b$4;->b:Lcom/google/android/gms/internal/zzaen$b;

    iget-object v1, v1, Lcom/google/android/gms/internal/zzaen$b;->a:Lcom/google/android/gms/internal/zzaen;

    invoke-static {v1}, Lcom/google/android/gms/internal/zzaen;->b(Lcom/google/android/gms/internal/zzaen;)Lcom/google/android/gms/internal/zzahf;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/zzaen$b$4;->a:Lcom/google/android/gms/internal/zzaig;

    new-array v3, v4, [Ljava/lang/Object;

    invoke-virtual {v1, v0, v2, v3}, Lcom/google/android/gms/internal/zzahf;->zza(Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzaen$b$4;->a:Lcom/google/android/gms/internal/zzaig;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaig;->getMessage()Ljava/lang/String;

    move-result-object v0

    const-string v1, "unknown host"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaen$b$4;->b:Lcom/google/android/gms/internal/zzaen$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzaen$b;->a:Lcom/google/android/gms/internal/zzaen;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzaen;->b(Lcom/google/android/gms/internal/zzaen;)Lcom/google/android/gms/internal/zzahf;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzahf;->zzTe()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaen$b$4;->b:Lcom/google/android/gms/internal/zzaen$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzaen$b;->a:Lcom/google/android/gms/internal/zzaen;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzaen;->b(Lcom/google/android/gms/internal/zzaen;)Lcom/google/android/gms/internal/zzahf;

    move-result-object v0

    const-string v1, "If you are running on Android, have you added <uses-permission android:name=\"android.permission.INTERNET\" /> under <manifest> in AndroidManifest.xml?"

    new-array v2, v4, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/zzahf;->zzh(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzaen$b$4;->b:Lcom/google/android/gms/internal/zzaen$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzaen$b;->a:Lcom/google/android/gms/internal/zzaen;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzaen;->e(Lcom/google/android/gms/internal/zzaen;)V

    return-void

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/zzaen$b$4;->b:Lcom/google/android/gms/internal/zzaen$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzaen$b;->a:Lcom/google/android/gms/internal/zzaen;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzaen;->b(Lcom/google/android/gms/internal/zzaen;)Lcom/google/android/gms/internal/zzahf;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzahf;->zzTe()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaen$b$4;->b:Lcom/google/android/gms/internal/zzaen$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzaen$b;->a:Lcom/google/android/gms/internal/zzaen;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzaen;->b(Lcom/google/android/gms/internal/zzaen;)Lcom/google/android/gms/internal/zzahf;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzaen$b$4;->a:Lcom/google/android/gms/internal/zzaig;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzaig;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x2

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "|"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "|"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v2, v4, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/zzahf;->zzh(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0
.end method
