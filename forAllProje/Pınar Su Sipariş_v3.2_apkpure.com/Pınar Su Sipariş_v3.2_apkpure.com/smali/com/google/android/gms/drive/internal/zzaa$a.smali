.class Lcom/google/android/gms/drive/internal/zzaa$a;
.super Lcom/google/android/gms/drive/internal/zzd;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/drive/internal/zzaa;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/drive/internal/zzaa;

.field private final b:Lcom/google/android/gms/internal/zznt$zzb;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/zznt$zzb",
            "<",
            "Lcom/google/android/gms/drive/DrivePreferencesApi$FileUploadPreferencesResult;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/google/android/gms/drive/internal/zzaa;Lcom/google/android/gms/internal/zznt$zzb;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zznt$zzb",
            "<",
            "Lcom/google/android/gms/drive/DrivePreferencesApi$FileUploadPreferencesResult;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/android/gms/drive/internal/zzaa$a;->a:Lcom/google/android/gms/drive/internal/zzaa;

    invoke-direct {p0}, Lcom/google/android/gms/drive/internal/zzd;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/drive/internal/zzaa$a;->b:Lcom/google/android/gms/internal/zznt$zzb;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/drive/internal/zzaa;Lcom/google/android/gms/internal/zznt$zzb;Lcom/google/android/gms/drive/internal/zzaa$1;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/drive/internal/zzaa$a;-><init>(Lcom/google/android/gms/drive/internal/zzaa;Lcom/google/android/gms/internal/zznt$zzb;)V

    return-void
.end method


# virtual methods
.method public onError(Lcom/google/android/gms/common/api/Status;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const/4 v3, 0x0

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/zzaa$a;->b:Lcom/google/android/gms/internal/zznt$zzb;

    new-instance v1, Lcom/google/android/gms/drive/internal/zzaa$b;

    iget-object v2, p0, Lcom/google/android/gms/drive/internal/zzaa$a;->a:Lcom/google/android/gms/drive/internal/zzaa;

    invoke-direct {v1, v2, p1, v3, v3}, Lcom/google/android/gms/drive/internal/zzaa$b;-><init>(Lcom/google/android/gms/drive/internal/zzaa;Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/drive/FileUploadPreferences;Lcom/google/android/gms/drive/internal/zzaa$1;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/zznt$zzb;->setResult(Ljava/lang/Object;)V

    return-void
.end method

.method public zza(Lcom/google/android/gms/drive/internal/OnDeviceUsagePreferenceResponse;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/zzaa$a;->b:Lcom/google/android/gms/internal/zznt$zzb;

    new-instance v1, Lcom/google/android/gms/drive/internal/zzaa$b;

    iget-object v2, p0, Lcom/google/android/gms/drive/internal/zzaa$a;->a:Lcom/google/android/gms/drive/internal/zzaa;

    sget-object v3, Lcom/google/android/gms/common/api/Status;->zzalw:Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p1}, Lcom/google/android/gms/drive/internal/OnDeviceUsagePreferenceResponse;->zzwv()Lcom/google/android/gms/drive/internal/FileUploadPreferencesImpl;

    move-result-object v4

    const/4 v5, 0x0

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/google/android/gms/drive/internal/zzaa$b;-><init>(Lcom/google/android/gms/drive/internal/zzaa;Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/drive/FileUploadPreferences;Lcom/google/android/gms/drive/internal/zzaa$1;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/zznt$zzb;->setResult(Ljava/lang/Object;)V

    return-void
.end method
