.class public interface abstract Lcom/google/firebase/database/RunLoop;
.super Ljava/lang/Object;


# virtual methods
.method public abstract restart()V
.end method

.method public abstract schedule(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
.end method

.method public abstract scheduleNow(Ljava/lang/Runnable;)V
.end method

.method public abstract shutdown()V
.end method
