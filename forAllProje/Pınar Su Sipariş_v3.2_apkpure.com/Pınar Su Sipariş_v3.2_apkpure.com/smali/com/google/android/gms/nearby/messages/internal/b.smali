.class final Lcom/google/android/gms/nearby/messages/internal/b;
.super Lcom/google/android/gms/nearby/messages/internal/zzg$zza;


# instance fields
.field private final a:Lcom/google/android/gms/internal/zznt$zzb;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/zznt$zzb",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation
.end field

.field private b:Z


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/zznt$zzb;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zznt$zzb",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/nearby/messages/internal/zzg$zza;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/nearby/messages/internal/b;->a:Lcom/google/android/gms/internal/zznt$zzb;

    return-void
.end method

.method static a(Lcom/google/android/gms/internal/zznt$zzb;)Lcom/google/android/gms/nearby/messages/internal/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zznt$zzb",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;)",
            "Lcom/google/android/gms/nearby/messages/internal/b;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/nearby/messages/internal/b;

    invoke-direct {v0, p0}, Lcom/google/android/gms/nearby/messages/internal/b;-><init>(Lcom/google/android/gms/internal/zznt$zzb;)V

    return-object v0
.end method


# virtual methods
.method public zzbm(Lcom/google/android/gms/common/api/Status;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-boolean v0, p0, Lcom/google/android/gms/nearby/messages/internal/b;->b:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/b;->a:Lcom/google/android/gms/internal/zznt$zzb;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/zznt$zzb;->setResult(Ljava/lang/Object;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/nearby/messages/internal/b;->b:Z

    :cond_0
    return-void
.end method
