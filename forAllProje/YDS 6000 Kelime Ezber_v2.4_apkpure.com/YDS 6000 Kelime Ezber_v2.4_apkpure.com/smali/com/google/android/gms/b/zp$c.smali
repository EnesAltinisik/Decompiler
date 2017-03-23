.class Lcom/google/android/gms/b/zp$c;
.super Lcom/google/android/gms/b/aad;

# interfaces
.implements Lcom/google/android/gms/b/vx$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/b/zp;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/android/gms/b/aad",
        "<TT;>;",
        "Lcom/google/android/gms/b/vx$b",
        "<TT;>;"
    }
.end annotation


# direct methods
.method private constructor <init>(Lcom/google/android/gms/b/zp;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/b/aad;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/b/zp;Lcom/google/android/gms/b/zp$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/b/zp$c;-><init>(Lcom/google/android/gms/b/zp;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/google/android/gms/b/aad;->b(Ljava/lang/Object;)V

    return-void
.end method
