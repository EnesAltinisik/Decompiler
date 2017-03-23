.class public Lcom/google/android/gms/b/ws$a;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/b/zn;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/b/ws;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/b/zn",
        "<",
        "Lcom/google/android/gms/b/sr;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/b/sr;)V
    .locals 0

    invoke-static {p1}, Lcom/google/android/gms/b/ws;->b(Lcom/google/android/gms/b/sr;)V

    return-void
.end method

.method public synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/b/sr;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/b/ws$a;->a(Lcom/google/android/gms/b/sr;)V

    return-void
.end method
