.class Lcom/google/android/gms/nearby/messages/internal/a$c;
.super Lcom/google/android/gms/nearby/messages/internal/zzf$zza;

# interfaces
.implements Lcom/google/android/gms/nearby/messages/internal/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/nearby/messages/internal/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/nearby/messages/internal/zzf$zza;",
        "Lcom/google/android/gms/nearby/messages/internal/a$a",
        "<",
        "Lcom/google/android/gms/nearby/messages/MessageListener;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/zzou;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/zzou",
            "<",
            "Lcom/google/android/gms/nearby/messages/MessageListener;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/zzou;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzou",
            "<",
            "Lcom/google/android/gms/nearby/messages/MessageListener;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/nearby/messages/internal/zzf$zza;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/nearby/messages/internal/a$c;->a:Lcom/google/android/gms/internal/zzou;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/zzou;Lcom/google/android/gms/nearby/messages/internal/a$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/nearby/messages/internal/a$c;-><init>(Lcom/google/android/gms/internal/zzou;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/internal/zzou;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/zzou",
            "<",
            "Lcom/google/android/gms/nearby/messages/MessageListener;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/a$c;->a:Lcom/google/android/gms/internal/zzou;

    return-object v0
.end method

.method public zzE(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/nearby/messages/internal/Update;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/a$c;->a:Lcom/google/android/gms/internal/zzou;

    new-instance v1, Lcom/google/android/gms/nearby/messages/internal/a$c$1;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/nearby/messages/internal/a$c$1;-><init>(Lcom/google/android/gms/nearby/messages/internal/a$c;Ljava/util/List;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzou;->zza(Lcom/google/android/gms/internal/zzou$zzb;)V

    return-void
.end method

.method public zza(Lcom/google/android/gms/nearby/messages/internal/MessageWrapper;)V
    .locals 0

    return-void
.end method

.method public zzb(Lcom/google/android/gms/nearby/messages/internal/MessageWrapper;)V
    .locals 0

    return-void
.end method
