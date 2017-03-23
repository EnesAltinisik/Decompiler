.class public final enum Lat/grabner/circleprogress/g;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lat/grabner/circleprogress/g;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lat/grabner/circleprogress/g;

.field public static final enum b:Lat/grabner/circleprogress/g;

.field private static final synthetic c:[Lat/grabner/circleprogress/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v3, 0x1

    const/4 v2, 0x0

    new-instance v0, Lat/grabner/circleprogress/g;

    const-string v1, "CW"

    invoke-direct {v0, v1, v2}, Lat/grabner/circleprogress/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lat/grabner/circleprogress/g;->a:Lat/grabner/circleprogress/g;

    new-instance v0, Lat/grabner/circleprogress/g;

    const-string v1, "CCW"

    invoke-direct {v0, v1, v3}, Lat/grabner/circleprogress/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lat/grabner/circleprogress/g;->b:Lat/grabner/circleprogress/g;

    const/4 v0, 0x2

    new-array v0, v0, [Lat/grabner/circleprogress/g;

    sget-object v1, Lat/grabner/circleprogress/g;->a:Lat/grabner/circleprogress/g;

    aput-object v1, v0, v2

    sget-object v1, Lat/grabner/circleprogress/g;->b:Lat/grabner/circleprogress/g;

    aput-object v1, v0, v3

    sput-object v0, Lat/grabner/circleprogress/g;->c:[Lat/grabner/circleprogress/g;

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

.method public static valueOf(Ljava/lang/String;)Lat/grabner/circleprogress/g;
    .locals 1

    const-class v0, Lat/grabner/circleprogress/g;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lat/grabner/circleprogress/g;

    return-object v0
.end method

.method public static values()[Lat/grabner/circleprogress/g;
    .locals 1

    sget-object v0, Lat/grabner/circleprogress/g;->c:[Lat/grabner/circleprogress/g;

    invoke-virtual {v0}, [Lat/grabner/circleprogress/g;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lat/grabner/circleprogress/g;

    return-object v0
.end method
