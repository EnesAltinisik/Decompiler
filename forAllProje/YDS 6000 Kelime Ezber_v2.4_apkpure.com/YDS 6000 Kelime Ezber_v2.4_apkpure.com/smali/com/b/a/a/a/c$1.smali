.class Lcom/b/a/a/a/c$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/b/a/a/a/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/b/a/a/a/c;


# direct methods
.method constructor <init>(Lcom/b/a/a/a/c;)V
    .locals 0

    iput-object p1, p0, Lcom/b/a/a/a/c$1;->a:Lcom/b/a/a/a/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 3

    iget-object v0, p0, Lcom/b/a/a/a/c$1;->a:Lcom/b/a/a/a/c;

    invoke-static {p2}, Lcom/a/a/a/a$a;->a(Landroid/os/IBinder;)Lcom/a/a/a/a;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/b/a/a/a/c;->a(Lcom/b/a/a/a/c;Lcom/a/a/a/a;)Lcom/a/a/a/a;

    new-instance v0, Lcom/b/a/a/a/c$a;

    iget-object v1, p0, Lcom/b/a/a/a/c$1;->a:Lcom/b/a/a/a/c;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/b/a/a/a/c$a;-><init>(Lcom/b/a/a/a/c;Lcom/b/a/a/a/c$1;)V

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Lcom/b/a/a/a/c$a;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 2

    iget-object v0, p0, Lcom/b/a/a/a/c$1;->a:Lcom/b/a/a/a/c;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/b/a/a/a/c;->a(Lcom/b/a/a/a/c;Lcom/a/a/a/a;)Lcom/a/a/a/a;

    return-void
.end method
