.class public Lcom/google/android/gms/internal/zzaht;
.super Ljava/lang/Object;


# static fields
.field private static final zzbRg:Lcom/google/android/gms/internal/zzaht;

.field private static final zzbRh:Lcom/google/android/gms/internal/zzaht;


# instance fields
.field private final zzbPi:Lcom/google/android/gms/internal/zzahi;

.field private final zzbQX:Lcom/google/android/gms/internal/zzahu;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/zzaht;

    invoke-static {}, Lcom/google/android/gms/internal/zzahi;->zzTh()Lcom/google/android/gms/internal/zzahi;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/internal/zzahn;->zzTA()Lcom/google/android/gms/internal/zzahn;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/zzaht;-><init>(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;)V

    sput-object v0, Lcom/google/android/gms/internal/zzaht;->zzbRg:Lcom/google/android/gms/internal/zzaht;

    new-instance v0, Lcom/google/android/gms/internal/zzaht;

    invoke-static {}, Lcom/google/android/gms/internal/zzahi;->zzTi()Lcom/google/android/gms/internal/zzahi;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/internal/zzahu;->zzbRi:Lcom/google/android/gms/internal/zzahj;

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/zzaht;-><init>(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;)V

    sput-object v0, Lcom/google/android/gms/internal/zzaht;->zzbRh:Lcom/google/android/gms/internal/zzaht;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzaht;->zzbPi:Lcom/google/android/gms/internal/zzahi;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzaht;->zzbQX:Lcom/google/android/gms/internal/zzahu;

    return-void
.end method

.method public static zzTI()Lcom/google/android/gms/internal/zzaht;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/zzaht;->zzbRg:Lcom/google/android/gms/internal/zzaht;

    return-object v0
.end method

.method public static zzTJ()Lcom/google/android/gms/internal/zzaht;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/zzaht;->zzbRh:Lcom/google/android/gms/internal/zzaht;

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p0, p1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_3

    :cond_2
    move v0, v1

    goto :goto_0

    :cond_3
    check-cast p1, Lcom/google/android/gms/internal/zzaht;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzaht;->zzbPi:Lcom/google/android/gms/internal/zzahi;

    iget-object v3, p1, Lcom/google/android/gms/internal/zzaht;->zzbPi:Lcom/google/android/gms/internal/zzahi;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/zzahi;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    move v0, v1

    goto :goto_0

    :cond_4
    iget-object v2, p0, Lcom/google/android/gms/internal/zzaht;->zzbQX:Lcom/google/android/gms/internal/zzahu;

    iget-object v3, p1, Lcom/google/android/gms/internal/zzaht;->zzbQX:Lcom/google/android/gms/internal/zzahu;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    move v0, v1

    goto :goto_0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaht;->zzbPi:Lcom/google/android/gms/internal/zzahi;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzahi;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/google/android/gms/internal/zzaht;->zzbQX:Lcom/google/android/gms/internal/zzahu;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaht;->zzbPi:Lcom/google/android/gms/internal/zzahi;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzaht;->zzbQX:Lcom/google/android/gms/internal/zzahu;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x17

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v3, v4

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "NamedNode{name="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", node="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public zzPj()Lcom/google/android/gms/internal/zzahu;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaht;->zzbQX:Lcom/google/android/gms/internal/zzahu;

    return-object v0
.end method

.method public zzTK()Lcom/google/android/gms/internal/zzahi;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaht;->zzbPi:Lcom/google/android/gms/internal/zzahi;

    return-object v0
.end method
