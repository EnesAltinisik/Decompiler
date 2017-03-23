.class Lcom/google/android/gms/internal/zzafc$14;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/zzaem;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zzafc;->zza(Lcom/google/android/gms/internal/zzafa;Lcom/google/android/gms/internal/zzahu;Lcom/google/firebase/database/DatabaseReference$CompletionListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/zzafa;

.field final synthetic b:J

.field final synthetic c:Lcom/google/firebase/database/DatabaseReference$CompletionListener;

.field final synthetic d:Lcom/google/android/gms/internal/zzafc;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zzafc;Lcom/google/android/gms/internal/zzafa;JLcom/google/firebase/database/DatabaseReference$CompletionListener;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/internal/zzafc$14;->d:Lcom/google/android/gms/internal/zzafc;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzafc$14;->a:Lcom/google/android/gms/internal/zzafa;

    iput-wide p3, p0, Lcom/google/android/gms/internal/zzafc$14;->b:J

    iput-object p5, p0, Lcom/google/android/gms/internal/zzafc$14;->c:Lcom/google/firebase/database/DatabaseReference$CompletionListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public zzaj(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/zzafc;->zzal(Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/database/DatabaseError;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafc$14;->d:Lcom/google/android/gms/internal/zzafc;

    const-string v2, "setValue"

    iget-object v3, p0, Lcom/google/android/gms/internal/zzafc$14;->a:Lcom/google/android/gms/internal/zzafa;

    invoke-static {v1, v2, v3, v0}, Lcom/google/android/gms/internal/zzafc;->zza(Lcom/google/android/gms/internal/zzafc;Ljava/lang/String;Lcom/google/android/gms/internal/zzafa;Lcom/google/firebase/database/DatabaseError;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafc$14;->d:Lcom/google/android/gms/internal/zzafc;

    iget-wide v2, p0, Lcom/google/android/gms/internal/zzafc$14;->b:J

    iget-object v4, p0, Lcom/google/android/gms/internal/zzafc$14;->a:Lcom/google/android/gms/internal/zzafa;

    invoke-static {v1, v2, v3, v4, v0}, Lcom/google/android/gms/internal/zzafc;->zza(Lcom/google/android/gms/internal/zzafc;JLcom/google/android/gms/internal/zzafa;Lcom/google/firebase/database/DatabaseError;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/zzafc$14;->d:Lcom/google/android/gms/internal/zzafc;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzafc$14;->c:Lcom/google/firebase/database/DatabaseReference$CompletionListener;

    iget-object v3, p0, Lcom/google/android/gms/internal/zzafc$14;->a:Lcom/google/android/gms/internal/zzafa;

    invoke-virtual {v1, v2, v0, v3}, Lcom/google/android/gms/internal/zzafc;->zza(Lcom/google/firebase/database/DatabaseReference$CompletionListener;Lcom/google/firebase/database/DatabaseError;Lcom/google/android/gms/internal/zzafa;)V

    return-void
.end method
