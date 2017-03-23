.class public Lcom/pinarsu/siparis/tools/ToastHelper;
.super Ljava/lang/Object;
.source "ToastHelper.java"


# instance fields
.field private activity:Landroid/app/Activity;

.field context:Landroid/content/Context;

.field private message:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/pinarsu/siparis/tools/ToastHelper;->activity:Landroid/app/Activity;

    .line 23
    iput-object p2, p0, Lcom/pinarsu/siparis/tools/ToastHelper;->message:Ljava/lang/String;

    .line 24
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/pinarsu/siparis/tools/ToastHelper;->context:Landroid/content/Context;

    .line 28
    iput-object p2, p0, Lcom/pinarsu/siparis/tools/ToastHelper;->message:Ljava/lang/String;

    .line 29
    return-void
.end method

.method static synthetic access$000(Lcom/pinarsu/siparis/tools/ToastHelper;)Landroid/app/Activity;
    .locals 1

    .prologue
    .line 16
    iget-object v0, p0, Lcom/pinarsu/siparis/tools/ToastHelper;->activity:Landroid/app/Activity;

    return-object v0
.end method

.method static synthetic access$100(Lcom/pinarsu/siparis/tools/ToastHelper;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 16
    iget-object v0, p0, Lcom/pinarsu/siparis/tools/ToastHelper;->message:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public show()V
    .locals 2

    .prologue
    .line 32
    iget-object v0, p0, Lcom/pinarsu/siparis/tools/ToastHelper;->activity:Landroid/app/Activity;

    new-instance v1, Lcom/pinarsu/siparis/tools/ToastHelper$1;

    invoke-direct {v1, p0}, Lcom/pinarsu/siparis/tools/ToastHelper$1;-><init>(Lcom/pinarsu/siparis/tools/ToastHelper;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 40
    return-void
.end method
