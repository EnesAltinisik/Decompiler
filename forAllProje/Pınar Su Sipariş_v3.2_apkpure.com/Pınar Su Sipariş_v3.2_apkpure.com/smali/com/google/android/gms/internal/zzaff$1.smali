.class final Lcom/google/android/gms/internal/zzaff$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/zzafh$zzb;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzaff;->zza(Lcom/google/android/gms/internal/zzafh;Ljava/util/Map;)Lcom/google/android/gms/internal/zzafh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/zzafh;

.field final synthetic b:Ljava/util/Map;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzafh;Ljava/util/Map;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzaff$1;->a:Lcom/google/android/gms/internal/zzafh;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzaff$1;->b:Ljava/util/Map;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public zzf(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaff$1;->a:Lcom/google/android/gms/internal/zzafh;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzaff$1;->b:Ljava/util/Map;

    invoke-static {p2, v1}, Lcom/google/android/gms/internal/zzaff;->zza(Lcom/google/android/gms/internal/zzahu;Ljava/util/Map;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/zzafh;->a(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;)V

    return-void
.end method
