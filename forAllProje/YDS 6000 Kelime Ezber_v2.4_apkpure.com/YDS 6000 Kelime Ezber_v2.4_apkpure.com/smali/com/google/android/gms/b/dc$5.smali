.class Lcom/google/android/gms/b/dc$5;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/dc;->a(Lcom/google/android/gms/b/di;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lcom/google/android/gms/b/di;

.field final synthetic c:Lcom/google/android/gms/b/dc;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/dc;ZLcom/google/android/gms/b/di;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/dc$5;->c:Lcom/google/android/gms/b/dc;

    iput-boolean p2, p0, Lcom/google/android/gms/b/dc$5;->a:Z

    iput-object p3, p0, Lcom/google/android/gms/b/dc$5;->b:Lcom/google/android/gms/b/di;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/b/dc$5;->c:Lcom/google/android/gms/b/dc;

    invoke-static {v0}, Lcom/google/android/gms/b/dc;->c(Lcom/google/android/gms/b/dc;)Lcom/google/android/gms/b/ck;

    move-result-object v1

    if-nez v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/b/dc$5;->c:Lcom/google/android/gms/b/dc;

    invoke-virtual {v0}, Lcom/google/android/gms/b/dc;->u()Lcom/google/android/gms/b/co;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/co;->x()Lcom/google/android/gms/b/co$a;

    move-result-object v0

    const-string v1, "Discarding data. Failed to set user attribute"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/co$a;->a(Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    iget-object v2, p0, Lcom/google/android/gms/b/dc$5;->c:Lcom/google/android/gms/b/dc;

    iget-boolean v0, p0, Lcom/google/android/gms/b/dc$5;->a:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v2, v1, v0}, Lcom/google/android/gms/b/dc;->a(Lcom/google/android/gms/b/ck;Lcom/google/android/gms/common/internal/safeparcel/a;)V

    iget-object v0, p0, Lcom/google/android/gms/b/dc$5;->c:Lcom/google/android/gms/b/dc;

    invoke-static {v0}, Lcom/google/android/gms/b/dc;->d(Lcom/google/android/gms/b/dc;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/b/dc$5;->b:Lcom/google/android/gms/b/di;

    goto :goto_1
.end method
