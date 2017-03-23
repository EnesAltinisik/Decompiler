.class public final enum Lat/grabner/circleprogress/h;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lat/grabner/circleprogress/h;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lat/grabner/circleprogress/h;

.field public static final enum b:Lat/grabner/circleprogress/h;

.field public static final enum c:Lat/grabner/circleprogress/h;

.field private static final synthetic e:[Lat/grabner/circleprogress/h;


# instance fields
.field final d:Landroid/graphics/Paint$Cap;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    new-instance v0, Lat/grabner/circleprogress/h;

    const-string v1, "BUTT"

    sget-object v2, Landroid/graphics/Paint$Cap;->BUTT:Landroid/graphics/Paint$Cap;

    invoke-direct {v0, v1, v3, v2}, Lat/grabner/circleprogress/h;-><init>(Ljava/lang/String;ILandroid/graphics/Paint$Cap;)V

    sput-object v0, Lat/grabner/circleprogress/h;->a:Lat/grabner/circleprogress/h;

    new-instance v0, Lat/grabner/circleprogress/h;

    const-string v1, "ROUND"

    sget-object v2, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-direct {v0, v1, v4, v2}, Lat/grabner/circleprogress/h;-><init>(Ljava/lang/String;ILandroid/graphics/Paint$Cap;)V

    sput-object v0, Lat/grabner/circleprogress/h;->b:Lat/grabner/circleprogress/h;

    new-instance v0, Lat/grabner/circleprogress/h;

    const-string v1, "SQUARE"

    sget-object v2, Landroid/graphics/Paint$Cap;->SQUARE:Landroid/graphics/Paint$Cap;

    invoke-direct {v0, v1, v5, v2}, Lat/grabner/circleprogress/h;-><init>(Ljava/lang/String;ILandroid/graphics/Paint$Cap;)V

    sput-object v0, Lat/grabner/circleprogress/h;->c:Lat/grabner/circleprogress/h;

    const/4 v0, 0x3

    new-array v0, v0, [Lat/grabner/circleprogress/h;

    sget-object v1, Lat/grabner/circleprogress/h;->a:Lat/grabner/circleprogress/h;

    aput-object v1, v0, v3

    sget-object v1, Lat/grabner/circleprogress/h;->b:Lat/grabner/circleprogress/h;

    aput-object v1, v0, v4

    sget-object v1, Lat/grabner/circleprogress/h;->c:Lat/grabner/circleprogress/h;

    aput-object v1, v0, v5

    sput-object v0, Lat/grabner/circleprogress/h;->e:[Lat/grabner/circleprogress/h;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILandroid/graphics/Paint$Cap;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Paint$Cap;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lat/grabner/circleprogress/h;->d:Landroid/graphics/Paint$Cap;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lat/grabner/circleprogress/h;
    .locals 1

    const-class v0, Lat/grabner/circleprogress/h;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lat/grabner/circleprogress/h;

    return-object v0
.end method

.method public static values()[Lat/grabner/circleprogress/h;
    .locals 1

    sget-object v0, Lat/grabner/circleprogress/h;->e:[Lat/grabner/circleprogress/h;

    invoke-virtual {v0}, [Lat/grabner/circleprogress/h;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lat/grabner/circleprogress/h;

    return-object v0
.end method
