.class public Lcom/google/android/gms/internal/zzaau$zza;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/zzaau;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "zza"
.end annotation


# instance fields
.field private final zzbtc:Lcom/google/android/gms/internal/zzabc;

.field private final zzbvb:[B

.field private final zzbvc:J

.field private final zzbvd:Lcom/google/android/gms/internal/zzaam;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzaam;[BLcom/google/android/gms/internal/zzabc;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzaau$zza;->zzbvd:Lcom/google/android/gms/internal/zzaam;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzaau$zza;->zzbvb:[B

    iput-object p3, p0, Lcom/google/android/gms/internal/zzaau$zza;->zzbtc:Lcom/google/android/gms/internal/zzabc;

    iput-wide p4, p0, Lcom/google/android/gms/internal/zzaau$zza;->zzbvc:J

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/zzabc;)V
    .locals 6

    const/4 v1, 0x0

    const-wide/16 v4, 0x0

    move-object v0, p0

    move-object v2, v1

    move-object v3, p1

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/zzaau$zza;-><init>(Lcom/google/android/gms/internal/zzaam;[BLcom/google/android/gms/internal/zzabc;J)V

    return-void
.end method


# virtual methods
.method public zzLR()[B
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaau$zza;->zzbvb:[B

    return-object v0
.end method

.method public zzLS()Lcom/google/android/gms/internal/zzaam;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaau$zza;->zzbvd:Lcom/google/android/gms/internal/zzaam;

    return-object v0
.end method

.method public zzLT()Lcom/google/android/gms/internal/zzabc;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaau$zza;->zzbtc:Lcom/google/android/gms/internal/zzabc;

    return-object v0
.end method
