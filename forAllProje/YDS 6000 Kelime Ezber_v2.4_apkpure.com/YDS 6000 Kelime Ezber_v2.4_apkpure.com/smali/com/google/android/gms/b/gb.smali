.class public Lcom/google/android/gms/b/gb;
.super Ljava/lang/Object;


# instance fields
.field private final a:Ljava/util/concurrent/ScheduledExecutorService;

.field private final b:Lcom/google/android/gms/b/ga;

.field private final c:Lcom/google/android/gms/b/jc;

.field private final d:Z

.field private final e:Ljava/lang/String;

.field private final f:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/b/jc;Lcom/google/android/gms/b/ga;Ljava/util/concurrent/ScheduledExecutorService;ZLjava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/b/gb;->c:Lcom/google/android/gms/b/jc;

    iput-object p2, p0, Lcom/google/android/gms/b/gb;->b:Lcom/google/android/gms/b/ga;

    iput-object p3, p0, Lcom/google/android/gms/b/gb;->a:Ljava/util/concurrent/ScheduledExecutorService;

    iput-boolean p4, p0, Lcom/google/android/gms/b/gb;->d:Z

    iput-object p5, p0, Lcom/google/android/gms/b/gb;->e:Ljava/lang/String;

    iput-object p6, p0, Lcom/google/android/gms/b/gb;->f:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/b/jc;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/gb;->c:Lcom/google/android/gms/b/jc;

    return-object v0
.end method

.method public b()Lcom/google/android/gms/b/ga;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/gb;->b:Lcom/google/android/gms/b/ga;

    return-object v0
.end method

.method public c()Ljava/util/concurrent/ScheduledExecutorService;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/gb;->a:Ljava/util/concurrent/ScheduledExecutorService;

    return-object v0
.end method

.method public d()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/b/gb;->d:Z

    return v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/gb;->e:Ljava/lang/String;

    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/gb;->f:Ljava/lang/String;

    return-object v0
.end method
