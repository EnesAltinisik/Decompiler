.class Lcom/google/android/gms/internal/zzafc$16;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/zzaem;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzafc;->zzb(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;Lcom/google/firebase/database/DatabaseReference$CompletionListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/zzafa;

.field final synthetic b:Lcom/google/android/gms/internal/zzahu;

.field final synthetic c:Lcom/google/firebase/database/DatabaseReference$CompletionListener;

.field final synthetic d:Lcom/google/android/gms/internal/zzafc;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzafc;Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;Lcom/google/firebase/database/DatabaseReference$CompletionListener;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zzafc$16;->d:Lcom/google/android/gms/internal/zzafc;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzafc$16;->a:Lcom/google/android/gms/internal/zzafa;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzafc$16;->b:Lcom/google/android/gms/internal/zzahu;

    iput-object p4, p0, Lcom/google/android/gms/internal/zzafc$16;->c:Lcom/google/firebase/database/DatabaseReference$CompletionListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public zzaj(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/zzafc;->zzal(Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/database/DatabaseError;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafc$16;->d:Lcom/google/android/gms/internal/zzafc;

    const-string v2, "onDisconnect().setValue"

    iget-object v3, p0, Lcom/google/android/gms/internal/zzafc$16;->a:Lcom/google/android/gms/internal/zzafa;

    invoke-static {v1, v2, v3, v0}, Lcom/google/android/gms/internal/zzafc;->zza(Lcom/google/android/gms/internal/zzafc;Ljava/lang/String;Lcom/google/android/gms/internal/zzafa;Lcom/google/firebase/database/DatabaseError;)V

    if-nez v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafc$16;->d:Lcom/google/android/gms/internal/zzafc;

    invoke-static {v1}, Lcom/google/android/gms/internal/zzafc;->zzf(Lcom/google/android/gms/internal/zzafc;)Lcom/google/android/gms/internal/zzafh;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/zzafc$16;->a:Lcom/google/android/gms/internal/zzafa;

    iget-object v3, p0, Lcom/google/android/gms/internal/zzafc$16;->b:Lcom/google/android/gms/internal/zzahu;

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/zzafh;->a(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;)V

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/zzafc$16;->d:Lcom/google/android/gms/internal/zzafc;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzafc$16;->c:Lcom/google/firebase/database/DatabaseReference$CompletionListener;

    iget-object v3, p0, Lcom/google/android/gms/internal/zzafc$16;->a:Lcom/google/android/gms/internal/zzafa;

    invoke-virtual {v1, v2, v0, v3}, Lcom/google/android/gms/internal/zzafc;->zza(Lcom/google/firebase/database/DatabaseReference$CompletionListener;Lcom/google/firebase/database/DatabaseError;Lcom/google/android/gms/internal/zzafa;)V

    return-void
.end method
