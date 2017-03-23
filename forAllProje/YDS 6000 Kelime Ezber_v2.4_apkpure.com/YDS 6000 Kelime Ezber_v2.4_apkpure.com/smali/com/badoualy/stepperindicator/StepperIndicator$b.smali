.class Lcom/badoualy/stepperindicator/StepperIndicator$b;
.super Landroid/view/View$BaseSavedState;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/badoualy/stepperindicator/StepperIndicator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/badoualy/stepperindicator/StepperIndicator$b;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private a:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/badoualy/stepperindicator/StepperIndicator$b$1;

    invoke-direct {v0}, Lcom/badoualy/stepperindicator/StepperIndicator$b$1;-><init>()V

    sput-object v0, Lcom/badoualy/stepperindicator/StepperIndicator$b;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/badoualy/stepperindicator/StepperIndicator$b;->a:I

    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/badoualy/stepperindicator/StepperIndicator$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/badoualy/stepperindicator/StepperIndicator$b;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcelable;)V
    .locals 0

    invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcelable;)V

    return-void
.end method

.method static synthetic a(Lcom/badoualy/stepperindicator/StepperIndicator$b;)I
    .locals 1

    iget v0, p0, Lcom/badoualy/stepperindicator/StepperIndicator$b;->a:I

    return v0
.end method

.method static synthetic a(Lcom/badoualy/stepperindicator/StepperIndicator$b;I)I
    .locals 0

    iput p1, p0, Lcom/badoualy/stepperindicator/StepperIndicator$b;->a:I

    return p1
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    invoke-super {p0, p1, p2}, Landroid/view/View$BaseSavedState;->writeToParcel(Landroid/os/Parcel;I)V

    iget v0, p0, Lcom/badoualy/stepperindicator/StepperIndicator$b;->a:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
