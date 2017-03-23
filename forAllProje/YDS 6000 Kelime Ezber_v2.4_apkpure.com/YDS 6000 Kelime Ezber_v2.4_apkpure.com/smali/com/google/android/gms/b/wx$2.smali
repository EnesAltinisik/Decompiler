.class final Lcom/google/android/gms/b/wx$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/wx;->a(Landroid/content/Context;Lcom/google/android/gms/b/sv;Lcom/google/android/gms/b/pk;Lcom/google/android/gms/b/ww;Lcom/google/android/gms/b/wf;)Lcom/google/android/gms/b/wi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/b/sv;

.field final synthetic b:Lcom/google/android/gms/b/xa;

.field final synthetic c:Lcom/google/android/gms/b/qa;

.field final synthetic d:Lcom/google/android/gms/b/py;

.field final synthetic e:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/sv;Lcom/google/android/gms/b/xa;Lcom/google/android/gms/b/qa;Lcom/google/android/gms/b/py;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/wx$2;->a:Lcom/google/android/gms/b/sv;

    iput-object p2, p0, Lcom/google/android/gms/b/wx$2;->b:Lcom/google/android/gms/b/xa;

    iput-object p3, p0, Lcom/google/android/gms/b/wx$2;->c:Lcom/google/android/gms/b/qa;

    iput-object p4, p0, Lcom/google/android/gms/b/wx$2;->d:Lcom/google/android/gms/b/py;

    iput-object p5, p0, Lcom/google/android/gms/b/wx$2;->e:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/b/wx$2;->a:Lcom/google/android/gms/b/sv;

    invoke-virtual {v0}, Lcom/google/android/gms/b/sv;->a()Lcom/google/android/gms/b/sv$c;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/b/wx$2;->b:Lcom/google/android/gms/b/xa;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/b/xa;->a(Lcom/google/android/gms/b/sv$c;)V

    iget-object v1, p0, Lcom/google/android/gms/b/wx$2;->c:Lcom/google/android/gms/b/qa;

    iget-object v2, p0, Lcom/google/android/gms/b/wx$2;->d:Lcom/google/android/gms/b/py;

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    const/4 v4, 0x0

    const-string v5, "rwc"

    aput-object v5, v3, v4

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/b/qa;->a(Lcom/google/android/gms/b/py;[Ljava/lang/String;)Z

    iget-object v1, p0, Lcom/google/android/gms/b/wx$2;->c:Lcom/google/android/gms/b/qa;

    invoke-virtual {v1}, Lcom/google/android/gms/b/qa;->a()Lcom/google/android/gms/b/py;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/b/wx$2$1;

    invoke-direct {v2, p0, v1}, Lcom/google/android/gms/b/wx$2$1;-><init>(Lcom/google/android/gms/b/wx$2;Lcom/google/android/gms/b/py;)V

    new-instance v1, Lcom/google/android/gms/b/wx$2$2;

    invoke-direct {v1, p0}, Lcom/google/android/gms/b/wx$2$2;-><init>(Lcom/google/android/gms/b/wx$2;)V

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/b/sv$c;->a(Lcom/google/android/gms/b/aaj$c;Lcom/google/android/gms/b/aaj$a;)V

    return-void
.end method
