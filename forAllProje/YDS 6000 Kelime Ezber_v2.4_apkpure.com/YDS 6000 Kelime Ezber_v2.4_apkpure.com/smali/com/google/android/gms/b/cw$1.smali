.class Lcom/google/android/gms/b/cw$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/cw;->b(Lcom/google/android/gms/b/bv;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/b/bv;

.field final synthetic b:Lcom/google/android/gms/b/cw;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/cw;Lcom/google/android/gms/b/bv;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/cw$1;->b:Lcom/google/android/gms/b/cw;

    iput-object p2, p0, Lcom/google/android/gms/b/cw$1;->a:Lcom/google/android/gms/b/bv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/b/cw$1;->b:Lcom/google/android/gms/b/cw;

    invoke-static {v0}, Lcom/google/android/gms/b/cw;->a(Lcom/google/android/gms/b/cw;)Lcom/google/android/gms/b/cv;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/cv;->N()V

    iget-object v0, p0, Lcom/google/android/gms/b/cw$1;->b:Lcom/google/android/gms/b/cw;

    invoke-static {v0}, Lcom/google/android/gms/b/cw;->a(Lcom/google/android/gms/b/cw;)Lcom/google/android/gms/b/cv;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/b/cw$1;->a:Lcom/google/android/gms/b/bv;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/cv;->a(Lcom/google/android/gms/b/bv;)V

    return-void
.end method
