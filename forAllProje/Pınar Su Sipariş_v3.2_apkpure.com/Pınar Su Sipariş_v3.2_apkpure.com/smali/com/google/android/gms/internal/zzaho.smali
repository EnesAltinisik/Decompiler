.class public abstract Lcom/google/android/gms/internal/zzaho;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator",
        "<",
        "Lcom/google/android/gms/internal/zzaht;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static zzih(Ljava/lang/String;)Lcom/google/android/gms/internal/zzaho;
    .locals 2

    const-string v0, ".value"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/zzaib;->zzTN()Lcom/google/android/gms/internal/zzaib;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const-string v0, ".key"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/google/android/gms/internal/zzahq;->zzTH()Lcom/google/android/gms/internal/zzahq;

    move-result-object v0

    goto :goto_0

    :cond_1
    const-string v0, ".priority"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "queryDefinition shouldn\'t ever be .priority since it\'s the default"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Lcom/google/android/gms/internal/zzahw;

    new-instance v1, Lcom/google/android/gms/internal/zzafa;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/zzafa;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/zzahw;-><init>(Lcom/google/android/gms/internal/zzafa;)V

    goto :goto_0
.end method


# virtual methods
.method public zzTB()Lcom/google/android/gms/internal/zzaht;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/zzaht;->zzTI()Lcom/google/android/gms/internal/zzaht;

    move-result-object v0

    return-object v0
.end method

.method public abstract zzTC()Lcom/google/android/gms/internal/zzaht;
.end method

.method public abstract zzTD()Ljava/lang/String;
.end method

.method public zza(Lcom/google/android/gms/internal/zzaht;Lcom/google/android/gms/internal/zzaht;Z)I
    .locals 1

    if-eqz p3, :cond_0

    invoke-virtual {p0, p2, p1}, Lcom/google/android/gms/internal/zzaho;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/zzaho;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    goto :goto_0
.end method

.method public zza(Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzahu;)Z
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/zzaht;

    invoke-static {}, Lcom/google/android/gms/internal/zzahi;->zzTh()Lcom/google/android/gms/internal/zzahi;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lcom/google/android/gms/internal/zzaht;-><init>(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;)V

    new-instance v1, Lcom/google/android/gms/internal/zzaht;

    invoke-static {}, Lcom/google/android/gms/internal/zzahi;->zzTh()Lcom/google/android/gms/internal/zzahi;

    move-result-object v2

    invoke-direct {v1, v2, p2}, Lcom/google/android/gms/internal/zzaht;-><init>(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;)V

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/zzaho;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public abstract zzg(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahu;)Lcom/google/android/gms/internal/zzaht;
.end method

.method public abstract zzl(Lcom/google/android/gms/internal/zzahu;)Z
.end method
