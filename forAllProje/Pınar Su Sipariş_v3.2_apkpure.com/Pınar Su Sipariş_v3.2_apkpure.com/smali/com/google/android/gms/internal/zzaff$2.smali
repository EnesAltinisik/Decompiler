.class final Lcom/google/android/gms/internal/zzaff$2;
.super Lcom/google/android/gms/internal/zzahj$zza;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzaff;->zza(Lcom/google/android/gms/internal/zzahu;Ljava/util/Map;)Lcom/google/android/gms/internal/zzahu;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/Map;

.field final synthetic b:Lcom/google/android/gms/internal/zzafg;


# direct methods
.method constructor <init>(Ljava/util/Map;Lcom/google/android/gms/internal/zzafg;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzaff$2;->a:Ljava/util/Map;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzaff$2;->b:Lcom/google/android/gms/internal/zzafg;

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzahj$zza;-><init>()V

    return-void
.end method


# virtual methods
.method public zzb(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaff$2;->a:Ljava/util/Map;

    invoke-static {p2, v0}, Lcom/google/android/gms/internal/zzaff;->zza(Lcom/google/android/gms/internal/zzahu;Ljava/util/Map;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    if-eq v0, p2, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzaff$2;->b:Lcom/google/android/gms/internal/zzafg;

    new-instance v2, Lcom/google/android/gms/internal/zzafa;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzahi;->asString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/zzafa;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/internal/zzafg;->zzg(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;)V

    :cond_0
    return-void
.end method
