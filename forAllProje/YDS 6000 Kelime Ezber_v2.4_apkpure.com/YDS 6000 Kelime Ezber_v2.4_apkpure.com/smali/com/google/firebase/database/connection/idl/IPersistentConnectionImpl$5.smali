.class final Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl$5;
.super Lcom/google/firebase/database/connection/idl/h$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl;->a(Lcom/google/android/gms/b/ga;)Lcom/google/firebase/database/connection/idl/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/b/ga;


# direct methods
.method constructor <init>(Lcom/google/android/gms/b/ga;)V
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl$5;->a:Lcom/google/android/gms/b/ga;

    invoke-direct {p0}, Lcom/google/firebase/database/connection/idl/h$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ZLcom/google/firebase/database/connection/idl/i;)V
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl$5;->a:Lcom/google/android/gms/b/ga;

    new-instance v1, Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl$5$1;

    invoke-direct {v1, p0, p2}, Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl$5$1;-><init>(Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl$5;Lcom/google/firebase/database/connection/idl/i;)V

    invoke-interface {v0, p1, v1}, Lcom/google/android/gms/b/ga;->a(ZLcom/google/android/gms/b/ga$a;)V

    return-void
.end method
