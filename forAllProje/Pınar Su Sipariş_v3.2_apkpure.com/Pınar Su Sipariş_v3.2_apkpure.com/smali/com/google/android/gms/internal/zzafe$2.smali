.class final Lcom/google/android/gms/internal/zzafe$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzafe;->zzl(Lcom/google/android/gms/internal/zzafc;)V
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

    iput-object p1, p0, Lcom/google/android/gms/internal/zzafe$2;->a:Lcom/google/android/gms/internal/zzafc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafe$2;->a:Lcom/google/android/gms/internal/zzafc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzafc;->resume()V

    return-void
.end method
