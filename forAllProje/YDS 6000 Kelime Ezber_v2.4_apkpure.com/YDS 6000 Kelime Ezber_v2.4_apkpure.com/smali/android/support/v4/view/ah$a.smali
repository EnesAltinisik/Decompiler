.class Landroid/support/v4/view/ah$a;
.super Landroid/support/v4/view/ah$k;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/view/ah;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/support/v4/view/ah$k;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;Landroid/support/v4/view/ab;)V
    .locals 1

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Landroid/support/v4/view/ab;->a()Ljava/lang/Object;

    move-result-object v0

    :goto_0
    invoke-static {p1, v0}, Landroid/support/v4/view/ai;->a(Landroid/view/View;Ljava/lang/Object;)V

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
