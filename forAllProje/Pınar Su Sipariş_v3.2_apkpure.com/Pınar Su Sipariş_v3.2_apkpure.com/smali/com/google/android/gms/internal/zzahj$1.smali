.class final Lcom/google/android/gms/internal/zzahj$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/zzahj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator",
        "<",
        "Lcom/google/android/gms/internal/zzahi;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahi;)I
    .locals 1

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/zzahi;->zzi(Lcom/google/android/gms/internal/zzahi;)I

    move-result v0

    return v0
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/zzahi;

    check-cast p2, Lcom/google/android/gms/internal/zzahi;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/zzahj$1;->a(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzahi;)I

    move-result v0

    return v0
.end method
