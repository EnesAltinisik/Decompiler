.class public Lcom/google/android/gms/b/ji;
.super Lcom/google/android/gms/b/jo;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/b/jo",
        "<",
        "Lcom/google/android/gms/b/ji;",
        ">;"
    }
.end annotation


# static fields
.field static final synthetic a:Z


# instance fields
.field private final e:Ljava/lang/Double;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/google/android/gms/b/ji;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/google/android/gms/b/ji;->a:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>(Ljava/lang/Double;Lcom/google/android/gms/b/jr;)V
    .locals 0

    invoke-direct {p0, p2}, Lcom/google/android/gms/b/jo;-><init>(Lcom/google/android/gms/b/jr;)V

    iput-object p1, p0, Lcom/google/android/gms/b/ji;->e:Ljava/lang/Double;

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/b/ji;)I
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/b/ji;->e:Ljava/lang/Double;

    iget-object v1, p1, Lcom/google/android/gms/b/ji;->e:Ljava/lang/Double;

    invoke-virtual {v0, v1}, Ljava/lang/Double;->compareTo(Ljava/lang/Double;)I

    move-result v0

    return v0
.end method

.method protected bridge synthetic a(Lcom/google/android/gms/b/jo;)I
    .locals 1

    check-cast p1, Lcom/google/android/gms/b/ji;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/b/ji;->a(Lcom/google/android/gms/b/ji;)I

    move-result v0

    return v0
.end method

.method public a(Lcom/google/android/gms/b/jr;)Lcom/google/android/gms/b/ji;
    .locals 2

    sget-boolean v0, Lcom/google/android/gms/b/ji;->a:Z

    if-nez v0, :cond_0

    invoke-static {p1}, Lcom/google/android/gms/b/jv;->a(Lcom/google/android/gms/b/jr;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_0
    new-instance v0, Lcom/google/android/gms/b/ji;

    iget-object v1, p0, Lcom/google/android/gms/b/ji;->e:Ljava/lang/Double;

    invoke-direct {v0, v1, p1}, Lcom/google/android/gms/b/ji;-><init>(Ljava/lang/Double;Lcom/google/android/gms/b/jr;)V

    return-object v0
.end method

.method public a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/ji;->e:Ljava/lang/Double;

    return-object v0
.end method

.method public a(Lcom/google/android/gms/b/jr$a;)Ljava/lang/String;
    .locals 4

    invoke-virtual {p0, p1}, Lcom/google/android/gms/b/ji;->b(Lcom/google/android/gms/b/jr$a;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "number:"

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    iget-object v0, p0, Lcom/google/android/gms/b/ji;->e:Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    invoke-static {v2, v3}, Lcom/google/android/gms/b/kt;->a(D)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public synthetic b(Lcom/google/android/gms/b/jr;)Lcom/google/android/gms/b/jr;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/b/ji;->a(Lcom/google/android/gms/b/jr;)Lcom/google/android/gms/b/ji;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x0

    instance-of v1, p1, Lcom/google/android/gms/b/ji;

    if-nez v1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    check-cast p1, Lcom/google/android/gms/b/ji;

    iget-object v1, p0, Lcom/google/android/gms/b/ji;->e:Ljava/lang/Double;

    iget-object v2, p1, Lcom/google/android/gms/b/ji;->e:Ljava/lang/Double;

    invoke-virtual {v1, v2}, Ljava/lang/Double;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/b/ji;->b:Lcom/google/android/gms/b/jr;

    iget-object v2, p1, Lcom/google/android/gms/b/ji;->b:Lcom/google/android/gms/b/jr;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method protected f_()Lcom/google/android/gms/b/jo$a;
    .locals 1

    sget-object v0, Lcom/google/android/gms/b/jo$a;->c:Lcom/google/android/gms/b/jo$a;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/b/ji;->e:Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->hashCode()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/b/ji;->b:Lcom/google/android/gms/b/jr;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
