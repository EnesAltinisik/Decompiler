.class Lcom/google/android/gms/internal/g$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/ThreadFactory;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/g;-><init>(Ljava/util/concurrent/ThreadFactory;Lcom/google/android/gms/internal/zzafl;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/concurrent/ThreadFactory;

.field final synthetic b:Lcom/google/android/gms/internal/zzafl;

.field final synthetic c:Lcom/google/android/gms/internal/g;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/g;Ljava/util/concurrent/ThreadFactory;Lcom/google/android/gms/internal/zzafl;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/g$1;->c:Lcom/google/android/gms/internal/g;

    iput-object p2, p0, Lcom/google/android/gms/internal/g$1;->a:Ljava/util/concurrent/ThreadFactory;

    iput-object p3, p0, Lcom/google/android/gms/internal/g$1;->b:Lcom/google/android/gms/internal/zzafl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/g$1;->a:Ljava/util/concurrent/ThreadFactory;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ThreadFactory;->newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/g$1;->b:Lcom/google/android/gms/internal/zzafl;

    const-string v2, "FirebaseDatabaseEventTarget"

    invoke-interface {v1, v0, v2}, Lcom/google/android/gms/internal/zzafl;->zza(Ljava/lang/Thread;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/g$1;->b:Lcom/google/android/gms/internal/zzafl;

    const/4 v2, 0x1

    invoke-interface {v1, v0, v2}, Lcom/google/android/gms/internal/zzafl;->zza(Ljava/lang/Thread;Z)V

    return-object v0
.end method
