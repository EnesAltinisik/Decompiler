.class Lcom/google/android/gms/b/j$b$2;
.super Lcom/google/android/gms/b/n$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/j$b;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/common/internal/o$f;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/j$b;Lcom/google/android/gms/b/m;Lcom/google/android/gms/common/internal/o$f;)V
    .locals 0

    iput-object p3, p0, Lcom/google/android/gms/b/j$b$2;->a:Lcom/google/android/gms/common/internal/o$f;

    invoke-direct {p0, p2}, Lcom/google/android/gms/b/n$a;-><init>(Lcom/google/android/gms/b/m;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/b/j$b$2;->a:Lcom/google/android/gms/common/internal/o$f;

    new-instance v1, Lcom/google/android/gms/common/a;

    const/16 v2, 0x10

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lcom/google/android/gms/common/a;-><init>(ILandroid/app/PendingIntent;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/common/internal/o$f;->a(Lcom/google/android/gms/common/a;)V

    return-void
.end method
