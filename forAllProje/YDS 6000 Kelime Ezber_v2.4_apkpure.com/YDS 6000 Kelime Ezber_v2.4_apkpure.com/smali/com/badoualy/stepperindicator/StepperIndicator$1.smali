.class Lcom/badoualy/stepperindicator/StepperIndicator$1;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/badoualy/stepperindicator/StepperIndicator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/badoualy/stepperindicator/StepperIndicator;


# direct methods
.method constructor <init>(Lcom/badoualy/stepperindicator/StepperIndicator;)V
    .locals 0

    iput-object p1, p0, Lcom/badoualy/stepperindicator/StepperIndicator$1;->a:Lcom/badoualy/stepperindicator/StepperIndicator;

    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onSingleTapConfirmed(Landroid/view/MotionEvent;)Z
    .locals 5

    const/4 v2, -0x1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    iget-object v0, p0, Lcom/badoualy/stepperindicator/StepperIndicator$1;->a:Lcom/badoualy/stepperindicator/StepperIndicator;

    invoke-virtual {v0}, Lcom/badoualy/stepperindicator/StepperIndicator;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Lcom/badoualy/stepperindicator/StepperIndicator$1;->a:Lcom/badoualy/stepperindicator/StepperIndicator;

    invoke-static {v0}, Lcom/badoualy/stepperindicator/StepperIndicator;->a(Lcom/badoualy/stepperindicator/StepperIndicator;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_2

    iget-object v0, p0, Lcom/badoualy/stepperindicator/StepperIndicator$1;->a:Lcom/badoualy/stepperindicator/StepperIndicator;

    invoke-static {v0}, Lcom/badoualy/stepperindicator/StepperIndicator;->a(Lcom/badoualy/stepperindicator/StepperIndicator;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/RectF;

    invoke-virtual {v0, v3, v4}, Landroid/graphics/RectF;->contains(FF)Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_1
    if-eq v1, v2, :cond_1

    iget-object v0, p0, Lcom/badoualy/stepperindicator/StepperIndicator$1;->a:Lcom/badoualy/stepperindicator/StepperIndicator;

    invoke-static {v0}, Lcom/badoualy/stepperindicator/StepperIndicator;->b(Lcom/badoualy/stepperindicator/StepperIndicator;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/badoualy/stepperindicator/StepperIndicator$a;

    invoke-interface {v0, v1}, Lcom/badoualy/stepperindicator/StepperIndicator$a;->a(I)V

    goto :goto_2

    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_1
    invoke-super {p0, p1}, Landroid/view/GestureDetector$SimpleOnGestureListener;->onSingleTapConfirmed(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0

    :cond_2
    move v1, v2

    goto :goto_1
.end method
