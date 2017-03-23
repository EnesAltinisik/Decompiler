.class Lcom/google/android/gms/b/hf$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/b/hf$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/hf;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/hf$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/b/gx;

.field final synthetic b:Lcom/google/android/gms/b/hf$b;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/hf;Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/hf$b;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/b/hf$1;->a:Lcom/google/android/gms/b/gx;

    iput-object p3, p0, Lcom/google/android/gms/b/hf$1;->b:Lcom/google/android/gms/b/hf$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/b/je;Lcom/google/android/gms/b/hf;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/b/hf$1;->a:Lcom/google/android/gms/b/gx;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/b/gx;->a(Lcom/google/android/gms/b/je;)Lcom/google/android/gms/b/gx;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/b/hf$1;->b:Lcom/google/android/gms/b/hf$b;

    invoke-virtual {p2, v0, v1}, Lcom/google/android/gms/b/hf;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/hf$b;)V

    return-void
.end method
