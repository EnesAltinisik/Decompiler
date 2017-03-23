.class Lcom/google/android/gms/b/yf$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/yf;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/b/yu;

.field final synthetic b:Lcom/google/android/gms/b/yf;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/yf;Lcom/google/android/gms/b/yu;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/yf$1;->b:Lcom/google/android/gms/b/yf;

    iput-object p2, p0, Lcom/google/android/gms/b/yf$1;->a:Lcom/google/android/gms/b/yu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/b/yf$1;->b:Lcom/google/android/gms/b/yf;

    invoke-static {v0}, Lcom/google/android/gms/b/yf;->a(Lcom/google/android/gms/b/yf;)Lcom/google/android/gms/b/xo;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/b/yf$1;->a:Lcom/google/android/gms/b/yu;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/xo;->b(Lcom/google/android/gms/b/yu;)V

    return-void
.end method
