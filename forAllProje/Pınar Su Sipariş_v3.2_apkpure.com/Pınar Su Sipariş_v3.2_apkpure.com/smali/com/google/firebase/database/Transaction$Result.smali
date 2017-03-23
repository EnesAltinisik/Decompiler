.class public Lcom/google/firebase/database/Transaction$Result;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/firebase/database/Transaction;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Result"
.end annotation


# instance fields
.field private zzbHG:Z

.field private zzbHH:Lcom/google/android/gms/internal/zzahu;


# direct methods
.method private constructor <init>(ZLcom/google/android/gms/internal/zzahu;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/google/firebase/database/Transaction$Result;->zzbHG:Z

    iput-object p2, p0, Lcom/google/firebase/database/Transaction$Result;->zzbHH:Lcom/google/android/gms/internal/zzahu;

    return-void
.end method

.method synthetic constructor <init>(ZLcom/google/android/gms/internal/zzahu;Lcom/google/firebase/database/Transaction$1;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/firebase/database/Transaction$Result;-><init>(ZLcom/google/android/gms/internal/zzahu;)V

    return-void
.end method


# virtual methods
.method public isSuccess()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/firebase/database/Transaction$Result;->zzbHG:Z

    return v0
.end method

.method public zzPj()Lcom/google/android/gms/internal/zzahu;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/database/Transaction$Result;->zzbHH:Lcom/google/android/gms/internal/zzahu;

    return-object v0
.end method
