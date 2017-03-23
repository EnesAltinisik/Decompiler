.class Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/zzaei;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl;->listen(Ljava/util/List;Lcom/google/android/gms/dynamic/zzd;Lcom/google/firebase/database/connection/idl/zzg;JLcom/google/firebase/database/connection/idl/zzj;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/firebase/database/connection/idl/zzg;

.field final synthetic b:Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl;


# direct methods
.method constructor <init>(Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl;Lcom/google/firebase/database/connection/idl/zzg;)V
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl$1;->b:Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl;

    iput-object p2, p0, Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl$1;->a:Lcom/google/firebase/database/connection/idl/zzg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public zzPY()Ljava/lang/String;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl$1;->a:Lcom/google/firebase/database/connection/idl/zzg;

    invoke-interface {v0}, Lcom/google/firebase/database/connection/idl/zzg;->zzPY()Ljava/lang/String;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public zzPZ()Z
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl$1;->a:Lcom/google/firebase/database/connection/idl/zzg;

    invoke-interface {v0}, Lcom/google/firebase/database/connection/idl/zzg;->zzPZ()Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    return v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public zzQa()Lcom/google/android/gms/internal/zzaec;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl$1;->a:Lcom/google/firebase/database/connection/idl/zzg;

    invoke-interface {v0}, Lcom/google/firebase/database/connection/idl/zzg;->zzQF()Lcom/google/firebase/database/connection/idl/CompoundHashParcelable;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/database/connection/idl/CompoundHashParcelable;->a(Lcom/google/firebase/database/connection/idl/CompoundHashParcelable;)Lcom/google/android/gms/internal/zzaec;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method
