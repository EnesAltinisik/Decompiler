.class final Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl$5;
.super Lcom/google/firebase/database/connection/idl/zze$zza;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl;->zza(Lcom/google/android/gms/internal/zzaee;)Lcom/google/firebase/database/connection/idl/zze;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/zzaee;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzaee;)V
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl$5;->a:Lcom/google/android/gms/internal/zzaee;

    invoke-direct {p0}, Lcom/google/firebase/database/connection/idl/zze$zza;-><init>()V

    return-void
.end method


# virtual methods
.method public zza(ZLcom/google/firebase/database/connection/idl/zzf;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl$5;->a:Lcom/google/android/gms/internal/zzaee;

    new-instance v1, Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl$5$1;

    invoke-direct {v1, p0, p2}, Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl$5$1;-><init>(Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl$5;Lcom/google/firebase/database/connection/idl/zzf;)V

    invoke-interface {v0, p1, v1}, Lcom/google/android/gms/internal/zzaee;->zza(ZLcom/google/android/gms/internal/zzaee$zza;)V

    return-void
.end method
