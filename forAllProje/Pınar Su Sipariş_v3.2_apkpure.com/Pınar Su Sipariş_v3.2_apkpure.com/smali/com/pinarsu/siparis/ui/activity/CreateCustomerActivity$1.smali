.class Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity$1;
.super Ljava/lang/Object;
.source "CreateCustomerActivity.java"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;


# direct methods
.method constructor <init>(Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;)V
    .locals 0

    .prologue
    .line 124
    iput-object p1, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity$1;->this$0:Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 127
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity$1;->this$0:Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;

    iget-object v0, v0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->cityList:Ljava/util/List;

    if-nez v0, :cond_0

    .line 128
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity$1;->this$0:Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;

    # invokes: Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->getCityList()V
    invoke-static {v0}, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->access$000(Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;)V

    .line 129
    :cond_0
    const/4 v0, 0x0

    return v0
.end method
