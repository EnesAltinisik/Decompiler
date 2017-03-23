.class Lcom/pinarsu/siparis/view/AnimatedExpandableListView$DummyView;
.super Landroid/view/View;
.source "AnimatedExpandableListView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pinarsu/siparis/view/AnimatedExpandableListView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "DummyView"
.end annotation


# instance fields
.field private divider:Landroid/graphics/drawable/Drawable;

.field private dividerHeight:I

.field private dividerWidth:I

.field private views:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 547
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 541
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$DummyView;->views:Ljava/util/List;

    .line 548
    return-void
.end method


# virtual methods
.method public addFakeView(Landroid/view/View;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 567
    invoke-virtual {p0}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$DummyView;->getWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    invoke-virtual {p1, v2, v2, v0, v1}, Landroid/view/View;->layout(IIII)V

    .line 568
    iget-object v0, p0, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$DummyView;->views:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 569
    return-void
.end method

.method public clearViews()V
    .locals 1

    .prologue
    .line 584
    iget-object v0, p0, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$DummyView;->views:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 585
    return-void
.end method

.method public dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 7

    .prologue
    const/4 v6, 0x0

    const/4 v2, 0x0

    .line 589
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 590
    iget-object v0, p0, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$DummyView;->divider:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 591
    iget-object v0, p0, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$DummyView;->divider:Landroid/graphics/drawable/Drawable;

    iget v1, p0, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$DummyView;->dividerWidth:I

    iget v3, p0, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$DummyView;->dividerHeight:I

    invoke-virtual {v0, v2, v2, v1, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 594
    :cond_0
    iget-object v0, p0, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$DummyView;->views:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    move v1, v2

    .line 595
    :goto_0
    if-ge v1, v3, :cond_2

    .line 596
    iget-object v0, p0, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$DummyView;->views:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 598
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 599
    invoke-virtual {p0}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$DummyView;->getWidth()I

    move-result v4

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v5

    invoke-virtual {p1, v2, v2, v4, v5}, Landroid/graphics/Canvas;->clipRect(IIII)Z

    .line 600
    invoke-virtual {v0, p1}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    .line 601
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 603
    iget-object v4, p0, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$DummyView;->divider:Landroid/graphics/drawable/Drawable;

    if-eqz v4, :cond_1

    .line 604
    iget-object v4, p0, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$DummyView;->divider:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v4, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 605
    iget v4, p0, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$DummyView;->dividerHeight:I

    int-to-float v4, v4

    invoke-virtual {p1, v6, v4}, Landroid/graphics/Canvas;->translate(FF)V

    .line 608
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p1, v6, v0}, Landroid/graphics/Canvas;->translate(FF)V

    .line 595
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 611
    :cond_2
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 612
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 5

    .prologue
    .line 574
    invoke-super/range {p0 .. p5}, Landroid/view/View;->onLayout(ZIIII)V

    .line 575
    iget-object v0, p0, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$DummyView;->views:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    .line 576
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v2, :cond_0

    .line 577
    iget-object v0, p0, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$DummyView;->views:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 578
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v3

    add-int/2addr v3, p2

    .line 579
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v4

    add-int/2addr v4, p3

    .line 578
    invoke-virtual {v0, p2, p3, v3, v4}, Landroid/view/View;->layout(IIII)V

    .line 576
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 581
    :cond_0
    return-void
.end method

.method public setDivider(Landroid/graphics/drawable/Drawable;II)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 552
    if-eqz p1, :cond_0

    .line 553
    iput-object p1, p0, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$DummyView;->divider:Landroid/graphics/drawable/Drawable;

    .line 554
    iput p2, p0, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$DummyView;->dividerWidth:I

    .line 555
    iput p3, p0, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$DummyView;->dividerHeight:I

    .line 557
    invoke-virtual {p1, v0, v0, p2, p3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 559
    :cond_0
    return-void
.end method
