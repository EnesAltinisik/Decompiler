.class public Lcom/google/android/gms/b/fr;
.super Lcom/google/android/gms/b/fv;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/android/gms/b/fv",
        "<TK;TV;>;"
    }
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/gms/b/ft;Lcom/google/android/gms/b/ft;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;",
            "Lcom/google/android/gms/b/ft",
            "<TK;TV;>;",
            "Lcom/google/android/gms/b/ft",
            "<TK;TV;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/android/gms/b/fv;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/gms/b/ft;Lcom/google/android/gms/b/ft;)V

    return-void
.end method


# virtual methods
.method protected a()Lcom/google/android/gms/b/ft$a;
    .locals 1

    sget-object v0, Lcom/google/android/gms/b/ft$a;->b:Lcom/google/android/gms/b/ft$a;

    return-object v0
.end method

.method protected a(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/gms/b/ft;Lcom/google/android/gms/b/ft;)Lcom/google/android/gms/b/fv;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;",
            "Lcom/google/android/gms/b/ft",
            "<TK;TV;>;",
            "Lcom/google/android/gms/b/ft",
            "<TK;TV;>;)",
            "Lcom/google/android/gms/b/fv",
            "<TK;TV;>;"
        }
    .end annotation

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/b/fr;->d()Ljava/lang/Object;

    move-result-object p1

    :cond_0
    if-nez p2, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/b/fr;->e()Ljava/lang/Object;

    move-result-object p2

    :cond_1
    if-nez p3, :cond_2

    invoke-virtual {p0}, Lcom/google/android/gms/b/fr;->f()Lcom/google/android/gms/b/ft;

    move-result-object p3

    :cond_2
    if-nez p4, :cond_3

    invoke-virtual {p0}, Lcom/google/android/gms/b/fr;->g()Lcom/google/android/gms/b/ft;

    move-result-object p4

    :cond_3
    new-instance v0, Lcom/google/android/gms/b/fr;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/google/android/gms/b/fr;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/gms/b/ft;Lcom/google/android/gms/b/ft;)V

    return-object v0
.end method

.method public b()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
