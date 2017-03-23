.class Lcom/google/android/gms/internal/zzagk$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/zzagk$zzb;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzagk;->zza(Lcom/google/android/gms/internal/zzagk$zzb;ZZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/zzagk$zzb",
        "<TT;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/zzagk$zzb;

.field final synthetic b:Z

.field final synthetic c:Lcom/google/android/gms/internal/zzagk;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzagk;Lcom/google/android/gms/internal/zzagk$zzb;Z)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzagk$1;->c:Lcom/google/android/gms/internal/zzagk;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzagk$1;->a:Lcom/google/android/gms/internal/zzagk$zzb;

    iput-boolean p3, p0, Lcom/google/android/gms/internal/zzagk$1;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public zzd(Lcom/google/android/gms/internal/zzagk;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzagk",
            "<TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagk$1;->a:Lcom/google/android/gms/internal/zzagk$zzb;

    const/4 v1, 0x1

    iget-boolean v2, p0, Lcom/google/android/gms/internal/zzagk$1;->b:Z

    invoke-virtual {p1, v0, v1, v2}, Lcom/google/android/gms/internal/zzagk;->zza(Lcom/google/android/gms/internal/zzagk$zzb;ZZ)V

    return-void
.end method
