.class final Lcom/github/mikephil/charting/animation/Easing$EasingFunctions$27;
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
    .locals 2

    const/high16 v1, 0x40f20000    # 7.5625f

    const v0, 0x3eba2e8c

    cmpg-float v0, p1, v0

    if-gez v0, :cond_0

    mul-float v0, v1, p1

    mul-float/2addr v0, p1

    :goto_0
    return v0

    :cond_0
    const v0, 0x3f3a2e8c

    cmpg-float v0, p1, v0

    if-gez v0, :cond_1

    const v0, 0x3f0ba2e9

    sub-float v0, p1, v0

    mul-float/2addr v1, v0

    mul-float/2addr v0, v1

    const/high16 v1, 0x3f400000    # 0.75f

    add-float/2addr v0, v1

    goto :goto_0

    :cond_1
    const v0, 0x3f68ba2f

    cmpg-float v0, p1, v0

    if-gez v0, :cond_2

    const v0, 0x3f51745d

    sub-float v0, p1, v0

    mul-float/2addr v1, v0

    mul-float/2addr v0, v1

    const/high16 v1, 0x3f700000    # 0.9375f

    add-float/2addr v0, v1

    goto :goto_0

    :cond_2
    const v0, 0x3f745d17

    sub-float v0, p1, v0

    mul-float/2addr v1, v0

    mul-float/2addr v0, v1

    const/high16 v1, 0x3f7c0000    # 0.984375f

    add-float/2addr v0, v1

    goto :goto_0
.end method
