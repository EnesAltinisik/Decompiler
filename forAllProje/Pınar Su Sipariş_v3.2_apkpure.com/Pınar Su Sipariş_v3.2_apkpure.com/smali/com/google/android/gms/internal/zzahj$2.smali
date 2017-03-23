.class Lcom/google/android/gms/internal/zzahj$2;
.super Lcom/google/android/gms/internal/zzadx$zzb;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzahj;->zza(Lcom/google/android/gms/internal/zzahj$zza;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/zzadx$zzb",
        "<",
        "Lcom/google/android/gms/internal/zzahi;",
        "Lcom/google/android/gms/internal/zzahu;",
        ">;"
    }
.end annotation


# instance fields
.field a:Z

.field final synthetic b:Lcom/google/android/gms/internal/zzahj$zza;

.field final synthetic c:Lcom/google/android/gms/internal/zzahj;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzahj;Lcom/google/android/gms/internal/zzahj$zza;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/internal/zzahj$2;->c:Lcom/google/android/gms/internal/zzahj;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzahj$2;->b:Lcom/google/android/gms/internal/zzahj$zza;

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzadx$zzb;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzahj$2;->a:Z

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;)V
    .locals 3

    iget-boolean v0, p0, Lcom/google/android/gms/internal/zzahj$2;->a:Z

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/zzahi;->zzTj()Lcom/google/android/gms/internal/zzahi;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/zzahi;->zzi(Lcom/google/android/gms/internal/zzahi;)I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/zzahj$2;->a:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/zzahj$2;->b:Lcom/google/android/gms/internal/zzahj$zza;

    invoke-static {}, Lcom/google/android/gms/internal/zzahi;->zzTj()Lcom/google/android/gms/internal/zzahi;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/zzahj$2;->c:Lcom/google/android/gms/internal/zzahj;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzahj;->zzTp()Lcom/google/android/gms/internal/zzahu;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/zzahj$zza;->zzb(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzahj$2;->b:Lcom/google/android/gms/internal/zzahj$zza;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/zzahj$zza;->zzb(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;)V

    return-void
.end method

.method public synthetic zzk(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/zzahi;

    check-cast p2, Lcom/google/android/gms/internal/zzahu;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/zzahj$2;->a(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;)V

    return-void
.end method
