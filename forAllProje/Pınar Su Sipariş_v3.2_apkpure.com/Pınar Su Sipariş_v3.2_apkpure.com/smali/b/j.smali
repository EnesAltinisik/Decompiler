.class public Lb/j;
.super Lb/t;
.source "ForwardingTimeout.java"


# instance fields
.field private a:Lb/t;


# direct methods
.method public constructor <init>(Lb/t;)V
    .locals 2

    .prologue
    .line 25
    invoke-direct {p0}, Lb/t;-><init>()V

    .line 26
    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "delegate == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 27
    :cond_0
    iput-object p1, p0, Lb/j;->a:Lb/t;

    .line 28
    return-void
.end method


# virtual methods
.method public final a(Lb/t;)Lb/j;
    .locals 2

    .prologue
    .line 36
    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "delegate == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 37
    :cond_0
    iput-object p1, p0, Lb/j;->a:Lb/t;

    .line 38
    return-object p0
.end method

.method public final a()Lb/t;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lb/j;->a:Lb/t;

    return-object v0
.end method

.method public clearDeadline()Lb/t;
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Lb/j;->a:Lb/t;

    invoke-virtual {v0}, Lb/t;->clearDeadline()Lb/t;

    move-result-object v0

    return-object v0
.end method

.method public clearTimeout()Lb/t;
    .locals 1

    .prologue
    .line 62
    iget-object v0, p0, Lb/j;->a:Lb/t;

    invoke-virtual {v0}, Lb/t;->clearTimeout()Lb/t;

    move-result-object v0

    return-object v0
.end method

.method public deadlineNanoTime()J
    .locals 2

    .prologue
    .line 54
    iget-object v0, p0, Lb/j;->a:Lb/t;

    invoke-virtual {v0}, Lb/t;->deadlineNanoTime()J

    move-result-wide v0

    return-wide v0
.end method

.method public deadlineNanoTime(J)Lb/t;
    .locals 1

    .prologue
    .line 58
    iget-object v0, p0, Lb/j;->a:Lb/t;

    invoke-virtual {v0, p1, p2}, Lb/t;->deadlineNanoTime(J)Lb/t;

    move-result-object v0

    return-object v0
.end method

.method public hasDeadline()Z
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lb/j;->a:Lb/t;

    invoke-virtual {v0}, Lb/t;->hasDeadline()Z

    move-result v0

    return v0
.end method

.method public throwIfReached()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 70
    iget-object v0, p0, Lb/j;->a:Lb/t;

    invoke-virtual {v0}, Lb/t;->throwIfReached()V

    .line 71
    return-void
.end method

.method public timeout(JLjava/util/concurrent/TimeUnit;)Lb/t;
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lb/j;->a:Lb/t;

    invoke-virtual {v0, p1, p2, p3}, Lb/t;->timeout(JLjava/util/concurrent/TimeUnit;)Lb/t;

    move-result-object v0

    return-object v0
.end method

.method public timeoutNanos()J
    .locals 2

    .prologue
    .line 46
    iget-object v0, p0, Lb/j;->a:Lb/t;

    invoke-virtual {v0}, Lb/t;->timeoutNanos()J

    move-result-wide v0

    return-wide v0
.end method
