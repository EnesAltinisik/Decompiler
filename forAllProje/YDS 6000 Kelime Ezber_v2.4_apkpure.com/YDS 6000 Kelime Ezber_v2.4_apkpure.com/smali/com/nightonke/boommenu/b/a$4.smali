.class Lcom/nightonke/boommenu/b/a$4;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nightonke/boommenu/b/a;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/nightonke/boommenu/b/a;


# direct methods
.method constructor <init>(Lcom/nightonke/boommenu/b/a;)V
    .locals 0

    iput-object p1, p0, Lcom/nightonke/boommenu/b/a$4;->a:Lcom/nightonke/boommenu/b/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 4

    const/4 v3, 0x0

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    :cond_0
    :goto_0
    return v3

    :pswitch_0
    new-instance v0, Landroid/graphics/PointF;

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    invoke-direct {v0, v1, v2}, Landroid/graphics/PointF;-><init>(FF)V

    iget-object v1, p0, Lcom/nightonke/boommenu/b/a$4;->a:Lcom/nightonke/boommenu/b/a;

    iget-object v1, v1, Lcom/nightonke/boommenu/b/a;->g:Landroid/widget/FrameLayout;

    invoke-static {v0, v1}, Lcom/nightonke/boommenu/e;->a(Landroid/graphics/PointF;Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/nightonke/boommenu/b/a$4;->a:Lcom/nightonke/boommenu/b/a;

    invoke-virtual {v0}, Lcom/nightonke/boommenu/b/a;->E()V

    iget-object v0, p0, Lcom/nightonke/boommenu/b/a$4;->a:Lcom/nightonke/boommenu/b/a;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/nightonke/boommenu/b/a;->f:Z

    goto :goto_0

    :pswitch_1
    new-instance v0, Landroid/graphics/PointF;

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    invoke-direct {v0, v1, v2}, Landroid/graphics/PointF;-><init>(FF)V

    iget-object v1, p0, Lcom/nightonke/boommenu/b/a$4;->a:Lcom/nightonke/boommenu/b/a;

    iget-object v1, v1, Lcom/nightonke/boommenu/b/a;->g:Landroid/widget/FrameLayout;

    invoke-static {v0, v1}, Lcom/nightonke/boommenu/e;->a(Landroid/graphics/PointF;Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/nightonke/boommenu/b/a$4;->a:Lcom/nightonke/boommenu/b/a;

    invoke-virtual {v0}, Lcom/nightonke/boommenu/b/a;->E()V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/nightonke/boommenu/b/a$4;->a:Lcom/nightonke/boommenu/b/a;

    iput-boolean v3, v0, Lcom/nightonke/boommenu/b/a;->f:Z

    iget-object v0, p0, Lcom/nightonke/boommenu/b/a$4;->a:Lcom/nightonke/boommenu/b/a;

    invoke-virtual {v0}, Lcom/nightonke/boommenu/b/a;->F()V

    goto :goto_0

    :pswitch_2
    iget-object v0, p0, Lcom/nightonke/boommenu/b/a$4;->a:Lcom/nightonke/boommenu/b/a;

    iput-boolean v3, v0, Lcom/nightonke/boommenu/b/a;->f:Z

    iget-object v0, p0, Lcom/nightonke/boommenu/b/a$4;->a:Lcom/nightonke/boommenu/b/a;

    invoke-virtual {v0}, Lcom/nightonke/boommenu/b/a;->F()V

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
