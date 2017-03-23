.class public final enum Lat/grabner/circleprogress/c;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lat/grabner/circleprogress/c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lat/grabner/circleprogress/c;

.field public static final enum b:Lat/grabner/circleprogress/c;

.field public static final enum c:Lat/grabner/circleprogress/c;

.field public static final enum d:Lat/grabner/circleprogress/c;

.field public static final enum e:Lat/grabner/circleprogress/c;

.field public static final enum f:Lat/grabner/circleprogress/c;

.field private static final synthetic g:[Lat/grabner/circleprogress/c;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    new-instance v0, Lat/grabner/circleprogress/c;

    const-string v1, "IDLE"

    invoke-direct {v0, v1, v3}, Lat/grabner/circleprogress/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lat/grabner/circleprogress/c;->a:Lat/grabner/circleprogress/c;

    new-instance v0, Lat/grabner/circleprogress/c;

    const-string v1, "SPINNING"

    invoke-direct {v0, v1, v4}, Lat/grabner/circleprogress/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lat/grabner/circleprogress/c;->b:Lat/grabner/circleprogress/c;

    new-instance v0, Lat/grabner/circleprogress/c;

    const-string v1, "END_SPINNING"

    invoke-direct {v0, v1, v5}, Lat/grabner/circleprogress/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lat/grabner/circleprogress/c;->c:Lat/grabner/circleprogress/c;

    new-instance v0, Lat/grabner/circleprogress/c;

    const-string v1, "END_SPINNING_START_ANIMATING"

    invoke-direct {v0, v1, v6}, Lat/grabner/circleprogress/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lat/grabner/circleprogress/c;->d:Lat/grabner/circleprogress/c;

    new-instance v0, Lat/grabner/circleprogress/c;

    const-string v1, "START_ANIMATING_AFTER_SPINNING"

    invoke-direct {v0, v1, v7}, Lat/grabner/circleprogress/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lat/grabner/circleprogress/c;->e:Lat/grabner/circleprogress/c;

    new-instance v0, Lat/grabner/circleprogress/c;

    const-string v1, "ANIMATING"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lat/grabner/circleprogress/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lat/grabner/circleprogress/c;->f:Lat/grabner/circleprogress/c;

    const/4 v0, 0x6

    new-array v0, v0, [Lat/grabner/circleprogress/c;

    sget-object v1, Lat/grabner/circleprogress/c;->a:Lat/grabner/circleprogress/c;

    aput-object v1, v0, v3

    sget-object v1, Lat/grabner/circleprogress/c;->b:Lat/grabner/circleprogress/c;

    aput-object v1, v0, v4

    sget-object v1, Lat/grabner/circleprogress/c;->c:Lat/grabner/circleprogress/c;

    aput-object v1, v0, v5

    sget-object v1, Lat/grabner/circleprogress/c;->d:Lat/grabner/circleprogress/c;

    aput-object v1, v0, v6

    sget-object v1, Lat/grabner/circleprogress/c;->e:Lat/grabner/circleprogress/c;

    aput-object v1, v0, v7

    const/4 v1, 0x5

    sget-object v2, Lat/grabner/circleprogress/c;->f:Lat/grabner/circleprogress/c;

    aput-object v2, v0, v1

    sput-object v0, Lat/grabner/circleprogress/c;->g:[Lat/grabner/circleprogress/c;

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

.method public static valueOf(Ljava/lang/String;)Lat/grabner/circleprogress/c;
    .locals 1

    const-class v0, Lat/grabner/circleprogress/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lat/grabner/circleprogress/c;

    return-object v0
.end method

.method public static values()[Lat/grabner/circleprogress/c;
    .locals 1

    sget-object v0, Lat/grabner/circleprogress/c;->g:[Lat/grabner/circleprogress/c;

    invoke-virtual {v0}, [Lat/grabner/circleprogress/c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lat/grabner/circleprogress/c;

    return-object v0
.end method
