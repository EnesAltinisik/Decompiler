.class Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity$$ViewInjector$2;
.super Lbutterknife/internal/DebouncingOnClickListener;
.source "CreateCustomerActivity$$ViewInjector.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity$$ViewInjector;->inject(Lbutterknife/ButterKnife$Finder;Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity$$ViewInjector;

.field final synthetic val$target:Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;


# direct methods
.method constructor <init>(Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity$$ViewInjector;Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;)V
    .locals 0

    .prologue
    .line 52
    iput-object p1, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity$$ViewInjector$2;->this$0:Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity$$ViewInjector;

    iput-object p2, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity$$ViewInjector$2;->val$target:Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;

    invoke-direct {p0}, Lbutterknife/internal/DebouncingOnClickListener;-><init>()V

    return-void
.end method


# virtual methods
.method public doClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity$$ViewInjector$2;->val$target:Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/ui/activity/CreateCustomerActivity;->clickLinearPrivacyAgreement()V

    .line 57
    return-void
.end method
