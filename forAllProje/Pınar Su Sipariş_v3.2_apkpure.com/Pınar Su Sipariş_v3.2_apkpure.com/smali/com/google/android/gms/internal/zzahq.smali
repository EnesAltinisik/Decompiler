.class public Lcom/google/android/gms/internal/zzahq;
.super Lcom/google/android/gms/internal/zzaho;


# static fields
.field static final synthetic $assertionsDisabled:Z

.field private static final zzbQZ:Lcom/google/android/gms/internal/zzahq;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/google/android/gms/internal/zzahq;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/google/android/gms/internal/zzahq;->$assertionsDisabled:Z

    new-instance v0, Lcom/google/android/gms/internal/zzahq;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzahq;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/zzahq;->zzbQZ:Lcom/google/android/gms/internal/zzahq;

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzaho;-><init>()V

    return-void
.end method

.method public static zzTH()Lcom/google/android/gms/internal/zzahq;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/zzahq;->zzbQZ:Lcom/google/android/gms/internal/zzahq;

    return-object v0
.end method


# virtual methods
.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/zzaht;

    check-cast p2, Lcom/google/android/gms/internal/zzaht;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/zzahq;->zza(Lcom/google/android/gms/internal/zzaht;Lcom/google/android/gms/internal/zzaht;)I

    move-result v0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lcom/google/android/gms/internal/zzahq;

    return v0
.end method

.method public hashCode()I
    .locals 1

    const/16 v0, 0x25

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "KeyIndex"

    return-object v0
.end method

.method public zzTC()Lcom/google/android/gms/internal/zzaht;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/zzaht;->zzTJ()Lcom/google/android/gms/internal/zzaht;

    move-result-object v0

    return-object v0
.end method

.method public zzTD()Ljava/lang/String;
    .locals 1

    const-string v0, ".key"

    return-object v0
.end method

.method public zza(Lcom/google/android/gms/internal/zzaht;Lcom/google/android/gms/internal/zzaht;)I
    .locals 2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzaht;->zzTK()Lcom/google/android/gms/internal/zzahi;

    move-result-object v0

    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzaht;->zzTK()Lcom/google/android/gms/internal/zzahi;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzahi;->zzi(Lcom/google/android/gms/internal/zzahi;)I

    move-result v0

    return v0
.end method

.method public zzg(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzaht;
    .locals 3

    sget-boolean v0, Lcom/google/android/gms/internal/zzahq;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    instance-of v0, p2, Lcom/google/android/gms/internal/zzaia;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_0
    new-instance v1, Lcom/google/android/gms/internal/zzaht;

    invoke-interface {p2}, Lcom/google/android/gms/internal/zzahu;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzahi;->zzig(Ljava/lang/String;)Lcom/google/android/gms/internal/zzahi;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/zzahn;->zzTA()Lcom/google/android/gms/internal/zzahn;

    move-result-object v2

    invoke-direct {v1, v0, v2}, Lcom/google/android/gms/internal/zzaht;-><init>(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;)V

    return-object v1
.end method

.method public zzl(Lcom/google/android/gms/internal/zzahu;)Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
