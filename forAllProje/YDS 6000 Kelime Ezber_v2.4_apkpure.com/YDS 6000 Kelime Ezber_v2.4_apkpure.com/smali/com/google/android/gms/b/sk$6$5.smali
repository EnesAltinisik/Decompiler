.class Lcom/google/android/gms/b/sk$6$5;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/b/sk$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/sk$6;->a(Lcom/google/android/gms/b/xp;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/b/xp;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/sk$6;Lcom/google/android/gms/b/xp;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/b/sk$6$5;->a:Lcom/google/android/gms/b/xp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/b/sl;)V
    .locals 2

    iget-object v0, p1, Lcom/google/android/gms/b/sl;->f:Lcom/google/android/gms/b/xs;

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/google/android/gms/b/sl;->f:Lcom/google/android/gms/b/xs;

    iget-object v1, p0, Lcom/google/android/gms/b/sk$6$5;->a:Lcom/google/android/gms/b/xp;

    invoke-interface {v0, v1}, Lcom/google/android/gms/b/xs;->a(Lcom/google/android/gms/b/xp;)V

    :cond_0
    return-void
.end method
