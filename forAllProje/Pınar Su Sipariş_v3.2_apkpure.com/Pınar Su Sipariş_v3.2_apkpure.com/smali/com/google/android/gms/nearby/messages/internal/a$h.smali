.class abstract Lcom/google/android/gms/nearby/messages/internal/a$h;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/nearby/messages/internal/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40a
    name = "h"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<C:",
        "Ljava/lang/Object;",
        "W::",
        "Lcom/google/android/gms/nearby/messages/internal/a$a",
        "<TC;>;>",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final a:Landroid/support/v4/h/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/support/v4/h/j",
            "<TC;TW;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/support/v4/h/j;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/support/v4/h/j;-><init>(I)V

    iput-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/a$h;->a:Landroid/support/v4/h/j;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/nearby/messages/internal/a$1;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/nearby/messages/internal/a$h;-><init>()V

    return-void
.end method


# virtual methods
.method a(Lcom/google/android/gms/internal/zzou;Ljava/lang/Object;)Lcom/google/android/gms/nearby/messages/internal/a$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzou",
            "<TC;>;TC;)TW;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/a$h;->a:Landroid/support/v4/h/j;

    invoke-virtual {v0, p2}, Landroid/support/v4/h/j;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/nearby/messages/internal/a$a;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzou;->clear()V

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/google/android/gms/nearby/messages/internal/a$h;->b(Lcom/google/android/gms/internal/zzou;)Lcom/google/android/gms/nearby/messages/internal/a$a;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/nearby/messages/internal/a$h;->a:Landroid/support/v4/h/j;

    invoke-virtual {v1, p2, v0}, Landroid/support/v4/h/j;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method a(Ljava/lang/Object;)Lcom/google/android/gms/nearby/messages/internal/a$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TC;)TW;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/a$h;->a:Landroid/support/v4/h/j;

    invoke-virtual {v0, p1}, Landroid/support/v4/h/j;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/nearby/messages/internal/a$a;

    return-object v0
.end method

.method protected abstract b(Lcom/google/android/gms/internal/zzou;)Lcom/google/android/gms/nearby/messages/internal/a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzou",
            "<TC;>;)TW;"
        }
    .end annotation
.end method

.method b(Ljava/lang/Object;)Lcom/google/android/gms/nearby/messages/internal/a$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TC;)TW;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/a$h;->a:Landroid/support/v4/h/j;

    invoke-virtual {v0, p1}, Landroid/support/v4/h/j;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/nearby/messages/internal/a$a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/nearby/messages/internal/a$a;->a()Lcom/google/android/gms/internal/zzou;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzou;->clear()V

    :cond_0
    return-object v0
.end method
