.class Lcom/google/firebase/database/connection/idl/zzc$1;
.super Lcom/google/firebase/database/connection/idl/zzg$zza;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/firebase/database/connection/idl/zzc;->zza(Ljava/util/List;Ljava/util/Map;Lcom/google/android/gms/internal/zzaei;Ljava/lang/Long;Lcom/google/android/gms/internal/zzaem;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/zzaei;

.field final synthetic b:Lcom/google/firebase/database/connection/idl/zzc;


# direct methods
.method constructor <init>(Lcom/google/firebase/database/connection/idl/zzc;Lcom/google/android/gms/internal/zzaei;)V
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/database/connection/idl/zzc$1;->b:Lcom/google/firebase/database/connection/idl/zzc;

    iput-object p2, p0, Lcom/google/firebase/database/connection/idl/zzc$1;->a:Lcom/google/android/gms/internal/zzaei;

    invoke-direct {p0}, Lcom/google/firebase/database/connection/idl/zzg$zza;-><init>()V

    return-void
.end method


# virtual methods
.method public zzPY()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/database/connection/idl/zzc$1;->a:Lcom/google/android/gms/internal/zzaei;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzaei;->zzPY()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public zzPZ()Z
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/database/connection/idl/zzc$1;->a:Lcom/google/android/gms/internal/zzaei;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzaei;->zzPZ()Z

    move-result v0

    return v0
.end method

.method public zzQF()Lcom/google/firebase/database/connection/idl/CompoundHashParcelable;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/database/connection/idl/zzc$1;->a:Lcom/google/android/gms/internal/zzaei;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzaei;->zzQa()Lcom/google/android/gms/internal/zzaec;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/database/connection/idl/CompoundHashParcelable;->a(Lcom/google/android/gms/internal/zzaec;)Lcom/google/firebase/database/connection/idl/CompoundHashParcelable;

    move-result-object v0

    return-object v0
.end method
