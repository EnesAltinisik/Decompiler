.class public abstract Lcom/pinarsu/siparis/ui/fragment/BaseFragment;
.super Landroid/support/v4/app/Fragment;
.source "BaseFragment.java"

# interfaces
.implements Landroid/os/Parcelable;


# instance fields
.field public activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

.field public myApplication:Lcom/pinarsu/siparis/MyApplication;

.field public resources:Landroid/content/res/Resources;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 26
    return-void
.end method


# virtual methods
.method public abstract getLayoutResource()I
.end method

.method public onAttach(Landroid/app/Activity;)V
    .locals 0

    .prologue
    .line 54
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onAttach(Landroid/app/Activity;)V

    .line 55
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 33
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 34
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/fragment/BaseFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/ui/activity/MainActivity;

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/BaseFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    .line 35
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/BaseFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/BaseFragment;->resources:Landroid/content/res/Resources;

    .line 36
    invoke-static {}, Lcom/pinarsu/siparis/MyApplication;->getInstance()Lcom/pinarsu/siparis/MyApplication;

    move-result-object v0

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/BaseFragment;->myApplication:Lcom/pinarsu/siparis/MyApplication;

    .line 37
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    .prologue
    .line 42
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/fragment/BaseFragment;->getLayoutResource()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    .line 43
    return-object v0
.end method

.method public onDetach()V
    .locals 0

    .prologue
    .line 59
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDetach()V

    .line 60
    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 49
    invoke-super {p0, p1, p2}, Landroid/support/v4/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 50
    return-void
.end method
