.class public final enum Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment$IMAGE_TYPE;
.super Ljava/lang/Enum;
.source "ViewPagerFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "IMAGE_TYPE"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment$IMAGE_TYPE;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment$IMAGE_TYPE;

.field public static final enum FROM_DRAWABLE:Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment$IMAGE_TYPE;

.field public static final enum FROM_URL:Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment$IMAGE_TYPE;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 34
    new-instance v0, Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment$IMAGE_TYPE;

    const-string v1, "FROM_URL"

    invoke-direct {v0, v1, v2}, Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment$IMAGE_TYPE;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment$IMAGE_TYPE;->FROM_URL:Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment$IMAGE_TYPE;

    new-instance v0, Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment$IMAGE_TYPE;

    const-string v1, "FROM_DRAWABLE"

    invoke-direct {v0, v1, v3}, Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment$IMAGE_TYPE;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment$IMAGE_TYPE;->FROM_DRAWABLE:Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment$IMAGE_TYPE;

    .line 33
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment$IMAGE_TYPE;

    sget-object v1, Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment$IMAGE_TYPE;->FROM_URL:Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment$IMAGE_TYPE;

    aput-object v1, v0, v2

    sget-object v1, Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment$IMAGE_TYPE;->FROM_DRAWABLE:Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment$IMAGE_TYPE;

    aput-object v1, v0, v3

    sput-object v0, Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment$IMAGE_TYPE;->$VALUES:[Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment$IMAGE_TYPE;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .prologue
    .line 33
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment$IMAGE_TYPE;
    .locals 1

    .prologue
    .line 33
    const-class v0, Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment$IMAGE_TYPE;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment$IMAGE_TYPE;

    return-object v0
.end method

.method public static values()[Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment$IMAGE_TYPE;
    .locals 1

    .prologue
    .line 33
    sget-object v0, Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment$IMAGE_TYPE;->$VALUES:[Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment$IMAGE_TYPE;

    invoke-virtual {v0}, [Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment$IMAGE_TYPE;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/pinarsu/siparis/ui/fragment/ViewPagerFragment$IMAGE_TYPE;

    return-object v0
.end method
