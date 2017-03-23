.class Lcom/google/android/gms/internal/zzafh$1;
.super Lcom/google/android/gms/internal/zzahj$zza;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzafh;->a(Lcom/google/android/gms/internal/zzafa;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/zzafa;

.field final synthetic b:Lcom/google/android/gms/internal/zzafh;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzafh;Lcom/google/android/gms/internal/zzafa;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzafh$1;->b:Lcom/google/android/gms/internal/zzafh;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzafh$1;->a:Lcom/google/android/gms/internal/zzafa;

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzahj$zza;-><init>()V

    return-void
.end method


# virtual methods
.method public zzb(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafh$1;->b:Lcom/google/android/gms/internal/zzafh;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafh$1;->a:Lcom/google/android/gms/internal/zzafa;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/zzafa;->zza(Lcom/google/android/gms/internal/zzahi;)Lcom/google/android/gms/internal/zzafa;

    move-result-object v1

    invoke-virtual {v0, v1, p2}, Lcom/google/android/gms/internal/zzafh;->a(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;)V

    return-void
.end method
