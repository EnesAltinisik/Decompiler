.class public Lcom/google/android/gms/b/yg;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/b/vz;
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/b/to;

.field private final b:Lcom/google/android/gms/b/yd;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/b/to;Lcom/google/android/gms/b/yc;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/b/yg;->a:Lcom/google/android/gms/b/to;

    new-instance v0, Lcom/google/android/gms/b/yd;

    invoke-direct {v0, p2}, Lcom/google/android/gms/b/yd;-><init>(Lcom/google/android/gms/b/yc;)V

    iput-object v0, p0, Lcom/google/android/gms/b/yg;->b:Lcom/google/android/gms/b/yd;

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/b/to;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/yg;->a:Lcom/google/android/gms/b/to;

    return-object v0
.end method

.method public b()Lcom/google/android/gms/b/yd;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/yg;->b:Lcom/google/android/gms/b/yd;

    return-object v0
.end method
