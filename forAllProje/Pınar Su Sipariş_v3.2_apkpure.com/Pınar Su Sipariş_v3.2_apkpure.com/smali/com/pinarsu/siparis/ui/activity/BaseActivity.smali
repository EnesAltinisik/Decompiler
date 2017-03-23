.class public abstract Lcom/pinarsu/siparis/ui/activity/BaseActivity;
.super Landroid/support/v7/app/AppCompatActivity;
.source "BaseActivity.java"


# static fields
.field public static REQUEST_TYPE:I


# instance fields
.field public activity:Lcom/pinarsu/siparis/ui/activity/BaseActivity;

.field imBack:Landroid/widget/ImageView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00e3
    .end annotation
.end field

.field imLeftMenu:Landroid/widget/ImageView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d0156
    .end annotation
.end field

.field imLogo:Landroid/widget/ImageView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d0157
    .end annotation
.end field

.field imRightMenu:Landroid/widget/ImageView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d015a
    .end annotation
.end field

.field public myApplication:Lcom/pinarsu/siparis/MyApplication;

.field onActivityResultDelegate:Lcom/pinarsu/siparis/interfaces/IActivityResult;

.field public resources:Landroid/content/res/Resources;

.field toolbar:Landroid/support/v7/widget/Toolbar;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00a8
    .end annotation
.end field

.field tvTitle:Lcom/pinarsu/siparis/view/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00b1
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 45
    const/16 v0, 0x3e7

    sput v0, Lcom/pinarsu/siparis/ui/activity/BaseActivity;->REQUEST_TYPE:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0}, Landroid/support/v7/app/AppCompatActivity;-><init>()V

    return-void
.end method


# virtual methods
.method clickBack()V
    .locals 0
    .annotation build Lbutterknife/OnClick;
        value = {
            0x7f0d00e3
        }
    .end annotation

    .prologue
    .line 88
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/activity/BaseActivity;->onBackPressed()V

    .line 89
    return-void
.end method

.method public abstract getLayoutResource()I
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    .prologue
    .line 97
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/BaseActivity;->onActivityResultDelegate:Lcom/pinarsu/siparis/interfaces/IActivityResult;

    if-eqz v0, :cond_1

    .line 98
    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    .line 99
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/BaseActivity;->onActivityResultDelegate:Lcom/pinarsu/siparis/interfaces/IActivityResult;

    invoke-interface {v0, p3}, Lcom/pinarsu/siparis/interfaces/IActivityResult;->onActivityResult(Landroid/content/Intent;)V

    .line 100
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/activity/BaseActivity;->onActivityResultDelegate:Lcom/pinarsu/siparis/interfaces/IActivityResult;

    .line 104
    :cond_0
    :goto_0
    return-void

    .line 103
    :cond_1
    invoke-super {p0, p1, p2, p3}, Landroid/support/v7/app/AppCompatActivity;->onActivityResult(IILandroid/content/Intent;)V

    goto :goto_0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x4

    .line 49
    invoke-super {p0, p1}, Landroid/support/v7/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 52
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/activity/BaseActivity;->getLayoutResource()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/ui/activity/BaseActivity;->setContentView(I)V

    .line 53
    invoke-static {p0}, Lbutterknife/ButterKnife;->inject(Landroid/app/Activity;)V

    .line 54
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/BaseActivity;->imLogo:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 55
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/BaseActivity;->imLeftMenu:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 56
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/BaseActivity;->imBack:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 57
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/BaseActivity;->imRightMenu:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 58
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/BaseActivity;->toolbar:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/ui/activity/BaseActivity;->setSupportActionBar(Landroid/support/v7/widget/Toolbar;)V

    .line 59
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/activity/BaseActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/support/v7/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 60
    iput-object p0, p0, Lcom/pinarsu/siparis/ui/activity/BaseActivity;->activity:Lcom/pinarsu/siparis/ui/activity/BaseActivity;

    .line 61
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/BaseActivity;->activity:Lcom/pinarsu/siparis/ui/activity/BaseActivity;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/ui/activity/BaseActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/activity/BaseActivity;->resources:Landroid/content/res/Resources;

    .line 62
    invoke-static {}, Lcom/pinarsu/siparis/MyApplication;->getInstance()Lcom/pinarsu/siparis/MyApplication;

    move-result-object v0

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/activity/BaseActivity;->myApplication:Lcom/pinarsu/siparis/MyApplication;

    .line 63
    return-void
.end method

.method public setOnActivityResultDelegate(Lcom/pinarsu/siparis/interfaces/IActivityResult;)V
    .locals 0

    .prologue
    .line 92
    iput-object p1, p0, Lcom/pinarsu/siparis/ui/activity/BaseActivity;->onActivityResultDelegate:Lcom/pinarsu/siparis/interfaces/IActivityResult;

    .line 93
    return-void
.end method

.method public setTitle(I)V
    .locals 2

    .prologue
    .line 66
    if-eqz p1, :cond_0

    .line 67
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/BaseActivity;->tvTitle:Lcom/pinarsu/siparis/view/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/view/TextView;->setVisibility(I)V

    .line 68
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/BaseActivity;->tvTitle:Lcom/pinarsu/siparis/view/TextView;

    invoke-virtual {p0, p1}, Lcom/pinarsu/siparis/ui/activity/BaseActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/view/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 73
    :goto_0
    return-void

    .line 70
    :cond_0
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/BaseActivity;->tvTitle:Lcom/pinarsu/siparis/view/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/view/TextView;->setVisibility(I)V

    .line 71
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/BaseActivity;->tvTitle:Lcom/pinarsu/siparis/view/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/view/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 76
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 77
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/BaseActivity;->tvTitle:Lcom/pinarsu/siparis/view/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/view/TextView;->setVisibility(I)V

    .line 78
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/BaseActivity;->tvTitle:Lcom/pinarsu/siparis/view/TextView;

    invoke-virtual {v0, p1}, Lcom/pinarsu/siparis/view/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 83
    :goto_0
    return-void

    .line 80
    :cond_0
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/BaseActivity;->tvTitle:Lcom/pinarsu/siparis/view/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/view/TextView;->setVisibility(I)V

    .line 81
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/BaseActivity;->tvTitle:Lcom/pinarsu/siparis/view/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/view/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method
