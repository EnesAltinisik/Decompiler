.class public abstract Landroid/support/v4/view/d;
.super Ljava/lang/Object;
.source "ActionProvider.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/view/d$b;,
        Landroid/support/v4/view/d$a;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "ActionProvider(support)"


# instance fields
.field private final mContext:Landroid/content/Context;

.field private mSubUiVisibilityListener:Landroid/support/v4/view/d$a;

.field private mVisibilityListener:Landroid/support/v4/view/d$b;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 135
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 136
    iput-object p1, p0, Landroid/support/v4/view/d;->mContext:Landroid/content/Context;

    .line 137
    return-void
.end method


# virtual methods
.method public getContext()Landroid/content/Context;
    .locals 1

    .prologue
    .line 143
    iget-object v0, p0, Landroid/support/v4/view/d;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method public hasSubMenu()Z
    .locals 1

    .prologue
    .line 252
    const/4 v0, 0x0

    return v0
.end method

.method public isVisible()Z
    .locals 1

    .prologue
    .line 192
    const/4 v0, 0x1

    return v0
.end method

.method public abstract onCreateActionView()Landroid/view/View;
.end method

.method public onCreateActionView(Landroid/view/MenuItem;)Landroid/view/View;
    .locals 1

    .prologue
    .line 166
    invoke-virtual {p0}, Landroid/support/v4/view/d;->onCreateActionView()Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public onPerformDefaultAction()Z
    .locals 1

    .prologue
    .line 239
    const/4 v0, 0x0

    return v0
.end method

.method public onPrepareSubMenu(Landroid/view/SubMenu;)V
    .locals 0

    .prologue
    .line 265
    return-void
.end method

.method public overridesItemVisibility()Z
    .locals 1

    .prologue
    .line 178
    const/4 v0, 0x0

    return v0
.end method

.method public refreshVisibility()V
    .locals 2

    .prologue
    .line 202
    iget-object v0, p0, Landroid/support/v4/view/d;->mVisibilityListener:Landroid/support/v4/view/d$b;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/support/v4/view/d;->overridesItemVisibility()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 203
    iget-object v0, p0, Landroid/support/v4/view/d;->mVisibilityListener:Landroid/support/v4/view/d$b;

    invoke-virtual {p0}, Landroid/support/v4/view/d;->isVisible()Z

    move-result v1

    invoke-interface {v0, v1}, Landroid/support/v4/view/d$b;->a(Z)V

    .line 205
    :cond_0
    return-void
.end method

.method public reset()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 305
    iput-object v0, p0, Landroid/support/v4/view/d;->mVisibilityListener:Landroid/support/v4/view/d$b;

    .line 306
    iput-object v0, p0, Landroid/support/v4/view/d;->mSubUiVisibilityListener:Landroid/support/v4/view/d$a;

    .line 307
    return-void
.end method

.method public setSubUiVisibilityListener(Landroid/support/v4/view/d$a;)V
    .locals 0

    .prologue
    .line 283
    iput-object p1, p0, Landroid/support/v4/view/d;->mSubUiVisibilityListener:Landroid/support/v4/view/d$a;

    .line 284
    return-void
.end method

.method public setVisibilityListener(Landroid/support/v4/view/d$b;)V
    .locals 3

    .prologue
    .line 293
    iget-object v0, p0, Landroid/support/v4/view/d;->mVisibilityListener:Landroid/support/v4/view/d$b;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 294
    const-string v0, "ActionProvider(support)"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " instance while it is still in use somewhere else?"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 298
    :cond_0
    iput-object p1, p0, Landroid/support/v4/view/d;->mVisibilityListener:Landroid/support/v4/view/d$b;

    .line 299
    return-void
.end method

.method public subUiVisibilityChanged(Z)V
    .locals 1

    .prologue
    .line 274
    iget-object v0, p0, Landroid/support/v4/view/d;->mSubUiVisibilityListener:Landroid/support/v4/view/d$a;

    if-eqz v0, :cond_0

    .line 275
    iget-object v0, p0, Landroid/support/v4/view/d;->mSubUiVisibilityListener:Landroid/support/v4/view/d$a;

    invoke-interface {v0, p1}, Landroid/support/v4/view/d$a;->a(Z)V

    .line 277
    :cond_0
    return-void
.end method
