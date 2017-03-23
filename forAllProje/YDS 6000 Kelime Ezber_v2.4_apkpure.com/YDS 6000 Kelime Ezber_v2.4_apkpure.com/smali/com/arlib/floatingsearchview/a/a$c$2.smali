.class Lcom/arlib/floatingsearchview/a/a$c$2;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/arlib/floatingsearchview/a/a$c;-><init>(Landroid/view/View;Lcom/arlib/floatingsearchview/a/a$c$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/arlib/floatingsearchview/a/a$c;


# direct methods
.method constructor <init>(Lcom/arlib/floatingsearchview/a/a$c;)V
    .locals 0

    iput-object p1, p0, Lcom/arlib/floatingsearchview/a/a$c$2;->a:Lcom/arlib/floatingsearchview/a/a$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/arlib/floatingsearchview/a/a$c$2;->a:Lcom/arlib/floatingsearchview/a/a$c;

    invoke-virtual {v0}, Lcom/arlib/floatingsearchview/a/a$c;->e()I

    move-result v0

    iget-object v1, p0, Lcom/arlib/floatingsearchview/a/a$c$2;->a:Lcom/arlib/floatingsearchview/a/a$c;

    invoke-static {v1}, Lcom/arlib/floatingsearchview/a/a$c;->a(Lcom/arlib/floatingsearchview/a/a$c;)Lcom/arlib/floatingsearchview/a/a$c$a;

    move-result-object v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget-object v1, p0, Lcom/arlib/floatingsearchview/a/a$c$2;->a:Lcom/arlib/floatingsearchview/a/a$c;

    invoke-static {v1}, Lcom/arlib/floatingsearchview/a/a$c;->a(Lcom/arlib/floatingsearchview/a/a$c;)Lcom/arlib/floatingsearchview/a/a$c$a;

    move-result-object v1

    invoke-interface {v1, v0}, Lcom/arlib/floatingsearchview/a/a$c$a;->a(I)V

    :cond_0
    return-void
.end method
