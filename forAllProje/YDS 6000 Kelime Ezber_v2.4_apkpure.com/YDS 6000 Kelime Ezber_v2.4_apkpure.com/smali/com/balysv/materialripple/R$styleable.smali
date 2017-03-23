.class public final Lcom/balysv/materialripple/R$styleable;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/balysv/materialripple/R;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "styleable"
.end annotation


# static fields
.field public static final MaterialRippleLayout:[I

.field public static final MaterialRippleLayout_mrl_rippleAlpha:I = 0x3

.field public static final MaterialRippleLayout_mrl_rippleBackground:I = 0x7

.field public static final MaterialRippleLayout_mrl_rippleColor:I = 0x0

.field public static final MaterialRippleLayout_mrl_rippleDelayClick:I = 0x8

.field public static final MaterialRippleLayout_mrl_rippleDimension:I = 0x1

.field public static final MaterialRippleLayout_mrl_rippleDuration:I = 0x4

.field public static final MaterialRippleLayout_mrl_rippleFadeDuration:I = 0x5

.field public static final MaterialRippleLayout_mrl_rippleHover:I = 0x6

.field public static final MaterialRippleLayout_mrl_rippleInAdapter:I = 0xa

.field public static final MaterialRippleLayout_mrl_rippleOverlay:I = 0x2

.field public static final MaterialRippleLayout_mrl_ripplePersistent:I = 0x9

.field public static final MaterialRippleLayout_mrl_rippleRoundedCorners:I = 0xb


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xc

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lcom/balysv/materialripple/R$styleable;->MaterialRippleLayout:[I

    return-void

    :array_0
    .array-data 4
        0x7f0101af
        0x7f0101b0
        0x7f0101b1
        0x7f0101b2
        0x7f0101b3
        0x7f0101b4
        0x7f0101b5
        0x7f0101b6
        0x7f0101b7
        0x7f0101b8
        0x7f0101b9
        0x7f0101ba
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
