.class La/a/a/a/a$a$1;
.super Ljava/lang/Object;
.source "ActivityLifecycleManager.java"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/a/a/a/a$a;->a(La/a/a/a/a$b;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:La/a/a/a/a$b;

.field final synthetic b:La/a/a/a/a$a;


# direct methods
.method constructor <init>(La/a/a/a/a$a;La/a/a/a/a$b;)V
    .locals 0

    .prologue
    .line 102
    iput-object p1, p0, La/a/a/a/a$a$1;->b:La/a/a/a/a$a;

    iput-object p2, p0, La/a/a/a/a$a$1;->a:La/a/a/a/a$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 106
    iget-object v0, p0, La/a/a/a/a$a$1;->a:La/a/a/a/a$b;

    invoke-virtual {v0, p1, p2}, La/a/a/a/a$b;->onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V

    .line 107
    return-void
.end method

.method public onActivityDestroyed(Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 137
    iget-object v0, p0, La/a/a/a/a$a$1;->a:La/a/a/a/a$b;

    invoke-virtual {v0, p1}, La/a/a/a/a$b;->onActivityDestroyed(Landroid/app/Activity;)V

    .line 138
    return-void
.end method

.method public onActivityPaused(Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 121
    iget-object v0, p0, La/a/a/a/a$a$1;->a:La/a/a/a/a$b;

    invoke-virtual {v0, p1}, La/a/a/a/a$b;->onActivityPaused(Landroid/app/Activity;)V

    .line 122
    return-void
.end method

.method public onActivityResumed(Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 116
    iget-object v0, p0, La/a/a/a/a$a$1;->a:La/a/a/a/a$b;

    invoke-virtual {v0, p1}, La/a/a/a/a$b;->onActivityResumed(Landroid/app/Activity;)V

    .line 117
    return-void
.end method

.method public onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 132
    iget-object v0, p0, La/a/a/a/a$a$1;->a:La/a/a/a/a$b;

    invoke-virtual {v0, p1, p2}, La/a/a/a/a$b;->onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V

    .line 133
    return-void
.end method

.method public onActivityStarted(Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 111
    iget-object v0, p0, La/a/a/a/a$a$1;->a:La/a/a/a/a$b;

    invoke-virtual {v0, p1}, La/a/a/a/a$b;->onActivityStarted(Landroid/app/Activity;)V

    .line 112
    return-void
.end method

.method public onActivityStopped(Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 126
    iget-object v0, p0, La/a/a/a/a$a$1;->a:La/a/a/a/a$b;

    invoke-virtual {v0, p1}, La/a/a/a/a$b;->onActivityStopped(Landroid/app/Activity;)V

    .line 127
    return-void
.end method
