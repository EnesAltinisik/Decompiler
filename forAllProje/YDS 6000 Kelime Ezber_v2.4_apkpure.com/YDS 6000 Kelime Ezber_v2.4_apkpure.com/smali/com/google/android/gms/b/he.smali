.class public Lcom/google/android/gms/b/he;
.super Ljava/lang/Object;


# instance fields
.field private a:Lcom/google/android/gms/b/jr;


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcom/google/android/gms/b/jj;->f()Lcom/google/android/gms/b/jj;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/he;->a:Lcom/google/android/gms/b/jr;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/b/jr;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/b/he;->a:Lcom/google/android/gms/b/jr;

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/b/jr;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/he;->a:Lcom/google/android/gms/b/jr;

    return-object v0
.end method

.method public a(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/jr;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/he;->a:Lcom/google/android/gms/b/jr;

    invoke-interface {v0, p1}, Lcom/google/android/gms/b/jr;->a(Lcom/google/android/gms/b/gx;)Lcom/google/android/gms/b/jr;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/b/he;->a:Lcom/google/android/gms/b/jr;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/b/jr;->a(Lcom/google/android/gms/b/gx;Lcom/google/android/gms/b/jr;)Lcom/google/android/gms/b/jr;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/b/he;->a:Lcom/google/android/gms/b/jr;

    return-void
.end method
