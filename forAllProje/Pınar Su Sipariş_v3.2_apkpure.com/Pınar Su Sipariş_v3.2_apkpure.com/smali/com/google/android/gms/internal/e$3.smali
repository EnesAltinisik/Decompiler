.class Lcom/google/android/gms/internal/e$3;
.super Lcom/google/android/gms/internal/zzaip;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/e;->zzb(Lcom/google/android/gms/internal/zzaeu;)Lcom/google/firebase/database/RunLoop;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/zzahf;

.field final synthetic b:Lcom/google/android/gms/internal/e;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/e;Lcom/google/android/gms/internal/zzahf;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/e$3;->b:Lcom/google/android/gms/internal/e;

    iput-object p2, p0, Lcom/google/android/gms/internal/e$3;->a:Lcom/google/android/gms/internal/zzahf;

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzaip;-><init>()V

    return-void
.end method


# virtual methods
.method protected getThreadFactory()Ljava/util/concurrent/ThreadFactory;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/e;->b:Ljava/util/concurrent/ThreadFactory;

    return-object v0
.end method

.method protected zzRp()Lcom/google/android/gms/internal/zzafl;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/e;->c:Lcom/google/android/gms/internal/zzafl;

    return-object v0
.end method

.method public zzh(Ljava/lang/Throwable;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/e$3;->a:Lcom/google/android/gms/internal/zzahf;

    invoke-static {}, Lcom/google/firebase/database/FirebaseDatabase;->getSdkVersion()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x59

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Uncaught exception in Firebase Database runloop ("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "). Please report to support@firebase.com"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/zzahf;->zze(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
