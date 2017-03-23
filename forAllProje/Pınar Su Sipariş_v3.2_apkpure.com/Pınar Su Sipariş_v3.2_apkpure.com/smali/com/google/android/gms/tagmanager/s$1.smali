.class Lcom/google/android/gms/tagmanager/s$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/tagmanager/s;->a(Ljava/lang/String;J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/tagmanager/r;

.field final synthetic b:J

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Lcom/google/android/gms/tagmanager/s;


# direct methods
.method constructor <init>(Lcom/google/android/gms/tagmanager/s;Lcom/google/android/gms/tagmanager/r;JLjava/lang/String;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/s$1;->d:Lcom/google/android/gms/tagmanager/s;

    iput-object p2, p0, Lcom/google/android/gms/tagmanager/s$1;->a:Lcom/google/android/gms/tagmanager/r;

    iput-wide p3, p0, Lcom/google/android/gms/tagmanager/s$1;->b:J

    iput-object p5, p0, Lcom/google/android/gms/tagmanager/s$1;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/s$1;->d:Lcom/google/android/gms/tagmanager/s;

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/s;->a(Lcom/google/android/gms/tagmanager/s;)Lcom/google/android/gms/tagmanager/t;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/tagmanager/zzdb;->a()Lcom/google/android/gms/tagmanager/zzdb;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/tagmanager/s$1;->d:Lcom/google/android/gms/tagmanager/s;

    invoke-static {v1}, Lcom/google/android/gms/tagmanager/s;->b(Lcom/google/android/gms/tagmanager/s;)Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/tagmanager/s$1;->a:Lcom/google/android/gms/tagmanager/r;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/tagmanager/zzdb;->a(Landroid/content/Context;Lcom/google/android/gms/tagmanager/r;)V

    iget-object v1, p0, Lcom/google/android/gms/tagmanager/s$1;->d:Lcom/google/android/gms/tagmanager/s;

    invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/zzdb;->b()Lcom/google/android/gms/tagmanager/t;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/google/android/gms/tagmanager/s;->a(Lcom/google/android/gms/tagmanager/s;Lcom/google/android/gms/tagmanager/t;)Lcom/google/android/gms/tagmanager/t;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/s$1;->d:Lcom/google/android/gms/tagmanager/s;

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/s;->a(Lcom/google/android/gms/tagmanager/s;)Lcom/google/android/gms/tagmanager/t;

    move-result-object v0

    iget-wide v2, p0, Lcom/google/android/gms/tagmanager/s$1;->b:J

    iget-object v1, p0, Lcom/google/android/gms/tagmanager/s$1;->c:Ljava/lang/String;

    invoke-interface {v0, v2, v3, v1}, Lcom/google/android/gms/tagmanager/t;->a(JLjava/lang/String;)V

    return-void
.end method
