.class final Lcom/google/android/gms/b/wc$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/b/wc$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/wc;->a(Landroid/content/Context;Lcom/google/android/gms/b/aab;Lcom/google/android/gms/b/aaj;Lcom/google/android/gms/b/wc$a;)Lcom/google/android/gms/b/zk;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/wc$1;->a:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/b/aab;)Z
    .locals 1

    iget-boolean v0, p1, Lcom/google/android/gms/b/aab;->e:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/wc$1;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/common/util/f;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/google/android/gms/b/pr;->P:Lcom/google/android/gms/b/pn;

    invoke-virtual {v0}, Lcom/google/android/gms/b/pn;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method
