.class public final enum Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;
.super Ljava/lang/Enum;
.source "MainActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pinarsu/siparis/ui/activity/MainActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "FRAGMENT_TYPE"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;

.field public static final enum ANNOUNCEMENTS_AND_NEWS:Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;

.field public static final enum CAMPAIGNS:Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;

.field public static final enum HOME:Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;

.field public static final enum ORDER1:Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;

.field public static final enum ORDER2:Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;

.field public static final enum ORDER3:Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;

.field public static final enum ORDER_SUMMARY:Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;

.field public static final enum PROFILE:Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;

.field public static final enum REMINDER:Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;


# instance fields
.field public clazz:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .prologue
    const/4 v8, 0x4

    const/4 v7, 0x3

    const/4 v6, 0x2

    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 117
    new-instance v0, Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;

    const-string v1, "PROFILE"

    const-class v2, Lcom/pinarsu/siparis/ui/fragment/ProfileFragment;

    invoke-direct {v0, v1, v4, v2}, Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v0, Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;->PROFILE:Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;

    .line 118
    new-instance v0, Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;

    const-string v1, "ORDER_SUMMARY"

    const-class v2, Lcom/pinarsu/siparis/ui/fragment/OrderSummaryFragment;

    invoke-direct {v0, v1, v5, v2}, Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v0, Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;->ORDER_SUMMARY:Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;

    .line 119
    new-instance v0, Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;

    const-string v1, "HOME"

    const-class v2, Lcom/pinarsu/siparis/ui/fragment/HomeFragment;

    invoke-direct {v0, v1, v6, v2}, Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v0, Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;->HOME:Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;

    .line 120
    new-instance v0, Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;

    const-string v1, "ANNOUNCEMENTS_AND_NEWS"

    const-class v2, Lcom/pinarsu/siparis/ui/fragment/AnnouncementsAndNewsFragment;

    invoke-direct {v0, v1, v7, v2}, Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v0, Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;->ANNOUNCEMENTS_AND_NEWS:Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;

    .line 121
    new-instance v0, Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;

    const-string v1, "ORDER1"

    const-class v2, Lcom/pinarsu/siparis/ui/fragment/Order1Fragment;

    invoke-direct {v0, v1, v8, v2}, Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v0, Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;->ORDER1:Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;

    .line 122
    new-instance v0, Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;

    const-string v1, "ORDER2"

    const/4 v2, 0x5

    const-class v3, Lcom/pinarsu/siparis/ui/fragment/Order2Fragment;

    invoke-direct {v0, v1, v2, v3}, Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v0, Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;->ORDER2:Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;

    .line 123
    new-instance v0, Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;

    const-string v1, "ORDER3"

    const/4 v2, 0x6

    const-class v3, Lcom/pinarsu/siparis/ui/fragment/Order3Fragment;

    invoke-direct {v0, v1, v2, v3}, Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v0, Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;->ORDER3:Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;

    .line 124
    new-instance v0, Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;

    const-string v1, "CAMPAIGNS"

    const/4 v2, 0x7

    const-class v3, Lcom/pinarsu/siparis/ui/fragment/CampaignsFragment;

    invoke-direct {v0, v1, v2, v3}, Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v0, Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;->CAMPAIGNS:Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;

    .line 125
    new-instance v0, Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;

    const-string v1, "REMINDER"

    const/16 v2, 0x8

    const-class v3, Lcom/pinarsu/siparis/ui/fragment/ReminderFragment;

    invoke-direct {v0, v1, v2, v3}, Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v0, Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;->REMINDER:Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;

    .line 115
    const/16 v0, 0x9

    new-array v0, v0, [Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;

    sget-object v1, Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;->PROFILE:Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;

    aput-object v1, v0, v4

    sget-object v1, Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;->ORDER_SUMMARY:Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;

    aput-object v1, v0, v5

    sget-object v1, Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;->HOME:Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;

    aput-object v1, v0, v6

    sget-object v1, Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;->ANNOUNCEMENTS_AND_NEWS:Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;

    aput-object v1, v0, v7

    sget-object v1, Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;->ORDER1:Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;

    aput-object v1, v0, v8

    const/4 v1, 0x5

    sget-object v2, Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;->ORDER2:Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;->ORDER3:Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;->CAMPAIGNS:Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;->REMINDER:Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;

    aput-object v2, v0, v1

    sput-object v0, Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;->$VALUES:[Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;)V"
        }
    .end annotation

    .prologue
    .line 128
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 129
    iput-object p3, p0, Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;->clazz:Ljava/lang/Class;

    .line 130
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;
    .locals 1

    .prologue
    .line 115
    const-class v0, Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;

    return-object v0
.end method

.method public static values()[Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;
    .locals 1

    .prologue
    .line 115
    sget-object v0, Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;->$VALUES:[Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;

    invoke-virtual {v0}, [Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/pinarsu/siparis/ui/activity/MainActivity$FRAGMENT_TYPE;

    return-object v0
.end method
