.class public Lcom/google/android/gms/b/ya;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/b/vz;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/b/ya$a;
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:I

.field public final d:J


# direct methods
.method private constructor <init>(Lcom/google/android/gms/b/ya$a;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/b/ya$a;->a(Lcom/google/android/gms/b/ya$a;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/ya;->a:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/gms/b/ya$a;->b(Lcom/google/android/gms/b/ya$a;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/ya;->b:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/gms/b/ya$a;->c(Lcom/google/android/gms/b/ya$a;)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/b/ya;->c:I

    invoke-static {p1}, Lcom/google/android/gms/b/ya$a;->d(Lcom/google/android/gms/b/ya$a;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/b/ya;->d:J

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/b/ya$a;Lcom/google/android/gms/b/ya$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/b/ya;-><init>(Lcom/google/android/gms/b/ya$a;)V

    return-void
.end method
