.class Lcom/google/android/gms/internal/zzagh$6;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzagh;->zza(Lcom/google/android/gms/internal/zzafz;)Lcom/google/android/gms/internal/zzagf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator",
        "<",
        "Lcom/google/android/gms/internal/zzagg;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/zzagh;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzagh;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzagh$6;->a:Lcom/google/android/gms/internal/zzagh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/zzagg;Lcom/google/android/gms/internal/zzagg;)I
    .locals 4

    iget-wide v0, p1, Lcom/google/android/gms/internal/zzagg;->zzbOR:J

    iget-wide v2, p2, Lcom/google/android/gms/internal/zzagg;->zzbOR:J

    invoke-static {v0, v1, v2, v3}, Lcom/google/android/gms/internal/zzaiv;->zzf(JJ)I

    move-result v0

    return v0
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/zzagg;

    check-cast p2, Lcom/google/android/gms/internal/zzagg;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/zzagh$6;->a(Lcom/google/android/gms/internal/zzagg;Lcom/google/android/gms/internal/zzagg;)I

    move-result v0

    return v0
.end method
