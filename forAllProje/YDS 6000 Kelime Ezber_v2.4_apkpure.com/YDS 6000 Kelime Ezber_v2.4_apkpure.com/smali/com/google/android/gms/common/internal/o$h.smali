.class public final Lcom/google/android/gms/common/internal/o$h;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/common/internal/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "h"
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/common/internal/o;

.field private final b:I


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/internal/o;I)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/common/internal/o$h;->a:Lcom/google/android/gms/common/internal/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/google/android/gms/common/internal/o$h;->b:I

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 5

    const/4 v4, 0x0

    if-nez p2, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/common/internal/o$h;->a:Lcom/google/android/gms/common/internal/o;

    new-instance v1, Lcom/google/android/gms/common/a;

    const/16 v2, 0x8

    const-string v3, "ServiceBroker IBinder is null"

    invoke-direct {v1, v2, v4, v3}, Lcom/google/android/gms/common/a;-><init>(ILandroid/app/PendingIntent;Ljava/lang/String;)V

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/o;->a(Lcom/google/android/gms/common/internal/o;Lcom/google/android/gms/common/a;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/common/internal/o$h;->a:Lcom/google/android/gms/common/internal/o;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/o;->a(Lcom/google/android/gms/common/internal/o;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/common/internal/o$h;->a:Lcom/google/android/gms/common/internal/o;

    invoke-static {p2}, Lcom/google/android/gms/common/internal/ad$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/common/internal/ad;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/o;->a(Lcom/google/android/gms/common/internal/o;Lcom/google/android/gms/common/internal/ad;)Lcom/google/android/gms/common/internal/ad;

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/google/android/gms/common/internal/o$h;->a:Lcom/google/android/gms/common/internal/o;

    const/4 v1, 0x0

    iget v2, p0, Lcom/google/android/gms/common/internal/o$h;->b:I

    invoke-virtual {v0, v1, v4, v2}, Lcom/google/android/gms/common/internal/o;->a(ILandroid/os/Bundle;I)V

    goto :goto_0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/common/internal/o$h;->a:Lcom/google/android/gms/common/internal/o;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/o;->a(Lcom/google/android/gms/common/internal/o;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/common/internal/o$h;->a:Lcom/google/android/gms/common/internal/o;

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/o;->a(Lcom/google/android/gms/common/internal/o;Lcom/google/android/gms/common/internal/ad;)Lcom/google/android/gms/common/internal/ad;

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/google/android/gms/common/internal/o$h;->a:Lcom/google/android/gms/common/internal/o;

    iget-object v0, v0, Lcom/google/android/gms/common/internal/o;->a:Landroid/os/Handler;

    iget-object v1, p0, Lcom/google/android/gms/common/internal/o$h;->a:Lcom/google/android/gms/common/internal/o;

    iget-object v1, v1, Lcom/google/android/gms/common/internal/o;->a:Landroid/os/Handler;

    const/4 v2, 0x4

    iget v3, p0, Lcom/google/android/gms/common/internal/o$h;->b:I

    const/4 v4, 0x1

    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
