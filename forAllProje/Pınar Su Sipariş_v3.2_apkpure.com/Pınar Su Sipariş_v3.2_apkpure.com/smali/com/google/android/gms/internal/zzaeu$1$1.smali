.class Lcom/google/android/gms/internal/zzaeu$1$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/zzaeq$zza;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzaeu$1;->zza(ZLcom/google/android/gms/internal/zzaee$zza;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/zzaee$zza;

.field final synthetic b:Lcom/google/android/gms/internal/zzaeu$1;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzaeu$1;Lcom/google/android/gms/internal/zzaee$zza;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzaeu$1$1;->b:Lcom/google/android/gms/internal/zzaeu$1;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzaeu$1$1;->a:Lcom/google/android/gms/internal/zzaee$zza;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaeu$1$1;->a:Lcom/google/android/gms/internal/zzaee$zza;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/zzaee$zza;->onError(Ljava/lang/String;)V

    return-void
.end method

.method public zzhT(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaeu$1$1;->a:Lcom/google/android/gms/internal/zzaee$zza;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/zzaee$zza;->zzhT(Ljava/lang/String;)V

    return-void
.end method
