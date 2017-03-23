.class public Lcom/google/android/gms/b/vi;
.super Lcom/google/android/gms/b/vg;


# annotations
.annotation runtime Lcom/google/android/gms/b/vz;
.end annotation


# instance fields
.field private g:Lcom/google/android/gms/b/vh;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/google/android/gms/b/yu$a;Lcom/google/android/gms/b/aaq;Lcom/google/android/gms/b/vk$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/android/gms/b/vg;-><init>(Landroid/content/Context;Lcom/google/android/gms/b/yu$a;Lcom/google/android/gms/b/aaq;Lcom/google/android/gms/b/vk$a;)V

    return-void
.end method


# virtual methods
.method protected b()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/b/vi;->c:Lcom/google/android/gms/b/aaq;

    invoke-interface {v0}, Lcom/google/android/gms/b/aaq;->k()Lcom/google/android/gms/b/nx;

    move-result-object v0

    iget-boolean v1, v0, Lcom/google/android/gms/b/nx;->e:Z

    if-eqz v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/vi;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v1, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    :goto_0
    new-instance v2, Lcom/google/android/gms/b/vh;

    iget-object v3, p0, Lcom/google/android/gms/b/vi;->c:Lcom/google/android/gms/b/aaq;

    invoke-direct {v2, p0, v3, v1, v0}, Lcom/google/android/gms/b/vh;-><init>(Lcom/google/android/gms/b/aar$a;Lcom/google/android/gms/b/aaq;II)V

    iput-object v2, p0, Lcom/google/android/gms/b/vi;->g:Lcom/google/android/gms/b/vh;

    iget-object v0, p0, Lcom/google/android/gms/b/vi;->c:Lcom/google/android/gms/b/aaq;

    invoke-interface {v0}, Lcom/google/android/gms/b/aaq;->l()Lcom/google/android/gms/b/aar;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/b/aar;->a(Lcom/google/android/gms/b/aar$a;)V

    iget-object v0, p0, Lcom/google/android/gms/b/vi;->g:Lcom/google/android/gms/b/vh;

    iget-object v1, p0, Lcom/google/android/gms/b/vi;->e:Lcom/google/android/gms/b/wi;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/vh;->a(Lcom/google/android/gms/b/wi;)V

    return-void

    :cond_0
    iget v1, v0, Lcom/google/android/gms/b/nx;->g:I

    iget v0, v0, Lcom/google/android/gms/b/nx;->d:I

    goto :goto_0
.end method

.method protected c()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/vi;->g:Lcom/google/android/gms/b/vh;

    invoke-virtual {v0}, Lcom/google/android/gms/b/vh;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Ad-Network indicated no fill with passback URL."

    invoke-static {v0}, Lcom/google/android/gms/b/ze;->b(Ljava/lang/String;)V

    const/4 v0, 0x3

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/b/vi;->g:Lcom/google/android/gms/b/vh;

    invoke-virtual {v0}, Lcom/google/android/gms/b/vh;->d()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x2

    goto :goto_0

    :cond_1
    const/4 v0, -0x2

    goto :goto_0
.end method
