.class Lcom/pinarsu/siparis/ui/activity/SurveyPreviewActivity$$ViewInjector$1;
.super Lbutterknife/internal/DebouncingOnClickListener;
.source "SurveyPreviewActivity$$ViewInjector.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pinarsu/siparis/ui/activity/SurveyPreviewActivity$$ViewInjector;->inject(Lbutterknife/ButterKnife$Finder;Lcom/pinarsu/siparis/ui/activity/SurveyPreviewActivity;Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/pinarsu/siparis/ui/activity/SurveyPreviewActivity$$ViewInjector;

.field final synthetic val$target:Lcom/pinarsu/siparis/ui/activity/SurveyPreviewActivity;


# direct methods
.method constructor <init>(Lcom/pinarsu/siparis/ui/activity/SurveyPreviewActivity$$ViewInjector;Lcom/pinarsu/siparis/ui/activity/SurveyPreviewActivity;)V
    .locals 0

    .prologue
    .line 13
    iput-object p1, p0, Lcom/pinarsu/siparis/ui/activity/SurveyPreviewActivity$$ViewInjector$1;->this$0:Lcom/pinarsu/siparis/ui/activity/SurveyPreviewActivity$$ViewInjector;

    iput-object p2, p0, Lcom/pinarsu/siparis/ui/activity/SurveyPreviewActivity$$ViewInjector$1;->val$target:Lcom/pinarsu/siparis/ui/activity/SurveyPreviewActivity;

    invoke-direct {p0}, Lbutterknife/internal/DebouncingOnClickListener;-><init>()V

    return-void
.end method


# virtual methods
.method public doClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 17
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/SurveyPreviewActivity$$ViewInjector$1;->val$target:Lcom/pinarsu/siparis/ui/activity/SurveyPreviewActivity;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/ui/activity/SurveyPreviewActivity;->tvClose()V

    .line 18
    return-void
.end method
