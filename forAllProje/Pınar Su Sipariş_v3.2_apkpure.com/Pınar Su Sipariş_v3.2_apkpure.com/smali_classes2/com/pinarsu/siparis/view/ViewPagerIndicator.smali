.class public Lcom/pinarsu/siparis/view/ViewPagerIndicator;
.super Landroid/widget/LinearLayout;
.source "ViewPagerIndicator.java"

# interfaces
.implements Landroid/support/v4/view/ViewPager$f;


# static fields
.field public static final DEFAULT_INDICATOR_SPACING:I = 0x5


# instance fields
.field private activePosition:I

.field private delegatePageSelectionListener:Lcom/pinarsu/siparis/interfaces/IIndicatorPageSelectionListener;

.field private indicatorSpacing:I

.field private userDefinedPageChangeListener:Landroid/support/v4/view/ViewPager$f;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 35
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/pinarsu/siparis/view/ViewPagerIndicator;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 36
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 39
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/pinarsu/siparis/view/ViewPagerIndicator;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 40
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 43
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 45
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    sget-object v1, Lcom/pinarsu/siparis/R$styleable;->CirclePageIndicator:[I

    invoke-virtual {v0, p2, v1, v2, v2}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v1

    .line 48
    const/4 v0, 0x0

    const/4 v2, 0x5

    :try_start_0
    invoke-virtual {v1, v0, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/pinarsu/siparis/view/ViewPagerIndicator;->indicatorSpacing:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 54
    invoke-direct {p0}, Lcom/pinarsu/siparis/view/ViewPagerIndicator;->init()V

    .line 55
    return-void

    .line 51
    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    throw v0
.end method

.method private addIndicator(I)V
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 79
    move v0, v1

    :goto_0
    if-ge v0, p1, :cond_0

    .line 80
    new-instance v2, Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/pinarsu/siparis/view/ViewPagerIndicator;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 81
    invoke-virtual {p0}, Lcom/pinarsu/siparis/view/ViewPagerIndicator;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f080068

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v3

    float-to-int v3, v3

    .line 84
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v4, v3, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 86
    iget v3, p0, Lcom/pinarsu/siparis/view/ViewPagerIndicator;->indicatorSpacing:I

    iput v3, v4, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 87
    iget v3, p0, Lcom/pinarsu/siparis/view/ViewPagerIndicator;->indicatorSpacing:I

    iput v3, v4, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 93
    const v3, 0x7f0200fe

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 94
    invoke-virtual {p0, v2, v4}, Lcom/pinarsu/siparis/view/ViewPagerIndicator;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 79
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 97
    :cond_0
    if-lez p1, :cond_1

    .line 98
    invoke-virtual {p0, v1}, Lcom/pinarsu/siparis/view/ViewPagerIndicator;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    const v1, 0x7f0200fc

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 100
    :cond_1
    return-void
.end method

.method private dp2px(F)I
    .locals 1

    .prologue
    .line 124
    invoke-virtual {p0}, Lcom/pinarsu/siparis/view/ViewPagerIndicator;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v0, p1

    float-to-int v0, v0

    return v0
.end method

.method private getOnPageChangeListener(Landroid/support/v4/view/ViewPager;)Landroid/support/v4/view/ViewPager$f;
    .locals 2

    .prologue
    .line 112
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "mOnPageChangeListener"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    .line 113
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 114
    invoke-virtual {v0, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ViewPager$f;
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1

    .line 120
    :goto_0
    return-object v0

    .line 115
    :catch_0
    move-exception v0

    .line 116
    invoke-virtual {v0}, Ljava/lang/NoSuchFieldException;->printStackTrace()V

    .line 120
    :goto_1
    const/4 v0, 0x0

    goto :goto_0

    .line 117
    :catch_1
    move-exception v0

    .line 118
    invoke-virtual {v0}, Ljava/lang/IllegalAccessException;->printStackTrace()V

    goto :goto_1
.end method

.method private init()V
    .locals 2

    .prologue
    const/4 v1, -0x1

    .line 63
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/view/ViewPagerIndicator;->setOrientation(I)V

    .line 64
    invoke-virtual {p0}, Lcom/pinarsu/siparis/view/ViewPagerIndicator;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    instance-of v0, v0, Landroid/widget/FrameLayout$LayoutParams;

    if-nez v0, :cond_0

    .line 65
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v0, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 67
    const v1, 0x800053

    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 68
    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/view/ViewPagerIndicator;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 70
    :cond_0
    return-void
.end method

.method private updateIndicator(I)V
    .locals 2

    .prologue
    .line 103
    iget v0, p0, Lcom/pinarsu/siparis/view/ViewPagerIndicator;->activePosition:I

    if-eq v0, p1, :cond_0

    .line 104
    iget v0, p0, Lcom/pinarsu/siparis/view/ViewPagerIndicator;->activePosition:I

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/view/ViewPagerIndicator;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    const v1, 0x7f0200fe

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 105
    invoke-virtual {p0, p1}, Lcom/pinarsu/siparis/view/ViewPagerIndicator;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    const v1, 0x7f0200fc

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 106
    iput p1, p0, Lcom/pinarsu/siparis/view/ViewPagerIndicator;->activePosition:I

    .line 108
    :cond_0
    return-void
.end method


# virtual methods
.method public onPageScrollStateChanged(I)V
    .locals 1

    .prologue
    .line 150
    iget-object v0, p0, Lcom/pinarsu/siparis/view/ViewPagerIndicator;->userDefinedPageChangeListener:Landroid/support/v4/view/ViewPager$f;

    if-eqz v0, :cond_0

    .line 151
    iget-object v0, p0, Lcom/pinarsu/siparis/view/ViewPagerIndicator;->userDefinedPageChangeListener:Landroid/support/v4/view/ViewPager$f;

    invoke-interface {v0, p1}, Landroid/support/v4/view/ViewPager$f;->onPageScrollStateChanged(I)V

    .line 153
    :cond_0
    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 1

    .prologue
    .line 130
    iget-object v0, p0, Lcom/pinarsu/siparis/view/ViewPagerIndicator;->userDefinedPageChangeListener:Landroid/support/v4/view/ViewPager$f;

    if-eqz v0, :cond_0

    .line 131
    iget-object v0, p0, Lcom/pinarsu/siparis/view/ViewPagerIndicator;->userDefinedPageChangeListener:Landroid/support/v4/view/ViewPager$f;

    invoke-interface {v0, p1, p2, p3}, Landroid/support/v4/view/ViewPager$f;->onPageScrolled(IFI)V

    .line 135
    :cond_0
    return-void
.end method

.method public onPageSelected(I)V
    .locals 3

    .prologue
    .line 139
    invoke-direct {p0, p1}, Lcom/pinarsu/siparis/view/ViewPagerIndicator;->updateIndicator(I)V

    .line 140
    iget-object v0, p0, Lcom/pinarsu/siparis/view/ViewPagerIndicator;->userDefinedPageChangeListener:Landroid/support/v4/view/ViewPager$f;

    if-eqz v0, :cond_0

    .line 141
    iget-object v0, p0, Lcom/pinarsu/siparis/view/ViewPagerIndicator;->userDefinedPageChangeListener:Landroid/support/v4/view/ViewPager$f;

    invoke-interface {v0, p1}, Landroid/support/v4/view/ViewPager$f;->onPageSelected(I)V

    .line 143
    :cond_0
    iget-object v0, p0, Lcom/pinarsu/siparis/view/ViewPagerIndicator;->delegatePageSelectionListener:Lcom/pinarsu/siparis/interfaces/IIndicatorPageSelectionListener;

    if-eqz v0, :cond_1

    .line 144
    iget-object v0, p0, Lcom/pinarsu/siparis/view/ViewPagerIndicator;->delegatePageSelectionListener:Lcom/pinarsu/siparis/interfaces/IIndicatorPageSelectionListener;

    invoke-interface {v0, p1}, Lcom/pinarsu/siparis/interfaces/IIndicatorPageSelectionListener;->onPageSelected(I)V

    .line 145
    :cond_1
    const-string v0, "MNTTAG"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onPageSelected : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 146
    return-void
.end method

.method public setDelegatePageSelectionListener(Lcom/pinarsu/siparis/interfaces/IIndicatorPageSelectionListener;)V
    .locals 0

    .prologue
    .line 58
    iput-object p1, p0, Lcom/pinarsu/siparis/view/ViewPagerIndicator;->delegatePageSelectionListener:Lcom/pinarsu/siparis/interfaces/IIndicatorPageSelectionListener;

    .line 60
    return-void
.end method

.method public setViewPager(Landroid/support/v4/view/ViewPager;)V
    .locals 1

    .prologue
    .line 73
    invoke-direct {p0, p1}, Lcom/pinarsu/siparis/view/ViewPagerIndicator;->getOnPageChangeListener(Landroid/support/v4/view/ViewPager;)Landroid/support/v4/view/ViewPager$f;

    move-result-object v0

    iput-object v0, p0, Lcom/pinarsu/siparis/view/ViewPagerIndicator;->userDefinedPageChangeListener:Landroid/support/v4/view/ViewPager$f;

    .line 74
    invoke-virtual {p1, p0}, Landroid/support/v4/view/ViewPager;->setOnPageChangeListener(Landroid/support/v4/view/ViewPager$f;)V

    .line 75
    invoke-virtual {p1}, Landroid/support/v4/view/ViewPager;->getAdapter()Landroid/support/v4/view/ac;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/view/ac;->getCount()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/pinarsu/siparis/view/ViewPagerIndicator;->addIndicator(I)V

    .line 76
    return-void
.end method
