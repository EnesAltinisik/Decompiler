.class public abstract Lcom/google/android/gms/b/jf$a;
.super Lcom/google/android/gms/b/ft$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/b/jf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/b/ft$b",
        "<",
        "Lcom/google/android/gms/b/je;",
        "Lcom/google/android/gms/b/jr;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/b/ft$b;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a(Lcom/google/android/gms/b/je;Lcom/google/android/gms/b/jr;)V
.end method

.method public synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/b/je;

    check-cast p2, Lcom/google/android/gms/b/jr;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/b/jf$a;->b(Lcom/google/android/gms/b/je;Lcom/google/android/gms/b/jr;)V

    return-void
.end method

.method public b(Lcom/google/android/gms/b/je;Lcom/google/android/gms/b/jr;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/b/jf$a;->a(Lcom/google/android/gms/b/je;Lcom/google/android/gms/b/jr;)V

    return-void
.end method
