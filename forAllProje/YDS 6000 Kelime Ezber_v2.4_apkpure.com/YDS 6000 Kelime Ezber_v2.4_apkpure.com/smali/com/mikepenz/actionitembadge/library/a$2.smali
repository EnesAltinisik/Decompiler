.class final Lcom/mikepenz/actionitembadge/library/a$2;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mikepenz/actionitembadge/library/a;->a(Landroid/app/Activity;Landroid/view/MenuItem;Landroid/graphics/drawable/Drawable;Lcom/mikepenz/actionitembadge/library/a/b;Ljava/lang/String;Lcom/mikepenz/actionitembadge/library/a$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/app/Activity;

.field final synthetic b:Landroid/view/MenuItem;


# direct methods
.method constructor <init>(Landroid/app/Activity;Landroid/view/MenuItem;)V
    .locals 0

    iput-object p1, p0, Lcom/mikepenz/actionitembadge/library/a$2;->a:Landroid/app/Activity;

    iput-object p2, p0, Lcom/mikepenz/actionitembadge/library/a$2;->b:Landroid/view/MenuItem;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLongClick(Landroid/view/View;)Z
    .locals 5

    iget-object v0, p0, Lcom/mikepenz/actionitembadge/library/a$2;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    new-instance v1, Landroid/graphics/Point;

    invoke-direct {v1}, Landroid/graphics/Point;-><init>()V

    invoke-virtual {v0, v1}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V

    iget v0, v1, Landroid/graphics/Point;->x:I

    iget-object v1, p0, Lcom/mikepenz/actionitembadge/library/a$2;->a:Landroid/app/Activity;

    iget-object v2, p0, Lcom/mikepenz/actionitembadge/library/a$2;->b:Landroid/view/MenuItem;

    invoke-interface {v2}, Landroid/view/MenuItem;->getTitle()Ljava/lang/CharSequence;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v1, v2, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v1

    const/16 v2, 0x30

    div-int/lit8 v0, v0, 0x5

    iget-object v3, p0, Lcom/mikepenz/actionitembadge/library/a$2;->a:Landroid/app/Activity;

    const/high16 v4, 0x42400000    # 48.0f

    invoke-static {v3, v4}, Lcom/mikepenz/actionitembadge/library/a/c;->a(Landroid/content/Context;F)I

    move-result v3

    invoke-virtual {v1, v2, v0, v3}, Landroid/widget/Toast;->setGravity(III)V

    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    const/4 v0, 0x1

    return v0
.end method
