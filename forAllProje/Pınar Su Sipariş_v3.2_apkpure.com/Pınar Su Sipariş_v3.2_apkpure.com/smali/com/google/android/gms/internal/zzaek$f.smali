.class Lcom/google/android/gms/internal/zzaek$f;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/zzaek;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "f"
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private c:Lcom/google/android/gms/internal/zzaem;


# direct methods
.method private constructor <init>(Ljava/lang/String;Ljava/util/Map;Lcom/google/android/gms/internal/zzaem;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/google/android/gms/internal/zzaem;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzaek$f;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzaek$f;->b:Ljava/util/Map;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzaek$f;->c:Lcom/google/android/gms/internal/zzaem;

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Ljava/util/Map;Lcom/google/android/gms/internal/zzaem;Lcom/google/android/gms/internal/zzaek$1;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/zzaek$f;-><init>(Ljava/lang/String;Ljava/util/Map;Lcom/google/android/gms/internal/zzaem;)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/zzaek$f;)Lcom/google/android/gms/internal/zzaem;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaek$f;->c:Lcom/google/android/gms/internal/zzaem;

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaek$f;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaek$f;->b:Ljava/util/Map;

    return-object v0
.end method

.method public c()Lcom/google/android/gms/internal/zzaem;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaek$f;->c:Lcom/google/android/gms/internal/zzaem;

    return-object v0
.end method
