.class final Lcom/balysv/materialripple/a$b;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/balysv/materialripple/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lcom/balysv/materialripple/a;

.field private final b:Landroid/view/MotionEvent;


# direct methods
.method public constructor <init>(Lcom/balysv/materialripple/a;Landroid/view/MotionEvent;)V
    .locals 0

    iput-object p1, p0, Lcom/balysv/materialripple/a$b;->a:Lcom/balysv/materialripple/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/balysv/materialripple/a$b;->b:Landroid/view/MotionEvent;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/balysv/materialripple/a$b;->a:Lcom/balysv/materialripple/a;

    invoke-static {v0, v1}, Lcom/balysv/materialripple/a;->b(Lcom/balysv/materialripple/a;Z)Z

    iget-object v0, p0, Lcom/balysv/materialripple/a$b;->a:Lcom/balysv/materialripple/a;

    invoke-static {v0}, Lcom/balysv/materialripple/a;->a(Lcom/balysv/materialripple/a;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setLongClickable(Z)V

    iget-object v0, p0, Lcom/balysv/materialripple/a$b;->a:Lcom/balysv/materialripple/a;

    invoke-static {v0}, Lcom/balysv/materialripple/a;->a(Lcom/balysv/materialripple/a;)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/balysv/materialripple/a$b;->b:Landroid/view/MotionEvent;

    invoke-virtual {v0, v1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    iget-object v0, p0, Lcom/balysv/materialripple/a$b;->a:Lcom/balysv/materialripple/a;

    invoke-static {v0}, Lcom/balysv/materialripple/a;->a(Lcom/balysv/materialripple/a;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setPressed(Z)V

    iget-object v0, p0, Lcom/balysv/materialripple/a$b;->a:Lcom/balysv/materialripple/a;

    invoke-static {v0}, Lcom/balysv/materialripple/a;->c(Lcom/balysv/materialripple/a;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/balysv/materialripple/a$b;->a:Lcom/balysv/materialripple/a;

    invoke-static {v0}, Lcom/balysv/materialripple/a;->k(Lcom/balysv/materialripple/a;)V

    :cond_0
    return-void
.end method
