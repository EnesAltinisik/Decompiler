.class Lcom/pinarsu/siparis/ui/fragment/ProfileFragment$1;
.super Ljava/lang/Object;
.source "ProfileFragment.java"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pinarsu/siparis/ui/fragment/ProfileFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/pinarsu/siparis/ui/fragment/ProfileFragment;


# direct methods
.method constructor <init>(Lcom/pinarsu/siparis/ui/fragment/ProfileFragment;)V
    .locals 0

    .prologue
    .line 91
    iput-object p1, p0, Lcom/pinarsu/siparis/ui/fragment/ProfileFragment$1;->this$0:Lcom/pinarsu/siparis/ui/fragment/ProfileFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 1

    .prologue
    .line 94
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/ProfileFragment$1;->this$0:Lcom/pinarsu/siparis/ui/fragment/ProfileFragment;

    # invokes: Lcom/pinarsu/siparis/ui/fragment/ProfileFragment;->changeStatus(Z)V
    invoke-static {v0, p2}, Lcom/pinarsu/siparis/ui/fragment/ProfileFragment;->access$000(Lcom/pinarsu/siparis/ui/fragment/ProfileFragment;Z)V

    .line 95
    return-void
.end method
