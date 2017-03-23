.class Lcom/google/android/gms/nearby/messages/internal/a$c$1;
.super Lcom/google/android/gms/nearby/messages/internal/a$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/nearby/messages/internal/a$c;->zzE(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/nearby/messages/internal/a$d",
        "<",
        "Lcom/google/android/gms/nearby/messages/MessageListener;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:Lcom/google/android/gms/nearby/messages/internal/a$c;


# direct methods
.method constructor <init>(Lcom/google/android/gms/nearby/messages/internal/a$c;Ljava/util/List;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/nearby/messages/internal/a$c$1;->b:Lcom/google/android/gms/nearby/messages/internal/a$c;

    iput-object p2, p0, Lcom/google/android/gms/nearby/messages/internal/a$c$1;->a:Ljava/util/List;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/nearby/messages/internal/a$d;-><init>(Lcom/google/android/gms/nearby/messages/internal/a$1;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/nearby/messages/MessageListener;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/a$c$1;->a:Ljava/util/List;

    invoke-static {v0, p1}, Lcom/google/android/gms/nearby/messages/internal/zzp;->zza(Ljava/lang/Iterable;Lcom/google/android/gms/nearby/messages/MessageListener;)V

    return-void
.end method

.method public synthetic zzt(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/nearby/messages/MessageListener;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/nearby/messages/internal/a$c$1;->a(Lcom/google/android/gms/nearby/messages/MessageListener;)V

    return-void
.end method
