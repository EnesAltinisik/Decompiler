.class Landroid/support/v4/c/a/d;
.super Ljava/lang/Object;
.source "DrawableCompatEclair.java"


# direct methods
.method public static a(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
    .locals 1

    .prologue
    .line 26
    instance-of v0, p0, Landroid/support/v4/c/a/o;

    if-nez v0, :cond_0

    .line 27
    new-instance v0, Landroid/support/v4/c/a/k;

    invoke-direct {v0, p0}, Landroid/support/v4/c/a/k;-><init>(Landroid/graphics/drawable/Drawable;)V

    move-object p0, v0

    .line 29
    :cond_0
    return-object p0
.end method
