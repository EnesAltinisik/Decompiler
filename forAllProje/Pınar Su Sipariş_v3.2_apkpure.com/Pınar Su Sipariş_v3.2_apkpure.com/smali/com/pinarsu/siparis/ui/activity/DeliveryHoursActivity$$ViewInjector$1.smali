.class Lcom/pinarsu/siparis/ui/activity/DeliveryHoursActivity$$ViewInjector$1;
.super Lbutterknife/internal/DebouncingOnClickListener;
.source "DeliveryHoursActivity$$ViewInjector.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pinarsu/siparis/ui/activity/DeliveryHoursActivity$$ViewInjector;->inject(Lbutterknife/ButterKnife$Finder;Lcom/pinarsu/siparis/ui/activity/DeliveryHoursActivity;Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/pinarsu/siparis/ui/activity/DeliveryHoursActivity$$ViewInjector;

.field final synthetic val$target:Lcom/pinarsu/siparis/ui/activity/DeliveryHoursActivity;


# direct methods
.method constructor <init>(Lcom/pinarsu/siparis/ui/activity/DeliveryHoursActivity$$ViewInjector;Lcom/pinarsu/siparis/ui/activity/DeliveryHoursActivity;)V
    .locals 0

    .prologue
    .line 16
    iput-object p1, p0, Lcom/pinarsu/siparis/ui/activity/DeliveryHoursActivity$$ViewInjector$1;->this$0:Lcom/pinarsu/siparis/ui/activity/DeliveryHoursActivity$$ViewInjector;

    iput-object p2, p0, Lcom/pinarsu/siparis/ui/activity/DeliveryHoursActivity$$ViewInjector$1;->val$target:Lcom/pinarsu/siparis/ui/activity/DeliveryHoursActivity;

    invoke-direct {p0}, Lbutterknife/internal/DebouncingOnClickListener;-><init>()V

    return-void
.end method


# virtual methods
.method public doClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 20
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/DeliveryHoursActivity$$ViewInjector$1;->val$target:Lcom/pinarsu/siparis/ui/activity/DeliveryHoursActivity;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/ui/activity/DeliveryHoursActivity;->clickBack()V

    .line 21
    return-void
.end method
