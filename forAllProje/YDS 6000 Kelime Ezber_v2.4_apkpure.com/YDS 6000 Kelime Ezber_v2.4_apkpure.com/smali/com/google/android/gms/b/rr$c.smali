.class Lcom/google/android/gms/b/rr$c;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/b/vz;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/b/rr;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/b/rr$d;

.field private final b:Z

.field private final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/b/rr;ZLcom/google/android/gms/b/rr$d;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p2, p0, Lcom/google/android/gms/b/rr$c;->b:Z

    iput-object p3, p0, Lcom/google/android/gms/b/rr$c;->a:Lcom/google/android/gms/b/rr$d;

    iput-object p4, p0, Lcom/google/android/gms/b/rr$c;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/rr$c;->c:Ljava/lang/String;

    return-object v0
.end method

.method public b()Lcom/google/android/gms/b/rr$d;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/rr$c;->a:Lcom/google/android/gms/b/rr$d;

    return-object v0
.end method

.method public c()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/b/rr$c;->b:Z

    return v0
.end method
