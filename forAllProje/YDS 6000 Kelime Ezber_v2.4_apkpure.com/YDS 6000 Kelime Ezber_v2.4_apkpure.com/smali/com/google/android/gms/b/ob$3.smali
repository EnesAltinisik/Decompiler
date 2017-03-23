.class Lcom/google/android/gms/b/ob$3;
.super Lcom/google/android/gms/b/ob$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/ob;->b(Landroid/content/Context;Lcom/google/android/gms/b/nx;Ljava/lang/String;Lcom/google/android/gms/b/tn;)Lcom/google/android/gms/b/ok;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/b/ob$a",
        "<",
        "Lcom/google/android/gms/b/ok;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Lcom/google/android/gms/b/nx;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Lcom/google/android/gms/b/tn;

.field final synthetic e:Lcom/google/android/gms/b/ob;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/ob;Landroid/content/Context;Lcom/google/android/gms/b/nx;Ljava/lang/String;Lcom/google/android/gms/b/tn;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/ob$3;->e:Lcom/google/android/gms/b/ob;

    iput-object p2, p0, Lcom/google/android/gms/b/ob$3;->a:Landroid/content/Context;

    iput-object p3, p0, Lcom/google/android/gms/b/ob$3;->b:Lcom/google/android/gms/b/nx;

    iput-object p4, p0, Lcom/google/android/gms/b/ob$3;->c:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/b/ob$3;->d:Lcom/google/android/gms/b/tn;

    invoke-direct {p0, p1}, Lcom/google/android/gms/b/ob$a;-><init>(Lcom/google/android/gms/b/ob;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/b/ok;
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/b/ob$3;->e:Lcom/google/android/gms/b/ob;

    invoke-static {v0}, Lcom/google/android/gms/b/ob;->b(Lcom/google/android/gms/b/ob;)Lcom/google/android/gms/b/nr;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/b/ob$3;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/b/ob$3;->b:Lcom/google/android/gms/b/nx;

    iget-object v3, p0, Lcom/google/android/gms/b/ob$3;->c:Ljava/lang/String;

    iget-object v4, p0, Lcom/google/android/gms/b/ob$3;->d:Lcom/google/android/gms/b/tn;

    const/4 v5, 0x2

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/b/nr;->a(Landroid/content/Context;Lcom/google/android/gms/b/nx;Ljava/lang/String;Lcom/google/android/gms/b/tn;I)Lcom/google/android/gms/b/ok;

    move-result-object v0

    if-eqz v0, :cond_0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/b/ob$3;->e:Lcom/google/android/gms/b/ob;

    iget-object v1, p0, Lcom/google/android/gms/b/ob$3;->a:Landroid/content/Context;

    const-string v2, "interstitial"

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/b/ob;->a(Lcom/google/android/gms/b/ob;Landroid/content/Context;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/b/pb;

    invoke-direct {v0}, Lcom/google/android/gms/b/pb;-><init>()V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/b/on;)Lcom/google/android/gms/b/ok;
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/b/ob$3;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/a/b;->a(Ljava/lang/Object;)Lcom/google/android/gms/a/a;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/b/ob$3;->b:Lcom/google/android/gms/b/nx;

    iget-object v3, p0, Lcom/google/android/gms/b/ob$3;->c:Ljava/lang/String;

    iget-object v4, p0, Lcom/google/android/gms/b/ob$3;->d:Lcom/google/android/gms/b/tn;

    const v5, 0x99dea0

    move-object v0, p1

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/b/on;->createInterstitialAdManager(Lcom/google/android/gms/a/a;Lcom/google/android/gms/b/nx;Ljava/lang/String;Lcom/google/android/gms/b/tn;I)Lcom/google/android/gms/b/ok;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/b/ob$3;->a()Lcom/google/android/gms/b/ok;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b(Lcom/google/android/gms/b/on;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/b/ob$3;->a(Lcom/google/android/gms/b/on;)Lcom/google/android/gms/b/ok;

    move-result-object v0

    return-object v0
.end method
