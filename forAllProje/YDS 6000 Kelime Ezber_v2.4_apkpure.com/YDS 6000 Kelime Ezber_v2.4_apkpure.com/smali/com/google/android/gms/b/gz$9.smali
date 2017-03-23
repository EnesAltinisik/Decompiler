.class Lcom/google/android/gms/b/gz$9;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/b/hh$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/gz;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/b/gz;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/gz;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/gz$9;->a:Lcom/google/android/gms/b/gz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/b/it;Lcom/google/android/gms/b/hi;)V
    .locals 0

    return-void
.end method

.method public a(Lcom/google/android/gms/b/it;Lcom/google/android/gms/b/hi;Lcom/google/android/gms/b/ge;Lcom/google/android/gms/b/hh$a;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/b/gz$9;->a:Lcom/google/android/gms/b/gz;

    new-instance v1, Lcom/google/android/gms/b/gz$9$1;

    invoke-direct {v1, p0, p1, p4}, Lcom/google/android/gms/b/gz$9$1;-><init>(Lcom/google/android/gms/b/gz$9;Lcom/google/android/gms/b/it;Lcom/google/android/gms/b/hh$a;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/gz;->a(Ljava/lang/Runnable;)V

    return-void
.end method
