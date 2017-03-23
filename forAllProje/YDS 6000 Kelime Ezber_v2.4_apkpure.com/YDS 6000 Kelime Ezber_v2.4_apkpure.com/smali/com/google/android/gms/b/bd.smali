.class public abstract Lcom/google/android/gms/b/bd;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/b/bd$d;,
        Lcom/google/android/gms/b/bd$c;,
        Lcom/google/android/gms/b/bd$b;,
        Lcom/google/android/gms/b/bd$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final a:I

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(ILjava/lang/String;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "TT;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/b/bd;->a:I

    iput-object p2, p0, Lcom/google/android/gms/b/bd;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/b/bd;->c:Ljava/lang/Object;

    invoke-static {}, Lcom/google/android/gms/b/bh;->a()Lcom/google/android/gms/b/be;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/b/be;->a(Lcom/google/android/gms/b/bd;)V

    return-void
.end method

.method synthetic constructor <init>(ILjava/lang/String;Ljava/lang/Object;Lcom/google/android/gms/b/bd$1;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/b/bd;-><init>(ILjava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public static a(ILjava/lang/String;Ljava/lang/Boolean;)Lcom/google/android/gms/b/bd$a;
    .locals 1

    new-instance v0, Lcom/google/android/gms/b/bd$a;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/b/bd$a;-><init>(ILjava/lang/String;Ljava/lang/Boolean;)V

    return-object v0
.end method

.method public static a(ILjava/lang/String;I)Lcom/google/android/gms/b/bd$b;
    .locals 2

    new-instance v0, Lcom/google/android/gms/b/bd$b;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, p0, p1, v1}, Lcom/google/android/gms/b/bd$b;-><init>(ILjava/lang/String;Ljava/lang/Integer;)V

    return-object v0
.end method

.method public static a(ILjava/lang/String;J)Lcom/google/android/gms/b/bd$c;
    .locals 2

    new-instance v0, Lcom/google/android/gms/b/bd$c;

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-direct {v0, p0, p1, v1}, Lcom/google/android/gms/b/bd$c;-><init>(ILjava/lang/String;Ljava/lang/Long;)V

    return-object v0
.end method

.method public static a(ILjava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/b/bd$d;
    .locals 1

    new-instance v0, Lcom/google/android/gms/b/bd$d;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/b/bd$d;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method protected abstract a(Lcom/google/android/gms/b/bg;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/bg;",
            ")TT;"
        }
    .end annotation
.end method

.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/bd;->b:Ljava/lang/String;

    return-object v0
.end method

.method public b()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/b/bd;->c:Ljava/lang/Object;

    return-object v0
.end method

.method public c()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    invoke-static {}, Lcom/google/android/gms/b/bh;->b()Lcom/google/android/gms/b/bf;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/b/bf;->a(Lcom/google/android/gms/b/bd;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/b/bd;->a:I

    return v0
.end method
