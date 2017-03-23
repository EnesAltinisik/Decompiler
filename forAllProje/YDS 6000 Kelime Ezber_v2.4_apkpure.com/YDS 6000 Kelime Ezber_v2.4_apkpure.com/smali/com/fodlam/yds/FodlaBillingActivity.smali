.class public Lcom/fodlam/yds/FodlaBillingActivity;
.super Landroid/support/v7/app/e;

# interfaces
.implements Lcom/b/a/a/a/c$b;


# instance fields
.field m:Lcom/b/a/a/a/c;

.field n:Z

.field o:Landroid/widget/Button;

.field p:Landroid/widget/Button;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/support/v7/app/e;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/fodlam/yds/FodlaBillingActivity;->n:Z

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method private j()V
    .locals 6

    const/4 v5, 0x1

    const v4, 0x7f09004c

    const/4 v3, 0x0

    iget-object v0, p0, Lcom/fodlam/yds/FodlaBillingActivity;->m:Lcom/b/a/a/a/c;

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iget-object v1, p0, Lcom/fodlam/yds/FodlaBillingActivity;->m:Lcom/b/a/a/a/c;

    const-string v2, "com.fodlam.yds.full"

    invoke-virtual {v1, v2}, Lcom/b/a/a/a/c;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/fodlam/yds/FodlaBillingActivity;->m:Lcom/b/a/a/a/c;

    const-string v2, "com.fodlam.yds.noads"

    invoke-virtual {v1, v2}, Lcom/b/a/a/a/c;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, "com.fodlam.yds.full"

    const-string v2, "com.fodlam.yds"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    const-string v1, "com.fodlam.yds.noads"

    const-string v2, "com.fodlam.yds"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    invoke-static {p0}, Lcom/fodlam/yds/OxfordApplication;->d(Landroid/content/Context;)V

    iget-object v0, p0, Lcom/fodlam/yds/FodlaBillingActivity;->p:Landroid/widget/Button;

    invoke-virtual {v0, v3}, Landroid/widget/Button;->setEnabled(Z)V

    iget-object v0, p0, Lcom/fodlam/yds/FodlaBillingActivity;->o:Landroid/widget/Button;

    invoke-virtual {v0, v3}, Landroid/widget/Button;->setEnabled(Z)V

    iget-object v0, p0, Lcom/fodlam/yds/FodlaBillingActivity;->p:Landroid/widget/Button;

    invoke-virtual {v0, v4}, Landroid/widget/Button;->setText(I)V

    iget-object v0, p0, Lcom/fodlam/yds/FodlaBillingActivity;->o:Landroid/widget/Button;

    invoke-virtual {v0, v4}, Landroid/widget/Button;->setText(I)V

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lcom/fodlam/yds/FodlaBillingActivity;->m:Lcom/b/a/a/a/c;

    const-string v2, "com.fodlam.yds.full"

    invoke-virtual {v1, v2}, Lcom/b/a/a/a/c;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    const-string v1, "com.fodlam.yds.full"

    const-string v2, "com.fodlam.yds"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    invoke-static {p0}, Lcom/fodlam/yds/OxfordApplication;->d(Landroid/content/Context;)V

    iget-object v0, p0, Lcom/fodlam/yds/FodlaBillingActivity;->p:Landroid/widget/Button;

    invoke-virtual {v0, v3}, Landroid/widget/Button;->setEnabled(Z)V

    iget-object v0, p0, Lcom/fodlam/yds/FodlaBillingActivity;->o:Landroid/widget/Button;

    invoke-virtual {v0, v3}, Landroid/widget/Button;->setEnabled(Z)V

    iget-object v0, p0, Lcom/fodlam/yds/FodlaBillingActivity;->p:Landroid/widget/Button;

    invoke-virtual {v0, v4}, Landroid/widget/Button;->setText(I)V

    goto :goto_0

    :cond_3
    iget-object v1, p0, Lcom/fodlam/yds/FodlaBillingActivity;->m:Lcom/b/a/a/a/c;

    const-string v2, "com.fodlam.yds.noads"

    invoke-virtual {v1, v2}, Lcom/b/a/a/a/c;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    const-string v1, "com.fodlam.yds.noads"

    const-string v2, "com.fodlam.yds"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    invoke-static {p0}, Lcom/fodlam/yds/OxfordApplication;->d(Landroid/content/Context;)V

    iget-object v0, p0, Lcom/fodlam/yds/FodlaBillingActivity;->o:Landroid/widget/Button;

    invoke-virtual {v0, v3}, Landroid/widget/Button;->setEnabled(Z)V

    iget-object v0, p0, Lcom/fodlam/yds/FodlaBillingActivity;->p:Landroid/widget/Button;

    invoke-virtual {v0, v5}, Landroid/widget/Button;->setEnabled(Z)V

    iget-object v0, p0, Lcom/fodlam/yds/FodlaBillingActivity;->o:Landroid/widget/Button;

    invoke-virtual {v0, v4}, Landroid/widget/Button;->setText(I)V

    goto/16 :goto_0

    :cond_4
    iget-boolean v0, p0, Lcom/fodlam/yds/FodlaBillingActivity;->n:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fodlam/yds/FodlaBillingActivity;->p:Landroid/widget/Button;

    invoke-virtual {v0, v5}, Landroid/widget/Button;->setEnabled(Z)V

    iget-object v0, p0, Lcom/fodlam/yds/FodlaBillingActivity;->o:Landroid/widget/Button;

    invoke-virtual {v0, v5}, Landroid/widget/Button;->setEnabled(Z)V

    goto/16 :goto_0
.end method


# virtual methods
.method public a(ILjava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0}, Lcom/fodlam/yds/FodlaBillingActivity;->j()V

    return-void
.end method

.method public a(Ljava/lang/String;Lcom/b/a/a/a/h;)V
    .locals 5

    const v4, 0x7f09004c

    const/4 v3, 0x0

    iget-object v0, p2, Lcom/b/a/a/a/h;->e:Lcom/b/a/a/a/e;

    iget-object v0, v0, Lcom/b/a/a/a/e;->c:Lcom/b/a/a/a/d;

    iget-object v0, v0, Lcom/b/a/a/a/d;->e:Lcom/b/a/a/a/f;

    sget-object v1, Lcom/b/a/a/a/f;->a:Lcom/b/a/a/a/f;

    if-ne v0, v1, :cond_0

    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "com.fodlam.yds.full"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "com.fodlam.yds.full"

    const-string v2, "com.fodlam.yds"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    invoke-static {p0}, Lcom/fodlam/yds/OxfordApplication;->d(Landroid/content/Context;)V

    iget-object v0, p0, Lcom/fodlam/yds/FodlaBillingActivity;->p:Landroid/widget/Button;

    invoke-virtual {v0, v3}, Landroid/widget/Button;->setEnabled(Z)V

    iget-object v0, p0, Lcom/fodlam/yds/FodlaBillingActivity;->o:Landroid/widget/Button;

    invoke-virtual {v0, v3}, Landroid/widget/Button;->setEnabled(Z)V

    iget-object v0, p0, Lcom/fodlam/yds/FodlaBillingActivity;->p:Landroid/widget/Button;

    invoke-virtual {v0, v4}, Landroid/widget/Button;->setText(I)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    const-string v1, "com.fodlam.yds.noads"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "com.fodlam.yds.noads"

    const-string v2, "com.fodlam.yds"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    invoke-static {p0}, Lcom/fodlam/yds/OxfordApplication;->d(Landroid/content/Context;)V

    iget-object v0, p0, Lcom/fodlam/yds/FodlaBillingActivity;->o:Landroid/widget/Button;

    invoke-virtual {v0, v3}, Landroid/widget/Button;->setEnabled(Z)V

    iget-object v0, p0, Lcom/fodlam/yds/FodlaBillingActivity;->o:Landroid/widget/Button;

    invoke-virtual {v0, v4}, Landroid/widget/Button;->setText(I)V

    goto :goto_0
.end method

.method public c_()V
    .locals 0

    invoke-direct {p0}, Lcom/fodlam/yds/FodlaBillingActivity;->j()V

    return-void
.end method

.method public d_()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/fodlam/yds/FodlaBillingActivity;->n:Z

    iget-object v0, p0, Lcom/fodlam/yds/FodlaBillingActivity;->m:Lcom/b/a/a/a/c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fodlam/yds/FodlaBillingActivity;->m:Lcom/b/a/a/a/c;

    invoke-virtual {v0}, Lcom/b/a/a/a/c;->e()Z

    :cond_0
    invoke-direct {p0}, Lcom/fodlam/yds/FodlaBillingActivity;->j()V

    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    invoke-direct {p0}, Lcom/fodlam/yds/FodlaBillingActivity;->j()V

    iget-object v0, p0, Lcom/fodlam/yds/FodlaBillingActivity;->m:Lcom/b/a/a/a/c;

    invoke-virtual {v0, p1, p2, p3}, Lcom/b/a/a/a/c;->a(IILandroid/content/Intent;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-super {p0, p1, p2, p3}, Landroid/support/v7/app/e;->onActivityResult(IILandroid/content/Intent;)V

    :cond_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3

    invoke-super {p0, p1}, Landroid/support/v7/app/e;->onCreate(Landroid/os/Bundle;)V

    const v0, 0x7f04001c

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/FodlaBillingActivity;->setContentView(I)V

    const v0, 0x7f100121

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/FodlaBillingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f09037c

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    const v0, 0x7f100125

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/FodlaBillingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f09037b

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    const v0, 0x7f100122

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/FodlaBillingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/fodlam/yds/FodlaBillingActivity;->p:Landroid/widget/Button;

    iget-object v0, p0, Lcom/fodlam/yds/FodlaBillingActivity;->p:Landroid/widget/Button;

    new-instance v1, Lcom/fodlam/yds/FodlaBillingActivity$1;

    invoke-direct {v1, p0}, Lcom/fodlam/yds/FodlaBillingActivity$1;-><init>(Lcom/fodlam/yds/FodlaBillingActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f100126

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/FodlaBillingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/fodlam/yds/FodlaBillingActivity;->o:Landroid/widget/Button;

    iget-object v0, p0, Lcom/fodlam/yds/FodlaBillingActivity;->o:Landroid/widget/Button;

    new-instance v1, Lcom/fodlam/yds/FodlaBillingActivity$2;

    invoke-direct {v1, p0}, Lcom/fodlam/yds/FodlaBillingActivity$2;-><init>(Lcom/fodlam/yds/FodlaBillingActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance v0, Lcom/b/a/a/a/c;

    const-string v1, "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxJvoOSAb8hUKvThiWh0Zc/U7u70eMBMrkrhDIdxvqTftqiOKqHxJJw1cIoOAdYUlBTWgJQnB9tbrZXzRYlPGokXd12L1KanIVc7QuDj2QPHjlfTOGLwD44bKsji1o8NqFmpDrbBieKyVCvffPfs0iCn8KslzwzbodLbaviOfDW0Mi0RGFZwW3WPigmZlHLgcngv9UFHDZuQ6wPNJ8BylsjNBtrwA+mwtkRWSBVkBoZ1p3ts5eWa864fqieqvENRIt2JRa4b+9bM4VX49yVBI1SlGpIAm6CLh6r12TYAIg/pFn7pebnvQxhq7UzG8p15p8lLAXX2EdMC51MNtVRSdpQIDAQAB"

    const-string v2, "13729865083699685309"

    invoke-direct {v0, p0, v1, v2, p0}, Lcom/b/a/a/a/c;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/b/a/a/a/c$b;)V

    iput-object v0, p0, Lcom/fodlam/yds/FodlaBillingActivity;->m:Lcom/b/a/a/a/c;

    return-void
.end method

.method protected onDestroy()V
    .locals 2

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/fodlam/yds/FodlaBillingActivity;->m:Lcom/b/a/a/a/c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fodlam/yds/FodlaBillingActivity;->m:Lcom/b/a/a/a/c;

    invoke-virtual {v0}, Lcom/b/a/a/a/c;->c()V

    :cond_0
    iput-object v1, p0, Lcom/fodlam/yds/FodlaBillingActivity;->m:Lcom/b/a/a/a/c;

    iput-object v1, p0, Lcom/fodlam/yds/FodlaBillingActivity;->o:Landroid/widget/Button;

    iput-object v1, p0, Lcom/fodlam/yds/FodlaBillingActivity;->p:Landroid/widget/Button;

    invoke-super {p0}, Landroid/support/v7/app/e;->onDestroy()V

    return-void
.end method

.method protected onResume()V
    .locals 1

    invoke-super {p0}, Landroid/support/v7/app/e;->onResume()V

    invoke-static {p0}, Lcom/b/a/a/a/c;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    const v0, 0x7f090370

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/FodlaBillingActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/fodlam/yds/FodlaBillingActivity;->a(Ljava/lang/String;)V

    :cond_0
    invoke-direct {p0}, Lcom/fodlam/yds/FodlaBillingActivity;->j()V

    return-void
.end method
