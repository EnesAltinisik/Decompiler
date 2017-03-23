.class public Lcom/arlib/floatingsearchview/util/view/SearchInputView;
.super Landroid/widget/EditText;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/arlib/floatingsearchview/util/view/SearchInputView$b;,
        Lcom/arlib/floatingsearchview/util/view/SearchInputView$a;
    }
.end annotation


# instance fields
.field private a:Lcom/arlib/floatingsearchview/util/view/SearchInputView$b;

.field private b:Lcom/arlib/floatingsearchview/util/view/SearchInputView$a;

.field private c:Landroid/view/View$OnKeyListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0, p1}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    new-instance v0, Lcom/arlib/floatingsearchview/util/view/SearchInputView$1;

    invoke-direct {v0, p0}, Lcom/arlib/floatingsearchview/util/view/SearchInputView$1;-><init>(Lcom/arlib/floatingsearchview/util/view/SearchInputView;)V

    iput-object v0, p0, Lcom/arlib/floatingsearchview/util/view/SearchInputView;->c:Landroid/view/View$OnKeyListener;

    invoke-direct {p0}, Lcom/arlib/floatingsearchview/util/view/SearchInputView;->a()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Landroid/widget/EditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    new-instance v0, Lcom/arlib/floatingsearchview/util/view/SearchInputView$1;

    invoke-direct {v0, p0}, Lcom/arlib/floatingsearchview/util/view/SearchInputView$1;-><init>(Lcom/arlib/floatingsearchview/util/view/SearchInputView;)V

    iput-object v0, p0, Lcom/arlib/floatingsearchview/util/view/SearchInputView;->c:Landroid/view/View$OnKeyListener;

    invoke-direct {p0}, Lcom/arlib/floatingsearchview/util/view/SearchInputView;->a()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/EditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance v0, Lcom/arlib/floatingsearchview/util/view/SearchInputView$1;

    invoke-direct {v0, p0}, Lcom/arlib/floatingsearchview/util/view/SearchInputView$1;-><init>(Lcom/arlib/floatingsearchview/util/view/SearchInputView;)V

    iput-object v0, p0, Lcom/arlib/floatingsearchview/util/view/SearchInputView;->c:Landroid/view/View$OnKeyListener;

    invoke-direct {p0}, Lcom/arlib/floatingsearchview/util/view/SearchInputView;->a()V

    return-void
.end method

.method static synthetic a(Lcom/arlib/floatingsearchview/util/view/SearchInputView;)Lcom/arlib/floatingsearchview/util/view/SearchInputView$b;
    .locals 1

    iget-object v0, p0, Lcom/arlib/floatingsearchview/util/view/SearchInputView;->a:Lcom/arlib/floatingsearchview/util/view/SearchInputView$b;

    return-object v0
.end method

.method private a()V
    .locals 1

    iget-object v0, p0, Lcom/arlib/floatingsearchview/util/view/SearchInputView;->c:Landroid/view/View$OnKeyListener;

    invoke-virtual {p0, v0}, Lcom/arlib/floatingsearchview/util/view/SearchInputView;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    return-void
.end method


# virtual methods
.method public onKeyPreIme(ILandroid/view/KeyEvent;)Z
    .locals 2

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/arlib/floatingsearchview/util/view/SearchInputView;->b:Lcom/arlib/floatingsearchview/util/view/SearchInputView$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arlib/floatingsearchview/util/view/SearchInputView;->b:Lcom/arlib/floatingsearchview/util/view/SearchInputView$a;

    invoke-interface {v0}, Lcom/arlib/floatingsearchview/util/view/SearchInputView$a;->a()V

    :cond_0
    invoke-super {p0, p1, p2}, Landroid/widget/EditText;->onKeyPreIme(ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

.method public setOnKeyboardDismissedListener(Lcom/arlib/floatingsearchview/util/view/SearchInputView$a;)V
    .locals 0

    iput-object p1, p0, Lcom/arlib/floatingsearchview/util/view/SearchInputView;->b:Lcom/arlib/floatingsearchview/util/view/SearchInputView$a;

    return-void
.end method

.method public setOnSearchKeyListener(Lcom/arlib/floatingsearchview/util/view/SearchInputView$b;)V
    .locals 0

    iput-object p1, p0, Lcom/arlib/floatingsearchview/util/view/SearchInputView;->a:Lcom/arlib/floatingsearchview/util/view/SearchInputView$b;

    return-void
.end method
