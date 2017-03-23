.class Lcom/pinarsu/siparis/ui/fragment/SurveyViewPagerFragment$1;
.super Ljava/lang/Object;
.source "SurveyViewPagerFragment.java"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pinarsu/siparis/ui/fragment/SurveyViewPagerFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/pinarsu/siparis/ui/fragment/SurveyViewPagerFragment;


# direct methods
.method constructor <init>(Lcom/pinarsu/siparis/ui/fragment/SurveyViewPagerFragment;)V
    .locals 0

    .prologue
    .line 115
    iput-object p1, p0, Lcom/pinarsu/siparis/ui/fragment/SurveyViewPagerFragment$1;->this$0:Lcom/pinarsu/siparis/ui/fragment/SurveyViewPagerFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 0

    .prologue
    .line 129
    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .prologue
    .line 119
    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 2

    .prologue
    .line 123
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/SurveyViewPagerFragment$1;->this$0:Lcom/pinarsu/siparis/ui/fragment/SurveyViewPagerFragment;

    # getter for: Lcom/pinarsu/siparis/ui/fragment/SurveyViewPagerFragment;->item:Lcom/pinarsu/siparis/model/data/SORULAR;
    invoke-static {v0}, Lcom/pinarsu/siparis/ui/fragment/SurveyViewPagerFragment;->access$000(Lcom/pinarsu/siparis/ui/fragment/SurveyViewPagerFragment;)Lcom/pinarsu/siparis/model/data/SORULAR;

    move-result-object v0

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/pinarsu/siparis/model/data/SORULAR;->CEVAP_METNI:Ljava/lang/String;

    .line 124
    return-void
.end method
