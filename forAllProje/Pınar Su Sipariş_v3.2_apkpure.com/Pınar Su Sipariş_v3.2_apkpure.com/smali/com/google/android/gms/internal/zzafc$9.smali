.class Lcom/google/android/gms/internal/zzafc$9;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/zzafj$zzd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzafc;->zzRy()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/zzafc;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzafc;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzafc$9;->a:Lcom/google/android/gms/internal/zzafc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public zza(Lcom/google/android/gms/internal/zzagu;Lcom/google/android/gms/internal/zzafk;)V
    .locals 0

    return-void
.end method

.method public zza(Lcom/google/android/gms/internal/zzagu;Lcom/google/android/gms/internal/zzafk;Lcom/google/android/gms/internal/zzaei;Lcom/google/android/gms/internal/zzafj$zza;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc$9;->a:Lcom/google/android/gms/internal/zzafc;

    new-instance v1, Lcom/google/android/gms/internal/zzafc$9$1;

    invoke-direct {v1, p0, p1, p4}, Lcom/google/android/gms/internal/zzafc$9$1;-><init>(Lcom/google/android/gms/internal/zzafc$9;Lcom/google/android/gms/internal/zzagu;Lcom/google/android/gms/internal/zzafj$zza;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzafc;->scheduleNow(Ljava/lang/Runnable;)V

    return-void
.end method
