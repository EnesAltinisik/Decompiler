.class Lcom/google/android/gms/internal/zzry$c;
.super Lcom/google/android/gms/internal/zzrp$zza;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/zzry;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation


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

.field private final b:Lcom/google/android/gms/internal/zzry$a;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/zznt$zzb;Lcom/google/android/gms/internal/zzry$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zznt$zzb",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;",
            "Lcom/google/android/gms/internal/zzry$a;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzrp$zza;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzry$c;->a:Lcom/google/android/gms/internal/zznt$zzb;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzry$c;->b:Lcom/google/android/gms/internal/zzry$a;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/zznt$zzb;Lcom/google/android/gms/internal/zzry$a;Lcom/google/android/gms/internal/zzry$1;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/zzry$c;-><init>(Lcom/google/android/gms/internal/zznt$zzb;Lcom/google/android/gms/internal/zzry$a;)V

    return-void
.end method


# virtual methods
.method public zzo(Lcom/google/android/gms/common/api/Status;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzry$c;->b:Lcom/google/android/gms/internal/zzry$a;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->isSuccess()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzry$c;->b:Lcom/google/android/gms/internal/zzry$a;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzry$a;->a()V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzry$c;->a:Lcom/google/android/gms/internal/zznt$zzb;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/zznt$zzb;->setResult(Ljava/lang/Object;)V

    return-void
.end method
