.class public final Lcom/google/android/gms/b/zs;
.super Lcom/google/android/gms/b/zd;


# annotations
.annotation runtime Lcom/google/android/gms/b/vz;
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/b/zz;

.field private final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/ads/internal/v;->e()Lcom/google/android/gms/b/zi;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/b/zi;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p3, v0}, Lcom/google/android/gms/b/zs;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/b/zd;-><init>()V

    new-instance v0, Lcom/google/android/gms/b/zz;

    invoke-direct {v0, p2}, Lcom/google/android/gms/b/zz;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/android/gms/b/zs;->a:Lcom/google/android/gms/b/zz;

    iput-object p1, p0, Lcom/google/android/gms/b/zs;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/b/zs;->a:Lcom/google/android/gms/b/zz;

    iget-object v1, p0, Lcom/google/android/gms/b/zs;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/b/zz;->a(Ljava/lang/String;)V

    return-void
.end method

.method public b()V
    .locals 0

    return-void
.end method
