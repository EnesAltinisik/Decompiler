.class Lcom/google/android/gms/internal/zztt$b$1;
.super Lcom/google/android/gms/internal/zztt$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zztt$b;->a(Lcom/google/android/gms/internal/zzts;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/zztt$b;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zztt$b;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zztt$b$1;->a:Lcom/google/android/gms/internal/zztt$b;

    invoke-direct {p0}, Lcom/google/android/gms/internal/zztt$a;-><init>()V

    return-void
.end method


# virtual methods
.method public zzbt(Lcom/google/android/gms/common/api/Status;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zztt$b$1;->a:Lcom/google/android/gms/internal/zztt$b;

    invoke-static {v0}, Lcom/google/android/gms/internal/zztt$b;->a(Lcom/google/android/gms/internal/zztt$b;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "SearchAuth"

    const-string v1, "ClearTokenImpl success"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zztt$b$1;->a:Lcom/google/android/gms/internal/zztt$b;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zztt$b;->zzb(Lcom/google/android/gms/common/api/Result;)V

    return-void
.end method
