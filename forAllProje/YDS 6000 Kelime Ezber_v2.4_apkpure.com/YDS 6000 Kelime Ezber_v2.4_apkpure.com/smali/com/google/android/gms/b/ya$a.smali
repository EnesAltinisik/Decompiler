.class public final Lcom/google/android/gms/b/ya$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/b/ya;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:I

.field private d:J


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/b/ya$a;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/ya$a;->a:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic b(Lcom/google/android/gms/b/ya$a;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/ya$a;->b:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic c(Lcom/google/android/gms/b/ya$a;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/b/ya$a;->c:I

    return v0
.end method

.method static synthetic d(Lcom/google/android/gms/b/ya$a;)J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/b/ya$a;->d:J

    return-wide v0
.end method


# virtual methods
.method public a(I)Lcom/google/android/gms/b/ya$a;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/b/ya$a;->c:I

    return-object p0
.end method

.method public a(J)Lcom/google/android/gms/b/ya$a;
    .locals 1

    iput-wide p1, p0, Lcom/google/android/gms/b/ya$a;->d:J

    return-object p0
.end method

.method public a(Ljava/lang/String;)Lcom/google/android/gms/b/ya$a;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/ya$a;->a:Ljava/lang/String;

    return-object p0
.end method

.method public a()Lcom/google/android/gms/b/ya;
    .locals 2

    new-instance v0, Lcom/google/android/gms/b/ya;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/b/ya;-><init>(Lcom/google/android/gms/b/ya$a;Lcom/google/android/gms/b/ya$1;)V

    return-object v0
.end method

.method public b(Ljava/lang/String;)Lcom/google/android/gms/b/ya$a;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/ya$a;->b:Ljava/lang/String;

    return-object p0
.end method
