.class public Lcom/google/firebase/database/f;
.super Ljava/lang/Object;


# static fields
.field private static final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/firebase/database/f;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Lcom/google/firebase/b;

.field private final c:Lcom/google/android/gms/b/ha;

.field private final d:Lcom/google/android/gms/b/gr;

.field private e:Lcom/google/android/gms/b/gz;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/google/firebase/database/f;->a:Ljava/util/Map;

    return-void
.end method

.method private constructor <init>(Lcom/google/firebase/b;Lcom/google/android/gms/b/ha;Lcom/google/android/gms/b/gr;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/database/f;->b:Lcom/google/firebase/b;

    iput-object p2, p0, Lcom/google/firebase/database/f;->c:Lcom/google/android/gms/b/ha;

    iput-object p3, p0, Lcom/google/firebase/database/f;->d:Lcom/google/android/gms/b/gr;

    return-void
.end method

.method public static a()Lcom/google/firebase/database/f;
    .locals 1

    invoke-static {}, Lcom/google/firebase/b;->d()Lcom/google/firebase/b;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/database/f;->a(Lcom/google/firebase/b;)Lcom/google/firebase/database/f;

    move-result-object v0

    return-object v0
.end method

.method public static declared-synchronized a(Lcom/google/firebase/b;)Lcom/google/firebase/database/f;
    .locals 7

    const-class v1, Lcom/google/firebase/database/f;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/google/firebase/database/f;->a:Ljava/util/Map;

    invoke-virtual {p0}, Lcom/google/firebase/b;->b()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p0}, Lcom/google/firebase/b;->c()Lcom/google/firebase/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/firebase/d;->c()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/firebase/database/c;

    const-string v2, "Failed to get FirebaseDatabase instance: FirebaseApp object has no DatabaseURL in its FirebaseOptions object."

    invoke-direct {v0, v2}, Lcom/google/firebase/database/c;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0

    :cond_0
    :try_start_1
    invoke-static {v0}, Lcom/google/android/gms/b/kt;->a(Ljava/lang/String;)Lcom/google/android/gms/b/ks;

    move-result-object v2

    iget-object v3, v2, Lcom/google/android/gms/b/ks;->b:Lcom/google/android/gms/b/gx;

    invoke-virtual {v3}, Lcom/google/android/gms/b/gx;->h()Z

    move-result v3

    if-nez v3, :cond_1

    new-instance v3, Lcom/google/firebase/database/c;

    iget-object v2, v2, Lcom/google/android/gms/b/ks;->b:Lcom/google/android/gms/b/gx;

    invoke-virtual {v2}, Lcom/google/android/gms/b/gx;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/lit8 v5, v5, 0x72

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    add-int/2addr v5, v6

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v5, "Configured Database URL \'"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, "\' is invalid. It should point to the root of a Firebase Database but it includes a path: "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Lcom/google/firebase/database/c;-><init>(Ljava/lang/String;)V

    throw v3

    :cond_1
    new-instance v0, Lcom/google/android/gms/b/gr;

    invoke-direct {v0}, Lcom/google/android/gms/b/gr;-><init>()V

    invoke-virtual {p0}, Lcom/google/firebase/b;->e()Z

    move-result v3

    if-nez v3, :cond_2

    invoke-virtual {p0}, Lcom/google/firebase/b;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/google/android/gms/b/gr;->c(Ljava/lang/String;)V

    :cond_2
    invoke-virtual {v0, p0}, Lcom/google/android/gms/b/gr;->a(Lcom/google/firebase/b;)V

    sget-object v3, Lcom/google/firebase/database/f;->a:Ljava/util/Map;

    invoke-virtual {p0}, Lcom/google/firebase/b;->b()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lcom/google/firebase/database/f;

    iget-object v2, v2, Lcom/google/android/gms/b/ks;->a:Lcom/google/android/gms/b/ha;

    invoke-direct {v5, p0, v2, v0}, Lcom/google/firebase/database/f;-><init>(Lcom/google/firebase/b;Lcom/google/android/gms/b/ha;Lcom/google/android/gms/b/gr;)V

    invoke-interface {v3, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    sget-object v0, Lcom/google/firebase/database/f;->a:Ljava/util/Map;

    invoke-virtual {p0}, Lcom/google/firebase/b;->b()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/database/f;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v1

    return-object v0
.end method

.method public static e()Ljava/lang/String;
    .locals 1

    const-string v0, "3.0.0"

    return-object v0
.end method

.method private declared-synchronized f()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/firebase/database/f;->e:Lcom/google/android/gms/b/gz;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/firebase/database/f;->d:Lcom/google/android/gms/b/gr;

    iget-object v1, p0, Lcom/google/firebase/database/f;->c:Lcom/google/android/gms/b/ha;

    invoke-static {v0, v1, p0}, Lcom/google/android/gms/b/hb;->a(Lcom/google/android/gms/b/gq;Lcom/google/android/gms/b/ha;Lcom/google/firebase/database/f;)Lcom/google/android/gms/b/gz;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/database/f;->e:Lcom/google/android/gms/b/gz;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method


# virtual methods
.method public b()Lcom/google/firebase/database/d;
    .locals 3

    invoke-direct {p0}, Lcom/google/firebase/database/f;->f()V

    new-instance v0, Lcom/google/firebase/database/d;

    iget-object v1, p0, Lcom/google/firebase/database/f;->e:Lcom/google/android/gms/b/gz;

    invoke-static {}, Lcom/google/android/gms/b/gx;->a()Lcom/google/android/gms/b/gx;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/google/firebase/database/d;-><init>(Lcom/google/android/gms/b/gz;Lcom/google/android/gms/b/gx;)V

    return-object v0
.end method

.method public c()V
    .locals 1

    invoke-direct {p0}, Lcom/google/firebase/database/f;->f()V

    iget-object v0, p0, Lcom/google/firebase/database/f;->e:Lcom/google/android/gms/b/gz;

    invoke-static {v0}, Lcom/google/android/gms/b/hb;->b(Lcom/google/android/gms/b/gz;)V

    return-void
.end method

.method public d()V
    .locals 1

    invoke-direct {p0}, Lcom/google/firebase/database/f;->f()V

    iget-object v0, p0, Lcom/google/firebase/database/f;->e:Lcom/google/android/gms/b/gz;

    invoke-static {v0}, Lcom/google/android/gms/b/hb;->a(Lcom/google/android/gms/b/gz;)V

    return-void
.end method
