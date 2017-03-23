.class public Lcom/google/android/gms/b/vl;
.super Lcom/google/android/gms/b/vg;

# interfaces
.implements Lcom/google/android/gms/b/aar$a;


# annotations
.annotation runtime Lcom/google/android/gms/b/vz;
.end annotation


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/google/android/gms/b/yu$a;Lcom/google/android/gms/b/aaq;Lcom/google/android/gms/b/vk$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/android/gms/b/vg;-><init>(Landroid/content/Context;Lcom/google/android/gms/b/yu$a;Lcom/google/android/gms/b/aaq;Lcom/google/android/gms/b/vk$a;)V

    return-void
.end method


# virtual methods
.method protected b()V
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/b/vl;->e:Lcom/google/android/gms/b/wi;

    iget v0, v0, Lcom/google/android/gms/b/wi;->e:I

    const/4 v1, -0x2

    if-eq v0, v1, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/b/vl;->c:Lcom/google/android/gms/b/aaq;

    invoke-interface {v0}, Lcom/google/android/gms/b/aaq;->l()Lcom/google/android/gms/b/aar;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/b/aar;->a(Lcom/google/android/gms/b/aar$a;)V

    invoke-virtual {p0}, Lcom/google/android/gms/b/vl;->f()V

    const-string v0, "Loading HTML in WebView."

    invoke-static {v0}, Lcom/google/android/gms/b/ze;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/b/vl;->c:Lcom/google/android/gms/b/aaq;

    iget-object v1, p0, Lcom/google/android/gms/b/vl;->e:Lcom/google/android/gms/b/wi;

    iget-object v1, v1, Lcom/google/android/gms/b/wi;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/b/vl;->e:Lcom/google/android/gms/b/wi;

    iget-object v2, v2, Lcom/google/android/gms/b/wi;->c:Ljava/lang/String;

    const-string v3, "text/html"

    const-string v4, "UTF-8"

    const/4 v5, 0x0

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/b/aaq;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method protected f()V
    .locals 0

    return-void
.end method
