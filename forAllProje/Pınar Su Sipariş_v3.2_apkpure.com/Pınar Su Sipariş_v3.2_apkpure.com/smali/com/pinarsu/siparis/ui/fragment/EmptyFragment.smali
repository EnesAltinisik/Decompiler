.class public Lcom/pinarsu/siparis/ui/fragment/EmptyFragment;
.super Lcom/pinarsu/siparis/ui/fragment/BaseFragment;
.source "EmptyFragment.java"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ParcelCreator"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0}, Lcom/pinarsu/siparis/ui/fragment/BaseFragment;-><init>()V

    .line 23
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .prologue
    .line 67
    const/4 v0, 0x0

    return v0
.end method

.method public getLayoutResource()I
    .locals 1

    .prologue
    .line 57
    const v0, 0x7f030042

    return v0
.end method

.method public onAttach(Landroid/app/Activity;)V
    .locals 0

    .prologue
    .line 47
    invoke-super {p0, p1}, Lcom/pinarsu/siparis/ui/fragment/BaseFragment;->onAttach(Landroid/app/Activity;)V

    .line 48
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 27
    invoke-super {p0, p1}, Lcom/pinarsu/siparis/ui/fragment/BaseFragment;->onCreate(Landroid/os/Bundle;)V

    .line 29
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    .prologue
    .line 34
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/EmptyFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->setTitle(I)V

    .line 35
    invoke-super {p0, p1, p2, p3}, Lcom/pinarsu/siparis/ui/fragment/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v0

    .line 37
    return-object v0
.end method

.method public onDetach()V
    .locals 0

    .prologue
    .line 52
    invoke-super {p0}, Lcom/pinarsu/siparis/ui/fragment/BaseFragment;->onDetach()V

    .line 53
    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 42
    invoke-super {p0, p1, p2}, Lcom/pinarsu/siparis/ui/fragment/BaseFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 43
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .prologue
    .line 73
    return-void
.end method
