.class public Lcom/google/android/gms/internal/zzabc$zza;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/zzabc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "zza"
.end annotation


# instance fields
.field private zzahE:Ljava/lang/String;

.field private final zzbvo:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/zzabe;",
            ">;"
        }
    .end annotation
.end field

.field private final zzbvp:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/zzabd;",
            ">;"
        }
    .end annotation
.end field

.field private zzbvq:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzabc$zza;->zzbvo:Ljava/util/List;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzabc$zza;->zzbvp:Ljava/util/Map;

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/zzabc$zza;->zzahE:Ljava/lang/String;

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/zzabc$zza;->zzbvq:I

    return-void
.end method


# virtual methods
.method public zzLX()Lcom/google/android/gms/internal/zzabc;
    .locals 5

    new-instance v0, Lcom/google/android/gms/internal/zzabc;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzabc$zza;->zzbvo:Ljava/util/List;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzabc$zza;->zzbvp:Ljava/util/Map;

    iget-object v3, p0, Lcom/google/android/gms/internal/zzabc$zza;->zzahE:Ljava/lang/String;

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/gms/internal/zzabc;-><init>(Ljava/util/List;Ljava/util/Map;Ljava/lang/String;I)V

    return-object v0
.end method

.method public zza(Lcom/google/android/gms/internal/zzabe;)Lcom/google/android/gms/internal/zzabc$zza;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzabc$zza;->zzbvo:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public zzc(Lcom/google/android/gms/internal/zzabd;)Lcom/google/android/gms/internal/zzabc$zza;
    .locals 2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzabd;->zzLY()Ljava/util/Map;

    move-result-object v0

    const-string v1, "instance_name"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzabg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzabg;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzabc$zza;->zzbvp:Ljava/util/Map;

    invoke-interface {v1, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public zzhr(Ljava/lang/String;)Lcom/google/android/gms/internal/zzabc$zza;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzabc$zza;->zzahE:Ljava/lang/String;

    return-object p0
.end method
