.class final Lcom/mikepenz/actionitembadge/library/a$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mikepenz/actionitembadge/library/a;->a(Landroid/app/Activity;Landroid/view/MenuItem;Landroid/graphics/drawable/Drawable;Lcom/mikepenz/actionitembadge/library/a/b;Ljava/lang/String;Lcom/mikepenz/actionitembadge/library/a$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/mikepenz/actionitembadge/library/a$a;

.field final synthetic b:Landroid/view/MenuItem;

.field final synthetic c:Landroid/app/Activity;


# direct methods
.method constructor <init>(Lcom/mikepenz/actionitembadge/library/a$a;Landroid/view/MenuItem;Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, Lcom/mikepenz/actionitembadge/library/a$1;->a:Lcom/mikepenz/actionitembadge/library/a$a;

    iput-object p2, p0, Lcom/mikepenz/actionitembadge/library/a$1;->b:Landroid/view/MenuItem;

    iput-object p3, p0, Lcom/mikepenz/actionitembadge/library/a$1;->c:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/mikepenz/actionitembadge/library/a$1;->a:Lcom/mikepenz/actionitembadge/library/a$a;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/mikepenz/actionitembadge/library/a$1;->a:Lcom/mikepenz/actionitembadge/library/a$a;

    iget-object v2, p0, Lcom/mikepenz/actionitembadge/library/a$1;->b:Landroid/view/MenuItem;

    invoke-interface {v0, v2}, Lcom/mikepenz/actionitembadge/library/a$a;->a(Landroid/view/MenuItem;)Z

    move-result v0

    :goto_0
    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/mikepenz/actionitembadge/library/a$1;->c:Landroid/app/Activity;

    iget-object v2, p0, Lcom/mikepenz/actionitembadge/library/a$1;->b:Landroid/view/MenuItem;

    invoke-virtual {v0, v1, v2}, Landroid/app/Activity;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    :cond_0
    return-void

    :cond_1
    move v0, v1

    goto :goto_0
.end method
