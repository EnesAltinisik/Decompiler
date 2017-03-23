.class Lcom/google/android/gms/b/gz$14;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/b/hf$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/gz;->g()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:Lcom/google/android/gms/b/gz;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/gz;Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/gz$14;->b:Lcom/google/android/gms/b/gz;

    iput-object p2, p0, Lcom/google/android/gms/b/gz$14;->a:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/b/gz$14;->a:Ljava/util/List;

    iget-object v1, p0, Lcom/google/android/gms/b/gz$14;->b:Lcom/google/android/gms/b/gz;

    invoke-static {v1}, Lcom/google/android/gms/b/gz;->e(Lcom/google/android/gms/b/gz;)Lcom/google/android/gms/b/hh;

    move-result-object v1

    invoke-virtual {v1, p1, p2}, Lcom/google/android/gms/b/hh;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget-object v0, p0, Lcom/google/android/gms/b/gz$14;->b:Lcom/google/android/gms/b/gz;

    const/16 v1, -0x9

    invoke-static {v0, p1, v1}, Lcom/google/android/gms/b/gz;->a(Lcom/google/android/gms/b/gz;Lcom/google/android/gms/b/gx;I)Lcom/google/android/gms/b/gx;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/b/gz$14;->b:Lcom/google/android/gms/b/gz;

    invoke-static {v1, v0}, Lcom/google/android/gms/b/gz;->a(Lcom/google/android/gms/b/gz;Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/gx;

    return-void
.end method
