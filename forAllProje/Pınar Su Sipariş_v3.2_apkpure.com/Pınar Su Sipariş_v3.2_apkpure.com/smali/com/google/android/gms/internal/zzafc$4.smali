.class Lcom/google/android/gms/internal/zzafc$4;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/zzaeq$zzb;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzafc;->zzRy()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/zzafc;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzafc;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzafc$4;->a:Lcom/google/android/gms/internal/zzafc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public zzQL()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc$4;->a:Lcom/google/android/gms/internal/zzafc;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzafc;->zzb(Lcom/google/android/gms/internal/zzafc;)Lcom/google/android/gms/internal/zzahf;

    move-result-object v0

    const-string v1, "Auth token changed, triggering auth token refresh"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/zzahf;->zzh(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc$4;->a:Lcom/google/android/gms/internal/zzafc;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzafc;->zzc(Lcom/google/android/gms/internal/zzafc;)Lcom/google/android/gms/internal/zzaej;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/zzaej;->refreshAuthToken()V

    return-void
.end method
