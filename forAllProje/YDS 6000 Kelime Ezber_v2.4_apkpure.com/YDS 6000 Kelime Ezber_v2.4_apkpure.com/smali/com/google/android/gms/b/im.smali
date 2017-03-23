.class public Lcom/google/android/gms/b/im;
.super Ljava/lang/Object;


# instance fields
.field private final a:Lcom/google/android/gms/b/ip$a;

.field private final b:Lcom/google/android/gms/b/jl;

.field private final c:Lcom/google/android/gms/b/jl;

.field private final d:Lcom/google/android/gms/b/je;

.field private final e:Lcom/google/android/gms/b/je;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/b/ip$a;Lcom/google/android/gms/b/jl;Lcom/google/android/gms/b/je;Lcom/google/android/gms/b/je;Lcom/google/android/gms/b/jl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/b/im;->a:Lcom/google/android/gms/b/ip$a;

    iput-object p2, p0, Lcom/google/android/gms/b/im;->b:Lcom/google/android/gms/b/jl;

    iput-object p3, p0, Lcom/google/android/gms/b/im;->d:Lcom/google/android/gms/b/je;

    iput-object p4, p0, Lcom/google/android/gms/b/im;->e:Lcom/google/android/gms/b/je;

    iput-object p5, p0, Lcom/google/android/gms/b/im;->c:Lcom/google/android/gms/b/jl;

    return-void
.end method

.method public static a(Lcom/google/android/gms/b/je;Lcom/google/android/gms/b/jl;)Lcom/google/android/gms/b/im;
    .locals 6

    const/4 v4, 0x0

    new-instance v0, Lcom/google/android/gms/b/im;

    sget-object v1, Lcom/google/android/gms/b/ip$a;->c:Lcom/google/android/gms/b/ip$a;

    move-object v2, p1

    move-object v3, p0

    move-object v5, v4

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/b/im;-><init>(Lcom/google/android/gms/b/ip$a;Lcom/google/android/gms/b/jl;Lcom/google/android/gms/b/je;Lcom/google/android/gms/b/je;Lcom/google/android/gms/b/jl;)V

    return-object v0
.end method

.method public static a(Lcom/google/android/gms/b/jl;)Lcom/google/android/gms/b/im;
    .locals 6

    const/4 v3, 0x0

    new-instance v0, Lcom/google/android/gms/b/im;

    sget-object v1, Lcom/google/android/gms/b/ip$a;->e:Lcom/google/android/gms/b/ip$a;

    move-object v2, p0

    move-object v4, v3

    move-object v5, v3

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/b/im;-><init>(Lcom/google/android/gms/b/ip$a;Lcom/google/android/gms/b/jl;Lcom/google/android/gms/b/je;Lcom/google/android/gms/b/je;Lcom/google/android/gms/b/jl;)V

    return-object v0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/b/je;)Lcom/google/android/gms/b/im;
    .locals 6

    new-instance v0, Lcom/google/android/gms/b/im;

    iget-object v1, p0, Lcom/google/android/gms/b/im;->a:Lcom/google/android/gms/b/ip$a;

    iget-object v2, p0, Lcom/google/android/gms/b/im;->b:Lcom/google/android/gms/b/jl;

    iget-object v3, p0, Lcom/google/android/gms/b/im;->d:Lcom/google/android/gms/b/je;

    iget-object v5, p0, Lcom/google/android/gms/b/im;->c:Lcom/google/android/gms/b/jl;

    move-object v4, p1

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/b/im;-><init>(Lcom/google/android/gms/b/ip$a;Lcom/google/android/gms/b/jl;Lcom/google/android/gms/b/je;Lcom/google/android/gms/b/je;Lcom/google/android/gms/b/jl;)V

    return-object v0
.end method

.method public a()Lcom/google/android/gms/b/je;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/im;->d:Lcom/google/android/gms/b/je;

    return-object v0
.end method

.method public b()Lcom/google/android/gms/b/ip$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/im;->a:Lcom/google/android/gms/b/ip$a;

    return-object v0
.end method

.method public c()Lcom/google/android/gms/b/jl;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/im;->b:Lcom/google/android/gms/b/jl;

    return-object v0
.end method

.method public d()Lcom/google/android/gms/b/jl;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/im;->c:Lcom/google/android/gms/b/jl;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/b/im;->a:Lcom/google/android/gms/b/ip$a;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/b/im;->d:Lcom/google/android/gms/b/je;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x9

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v3, v4

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Change: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
