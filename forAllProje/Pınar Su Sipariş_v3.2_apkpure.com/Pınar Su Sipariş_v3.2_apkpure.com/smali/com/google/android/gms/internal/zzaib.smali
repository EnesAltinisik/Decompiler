.class public Lcom/google/android/gms/internal/zzaib;
.super Lcom/google/android/gms/internal/zzaho;


# static fields
.field private static final zzbRr:Lcom/google/android/gms/internal/zzaib;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/zzaib;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzaib;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/zzaib;->zzbRr:Lcom/google/android/gms/internal/zzaib;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzaho;-><init>()V

    return-void
.end method

.method public static zzTN()Lcom/google/android/gms/internal/zzaib;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/zzaib;->zzbRr:Lcom/google/android/gms/internal/zzaib;

    return-object v0
.end method


# virtual methods
.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/zzaht;

    check-cast p2, Lcom/google/android/gms/internal/zzaht;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/zzaib;->zza(Lcom/google/android/gms/internal/zzaht;Lcom/google/android/gms/internal/zzaht;)I

    move-result v0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lcom/google/android/gms/internal/zzaib;

    return v0
.end method

.method public hashCode()I
    .locals 1

    const/4 v0, 0x4

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "ValueIndex"

    return-object v0
.end method

.method public zzTC()Lcom/google/android/gms/internal/zzaht;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/zzaht;

    invoke-static {}, Lcom/google/android/gms/internal/zzahi;->zzTi()Lcom/google/android/gms/internal/zzahi;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/internal/zzahu;->zzbRi:Lcom/google/android/gms/internal/zzahj;

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/zzaht;-><init>(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;)V

    return-object v0
.end method

.method public zzTD()Ljava/lang/String;
    .locals 1

    const-string v0, ".value"

    return-object v0
.end method

.method public zza(Lcom/google/android/gms/internal/zzaht;Lcom/google/android/gms/internal/zzaht;)I
    .locals 2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzaht;->zzPj()Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzaht;->zzPj()Lcom/google/android/gms/internal/zzahu;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/zzahu;->compareTo(Ljava/lang/Object;)I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzaht;->zzTK()Lcom/google/android/gms/internal/zzahi;

    move-result-object v0

    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzaht;->zzTK()Lcom/google/android/gms/internal/zzahi;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzahi;->zzi(Lcom/google/android/gms/internal/zzahi;)I

    move-result v0

    :cond_0
    return v0
.end method

.method public zzg(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzaht;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/zzaht;

    invoke-direct {v0, p1, p2}, Lcom/google/android/gms/internal/zzaht;-><init>(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;)V

    return-object v0
.end method

.method public zzl(Lcom/google/android/gms/internal/zzahu;)Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
