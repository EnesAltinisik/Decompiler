.class Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity$1;
.super Ljava/lang/Object;
.source "CreateAddressActivity.java"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;


# direct methods
.method constructor <init>(Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;)V
    .locals 0

    .prologue
    .line 135
    iput-object p1, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity$1;->this$0:Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 138
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity$1;->this$0:Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;

    iget-object v0, v0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->cityList:Ljava/util/List;

    if-nez v0, :cond_0

    .line 139
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity$1;->this$0:Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;

    # invokes: Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->getCityList()V
    invoke-static {v0}, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->access$000(Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;)V

    .line 140
    :cond_0
    const/4 v0, 0x0

    return v0
.end method
