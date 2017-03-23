.class public Lcom/fodlam/yds/d/a;
.super Landroid/app/Dialog;


# instance fields
.field public a:Landroid/widget/ImageButton;

.field public b:Landroid/widget/ImageButton;

.field public c:Landroid/widget/ImageButton;

.field d:I

.field e:Lcom/fodlam/yds/c;

.field f:Landroid/content/SharedPreferences;

.field private g:Lcom/google/android/gms/ads/i;


# direct methods
.method public constructor <init>(Lcom/fodlam/yds/c;)V
    .locals 4

    const/16 v3, 0x12c

    const/4 v2, 0x1

    const/4 v1, -0x1

    const v0, 0x7f0b0193

    invoke-direct {p0, p1, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    iput v2, p0, Lcom/fodlam/yds/d/a;->d:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/fodlam/yds/d/a;->g:Lcom/google/android/gms/ads/i;

    iput-object p1, p0, Lcom/fodlam/yds/d/a;->e:Lcom/fodlam/yds/c;

    invoke-virtual {p0}, Lcom/fodlam/yds/d/a;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0, v1, v1}, Landroid/view/Window;->setLayout(II)V

    invoke-virtual {p0, v2}, Lcom/fodlam/yds/d/a;->requestWindowFeature(I)Z

    const v0, 0x7f040082

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/d/a;->setContentView(I)V

    const v0, 0x7f1001e3

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/d/a;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/fodlam/yds/d/a;->a:Landroid/widget/ImageButton;

    const v0, 0x7f1001e4

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/d/a;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/fodlam/yds/d/a;->b:Landroid/widget/ImageButton;

    const v0, 0x7f1001e5

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/d/a;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/fodlam/yds/d/a;->c:Landroid/widget/ImageButton;

    iget-object v0, p0, Lcom/fodlam/yds/d/a;->a:Landroid/widget/ImageButton;

    new-instance v1, Lcom/fodlam/yds/d/a$1;

    invoke-direct {v1, p0, p1}, Lcom/fodlam/yds/d/a$1;-><init>(Lcom/fodlam/yds/d/a;Lcom/fodlam/yds/c;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lcom/fodlam/yds/d/a;->b:Landroid/widget/ImageButton;

    new-instance v1, Lcom/fodlam/yds/d/a$2;

    invoke-direct {v1, p0, p1}, Lcom/fodlam/yds/d/a$2;-><init>(Lcom/fodlam/yds/d/a;Lcom/fodlam/yds/c;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lcom/fodlam/yds/d/a;->c:Landroid/widget/ImageButton;

    new-instance v1, Lcom/fodlam/yds/d/a$3;

    invoke-direct {v1, p0, p1}, Lcom/fodlam/yds/d/a$3;-><init>(Lcom/fodlam/yds/d/a;Lcom/fodlam/yds/c;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    sget-boolean v0, Lcom/fodlam/yds/OxfordApplication;->f:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/fodlam/yds/d/a;->getContext()Landroid/content/Context;

    move-result-object v1

    const v0, 0x7f10013d

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/d/a;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    invoke-static {v1, v0, v3, v3}, Lcom/fodlam/yds/utility/c;->a(Landroid/content/Context;Landroid/view/ViewGroup;II)Lcom/google/android/gms/ads/i;

    move-result-object v0

    iput-object v0, p0, Lcom/fodlam/yds/d/a;->g:Lcom/google/android/gms/ads/i;

    :cond_0
    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 9

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-static {}, Lcom/fodlam/yds/c/b;->a()Lcom/fodlam/yds/c/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fodlam/yds/c/b;->g()Lcom/fodlam/yds/f/b;

    move-result-object v2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, v2, Lcom/fodlam/yds/f/b;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/fodlam/yds/OxfordApplication;->h:Lcom/fodlam/yds/OxfordApplication$a;

    invoke-virtual {v1}, Lcom/fodlam/yds/OxfordApplication$a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {p1}, Lcom/fodlam/yds/utility/c;->a(I)I

    move-result v4

    invoke-static {v4}, Lcom/fodlam/yds/utility/c;->b(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Lcom/fodlam/yds/d/a;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lcom/fodlam/yds/d/a;->f:Landroid/content/SharedPreferences;

    mul-int/lit8 v1, p1, 0x64

    iget-object v0, p0, Lcom/fodlam/yds/d/a;->f:Landroid/content/SharedPreferences;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v7, v2, Lcom/fodlam/yds/f/b;->a:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    sget-object v7, Lcom/fodlam/yds/OxfordApplication;->h:Lcom/fodlam/yds/OxfordApplication$a;

    invoke-virtual {v7}, Lcom/fodlam/yds/OxfordApplication$a;->a()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "highscore"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    invoke-interface {v0, v6, v7}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    if-le v1, v0, :cond_0

    iget-object v0, p0, Lcom/fodlam/yds/d/a;->f:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, v2, Lcom/fodlam/yds/f/b;->a:Ljava/lang/String;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v6, Lcom/fodlam/yds/OxfordApplication;->h:Lcom/fodlam/yds/OxfordApplication$a;

    invoke-virtual {v6}, Lcom/fodlam/yds/OxfordApplication$a;->a()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v6, "highscore"

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move v0, v1

    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v6, p0, Lcom/fodlam/yds/d/a;->e:Lcom/fodlam/yds/c;

    const v7, 0x7f090397

    invoke-virtual {v6, v7}, Lcom/fodlam/yds/c;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v6, ": "

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v6, p0, Lcom/fodlam/yds/d/a;->e:Lcom/fodlam/yds/c;

    const v7, 0x7f090330

    invoke-virtual {v6, v7}, Lcom/fodlam/yds/c;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v6, ": "

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const v0, 0x7f1001da

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/d/a;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v0, 0x7f1001dc

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/d/a;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v0, 0x7f1001e1

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/d/a;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v0, 0x7f1001e2

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/d/a;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    if-lez v4, :cond_1

    const v0, 0x7f1001de

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/d/a;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/view/View;->setAlpha(F)V

    const/4 v0, 0x1

    if-le v4, v0, :cond_1

    const v0, 0x7f1001df

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/d/a;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/view/View;->setAlpha(F)V

    const/4 v0, 0x2

    if-le v4, v0, :cond_1

    const v0, 0x7f1001e0

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/d/a;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/view/View;->setAlpha(F)V

    :cond_1
    return-void
.end method

.method public dismiss()V
    .locals 1

    iget-object v0, p0, Lcom/fodlam/yds/d/a;->g:Lcom/google/android/gms/ads/i;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fodlam/yds/d/a;->g:Lcom/google/android/gms/ads/i;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/i;->c()V

    :cond_0
    invoke-super {p0}, Landroid/app/Dialog;->dismiss()V

    return-void
.end method

.method public onBackPressed()V
    .locals 0

    return-void
.end method
