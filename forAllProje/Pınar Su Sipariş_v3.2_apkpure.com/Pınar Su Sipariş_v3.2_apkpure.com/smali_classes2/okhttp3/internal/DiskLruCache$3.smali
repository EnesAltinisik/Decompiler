.class Lokhttp3/internal/DiskLruCache$3;
.super Ljava/lang/Object;
.source "DiskLruCache.java"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lokhttp3/internal/DiskLruCache;->snapshots()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator",
        "<",
        "Lokhttp3/internal/DiskLruCache$Snapshot;",
        ">;"
    }
.end annotation


# instance fields
.field final delegate:Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator",
            "<",
            "Lokhttp3/internal/DiskLruCache$Entry;",
            ">;"
        }
    .end annotation
.end field

.field nextSnapshot:Lokhttp3/internal/DiskLruCache$Snapshot;

.field removeSnapshot:Lokhttp3/internal/DiskLruCache$Snapshot;

.field final synthetic this$0:Lokhttp3/internal/DiskLruCache;


# direct methods
.method constructor <init>(Lokhttp3/internal/DiskLruCache;)V
    .locals 2

    .prologue
    .line 706
    iput-object p1, p0, Lokhttp3/internal/DiskLruCache$3;->this$0:Lokhttp3/internal/DiskLruCache;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 708
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lokhttp3/internal/DiskLruCache$3;->this$0:Lokhttp3/internal/DiskLruCache;

    # getter for: Lokhttp3/internal/DiskLruCache;->lruEntries:Ljava/util/LinkedHashMap;
    invoke-static {v1}, Lokhttp3/internal/DiskLruCache;->access$2000(Lokhttp3/internal/DiskLruCache;)Ljava/util/LinkedHashMap;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/internal/DiskLruCache$3;->delegate:Ljava/util/Iterator;

    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 717
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache$3;->nextSnapshot:Lokhttp3/internal/DiskLruCache$Snapshot;

    if-eqz v0, :cond_0

    move v0, v1

    .line 732
    :goto_0
    return v0

    .line 719
    :cond_0
    iget-object v3, p0, Lokhttp3/internal/DiskLruCache$3;->this$0:Lokhttp3/internal/DiskLruCache;

    monitor-enter v3

    .line 721
    :try_start_0
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache$3;->this$0:Lokhttp3/internal/DiskLruCache;

    # getter for: Lokhttp3/internal/DiskLruCache;->closed:Z
    invoke-static {v0}, Lokhttp3/internal/DiskLruCache;->access$100(Lokhttp3/internal/DiskLruCache;)Z

    move-result v0

    if-eqz v0, :cond_1

    monitor-exit v3

    move v0, v2

    goto :goto_0

    .line 723
    :cond_1
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache$3;->delegate:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 724
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache$3;->delegate:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lokhttp3/internal/DiskLruCache$Entry;

    .line 725
    invoke-virtual {v0}, Lokhttp3/internal/DiskLruCache$Entry;->snapshot()Lokhttp3/internal/DiskLruCache$Snapshot;

    move-result-object v0

    .line 726
    if-eqz v0, :cond_1

    .line 727
    iput-object v0, p0, Lokhttp3/internal/DiskLruCache$3;->nextSnapshot:Lokhttp3/internal/DiskLruCache$Snapshot;

    .line 728
    monitor-exit v3

    move v0, v1

    goto :goto_0

    .line 730
    :cond_2
    monitor-exit v3

    move v0, v2

    .line 732
    goto :goto_0

    .line 730
    :catchall_0
    move-exception v0

    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 706
    invoke-virtual {p0}, Lokhttp3/internal/DiskLruCache$3;->next()Lokhttp3/internal/DiskLruCache$Snapshot;

    move-result-object v0

    return-object v0
.end method

.method public next()Lokhttp3/internal/DiskLruCache$Snapshot;
    .locals 1

    .prologue
    .line 736
    invoke-virtual {p0}, Lokhttp3/internal/DiskLruCache$3;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    .line 737
    :cond_0
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache$3;->nextSnapshot:Lokhttp3/internal/DiskLruCache$Snapshot;

    iput-object v0, p0, Lokhttp3/internal/DiskLruCache$3;->removeSnapshot:Lokhttp3/internal/DiskLruCache$Snapshot;

    .line 738
    const/4 v0, 0x0

    iput-object v0, p0, Lokhttp3/internal/DiskLruCache$3;->nextSnapshot:Lokhttp3/internal/DiskLruCache$Snapshot;

    .line 739
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache$3;->removeSnapshot:Lokhttp3/internal/DiskLruCache$Snapshot;

    return-object v0
.end method

.method public remove()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 743
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache$3;->removeSnapshot:Lokhttp3/internal/DiskLruCache$Snapshot;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "remove() before next()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 745
    :cond_0
    :try_start_0
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache$3;->this$0:Lokhttp3/internal/DiskLruCache;

    iget-object v1, p0, Lokhttp3/internal/DiskLruCache$3;->removeSnapshot:Lokhttp3/internal/DiskLruCache$Snapshot;

    # getter for: Lokhttp3/internal/DiskLruCache$Snapshot;->key:Ljava/lang/String;
    invoke-static {v1}, Lokhttp3/internal/DiskLruCache$Snapshot;->access$2100(Lokhttp3/internal/DiskLruCache$Snapshot;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lokhttp3/internal/DiskLruCache;->remove(Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 750
    iput-object v2, p0, Lokhttp3/internal/DiskLruCache$3;->removeSnapshot:Lokhttp3/internal/DiskLruCache$Snapshot;

    .line 752
    :goto_0
    return-void

    .line 746
    :catch_0
    move-exception v0

    .line 750
    iput-object v2, p0, Lokhttp3/internal/DiskLruCache$3;->removeSnapshot:Lokhttp3/internal/DiskLruCache$Snapshot;

    goto :goto_0

    :catchall_0
    move-exception v0

    iput-object v2, p0, Lokhttp3/internal/DiskLruCache$3;->removeSnapshot:Lokhttp3/internal/DiskLruCache$Snapshot;

    throw v0
.end method
