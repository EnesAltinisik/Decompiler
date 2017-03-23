.class Lcom/google/android/gms/b/da$4;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/da;->a(Ljava/lang/String;)Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/concurrent/atomic/AtomicReference;

.field final synthetic b:Lcom/google/android/gms/b/da;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/da;Ljava/util/concurrent/atomic/AtomicReference;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/da$4;->b:Lcom/google/android/gms/b/da;

    iput-object p2, p0, Lcom/google/android/gms/b/da$4;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/b/da$4;->b:Lcom/google/android/gms/b/da;

    invoke-virtual {v0}, Lcom/google/android/gms/b/da;->k()Lcom/google/android/gms/b/dc;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/b/da$4;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/dc;->a(Ljava/util/concurrent/atomic/AtomicReference;)V

    return-void
.end method
