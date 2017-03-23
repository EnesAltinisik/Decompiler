.class public Lcom/google/android/gms/internal/zzabf$zza;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/zzabf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "zza"
.end annotation


# instance fields
.field private zzahE:Ljava/lang/String;

.field private zzbvx:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/zzvg;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzabf$zza;->zzbvx:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public zzMg()Lcom/google/android/gms/internal/zzabf;
    .locals 4

    new-instance v0, Lcom/google/android/gms/internal/zzabf;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzabf$zza;->zzahE:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzabf$zza;->zzbvx:Ljava/util/List;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/internal/zzabf;-><init>(Ljava/lang/String;Ljava/util/List;Lcom/google/android/gms/internal/zzabf$1;)V

    return-object v0
.end method

.method public zza(Lcom/google/android/gms/internal/zzvg;)Lcom/google/android/gms/internal/zzabf$zza;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzabf$zza;->zzbvx:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public zzhs(Ljava/lang/String;)Lcom/google/android/gms/internal/zzabf$zza;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzabf$zza;->zzahE:Ljava/lang/String;

    return-object p0
.end method
