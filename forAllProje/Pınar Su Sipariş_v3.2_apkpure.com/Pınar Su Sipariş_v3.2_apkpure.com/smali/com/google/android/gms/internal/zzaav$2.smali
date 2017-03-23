.class Lcom/google/android/gms/internal/zzaav$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzaav;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/zzaap;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/google/android/gms/internal/zzaap;

.field final synthetic c:Lcom/google/android/gms/internal/zzaav;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzaav;Ljava/lang/String;Lcom/google/android/gms/internal/zzaap;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzaav$2;->c:Lcom/google/android/gms/internal/zzaav;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzaav$2;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzaav$2;->b:Lcom/google/android/gms/internal/zzaap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zzaav$2;->c:Lcom/google/android/gms/internal/zzaav;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzaav$2;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzaav$2;->b:Lcom/google/android/gms/internal/zzaap;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/zzaav;->zzb(Ljava/lang/String;Lcom/google/android/gms/internal/zzaap;)V

    return-void
.end method
