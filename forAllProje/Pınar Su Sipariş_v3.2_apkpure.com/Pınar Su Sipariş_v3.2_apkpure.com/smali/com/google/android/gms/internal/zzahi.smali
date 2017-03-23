.class public Lcom/google/android/gms/internal/zzahi;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/zzahi$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable",
        "<",
        "Lcom/google/android/gms/internal/zzahi;",
        ">;"
    }
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z

.field private static final zzbQA:Lcom/google/android/gms/internal/zzahi;

.field private static final zzbQB:Lcom/google/android/gms/internal/zzahi;

.field private static final zzbQC:Lcom/google/android/gms/internal/zzahi;

.field private static final zzbQz:Lcom/google/android/gms/internal/zzahi;


# instance fields
.field private final zzaB:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lcom/google/android/gms/internal/zzahi;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/google/android/gms/internal/zzahi;->$assertionsDisabled:Z

    new-instance v0, Lcom/google/android/gms/internal/zzahi;

    const-string v1, "[MIN_KEY]"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/zzahi;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/zzahi;->zzbQz:Lcom/google/android/gms/internal/zzahi;

    new-instance v0, Lcom/google/android/gms/internal/zzahi;

    const-string v1, "[MAX_KEY]"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/zzahi;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/zzahi;->zzbQA:Lcom/google/android/gms/internal/zzahi;

    new-instance v0, Lcom/google/android/gms/internal/zzahi;

    const-string v1, ".priority"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/zzahi;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/zzahi;->zzbQB:Lcom/google/android/gms/internal/zzahi;

    new-instance v0, Lcom/google/android/gms/internal/zzahi;

    const-string v1, ".info"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/zzahi;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/zzahi;->zzbQC:Lcom/google/android/gms/internal/zzahi;

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzahi;->zzaB:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Lcom/google/android/gms/internal/zzahi$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzahi;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public static zzTh()Lcom/google/android/gms/internal/zzahi;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/zzahi;->zzbQz:Lcom/google/android/gms/internal/zzahi;

    return-object v0
.end method

.method public static zzTi()Lcom/google/android/gms/internal/zzahi;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/zzahi;->zzbQA:Lcom/google/android/gms/internal/zzahi;

    return-object v0
.end method

.method public static zzTj()Lcom/google/android/gms/internal/zzahi;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/zzahi;->zzbQB:Lcom/google/android/gms/internal/zzahi;

    return-object v0
.end method

.method public static zzTk()Lcom/google/android/gms/internal/zzahi;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/zzahi;->zzbQC:Lcom/google/android/gms/internal/zzahi;

    return-object v0
.end method

.method public static zzig(Ljava/lang/String;)Lcom/google/android/gms/internal/zzahi;
    .locals 2

    invoke-static {p0}, Lcom/google/android/gms/internal/zzaiv;->zzio(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/zzahi$a;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/zzahi$a;-><init>(Ljava/lang/String;I)V

    :goto_0
    return-object v0

    :cond_0
    const-string v0, ".priority"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/google/android/gms/internal/zzahi;->zzbQB:Lcom/google/android/gms/internal/zzahi;

    goto :goto_0

    :cond_1
    sget-boolean v0, Lcom/google/android/gms/internal/zzahi;->$assertionsDisabled:Z

    if-nez v0, :cond_2

    const-string v0, "/"

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_2
    new-instance v0, Lcom/google/android/gms/internal/zzahi;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/zzahi;-><init>(Ljava/lang/String;)V

    goto :goto_0
.end method

.method static synthetic zzj(Lcom/google/android/gms/internal/zzahi;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzahi;->zzaB:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public asString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzahi;->zzaB:Ljava/lang/String;

    return-object v0
.end method

.method public synthetic compareTo(Ljava/lang/Object;)I
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/zzahi;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzahi;->zzi(Lcom/google/android/gms/internal/zzahi;)I

    move-result v0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lcom/google/android/gms/internal/zzahi;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    if-ne p0, p1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    check-cast p1, Lcom/google/android/gms/internal/zzahi;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzahi;->zzaB:Ljava/lang/String;

    iget-object v1, p1, Lcom/google/android/gms/internal/zzahi;->zzaB:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzahi;->zzaB:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method protected intValue()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzahi;->zzaB:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0xc

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "ChildKey(\""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public zzTl()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/zzahi;->zzbQB:Lcom/google/android/gms/internal/zzahi;

    if-ne p0, v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected zzTm()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public zzi(Lcom/google/android/gms/internal/zzahi;)I
    .locals 3

    const/4 v1, 0x1

    const/4 v0, -0x1

    if-ne p0, p1, :cond_1

    const/4 v0, 0x0

    :cond_0
    :goto_0
    return v0

    :cond_1
    sget-object v2, Lcom/google/android/gms/internal/zzahi;->zzbQz:Lcom/google/android/gms/internal/zzahi;

    if-eq p0, v2, :cond_0

    sget-object v2, Lcom/google/android/gms/internal/zzahi;->zzbQA:Lcom/google/android/gms/internal/zzahi;

    if-eq p1, v2, :cond_0

    sget-object v2, Lcom/google/android/gms/internal/zzahi;->zzbQz:Lcom/google/android/gms/internal/zzahi;

    if-eq p1, v2, :cond_2

    sget-object v2, Lcom/google/android/gms/internal/zzahi;->zzbQA:Lcom/google/android/gms/internal/zzahi;

    if-ne p0, v2, :cond_3

    :cond_2
    move v0, v1

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzahi;->zzTm()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzahi;->zzTm()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzahi;->intValue()I

    move-result v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzahi;->intValue()I

    move-result v1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/zzaiv;->zzC(II)I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzahi;->zzaB:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    iget-object v1, p1, Lcom/google/android/gms/internal/zzahi;->zzaB:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/zzaiv;->zzC(II)I

    move-result v0

    goto :goto_0

    :cond_4
    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzahi;->zzTm()Z

    move-result v0

    if-eqz v0, :cond_5

    move v0, v1

    goto :goto_0

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/zzahi;->zzaB:Ljava/lang/String;

    iget-object v1, p1, Lcom/google/android/gms/internal/zzahi;->zzaB:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    goto :goto_0
.end method
