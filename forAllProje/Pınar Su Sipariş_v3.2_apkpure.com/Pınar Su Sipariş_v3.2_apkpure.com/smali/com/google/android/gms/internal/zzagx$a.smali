.class Lcom/google/android/gms/internal/zzagx$a;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/zzahb$zza;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/zzagx;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/zzafr;

.field private final b:Lcom/google/android/gms/internal/zzagw;

.field private final c:Lcom/google/android/gms/internal/zzahu;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzafr;Lcom/google/android/gms/internal/zzagw;Lcom/google/android/gms/internal/zzahu;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzagx$a;->a:Lcom/google/android/gms/internal/zzafr;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzagx$a;->b:Lcom/google/android/gms/internal/zzagw;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzagx$a;->c:Lcom/google/android/gms/internal/zzahu;

    return-void
.end method


# virtual methods
.method public zza(Lcom/google/android/gms/internal/zzaho;Lcom/google/android/gms/internal/zzaht;Z)Lcom/google/android/gms/internal/zzaht;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagx$a;->c:Lcom/google/android/gms/internal/zzahu;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagx$a;->c:Lcom/google/android/gms/internal/zzahu;

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/zzagx$a;->a:Lcom/google/android/gms/internal/zzafr;

    invoke-virtual {v1, v0, p2, p3, p1}, Lcom/google/android/gms/internal/zzafr;->zza(Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzaht;ZLcom/google/android/gms/internal/zzaho;)Lcom/google/android/gms/internal/zzaht;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzagx$a;->b:Lcom/google/android/gms/internal/zzagw;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagw;->zzSY()Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    goto :goto_0
.end method

.method public zzh(Lcom/google/android/gms/internal/zzahi;)Lcom/google/android/gms/internal/zzahu;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzagx$a;->b:Lcom/google/android/gms/internal/zzagw;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagw;->zzSV()Lcom/google/android/gms/internal/zzagm;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzagm;->zzf(Lcom/google/android/gms/internal/zzahi;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagm;->zzPj()Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/zzahu;->zzm(Lcom/google/android/gms/internal/zzahi;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzagx$a;->c:Lcom/google/android/gms/internal/zzahu;

    if-eqz v0, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/zzagm;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzagx$a;->c:Lcom/google/android/gms/internal/zzahu;

    invoke-static {}, Lcom/google/android/gms/internal/zzahq;->zzTH()Lcom/google/android/gms/internal/zzahq;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/zzahp;->zza(Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzaho;)Lcom/google/android/gms/internal/zzahp;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/internal/zzagm;-><init>(Lcom/google/android/gms/internal/zzahp;ZZ)V

    :goto_1
    iget-object v1, p0, Lcom/google/android/gms/internal/zzagx$a;->a:Lcom/google/android/gms/internal/zzafr;

    invoke-virtual {v1, p1, v0}, Lcom/google/android/gms/internal/zzafr;->zza(Lcom/google/android/gms/internal/zzahi;Lcom/google/android/gms/internal/zzagm;)Lcom/google/android/gms/internal/zzahu;

    move-result-object v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/zzagx$a;->b:Lcom/google/android/gms/internal/zzagw;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzagw;->zzSX()Lcom/google/android/gms/internal/zzagm;

    move-result-object v0

    goto :goto_1
.end method
