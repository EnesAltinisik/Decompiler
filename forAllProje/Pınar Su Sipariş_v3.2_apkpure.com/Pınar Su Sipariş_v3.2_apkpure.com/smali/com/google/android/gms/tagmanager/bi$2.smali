.class Lcom/google/android/gms/tagmanager/bi$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/tagmanager/bi;->a(Lcom/google/android/gms/internal/zzabr$zza;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/zzabr$zza;

.field final synthetic b:Lcom/google/android/gms/tagmanager/bi;


# direct methods
.method constructor <init>(Lcom/google/android/gms/tagmanager/bi;Lcom/google/android/gms/internal/zzabr$zza;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/bi$2;->b:Lcom/google/android/gms/tagmanager/bi;

    iput-object p2, p0, Lcom/google/android/gms/tagmanager/bi$2;->a:Lcom/google/android/gms/internal/zzabr$zza;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/bi$2;->b:Lcom/google/android/gms/tagmanager/bi;

    iget-object v1, p0, Lcom/google/android/gms/tagmanager/bi$2;->a:Lcom/google/android/gms/internal/zzabr$zza;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/tagmanager/bi;->b(Lcom/google/android/gms/internal/zzabr$zza;)Z

    return-void
.end method
