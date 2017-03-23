.class public Lcom/fodlam/yds/c;
.super Landroid/support/v7/app/e;


# instance fields
.field private m:I

.field public s:Lcom/google/firebase/a/a;

.field t:Lcom/google/android/gms/ads/g;

.field u:Lcom/fodlam/yds/d/a;

.field v:J

.field w:I

.field x:Ljava/lang/Class;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/support/v7/app/e;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/fodlam/yds/c;->s:Lcom/google/firebase/a/a;

    const/4 v0, 0x0

    iput v0, p0, Lcom/fodlam/yds/c;->m:I

    return-void
.end method

.method static synthetic a(Lcom/fodlam/yds/c;)V
    .locals 0

    invoke-direct {p0}, Lcom/fodlam/yds/c;->j()V

    return-void
.end method

.method private j()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/ads/c$a;

    invoke-direct {v0}, Lcom/google/android/gms/ads/c$a;-><init>()V

    sget-object v1, Lcom/google/android/gms/ads/c;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/c$a;->b(Ljava/lang/String;)Lcom/google/android/gms/ads/c$a;

    move-result-object v0

    const-string v1, "C9B31154FD5A55FF4A275F4A3F3BB278"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/c$a;->b(Ljava/lang/String;)Lcom/google/android/gms/ads/c$a;

    move-result-object v0

    const-string v1, "59D066C8530C98987ECD6E439C59A14F"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/c$a;->b(Ljava/lang/String;)Lcom/google/android/gms/ads/c$a;

    move-result-object v0

    const-string v1, "A9D382793880830FCEED935DA3BBFA59"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/c$a;->b(Ljava/lang/String;)Lcom/google/android/gms/ads/c$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/ads/c$a;->a()Lcom/google/android/gms/ads/c;

    move-result-object v0

    iget-object v1, p0, Lcom/fodlam/yds/c;->t:Lcom/google/android/gms/ads/g;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/ads/g;->a(Lcom/google/android/gms/ads/c;)V

    return-void
.end method


# virtual methods
.method public a(ILjava/lang/Class;)V
    .locals 1

    iput p1, p0, Lcom/fodlam/yds/c;->w:I

    iput-object p2, p0, Lcom/fodlam/yds/c;->x:Ljava/lang/Class;

    iget-object v0, p0, Lcom/fodlam/yds/c;->t:Lcom/google/android/gms/ads/g;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fodlam/yds/c;->t:Lcom/google/android/gms/ads/g;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/g;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fodlam/yds/c;->t:Lcom/google/android/gms/ads/g;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/g;->b()V

    :goto_0
    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/fodlam/yds/c;->k()V

    goto :goto_0
.end method

.method protected c(I)V
    .locals 1

    iget-object v0, p0, Lcom/fodlam/yds/c;->u:Lcom/fodlam/yds/d/a;

    invoke-virtual {v0, p1}, Lcom/fodlam/yds/d/a;->a(I)V

    iget-object v0, p0, Lcom/fodlam/yds/c;->u:Lcom/fodlam/yds/d/a;

    invoke-virtual {v0}, Lcom/fodlam/yds/d/a;->show()V

    return-void
.end method

.method public k()V
    .locals 2

    iget-object v0, p0, Lcom/fodlam/yds/c;->u:Lcom/fodlam/yds/d/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fodlam/yds/c;->u:Lcom/fodlam/yds/d/a;

    invoke-virtual {v0}, Lcom/fodlam/yds/d/a;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fodlam/yds/c;->u:Lcom/fodlam/yds/d/a;

    invoke-virtual {v0}, Lcom/fodlam/yds/d/a;->dismiss()V

    :cond_0
    iget v0, p0, Lcom/fodlam/yds/c;->w:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/fodlam/yds/c;->x:Ljava/lang/Class;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/c;->startActivity(Landroid/content/Intent;)V

    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/fodlam/yds/c;->finish()V

    return-void

    :cond_2
    iget v0, p0, Lcom/fodlam/yds/c;->w:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    new-instance v0, Landroid/content/Intent;

    sget-object v1, Lcom/fodlam/yds/OxfordApplication;->h:Lcom/fodlam/yds/OxfordApplication$a;

    iget-object v1, v1, Lcom/fodlam/yds/OxfordApplication$a;->i:Ljava/lang/Class;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/fodlam/yds/c;->startActivity(Landroid/content/Intent;)V

    goto :goto_0
.end method

.method public onBackPressed()V
    .locals 2

    iget v0, p0, Lcom/fodlam/yds/c;->m:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/fodlam/yds/c;->m:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    new-instance v0, Lcom/fodlam/yds/d/b;

    invoke-direct {v0, p0}, Lcom/fodlam/yds/d/b;-><init>(Lcom/fodlam/yds/c;)V

    invoke-virtual {v0}, Lcom/fodlam/yds/d/b;->show()V

    :cond_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 4

    invoke-super {p0, p1}, Landroid/support/v7/app/e;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lcom/fodlam/yds/c;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/fodlam/yds/OxfordApplication;->e(Landroid/content/Context;)V

    invoke-virtual {p0}, Lcom/fodlam/yds/c;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x80

    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    sget-boolean v0, Lcom/fodlam/yds/OxfordApplication;->f:Z

    if-eqz v0, :cond_0

    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v0

    const-wide v2, 0x3fd3333333333333L    # 0.3

    cmpg-double v0, v0, v2

    if-gtz v0, :cond_0

    new-instance v0, Lcom/google/android/gms/ads/g;

    invoke-direct {v0, p0}, Lcom/google/android/gms/ads/g;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/fodlam/yds/c;->t:Lcom/google/android/gms/ads/g;

    iget-object v0, p0, Lcom/fodlam/yds/c;->t:Lcom/google/android/gms/ads/g;

    const v1, 0x7f090331

    invoke-virtual {p0, v1}, Lcom/fodlam/yds/c;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/g;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/fodlam/yds/c;->t:Lcom/google/android/gms/ads/g;

    new-instance v1, Lcom/fodlam/yds/c$1;

    invoke-direct {v1, p0}, Lcom/fodlam/yds/c$1;-><init>(Lcom/fodlam/yds/c;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/g;->a(Lcom/google/android/gms/ads/a;)V

    invoke-direct {p0}, Lcom/fodlam/yds/c;->j()V

    :cond_0
    new-instance v0, Lcom/fodlam/yds/d/a;

    invoke-direct {v0, p0}, Lcom/fodlam/yds/d/a;-><init>(Lcom/fodlam/yds/c;)V

    iput-object v0, p0, Lcom/fodlam/yds/c;->u:Lcom/fodlam/yds/d/a;

    invoke-virtual {p0}, Lcom/fodlam/yds/c;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/fodlam/yds/utility/b;->a(Landroid/content/Context;)Lcom/fodlam/yds/utility/b;

    iget-object v0, p0, Lcom/fodlam/yds/c;->s:Lcom/google/firebase/a/a;

    if-nez v0, :cond_1

    invoke-static {p0}, Lcom/google/firebase/a/a;->a(Landroid/content/Context;)Lcom/google/firebase/a/a;

    move-result-object v0

    iput-object v0, p0, Lcom/fodlam/yds/c;->s:Lcom/google/firebase/a/a;

    :cond_1
    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/fodlam/yds/c;->v:J

    invoke-super {p0, p1}, Landroid/support/v7/app/e;->onCreateOptionsMenu(Landroid/view/Menu;)Z

    move-result v0

    return v0
.end method

.method protected onDestroy()V
    .locals 8

    invoke-static {p0}, Lcom/fodlam/yds/c/a;->a(Landroid/content/Context;)Lcom/fodlam/yds/c/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fodlam/yds/c/a;->f()Lcom/fodlam/yds/f/f;

    move-result-object v1

    iget v2, v1, Lcom/fodlam/yds/f/f;->b:I

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iget-wide v6, p0, Lcom/fodlam/yds/c;->v:J

    sub-long/2addr v4, v6

    long-to-int v3, v4

    div-int/lit16 v3, v3, 0x3e8

    add-int/2addr v2, v3

    iput v2, v1, Lcom/fodlam/yds/f/f;->b:I

    invoke-virtual {v0, v1}, Lcom/fodlam/yds/c/a;->b(Lcom/fodlam/yds/f/f;)I

    invoke-super {p0}, Landroid/support/v7/app/e;->onDestroy()V

    return-void
.end method

.method protected onResume()V
    .locals 3

    invoke-super {p0}, Landroid/support/v7/app/e;->onResume()V

    iget-object v0, p0, Lcom/fodlam/yds/c;->s:Lcom/google/firebase/a/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fodlam/yds/c;->s:Lcom/google/firebase/a/a;

    sget-object v1, Lcom/fodlam/yds/OxfordApplication;->h:Lcom/fodlam/yds/OxfordApplication$a;

    invoke-virtual {v1}, Lcom/fodlam/yds/OxfordApplication$a;->name()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, p0, v1, v2}, Lcom/google/firebase/a/a;->a(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lcom/fodlam/yds/c;->m:I

    return-void
.end method
