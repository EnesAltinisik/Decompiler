.class Lcom/google/android/gms/b/gz$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/gz;->b(Ljava/util/List;Lcom/google/android/gms/b/gx;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/b/gz$a;

.field final synthetic b:Lcom/google/android/gms/b/gz;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/gz;Lcom/google/android/gms/b/gz$a;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/gz$2;->b:Lcom/google/android/gms/b/gz;

    iput-object p2, p0, Lcom/google/android/gms/b/gz$2;->a:Lcom/google/android/gms/b/gz$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/b/gz$2;->b:Lcom/google/android/gms/b/gz;

    new-instance v1, Lcom/google/android/gms/b/hn;

    iget-object v2, p0, Lcom/google/android/gms/b/gz$2;->b:Lcom/google/android/gms/b/gz;

    iget-object v3, p0, Lcom/google/android/gms/b/gz$2;->a:Lcom/google/android/gms/b/gz$a;

    invoke-static {v3}, Lcom/google/android/gms/b/gz$a;->j(Lcom/google/android/gms/b/gz$a;)Lcom/google/firebase/database/m;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/gms/b/gz$2;->a:Lcom/google/android/gms/b/gz$a;

    invoke-static {v4}, Lcom/google/android/gms/b/gz$a;->f(Lcom/google/android/gms/b/gz$a;)Lcom/google/android/gms/b/gx;

    move-result-object v4

    invoke-static {v4}, Lcom/google/android/gms/b/it;->a(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/it;

    move-result-object v4

    invoke-direct {v1, v2, v3, v4}, Lcom/google/android/gms/b/hn;-><init>(Lcom/google/android/gms/b/gz;Lcom/google/firebase/database/m;Lcom/google/android/gms/b/it;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/gz;->a(Lcom/google/android/gms/b/gs;)V

    return-void
.end method
