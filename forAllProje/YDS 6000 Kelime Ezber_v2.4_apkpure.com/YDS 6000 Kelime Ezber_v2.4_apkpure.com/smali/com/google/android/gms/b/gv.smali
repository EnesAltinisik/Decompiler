.class final enum Lcom/google/android/gms/b/gv;
.super Ljava/lang/Enum;

# interfaces
.implements Lcom/google/android/gms/b/gy;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/google/android/gms/b/gv;",
        ">;",
        "Lcom/google/android/gms/b/gy;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/google/android/gms/b/gv;

.field static b:Ljava/util/concurrent/ThreadFactory;

.field static final c:Lcom/google/android/gms/b/hj;

.field private static final synthetic d:[Lcom/google/android/gms/b/gv;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v2, 0x0

    new-instance v0, Lcom/google/android/gms/b/gv;

    const-string v1, "INSTANCE"

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/b/gv;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/b/gv;->a:Lcom/google/android/gms/b/gv;

    const/4 v0, 0x1

    new-array v0, v0, [Lcom/google/android/gms/b/gv;

    sget-object v1, Lcom/google/android/gms/b/gv;->a:Lcom/google/android/gms/b/gv;

    aput-object v1, v0, v2

    sput-object v0, Lcom/google/android/gms/b/gv;->d:[Lcom/google/android/gms/b/gv;

    new-instance v0, Lcom/google/android/gms/b/gv$1;

    invoke-direct {v0}, Lcom/google/android/gms/b/gv$1;-><init>()V

    sput-object v0, Lcom/google/android/gms/b/gv;->c:Lcom/google/android/gms/b/hj;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static a()Z
    .locals 1

    invoke-static {}, Lcom/google/android/gms/b/gv;->c()Ljava/util/concurrent/ThreadFactory;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private static c()Ljava/util/concurrent/ThreadFactory;
    .locals 4

    const/4 v1, 0x0

    sget-object v0, Lcom/google/android/gms/b/gv;->b:Ljava/util/concurrent/ThreadFactory;

    if-nez v0, :cond_0

    :try_start_0
    const-string v0, "com.google.appengine.api.ThreadManager"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v2, "backgroundThreadFactory"

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Class;

    invoke-virtual {v0, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v0, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/ThreadFactory;

    sput-object v0, Lcom/google/android/gms/b/gv;->b:Ljava/util/concurrent/ThreadFactory;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_3

    :cond_0
    sget-object v0, Lcom/google/android/gms/b/gv;->b:Ljava/util/concurrent/ThreadFactory;

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    move-object v0, v1

    goto :goto_0

    :catch_1
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catch_2
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catch_3
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static values()[Lcom/google/android/gms/b/gv;
    .locals 1

    sget-object v0, Lcom/google/android/gms/b/gv;->d:[Lcom/google/android/gms/b/gv;

    invoke-virtual {v0}, [Lcom/google/android/gms/b/gv;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/b/gv;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/b/gq;Lcom/google/android/gms/b/gb;Lcom/google/android/gms/b/gd;Lcom/google/android/gms/b/gf$a;)Lcom/google/android/gms/b/gf;
    .locals 2

    new-instance v0, Lcom/google/android/gms/b/gg;

    invoke-virtual {p1}, Lcom/google/android/gms/b/gq;->g()Lcom/google/android/gms/b/gb;

    move-result-object v1

    invoke-direct {v0, v1, p3, p4}, Lcom/google/android/gms/b/gg;-><init>(Lcom/google/android/gms/b/gb;Lcom/google/android/gms/b/gd;Lcom/google/android/gms/b/gf$a;)V

    return-object v0
.end method

.method public a(Ljava/util/concurrent/ScheduledExecutorService;)Lcom/google/android/gms/b/gm;
    .locals 2

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Authentication is not implemented yet"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public a(Lcom/google/android/gms/b/gq;)Lcom/google/android/gms/b/gu;
    .locals 3

    new-instance v0, Lcom/google/android/gms/b/hk;

    invoke-static {}, Lcom/google/android/gms/b/gv;->c()Ljava/util/concurrent/ThreadFactory;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/b/gv;->c:Lcom/google/android/gms/b/hj;

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/b/hk;-><init>(Ljava/util/concurrent/ThreadFactory;Lcom/google/android/gms/b/hj;)V

    return-object v0
.end method

.method public a(Lcom/google/android/gms/b/gq;Ljava/lang/String;)Lcom/google/android/gms/b/ib;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/b/gq;Lcom/google/android/gms/b/jc$a;Ljava/util/List;)Lcom/google/android/gms/b/jc;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/gq;",
            "Lcom/google/android/gms/b/jc$a;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/google/android/gms/b/jc;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/b/ja;

    invoke-direct {v0, p2, p3}, Lcom/google/android/gms/b/ja;-><init>(Lcom/google/android/gms/b/jc$a;Ljava/util/List;)V

    return-object v0
.end method

.method public b(Lcom/google/android/gms/b/gq;)Lcom/google/android/gms/b/hc;
    .locals 2

    const-string v0, "RunLoop"

    invoke-virtual {p1, v0}, Lcom/google/android/gms/b/gq;->a(Ljava/lang/String;)Lcom/google/android/gms/b/jb;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/b/gv$3;

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/b/gv$3;-><init>(Lcom/google/android/gms/b/gv;Lcom/google/android/gms/b/jb;)V

    return-object v1
.end method

.method public b()V
    .locals 2

    sget-object v0, Lcom/google/android/gms/b/gv;->b:Ljava/util/concurrent/ThreadFactory;

    new-instance v1, Lcom/google/android/gms/b/gv$2;

    invoke-direct {v1, p0}, Lcom/google/android/gms/b/gv$2;-><init>(Lcom/google/android/gms/b/gv;)V

    invoke-static {v0, v1}, Lcom/google/android/gms/b/kb;->a(Ljava/util/concurrent/ThreadFactory;Lcom/google/android/gms/b/ka;)V

    return-void
.end method

.method public c(Lcom/google/android/gms/b/gq;)Ljava/lang/String;
    .locals 5

    const-string v0, "AppEngine"

    const-string v1, "java.specification.version"

    const-string v2, "Unknown"

    invoke-static {v1, v2}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v3, v4

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
