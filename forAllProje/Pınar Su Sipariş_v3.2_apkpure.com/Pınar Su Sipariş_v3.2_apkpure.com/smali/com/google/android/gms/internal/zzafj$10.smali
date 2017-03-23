.class Lcom/google/android/gms/internal/zzafj$10;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/zzagi$zza;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzafj;->zza(Lcom/google/android/gms/internal/zzagu;Lcom/google/android/gms/internal/zzagv;)V
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
        "Lcom/google/android/gms/internal/zzafi;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/zzafj;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzafj;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzafj$10;->a:Lcom/google/android/gms/internal/zzafj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzafi;Ljava/lang/Void;)Ljava/lang/Void;
    .locals 5

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzafa;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzafi;->zzRI()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzafi;->zzRJ()Lcom/google/android/gms/internal/zzagv;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagv;->zzSS()Lcom/google/android/gms/internal/zzagu;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafj$10;->a:Lcom/google/android/gms/internal/zzafj;

    invoke-static {v1}, Lcom/google/android/gms/internal/zzafj;->zzh(Lcom/google/android/gms/internal/zzafj;)Lcom/google/android/gms/internal/zzafj$zzd;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/zzafj$10;->a:Lcom/google/android/gms/internal/zzafj;

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/zzafj;->zzb(Lcom/google/android/gms/internal/zzafj;Lcom/google/android/gms/internal/zzagu;)Lcom/google/android/gms/internal/zzagu;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/zzafj$10;->a:Lcom/google/android/gms/internal/zzafj;

    invoke-static {v3, v0}, Lcom/google/android/gms/internal/zzafj;->zza(Lcom/google/android/gms/internal/zzafj;Lcom/google/android/gms/internal/zzagu;)Lcom/google/android/gms/internal/zzafk;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Lcom/google/android/gms/internal/zzafj$zzd;->zza(Lcom/google/android/gms/internal/zzagu;Lcom/google/android/gms/internal/zzafk;)V

    :cond_0
    const/4 v0, 0x0

    return-object v0

    :cond_1
    invoke-virtual {p2}, Lcom/google/android/gms/internal/zzafi;->zzRH()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzagv;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagv;->zzSS()Lcom/google/android/gms/internal/zzagu;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/internal/zzafj$10;->a:Lcom/google/android/gms/internal/zzafj;

    invoke-static {v2}, Lcom/google/android/gms/internal/zzafj;->zzh(Lcom/google/android/gms/internal/zzafj;)Lcom/google/android/gms/internal/zzafj$zzd;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/zzafj$10;->a:Lcom/google/android/gms/internal/zzafj;

    invoke-static {v3, v0}, Lcom/google/android/gms/internal/zzafj;->zzb(Lcom/google/android/gms/internal/zzafj;Lcom/google/android/gms/internal/zzagu;)Lcom/google/android/gms/internal/zzagu;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/gms/internal/zzafj$10;->a:Lcom/google/android/gms/internal/zzafj;

    invoke-static {v4, v0}, Lcom/google/android/gms/internal/zzafj;->zza(Lcom/google/android/gms/internal/zzafj;Lcom/google/android/gms/internal/zzagu;)Lcom/google/android/gms/internal/zzafk;

    move-result-object v0

    invoke-interface {v2, v3, v0}, Lcom/google/android/gms/internal/zzafj$zzd;->zza(Lcom/google/android/gms/internal/zzagu;Lcom/google/android/gms/internal/zzafk;)V

    goto :goto_0
.end method

.method public synthetic zza(Lcom/google/android/gms/internal/zzafa;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p2, Lcom/google/android/gms/internal/zzafi;

    check-cast p3, Ljava/lang/Void;

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/gms/internal/zzafj$10;->a(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzafi;Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
