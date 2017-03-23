.class public final Lcom/google/android/gms/b/xa;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/b/vz;
.end annotation


# instance fields
.field a:Lcom/google/android/gms/b/sv$c;

.field public final b:Lcom/google/android/gms/b/rq;

.field public final c:Lcom/google/android/gms/b/rq;

.field public final d:Lcom/google/android/gms/b/rq;

.field private final e:Ljava/lang/Object;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:Lcom/google/android/gms/b/aad;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/b/aad",
            "<",
            "Lcom/google/android/gms/b/xd;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/b/xa;->e:Ljava/lang/Object;

    new-instance v0, Lcom/google/android/gms/b/aad;

    invoke-direct {v0}, Lcom/google/android/gms/b/aad;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/b/xa;->h:Lcom/google/android/gms/b/aad;

    new-instance v0, Lcom/google/android/gms/b/xa$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/b/xa$1;-><init>(Lcom/google/android/gms/b/xa;)V

    iput-object v0, p0, Lcom/google/android/gms/b/xa;->b:Lcom/google/android/gms/b/rq;

    new-instance v0, Lcom/google/android/gms/b/xa$2;

    invoke-direct {v0, p0}, Lcom/google/android/gms/b/xa$2;-><init>(Lcom/google/android/gms/b/xa;)V

    iput-object v0, p0, Lcom/google/android/gms/b/xa;->c:Lcom/google/android/gms/b/rq;

    new-instance v0, Lcom/google/android/gms/b/xa$3;

    invoke-direct {v0, p0}, Lcom/google/android/gms/b/xa$3;-><init>(Lcom/google/android/gms/b/xa;)V

    iput-object v0, p0, Lcom/google/android/gms/b/xa;->d:Lcom/google/android/gms/b/rq;

    iput-object p2, p0, Lcom/google/android/gms/b/xa;->g:Ljava/lang/String;

    iput-object p1, p0, Lcom/google/android/gms/b/xa;->f:Ljava/lang/String;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/b/xa;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/xa;->e:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic b(Lcom/google/android/gms/b/xa;)Lcom/google/android/gms/b/aad;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/xa;->h:Lcom/google/android/gms/b/aad;

    return-object v0
.end method

.method static synthetic c(Lcom/google/android/gms/b/xa;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/xa;->f:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic d(Lcom/google/android/gms/b/xa;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/xa;->g:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public a()Lcom/google/android/gms/b/sv$c;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/xa;->a:Lcom/google/android/gms/b/sv$c;

    return-object v0
.end method

.method public a(Lcom/google/android/gms/b/sv$c;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/xa;->a:Lcom/google/android/gms/b/sv$c;

    return-void
.end method

.method public b()Ljava/util/concurrent/Future;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/concurrent/Future",
            "<",
            "Lcom/google/android/gms/b/xd;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/b/xa;->h:Lcom/google/android/gms/b/aad;

    return-object v0
.end method
