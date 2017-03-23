.class Lcom/google/android/gms/b/xo$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/xo;->a(Lcom/google/android/gms/b/yu$a;Lcom/google/android/gms/b/qa;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/b/yu$a;

.field final synthetic b:Lcom/google/android/gms/b/xo;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/xo;Lcom/google/android/gms/b/yu$a;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/xo$2;->b:Lcom/google/android/gms/b/xo;

    iput-object p2, p0, Lcom/google/android/gms/b/xo$2;->a:Lcom/google/android/gms/b/yu$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 10

    const/4 v2, 0x0

    iget-object v9, p0, Lcom/google/android/gms/b/xo$2;->b:Lcom/google/android/gms/b/xo;

    new-instance v0, Lcom/google/android/gms/b/yu;

    iget-object v1, p0, Lcom/google/android/gms/b/xo$2;->a:Lcom/google/android/gms/b/yu$a;

    move-object v3, v2

    move-object v4, v2

    move-object v5, v2

    move-object v6, v2

    move-object v7, v2

    move-object v8, v2

    invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/b/yu;-><init>(Lcom/google/android/gms/b/yu$a;Lcom/google/android/gms/b/aaq;Lcom/google/android/gms/b/td;Lcom/google/android/gms/b/to;Ljava/lang/String;Lcom/google/android/gms/b/tg;Lcom/google/android/gms/b/qp$a;Ljava/lang/String;)V

    invoke-virtual {v9, v0}, Lcom/google/android/gms/b/xo;->b(Lcom/google/android/gms/b/yu;)V

    return-void
.end method
