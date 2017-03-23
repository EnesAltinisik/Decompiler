.class Landroid/support/design/widget/e;
.super Landroid/support/design/widget/g;
.source "FloatingActionButtonEclairMr1.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/design/widget/e$b;,
        Landroid/support/design/widget/e$c;,
        Landroid/support/design/widget/e$a;
    }
.end annotation


# instance fields
.field a:Landroid/support/design/widget/l;

.field private m:I

.field private n:Landroid/support/design/widget/o;

.field private o:Z


# direct methods
.method constructor <init>(Landroid/support/design/widget/y;Landroid/support/design/widget/m;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 44
    invoke-direct {p0, p1, p2}, Landroid/support/design/widget/g;-><init>(Landroid/support/design/widget/y;Landroid/support/design/widget/m;)V

    .line 46
    invoke-virtual {p1}, Landroid/support/design/widget/y;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const/high16 v1, 0x10e0000

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v0

    iput v0, p0, Landroid/support/design/widget/e;->m:I

    .line 48
    new-instance v0, Landroid/support/design/widget/o;

    invoke-direct {v0}, Landroid/support/design/widget/o;-><init>()V

    iput-object v0, p0, Landroid/support/design/widget/e;->n:Landroid/support/design/widget/o;

    .line 49
    iget-object v0, p0, Landroid/support/design/widget/e;->n:Landroid/support/design/widget/o;

    invoke-virtual {v0, p1}, Landroid/support/design/widget/o;->a(Landroid/view/View;)V

    .line 52
    iget-object v0, p0, Landroid/support/design/widget/e;->n:Landroid/support/design/widget/o;

    sget-object v1, Landroid/support/design/widget/e;->h:[I

    new-instance v2, Landroid/support/design/widget/e$b;

    invoke-direct {v2, p0, v3}, Landroid/support/design/widget/e$b;-><init>(Landroid/support/design/widget/e;Landroid/support/design/widget/e$1;)V

    invoke-direct {p0, v2}, Landroid/support/design/widget/e;->a(Landroid/view/animation/Animation;)Landroid/view/animation/Animation;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/support/design/widget/o;->a([ILandroid/view/animation/Animation;)V

    .line 54
    iget-object v0, p0, Landroid/support/design/widget/e;->n:Landroid/support/design/widget/o;

    sget-object v1, Landroid/support/design/widget/e;->i:[I

    new-instance v2, Landroid/support/design/widget/e$b;

    invoke-direct {v2, p0, v3}, Landroid/support/design/widget/e$b;-><init>(Landroid/support/design/widget/e;Landroid/support/design/widget/e$1;)V

    invoke-direct {p0, v2}, Landroid/support/design/widget/e;->a(Landroid/view/animation/Animation;)Landroid/view/animation/Animation;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/support/design/widget/o;->a([ILandroid/view/animation/Animation;)V

    .line 57
    iget-object v0, p0, Landroid/support/design/widget/e;->n:Landroid/support/design/widget/o;

    sget-object v1, Landroid/support/design/widget/e;->j:[I

    new-instance v2, Landroid/support/design/widget/e$c;

    invoke-direct {v2, p0, v3}, Landroid/support/design/widget/e$c;-><init>(Landroid/support/design/widget/e;Landroid/support/design/widget/e$1;)V

    invoke-direct {p0, v2}, Landroid/support/design/widget/e;->a(Landroid/view/animation/Animation;)Landroid/view/animation/Animation;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/support/design/widget/o;->a([ILandroid/view/animation/Animation;)V

    .line 59
    return-void
.end method

.method private a(Landroid/view/animation/Animation;)Landroid/view/animation/Animation;
    .locals 2

    .prologue
    .line 225
    sget-object v0, Landroid/support/design/widget/a;->b:Landroid/view/animation/Interpolator;

    invoke-virtual {p1, v0}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 226
    iget v0, p0, Landroid/support/design/widget/e;->m:I

    int-to-long v0, v0

    invoke-virtual {p1, v0, v1}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 227
    return-object p1
.end method

.method static synthetic a(Landroid/support/design/widget/e;Z)Z
    .locals 0

    .prologue
    .line 34
    iput-boolean p1, p0, Landroid/support/design/widget/e;->o:Z

    return p1
.end method

.method private static b(I)Landroid/content/res/ColorStateList;
    .locals 5

    .prologue
    const/4 v1, 0x3

    const/4 v4, 0x0

    .line 268
    new-array v0, v1, [[I

    .line 269
    new-array v1, v1, [I

    .line 272
    sget-object v2, Landroid/support/design/widget/e;->i:[I

    aput-object v2, v0, v4

    .line 273
    aput p0, v1, v4

    .line 274
    const/4 v2, 0x1

    .line 276
    sget-object v3, Landroid/support/design/widget/e;->h:[I

    aput-object v3, v0, v2

    .line 277
    aput p0, v1, v2

    .line 278
    const/4 v2, 0x2

    .line 281
    new-array v3, v4, [I

    aput-object v3, v0, v2

    .line 282
    aput v4, v1, v2

    .line 285
    new-instance v2, Landroid/content/res/ColorStateList;

    invoke-direct {v2, v0, v1}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    return-object v2
.end method


# virtual methods
.method a()F
    .locals 1

    .prologue
    .line 127
    iget v0, p0, Landroid/support/design/widget/e;->f:F

    return v0
.end method

.method a(F)V
    .locals 2

    .prologue
    .line 132
    iget-object v0, p0, Landroid/support/design/widget/e;->a:Landroid/support/design/widget/l;

    if-eqz v0, :cond_0

    .line 133
    iget-object v0, p0, Landroid/support/design/widget/e;->a:Landroid/support/design/widget/l;

    iget v1, p0, Landroid/support/design/widget/e;->g:F

    add-float/2addr v1, p1

    invoke-virtual {v0, p1, v1}, Landroid/support/design/widget/l;->a(FF)V

    .line 134
    invoke-virtual {p0}, Landroid/support/design/widget/e;->g()V

    .line 136
    :cond_0
    return-void
.end method

.method a(I)V
    .locals 2

    .prologue
    .line 120
    iget-object v0, p0, Landroid/support/design/widget/e;->c:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 121
    iget-object v0, p0, Landroid/support/design/widget/e;->c:Landroid/graphics/drawable/Drawable;

    invoke-static {p1}, Landroid/support/design/widget/e;->b(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/support/v4/c/a/a;->a(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    .line 123
    :cond_0
    return-void
.end method

.method a(Landroid/content/res/ColorStateList;)V
    .locals 1

    .prologue
    .line 103
    iget-object v0, p0, Landroid/support/design/widget/e;->b:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 104
    iget-object v0, p0, Landroid/support/design/widget/e;->b:Landroid/graphics/drawable/Drawable;

    invoke-static {v0, p1}, Landroid/support/v4/c/a/a;->a(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    .line 106
    :cond_0
    iget-object v0, p0, Landroid/support/design/widget/e;->d:Landroid/support/design/widget/b;

    if-eqz v0, :cond_1

    .line 107
    iget-object v0, p0, Landroid/support/design/widget/e;->d:Landroid/support/design/widget/b;

    invoke-virtual {v0, p1}, Landroid/support/design/widget/b;->a(Landroid/content/res/ColorStateList;)V

    .line 109
    :cond_1
    return-void
.end method

.method a(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    .prologue
    .line 113
    iget-object v0, p0, Landroid/support/design/widget/e;->b:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 114
    iget-object v0, p0, Landroid/support/design/widget/e;->b:Landroid/graphics/drawable/Drawable;

    invoke-static {v0, p1}, Landroid/support/v4/c/a/a;->a(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V

    .line 116
    :cond_0
    return-void
.end method

.method a(Landroid/graphics/Rect;)V
    .locals 1

    .prologue
    .line 221
    iget-object v0, p0, Landroid/support/design/widget/e;->a:Landroid/support/design/widget/l;

    invoke-virtual {v0, p1}, Landroid/support/design/widget/l;->getPadding(Landroid/graphics/Rect;)Z

    .line 222
    return-void
.end method

.method a(Landroid/support/design/widget/g$a;Z)V
    .locals 4

    .prologue
    .line 158
    iget-boolean v0, p0, Landroid/support/design/widget/e;->o:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Landroid/support/design/widget/e;->k:Landroid/support/design/widget/y;

    invoke-virtual {v0}, Landroid/support/design/widget/y;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_2

    .line 160
    :cond_0
    if-eqz p1, :cond_1

    .line 161
    invoke-interface {p1}, Landroid/support/design/widget/g$a;->b()V

    .line 186
    :cond_1
    :goto_0
    return-void

    .line 166
    :cond_2
    iget-object v0, p0, Landroid/support/design/widget/e;->k:Landroid/support/design/widget/y;

    invoke-virtual {v0}, Landroid/support/design/widget/y;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Landroid/support/design/a$a;->design_fab_out:I

    invoke-static {v0, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    .line 168
    sget-object v1, Landroid/support/design/widget/a;->c:Landroid/view/animation/Interpolator;

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 169
    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v2, v3}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 170
    new-instance v1, Landroid/support/design/widget/e$1;

    invoke-direct {v1, p0, p2, p1}, Landroid/support/design/widget/e$1;-><init>(Landroid/support/design/widget/e;ZLandroid/support/design/widget/g$a;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 185
    iget-object v1, p0, Landroid/support/design/widget/e;->k:Landroid/support/design/widget/y;

    invoke-virtual {v1, v0}, Landroid/support/design/widget/y;->startAnimation(Landroid/view/animation/Animation;)V

    goto :goto_0
.end method

.method a([I)V
    .locals 1

    .prologue
    .line 148
    iget-object v0, p0, Landroid/support/design/widget/e;->n:Landroid/support/design/widget/o;

    invoke-virtual {v0, p1}, Landroid/support/design/widget/o;->a([I)V

    .line 149
    return-void
.end method

.method b()V
    .locals 1

    .prologue
    .line 153
    iget-object v0, p0, Landroid/support/design/widget/e;->n:Landroid/support/design/widget/o;

    invoke-virtual {v0}, Landroid/support/design/widget/o;->b()V

    .line 154
    return-void
.end method

.method b(Landroid/support/design/widget/g$a;Z)V
    .locals 4

    .prologue
    .line 190
    iget-object v0, p0, Landroid/support/design/widget/e;->k:Landroid/support/design/widget/y;

    invoke-virtual {v0}, Landroid/support/design/widget/y;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Landroid/support/design/widget/e;->o:Z

    if-eqz v0, :cond_2

    .line 193
    :cond_0
    iget-object v0, p0, Landroid/support/design/widget/e;->k:Landroid/support/design/widget/y;

    invoke-virtual {v0}, Landroid/support/design/widget/y;->clearAnimation()V

    .line 194
    iget-object v0, p0, Landroid/support/design/widget/e;->k:Landroid/support/design/widget/y;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p2}, Landroid/support/design/widget/y;->a(IZ)V

    .line 195
    iget-object v0, p0, Landroid/support/design/widget/e;->k:Landroid/support/design/widget/y;

    invoke-virtual {v0}, Landroid/support/design/widget/y;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Landroid/support/design/a$a;->design_fab_in:I

    invoke-static {v0, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    .line 197
    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v2, v3}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 198
    sget-object v1, Landroid/support/design/widget/a;->d:Landroid/view/animation/Interpolator;

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 199
    new-instance v1, Landroid/support/design/widget/e$2;

    invoke-direct {v1, p0, p1}, Landroid/support/design/widget/e$2;-><init>(Landroid/support/design/widget/e;Landroid/support/design/widget/g$a;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 207
    iget-object v1, p0, Landroid/support/design/widget/e;->k:Landroid/support/design/widget/y;

    invoke-virtual {v1, v0}, Landroid/support/design/widget/y;->startAnimation(Landroid/view/animation/Animation;)V

    .line 213
    :cond_1
    :goto_0
    return-void

    .line 209
    :cond_2
    if-eqz p1, :cond_1

    .line 210
    invoke-interface {p1}, Landroid/support/design/widget/g$a;->a()V

    goto :goto_0
.end method

.method c()V
    .locals 0

    .prologue
    .line 218
    return-void
.end method
