.class Lcom/google/android/gms/internal/zzafh$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/zzafh$zza;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzafh;->a(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzafh$zzb;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/zzafa;

.field final synthetic b:Lcom/google/android/gms/internal/zzafh$zzb;

.field final synthetic c:Lcom/google/android/gms/internal/zzafh;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzafh;Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzafh$zzb;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzafh$2;->c:Lcom/google/android/gms/internal/zzafh;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzafh$2;->a:Lcom/google/android/gms/internal/zzafa;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzafh$2;->b:Lcom/google/android/gms/internal/zzafh$zzb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public zza(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzafh;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafh$2;->a:Lcom/google/android/gms/internal/zzafa;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzafa;->zza(Lcom/google/android/gms/internal/zzahi;)Lcom/google/android/gms/internal/zzafa;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafh$2;->b:Lcom/google/android/gms/internal/zzafh$zzb;

    invoke-virtual {p2, v0, v1}, Lcom/google/android/gms/internal/zzafh;->a(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzafh$zzb;)V

    return-void
.end method
