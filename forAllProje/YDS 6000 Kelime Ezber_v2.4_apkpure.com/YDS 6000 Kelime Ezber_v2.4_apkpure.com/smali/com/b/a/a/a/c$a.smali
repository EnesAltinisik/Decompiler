.class Lcom/b/a/a/a/c$a;
.super Landroid/os/AsyncTask;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/b/a/a/a/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/b/a/a/a/c;


# direct methods
.method private constructor <init>(Lcom/b/a/a/a/c;)V
    .locals 0

    iput-object p1, p0, Lcom/b/a/a/a/c$a;->a:Lcom/b/a/a/a/c;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/b/a/a/a/c;Lcom/b/a/a/a/c$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/b/a/a/a/c$a;-><init>(Lcom/b/a/a/a/c;)V

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/b/a/a/a/c$a;->a:Lcom/b/a/a/a/c;

    invoke-static {v0}, Lcom/b/a/a/a/c;->a(Lcom/b/a/a/a/c;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/b/a/a/a/c$a;->a:Lcom/b/a/a/a/c;

    invoke-virtual {v0}, Lcom/b/a/a/a/c;->e()Z

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_0
.end method

.method protected a(Ljava/lang/Boolean;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/b/a/a/a/c$a;->a:Lcom/b/a/a/a/c;

    invoke-static {v0}, Lcom/b/a/a/a/c;->b(Lcom/b/a/a/a/c;)V

    iget-object v0, p0, Lcom/b/a/a/a/c$a;->a:Lcom/b/a/a/a/c;

    invoke-static {v0}, Lcom/b/a/a/a/c;->c(Lcom/b/a/a/a/c;)Lcom/b/a/a/a/c$b;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/b/a/a/a/c$a;->a:Lcom/b/a/a/a/c;

    invoke-static {v0}, Lcom/b/a/a/a/c;->c(Lcom/b/a/a/a/c;)Lcom/b/a/a/a/c$b;

    move-result-object v0

    invoke-interface {v0}, Lcom/b/a/a/a/c$b;->c_()V

    :cond_0
    iget-object v0, p0, Lcom/b/a/a/a/c$a;->a:Lcom/b/a/a/a/c;

    invoke-static {v0}, Lcom/b/a/a/a/c;->c(Lcom/b/a/a/a/c;)Lcom/b/a/a/a/c$b;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/b/a/a/a/c$a;->a:Lcom/b/a/a/a/c;

    invoke-static {v0}, Lcom/b/a/a/a/c;->c(Lcom/b/a/a/a/c;)Lcom/b/a/a/a/c$b;

    move-result-object v0

    invoke-interface {v0}, Lcom/b/a/a/a/c$b;->d_()V

    :cond_1
    return-void
.end method

.method protected synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/b/a/a/a/c$a;->a([Ljava/lang/Void;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method protected synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/b/a/a/a/c$a;->a(Ljava/lang/Boolean;)V

    return-void
.end method
