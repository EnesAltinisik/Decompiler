.class Lcom/arlib/floatingsearchview/FloatingSearchView$22;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/arlib/floatingsearchview/util/view/SearchInputView$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/arlib/floatingsearchview/FloatingSearchView;->f()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/arlib/floatingsearchview/FloatingSearchView;


# direct methods
.method constructor <init>(Lcom/arlib/floatingsearchview/FloatingSearchView;)V
    .locals 0

    iput-object p1, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$22;->a:Lcom/arlib/floatingsearchview/FloatingSearchView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$22;->a:Lcom/arlib/floatingsearchview/FloatingSearchView;

    invoke-static {v0}, Lcom/arlib/floatingsearchview/FloatingSearchView;->o(Lcom/arlib/floatingsearchview/FloatingSearchView;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arlib/floatingsearchview/FloatingSearchView$22;->a:Lcom/arlib/floatingsearchview/FloatingSearchView;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/arlib/floatingsearchview/FloatingSearchView;->d(Lcom/arlib/floatingsearchview/FloatingSearchView;Z)V

    :cond_0
    return-void
.end method
