.class Lcom/google/android/gms/internal/zzafa$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzafa;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator",
        "<",
        "Lcom/google/android/gms/internal/zzahi;",
        ">;"
    }
.end annotation


# instance fields
.field a:I

.field final synthetic b:Lcom/google/android/gms/internal/zzafa;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzafa;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/internal/zzafa$1;->b:Lcom/google/android/gms/internal/zzafa;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafa$1;->b:Lcom/google/android/gms/internal/zzafa;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzafa;->zzk(Lcom/google/android/gms/internal/zzafa;)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/zzafa$1;->a:I

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/internal/zzahi;
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzafa$1;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/NoSuchElementException;

    const-string v1, "No more elements."

    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzafa$1;->b:Lcom/google/android/gms/internal/zzafa;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzafa;->zzm(Lcom/google/android/gms/internal/zzafa;)[Lcom/google/android/gms/internal/zzahi;

    move-result-object v0

    iget v1, p0, Lcom/google/android/gms/internal/zzafa$1;->a:I

    aget-object v0, v0, v1

    iget v1, p0, Lcom/google/android/gms/internal/zzafa$1;->a:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/google/android/gms/internal/zzafa$1;->a:I

    return-object v0
.end method

.method public hasNext()Z
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/zzafa$1;->a:I

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafa$1;->b:Lcom/google/android/gms/internal/zzafa;

    invoke-static {v1}, Lcom/google/android/gms/internal/zzafa;->zzl(Lcom/google/android/gms/internal/zzafa;)I

    move-result v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzafa$1;->a()Lcom/google/android/gms/internal/zzahi;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Can\'t remove component from immutable Path!"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
