.class final Lcom/google/android/gms/internal/zzahu$1;
.super Lcom/google/android/gms/internal/zzahj;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/zzahu;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzahj;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic compareTo(Ljava/lang/Object;)I
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/zzahu;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/zzahu$1;->zzg(Lcom/google/android/gms/internal/zzahu;)I

    move-result v0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p1, p0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public isEmpty()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "<Max Node>"

    return-object v0
.end method

.method public zzTp()Lcom/google/android/gms/internal/zzahu;
    .locals 0

    return-object p0
.end method

.method public zzg(Lcom/google/android/gms/internal/zzahu;)I
    .locals 1

    if-ne p1, p0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public zzk(Lcom/google/android/gms/internal/zzahi;)Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public zzm(Lcom/google/android/gms/internal/zzahi;)Lcom/google/android/gms/internal/zzahu;
    .locals 1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/zzahi;->zzTl()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzahu$1;->zzTp()Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/zzahn;->zzTA()Lcom/google/android/gms/internal/zzahn;

    move-result-object v0

    goto :goto_0
.end method
