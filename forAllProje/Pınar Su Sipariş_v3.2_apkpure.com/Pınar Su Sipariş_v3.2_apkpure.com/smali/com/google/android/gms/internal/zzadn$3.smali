.class Lcom/google/android/gms/internal/zzadn$3;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/firebase/FirebaseApp$zza;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzadn;->zza(Lcom/google/android/gms/internal/zzaeq$zzb;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/zzaeq$zzb;

.field final synthetic b:Lcom/google/android/gms/internal/zzadn;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzadn;Lcom/google/android/gms/internal/zzaeq$zzb;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzadn$3;->b:Lcom/google/android/gms/internal/zzadn;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzadn$3;->a:Lcom/google/android/gms/internal/zzaeq$zzb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public zzb(Lcom/google/android/gms/internal/zzaja;Lcom/google/firebase/auth/FirebaseUser;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzadn$3;->b:Lcom/google/android/gms/internal/zzadn;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzadn;->zza(Lcom/google/android/gms/internal/zzadn;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/zzadn$3$1;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/zzadn$3$1;-><init>(Lcom/google/android/gms/internal/zzadn$3;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
