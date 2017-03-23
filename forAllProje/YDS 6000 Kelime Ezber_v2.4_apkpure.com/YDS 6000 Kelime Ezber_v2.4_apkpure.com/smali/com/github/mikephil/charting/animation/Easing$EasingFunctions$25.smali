.class final Lcom/github/mikephil/charting/animation/Easing$EasingFunctions$25;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/github/mikephil/charting/animation/EasingFunction;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/github/mikephil/charting/animation/Easing$EasingFunctions;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getInterpolation(F)F
    .locals 7

    const/high16 v6, 0x40000000    # 2.0f

    const v5, 0x3fc33333    # 1.525f

    const/high16 v3, 0x3f800000    # 1.0f

    const/high16 v4, 0x3f000000    # 0.5f

    const v0, 0x3fd9cd60

    div-float v1, p1, v4

    cmpg-float v2, v1, v3

    if-gez v2, :cond_0

    mul-float v2, v1, v1

    mul-float/2addr v0, v5

    add-float/2addr v3, v0

    mul-float/2addr v1, v3

    sub-float v0, v1, v0

    mul-float/2addr v0, v2

    mul-float/2addr v0, v4

    :goto_0
    return v0

    :cond_0
    sub-float/2addr v1, v6

    mul-float v2, v1, v1

    mul-float/2addr v0, v5

    add-float/2addr v3, v0

    mul-float/2addr v1, v3

    add-float/2addr v0, v1

    mul-float/2addr v0, v2

    add-float/2addr v0, v6

    mul-float/2addr v0, v4

    goto :goto_0
.end method
