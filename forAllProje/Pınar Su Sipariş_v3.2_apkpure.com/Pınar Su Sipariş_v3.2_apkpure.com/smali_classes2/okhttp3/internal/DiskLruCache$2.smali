.class Lokhttp3/internal/DiskLruCache$2;
.super Lokhttp3/internal/FaultHidingSink;
.source "DiskLruCache.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lokhttp3/internal/DiskLruCache;->newJournalWriter()Lb/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z


# instance fields
.field final synthetic this$0:Lokhttp3/internal/DiskLruCache;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 299
    const-class v0, Lokhttp3/internal/DiskLruCache;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lokhttp3/internal/DiskLruCache$2;->$assertionsDisabled:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method constructor <init>(Lokhttp3/internal/DiskLruCache;Lb/r;)V
    .locals 0

    .prologue
    .line 299
    iput-object p1, p0, Lokhttp3/internal/DiskLruCache$2;->this$0:Lokhttp3/internal/DiskLruCache;

    invoke-direct {p0, p2}, Lokhttp3/internal/FaultHidingSink;-><init>(Lb/r;)V

    return-void
.end method


# virtual methods
.method protected onException(Ljava/io/IOException;)V
    .locals 2

    .prologue
    .line 301
    sget-boolean v0, Lokhttp3/internal/DiskLruCache$2;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lokhttp3/internal/DiskLruCache$2;->this$0:Lokhttp3/internal/DiskLruCache;

    invoke-static {v0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 302
    :cond_0
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache$2;->this$0:Lokhttp3/internal/DiskLruCache;

    const/4 v1, 0x1

    # setter for: Lokhttp3/internal/DiskLruCache;->hasJournalErrors:Z
    invoke-static {v0, v1}, Lokhttp3/internal/DiskLruCache;->access$602(Lokhttp3/internal/DiskLruCache;Z)Z

    .line 303
    return-void
.end method
