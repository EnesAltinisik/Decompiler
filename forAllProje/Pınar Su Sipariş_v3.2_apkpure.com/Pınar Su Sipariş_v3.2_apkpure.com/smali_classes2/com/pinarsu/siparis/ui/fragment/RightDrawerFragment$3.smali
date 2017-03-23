.class Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment$3;
.super Ljava/lang/Object;
.source "RightDrawerFragment.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;->onResponse(Lcom/pinarsu/siparis/api/service/ServiceItem;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;


# direct methods
.method constructor <init>(Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;)V
    .locals 0

    .prologue
    .line 167
    iput-object p1, p0, Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment$3;->this$0:Lcom/pinarsu/siparis/ui/fragment/RightDrawerFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 170
    const/4 v0, 0x1

    sput-boolean v0, Lcom/pinarsu/siparis/Preferences;->HOME_ORDER_POPUP_VIEWED:Z

    .line 171
    invoke-static {}, Lcom/pinarsu/siparis/MyApplication;->getInstance()Lcom/pinarsu/siparis/MyApplication;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pinarsu/siparis/MyApplication;->getPreferences()Lcom/pinarsu/siparis/Preferences;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pinarsu/siparis/Preferences;->save()V

    .line 172
    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 173
    return-void
.end method
