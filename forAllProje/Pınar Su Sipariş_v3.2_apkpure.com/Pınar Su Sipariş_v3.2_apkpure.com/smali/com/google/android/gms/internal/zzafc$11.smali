.class Lcom/google/android/gms/internal/zzafc$11;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/zzaem;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzafc;->zza(Lcom/google/android/gms/internal/zzagd;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/zzafn;

.field final synthetic b:Lcom/google/android/gms/internal/zzafc;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzafc;Lcom/google/android/gms/internal/zzafn;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzafc$11;->b:Lcom/google/android/gms/internal/zzafc;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzafc$11;->a:Lcom/google/android/gms/internal/zzafn;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public zzaj(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/zzafc;->zzal(Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/database/DatabaseError;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafc$11;->b:Lcom/google/android/gms/internal/zzafc;

    const-string v2, "Persisted write"

    iget-object v3, p0, Lcom/google/android/gms/internal/zzafc$11;->a:Lcom/google/android/gms/internal/zzafn;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/zzafn;->zzPn()Lcom/google/android/gms/internal/zzafa;

    move-result-object v3

    invoke-static {v1, v2, v3, v0}, Lcom/google/android/gms/internal/zzafc;->zza(Lcom/google/android/gms/internal/zzafc;Ljava/lang/String;Lcom/google/android/gms/internal/zzafa;Lcom/google/firebase/database/DatabaseError;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafc$11;->b:Lcom/google/android/gms/internal/zzafc;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzafc$11;->a:Lcom/google/android/gms/internal/zzafn;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/zzafn;->zzRN()J

    move-result-wide v2

    iget-object v4, p0, Lcom/google/android/gms/internal/zzafc$11;->a:Lcom/google/android/gms/internal/zzafn;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/zzafn;->zzPn()Lcom/google/android/gms/internal/zzafa;

    move-result-object v4

    invoke-static {v1, v2, v3, v4, v0}, Lcom/google/android/gms/internal/zzafc;->zza(Lcom/google/android/gms/internal/zzafc;JLcom/google/android/gms/internal/zzafa;Lcom/google/firebase/database/DatabaseError;)V

    return-void
.end method
