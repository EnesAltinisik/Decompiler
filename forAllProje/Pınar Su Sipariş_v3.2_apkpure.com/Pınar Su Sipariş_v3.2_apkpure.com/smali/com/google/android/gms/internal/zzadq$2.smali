.class Lcom/google/android/gms/internal/zzadq$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/zzagi$zza;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzadq;->zza(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzagi;Lcom/google/android/gms/internal/zzagi;Lcom/google/android/gms/internal/zzagf;Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/zzagi$zza",
        "<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/zzagi;

.field final synthetic b:Ljava/util/List;

.field final synthetic c:Lcom/google/android/gms/internal/zzafa;

.field final synthetic d:Lcom/google/android/gms/internal/zzahu;

.field final synthetic e:Lcom/google/android/gms/internal/zzadq;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzadq;Lcom/google/android/gms/internal/zzagi;Ljava/util/List;Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzadq$2;->e:Lcom/google/android/gms/internal/zzadq;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzadq$2;->a:Lcom/google/android/gms/internal/zzagi;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzadq$2;->b:Ljava/util/List;

    iput-object p4, p0, Lcom/google/android/gms/internal/zzadq$2;->c:Lcom/google/android/gms/internal/zzafa;

    iput-object p5, p0, Lcom/google/android/gms/internal/zzadq$2;->d:Lcom/google/android/gms/internal/zzahu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/zzafa;Ljava/lang/Void;Ljava/lang/Void;)Ljava/lang/Void;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzadq$2;->a:Lcom/google/android/gms/internal/zzagi;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzagi;->zzK(Lcom/google/android/gms/internal/zzafa;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzadq$2;->b:Ljava/util/List;

    new-instance v1, Lcom/google/android/gms/internal/zzais;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzadq$2;->c:Lcom/google/android/gms/internal/zzafa;

    invoke-virtual {v2, p1}, Lcom/google/android/gms/internal/zzafa;->zzh(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzafa;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/zzadq$2;->d:Lcom/google/android/gms/internal/zzahu;

    invoke-interface {v3, p1}, Lcom/google/android/gms/internal/zzahu;->zzO(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/google/android/gms/internal/zzais;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public synthetic zza(Lcom/google/android/gms/internal/zzafa;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p2, Ljava/lang/Void;

    check-cast p3, Ljava/lang/Void;

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/gms/internal/zzadq$2;->a(Lcom/google/android/gms/internal/zzafa;Ljava/lang/Void;Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
