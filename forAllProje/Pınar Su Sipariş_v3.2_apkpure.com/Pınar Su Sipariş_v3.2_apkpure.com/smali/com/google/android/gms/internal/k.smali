.class Lcom/google/android/gms/internal/k;
.super Ljava/lang/Object;


# instance fields
.field private a:Ljava/io/DataInputStream;

.field private b:Lcom/google/android/gms/internal/zzaie;

.field private c:Lcom/google/android/gms/internal/zzaif;

.field private d:[B

.field private e:Lcom/google/android/gms/internal/i$b;

.field private volatile f:Z


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzaie;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/k;->a:Ljava/io/DataInputStream;

    iput-object v0, p0, Lcom/google/android/gms/internal/k;->b:Lcom/google/android/gms/internal/zzaie;

    iput-object v0, p0, Lcom/google/android/gms/internal/k;->c:Lcom/google/android/gms/internal/zzaif;

    const/16 v0, 0x70

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/google/android/gms/internal/k;->d:[B

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/k;->f:Z

    iput-object p1, p0, Lcom/google/android/gms/internal/k;->b:Lcom/google/android/gms/internal/zzaie;

    return-void
.end method

.method private a([BII)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/k;->a:Ljava/io/DataInputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/DataInputStream;->readFully([BII)V

    return p3
.end method

.method private a([BI)J
    .locals 5

    add-int/lit8 v0, p2, 0x0

    aget-byte v0, p1, v0

    int-to-long v0, v0

    const/16 v2, 0x38

    shl-long/2addr v0, v2

    add-int/lit8 v2, p2, 0x1

    aget-byte v2, p1, v2

    and-int/lit16 v2, v2, 0xff

    int-to-long v2, v2

    const/16 v4, 0x30

    shl-long/2addr v2, v4

    add-long/2addr v0, v2

    add-int/lit8 v2, p2, 0x2

    aget-byte v2, p1, v2

    and-int/lit16 v2, v2, 0xff

    int-to-long v2, v2

    const/16 v4, 0x28

    shl-long/2addr v2, v4

    add-long/2addr v0, v2

    add-int/lit8 v2, p2, 0x3

    aget-byte v2, p1, v2

    and-int/lit16 v2, v2, 0xff

    int-to-long v2, v2

    const/16 v4, 0x20

    shl-long/2addr v2, v4

    add-long/2addr v0, v2

    add-int/lit8 v2, p2, 0x4

    aget-byte v2, p1, v2

    and-int/lit16 v2, v2, 0xff

    int-to-long v2, v2

    const/16 v4, 0x18

    shl-long/2addr v2, v4

    add-long/2addr v0, v2

    add-int/lit8 v2, p2, 0x5

    aget-byte v2, p1, v2

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x10

    int-to-long v2, v2

    add-long/2addr v0, v2

    add-int/lit8 v2, p2, 0x6

    aget-byte v2, p1, v2

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x8

    int-to-long v2, v2

    add-long/2addr v0, v2

    add-int/lit8 v2, p2, 0x7

    aget-byte v2, p1, v2

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x0

    int-to-long v2, v2

    add-long/2addr v0, v2

    return-wide v0
.end method

.method private a(Lcom/google/android/gms/internal/zzaig;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/k;->b()V

    iget-object v0, p0, Lcom/google/android/gms/internal/k;->b:Lcom/google/android/gms/internal/zzaie;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzaie;->zzb(Lcom/google/android/gms/internal/zzaig;)V

    return-void
.end method

.method private a(ZB[B)V
    .locals 2

    const/16 v0, 0x9

    if-ne p2, v0, :cond_2

    if-eqz p1, :cond_1

    invoke-direct {p0, p3}, Lcom/google/android/gms/internal/k;->a([B)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/zzaig;

    const-string v1, "PING must not fragment across frames"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/zzaig;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/k;->e:Lcom/google/android/gms/internal/i$b;

    if-eqz v0, :cond_3

    if-eqz p2, :cond_3

    new-instance v0, Lcom/google/android/gms/internal/zzaig;

    const-string v1, "Failed to continue outstanding frame"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/zzaig;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/k;->e:Lcom/google/android/gms/internal/i$b;

    if-nez v0, :cond_4

    if-nez p2, :cond_4

    new-instance v0, Lcom/google/android/gms/internal/zzaig;

    const-string v1, "Received continuing frame, but there\'s nothing to continue"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/zzaig;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/k;->e:Lcom/google/android/gms/internal/i$b;

    if-nez v0, :cond_5

    invoke-static {p2}, Lcom/google/android/gms/internal/i;->a(B)Lcom/google/android/gms/internal/i$b;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/k;->e:Lcom/google/android/gms/internal/i$b;

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/k;->e:Lcom/google/android/gms/internal/i$b;

    invoke-interface {v0, p3}, Lcom/google/android/gms/internal/i$b;->a([B)Z

    move-result v0

    if-nez v0, :cond_6

    new-instance v0, Lcom/google/android/gms/internal/zzaig;

    const-string v1, "Failed to decode frame"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/zzaig;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/k;->e:Lcom/google/android/gms/internal/i$b;

    invoke-interface {v0}, Lcom/google/android/gms/internal/i$b;->a()Lcom/google/android/gms/internal/zzaii;

    move-result-object v0

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/google/android/gms/internal/k;->e:Lcom/google/android/gms/internal/i$b;

    if-nez v0, :cond_7

    new-instance v0, Lcom/google/android/gms/internal/zzaig;

    const-string v1, "Failed to decode whole message"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/zzaig;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    iget-object v1, p0, Lcom/google/android/gms/internal/k;->c:Lcom/google/android/gms/internal/zzaif;

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/zzaif;->zza(Lcom/google/android/gms/internal/zzaii;)V

    goto :goto_0
.end method

.method private a([B)V
    .locals 2

    array-length v0, p1

    const/16 v1, 0x7d

    if-gt v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/k;->b:Lcom/google/android/gms/internal/zzaie;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzaie;->zzK([B)V

    return-void

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/zzaig;

    const-string v1, "PING frame too long"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/zzaig;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method a()V
    .locals 12

    const/16 v11, 0x7e

    const/16 v10, 0x8

    const/4 v9, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/k;->b:Lcom/google/android/gms/internal/zzaie;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaie;->zzTS()Lcom/google/android/gms/internal/zzaif;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/k;->c:Lcom/google/android/gms/internal/zzaif;

    :cond_0
    :goto_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/k;->f:Z

    if-nez v0, :cond_a

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/k;->d:[B

    const/4 v1, 0x0

    const/4 v4, 0x1

    invoke-direct {p0, v0, v1, v4}, Lcom/google/android/gms/internal/k;->a([BII)I

    move-result v0

    add-int/lit8 v1, v0, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/k;->d:[B

    const/4 v4, 0x0

    aget-byte v0, v0, v4

    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_1

    move v4, v2

    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/internal/k;->d:[B

    const/4 v5, 0x0

    aget-byte v0, v0, v5

    and-int/lit8 v0, v0, 0x70

    if-eqz v0, :cond_2

    move v0, v2

    :goto_2
    if-eqz v0, :cond_3

    new-instance v0, Lcom/google/android/gms/internal/zzaig;

    const-string v1, "Invalid frame received"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/zzaig;-><init>(Ljava/lang/String;)V

    throw v0

    :catch_0
    move-exception v0

    goto :goto_0

    :cond_1
    move v4, v3

    goto :goto_1

    :cond_2
    move v0, v3

    goto :goto_2

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/k;->d:[B

    const/4 v5, 0x0

    aget-byte v0, v0, v5

    and-int/lit8 v0, v0, 0xf

    int-to-byte v5, v0

    iget-object v0, p0, Lcom/google/android/gms/internal/k;->d:[B

    const/4 v6, 0x1

    invoke-direct {p0, v0, v1, v6}, Lcom/google/android/gms/internal/k;->a([BII)I

    move-result v0

    add-int v6, v1, v0

    iget-object v0, p0, Lcom/google/android/gms/internal/k;->d:[B

    const/4 v1, 0x1

    aget-byte v7, v0, v1

    const-wide/16 v0, 0x0

    if-ge v7, v11, :cond_5

    int-to-long v0, v7

    :cond_4
    :goto_3
    long-to-int v6, v0

    new-array v6, v6, [B

    const/4 v7, 0x0

    long-to-int v0, v0

    invoke-direct {p0, v6, v7, v0}, Lcom/google/android/gms/internal/k;->a([BII)I

    if-ne v5, v10, :cond_7

    iget-object v0, p0, Lcom/google/android/gms/internal/k;->b:Lcom/google/android/gms/internal/zzaie;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzaie;->zzTT()V
    :try_end_0
    .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/google/android/gms/internal/zzaig; {:try_start_0 .. :try_end_0} :catch_2

    goto :goto_0

    :catch_1
    move-exception v0

    new-instance v1, Lcom/google/android/gms/internal/zzaig;

    const-string v4, "IO Error"

    invoke-direct {v1, v4, v0}, Lcom/google/android/gms/internal/zzaig;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/k;->a(Lcom/google/android/gms/internal/zzaig;)V

    goto :goto_0

    :cond_5
    if-ne v7, v11, :cond_6

    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/internal/k;->d:[B

    const/4 v1, 0x2

    invoke-direct {p0, v0, v6, v1}, Lcom/google/android/gms/internal/k;->a([BII)I

    move-result v0

    add-int/2addr v0, v6

    iget-object v0, p0, Lcom/google/android/gms/internal/k;->d:[B

    const/4 v1, 0x2

    aget-byte v0, v0, v1

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x8

    iget-object v1, p0, Lcom/google/android/gms/internal/k;->d:[B

    const/4 v6, 0x3

    aget-byte v1, v1, v6

    and-int/lit16 v1, v1, 0xff

    or-int/2addr v0, v1

    int-to-long v0, v0

    goto :goto_3

    :cond_6
    const/16 v8, 0x7f

    if-ne v7, v8, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/k;->d:[B

    const/16 v1, 0x8

    invoke-direct {p0, v0, v6, v1}, Lcom/google/android/gms/internal/k;->a([BII)I

    move-result v0

    add-int/2addr v0, v6

    iget-object v1, p0, Lcom/google/android/gms/internal/k;->d:[B

    add-int/lit8 v0, v0, -0x8

    invoke-direct {p0, v1, v0}, Lcom/google/android/gms/internal/k;->a([BI)J

    move-result-wide v0

    goto :goto_3

    :cond_7
    const/16 v0, 0xa

    if-eq v5, v0, :cond_0

    if-eq v5, v2, :cond_8

    if-eq v5, v9, :cond_8

    const/16 v0, 0x9

    if-eq v5, v0, :cond_8

    if-nez v5, :cond_9

    :cond_8
    invoke-direct {p0, v4, v5, v6}, Lcom/google/android/gms/internal/k;->a(ZB[B)V
    :try_end_1
    .catch Ljava/net/SocketTimeoutException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Lcom/google/android/gms/internal/zzaig; {:try_start_1 .. :try_end_1} :catch_2

    goto/16 :goto_0

    :catch_2
    move-exception v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/k;->a(Lcom/google/android/gms/internal/zzaig;)V

    goto/16 :goto_0

    :cond_9
    :try_start_2
    new-instance v0, Lcom/google/android/gms/internal/zzaig;

    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v4, 0x18

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "Unsupported opcode: "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/zzaig;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_2
    .catch Ljava/net/SocketTimeoutException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Lcom/google/android/gms/internal/zzaig; {:try_start_2 .. :try_end_2} :catch_2

    :cond_a
    return-void
.end method

.method a(Ljava/io/DataInputStream;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/k;->a:Ljava/io/DataInputStream;

    return-void
.end method

.method b()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/k;->f:Z

    return-void
.end method
