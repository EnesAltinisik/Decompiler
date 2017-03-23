.class Lcom/google/android/gms/b/aak$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/b/aak;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field public final a:Lcom/google/android/gms/b/aaj$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/b/aaj$c",
            "<TT;>;"
        }
    .end annotation
.end field

.field public final b:Lcom/google/android/gms/b/aaj$a;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/b/aak;Lcom/google/android/gms/b/aaj$c;Lcom/google/android/gms/b/aaj$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/b/aaj$c",
            "<TT;>;",
            "Lcom/google/android/gms/b/aaj$a;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/b/aak$a;->a:Lcom/google/android/gms/b/aaj$c;

    iput-object p3, p0, Lcom/google/android/gms/b/aak$a;->b:Lcom/google/android/gms/b/aaj$a;

    return-void
.end method
