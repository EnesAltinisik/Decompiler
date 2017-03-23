.class Lcom/balysv/materialripple/a$2;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/balysv/materialripple/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/balysv/materialripple/a;


# direct methods
.method constructor <init>(Lcom/balysv/materialripple/a;)V
    .locals 0

    iput-object p1, p0, Lcom/balysv/materialripple/a$2;->a:Lcom/balysv/materialripple/a;

    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onDown(Landroid/view/MotionEvent;)Z
    .locals 2

    iget-object v0, p0, Lcom/balysv/materialripple/a$2;->a:Lcom/balysv/materialripple/a;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/balysv/materialripple/a;->a(Lcom/balysv/materialripple/a;Z)Z

    invoke-super {p0, p1}, Landroid/view/GestureDetector$SimpleOnGestureListener;->onDown(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method

.method public onLongPress(Landroid/view/MotionEvent;)V
    .locals 2

    iget-object v0, p0, Lcom/balysv/materialripple/a$2;->a:Lcom/balysv/materialripple/a;

    iget-object v1, p0, Lcom/balysv/materialripple/a$2;->a:Lcom/balysv/materialripple/a;

    invoke-static {v1}, Lcom/balysv/materialripple/a;->a(Lcom/balysv/materialripple/a;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->performLongClick()Z

    move-result v1

    invoke-static {v0, v1}, Lcom/balysv/materialripple/a;->a(Lcom/balysv/materialripple/a;Z)Z

    iget-object v0, p0, Lcom/balysv/materialripple/a$2;->a:Lcom/balysv/materialripple/a;

    invoke-static {v0}, Lcom/balysv/materialripple/a;->b(Lcom/balysv/materialripple/a;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/balysv/materialripple/a$2;->a:Lcom/balysv/materialripple/a;

    invoke-static {v0}, Lcom/balysv/materialripple/a;->c(Lcom/balysv/materialripple/a;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/balysv/materialripple/a$2;->a:Lcom/balysv/materialripple/a;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/balysv/materialripple/a;->a(Lcom/balysv/materialripple/a;Ljava/lang/Runnable;)V

    :cond_0
    iget-object v0, p0, Lcom/balysv/materialripple/a$2;->a:Lcom/balysv/materialripple/a;

    invoke-static {v0}, Lcom/balysv/materialripple/a;->d(Lcom/balysv/materialripple/a;)V

    :cond_1
    return-void
.end method
