.class Lcom/google/firebase/database/Query$4;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/firebase/database/Query;->keepSynced(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lcom/google/firebase/database/Query;


# direct methods
.method constructor <init>(Lcom/google/firebase/database/Query;Z)V
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/database/Query$4;->b:Lcom/google/firebase/database/Query;

    iput-boolean p2, p0, Lcom/google/firebase/database/Query$4;->a:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/google/firebase/database/Query$4;->b:Lcom/google/firebase/database/Query;

    iget-object v0, v0, Lcom/google/firebase/database/Query;->zzbHo:Lcom/google/android/gms/internal/zzafc;

    iget-object v1, p0, Lcom/google/firebase/database/Query$4;->b:Lcom/google/firebase/database/Query;

    invoke-virtual {v1}, Lcom/google/firebase/database/Query;->zzPo()Lcom/google/android/gms/internal/zzagu;

    move-result-object v1

    iget-boolean v2, p0, Lcom/google/firebase/database/Query$4;->a:Z

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/zzafc;->zza(Lcom/google/android/gms/internal/zzagu;Z)V

    return-void
.end method
