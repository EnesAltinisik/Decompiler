.class public abstract Lcom/fodlam/yds/a;
.super Landroid/preference/PreferenceActivity;


# instance fields
.field private a:Landroid/support/v7/app/g;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/preference/PreferenceActivity;-><init>()V

    return-void
.end method

.method private a()Landroid/support/v7/app/g;
    .locals 1

    iget-object v0, p0, Lcom/fodlam/yds/a;->a:Landroid/support/v7/app/g;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-static {p0, v0}, Landroid/support/v7/app/g;->a(Landroid/app/Activity;Landroid/support/v7/app/f;)Landroid/support/v7/app/g;

    move-result-object v0

    iput-object v0, p0, Lcom/fodlam/yds/a;->a:Landroid/support/v7/app/g;

    :cond_0
    iget-object v0, p0, Lcom/fodlam/yds/a;->a:Landroid/support/v7/app/g;

    return-object v0
.end method


# virtual methods
.method public addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    invoke-direct {p0}, Lcom/fodlam/yds/a;->a()Landroid/support/v7/app/g;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Landroid/support/v7/app/g;->b(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public getMenuInflater()Landroid/view/MenuInflater;
    .locals 1

    invoke-direct {p0}, Lcom/fodlam/yds/a;->a()Landroid/support/v7/app/g;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/app/g;->b()Landroid/view/MenuInflater;

    move-result-object v0

    return-object v0
.end method

.method public invalidateOptionsMenu()V
    .locals 1

    invoke-direct {p0}, Lcom/fodlam/yds/a;->a()Landroid/support/v7/app/g;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/app/g;->f()V

    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/preference/PreferenceActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    invoke-direct {p0}, Lcom/fodlam/yds/a;->a()Landroid/support/v7/app/g;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/support/v7/app/g;->a(Landroid/content/res/Configuration;)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1

    invoke-direct {p0}, Lcom/fodlam/yds/a;->a()Landroid/support/v7/app/g;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/app/g;->i()V

    invoke-direct {p0}, Lcom/fodlam/yds/a;->a()Landroid/support/v7/app/g;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/support/v7/app/g;->a(Landroid/os/Bundle;)V

    invoke-super {p0, p1}, Landroid/preference/PreferenceActivity;->onCreate(Landroid/os/Bundle;)V

    return-void
.end method

.method protected onDestroy()V
    .locals 1

    invoke-super {p0}, Landroid/preference/PreferenceActivity;->onDestroy()V

    invoke-direct {p0}, Lcom/fodlam/yds/a;->a()Landroid/support/v7/app/g;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/app/g;->g()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/fodlam/yds/a;->a:Landroid/support/v7/app/g;

    return-void
.end method

.method protected onPostCreate(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/preference/PreferenceActivity;->onPostCreate(Landroid/os/Bundle;)V

    invoke-direct {p0}, Lcom/fodlam/yds/a;->a()Landroid/support/v7/app/g;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/support/v7/app/g;->b(Landroid/os/Bundle;)V

    return-void
.end method

.method protected onPostResume()V
    .locals 1

    invoke-super {p0}, Landroid/preference/PreferenceActivity;->onPostResume()V

    invoke-direct {p0}, Lcom/fodlam/yds/a;->a()Landroid/support/v7/app/g;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/app/g;->e()V

    return-void
.end method

.method protected onStop()V
    .locals 1

    invoke-super {p0}, Landroid/preference/PreferenceActivity;->onStop()V

    invoke-direct {p0}, Lcom/fodlam/yds/a;->a()Landroid/support/v7/app/g;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/app/g;->d()V

    return-void
.end method

.method protected onTitleChanged(Ljava/lang/CharSequence;I)V
    .locals 1

    invoke-super {p0, p1, p2}, Landroid/preference/PreferenceActivity;->onTitleChanged(Ljava/lang/CharSequence;I)V

    invoke-direct {p0}, Lcom/fodlam/yds/a;->a()Landroid/support/v7/app/g;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/support/v7/app/g;->a(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setContentView(I)V
    .locals 1

    invoke-direct {p0}, Lcom/fodlam/yds/a;->a()Landroid/support/v7/app/g;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/support/v7/app/g;->b(I)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 1

    invoke-direct {p0}, Lcom/fodlam/yds/a;->a()Landroid/support/v7/app/g;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/support/v7/app/g;->a(Landroid/view/View;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    invoke-direct {p0}, Lcom/fodlam/yds/a;->a()Landroid/support/v7/app/g;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Landroid/support/v7/app/g;->a(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method
