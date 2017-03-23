.class Lcom/google/firebase/database/DatabaseReference$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/firebase/database/DatabaseReference;->zza(Ljava/lang/Object;Lcom/google/android/gms/internal/zzahu;Lcom/google/firebase/database/DatabaseReference$CompletionListener;)Lcom/google/android/gms/tasks/Task;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/zzahu;

.field final synthetic b:Lcom/google/android/gms/internal/zzais;

.field final synthetic c:Lcom/google/firebase/database/DatabaseReference;


# direct methods
.method constructor <init>(Lcom/google/firebase/database/DatabaseReference;Lcom/google/android/gms/internal/zzahu;Lcom/google/android/gms/internal/zzais;)V
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/database/DatabaseReference$1;->c:Lcom/google/firebase/database/DatabaseReference;

    iput-object p2, p0, Lcom/google/firebase/database/DatabaseReference$1;->a:Lcom/google/android/gms/internal/zzahu;

    iput-object p3, p0, Lcom/google/firebase/database/DatabaseReference$1;->b:Lcom/google/android/gms/internal/zzais;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lcom/google/firebase/database/DatabaseReference$1;->c:Lcom/google/firebase/database/DatabaseReference;

    iget-object v1, v0, Lcom/google/firebase/database/DatabaseReference;->zzbHo:Lcom/google/android/gms/internal/zzafc;

    iget-object v0, p0, Lcom/google/firebase/database/DatabaseReference$1;->c:Lcom/google/firebase/database/DatabaseReference;

    invoke-virtual {v0}, Lcom/google/firebase/database/DatabaseReference;->zzPn()Lcom/google/android/gms/internal/zzafa;

    move-result-object v2

    iget-object v3, p0, Lcom/google/firebase/database/DatabaseReference$1;->a:Lcom/google/android/gms/internal/zzahu;

    iget-object v0, p0, Lcom/google/firebase/database/DatabaseReference$1;->b:Lcom/google/android/gms/internal/zzais;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzais;->zzUj()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/database/DatabaseReference$CompletionListener;

    invoke-virtual {v1, v2, v3, v0}, Lcom/google/android/gms/internal/zzafc;->zza(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;Lcom/google/firebase/database/DatabaseReference$CompletionListener;)V

    return-void
.end method
