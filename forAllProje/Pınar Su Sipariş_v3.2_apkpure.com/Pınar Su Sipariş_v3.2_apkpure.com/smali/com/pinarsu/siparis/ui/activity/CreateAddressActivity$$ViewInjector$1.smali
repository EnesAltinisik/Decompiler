.class Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity$$ViewInjector$1;
.super Lbutterknife/internal/DebouncingOnClickListener;
.source "CreateAddressActivity$$ViewInjector.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity$$ViewInjector;->inject(Lbutterknife/ButterKnife$Finder;Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity$$ViewInjector;

.field final synthetic val$target:Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;


# direct methods
.method constructor <init>(Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity$$ViewInjector;Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;)V
    .locals 0

    .prologue
    .line 46
    iput-object p1, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity$$ViewInjector$1;->this$0:Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity$$ViewInjector;

    iput-object p2, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity$$ViewInjector$1;->val$target:Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;

    invoke-direct {p0}, Lbutterknife/internal/DebouncingOnClickListener;-><init>()V

    return-void
.end method


# virtual methods
.method public doClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity$$ViewInjector$1;->val$target:Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/ui/activity/CreateAddressActivity;->clickFrameAddCurrentAddress()V

    .line 51
    return-void
.end method
