.class Landroid/support/v7/widget/x$1;
.super Landroid/support/v7/widget/aj$b;
.source "AppCompatSpinner.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroid/support/v7/widget/x;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILandroid/content/res/Resources$Theme;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/support/v7/widget/x$b;

.field final synthetic b:Landroid/support/v7/widget/x;


# direct methods
.method constructor <init>(Landroid/support/v7/widget/x;Landroid/view/View;Landroid/support/v7/widget/x$b;)V
    .locals 0

    .prologue
    .line 253
    iput-object p1, p0, Landroid/support/v7/widget/x$1;->b:Landroid/support/v7/widget/x;

    iput-object p3, p0, Landroid/support/v7/widget/x$1;->a:Landroid/support/v7/widget/x$b;

    invoke-direct {p0, p2}, Landroid/support/v7/widget/aj$b;-><init>(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public a()Landroid/support/v7/widget/aj;
    .locals 1

    .prologue
    .line 256
    iget-object v0, p0, Landroid/support/v7/widget/x$1;->a:Landroid/support/v7/widget/x$b;

    return-object v0
.end method

.method public b()Z
    .locals 1

    .prologue
    .line 261
    iget-object v0, p0, Landroid/support/v7/widget/x$1;->b:Landroid/support/v7/widget/x;

    invoke-static {v0}, Landroid/support/v7/widget/x;->a(Landroid/support/v7/widget/x;)Landroid/support/v7/widget/x$b;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/widget/x$b;->k()Z

    move-result v0

    if-nez v0, :cond_0

    .line 262
    iget-object v0, p0, Landroid/support/v7/widget/x$1;->b:Landroid/support/v7/widget/x;

    invoke-static {v0}, Landroid/support/v7/widget/x;->a(Landroid/support/v7/widget/x;)Landroid/support/v7/widget/x$b;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/widget/x$b;->c()V

    .line 264
    :cond_0
    const/4 v0, 0x1

    return v0
.end method
