.class public Lcom/google/android/gms/b/fi;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/b/gm;


# instance fields
.field private final a:Ljava/util/concurrent/ScheduledExecutorService;

.field private final b:Lcom/google/firebase/b;


# direct methods
.method public constructor <init>(Lcom/google/firebase/b;Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/b/fi;->b:Lcom/google/firebase/b;

    iput-object p2, p0, Lcom/google/android/gms/b/fi;->a:Ljava/util/concurrent/ScheduledExecutorService;

    return-void
.end method

.method private b(Lcom/google/android/gms/b/gm$b;)Lcom/google/firebase/b$a;
    .locals 1

    new-instance v0, Lcom/google/android/gms/b/fi$3;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/b/fi$3;-><init>(Lcom/google/android/gms/b/fi;Lcom/google/android/gms/b/gm$b;)V

    return-object v0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/b/gm$b;)V
    .locals 2

    invoke-direct {p0, p1}, Lcom/google/android/gms/b/fi;->b(Lcom/google/android/gms/b/gm$b;)Lcom/google/firebase/b$a;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/b/fi;->b:Lcom/google/firebase/b;

    invoke-virtual {v1, v0}, Lcom/google/firebase/b;->a(Lcom/google/firebase/b$a;)V

    return-void
.end method

.method public a(ZLcom/google/android/gms/b/gm$a;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/b/fi;->b:Lcom/google/firebase/b;

    invoke-virtual {v0, p1}, Lcom/google/firebase/b;->b(Z)Lcom/google/android/gms/c/d;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/b/fi;->a:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v2, Lcom/google/android/gms/b/fi$2;

    invoke-direct {v2, p0, p2}, Lcom/google/android/gms/b/fi$2;-><init>(Lcom/google/android/gms/b/fi;Lcom/google/android/gms/b/gm$a;)V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/c/d;->a(Ljava/util/concurrent/Executor;Lcom/google/android/gms/c/b;)Lcom/google/android/gms/c/d;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/b/fi;->a:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v2, Lcom/google/android/gms/b/fi$1;

    invoke-direct {v2, p0, p2}, Lcom/google/android/gms/b/fi$1;-><init>(Lcom/google/android/gms/b/fi;Lcom/google/android/gms/b/gm$a;)V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/c/d;->a(Ljava/util/concurrent/Executor;Lcom/google/android/gms/c/a;)Lcom/google/android/gms/c/d;

    return-void
.end method
