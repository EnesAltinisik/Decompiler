.class public Lcom/google/android/gms/internal/zzahx;
.super Lcom/google/android/gms/internal/zzaho;


# static fields
.field private static final zzbRn:Lcom/google/android/gms/internal/zzahx;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/zzahx;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzahx;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/zzahx;->zzbRn:Lcom/google/android/gms/internal/zzahx;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzaho;-><init>()V

    return-void
.end method

.method public static zzTL()Lcom/google/android/gms/internal/zzahx;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/zzahx;->zzbRn:Lcom/google/android/gms/internal/zzahx;

    return-object v0
.end method


# virtual methods
.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/zzaht;

    check-cast p2, Lcom/google/android/gms/internal/zzaht;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/zzahx;->zza(Lcom/google/android/gms/internal/zzaht;Lcom/google/android/gms/internal/zzaht;)I

    move-result v0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lcom/google/android/gms/internal/zzahx;

    return v0
.end method

.method public hashCode()I
    .locals 1

    const v0, 0x302679

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "PriorityIndex"

    return-object v0
.end method

.method public zzTC()Lcom/google/android/gms/internal/zzaht;
    .locals 2

    invoke-static {}, Lcom/google/android/gms/internal/zzahi;->zzTi()Lcom/google/android/gms/internal/zzahi;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/zzahu;->zzbRi:Lcom/google/android/gms/internal/zzahj;

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/zzahx;->zzg(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzaht;

    move-result-object v0

    return-object v0
.end method

.method public zzTD()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t get query definition on priority index!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public zza(Lcom/google/android/gms/internal/zzaht;Lcom/google/android/gms/internal/zzaht;)I
    .locals 4

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzaht;->zzPj()Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzahu;->zzTp()Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzaht;->zzPj()Lcom/google/android/gms/internal/zzahu;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/internal/zzahu;->zzTp()Lcom/google/android/gms/internal/zzahu;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzaht;->zzTK()Lcom/google/android/gms/internal/zzahi;

    move-result-object v2

    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzaht;->zzTK()Lcom/google/android/gms/internal/zzahi;

    move-result-object v3

    invoke-static {v2, v0, v3, v1}, Lcom/google/android/gms/internal/zzahv;->zza(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;)I

    move-result v0

    return v0
.end method

.method public zzg(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzaht;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/zzaht;

    new-instance v1, Lcom/google/android/gms/internal/zzaia;

    const-string v2, "[PRIORITY-POST]"

    invoke-direct {v1, v2, p2}, Lcom/google/android/gms/internal/zzaia;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/zzahu;)V

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/internal/zzaht;-><init>(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;)V

    return-object v0
.end method

.method public zzl(Lcom/google/android/gms/internal/zzahu;)Z
    .locals 1

    invoke-interface {p1}, Lcom/google/android/gms/internal/zzahu;->zzTp()Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzahu;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
