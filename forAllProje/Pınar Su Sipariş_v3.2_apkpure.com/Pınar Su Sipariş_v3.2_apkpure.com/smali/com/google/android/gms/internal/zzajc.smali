.class public Lcom/google/android/gms/internal/zzajc;
.super Ljava/lang/Object;


# instance fields
.field private final zzbTr:I

.field private final zzbTs:J


# direct methods
.method public constructor <init>(IJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/zzajc;->zzbTr:I

    iput-wide p2, p0, Lcom/google/android/gms/internal/zzajc;->zzbTs:J

    return-void
.end method


# virtual methods
.method public zzUA()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/zzajc;->zzbTs:J

    return-wide v0
.end method

.method public zzUz()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/zzajc;->zzbTr:I

    return v0
.end method
