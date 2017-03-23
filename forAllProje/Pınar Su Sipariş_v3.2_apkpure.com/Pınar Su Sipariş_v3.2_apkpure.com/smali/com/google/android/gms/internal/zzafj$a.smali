.class Lcom/google/android/gms/internal/zzafj$a;
.super Lcom/google/android/gms/internal/zzaew;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/zzafj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field private a:Lcom/google/android/gms/internal/zzagu;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzagu;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzaew;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzafj$a;->a:Lcom/google/android/gms/internal/zzagu;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lcom/google/android/gms/internal/zzafj$a;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/google/android/gms/internal/zzafj$a;

    iget-object v0, p1, Lcom/google/android/gms/internal/zzafj$a;->a:Lcom/google/android/gms/internal/zzagu;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafj$a;->a:Lcom/google/android/gms/internal/zzagu;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzagu;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafj$a;->a:Lcom/google/android/gms/internal/zzagu;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagu;->hashCode()I

    move-result v0

    return v0
.end method

.method public zzQM()Lcom/google/android/gms/internal/zzagu;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafj$a;->a:Lcom/google/android/gms/internal/zzagu;

    return-object v0
.end method

.method public zza(Lcom/google/android/gms/internal/zzagu;)Lcom/google/android/gms/internal/zzaew;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/zzafj$a;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/zzafj$a;-><init>(Lcom/google/android/gms/internal/zzagu;)V

    return-object v0
.end method

.method public zza(Lcom/google/android/gms/internal/zzago;Lcom/google/android/gms/internal/zzagu;)Lcom/google/android/gms/internal/zzagp;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public zza(Lcom/google/android/gms/internal/zzagp;)V
    .locals 0

    return-void
.end method

.method public zza(Lcom/google/firebase/database/DatabaseError;)V
    .locals 0

    return-void
.end method

.method public zza(Lcom/google/android/gms/internal/zzagq$zza;)Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public zzc(Lcom/google/android/gms/internal/zzaew;)Z
    .locals 1

    instance-of v0, p1, Lcom/google/android/gms/internal/zzafj$a;

    return v0
.end method
