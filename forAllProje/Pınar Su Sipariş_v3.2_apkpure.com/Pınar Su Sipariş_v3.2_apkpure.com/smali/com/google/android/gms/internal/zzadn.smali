.class public Lcom/google/android/gms/internal/zzadn;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/zzaeq;


# instance fields
.field private final zzbHI:Ljava/util/concurrent/ScheduledExecutorService;

.field private final zzbHJ:Lcom/google/firebase/FirebaseApp;


# direct methods
.method public constructor <init>(Lcom/google/firebase/FirebaseApp;Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zzadn;->zzbHJ:Lcom/google/firebase/FirebaseApp;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzadn;->zzbHI:Ljava/util/concurrent/ScheduledExecutorService;

    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/zzadn;)Ljava/util/concurrent/ScheduledExecutorService;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzadn;->zzbHI:Ljava/util/concurrent/ScheduledExecutorService;

    return-object v0
.end method


# virtual methods
.method public zza(Lcom/google/android/gms/internal/zzaeq$zzb;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzadn;->zzbHJ:Lcom/google/firebase/FirebaseApp;

    new-instance v1, Lcom/google/android/gms/internal/zzadn$3;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/zzadn$3;-><init>(Lcom/google/android/gms/internal/zzadn;Lcom/google/android/gms/internal/zzaeq$zzb;)V

    invoke-virtual {v0, v1}, Lcom/google/firebase/FirebaseApp;->zza(Lcom/google/firebase/FirebaseApp$zza;)V

    return-void
.end method

.method public zza(ZLcom/google/android/gms/internal/zzaeq$zza;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzadn;->zzbHJ:Lcom/google/firebase/FirebaseApp;

    invoke-virtual {v0, p1}, Lcom/google/firebase/FirebaseApp;->getToken(Z)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzadn;->zzbHI:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v2, Lcom/google/android/gms/internal/zzadn$2;

    invoke-direct {v2, p0, p2}, Lcom/google/android/gms/internal/zzadn$2;-><init>(Lcom/google/android/gms/internal/zzadn;Lcom/google/android/gms/internal/zzaeq$zza;)V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzadn;->zzbHI:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v2, Lcom/google/android/gms/internal/zzadn$1;

    invoke-direct {v2, p0, p2}, Lcom/google/android/gms/internal/zzadn$1;-><init>(Lcom/google/android/gms/internal/zzadn;Lcom/google/android/gms/internal/zzaeq$zza;)V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method
