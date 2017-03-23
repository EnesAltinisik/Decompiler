.class public Lcom/google/android/gms/internal/zzadu;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Iterable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/zzadu$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Iterable",
        "<TT;>;"
    }
.end annotation


# instance fields
.field private final zzbIn:Lcom/google/android/gms/internal/zzads;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/zzads",
            "<TT;",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/zzads;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zzads",
            "<TT;",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzadu;->zzbIn:Lcom/google/android/gms/internal/zzads;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ljava/util/Comparator;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<TT;>;",
            "Ljava/util/Comparator",
            "<TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/zzads$zza;->zzPy()Lcom/google/android/gms/internal/zzads$zza$zza;

    move-result-object v1

    invoke-static {p1, v0, v1, p2}, Lcom/google/android/gms/internal/zzads$zza;->zzb(Ljava/util/List;Ljava/util/Map;Lcom/google/android/gms/internal/zzads$zza$zza;Ljava/util/Comparator;)Lcom/google/android/gms/internal/zzads;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzadu;->zzbIn:Lcom/google/android/gms/internal/zzads;

    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator",
            "<TT;>;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/zzadu$a;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzadu;->zzbIn:Lcom/google/android/gms/internal/zzads;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzads;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/zzadu$a;-><init>(Ljava/util/Iterator;)V

    return-object v0
.end method

.method public zzPA()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzadu;->zzbIn:Lcom/google/android/gms/internal/zzads;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzads;->zzPv()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public zzPw()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator",
            "<TT;>;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/zzadu$a;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzadu;->zzbIn:Lcom/google/android/gms/internal/zzads;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/zzads;->zzPw()Ljava/util/Iterator;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/zzadu$a;-><init>(Ljava/util/Iterator;)V

    return-object v0
.end method

.method public zzPz()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzadu;->zzbIn:Lcom/google/android/gms/internal/zzads;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzads;->zzPu()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public zzai(Ljava/lang/Object;)Lcom/google/android/gms/internal/zzadu;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lcom/google/android/gms/internal/zzadu",
            "<TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzadu;->zzbIn:Lcom/google/android/gms/internal/zzads;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzads;->zzad(Ljava/lang/Object;)Lcom/google/android/gms/internal/zzads;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzadu;->zzbIn:Lcom/google/android/gms/internal/zzads;

    if-ne v0, v1, :cond_0

    :goto_0
    return-object p0

    :cond_0
    new-instance p0, Lcom/google/android/gms/internal/zzadu;

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/zzadu;-><init>(Lcom/google/android/gms/internal/zzads;)V

    goto :goto_0
.end method

.method public zzaj(Ljava/lang/Object;)Lcom/google/android/gms/internal/zzadu;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lcom/google/android/gms/internal/zzadu",
            "<TT;>;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/zzadu;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzadu;->zzbIn:Lcom/google/android/gms/internal/zzads;

    const/4 v2, 0x0

    invoke-virtual {v1, p1, v2}, Lcom/google/android/gms/internal/zzads;->zzj(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/zzads;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/zzadu;-><init>(Lcom/google/android/gms/internal/zzads;)V

    return-object v0
.end method

.method public zzak(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzadu;->zzbIn:Lcom/google/android/gms/internal/zzads;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzads;->zzae(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
