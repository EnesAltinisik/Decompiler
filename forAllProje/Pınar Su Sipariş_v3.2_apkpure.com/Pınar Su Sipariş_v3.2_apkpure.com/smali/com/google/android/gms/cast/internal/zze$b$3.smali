.class Lcom/google/android/gms/cast/internal/zze$b$3;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/cast/internal/zze$b;->zzb(Lcom/google/android/gms/cast/internal/ApplicationStatus;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/cast/internal/zze;

.field final synthetic b:Lcom/google/android/gms/cast/internal/ApplicationStatus;

.field final synthetic c:Lcom/google/android/gms/cast/internal/zze$b;


# direct methods
.method constructor <init>(Lcom/google/android/gms/cast/internal/zze$b;Lcom/google/android/gms/cast/internal/zze;Lcom/google/android/gms/cast/internal/ApplicationStatus;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/cast/internal/zze$b$3;->c:Lcom/google/android/gms/cast/internal/zze$b;

    iput-object p2, p0, Lcom/google/android/gms/cast/internal/zze$b$3;->a:Lcom/google/android/gms/cast/internal/zze;

    iput-object p3, p0, Lcom/google/android/gms/cast/internal/zze$b$3;->b:Lcom/google/android/gms/cast/internal/ApplicationStatus;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/cast/internal/zze$b$3;->a:Lcom/google/android/gms/cast/internal/zze;

    iget-object v1, p0, Lcom/google/android/gms/cast/internal/zze$b$3;->b:Lcom/google/android/gms/cast/internal/ApplicationStatus;

    invoke-static {v0, v1}, Lcom/google/android/gms/cast/internal/zze;->zza(Lcom/google/android/gms/cast/internal/zze;Lcom/google/android/gms/cast/internal/ApplicationStatus;)V

    return-void
.end method
