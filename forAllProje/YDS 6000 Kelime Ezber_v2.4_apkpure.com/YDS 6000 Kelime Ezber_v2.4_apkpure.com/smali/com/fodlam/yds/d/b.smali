.class public Lcom/fodlam/yds/d/b;
.super Landroid/app/Dialog;


# instance fields
.field a:Landroid/support/v7/app/e;

.field private b:Lcom/google/android/gms/ads/i;


# direct methods
.method public constructor <init>(Lcom/fodlam/yds/c;)V
    .locals 4

    const/16 v3, 0x12c

    const/4 v1, -0x1

    const v0, 0x7f0b0193

    invoke-direct {p0, p1, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    iput-object p1, p0, Lcom/fodlam/yds/d/b;->a:Landroid/support/v7/app/e;

    invoke-virtual {p0}, Lcom/fodlam/yds/d/b;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0, v1, v1}, Landroid/view/Window;->setLayout(II)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/d/b;->requestWindowFeature(I)Z

    const v0, 0x7f04008a

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/d/b;->setContentView(I)V

    invoke-static {}, Lcom/fodlam/yds/c/b;->a()Lcom/fodlam/yds/c/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fodlam/yds/c/b;->g()Lcom/fodlam/yds/f/b;

    move-result-object v1

    const v0, 0x7f1001da

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/d/b;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, v1, Lcom/fodlam/yds/f/b;->a:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ": "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lcom/fodlam/yds/OxfordApplication;->h:Lcom/fodlam/yds/OxfordApplication$a;

    invoke-virtual {v2}, Lcom/fodlam/yds/OxfordApplication$a;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v0, 0x7f1001e3

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/d/b;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/fodlam/yds/d/b$1;

    invoke-direct {v1, p0, p1}, Lcom/fodlam/yds/d/b$1;-><init>(Lcom/fodlam/yds/d/b;Lcom/fodlam/yds/c;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f1001f3

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/d/b;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/fodlam/yds/d/b$2;

    invoke-direct {v1, p0}, Lcom/fodlam/yds/d/b$2;-><init>(Lcom/fodlam/yds/d/b;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p0}, Lcom/fodlam/yds/d/b;->getContext()Landroid/content/Context;

    move-result-object v1

    const v0, 0x7f10013d

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/d/b;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    invoke-static {v1, v0, v3, v3}, Lcom/fodlam/yds/utility/c;->a(Landroid/content/Context;Landroid/view/ViewGroup;II)Lcom/google/android/gms/ads/i;

    move-result-object v0

    iput-object v0, p0, Lcom/fodlam/yds/d/b;->b:Lcom/google/android/gms/ads/i;

    return-void
.end method

.method private a()V
    .locals 1

    invoke-virtual {p0}, Lcom/fodlam/yds/d/b;->dismiss()V

    iget-object v0, p0, Lcom/fodlam/yds/d/b;->a:Landroid/support/v7/app/e;

    invoke-virtual {v0}, Landroid/support/v7/app/e;->finish()V

    return-void
.end method

.method static synthetic a(Lcom/fodlam/yds/d/b;)V
    .locals 0

    invoke-direct {p0}, Lcom/fodlam/yds/d/b;->a()V

    return-void
.end method


# virtual methods
.method public dismiss()V
    .locals 1

    sget-boolean v0, Lcom/fodlam/yds/OxfordApplication;->f:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fodlam/yds/d/b;->b:Lcom/google/android/gms/ads/i;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/i;->c()V

    :cond_0
    invoke-super {p0}, Landroid/app/Dialog;->dismiss()V

    return-void
.end method

.method public onBackPressed()V
    .locals 0

    invoke-direct {p0}, Lcom/fodlam/yds/d/b;->a()V

    return-void
.end method
