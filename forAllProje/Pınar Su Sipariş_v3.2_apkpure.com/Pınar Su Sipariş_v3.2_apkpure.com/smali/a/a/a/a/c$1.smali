.class La/a/a/a/c$1;
.super La/a/a/a/a$b;
.source "Fabric.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/a/a/a/c;->j()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:La/a/a/a/c;


# direct methods
.method constructor <init>(La/a/a/a/c;)V
    .locals 0

    .prologue
    .line 365
    iput-object p1, p0, La/a/a/a/c$1;->a:La/a/a/a/c;

    invoke-direct {p0}, La/a/a/a/a$b;-><init>()V

    return-void
.end method


# virtual methods
.method public onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 369
    iget-object v0, p0, La/a/a/a/c$1;->a:La/a/a/a/c;

    invoke-virtual {v0, p1}, La/a/a/a/c;->a(Landroid/app/Activity;)La/a/a/a/c;

    .line 370
    return-void
.end method

.method public onActivityResumed(Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 379
    iget-object v0, p0, La/a/a/a/c$1;->a:La/a/a/a/c;

    invoke-virtual {v0, p1}, La/a/a/a/c;->a(Landroid/app/Activity;)La/a/a/a/c;

    .line 380
    return-void
.end method

.method public onActivityStarted(Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 374
    iget-object v0, p0, La/a/a/a/c$1;->a:La/a/a/a/c;

    invoke-virtual {v0, p1}, La/a/a/a/c;->a(Landroid/app/Activity;)La/a/a/a/c;

    .line 375
    return-void
.end method
