.class public Lorg/b/b/a;
.super Ljava/io/IOException;
.source "HttpResponseException.java"


# instance fields
.field private a:I


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 22
    iput p2, p0, Lorg/b/b/a;->a:I

    .line 23
    return-void
.end method
