.class Lcom/google/android/gms/nearby/messages/internal/a$2;
.super Lcom/google/android/gms/nearby/messages/internal/a$h;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/nearby/messages/internal/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/nearby/messages/internal/a$h",
        "<",
        "Lcom/google/android/gms/nearby/messages/MessageListener;",
        "Lcom/google/android/gms/nearby/messages/internal/a$c;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/nearby/messages/internal/a;


# direct methods
.method constructor <init>(Lcom/google/android/gms/nearby/messages/internal/a;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/nearby/messages/internal/a$2;->a:Lcom/google/android/gms/nearby/messages/internal/a;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/nearby/messages/internal/a$h;-><init>(Lcom/google/android/gms/nearby/messages/internal/a$1;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/internal/zzou;)Lcom/google/android/gms/nearby/messages/internal/a$c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzou",
            "<",
            "Lcom/google/android/gms/nearby/messages/MessageListener;",
            ">;)",
            "Lcom/google/android/gms/nearby/messages/internal/a$c;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/nearby/messages/internal/a$c;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/nearby/messages/internal/a$c;-><init>(Lcom/google/android/gms/internal/zzou;Lcom/google/android/gms/nearby/messages/internal/a$1;)V

    return-object v0
.end method

.method protected synthetic b(Lcom/google/android/gms/internal/zzou;)Lcom/google/android/gms/nearby/messages/internal/a$a;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/nearby/messages/internal/a$2;->a(Lcom/google/android/gms/internal/zzou;)Lcom/google/android/gms/nearby/messages/internal/a$c;

    move-result-object v0

    return-object v0
.end method
