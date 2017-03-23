.class public abstract Lcom/google/android/gms/internal/zzafw;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/zzafw$zza;
    }
.end annotation


# instance fields
.field protected final zzbHw:Lcom/google/android/gms/internal/zzafa;

.field protected final zzbOn:Lcom/google/android/gms/internal/zzafw$zza;

.field protected final zzbOo:Lcom/google/android/gms/internal/zzafx;


# direct methods
.method protected constructor <init>(Lcom/google/android/gms/internal/zzafw$zza;Lcom/google/android/gms/internal/zzafx;Lcom/google/android/gms/internal/zzafa;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzafw;->zzbOn:Lcom/google/android/gms/internal/zzafw$zza;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzafw;->zzbOo:Lcom/google/android/gms/internal/zzafx;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzafw;->zzbHw:Lcom/google/android/gms/internal/zzafa;

    return-void
.end method


# virtual methods
.method public zzPn()Lcom/google/android/gms/internal/zzafa;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafw;->zzbHw:Lcom/google/android/gms/internal/zzafa;

    return-object v0
.end method

.method public zzRZ()Lcom/google/android/gms/internal/zzafx;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafw;->zzbOo:Lcom/google/android/gms/internal/zzafx;

    return-object v0
.end method

.method public zzSa()Lcom/google/android/gms/internal/zzafw$zza;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafw;->zzbOn:Lcom/google/android/gms/internal/zzafw$zza;

    return-object v0
.end method

.method public abstract zzc(Lcom/google/android/gms/internal/zzahi;)Lcom/google/android/gms/internal/zzafw;
.end method
