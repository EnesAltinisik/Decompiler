.class public Lcom/pinarsu/siparis/view/gestureimageview/Animator;
.super Ljava/lang/Thread;
.source "Animator.java"


# instance fields
.field private active:Z

.field private animation:Lcom/pinarsu/siparis/view/gestureimageview/Animation;

.field private lastTime:J

.field private running:Z

.field private view:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;


# direct methods
.method public constructor <init>(Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;Ljava/lang/String;)V
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 32
    invoke-direct {p0, p2}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    .line 27
    iput-boolean v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/Animator;->running:Z

    .line 28
    iput-boolean v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/Animator;->active:Z

    .line 29
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/Animator;->lastTime:J

    .line 33
    iput-object p1, p0, Lcom/pinarsu/siparis/view/gestureimageview/Animator;->view:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;

    .line 34
    return-void
.end method


# virtual methods
.method public declared-synchronized activate()V
    .locals 2

    .prologue
    .line 88
    monitor-enter p0

    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/Animator;->lastTime:J

    .line 89
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/Animator;->active:Z

    .line 90
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 91
    monitor-exit p0

    return-void

    .line 88
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public cancel()V
    .locals 1

    .prologue
    .line 94
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/Animator;->active:Z

    .line 95
    return-void
.end method

.method public declared-synchronized finish()V
    .locals 1

    .prologue
    .line 73
    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    iput-boolean v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/Animator;->running:Z

    .line 74
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/Animator;->active:Z

    .line 75
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    monitor-exit p0

    return-void

    .line 73
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public play(Lcom/pinarsu/siparis/view/gestureimageview/Animation;)V
    .locals 1

    .prologue
    .line 79
    iget-boolean v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/Animator;->active:Z

    if-eqz v0, :cond_0

    .line 80
    invoke-virtual {p0}, Lcom/pinarsu/siparis/view/gestureimageview/Animator;->cancel()V

    .line 82
    :cond_0
    iput-object p1, p0, Lcom/pinarsu/siparis/view/gestureimageview/Animator;->animation:Lcom/pinarsu/siparis/view/gestureimageview/Animation;

    .line 84
    invoke-virtual {p0}, Lcom/pinarsu/siparis/view/gestureimageview/Animator;->activate()V

    .line 85
    return-void
.end method

.method public run()V
    .locals 6

    .prologue
    .line 39
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/Animator;->running:Z

    .line 41
    :goto_0
    iget-boolean v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/Animator;->running:Z

    if-eqz v0, :cond_4

    .line 43
    :cond_0
    :goto_1
    iget-boolean v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/Animator;->active:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/Animator;->animation:Lcom/pinarsu/siparis/view/gestureimageview/Animation;

    if-eqz v0, :cond_2

    .line 44
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 45
    iget-object v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/Animator;->animation:Lcom/pinarsu/siparis/view/gestureimageview/Animation;

    iget-object v3, p0, Lcom/pinarsu/siparis/view/gestureimageview/Animator;->view:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;

    iget-wide v4, p0, Lcom/pinarsu/siparis/view/gestureimageview/Animator;->lastTime:J

    sub-long v4, v0, v4

    invoke-interface {v2, v3, v4, v5}, Lcom/pinarsu/siparis/view/gestureimageview/Animation;->update(Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;J)Z

    move-result v2

    iput-boolean v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/Animator;->active:Z

    .line 46
    iget-object v2, p0, Lcom/pinarsu/siparis/view/gestureimageview/Animator;->view:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;

    invoke-virtual {v2}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->redraw()V

    .line 47
    iput-wide v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/Animator;->lastTime:J

    .line 49
    :cond_1
    :goto_2
    iget-boolean v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/Animator;->active:Z

    if-eqz v0, :cond_0

    .line 51
    :try_start_0
    iget-object v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/Animator;->view:Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;

    const-wide/16 v2, 0x20

    invoke-virtual {v0, v2, v3}, Lcom/pinarsu/siparis/view/gestureimageview/GestureImageView;->waitForDraw(J)Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    .line 55
    :catch_0
    move-exception v0

    .line 56
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/Animator;->active:Z

    goto :goto_2

    .line 61
    :cond_2
    monitor-enter p0

    .line 62
    :try_start_1
    iget-boolean v0, p0, Lcom/pinarsu/siparis/view/gestureimageview/Animator;->running:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_3

    .line 64
    :try_start_2
    invoke-virtual {p0}, Ljava/lang/Object;->wait()V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 68
    :cond_3
    :goto_3
    :try_start_3
    monitor-exit p0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0

    .line 66
    :catch_1
    move-exception v0

    goto :goto_3

    .line 70
    :cond_4
    return-void
.end method
