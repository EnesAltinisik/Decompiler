.class Lcom/google/android/gms/internal/zzafc$7;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/zzagk$zzb;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzafc;->zzb(Lcom/google/android/gms/internal/zzafa;I)Lcom/google/android/gms/internal/zzafa;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/zzagk$zzb",
        "<",
        "Ljava/util/List",
        "<",
        "Lcom/google/android/gms/internal/zzafc$a;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/google/android/gms/internal/zzafc;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzafc;I)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzafc$7;->b:Lcom/google/android/gms/internal/zzafc;

    iput p2, p0, Lcom/google/android/gms/internal/zzafc$7;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public zzd(Lcom/google/android/gms/internal/zzagk;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzagk",
            "<",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/zzafc$a;",
            ">;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc$7;->b:Lcom/google/android/gms/internal/zzafc;

    iget v1, p0, Lcom/google/android/gms/internal/zzafc$7;->a:I

    invoke-static {v0, p1, v1}, Lcom/google/android/gms/internal/zzafc;->zza(Lcom/google/android/gms/internal/zzafc;Lcom/google/android/gms/internal/zzagk;I)V

    return-void
.end method
