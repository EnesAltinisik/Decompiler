.class public Lcom/google/android/gms/wearable/ChannelIOException;
.super Ljava/io/IOException;


# instance fields
.field private final zzbBC:I

.field private final zzbBD:I


# direct methods
.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    iput p2, p0, Lcom/google/android/gms/wearable/ChannelIOException;->zzbBC:I

    iput p3, p0, Lcom/google/android/gms/wearable/ChannelIOException;->zzbBD:I

    return-void
.end method


# virtual methods
.method public getAppSpecificErrorCode()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/wearable/ChannelIOException;->zzbBD:I

    return v0
.end method

.method public getCloseReason()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/wearable/ChannelIOException;->zzbBC:I

    return v0
.end method
