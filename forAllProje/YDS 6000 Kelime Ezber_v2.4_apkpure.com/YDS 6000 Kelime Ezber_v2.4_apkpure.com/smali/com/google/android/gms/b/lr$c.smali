.class public final Lcom/google/android/gms/b/lr$c;
.super Lcom/google/android/gms/b/lh;

# interfaces
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/b/lr;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/b/lh",
        "<",
        "Lcom/google/android/gms/b/lr$c;",
        ">;",
        "Ljava/lang/Cloneable;"
    }
.end annotation


# instance fields
.field public a:J

.field public b:J

.field public c:J

.field public d:Ljava/lang/String;

.field public e:I

.field public f:I

.field public g:Z

.field public h:[Lcom/google/android/gms/b/lr$d;

.field public i:[B

.field public j:Lcom/google/android/gms/b/lr$a;

.field public k:[B

.field public l:Ljava/lang/String;

.field public m:Ljava/lang/String;

.field public n:Ljava/lang/String;

.field public o:J

.field public p:Lcom/google/android/gms/b/lr$b;

.field public q:[B

.field public r:Ljava/lang/String;

.field public s:I

.field public t:[I

.field public u:J

.field public v:Lcom/google/android/gms/b/lr$e;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/b/lh;-><init>()V

    invoke-virtual {p0}, Lcom/google/android/gms/b/lr$c;->a()Lcom/google/android/gms/b/lr$c;

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/b/lr$c;
    .locals 6

    const-wide/16 v4, 0x0

    const/4 v3, 0x0

    const/4 v2, 0x0

    iput-wide v4, p0, Lcom/google/android/gms/b/lr$c;->a:J

    iput-wide v4, p0, Lcom/google/android/gms/b/lr$c;->b:J

    iput-wide v4, p0, Lcom/google/android/gms/b/lr$c;->c:J

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/b/lr$c;->d:Ljava/lang/String;

    iput v2, p0, Lcom/google/android/gms/b/lr$c;->e:I

    iput v2, p0, Lcom/google/android/gms/b/lr$c;->f:I

    iput-boolean v2, p0, Lcom/google/android/gms/b/lr$c;->g:Z

    invoke-static {}, Lcom/google/android/gms/b/lr$d;->a()[Lcom/google/android/gms/b/lr$d;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/lr$c;->h:[Lcom/google/android/gms/b/lr$d;

    sget-object v0, Lcom/google/android/gms/b/lq;->h:[B

    iput-object v0, p0, Lcom/google/android/gms/b/lr$c;->i:[B

    iput-object v3, p0, Lcom/google/android/gms/b/lr$c;->j:Lcom/google/android/gms/b/lr$a;

    sget-object v0, Lcom/google/android/gms/b/lq;->h:[B

    iput-object v0, p0, Lcom/google/android/gms/b/lr$c;->k:[B

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/b/lr$c;->l:Ljava/lang/String;

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/b/lr$c;->m:Ljava/lang/String;

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/b/lr$c;->n:Ljava/lang/String;

    const-wide/32 v0, 0x2bf20

    iput-wide v0, p0, Lcom/google/android/gms/b/lr$c;->o:J

    iput-object v3, p0, Lcom/google/android/gms/b/lr$c;->p:Lcom/google/android/gms/b/lr$b;

    sget-object v0, Lcom/google/android/gms/b/lq;->h:[B

    iput-object v0, p0, Lcom/google/android/gms/b/lr$c;->q:[B

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/b/lr$c;->r:Ljava/lang/String;

    iput v2, p0, Lcom/google/android/gms/b/lr$c;->s:I

    sget-object v0, Lcom/google/android/gms/b/lq;->a:[I

    iput-object v0, p0, Lcom/google/android/gms/b/lr$c;->t:[I

    iput-wide v4, p0, Lcom/google/android/gms/b/lr$c;->u:J

    iput-object v3, p0, Lcom/google/android/gms/b/lr$c;->v:Lcom/google/android/gms/b/lr$e;

    iput-object v3, p0, Lcom/google/android/gms/b/lr$c;->ag:Lcom/google/android/gms/b/lj;

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/b/lr$c;->ah:I

    return-object p0
.end method

.method public a(Lcom/google/android/gms/b/lf;)Lcom/google/android/gms/b/lr$c;
    .locals 5

    const/4 v1, 0x0

    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/google/android/gms/b/lf;->a()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    invoke-super {p0, p1, v0}, Lcom/google/android/gms/b/lh;->a(Lcom/google/android/gms/b/lf;I)Z

    move-result v0

    if-nez v0, :cond_0

    :sswitch_0
    return-object p0

    :sswitch_1
    invoke-virtual {p1}, Lcom/google/android/gms/b/lf;->f()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/google/android/gms/b/lr$c;->a:J

    goto :goto_0

    :sswitch_2
    invoke-virtual {p1}, Lcom/google/android/gms/b/lf;->i()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/lr$c;->d:Ljava/lang/String;

    goto :goto_0

    :sswitch_3
    const/16 v0, 0x1a

    invoke-static {p1, v0}, Lcom/google/android/gms/b/lq;->b(Lcom/google/android/gms/b/lf;I)I

    move-result v2

    iget-object v0, p0, Lcom/google/android/gms/b/lr$c;->h:[Lcom/google/android/gms/b/lr$d;

    if-nez v0, :cond_2

    move v0, v1

    :goto_1
    add-int/2addr v2, v0

    new-array v2, v2, [Lcom/google/android/gms/b/lr$d;

    if-eqz v0, :cond_1

    iget-object v3, p0, Lcom/google/android/gms/b/lr$c;->h:[Lcom/google/android/gms/b/lr$d;

    invoke-static {v3, v1, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_1
    :goto_2
    array-length v3, v2

    add-int/lit8 v3, v3, -0x1

    if-ge v0, v3, :cond_3

    new-instance v3, Lcom/google/android/gms/b/lr$d;

    invoke-direct {v3}, Lcom/google/android/gms/b/lr$d;-><init>()V

    aput-object v3, v2, v0

    aget-object v3, v2, v0

    invoke-virtual {p1, v3}, Lcom/google/android/gms/b/lf;->a(Lcom/google/android/gms/b/ln;)V

    invoke-virtual {p1}, Lcom/google/android/gms/b/lf;->a()I

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/b/lr$c;->h:[Lcom/google/android/gms/b/lr$d;

    array-length v0, v0

    goto :goto_1

    :cond_3
    new-instance v3, Lcom/google/android/gms/b/lr$d;

    invoke-direct {v3}, Lcom/google/android/gms/b/lr$d;-><init>()V

    aput-object v3, v2, v0

    aget-object v0, v2, v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/b/lf;->a(Lcom/google/android/gms/b/ln;)V

    iput-object v2, p0, Lcom/google/android/gms/b/lr$c;->h:[Lcom/google/android/gms/b/lr$d;

    goto :goto_0

    :sswitch_4
    invoke-virtual {p1}, Lcom/google/android/gms/b/lf;->j()[B

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/lr$c;->i:[B

    goto :goto_0

    :sswitch_5
    invoke-virtual {p1}, Lcom/google/android/gms/b/lf;->j()[B

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/lr$c;->k:[B

    goto :goto_0

    :sswitch_6
    invoke-virtual {p1}, Lcom/google/android/gms/b/lf;->i()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/lr$c;->l:Ljava/lang/String;

    goto :goto_0

    :sswitch_7
    iget-object v0, p0, Lcom/google/android/gms/b/lr$c;->j:Lcom/google/android/gms/b/lr$a;

    if-nez v0, :cond_4

    new-instance v0, Lcom/google/android/gms/b/lr$a;

    invoke-direct {v0}, Lcom/google/android/gms/b/lr$a;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/b/lr$c;->j:Lcom/google/android/gms/b/lr$a;

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/b/lr$c;->j:Lcom/google/android/gms/b/lr$a;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/b/lf;->a(Lcom/google/android/gms/b/ln;)V

    goto :goto_0

    :sswitch_8
    invoke-virtual {p1}, Lcom/google/android/gms/b/lf;->h()Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/b/lr$c;->g:Z

    goto/16 :goto_0

    :sswitch_9
    invoke-virtual {p1}, Lcom/google/android/gms/b/lf;->g()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/b/lr$c;->e:I

    goto/16 :goto_0

    :sswitch_a
    invoke-virtual {p1}, Lcom/google/android/gms/b/lf;->g()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/b/lr$c;->f:I

    goto/16 :goto_0

    :sswitch_b
    invoke-virtual {p1}, Lcom/google/android/gms/b/lf;->i()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/lr$c;->m:Ljava/lang/String;

    goto/16 :goto_0

    :sswitch_c
    invoke-virtual {p1}, Lcom/google/android/gms/b/lf;->i()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/lr$c;->n:Ljava/lang/String;

    goto/16 :goto_0

    :sswitch_d
    invoke-virtual {p1}, Lcom/google/android/gms/b/lf;->k()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/google/android/gms/b/lr$c;->o:J

    goto/16 :goto_0

    :sswitch_e
    iget-object v0, p0, Lcom/google/android/gms/b/lr$c;->p:Lcom/google/android/gms/b/lr$b;

    if-nez v0, :cond_5

    new-instance v0, Lcom/google/android/gms/b/lr$b;

    invoke-direct {v0}, Lcom/google/android/gms/b/lr$b;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/b/lr$c;->p:Lcom/google/android/gms/b/lr$b;

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/b/lr$c;->p:Lcom/google/android/gms/b/lr$b;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/b/lf;->a(Lcom/google/android/gms/b/ln;)V

    goto/16 :goto_0

    :sswitch_f
    invoke-virtual {p1}, Lcom/google/android/gms/b/lf;->f()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/google/android/gms/b/lr$c;->b:J

    goto/16 :goto_0

    :sswitch_10
    invoke-virtual {p1}, Lcom/google/android/gms/b/lf;->j()[B

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/lr$c;->q:[B

    goto/16 :goto_0

    :sswitch_11
    invoke-virtual {p1}, Lcom/google/android/gms/b/lf;->g()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    :pswitch_0
    iput v0, p0, Lcom/google/android/gms/b/lr$c;->s:I

    goto/16 :goto_0

    :sswitch_12
    const/16 v0, 0xa0

    invoke-static {p1, v0}, Lcom/google/android/gms/b/lq;->b(Lcom/google/android/gms/b/lf;I)I

    move-result v2

    iget-object v0, p0, Lcom/google/android/gms/b/lr$c;->t:[I

    if-nez v0, :cond_7

    move v0, v1

    :goto_3
    add-int/2addr v2, v0

    new-array v2, v2, [I

    if-eqz v0, :cond_6

    iget-object v3, p0, Lcom/google/android/gms/b/lr$c;->t:[I

    invoke-static {v3, v1, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_6
    :goto_4
    array-length v3, v2

    add-int/lit8 v3, v3, -0x1

    if-ge v0, v3, :cond_8

    invoke-virtual {p1}, Lcom/google/android/gms/b/lf;->g()I

    move-result v3

    aput v3, v2, v0

    invoke-virtual {p1}, Lcom/google/android/gms/b/lf;->a()I

    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/b/lr$c;->t:[I

    array-length v0, v0

    goto :goto_3

    :cond_8
    invoke-virtual {p1}, Lcom/google/android/gms/b/lf;->g()I

    move-result v3

    aput v3, v2, v0

    iput-object v2, p0, Lcom/google/android/gms/b/lr$c;->t:[I

    goto/16 :goto_0

    :sswitch_13
    invoke-virtual {p1}, Lcom/google/android/gms/b/lf;->l()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/b/lf;->c(I)I

    move-result v3

    invoke-virtual {p1}, Lcom/google/android/gms/b/lf;->r()I

    move-result v2

    move v0, v1

    :goto_5
    invoke-virtual {p1}, Lcom/google/android/gms/b/lf;->p()I

    move-result v4

    if-lez v4, :cond_9

    invoke-virtual {p1}, Lcom/google/android/gms/b/lf;->g()I

    add-int/lit8 v0, v0, 0x1

    goto :goto_5

    :cond_9
    invoke-virtual {p1, v2}, Lcom/google/android/gms/b/lf;->e(I)V

    iget-object v2, p0, Lcom/google/android/gms/b/lr$c;->t:[I

    if-nez v2, :cond_b

    move v2, v1

    :goto_6
    add-int/2addr v0, v2

    new-array v0, v0, [I

    if-eqz v2, :cond_a

    iget-object v4, p0, Lcom/google/android/gms/b/lr$c;->t:[I

    invoke-static {v4, v1, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_a
    :goto_7
    array-length v4, v0

    if-ge v2, v4, :cond_c

    invoke-virtual {p1}, Lcom/google/android/gms/b/lf;->g()I

    move-result v4

    aput v4, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_7

    :cond_b
    iget-object v2, p0, Lcom/google/android/gms/b/lr$c;->t:[I

    array-length v2, v2

    goto :goto_6

    :cond_c
    iput-object v0, p0, Lcom/google/android/gms/b/lr$c;->t:[I

    invoke-virtual {p1, v3}, Lcom/google/android/gms/b/lf;->d(I)V

    goto/16 :goto_0

    :sswitch_14
    invoke-virtual {p1}, Lcom/google/android/gms/b/lf;->f()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/google/android/gms/b/lr$c;->c:J

    goto/16 :goto_0

    :sswitch_15
    invoke-virtual {p1}, Lcom/google/android/gms/b/lf;->f()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/google/android/gms/b/lr$c;->u:J

    goto/16 :goto_0

    :sswitch_16
    iget-object v0, p0, Lcom/google/android/gms/b/lr$c;->v:Lcom/google/android/gms/b/lr$e;

    if-nez v0, :cond_d

    new-instance v0, Lcom/google/android/gms/b/lr$e;

    invoke-direct {v0}, Lcom/google/android/gms/b/lr$e;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/b/lr$c;->v:Lcom/google/android/gms/b/lr$e;

    :cond_d
    iget-object v0, p0, Lcom/google/android/gms/b/lr$c;->v:Lcom/google/android/gms/b/lr$e;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/b/lf;->a(Lcom/google/android/gms/b/ln;)V

    goto/16 :goto_0

    :sswitch_17
    invoke-virtual {p1}, Lcom/google/android/gms/b/lf;->i()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/lr$c;->r:Ljava/lang/String;

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_1
        0x12 -> :sswitch_2
        0x1a -> :sswitch_3
        0x22 -> :sswitch_4
        0x32 -> :sswitch_5
        0x42 -> :sswitch_6
        0x4a -> :sswitch_7
        0x50 -> :sswitch_8
        0x58 -> :sswitch_9
        0x60 -> :sswitch_a
        0x6a -> :sswitch_b
        0x72 -> :sswitch_c
        0x78 -> :sswitch_d
        0x82 -> :sswitch_e
        0x88 -> :sswitch_f
        0x92 -> :sswitch_10
        0x98 -> :sswitch_11
        0xa0 -> :sswitch_12
        0xa2 -> :sswitch_13
        0xa8 -> :sswitch_14
        0xb0 -> :sswitch_15
        0xba -> :sswitch_16
        0xc2 -> :sswitch_17
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public a(Lcom/google/android/gms/b/lg;)V
    .locals 8

    const/4 v1, 0x0

    const-wide/16 v6, 0x0

    iget-wide v2, p0, Lcom/google/android/gms/b/lr$c;->a:J

    cmp-long v0, v2, v6

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    iget-wide v2, p0, Lcom/google/android/gms/b/lr$c;->a:J

    invoke-virtual {p1, v0, v2, v3}, Lcom/google/android/gms/b/lg;->b(IJ)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/b/lr$c;->d:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/b/lr$c;->d:Ljava/lang/String;

    const-string v2, ""

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x2

    iget-object v2, p0, Lcom/google/android/gms/b/lr$c;->d:Ljava/lang/String;

    invoke-virtual {p1, v0, v2}, Lcom/google/android/gms/b/lg;->a(ILjava/lang/String;)V

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/b/lr$c;->h:[Lcom/google/android/gms/b/lr$d;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/b/lr$c;->h:[Lcom/google/android/gms/b/lr$d;

    array-length v0, v0

    if-lez v0, :cond_3

    move v0, v1

    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/b/lr$c;->h:[Lcom/google/android/gms/b/lr$d;

    array-length v2, v2

    if-ge v0, v2, :cond_3

    iget-object v2, p0, Lcom/google/android/gms/b/lr$c;->h:[Lcom/google/android/gms/b/lr$d;

    aget-object v2, v2, v0

    if-eqz v2, :cond_2

    const/4 v3, 0x3

    invoke-virtual {p1, v3, v2}, Lcom/google/android/gms/b/lg;->a(ILcom/google/android/gms/b/ln;)V

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/b/lr$c;->i:[B

    sget-object v2, Lcom/google/android/gms/b/lq;->h:[B

    invoke-static {v0, v2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-nez v0, :cond_4

    const/4 v0, 0x4

    iget-object v2, p0, Lcom/google/android/gms/b/lr$c;->i:[B

    invoke-virtual {p1, v0, v2}, Lcom/google/android/gms/b/lg;->a(I[B)V

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/b/lr$c;->k:[B

    sget-object v2, Lcom/google/android/gms/b/lq;->h:[B

    invoke-static {v0, v2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-nez v0, :cond_5

    const/4 v0, 0x6

    iget-object v2, p0, Lcom/google/android/gms/b/lr$c;->k:[B

    invoke-virtual {p1, v0, v2}, Lcom/google/android/gms/b/lg;->a(I[B)V

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/b/lr$c;->l:Ljava/lang/String;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/b/lr$c;->l:Ljava/lang/String;

    const-string v2, ""

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    const/16 v0, 0x8

    iget-object v2, p0, Lcom/google/android/gms/b/lr$c;->l:Ljava/lang/String;

    invoke-virtual {p1, v0, v2}, Lcom/google/android/gms/b/lg;->a(ILjava/lang/String;)V

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/b/lr$c;->j:Lcom/google/android/gms/b/lr$a;

    if-eqz v0, :cond_7

    const/16 v0, 0x9

    iget-object v2, p0, Lcom/google/android/gms/b/lr$c;->j:Lcom/google/android/gms/b/lr$a;

    invoke-virtual {p1, v0, v2}, Lcom/google/android/gms/b/lg;->a(ILcom/google/android/gms/b/ln;)V

    :cond_7
    iget-boolean v0, p0, Lcom/google/android/gms/b/lr$c;->g:Z

    if-eqz v0, :cond_8

    const/16 v0, 0xa

    iget-boolean v2, p0, Lcom/google/android/gms/b/lr$c;->g:Z

    invoke-virtual {p1, v0, v2}, Lcom/google/android/gms/b/lg;->a(IZ)V

    :cond_8
    iget v0, p0, Lcom/google/android/gms/b/lr$c;->e:I

    if-eqz v0, :cond_9

    const/16 v0, 0xb

    iget v2, p0, Lcom/google/android/gms/b/lr$c;->e:I

    invoke-virtual {p1, v0, v2}, Lcom/google/android/gms/b/lg;->a(II)V

    :cond_9
    iget v0, p0, Lcom/google/android/gms/b/lr$c;->f:I

    if-eqz v0, :cond_a

    const/16 v0, 0xc

    iget v2, p0, Lcom/google/android/gms/b/lr$c;->f:I

    invoke-virtual {p1, v0, v2}, Lcom/google/android/gms/b/lg;->a(II)V

    :cond_a
    iget-object v0, p0, Lcom/google/android/gms/b/lr$c;->m:Ljava/lang/String;

    if-eqz v0, :cond_b

    iget-object v0, p0, Lcom/google/android/gms/b/lr$c;->m:Ljava/lang/String;

    const-string v2, ""

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    const/16 v0, 0xd

    iget-object v2, p0, Lcom/google/android/gms/b/lr$c;->m:Ljava/lang/String;

    invoke-virtual {p1, v0, v2}, Lcom/google/android/gms/b/lg;->a(ILjava/lang/String;)V

    :cond_b
    iget-object v0, p0, Lcom/google/android/gms/b/lr$c;->n:Ljava/lang/String;

    if-eqz v0, :cond_c

    iget-object v0, p0, Lcom/google/android/gms/b/lr$c;->n:Ljava/lang/String;

    const-string v2, ""

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    const/16 v0, 0xe

    iget-object v2, p0, Lcom/google/android/gms/b/lr$c;->n:Ljava/lang/String;

    invoke-virtual {p1, v0, v2}, Lcom/google/android/gms/b/lg;->a(ILjava/lang/String;)V

    :cond_c
    iget-wide v2, p0, Lcom/google/android/gms/b/lr$c;->o:J

    const-wide/32 v4, 0x2bf20

    cmp-long v0, v2, v4

    if-eqz v0, :cond_d

    const/16 v0, 0xf

    iget-wide v2, p0, Lcom/google/android/gms/b/lr$c;->o:J

    invoke-virtual {p1, v0, v2, v3}, Lcom/google/android/gms/b/lg;->c(IJ)V

    :cond_d
    iget-object v0, p0, Lcom/google/android/gms/b/lr$c;->p:Lcom/google/android/gms/b/lr$b;

    if-eqz v0, :cond_e

    const/16 v0, 0x10

    iget-object v2, p0, Lcom/google/android/gms/b/lr$c;->p:Lcom/google/android/gms/b/lr$b;

    invoke-virtual {p1, v0, v2}, Lcom/google/android/gms/b/lg;->a(ILcom/google/android/gms/b/ln;)V

    :cond_e
    iget-wide v2, p0, Lcom/google/android/gms/b/lr$c;->b:J

    cmp-long v0, v2, v6

    if-eqz v0, :cond_f

    const/16 v0, 0x11

    iget-wide v2, p0, Lcom/google/android/gms/b/lr$c;->b:J

    invoke-virtual {p1, v0, v2, v3}, Lcom/google/android/gms/b/lg;->b(IJ)V

    :cond_f
    iget-object v0, p0, Lcom/google/android/gms/b/lr$c;->q:[B

    sget-object v2, Lcom/google/android/gms/b/lq;->h:[B

    invoke-static {v0, v2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-nez v0, :cond_10

    const/16 v0, 0x12

    iget-object v2, p0, Lcom/google/android/gms/b/lr$c;->q:[B

    invoke-virtual {p1, v0, v2}, Lcom/google/android/gms/b/lg;->a(I[B)V

    :cond_10
    iget v0, p0, Lcom/google/android/gms/b/lr$c;->s:I

    if-eqz v0, :cond_11

    const/16 v0, 0x13

    iget v2, p0, Lcom/google/android/gms/b/lr$c;->s:I

    invoke-virtual {p1, v0, v2}, Lcom/google/android/gms/b/lg;->a(II)V

    :cond_11
    iget-object v0, p0, Lcom/google/android/gms/b/lr$c;->t:[I

    if-eqz v0, :cond_12

    iget-object v0, p0, Lcom/google/android/gms/b/lr$c;->t:[I

    array-length v0, v0

    if-lez v0, :cond_12

    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/b/lr$c;->t:[I

    array-length v0, v0

    if-ge v1, v0, :cond_12

    const/16 v0, 0x14

    iget-object v2, p0, Lcom/google/android/gms/b/lr$c;->t:[I

    aget v2, v2, v1

    invoke-virtual {p1, v0, v2}, Lcom/google/android/gms/b/lg;->a(II)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_12
    iget-wide v0, p0, Lcom/google/android/gms/b/lr$c;->c:J

    cmp-long v0, v0, v6

    if-eqz v0, :cond_13

    const/16 v0, 0x15

    iget-wide v2, p0, Lcom/google/android/gms/b/lr$c;->c:J

    invoke-virtual {p1, v0, v2, v3}, Lcom/google/android/gms/b/lg;->b(IJ)V

    :cond_13
    iget-wide v0, p0, Lcom/google/android/gms/b/lr$c;->u:J

    cmp-long v0, v0, v6

    if-eqz v0, :cond_14

    const/16 v0, 0x16

    iget-wide v2, p0, Lcom/google/android/gms/b/lr$c;->u:J

    invoke-virtual {p1, v0, v2, v3}, Lcom/google/android/gms/b/lg;->b(IJ)V

    :cond_14
    iget-object v0, p0, Lcom/google/android/gms/b/lr$c;->v:Lcom/google/android/gms/b/lr$e;

    if-eqz v0, :cond_15

    const/16 v0, 0x17

    iget-object v1, p0, Lcom/google/android/gms/b/lr$c;->v:Lcom/google/android/gms/b/lr$e;

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/b/lg;->a(ILcom/google/android/gms/b/ln;)V

    :cond_15
    iget-object v0, p0, Lcom/google/android/gms/b/lr$c;->r:Ljava/lang/String;

    if-eqz v0, :cond_16

    iget-object v0, p0, Lcom/google/android/gms/b/lr$c;->r:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_16

    const/16 v0, 0x18

    iget-object v1, p0, Lcom/google/android/gms/b/lr$c;->r:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/b/lg;->a(ILjava/lang/String;)V

    :cond_16
    invoke-super {p0, p1}, Lcom/google/android/gms/b/lh;->a(Lcom/google/android/gms/b/lg;)V

    return-void
.end method

.method protected b()I
    .locals 8

    const/4 v1, 0x0

    const-wide/16 v6, 0x0

    invoke-super {p0}, Lcom/google/android/gms/b/lh;->b()I

    move-result v0

    iget-wide v2, p0, Lcom/google/android/gms/b/lr$c;->a:J

    cmp-long v2, v2, v6

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    iget-wide v4, p0, Lcom/google/android/gms/b/lr$c;->a:J

    invoke-static {v2, v4, v5}, Lcom/google/android/gms/b/lg;->e(IJ)I

    move-result v2

    add-int/2addr v0, v2

    :cond_0
    iget-object v2, p0, Lcom/google/android/gms/b/lr$c;->d:Ljava/lang/String;

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/google/android/gms/b/lr$c;->d:Ljava/lang/String;

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/google/android/gms/b/lr$c;->d:Ljava/lang/String;

    invoke-static {v2, v3}, Lcom/google/android/gms/b/lg;->b(ILjava/lang/String;)I

    move-result v2

    add-int/2addr v0, v2

    :cond_1
    iget-object v2, p0, Lcom/google/android/gms/b/lr$c;->h:[Lcom/google/android/gms/b/lr$d;

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/google/android/gms/b/lr$c;->h:[Lcom/google/android/gms/b/lr$d;

    array-length v2, v2

    if-lez v2, :cond_4

    move v2, v0

    move v0, v1

    :goto_0
    iget-object v3, p0, Lcom/google/android/gms/b/lr$c;->h:[Lcom/google/android/gms/b/lr$d;

    array-length v3, v3

    if-ge v0, v3, :cond_3

    iget-object v3, p0, Lcom/google/android/gms/b/lr$c;->h:[Lcom/google/android/gms/b/lr$d;

    aget-object v3, v3, v0

    if-eqz v3, :cond_2

    const/4 v4, 0x3

    invoke-static {v4, v3}, Lcom/google/android/gms/b/lg;->c(ILcom/google/android/gms/b/ln;)I

    move-result v3

    add-int/2addr v2, v3

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    move v0, v2

    :cond_4
    iget-object v2, p0, Lcom/google/android/gms/b/lr$c;->i:[B

    sget-object v3, Lcom/google/android/gms/b/lq;->h:[B

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v2

    if-nez v2, :cond_5

    const/4 v2, 0x4

    iget-object v3, p0, Lcom/google/android/gms/b/lr$c;->i:[B

    invoke-static {v2, v3}, Lcom/google/android/gms/b/lg;->b(I[B)I

    move-result v2

    add-int/2addr v0, v2

    :cond_5
    iget-object v2, p0, Lcom/google/android/gms/b/lr$c;->k:[B

    sget-object v3, Lcom/google/android/gms/b/lq;->h:[B

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v2

    if-nez v2, :cond_6

    const/4 v2, 0x6

    iget-object v3, p0, Lcom/google/android/gms/b/lr$c;->k:[B

    invoke-static {v2, v3}, Lcom/google/android/gms/b/lg;->b(I[B)I

    move-result v2

    add-int/2addr v0, v2

    :cond_6
    iget-object v2, p0, Lcom/google/android/gms/b/lr$c;->l:Ljava/lang/String;

    if-eqz v2, :cond_7

    iget-object v2, p0, Lcom/google/android/gms/b/lr$c;->l:Ljava/lang/String;

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    const/16 v2, 0x8

    iget-object v3, p0, Lcom/google/android/gms/b/lr$c;->l:Ljava/lang/String;

    invoke-static {v2, v3}, Lcom/google/android/gms/b/lg;->b(ILjava/lang/String;)I

    move-result v2

    add-int/2addr v0, v2

    :cond_7
    iget-object v2, p0, Lcom/google/android/gms/b/lr$c;->j:Lcom/google/android/gms/b/lr$a;

    if-eqz v2, :cond_8

    const/16 v2, 0x9

    iget-object v3, p0, Lcom/google/android/gms/b/lr$c;->j:Lcom/google/android/gms/b/lr$a;

    invoke-static {v2, v3}, Lcom/google/android/gms/b/lg;->c(ILcom/google/android/gms/b/ln;)I

    move-result v2

    add-int/2addr v0, v2

    :cond_8
    iget-boolean v2, p0, Lcom/google/android/gms/b/lr$c;->g:Z

    if-eqz v2, :cond_9

    const/16 v2, 0xa

    iget-boolean v3, p0, Lcom/google/android/gms/b/lr$c;->g:Z

    invoke-static {v2, v3}, Lcom/google/android/gms/b/lg;->b(IZ)I

    move-result v2

    add-int/2addr v0, v2

    :cond_9
    iget v2, p0, Lcom/google/android/gms/b/lr$c;->e:I

    if-eqz v2, :cond_a

    const/16 v2, 0xb

    iget v3, p0, Lcom/google/android/gms/b/lr$c;->e:I

    invoke-static {v2, v3}, Lcom/google/android/gms/b/lg;->b(II)I

    move-result v2

    add-int/2addr v0, v2

    :cond_a
    iget v2, p0, Lcom/google/android/gms/b/lr$c;->f:I

    if-eqz v2, :cond_b

    const/16 v2, 0xc

    iget v3, p0, Lcom/google/android/gms/b/lr$c;->f:I

    invoke-static {v2, v3}, Lcom/google/android/gms/b/lg;->b(II)I

    move-result v2

    add-int/2addr v0, v2

    :cond_b
    iget-object v2, p0, Lcom/google/android/gms/b/lr$c;->m:Ljava/lang/String;

    if-eqz v2, :cond_c

    iget-object v2, p0, Lcom/google/android/gms/b/lr$c;->m:Ljava/lang/String;

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_c

    const/16 v2, 0xd

    iget-object v3, p0, Lcom/google/android/gms/b/lr$c;->m:Ljava/lang/String;

    invoke-static {v2, v3}, Lcom/google/android/gms/b/lg;->b(ILjava/lang/String;)I

    move-result v2

    add-int/2addr v0, v2

    :cond_c
    iget-object v2, p0, Lcom/google/android/gms/b/lr$c;->n:Ljava/lang/String;

    if-eqz v2, :cond_d

    iget-object v2, p0, Lcom/google/android/gms/b/lr$c;->n:Ljava/lang/String;

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_d

    const/16 v2, 0xe

    iget-object v3, p0, Lcom/google/android/gms/b/lr$c;->n:Ljava/lang/String;

    invoke-static {v2, v3}, Lcom/google/android/gms/b/lg;->b(ILjava/lang/String;)I

    move-result v2

    add-int/2addr v0, v2

    :cond_d
    iget-wide v2, p0, Lcom/google/android/gms/b/lr$c;->o:J

    const-wide/32 v4, 0x2bf20

    cmp-long v2, v2, v4

    if-eqz v2, :cond_e

    const/16 v2, 0xf

    iget-wide v4, p0, Lcom/google/android/gms/b/lr$c;->o:J

    invoke-static {v2, v4, v5}, Lcom/google/android/gms/b/lg;->f(IJ)I

    move-result v2

    add-int/2addr v0, v2

    :cond_e
    iget-object v2, p0, Lcom/google/android/gms/b/lr$c;->p:Lcom/google/android/gms/b/lr$b;

    if-eqz v2, :cond_f

    const/16 v2, 0x10

    iget-object v3, p0, Lcom/google/android/gms/b/lr$c;->p:Lcom/google/android/gms/b/lr$b;

    invoke-static {v2, v3}, Lcom/google/android/gms/b/lg;->c(ILcom/google/android/gms/b/ln;)I

    move-result v2

    add-int/2addr v0, v2

    :cond_f
    iget-wide v2, p0, Lcom/google/android/gms/b/lr$c;->b:J

    cmp-long v2, v2, v6

    if-eqz v2, :cond_10

    const/16 v2, 0x11

    iget-wide v4, p0, Lcom/google/android/gms/b/lr$c;->b:J

    invoke-static {v2, v4, v5}, Lcom/google/android/gms/b/lg;->e(IJ)I

    move-result v2

    add-int/2addr v0, v2

    :cond_10
    iget-object v2, p0, Lcom/google/android/gms/b/lr$c;->q:[B

    sget-object v3, Lcom/google/android/gms/b/lq;->h:[B

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v2

    if-nez v2, :cond_11

    const/16 v2, 0x12

    iget-object v3, p0, Lcom/google/android/gms/b/lr$c;->q:[B

    invoke-static {v2, v3}, Lcom/google/android/gms/b/lg;->b(I[B)I

    move-result v2

    add-int/2addr v0, v2

    :cond_11
    iget v2, p0, Lcom/google/android/gms/b/lr$c;->s:I

    if-eqz v2, :cond_12

    const/16 v2, 0x13

    iget v3, p0, Lcom/google/android/gms/b/lr$c;->s:I

    invoke-static {v2, v3}, Lcom/google/android/gms/b/lg;->b(II)I

    move-result v2

    add-int/2addr v0, v2

    :cond_12
    iget-object v2, p0, Lcom/google/android/gms/b/lr$c;->t:[I

    if-eqz v2, :cond_14

    iget-object v2, p0, Lcom/google/android/gms/b/lr$c;->t:[I

    array-length v2, v2

    if-lez v2, :cond_14

    move v2, v1

    :goto_1
    iget-object v3, p0, Lcom/google/android/gms/b/lr$c;->t:[I

    array-length v3, v3

    if-ge v1, v3, :cond_13

    iget-object v3, p0, Lcom/google/android/gms/b/lr$c;->t:[I

    aget v3, v3, v1

    invoke-static {v3}, Lcom/google/android/gms/b/lg;->b(I)I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_13
    add-int/2addr v0, v2

    iget-object v1, p0, Lcom/google/android/gms/b/lr$c;->t:[I

    array-length v1, v1

    mul-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    :cond_14
    iget-wide v2, p0, Lcom/google/android/gms/b/lr$c;->c:J

    cmp-long v1, v2, v6

    if-eqz v1, :cond_15

    const/16 v1, 0x15

    iget-wide v2, p0, Lcom/google/android/gms/b/lr$c;->c:J

    invoke-static {v1, v2, v3}, Lcom/google/android/gms/b/lg;->e(IJ)I

    move-result v1

    add-int/2addr v0, v1

    :cond_15
    iget-wide v2, p0, Lcom/google/android/gms/b/lr$c;->u:J

    cmp-long v1, v2, v6

    if-eqz v1, :cond_16

    const/16 v1, 0x16

    iget-wide v2, p0, Lcom/google/android/gms/b/lr$c;->u:J

    invoke-static {v1, v2, v3}, Lcom/google/android/gms/b/lg;->e(IJ)I

    move-result v1

    add-int/2addr v0, v1

    :cond_16
    iget-object v1, p0, Lcom/google/android/gms/b/lr$c;->v:Lcom/google/android/gms/b/lr$e;

    if-eqz v1, :cond_17

    const/16 v1, 0x17

    iget-object v2, p0, Lcom/google/android/gms/b/lr$c;->v:Lcom/google/android/gms/b/lr$e;

    invoke-static {v1, v2}, Lcom/google/android/gms/b/lg;->c(ILcom/google/android/gms/b/ln;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_17
    iget-object v1, p0, Lcom/google/android/gms/b/lr$c;->r:Ljava/lang/String;

    if-eqz v1, :cond_18

    iget-object v1, p0, Lcom/google/android/gms/b/lr$c;->r:Ljava/lang/String;

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_18

    const/16 v1, 0x18

    iget-object v2, p0, Lcom/google/android/gms/b/lr$c;->r:Ljava/lang/String;

    invoke-static {v1, v2}, Lcom/google/android/gms/b/lg;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_18
    return v0
.end method

.method public synthetic b(Lcom/google/android/gms/b/lf;)Lcom/google/android/gms/b/ln;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/b/lr$c;->a(Lcom/google/android/gms/b/lf;)Lcom/google/android/gms/b/lr$c;

    move-result-object v0

    return-object v0
.end method

.method public synthetic c()Lcom/google/android/gms/b/lh;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/b/lr$c;->d()Lcom/google/android/gms/b/ln;

    move-result-object v0

    check-cast v0, Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/b/lr$c;

    return-object v0
.end method

.method public synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/b/lr$c;->g()Lcom/google/android/gms/b/lr$c;

    move-result-object v0

    return-object v0
.end method

.method public synthetic d()Lcom/google/android/gms/b/ln;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/b/lr$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/lr$c;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v1, 0x1

    const/4 v0, 0x0

    if-ne p1, p0, :cond_1

    move v0, v1

    :cond_0
    :goto_0
    return v0

    :cond_1
    instance-of v2, p1, Lcom/google/android/gms/b/lr$c;

    if-eqz v2, :cond_0

    check-cast p1, Lcom/google/android/gms/b/lr$c;

    iget-wide v2, p0, Lcom/google/android/gms/b/lr$c;->a:J

    iget-wide v4, p1, Lcom/google/android/gms/b/lr$c;->a:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_0

    iget-wide v2, p0, Lcom/google/android/gms/b/lr$c;->b:J

    iget-wide v4, p1, Lcom/google/android/gms/b/lr$c;->b:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_0

    iget-wide v2, p0, Lcom/google/android/gms/b/lr$c;->c:J

    iget-wide v4, p1, Lcom/google/android/gms/b/lr$c;->c:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/b/lr$c;->d:Ljava/lang/String;

    if-nez v2, :cond_c

    iget-object v2, p1, Lcom/google/android/gms/b/lr$c;->d:Ljava/lang/String;

    if-nez v2, :cond_0

    :cond_2
    iget v2, p0, Lcom/google/android/gms/b/lr$c;->e:I

    iget v3, p1, Lcom/google/android/gms/b/lr$c;->e:I

    if-ne v2, v3, :cond_0

    iget v2, p0, Lcom/google/android/gms/b/lr$c;->f:I

    iget v3, p1, Lcom/google/android/gms/b/lr$c;->f:I

    if-ne v2, v3, :cond_0

    iget-boolean v2, p0, Lcom/google/android/gms/b/lr$c;->g:Z

    iget-boolean v3, p1, Lcom/google/android/gms/b/lr$c;->g:Z

    if-ne v2, v3, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/b/lr$c;->h:[Lcom/google/android/gms/b/lr$d;

    iget-object v3, p1, Lcom/google/android/gms/b/lr$c;->h:[Lcom/google/android/gms/b/lr$d;

    invoke-static {v2, v3}, Lcom/google/android/gms/b/ll;->a([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/b/lr$c;->i:[B

    iget-object v3, p1, Lcom/google/android/gms/b/lr$c;->i:[B

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/b/lr$c;->j:Lcom/google/android/gms/b/lr$a;

    if-nez v2, :cond_d

    iget-object v2, p1, Lcom/google/android/gms/b/lr$c;->j:Lcom/google/android/gms/b/lr$a;

    if-nez v2, :cond_0

    :cond_3
    iget-object v2, p0, Lcom/google/android/gms/b/lr$c;->k:[B

    iget-object v3, p1, Lcom/google/android/gms/b/lr$c;->k:[B

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/b/lr$c;->l:Ljava/lang/String;

    if-nez v2, :cond_e

    iget-object v2, p1, Lcom/google/android/gms/b/lr$c;->l:Ljava/lang/String;

    if-nez v2, :cond_0

    :cond_4
    iget-object v2, p0, Lcom/google/android/gms/b/lr$c;->m:Ljava/lang/String;

    if-nez v2, :cond_f

    iget-object v2, p1, Lcom/google/android/gms/b/lr$c;->m:Ljava/lang/String;

    if-nez v2, :cond_0

    :cond_5
    iget-object v2, p0, Lcom/google/android/gms/b/lr$c;->n:Ljava/lang/String;

    if-nez v2, :cond_10

    iget-object v2, p1, Lcom/google/android/gms/b/lr$c;->n:Ljava/lang/String;

    if-nez v2, :cond_0

    :cond_6
    iget-wide v2, p0, Lcom/google/android/gms/b/lr$c;->o:J

    iget-wide v4, p1, Lcom/google/android/gms/b/lr$c;->o:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/b/lr$c;->p:Lcom/google/android/gms/b/lr$b;

    if-nez v2, :cond_11

    iget-object v2, p1, Lcom/google/android/gms/b/lr$c;->p:Lcom/google/android/gms/b/lr$b;

    if-nez v2, :cond_0

    :cond_7
    iget-object v2, p0, Lcom/google/android/gms/b/lr$c;->q:[B

    iget-object v3, p1, Lcom/google/android/gms/b/lr$c;->q:[B

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/b/lr$c;->r:Ljava/lang/String;

    if-nez v2, :cond_12

    iget-object v2, p1, Lcom/google/android/gms/b/lr$c;->r:Ljava/lang/String;

    if-nez v2, :cond_0

    :cond_8
    iget v2, p0, Lcom/google/android/gms/b/lr$c;->s:I

    iget v3, p1, Lcom/google/android/gms/b/lr$c;->s:I

    if-ne v2, v3, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/b/lr$c;->t:[I

    iget-object v3, p1, Lcom/google/android/gms/b/lr$c;->t:[I

    invoke-static {v2, v3}, Lcom/google/android/gms/b/ll;->a([I[I)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-wide v2, p0, Lcom/google/android/gms/b/lr$c;->u:J

    iget-wide v4, p1, Lcom/google/android/gms/b/lr$c;->u:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/b/lr$c;->v:Lcom/google/android/gms/b/lr$e;

    if-nez v2, :cond_13

    iget-object v2, p1, Lcom/google/android/gms/b/lr$c;->v:Lcom/google/android/gms/b/lr$e;

    if-nez v2, :cond_0

    :cond_9
    iget-object v2, p0, Lcom/google/android/gms/b/lr$c;->ag:Lcom/google/android/gms/b/lj;

    if-eqz v2, :cond_a

    iget-object v2, p0, Lcom/google/android/gms/b/lr$c;->ag:Lcom/google/android/gms/b/lj;

    invoke-virtual {v2}, Lcom/google/android/gms/b/lj;->b()Z

    move-result v2

    if-eqz v2, :cond_14

    :cond_a
    iget-object v2, p1, Lcom/google/android/gms/b/lr$c;->ag:Lcom/google/android/gms/b/lj;

    if-eqz v2, :cond_b

    iget-object v2, p1, Lcom/google/android/gms/b/lr$c;->ag:Lcom/google/android/gms/b/lj;

    invoke-virtual {v2}, Lcom/google/android/gms/b/lj;->b()Z

    move-result v2

    if-eqz v2, :cond_0

    :cond_b
    move v0, v1

    goto/16 :goto_0

    :cond_c
    iget-object v2, p0, Lcom/google/android/gms/b/lr$c;->d:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/b/lr$c;->d:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto/16 :goto_0

    :cond_d
    iget-object v2, p0, Lcom/google/android/gms/b/lr$c;->j:Lcom/google/android/gms/b/lr$a;

    iget-object v3, p1, Lcom/google/android/gms/b/lr$c;->j:Lcom/google/android/gms/b/lr$a;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/b/lr$a;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto/16 :goto_0

    :cond_e
    iget-object v2, p0, Lcom/google/android/gms/b/lr$c;->l:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/b/lr$c;->l:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    goto/16 :goto_0

    :cond_f
    iget-object v2, p0, Lcom/google/android/gms/b/lr$c;->m:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/b/lr$c;->m:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    goto/16 :goto_0

    :cond_10
    iget-object v2, p0, Lcom/google/android/gms/b/lr$c;->n:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/b/lr$c;->n:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    goto/16 :goto_0

    :cond_11
    iget-object v2, p0, Lcom/google/android/gms/b/lr$c;->p:Lcom/google/android/gms/b/lr$b;

    iget-object v3, p1, Lcom/google/android/gms/b/lr$c;->p:Lcom/google/android/gms/b/lr$b;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/b/lr$b;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    goto/16 :goto_0

    :cond_12
    iget-object v2, p0, Lcom/google/android/gms/b/lr$c;->r:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/b/lr$c;->r:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    goto/16 :goto_0

    :cond_13
    iget-object v2, p0, Lcom/google/android/gms/b/lr$c;->v:Lcom/google/android/gms/b/lr$e;

    iget-object v3, p1, Lcom/google/android/gms/b/lr$c;->v:Lcom/google/android/gms/b/lr$e;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/b/lr$e;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    goto/16 :goto_0

    :cond_14
    iget-object v0, p0, Lcom/google/android/gms/b/lr$c;->ag:Lcom/google/android/gms/b/lj;

    iget-object v1, p1, Lcom/google/android/gms/b/lr$c;->ag:Lcom/google/android/gms/b/lj;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/lj;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto/16 :goto_0
.end method

.method public g()Lcom/google/android/gms/b/lr$c;
    .locals 4

    :try_start_0
    invoke-super {p0}, Lcom/google/android/gms/b/lh;->c()Lcom/google/android/gms/b/lh;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/b/lr$c;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v1, p0, Lcom/google/android/gms/b/lr$c;->h:[Lcom/google/android/gms/b/lr$d;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/b/lr$c;->h:[Lcom/google/android/gms/b/lr$d;

    array-length v1, v1

    if-lez v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/b/lr$c;->h:[Lcom/google/android/gms/b/lr$d;

    array-length v1, v1

    new-array v1, v1, [Lcom/google/android/gms/b/lr$d;

    iput-object v1, v0, Lcom/google/android/gms/b/lr$c;->h:[Lcom/google/android/gms/b/lr$d;

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/b/lr$c;->h:[Lcom/google/android/gms/b/lr$d;

    array-length v1, v1

    if-ge v2, v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/b/lr$c;->h:[Lcom/google/android/gms/b/lr$d;

    aget-object v1, v1, v2

    if-eqz v1, :cond_0

    iget-object v3, v0, Lcom/google/android/gms/b/lr$c;->h:[Lcom/google/android/gms/b/lr$d;

    iget-object v1, p0, Lcom/google/android/gms/b/lr$c;->h:[Lcom/google/android/gms/b/lr$d;

    aget-object v1, v1, v2

    invoke-virtual {v1}, Lcom/google/android/gms/b/lr$d;->d()Lcom/google/android/gms/b/ln;

    move-result-object v1

    check-cast v1, Ljava/lang/Object;

    check-cast v1, Lcom/google/android/gms/b/lr$d;

    aput-object v1, v3, v2

    :cond_0
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/b/lr$c;->j:Lcom/google/android/gms/b/lr$a;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/b/lr$c;->j:Lcom/google/android/gms/b/lr$a;

    invoke-virtual {v1}, Lcom/google/android/gms/b/lr$a;->d()Lcom/google/android/gms/b/ln;

    move-result-object v1

    check-cast v1, Ljava/lang/Object;

    check-cast v1, Lcom/google/android/gms/b/lr$a;

    iput-object v1, v0, Lcom/google/android/gms/b/lr$c;->j:Lcom/google/android/gms/b/lr$a;

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/b/lr$c;->p:Lcom/google/android/gms/b/lr$b;

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/google/android/gms/b/lr$c;->p:Lcom/google/android/gms/b/lr$b;

    invoke-virtual {v1}, Lcom/google/android/gms/b/lr$b;->d()Lcom/google/android/gms/b/ln;

    move-result-object v1

    check-cast v1, Ljava/lang/Object;

    check-cast v1, Lcom/google/android/gms/b/lr$b;

    iput-object v1, v0, Lcom/google/android/gms/b/lr$c;->p:Lcom/google/android/gms/b/lr$b;

    :cond_3
    iget-object v1, p0, Lcom/google/android/gms/b/lr$c;->t:[I

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/google/android/gms/b/lr$c;->t:[I

    array-length v1, v1

    if-lez v1, :cond_4

    iget-object v1, p0, Lcom/google/android/gms/b/lr$c;->t:[I

    invoke-virtual {v1}, [I->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [I

    iput-object v1, v0, Lcom/google/android/gms/b/lr$c;->t:[I

    :cond_4
    iget-object v1, p0, Lcom/google/android/gms/b/lr$c;->v:Lcom/google/android/gms/b/lr$e;

    if-eqz v1, :cond_5

    iget-object v1, p0, Lcom/google/android/gms/b/lr$c;->v:Lcom/google/android/gms/b/lr$e;

    invoke-virtual {v1}, Lcom/google/android/gms/b/lr$e;->d()Lcom/google/android/gms/b/ln;

    move-result-object v1

    check-cast v1, Ljava/lang/Object;

    check-cast v1, Lcom/google/android/gms/b/lr$e;

    iput-object v1, v0, Lcom/google/android/gms/b/lr$c;->v:Lcom/google/android/gms/b/lr$e;

    :cond_5
    return-object v0
.end method

.method public hashCode()I
    .locals 7

    const/16 v6, 0x20

    const/4 v1, 0x0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    add-int/lit16 v0, v0, 0x20f

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v2, p0, Lcom/google/android/gms/b/lr$c;->a:J

    iget-wide v4, p0, Lcom/google/android/gms/b/lr$c;->a:J

    ushr-long/2addr v4, v6

    xor-long/2addr v2, v4

    long-to-int v2, v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v2, p0, Lcom/google/android/gms/b/lr$c;->b:J

    iget-wide v4, p0, Lcom/google/android/gms/b/lr$c;->b:J

    ushr-long/2addr v4, v6

    xor-long/2addr v2, v4

    long-to-int v2, v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v2, p0, Lcom/google/android/gms/b/lr$c;->c:J

    iget-wide v4, p0, Lcom/google/android/gms/b/lr$c;->c:J

    ushr-long/2addr v4, v6

    xor-long/2addr v2, v4

    long-to-int v2, v2

    add-int/2addr v0, v2

    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/b/lr$c;->d:Ljava/lang/String;

    if-nez v0, :cond_1

    move v0, v1

    :goto_0
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Lcom/google/android/gms/b/lr$c;->e:I

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Lcom/google/android/gms/b/lr$c;->f:I

    add-int/2addr v0, v2

    mul-int/lit8 v2, v0, 0x1f

    iget-boolean v0, p0, Lcom/google/android/gms/b/lr$c;->g:Z

    if-eqz v0, :cond_2

    const/16 v0, 0x4cf

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/google/android/gms/b/lr$c;->h:[Lcom/google/android/gms/b/lr$d;

    invoke-static {v2}, Lcom/google/android/gms/b/ll;->a([Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/google/android/gms/b/lr$c;->i:[B

    invoke-static {v2}, Ljava/util/Arrays;->hashCode([B)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/b/lr$c;->j:Lcom/google/android/gms/b/lr$a;

    if-nez v0, :cond_3

    move v0, v1

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/google/android/gms/b/lr$c;->k:[B

    invoke-static {v2}, Ljava/util/Arrays;->hashCode([B)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/b/lr$c;->l:Ljava/lang/String;

    if-nez v0, :cond_4

    move v0, v1

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/b/lr$c;->m:Ljava/lang/String;

    if-nez v0, :cond_5

    move v0, v1

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/b/lr$c;->n:Ljava/lang/String;

    if-nez v0, :cond_6

    move v0, v1

    :goto_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v2, p0, Lcom/google/android/gms/b/lr$c;->o:J

    iget-wide v4, p0, Lcom/google/android/gms/b/lr$c;->o:J

    ushr-long/2addr v4, v6

    xor-long/2addr v2, v4

    long-to-int v2, v2

    add-int/2addr v0, v2

    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/b/lr$c;->p:Lcom/google/android/gms/b/lr$b;

    if-nez v0, :cond_7

    move v0, v1

    :goto_6
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/google/android/gms/b/lr$c;->q:[B

    invoke-static {v2}, Ljava/util/Arrays;->hashCode([B)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/b/lr$c;->r:Ljava/lang/String;

    if-nez v0, :cond_8

    move v0, v1

    :goto_7
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Lcom/google/android/gms/b/lr$c;->s:I

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/google/android/gms/b/lr$c;->t:[I

    invoke-static {v2}, Lcom/google/android/gms/b/ll;->a([I)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v2, p0, Lcom/google/android/gms/b/lr$c;->u:J

    iget-wide v4, p0, Lcom/google/android/gms/b/lr$c;->u:J

    ushr-long/2addr v4, v6

    xor-long/2addr v2, v4

    long-to-int v2, v2

    add-int/2addr v0, v2

    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Lcom/google/android/gms/b/lr$c;->v:Lcom/google/android/gms/b/lr$e;

    if-nez v0, :cond_9

    move v0, v1

    :goto_8
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/google/android/gms/b/lr$c;->ag:Lcom/google/android/gms/b/lj;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/b/lr$c;->ag:Lcom/google/android/gms/b/lj;

    invoke-virtual {v2}, Lcom/google/android/gms/b/lj;->b()Z

    move-result v2

    if-eqz v2, :cond_a

    :cond_0
    :goto_9
    add-int/2addr v0, v1

    return v0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/b/lr$c;->d:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto/16 :goto_0

    :cond_2
    const/16 v0, 0x4d5

    goto/16 :goto_1

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/b/lr$c;->j:Lcom/google/android/gms/b/lr$a;

    invoke-virtual {v0}, Lcom/google/android/gms/b/lr$a;->hashCode()I

    move-result v0

    goto/16 :goto_2

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/b/lr$c;->l:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_3

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/b/lr$c;->m:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_4

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/b/lr$c;->n:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_5

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/b/lr$c;->p:Lcom/google/android/gms/b/lr$b;

    invoke-virtual {v0}, Lcom/google/android/gms/b/lr$b;->hashCode()I

    move-result v0

    goto :goto_6

    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/b/lr$c;->r:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_7

    :cond_9
    iget-object v0, p0, Lcom/google/android/gms/b/lr$c;->v:Lcom/google/android/gms/b/lr$e;

    invoke-virtual {v0}, Lcom/google/android/gms/b/lr$e;->hashCode()I

    move-result v0

    goto :goto_8

    :cond_a
    iget-object v1, p0, Lcom/google/android/gms/b/lr$c;->ag:Lcom/google/android/gms/b/lj;

    invoke-virtual {v1}, Lcom/google/android/gms/b/lj;->hashCode()I

    move-result v1

    goto :goto_9
.end method
