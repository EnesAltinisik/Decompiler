.class Lcom/google/android/gms/internal/zzaen$b$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzaen$b;->zza(Lcom/google/android/gms/internal/zzaii;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/google/android/gms/internal/zzaen$b;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzaen$b;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzaen$b$2;->b:Lcom/google/android/gms/internal/zzaen$b;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzaen$b$2;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaen$b$2;->b:Lcom/google/android/gms/internal/zzaen$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/zzaen$b;->a:Lcom/google/android/gms/internal/zzaen;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzaen$b$2;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/zzaen;->a(Lcom/google/android/gms/internal/zzaen;Ljava/lang/String;)V

    return-void
.end method
