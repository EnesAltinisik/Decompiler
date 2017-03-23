.class public Lcom/google/android/gms/b/fs;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/b/ft;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/b/ft",
        "<TK;TV;>;"
    }
.end annotation


# static fields
.field private static final a:Lcom/google/android/gms/b/fs;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/b/fs;

    invoke-direct {v0}, Lcom/google/android/gms/b/fs;-><init>()V

    sput-object v0, Lcom/google/android/gms/b/fs;->a:Lcom/google/android/gms/b/fs;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lcom/google/android/gms/b/fs;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">()",
            "Lcom/google/android/gms/b/fs",
            "<TK;TV;>;"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/b/fs;->a:Lcom/google/android/gms/b/fs;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/gms/b/ft$a;Lcom/google/android/gms/b/ft;Lcom/google/android/gms/b/ft;)Lcom/google/android/gms/b/ft;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;",
            "Lcom/google/android/gms/b/ft$a;",
            "Lcom/google/android/gms/b/ft",
            "<TK;TV;>;",
            "Lcom/google/android/gms/b/ft",
            "<TK;TV;>;)",
            "Lcom/google/android/gms/b/ft",
            "<TK;TV;>;"
        }
    .end annotation

    return-object p0
.end method

.method public a(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lcom/google/android/gms/b/ft;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;",
            "Ljava/util/Comparator",
            "<TK;>;)",
            "Lcom/google/android/gms/b/ft",
            "<TK;TV;>;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/b/fu;

    invoke-direct {v0, p1, p2}, Lcom/google/android/gms/b/fu;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public a(Ljava/lang/Object;Ljava/util/Comparator;)Lcom/google/android/gms/b/ft;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "Ljava/util/Comparator",
            "<TK;>;)",
            "Lcom/google/android/gms/b/ft",
            "<TK;TV;>;"
        }
    .end annotation

    return-object p0
.end method

.method public a(Lcom/google/android/gms/b/ft$b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/ft$b",
            "<TK;TV;>;)V"
        }
    .end annotation

    return-void
.end method

.method public b()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public c()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public d()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TK;"
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public e()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public f()Lcom/google/android/gms/b/ft;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/b/ft",
            "<TK;TV;>;"
        }
    .end annotation

    return-object p0
.end method

.method public g()Lcom/google/android/gms/b/ft;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/b/ft",
            "<TK;TV;>;"
        }
    .end annotation

    return-object p0
.end method

.method public h()Lcom/google/android/gms/b/ft;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/b/ft",
            "<TK;TV;>;"
        }
    .end annotation

    return-object p0
.end method

.method public i()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
