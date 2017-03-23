.class public interface abstract Lcom/google/android/gms/nearby/messages/zzb;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable",
        "<",
        "Lcom/google/android/gms/nearby/messages/zzb;",
        ">;"
    }
.end annotation


# static fields
.field public static final zzbiK:Lcom/google/android/gms/nearby/messages/zzb;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/google/android/gms/nearby/messages/internal/DistanceImpl;

    const/4 v1, 0x1

    const-wide/high16 v2, 0x7ff8000000000000L    # NaN

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/nearby/messages/internal/DistanceImpl;-><init>(ID)V

    sput-object v0, Lcom/google/android/gms/nearby/messages/zzb;->zzbiK:Lcom/google/android/gms/nearby/messages/zzb;

    return-void
.end method


# virtual methods
.method public abstract zzHK()D
.end method
