.class public abstract Lcom/google/android/gms/b/hu;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/b/hu$a;
    }
.end annotation


# instance fields
.field protected final b:Lcom/google/android/gms/b/hu$a;

.field protected final c:Lcom/google/android/gms/b/hv;

.field protected final d:Lcom/google/android/gms/b/gx;


# direct methods
.method protected constructor <init>(Lcom/google/android/gms/b/hu$a;Lcom/google/android/gms/b/hv;Lcom/google/android/gms/b/gx;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/b/hu;->b:Lcom/google/android/gms/b/hu$a;

    iput-object p2, p0, Lcom/google/android/gms/b/hu;->c:Lcom/google/android/gms/b/hv;

    iput-object p3, p0, Lcom/google/android/gms/b/hu;->d:Lcom/google/android/gms/b/gx;

    return-void
.end method


# virtual methods
.method public abstract a(Lcom/google/android/gms/b/je;)Lcom/google/android/gms/b/hu;
.end method

.method public c()Lcom/google/android/gms/b/gx;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/hu;->d:Lcom/google/android/gms/b/gx;

    return-object v0
.end method

.method public d()Lcom/google/android/gms/b/hv;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/hu;->c:Lcom/google/android/gms/b/hv;

    return-object v0
.end method

.method public e()Lcom/google/android/gms/b/hu$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/hu;->b:Lcom/google/android/gms/b/hu$a;

    return-object v0
.end method
