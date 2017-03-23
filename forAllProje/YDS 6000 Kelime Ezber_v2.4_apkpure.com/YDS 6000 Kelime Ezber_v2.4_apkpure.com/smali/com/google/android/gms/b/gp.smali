.class public Lcom/google/android/gms/b/gp;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lcom/google/android/gms/b/je;

.field public static final b:Lcom/google/android/gms/b/je;

.field public static final c:Lcom/google/android/gms/b/je;

.field public static final d:Lcom/google/android/gms/b/je;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, ".info"

    invoke-static {v0}, Lcom/google/android/gms/b/je;->a(Ljava/lang/String;)Lcom/google/android/gms/b/je;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/b/gp;->a:Lcom/google/android/gms/b/je;

    const-string v0, "serverTimeOffset"

    invoke-static {v0}, Lcom/google/android/gms/b/je;->a(Ljava/lang/String;)Lcom/google/android/gms/b/je;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/b/gp;->b:Lcom/google/android/gms/b/je;

    const-string v0, "authenticated"

    invoke-static {v0}, Lcom/google/android/gms/b/je;->a(Ljava/lang/String;)Lcom/google/android/gms/b/je;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/b/gp;->c:Lcom/google/android/gms/b/je;

    const-string v0, "connected"

    invoke-static {v0}, Lcom/google/android/gms/b/je;->a(Ljava/lang/String;)Lcom/google/android/gms/b/je;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/b/gp;->d:Lcom/google/android/gms/b/je;

    return-void
.end method
