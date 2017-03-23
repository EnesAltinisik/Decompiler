.class Lcom/google/android/gms/internal/zzafc$12;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/zzaem;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzafc;->zza(Lcom/google/android/gms/internal/zzafa;Ljava/util/Map;Lcom/google/firebase/database/DatabaseReference$CompletionListener;Ljava/util/Map;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/zzafa;

.field final synthetic b:Ljava/util/Map;

.field final synthetic c:Lcom/google/firebase/database/DatabaseReference$CompletionListener;

.field final synthetic d:Lcom/google/android/gms/internal/zzafc;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzafc;Lcom/google/android/gms/internal/zzafa;Ljava/util/Map;Lcom/google/firebase/database/DatabaseReference$CompletionListener;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzafc$12;->d:Lcom/google/android/gms/internal/zzafc;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzafc$12;->a:Lcom/google/android/gms/internal/zzafa;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzafc$12;->b:Ljava/util/Map;

    iput-object p4, p0, Lcom/google/android/gms/internal/zzafc$12;->c:Lcom/google/firebase/database/DatabaseReference$CompletionListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public zzaj(Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/zzafc;->zzal(Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/database/DatabaseError;

    move-result-object v2

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc$12;->d:Lcom/google/android/gms/internal/zzafc;

    const-string v1, "onDisconnect().updateChildren"

    iget-object v3, p0, Lcom/google/android/gms/internal/zzafc$12;->a:Lcom/google/android/gms/internal/zzafa;

    invoke-static {v0, v1, v3, v2}, Lcom/google/android/gms/internal/zzafc;->zza(Lcom/google/android/gms/internal/zzafc;Ljava/lang/String;Lcom/google/android/gms/internal/zzafa;Lcom/google/firebase/database/DatabaseError;)V

    if-nez v2, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc$12;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafc$12;->d:Lcom/google/android/gms/internal/zzafc;

    invoke-static {v1}, Lcom/google/android/gms/internal/zzafc;->zzf(Lcom/google/android/gms/internal/zzafc;)Lcom/google/android/gms/internal/zzafh;

    move-result-object v4

    iget-object v5, p0, Lcom/google/android/gms/internal/zzafc$12;->a:Lcom/google/android/gms/internal/zzafa;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/zzafa;

    invoke-virtual {v5, v1}, Lcom/google/android/gms/internal/zzafa;->zzh(Lcom/google/android/gms/internal/zzafa;)Lcom/google/android/gms/internal/zzafa;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzahu;

    invoke-virtual {v4, v1, v0}, Lcom/google/android/gms/internal/zzafh;->a(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zzafc$12;->d:Lcom/google/android/gms/internal/zzafc;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafc$12;->c:Lcom/google/firebase/database/DatabaseReference$CompletionListener;

    iget-object v3, p0, Lcom/google/android/gms/internal/zzafc$12;->a:Lcom/google/android/gms/internal/zzafa;

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/zzafc;->zza(Lcom/google/firebase/database/DatabaseReference$CompletionListener;Lcom/google/firebase/database/DatabaseError;Lcom/google/android/gms/internal/zzafa;)V

    return-void
.end method
