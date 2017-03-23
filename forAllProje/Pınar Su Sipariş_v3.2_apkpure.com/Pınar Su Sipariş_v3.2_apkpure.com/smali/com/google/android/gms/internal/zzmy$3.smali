.class Lcom/google/android/gms/internal/zzmy$3;
.super Lcom/google/android/gms/internal/zzmy$zza;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzmy;->sendGameRequest(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lorg/json/JSONObject;

.field final synthetic c:Lcom/google/android/gms/internal/zzmy;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzmy;Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzmy$3;->c:Lcom/google/android/gms/internal/zzmy;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzmy$3;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzmy$3;->b:Lorg/json/JSONObject;

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzmy$zza;-><init>(Lcom/google/android/gms/internal/zzmy;)V

    return-void
.end method


# virtual methods
.method public execute()V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/zzmy$3;->c:Lcom/google/android/gms/internal/zzmy;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzmy$3;->a:Ljava/lang/String;

    const/4 v2, 0x6

    iget-object v3, p0, Lcom/google/android/gms/internal/zzmy$3;->b:Lorg/json/JSONObject;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zzmy$3;->zzqf()Lcom/google/android/gms/cast/internal/zzo;

    move-result-object v4

    invoke-static {v0, v1, v2, v3, v4}, Lcom/google/android/gms/internal/zzmy;->zza(Lcom/google/android/gms/internal/zzmy;Ljava/lang/String;ILorg/json/JSONObject;Lcom/google/android/gms/cast/internal/zzo;)V

    return-void
.end method
