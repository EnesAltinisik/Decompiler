.class Landroid/support/v7/c/l$1;
.super Landroid/content/BroadcastReceiver;
.source "RegisteredMediaRouteProviderWatcher.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/c/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/support/v7/c/l;


# direct methods
.method constructor <init>(Landroid/support/v7/c/l;)V
    .locals 0

    .prologue
    .line 139
    iput-object p1, p0, Landroid/support/v7/c/l$1;->a:Landroid/support/v7/c/l;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    .prologue
    .line 142
    iget-object v0, p0, Landroid/support/v7/c/l$1;->a:Landroid/support/v7/c/l;

    invoke-static {v0}, Landroid/support/v7/c/l;->a(Landroid/support/v7/c/l;)V

    .line 143
    return-void
.end method
