.class Lcom/google/android/gms/b/cw$6;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/cw;->a(Lcom/google/android/gms/b/di;Lcom/google/android/gms/b/bv;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/b/di;

.field final synthetic b:Lcom/google/android/gms/b/bv;

.field final synthetic c:Lcom/google/android/gms/b/cw;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/cw;Lcom/google/android/gms/b/di;Lcom/google/android/gms/b/bv;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/cw$6;->c:Lcom/google/android/gms/b/cw;

    iput-object p2, p0, Lcom/google/android/gms/b/cw$6;->a:Lcom/google/android/gms/b/di;

    iput-object p3, p0, Lcom/google/android/gms/b/cw$6;->b:Lcom/google/android/gms/b/bv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/b/cw$6;->c:Lcom/google/android/gms/b/cw;

    invoke-static {v0}, Lcom/google/android/gms/b/cw;->a(Lcom/google/android/gms/b/cw;)Lcom/google/android/gms/b/cv;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/b/cv;->N()V

    iget-object v0, p0, Lcom/google/android/gms/b/cw$6;->c:Lcom/google/android/gms/b/cw;

    invoke-static {v0}, Lcom/google/android/gms/b/cw;->a(Lcom/google/android/gms/b/cw;)Lcom/google/android/gms/b/cv;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/b/cw$6;->a:Lcom/google/android/gms/b/di;

    iget-object v2, p0, Lcom/google/android/gms/b/cw$6;->b:Lcom/google/android/gms/b/bv;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/b/cv;->a(Lcom/google/android/gms/b/di;Lcom/google/android/gms/b/bv;)V

    return-void
.end method
