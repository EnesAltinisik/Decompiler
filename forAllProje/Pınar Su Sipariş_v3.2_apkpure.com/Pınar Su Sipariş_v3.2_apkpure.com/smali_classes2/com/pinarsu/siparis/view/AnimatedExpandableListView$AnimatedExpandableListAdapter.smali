.class public abstract Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter;
.super Landroid/widget/BaseExpandableListAdapter;
.source "AnimatedExpandableListView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pinarsu/siparis/view/AnimatedExpandableListView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "AnimatedExpandableListAdapter"
.end annotation


# static fields
.field private static final STATE_COLLAPSING:I = 0x2

.field private static final STATE_EXPANDING:I = 0x1

.field private static final STATE_IDLE:I


# instance fields
.field private groupInfo:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray",
            "<",
            "Lcom/pinarsu/siparis/view/AnimatedExpandableListView$GroupInfo;",
            ">;"
        }
    .end annotation
.end field

.field private parent:Lcom/pinarsu/siparis/view/AnimatedExpandableListView;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 265
    invoke-direct {p0}, Landroid/widget/BaseExpandableListAdapter;-><init>()V

    .line 267
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter;->groupInfo:Landroid/util/SparseArray;

    return-void
.end method

.method static synthetic access$000(Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter;Lcom/pinarsu/siparis/view/AnimatedExpandableListView;)V
    .locals 0

    .prologue
    .line 265
    invoke-direct {p0, p1}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter;->setParent(Lcom/pinarsu/siparis/view/AnimatedExpandableListView;)V

    return-void
.end method

.method static synthetic access$100(Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter;II)V
    .locals 0

    .prologue
    .line 265
    invoke-direct {p0, p1, p2}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter;->startExpandAnimation(II)V

    return-void
.end method

.method static synthetic access$200(Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter;II)V
    .locals 0

    .prologue
    .line 265
    invoke-direct {p0, p1, p2}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter;->startCollapseAnimation(II)V

    return-void
.end method

.method static synthetic access$600(Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter;I)V
    .locals 0

    .prologue
    .line 265
    invoke-direct {p0, p1}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter;->stopAnimation(I)V

    return-void
.end method

.method private getGroupInfo(I)Lcom/pinarsu/siparis/view/AnimatedExpandableListView$GroupInfo;
    .locals 2

    .prologue
    .line 293
    iget-object v0, p0, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter;->groupInfo:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$GroupInfo;

    .line 294
    if-nez v0, :cond_0

    .line 295
    new-instance v0, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$GroupInfo;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$GroupInfo;-><init>(Lcom/pinarsu/siparis/view/AnimatedExpandableListView$1;)V

    .line 296
    iget-object v1, p0, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter;->groupInfo:Landroid/util/SparseArray;

    invoke-virtual {v1, p1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 298
    :cond_0
    return-object v0
.end method

.method private setParent(Lcom/pinarsu/siparis/view/AnimatedExpandableListView;)V
    .locals 0

    .prologue
    .line 275
    iput-object p1, p0, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter;->parent:Lcom/pinarsu/siparis/view/AnimatedExpandableListView;

    .line 276
    return-void
.end method

.method private startCollapseAnimation(II)V
    .locals 2

    .prologue
    .line 316
    invoke-direct {p0, p1}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter;->getGroupInfo(I)Lcom/pinarsu/siparis/view/AnimatedExpandableListView$GroupInfo;

    move-result-object v0

    .line 317
    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$GroupInfo;->animating:Z

    .line 318
    iput p2, v0, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$GroupInfo;->firstChildPosition:I

    .line 319
    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$GroupInfo;->expanding:Z

    .line 320
    return-void
.end method

.method private startExpandAnimation(II)V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 308
    invoke-direct {p0, p1}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter;->getGroupInfo(I)Lcom/pinarsu/siparis/view/AnimatedExpandableListView$GroupInfo;

    move-result-object v0

    .line 309
    iput-boolean v1, v0, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$GroupInfo;->animating:Z

    .line 310
    iput p2, v0, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$GroupInfo;->firstChildPosition:I

    .line 311
    iput-boolean v1, v0, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$GroupInfo;->expanding:Z

    .line 312
    return-void
.end method

.method private stopAnimation(I)V
    .locals 2

    .prologue
    .line 323
    invoke-direct {p0, p1}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter;->getGroupInfo(I)Lcom/pinarsu/siparis/view/AnimatedExpandableListView$GroupInfo;

    move-result-object v0

    .line 324
    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$GroupInfo;->animating:Z

    .line 325
    return-void
.end method


# virtual methods
.method protected generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 4

    .prologue
    .line 355
    new-instance v0, Landroid/widget/AbsListView$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Landroid/widget/AbsListView$LayoutParams;-><init>(III)V

    return-object v0
.end method

.method public final getChildType(II)I
    .locals 1

    .prologue
    .line 332
    invoke-direct {p0, p1}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter;->getGroupInfo(I)Lcom/pinarsu/siparis/view/AnimatedExpandableListView$GroupInfo;

    move-result-object v0

    .line 333
    iget-boolean v0, v0, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$GroupInfo;->animating:Z

    if-eqz v0, :cond_0

    .line 336
    const/4 v0, 0x0

    .line 341
    :goto_0
    return v0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter;->getRealChildType(II)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public final getChildTypeCount()I
    .locals 1

    .prologue
    .line 351
    invoke-virtual {p0}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter;->getRealChildTypeCount()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final getChildView(IIZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 17

    .prologue
    .line 368
    invoke-direct/range {p0 .. p1}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter;->getGroupInfo(I)Lcom/pinarsu/siparis/view/AnimatedExpandableListView$GroupInfo;

    move-result-object v13

    .line 370
    iget-boolean v2, v13, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$GroupInfo;->animating:Z

    if-eqz v2, :cond_9

    .line 372
    move-object/from16 v0, p4

    instance-of v2, v0, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$DummyView;

    if-nez v2, :cond_b

    .line 373
    new-instance v10, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$DummyView;

    invoke-virtual/range {p5 .. p5}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v10, v2}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$DummyView;-><init>(Landroid/content/Context;)V

    .line 374
    new-instance v2, Landroid/widget/AbsListView$LayoutParams;

    const/4 v3, -0x1

    const/4 v4, 0x0

    invoke-direct {v2, v3, v4}, Landroid/widget/AbsListView$LayoutParams;-><init>(II)V

    invoke-virtual {v10, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 378
    :goto_0
    iget v2, v13, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$GroupInfo;->firstChildPosition:I

    move/from16 v0, p2

    if-ge v0, v2, :cond_1

    .line 398
    invoke-virtual {v10}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    const/4 v3, 0x0

    iput v3, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 523
    :cond_0
    :goto_1
    return-object v10

    :cond_1
    move-object/from16 v9, p5

    .line 402
    check-cast v9, Landroid/widget/ExpandableListView;

    move-object v8, v10

    .line 404
    check-cast v8, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$DummyView;

    .line 407
    invoke-virtual {v8}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$DummyView;->clearViews()V

    .line 410
    invoke-virtual {v9}, Landroid/widget/ExpandableListView;->getDivider()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 411
    invoke-virtual/range {p5 .. p5}, Landroid/view/ViewGroup;->getMeasuredWidth()I

    move-result v3

    invoke-virtual {v9}, Landroid/widget/ExpandableListView;->getDividerHeight()I

    move-result v4

    .line 410
    invoke-virtual {v8, v2, v3, v4}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$DummyView;->setDivider(Landroid/graphics/drawable/Drawable;II)V

    .line 415
    invoke-virtual/range {p5 .. p5}, Landroid/view/ViewGroup;->getWidth()I

    move-result v2

    const/high16 v3, 0x40000000    # 2.0f

    .line 414
    invoke-static {v2, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v14

    .line 416
    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v2, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v11

    .line 419
    const/4 v12, 0x0

    .line 420
    invoke-virtual/range {p5 .. p5}, Landroid/view/ViewGroup;->getHeight()I

    move-result v15

    .line 422
    invoke-virtual/range {p0 .. p1}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter;->getRealChildrenCount(I)I

    move-result v16

    .line 423
    iget v4, v13, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$GroupInfo;->firstChildPosition:I

    :goto_2
    move/from16 v0, v16

    if-ge v4, v0, :cond_a

    .line 424
    add-int/lit8 v2, v16, -0x1

    if-ne v4, v2, :cond_3

    const/4 v5, 0x1

    :goto_3
    const/4 v6, 0x0

    move-object/from16 v2, p0

    move/from16 v3, p1

    move-object/from16 v7, p5

    invoke-virtual/range {v2 .. v7}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter;->getRealChildView(IIZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 427
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroid/widget/AbsListView$LayoutParams;

    .line 428
    if-nez v2, :cond_2

    .line 429
    invoke-virtual/range {p0 .. p0}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroid/widget/AbsListView$LayoutParams;

    .line 430
    invoke-virtual {v3, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 433
    :cond_2
    iget v2, v2, Landroid/widget/AbsListView$LayoutParams;->height:I

    .line 436
    if-lez v2, :cond_4

    .line 437
    const/high16 v5, 0x40000000    # 2.0f

    invoke-static {v2, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    .line 443
    :goto_4
    invoke-virtual {v3, v14, v2}, Landroid/view/View;->measure(II)V

    .line 444
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    add-int/2addr v12, v2

    .line 446
    if-ge v12, v15, :cond_5

    .line 448
    invoke-virtual {v8, v3}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$DummyView;->addFakeView(Landroid/view/View;)V

    .line 423
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 424
    :cond_3
    const/4 v5, 0x0

    goto :goto_3

    :cond_4
    move v2, v11

    .line 440
    goto :goto_4

    .line 450
    :cond_5
    invoke-virtual {v8, v3}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$DummyView;->addFakeView(Landroid/view/View;)V

    .line 455
    add-int/lit8 v2, v4, 0x1

    div-int v2, v12, v2

    .line 456
    sub-int v3, v16, v4

    add-int/lit8 v3, v3, -0x1

    mul-int/2addr v2, v3

    add-int v5, v12, v2

    .line 462
    :goto_5
    invoke-virtual {v8}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$DummyView;->getTag()Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_6

    const/4 v2, 0x0

    .line 465
    :goto_6
    iget-boolean v3, v13, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$GroupInfo;->expanding:Z

    if-eqz v3, :cond_7

    const/4 v3, 0x1

    if-eq v2, v3, :cond_7

    .line 466
    new-instance v2, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$ExpandAnimation;

    const/4 v4, 0x0

    const/4 v7, 0x0

    move-object v3, v8

    move-object v6, v13

    invoke-direct/range {v2 .. v7}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$ExpandAnimation;-><init>(Landroid/view/View;IILcom/pinarsu/siparis/view/AnimatedExpandableListView$GroupInfo;Lcom/pinarsu/siparis/view/AnimatedExpandableListView$1;)V

    .line 468
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter;->parent:Lcom/pinarsu/siparis/view/AnimatedExpandableListView;

    # invokes: Lcom/pinarsu/siparis/view/AnimatedExpandableListView;->getAnimationDuration()I
    invoke-static {v3}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView;->access$500(Lcom/pinarsu/siparis/view/AnimatedExpandableListView;)I

    move-result v3

    int-to-long v4, v3

    invoke-virtual {v2, v4, v5}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$ExpandAnimation;->setDuration(J)V

    .line 469
    new-instance v3, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter$1;

    move-object/from16 v0, p0

    move/from16 v1, p1

    invoke-direct {v3, v0, v1, v8}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter$1;-><init>(Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter;ILcom/pinarsu/siparis/view/AnimatedExpandableListView$DummyView;)V

    invoke-virtual {v2, v3}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$ExpandAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 487
    invoke-virtual {v8, v2}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$DummyView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 488
    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v8, v2}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$DummyView;->setTag(Ljava/lang/Object;)V

    goto/16 :goto_1

    .line 462
    :cond_6
    check-cast v2, Ljava/lang/Integer;

    .line 463
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    goto :goto_6

    .line 489
    :cond_7
    iget-boolean v3, v13, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$GroupInfo;->expanding:Z

    if-nez v3, :cond_0

    const/4 v3, 0x2

    if-eq v2, v3, :cond_0

    .line 490
    iget v2, v13, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$GroupInfo;->dummyHeight:I

    const/4 v3, -0x1

    if-ne v2, v3, :cond_8

    .line 491
    iput v5, v13, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$GroupInfo;->dummyHeight:I

    .line 494
    :cond_8
    new-instance v2, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$ExpandAnimation;

    iget v4, v13, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$GroupInfo;->dummyHeight:I

    const/4 v5, 0x0

    const/4 v7, 0x0

    move-object v3, v8

    move-object v6, v13

    invoke-direct/range {v2 .. v7}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$ExpandAnimation;-><init>(Landroid/view/View;IILcom/pinarsu/siparis/view/AnimatedExpandableListView$GroupInfo;Lcom/pinarsu/siparis/view/AnimatedExpandableListView$1;)V

    .line 496
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter;->parent:Lcom/pinarsu/siparis/view/AnimatedExpandableListView;

    # invokes: Lcom/pinarsu/siparis/view/AnimatedExpandableListView;->getAnimationDuration()I
    invoke-static {v3}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView;->access$500(Lcom/pinarsu/siparis/view/AnimatedExpandableListView;)I

    move-result v3

    int-to-long v4, v3

    invoke-virtual {v2, v4, v5}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$ExpandAnimation;->setDuration(J)V

    .line 497
    new-instance v3, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter$2;

    move-object/from16 v4, p0

    move/from16 v5, p1

    move-object v6, v9

    move-object v7, v13

    invoke-direct/range {v3 .. v8}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter$2;-><init>(Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter;ILandroid/widget/ExpandableListView;Lcom/pinarsu/siparis/view/AnimatedExpandableListView$GroupInfo;Lcom/pinarsu/siparis/view/AnimatedExpandableListView$DummyView;)V

    invoke-virtual {v2, v3}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$ExpandAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 517
    invoke-virtual {v8, v2}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$DummyView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 518
    const/4 v2, 0x2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v8, v2}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$DummyView;->setTag(Ljava/lang/Object;)V

    goto/16 :goto_1

    .line 523
    :cond_9
    invoke-virtual/range {p0 .. p5}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter;->getRealChildView(IIZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v10

    goto/16 :goto_1

    :cond_a
    move v5, v12

    goto/16 :goto_5

    :cond_b
    move-object/from16 v10, p4

    goto/16 :goto_0
.end method

.method public final getChildrenCount(I)I
    .locals 2

    .prologue
    .line 530
    invoke-direct {p0, p1}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter;->getGroupInfo(I)Lcom/pinarsu/siparis/view/AnimatedExpandableListView$GroupInfo;

    move-result-object v0

    .line 531
    iget-boolean v1, v0, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$GroupInfo;->animating:Z

    if-eqz v1, :cond_0

    .line 532
    iget v0, v0, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$GroupInfo;->firstChildPosition:I

    add-int/lit8 v0, v0, 0x1

    .line 534
    :goto_0
    return v0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter;->getRealChildrenCount(I)I

    move-result v0

    goto :goto_0
.end method

.method public getRealChildType(II)I
    .locals 1

    .prologue
    .line 279
    const/4 v0, 0x0

    return v0
.end method

.method public getRealChildTypeCount()I
    .locals 1

    .prologue
    .line 283
    const/4 v0, 0x1

    return v0
.end method

.method public abstract getRealChildView(IIZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
.end method

.method public abstract getRealChildrenCount(I)I
.end method

.method public notifyGroupExpanded(I)V
    .locals 2

    .prologue
    .line 302
    invoke-direct {p0, p1}, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$AnimatedExpandableListAdapter;->getGroupInfo(I)Lcom/pinarsu/siparis/view/AnimatedExpandableListView$GroupInfo;

    move-result-object v0

    .line 303
    const/4 v1, -0x1

    iput v1, v0, Lcom/pinarsu/siparis/view/AnimatedExpandableListView$GroupInfo;->dummyHeight:I

    .line 304
    return-void
.end method
