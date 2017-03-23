.class public Lcom/fodlam/yds/utility/OxfordViewPager$a;
.super Landroid/widget/Scroller;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fodlam/yds/utility/OxfordViewPager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/fodlam/yds/utility/OxfordViewPager;


# direct methods
.method public constructor <init>(Lcom/fodlam/yds/utility/OxfordViewPager;Landroid/content/Context;)V
    .locals 1

    iput-object p1, p0, Lcom/fodlam/yds/utility/OxfordViewPager$a;->a:Lcom/fodlam/yds/utility/OxfordViewPager;

    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-direct {p0, p2, v0}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V

    return-void
.end method


# virtual methods
.method public startScroll(IIIII)V
    .locals 6

    const/16 v5, 0x258

    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    invoke-super/range {v0 .. v5}, Landroid/widget/Scroller;->startScroll(IIIII)V

    return-void
.end method
