.class Lcom/google/firebase/storage/StorageTask$4;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/firebase/storage/zze$zza;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/firebase/storage/StorageTask;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/firebase/storage/zze$zza",
        "<",
        "Lcom/google/firebase/storage/OnPausedListener",
        "<-TTResult;>;TTResult;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/firebase/storage/StorageTask;


# direct methods
.method constructor <init>(Lcom/google/firebase/storage/StorageTask;)V
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/storage/StorageTask$4;->a:Lcom/google/firebase/storage/StorageTask;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/firebase/storage/OnPausedListener;Lcom/google/firebase/storage/StorageTask$ProvideError;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/storage/OnPausedListener",
            "<-TTResult;>;TTResult;)V"
        }
    .end annotation

    invoke-interface {p1, p2}, Lcom/google/firebase/storage/OnPausedListener;->onPaused(Ljava/lang/Object;)V

    return-void
.end method

.method public synthetic zzl(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/firebase/storage/OnPausedListener;

    check-cast p2, Lcom/google/firebase/storage/StorageTask$ProvideError;

    invoke-virtual {p0, p1, p2}, Lcom/google/firebase/storage/StorageTask$4;->a(Lcom/google/firebase/storage/OnPausedListener;Lcom/google/firebase/storage/StorageTask$ProvideError;)V

    return-void
.end method
