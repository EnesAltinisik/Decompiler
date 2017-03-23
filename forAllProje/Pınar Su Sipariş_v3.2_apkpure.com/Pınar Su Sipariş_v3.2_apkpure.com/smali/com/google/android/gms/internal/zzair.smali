.class public Lcom/google/android/gms/internal/zzair;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/zzain;


# instance fields
.field private final zzbSj:Lcom/google/android/gms/internal/zzain;

.field private zzbSk:J


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzain;J)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/android/gms/internal/zzair;->zzbSk:J

    iput-object p1, p0, Lcom/google/android/gms/internal/zzair;->zzbSj:Lcom/google/android/gms/internal/zzain;

    iput-wide p2, p0, Lcom/google/android/gms/internal/zzair;->zzbSk:J

    return-void
.end method


# virtual methods
.method public zzUi()J
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzair;->zzbSj:Lcom/google/android/gms/internal/zzain;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzain;->zzUi()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/google/android/gms/internal/zzair;->zzbSk:J

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public zzaI(J)V
    .locals 1

    iput-wide p1, p0, Lcom/google/android/gms/internal/zzair;->zzbSk:J

    return-void
.end method
