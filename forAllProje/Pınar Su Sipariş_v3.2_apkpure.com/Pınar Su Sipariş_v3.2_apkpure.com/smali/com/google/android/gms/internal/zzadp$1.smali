.class Lcom/google/android/gms/internal/zzadp$1;
.super Lcom/google/android/gms/internal/zzaip;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzadp;->zzb(Lcom/google/android/gms/internal/zzaeu;)Lcom/google/firebase/database/RunLoop;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/zzahf;

.field final synthetic b:Lcom/google/android/gms/internal/zzadp;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzadp;Lcom/google/android/gms/internal/zzahf;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzadp$1;->b:Lcom/google/android/gms/internal/zzadp;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzadp$1;->a:Lcom/google/android/gms/internal/zzahf;

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzaip;-><init>()V

    return-void
.end method


# virtual methods
.method public zzh(Ljava/lang/Throwable;)V
    .locals 3

    invoke-static {}, Lcom/google/firebase/database/FirebaseDatabase;->getSdkVersion()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0x50

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Uncaught exception in Firebase runloop ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "). Please report to support@firebase.com"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzadp$1;->a:Lcom/google/android/gms/internal/zzahf;

    invoke-virtual {v1, v0, p1}, Lcom/google/android/gms/internal/zzahf;->zze(Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance v1, Landroid/os/Handler;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzadp$1;->b:Lcom/google/android/gms/internal/zzadp;

    invoke-static {v2}, Lcom/google/android/gms/internal/zzadp;->zza(Lcom/google/android/gms/internal/zzadp;)Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v2, Lcom/google/android/gms/internal/zzadp$1$1;

    invoke-direct {v2, p0, v0, p1}, Lcom/google/android/gms/internal/zzadp$1$1;-><init>(Lcom/google/android/gms/internal/zzadp$1;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
