.class public Lcom/google/android/gms/internal/zzafg;
.super Ljava/lang/Object;


# instance fields
.field private zzbNd:Lcom/google/android/gms/internal/zzahu;


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/zzahn;->zzTA()Lcom/google/android/gms/internal/zzahn;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzafg;->zzbNd:Lcom/google/android/gms/internal/zzahu;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/zzahu;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzafg;->zzbNd:Lcom/google/android/gms/internal/zzahu;

    return-void
.end method


# virtual methods
.method public zzRG()Lcom/google/android/gms/internal/zzahu;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafg;->zzbNd:Lcom/google/android/gms/internal/zzahu;

    return-object v0
.end method

.method public zzg(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafg;->zzbNd:Lcom/google/android/gms/internal/zzahu;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/zzahu;->zzl(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzafg;->zzbNd:Lcom/google/android/gms/internal/zzahu;

    return-void
.end method

.method public zzq(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzahu;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafg;->zzbNd:Lcom/google/android/gms/internal/zzahu;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/zzahu;->zzO(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    return-object v0
.end method
