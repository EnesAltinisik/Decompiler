.class Lcom/fodlam/yds/a/h$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fodlam/yds/a/h;->a(Landroid/view/ViewGroup;I)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fodlam/yds/a/h;


# direct methods
.method constructor <init>(Lcom/fodlam/yds/a/h;)V
    .locals 0

    iput-object p1, p0, Lcom/fodlam/yds/a/h$1;->a:Lcom/fodlam/yds/a/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 4

    const/4 v3, 0x1

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-ne v0, v3, :cond_0

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getX()F

    move-result v1

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v2

    mul-int/lit8 v2, v2, 0x3

    div-int/lit8 v2, v2, 0x4

    int-to-float v2, v2

    add-float/2addr v1, v2

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    iget-object v0, p0, Lcom/fodlam/yds/a/h$1;->a:Lcom/fodlam/yds/a/h;

    iget-object v0, v0, Lcom/fodlam/yds/a/h;->b:Lcom/fodlam/yds/WordLearningActivity;

    invoke-virtual {v0, v3}, Lcom/fodlam/yds/WordLearningActivity;->b(I)V

    :cond_0
    :goto_0
    const/4 v0, 0x0

    return v0

    :cond_1
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getX()F

    move-result v1

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v2

    mul-int/lit8 v2, v2, 0x1

    div-int/lit8 v2, v2, 0x4

    int-to-float v2, v2

    add-float/2addr v1, v2

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    iget-object v0, p0, Lcom/fodlam/yds/a/h$1;->a:Lcom/fodlam/yds/a/h;

    iget-object v0, v0, Lcom/fodlam/yds/a/h;->b:Lcom/fodlam/yds/WordLearningActivity;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Lcom/fodlam/yds/WordLearningActivity;->b(I)V

    goto :goto_0
.end method
