.class Lcom/pinarsu/siparis/ui/activity/SendVerificationCodeActivity$$ViewInjector$2;
.super Lbutterknife/internal/DebouncingOnClickListener;
.source "SendVerificationCodeActivity$$ViewInjector.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pinarsu/siparis/ui/activity/SendVerificationCodeActivity$$ViewInjector;->inject(Lbutterknife/ButterKnife$Finder;Lcom/pinarsu/siparis/ui/activity/SendVerificationCodeActivity;Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/pinarsu/siparis/ui/activity/SendVerificationCodeActivity$$ViewInjector;

.field final synthetic val$target:Lcom/pinarsu/siparis/ui/activity/SendVerificationCodeActivity;


# direct methods
.method constructor <init>(Lcom/pinarsu/siparis/ui/activity/SendVerificationCodeActivity$$ViewInjector;Lcom/pinarsu/siparis/ui/activity/SendVerificationCodeActivity;)V
    .locals 0

    .prologue
    .line 24
    iput-object p1, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationCodeActivity$$ViewInjector$2;->this$0:Lcom/pinarsu/siparis/ui/activity/SendVerificationCodeActivity$$ViewInjector;

    iput-object p2, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationCodeActivity$$ViewInjector$2;->val$target:Lcom/pinarsu/siparis/ui/activity/SendVerificationCodeActivity;

    invoke-direct {p0}, Lbutterknife/internal/DebouncingOnClickListener;-><init>()V

    return-void
.end method


# virtual methods
.method public doClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 28
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SendVerificationCodeActivity$$ViewInjector$2;->val$target:Lcom/pinarsu/siparis/ui/activity/SendVerificationCodeActivity;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/ui/activity/SendVerificationCodeActivity;->clickBtnSendCode()V

    .line 29
    return-void
.end method
