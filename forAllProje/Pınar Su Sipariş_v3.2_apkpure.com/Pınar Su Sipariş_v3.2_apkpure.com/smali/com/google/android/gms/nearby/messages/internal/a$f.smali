.class Lcom/google/android/gms/nearby/messages/internal/a$f;
.super Lcom/google/android/gms/nearby/messages/internal/zzj$zza;

# interfaces
.implements Lcom/google/android/gms/nearby/messages/internal/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/nearby/messages/internal/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/nearby/messages/internal/zzj$zza;",
        "Lcom/google/android/gms/nearby/messages/internal/a$a",
        "<",
        "Lcom/google/android/gms/nearby/messages/StatusCallback;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/zzou;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/zzou",
            "<",
            "Lcom/google/android/gms/nearby/messages/StatusCallback;",
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
            "Lcom/google/android/gms/nearby/messages/StatusCallback;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/nearby/messages/internal/zzj$zza;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/nearby/messages/internal/a$f;->a:Lcom/google/android/gms/internal/zzou;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/zzou;Lcom/google/android/gms/nearby/messages/internal/a$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/nearby/messages/internal/a$f;-><init>(Lcom/google/android/gms/internal/zzou;)V

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
            "Lcom/google/android/gms/nearby/messages/StatusCallback;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/a$f;->a:Lcom/google/android/gms/internal/zzou;

    return-object v0
.end method

.method public onPermissionChanged(Z)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/a$f;->a:Lcom/google/android/gms/internal/zzou;

    new-instance v1, Lcom/google/android/gms/nearby/messages/internal/a$f$1;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/nearby/messages/internal/a$f$1;-><init>(Lcom/google/android/gms/nearby/messages/internal/a$f;Z)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzou;->zza(Lcom/google/android/gms/internal/zzou$zzb;)V

    return-void
.end method
