.class Lcom/google/android/gms/b/gg$e;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/b/gg;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "e"
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/b/gi;

.field private final b:Lcom/google/android/gms/b/gg$c;

.field private final c:Lcom/google/android/gms/b/ge;

.field private final d:Ljava/lang/Long;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/b/gi;Lcom/google/android/gms/b/gg$c;Ljava/lang/Long;Lcom/google/android/gms/b/ge;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/b/gg$e;->a:Lcom/google/android/gms/b/gi;

    iput-object p2, p0, Lcom/google/android/gms/b/gg$e;->b:Lcom/google/android/gms/b/gg$c;

    iput-object p4, p0, Lcom/google/android/gms/b/gg$e;->c:Lcom/google/android/gms/b/ge;

    iput-object p3, p0, Lcom/google/android/gms/b/gg$e;->d:Ljava/lang/Long;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/b/gi;Lcom/google/android/gms/b/gg$c;Ljava/lang/Long;Lcom/google/android/gms/b/ge;Lcom/google/android/gms/b/gg$1;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/android/gms/b/gg$e;-><init>(Lcom/google/android/gms/b/gi;Lcom/google/android/gms/b/gg$c;Ljava/lang/Long;Lcom/google/android/gms/b/ge;)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/b/gg$e;)Lcom/google/android/gms/b/gg$c;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/gg$e;->b:Lcom/google/android/gms/b/gg$c;

    return-object v0
.end method

.method static synthetic b(Lcom/google/android/gms/b/gg$e;)Lcom/google/android/gms/b/gi;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/gg$e;->a:Lcom/google/android/gms/b/gi;

    return-object v0
.end method


# virtual methods
.method public a()Lcom/google/android/gms/b/gg$c;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/gg$e;->b:Lcom/google/android/gms/b/gg$c;

    return-object v0
.end method

.method public b()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/gg$e;->d:Ljava/lang/Long;

    return-object v0
.end method

.method public c()Lcom/google/android/gms/b/ge;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/gg$e;->c:Lcom/google/android/gms/b/ge;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/b/gg$e;->b:Lcom/google/android/gms/b/gg$c;

    invoke-virtual {v0}, Lcom/google/android/gms/b/gg$c;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/b/gg$e;->d:Ljava/lang/Long;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x8

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v3, v4

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " (Tag: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
