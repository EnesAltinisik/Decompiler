.class Lcom/google/android/gms/internal/zzafc$8;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzafc;->zza(Lcom/google/android/gms/internal/zzagk;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/zzafc$a;

.field final synthetic b:Lcom/google/firebase/database/DatabaseError;

.field final synthetic c:Lcom/google/android/gms/internal/zzafc;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzafc;Lcom/google/android/gms/internal/zzafc$a;Lcom/google/firebase/database/DatabaseError;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzafc$8;->c:Lcom/google/android/gms/internal/zzafc;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzafc$8;->a:Lcom/google/android/gms/internal/zzafc$a;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzafc$8;->b:Lcom/google/firebase/database/DatabaseError;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc$8;->a:Lcom/google/android/gms/internal/zzafc$a;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzafc$a;->i(Lcom/google/android/gms/internal/zzafc$a;)Lcom/google/firebase/database/Transaction$Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafc$8;->b:Lcom/google/firebase/database/DatabaseError;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-interface {v0, v1, v2, v3}, Lcom/google/firebase/database/Transaction$Handler;->onComplete(Lcom/google/firebase/database/DatabaseError;ZLcom/google/firebase/database/DataSnapshot;)V

    return-void
.end method
