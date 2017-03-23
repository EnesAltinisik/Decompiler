.class public Lat/grabner/circleprogress/f;
.super Ljava/lang/Object;


# direct methods
.method private static a(FFF)I
    .locals 2

    mul-float v0, p0, p2

    const/high16 v1, 0x3f800000    # 1.0f

    sub-float/2addr v1, p2

    mul-float/2addr v1, p1

    add-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    return v0
.end method

.method public static a(IIF)I
    .locals 6

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    const/4 v0, 0x3

    new-array v0, v0, [I

    invoke-static {p0}, Landroid/graphics/Color;->red(I)I

    move-result v1

    int-to-float v1, v1

    invoke-static {p1}, Landroid/graphics/Color;->red(I)I

    move-result v2

    int-to-float v2, v2

    invoke-static {v1, v2, p2}, Lat/grabner/circleprogress/f;->a(FFF)I

    move-result v1

    aput v1, v0, v3

    invoke-static {p0}, Landroid/graphics/Color;->green(I)I

    move-result v1

    int-to-float v1, v1

    invoke-static {p1}, Landroid/graphics/Color;->green(I)I

    move-result v2

    int-to-float v2, v2

    invoke-static {v1, v2, p2}, Lat/grabner/circleprogress/f;->a(FFF)I

    move-result v1

    aput v1, v0, v4

    invoke-static {p0}, Landroid/graphics/Color;->blue(I)I

    move-result v1

    int-to-float v1, v1

    invoke-static {p1}, Landroid/graphics/Color;->blue(I)I

    move-result v2

    int-to-float v2, v2

    invoke-static {v1, v2, p2}, Lat/grabner/circleprogress/f;->a(FFF)I

    move-result v1

    aput v1, v0, v5

    const/16 v1, 0xff

    aget v2, v0, v3

    aget v3, v0, v4

    aget v0, v0, v5

    invoke-static {v1, v2, v3, v0}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    return v0
.end method
