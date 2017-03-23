.class final Lcom/google/android/gms/b/gq$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/b/ga;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/b/gq;->a(Lcom/google/android/gms/b/gm;)Lcom/google/android/gms/b/ga;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/b/gm;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/gm;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/b/gq$1;->a:Lcom/google/android/gms/b/gm;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ZLcom/google/android/gms/b/ga$a;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/b/gq$1;->a:Lcom/google/android/gms/b/gm;

    new-instance v1, Lcom/google/android/gms/b/gq$1$1;

    invoke-direct {v1, p0, p2}, Lcom/google/android/gms/b/gq$1$1;-><init>(Lcom/google/android/gms/b/gq$1;Lcom/google/android/gms/b/ga$a;)V

    invoke-interface {v0, p1, v1}, Lcom/google/android/gms/b/gm;->a(ZLcom/google/android/gms/b/gm$a;)V

    return-void
.end method
