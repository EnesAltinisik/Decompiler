.class public final Lcom/google/android/gms/b/d;
.super Lcom/google/android/gms/common/api/n;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<O::",
        "Lcom/google/android/gms/common/api/a$a;",
        ">",
        "Lcom/google/android/gms/common/api/n",
        "<TO;>;"
    }
.end annotation


# instance fields
.field private final b:Lcom/google/android/gms/common/api/a$f;

.field private final c:Lcom/google/android/gms/b/ach;

.field private final d:Lcom/google/android/gms/common/internal/p;

.field private final e:Lcom/google/android/gms/common/api/a$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a$b",
            "<+",
            "Lcom/google/android/gms/b/dv;",
            "Lcom/google/android/gms/b/dw;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/common/api/a;Landroid/os/Looper;Lcom/google/android/gms/common/api/a$f;Lcom/google/android/gms/b/ach;Lcom/google/android/gms/common/internal/p;Lcom/google/android/gms/common/api/a$b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/google/android/gms/common/api/a",
            "<TO;>;",
            "Landroid/os/Looper;",
            "Lcom/google/android/gms/common/api/a$f;",
            "Lcom/google/android/gms/b/ach;",
            "Lcom/google/android/gms/common/internal/p;",
            "Lcom/google/android/gms/common/api/a$b",
            "<+",
            "Lcom/google/android/gms/b/dv;",
            "Lcom/google/android/gms/b/dw;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/common/api/n;-><init>(Landroid/content/Context;Lcom/google/android/gms/common/api/a;Landroid/os/Looper;)V

    iput-object p4, p0, Lcom/google/android/gms/b/d;->b:Lcom/google/android/gms/common/api/a$f;

    iput-object p5, p0, Lcom/google/android/gms/b/d;->c:Lcom/google/android/gms/b/ach;

    iput-object p6, p0, Lcom/google/android/gms/b/d;->d:Lcom/google/android/gms/common/internal/p;

    iput-object p7, p0, Lcom/google/android/gms/b/d;->e:Lcom/google/android/gms/common/api/a$b;

    iget-object v0, p0, Lcom/google/android/gms/b/d;->a:Lcom/google/android/gms/b/p;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/b/p;->a(Lcom/google/android/gms/common/api/n;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Landroid/os/Handler;)Lcom/google/android/gms/b/ah;
    .locals 3

    new-instance v0, Lcom/google/android/gms/b/ah;

    iget-object v1, p0, Lcom/google/android/gms/b/d;->d:Lcom/google/android/gms/common/internal/p;

    iget-object v2, p0, Lcom/google/android/gms/b/d;->e:Lcom/google/android/gms/common/api/a$b;

    invoke-direct {v0, p1, p2, v1, v2}, Lcom/google/android/gms/b/ah;-><init>(Landroid/content/Context;Landroid/os/Handler;Lcom/google/android/gms/common/internal/p;Lcom/google/android/gms/common/api/a$b;)V

    return-object v0
.end method

.method public a(Landroid/os/Looper;Lcom/google/android/gms/b/p$a;)Lcom/google/android/gms/common/api/a$f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Looper;",
            "Lcom/google/android/gms/b/p$a",
            "<TO;>;)",
            "Lcom/google/android/gms/common/api/a$f;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/b/d;->c:Lcom/google/android/gms/b/ach;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/b/ach;->a(Lcom/google/android/gms/b/aci;)V

    iget-object v0, p0, Lcom/google/android/gms/b/d;->b:Lcom/google/android/gms/common/api/a$f;

    return-object v0
.end method
