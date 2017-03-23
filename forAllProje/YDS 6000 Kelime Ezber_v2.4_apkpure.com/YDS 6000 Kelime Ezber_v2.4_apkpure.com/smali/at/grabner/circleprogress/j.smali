.class public final enum Lat/grabner/circleprogress/j;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lat/grabner/circleprogress/j;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lat/grabner/circleprogress/j;

.field public static final enum b:Lat/grabner/circleprogress/j;

.field public static final enum c:Lat/grabner/circleprogress/j;

.field public static final enum d:Lat/grabner/circleprogress/j;

.field public static final enum e:Lat/grabner/circleprogress/j;

.field public static final enum f:Lat/grabner/circleprogress/j;

.field private static final synthetic g:[Lat/grabner/circleprogress/j;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    new-instance v0, Lat/grabner/circleprogress/j;

    const-string v1, "TOP"

    invoke-direct {v0, v1, v3}, Lat/grabner/circleprogress/j;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lat/grabner/circleprogress/j;->a:Lat/grabner/circleprogress/j;

    new-instance v0, Lat/grabner/circleprogress/j;

    const-string v1, "BOTTOM"

    invoke-direct {v0, v1, v4}, Lat/grabner/circleprogress/j;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lat/grabner/circleprogress/j;->b:Lat/grabner/circleprogress/j;

    new-instance v0, Lat/grabner/circleprogress/j;

    const-string v1, "LEFT_TOP"

    invoke-direct {v0, v1, v5}, Lat/grabner/circleprogress/j;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lat/grabner/circleprogress/j;->c:Lat/grabner/circleprogress/j;

    new-instance v0, Lat/grabner/circleprogress/j;

    const-string v1, "RIGHT_TOP"

    invoke-direct {v0, v1, v6}, Lat/grabner/circleprogress/j;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lat/grabner/circleprogress/j;->d:Lat/grabner/circleprogress/j;

    new-instance v0, Lat/grabner/circleprogress/j;

    const-string v1, "LEFT_BOTTOM"

    invoke-direct {v0, v1, v7}, Lat/grabner/circleprogress/j;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lat/grabner/circleprogress/j;->e:Lat/grabner/circleprogress/j;

    new-instance v0, Lat/grabner/circleprogress/j;

    const-string v1, "RIGHT_BOTTOM"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lat/grabner/circleprogress/j;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lat/grabner/circleprogress/j;->f:Lat/grabner/circleprogress/j;

    const/4 v0, 0x6

    new-array v0, v0, [Lat/grabner/circleprogress/j;

    sget-object v1, Lat/grabner/circleprogress/j;->a:Lat/grabner/circleprogress/j;

    aput-object v1, v0, v3

    sget-object v1, Lat/grabner/circleprogress/j;->b:Lat/grabner/circleprogress/j;

    aput-object v1, v0, v4

    sget-object v1, Lat/grabner/circleprogress/j;->c:Lat/grabner/circleprogress/j;

    aput-object v1, v0, v5

    sget-object v1, Lat/grabner/circleprogress/j;->d:Lat/grabner/circleprogress/j;

    aput-object v1, v0, v6

    sget-object v1, Lat/grabner/circleprogress/j;->e:Lat/grabner/circleprogress/j;

    aput-object v1, v0, v7

    const/4 v1, 0x5

    sget-object v2, Lat/grabner/circleprogress/j;->f:Lat/grabner/circleprogress/j;

    aput-object v2, v0, v1

    sput-object v0, Lat/grabner/circleprogress/j;->g:[Lat/grabner/circleprogress/j;

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

.method public static valueOf(Ljava/lang/String;)Lat/grabner/circleprogress/j;
    .locals 1

    const-class v0, Lat/grabner/circleprogress/j;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lat/grabner/circleprogress/j;

    return-object v0
.end method

.method public static values()[Lat/grabner/circleprogress/j;
    .locals 1

    sget-object v0, Lat/grabner/circleprogress/j;->g:[Lat/grabner/circleprogress/j;

    invoke-virtual {v0}, [Lat/grabner/circleprogress/j;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lat/grabner/circleprogress/j;

    return-object v0
.end method
