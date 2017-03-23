.class public final enum Lat/grabner/circleprogress/i;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lat/grabner/circleprogress/i;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lat/grabner/circleprogress/i;

.field public static final enum b:Lat/grabner/circleprogress/i;

.field public static final enum c:Lat/grabner/circleprogress/i;

.field private static final synthetic d:[Lat/grabner/circleprogress/i;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    new-instance v0, Lat/grabner/circleprogress/i;

    const-string v1, "TEXT"

    invoke-direct {v0, v1, v2}, Lat/grabner/circleprogress/i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lat/grabner/circleprogress/i;->a:Lat/grabner/circleprogress/i;

    new-instance v0, Lat/grabner/circleprogress/i;

    const-string v1, "PERCENT"

    invoke-direct {v0, v1, v3}, Lat/grabner/circleprogress/i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lat/grabner/circleprogress/i;->b:Lat/grabner/circleprogress/i;

    new-instance v0, Lat/grabner/circleprogress/i;

    const-string v1, "VALUE"

    invoke-direct {v0, v1, v4}, Lat/grabner/circleprogress/i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lat/grabner/circleprogress/i;->c:Lat/grabner/circleprogress/i;

    const/4 v0, 0x3

    new-array v0, v0, [Lat/grabner/circleprogress/i;

    sget-object v1, Lat/grabner/circleprogress/i;->a:Lat/grabner/circleprogress/i;

    aput-object v1, v0, v2

    sget-object v1, Lat/grabner/circleprogress/i;->b:Lat/grabner/circleprogress/i;

    aput-object v1, v0, v3

    sget-object v1, Lat/grabner/circleprogress/i;->c:Lat/grabner/circleprogress/i;

    aput-object v1, v0, v4

    sput-object v0, Lat/grabner/circleprogress/i;->d:[Lat/grabner/circleprogress/i;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lat/grabner/circleprogress/i;
    .locals 1

    const-class v0, Lat/grabner/circleprogress/i;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lat/grabner/circleprogress/i;

    return-object v0
.end method

.method public static values()[Lat/grabner/circleprogress/i;
    .locals 1

    sget-object v0, Lat/grabner/circleprogress/i;->d:[Lat/grabner/circleprogress/i;

    invoke-virtual {v0}, [Lat/grabner/circleprogress/i;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lat/grabner/circleprogress/i;

    return-object v0
.end method
