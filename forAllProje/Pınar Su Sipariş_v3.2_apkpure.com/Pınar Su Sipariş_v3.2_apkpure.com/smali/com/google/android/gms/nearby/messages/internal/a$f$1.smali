.class Lcom/google/android/gms/nearby/messages/internal/a$f$1;
.super Lcom/google/android/gms/nearby/messages/internal/a$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/nearby/messages/internal/a$f;->onPermissionChanged(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/nearby/messages/internal/a$d",
        "<",
        "Lcom/google/android/gms/nearby/messages/StatusCallback;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lcom/google/android/gms/nearby/messages/internal/a$f;


# direct methods
.method constructor <init>(Lcom/google/android/gms/nearby/messages/internal/a$f;Z)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/nearby/messages/internal/a$f$1;->b:Lcom/google/android/gms/nearby/messages/internal/a$f;

    iput-boolean p2, p0, Lcom/google/android/gms/nearby/messages/internal/a$f$1;->a:Z

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/nearby/messages/internal/a$d;-><init>(Lcom/google/android/gms/nearby/messages/internal/a$1;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/nearby/messages/StatusCallback;)V
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/nearby/messages/internal/a$f$1;->a:Z

    invoke-virtual {p1, v0}, Lcom/google/android/gms/nearby/messages/StatusCallback;->onPermissionChanged(Z)V

    return-void
.end method

.method public synthetic zzt(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/nearby/messages/StatusCallback;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/nearby/messages/internal/a$f$1;->a(Lcom/google/android/gms/nearby/messages/StatusCallback;)V

    return-void
.end method
