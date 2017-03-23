.class public Lcom/google/android/gms/internal/zzabk;
.super Lcom/google/android/gms/internal/zzabh;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/zzabh",
        "<",
        "Lcom/google/android/gms/internal/zzvh;",
        ">;"
    }
.end annotation


# static fields
.field private static final zzbvH:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/zzvh;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private zzbvJ:Lcom/google/android/gms/internal/zzvh;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "hasOwnProperty"

    sget-object v2, Lcom/google/android/gms/internal/zzxf;->zzbus:Lcom/google/android/gms/internal/zzxf;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/zzabk;->zzbvH:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/zzvh;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzabh;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzabk;->zzbvJ:Lcom/google/android/gms/internal/zzvh;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzabk;->zzbvJ:Lcom/google/android/gms/internal/zzvh;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public zzMj()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator",
            "<",
            "Lcom/google/android/gms/internal/zzabh",
            "<*>;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzabk;->zzMl()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public synthetic zzMk()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzabk;->zzMp()Lcom/google/android/gms/internal/zzvh;

    move-result-object v0

    return-object v0
.end method

.method public zzMp()Lcom/google/android/gms/internal/zzvh;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzabk;->zzbvJ:Lcom/google/android/gms/internal/zzvh;

    return-object v0
.end method

.method public zzhv(Ljava/lang/String;)Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/zzabk;->zzbvH:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public zzhw(Ljava/lang/String;)Lcom/google/android/gms/internal/zzvh;
    .locals 3

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzabk;->zzhv(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/zzabk;->zzbvH:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzvh;

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0x3c

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Native Method "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " is not defined for type InstructionReference."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
