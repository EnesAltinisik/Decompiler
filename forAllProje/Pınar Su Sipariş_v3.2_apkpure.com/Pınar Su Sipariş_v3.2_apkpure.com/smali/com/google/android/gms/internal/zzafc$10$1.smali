.class Lcom/google/android/gms/internal/zzafc$10$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/zzaem;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzafc$10;->zza(Lcom/google/android/gms/internal/zzagu;Lcom/google/android/gms/internal/zzafk;Lcom/google/android/gms/internal/zzaei;Lcom/google/android/gms/internal/zzafj$zza;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/zzafj$zza;

.field final synthetic b:Lcom/google/android/gms/internal/zzafc$10;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzafc$10;Lcom/google/android/gms/internal/zzafj$zza;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzafc$10$1;->b:Lcom/google/android/gms/internal/zzafc$10;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzafc$10$1;->a:Lcom/google/android/gms/internal/zzafj$zza;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public zzaj(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/zzafc;->zzal(Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/database/DatabaseError;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafc$10$1;->a:Lcom/google/android/gms/internal/zzafj$zza;

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/zzafj$zza;->zzb(Lcom/google/firebase/database/DatabaseError;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafc$10$1;->b:Lcom/google/android/gms/internal/zzafc$10;

    iget-object v1, v1, Lcom/google/android/gms/internal/zzafc$10;->a:Lcom/google/android/gms/internal/zzafc;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/zzafc;->zza(Lcom/google/android/gms/internal/zzafc;Ljava/util/List;)V

    return-void
.end method
