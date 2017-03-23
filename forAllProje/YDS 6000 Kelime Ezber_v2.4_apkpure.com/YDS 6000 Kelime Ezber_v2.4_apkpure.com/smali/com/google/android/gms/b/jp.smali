.class public Lcom/google/android/gms/b/jp;
.super Lcom/google/android/gms/b/jo;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/b/jo",
        "<",
        "Lcom/google/android/gms/b/jp;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:J


# direct methods
.method public constructor <init>(Ljava/lang/Long;Lcom/google/android/gms/b/jr;)V
    .locals 2

    invoke-direct {p0, p2}, Lcom/google/android/gms/b/jo;-><init>(Lcom/google/android/gms/b/jr;)V

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/b/jp;->a:J

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Lcom/google/android/gms/b/jo;)I
    .locals 1

    check-cast p1, Lcom/google/android/gms/b/jp;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/b/jp;->a(Lcom/google/android/gms/b/jp;)I

    move-result v0

    return v0
.end method

.method protected a(Lcom/google/android/gms/b/jp;)I
    .locals 4

    iget-wide v0, p0, Lcom/google/android/gms/b/jp;->a:J

    iget-wide v2, p1, Lcom/google/android/gms/b/jp;->a:J

    invoke-static {v0, v1, v2, v3}, Lcom/google/android/gms/b/kt;->a(JJ)I

    move-result v0

    return v0
.end method

.method public a(Lcom/google/android/gms/b/jr;)Lcom/google/android/gms/b/jp;
    .locals 4

    new-instance v0, Lcom/google/android/gms/b/jp;

    iget-wide v2, p0, Lcom/google/android/gms/b/jp;->a:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lcom/google/android/gms/b/jp;-><init>(Ljava/lang/Long;Lcom/google/android/gms/b/jr;)V

    return-object v0
.end method

.method public a()Ljava/lang/Object;
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/b/jp;->a:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/b/jr$a;)Ljava/lang/String;
    .locals 4

    invoke-virtual {p0, p1}, Lcom/google/android/gms/b/jp;->b(Lcom/google/android/gms/b/jr$a;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "number:"

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    iget-wide v2, p0, Lcom/google/android/gms/b/jp;->a:J

    long-to-double v2, v2

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

    invoke-virtual {p0, p1}, Lcom/google/android/gms/b/jp;->a(Lcom/google/android/gms/b/jr;)Lcom/google/android/gms/b/jp;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x0

    instance-of v1, p1, Lcom/google/android/gms/b/jp;

    if-nez v1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    check-cast p1, Lcom/google/android/gms/b/jp;

    iget-wide v2, p0, Lcom/google/android/gms/b/jp;->a:J

    iget-wide v4, p1, Lcom/google/android/gms/b/jp;->a:J

    cmp-long v1, v2, v4

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/b/jp;->b:Lcom/google/android/gms/b/jr;

    iget-object v2, p1, Lcom/google/android/gms/b/jp;->b:Lcom/google/android/gms/b/jr;

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
    .locals 5

    iget-wide v0, p0, Lcom/google/android/gms/b/jp;->a:J

    iget-wide v2, p0, Lcom/google/android/gms/b/jp;->a:J

    const/16 v4, 0x20

    ushr-long/2addr v2, v4

    xor-long/2addr v0, v2

    long-to-int v0, v0

    iget-object v1, p0, Lcom/google/android/gms/b/jp;->b:Lcom/google/android/gms/b/jr;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
