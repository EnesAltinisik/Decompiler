.class final Lcom/badoualy/stepperindicator/StepperIndicator$b$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/badoualy/stepperindicator/StepperIndicator$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/badoualy/stepperindicator/StepperIndicator$b;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/badoualy/stepperindicator/StepperIndicator$b;
    .locals 2

    new-instance v0, Lcom/badoualy/stepperindicator/StepperIndicator$b;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/badoualy/stepperindicator/StepperIndicator$b;-><init>(Landroid/os/Parcel;Lcom/badoualy/stepperindicator/StepperIndicator$1;)V

    return-object v0
.end method

.method public a(I)[Lcom/badoualy/stepperindicator/StepperIndicator$b;
    .locals 1

    new-array v0, p1, [Lcom/badoualy/stepperindicator/StepperIndicator$b;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/badoualy/stepperindicator/StepperIndicator$b$1;->a(Landroid/os/Parcel;)Lcom/badoualy/stepperindicator/StepperIndicator$b;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/badoualy/stepperindicator/StepperIndicator$b$1;->a(I)[Lcom/badoualy/stepperindicator/StepperIndicator$b;

    move-result-object v0

    return-object v0
.end method
