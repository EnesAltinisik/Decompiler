.class final enum La/a/a/a/a/b/i$a;
.super Ljava/lang/Enum;
.source "CommonUtils.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/a/a/a/a/b/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "La/a/a/a/a/b/i$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:La/a/a/a/a/b/i$a;

.field public static final enum b:La/a/a/a/a/b/i$a;

.field public static final enum c:La/a/a/a/a/b/i$a;

.field public static final enum d:La/a/a/a/a/b/i$a;

.field public static final enum e:La/a/a/a/a/b/i$a;

.field public static final enum f:La/a/a/a/a/b/i$a;

.field public static final enum g:La/a/a/a/a/b/i$a;

.field public static final enum h:La/a/a/a/a/b/i$a;

.field public static final enum i:La/a/a/a/a/b/i$a;

.field public static final enum j:La/a/a/a/a/b/i$a;

.field private static final k:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "La/a/a/a/a/b/i$a;",
            ">;"
        }
    .end annotation
.end field

.field private static final synthetic l:[La/a/a/a/a/b/i$a;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x3

    const/4 v6, 0x2

    const/4 v5, 0x1

    const/4 v4, 0x0

    const/4 v3, 0x4

    .line 154
    new-instance v0, La/a/a/a/a/b/i$a;

    const-string v1, "X86_32"

    invoke-direct {v0, v1, v4}, La/a/a/a/a/b/i$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, La/a/a/a/a/b/i$a;->a:La/a/a/a/a/b/i$a;

    .line 155
    new-instance v0, La/a/a/a/a/b/i$a;

    const-string v1, "X86_64"

    invoke-direct {v0, v1, v5}, La/a/a/a/a/b/i$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, La/a/a/a/a/b/i$a;->b:La/a/a/a/a/b/i$a;

    .line 156
    new-instance v0, La/a/a/a/a/b/i$a;

    const-string v1, "ARM_UNKNOWN"

    invoke-direct {v0, v1, v6}, La/a/a/a/a/b/i$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, La/a/a/a/a/b/i$a;->c:La/a/a/a/a/b/i$a;

    .line 157
    new-instance v0, La/a/a/a/a/b/i$a;

    const-string v1, "PPC"

    invoke-direct {v0, v1, v7}, La/a/a/a/a/b/i$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, La/a/a/a/a/b/i$a;->d:La/a/a/a/a/b/i$a;

    .line 158
    new-instance v0, La/a/a/a/a/b/i$a;

    const-string v1, "PPC64"

    invoke-direct {v0, v1, v3}, La/a/a/a/a/b/i$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, La/a/a/a/a/b/i$a;->e:La/a/a/a/a/b/i$a;

    .line 159
    new-instance v0, La/a/a/a/a/b/i$a;

    const-string v1, "ARMV6"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, La/a/a/a/a/b/i$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, La/a/a/a/a/b/i$a;->f:La/a/a/a/a/b/i$a;

    .line 160
    new-instance v0, La/a/a/a/a/b/i$a;

    const-string v1, "ARMV7"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, La/a/a/a/a/b/i$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, La/a/a/a/a/b/i$a;->g:La/a/a/a/a/b/i$a;

    .line 161
    new-instance v0, La/a/a/a/a/b/i$a;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, La/a/a/a/a/b/i$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, La/a/a/a/a/b/i$a;->h:La/a/a/a/a/b/i$a;

    .line 162
    new-instance v0, La/a/a/a/a/b/i$a;

    const-string v1, "ARMV7S"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, La/a/a/a/a/b/i$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, La/a/a/a/a/b/i$a;->i:La/a/a/a/a/b/i$a;

    .line 163
    new-instance v0, La/a/a/a/a/b/i$a;

    const-string v1, "ARM64"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, La/a/a/a/a/b/i$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, La/a/a/a/a/b/i$a;->j:La/a/a/a/a/b/i$a;

    .line 153
    const/16 v0, 0xa

    new-array v0, v0, [La/a/a/a/a/b/i$a;

    sget-object v1, La/a/a/a/a/b/i$a;->a:La/a/a/a/a/b/i$a;

    aput-object v1, v0, v4

    sget-object v1, La/a/a/a/a/b/i$a;->b:La/a/a/a/a/b/i$a;

    aput-object v1, v0, v5

    sget-object v1, La/a/a/a/a/b/i$a;->c:La/a/a/a/a/b/i$a;

    aput-object v1, v0, v6

    sget-object v1, La/a/a/a/a/b/i$a;->d:La/a/a/a/a/b/i$a;

    aput-object v1, v0, v7

    sget-object v1, La/a/a/a/a/b/i$a;->e:La/a/a/a/a/b/i$a;

    aput-object v1, v0, v3

    const/4 v1, 0x5

    sget-object v2, La/a/a/a/a/b/i$a;->f:La/a/a/a/a/b/i$a;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, La/a/a/a/a/b/i$a;->g:La/a/a/a/a/b/i$a;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, La/a/a/a/a/b/i$a;->h:La/a/a/a/a/b/i$a;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, La/a/a/a/a/b/i$a;->i:La/a/a/a/a/b/i$a;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, La/a/a/a/a/b/i$a;->j:La/a/a/a/a/b/i$a;

    aput-object v2, v0, v1

    sput-object v0, La/a/a/a/a/b/i$a;->l:[La/a/a/a/a/b/i$a;

    .line 165
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0, v3}, Ljava/util/HashMap;-><init>(I)V

    sput-object v0, La/a/a/a/a/b/i$a;->k:Ljava/util/Map;

    .line 168
    sget-object v0, La/a/a/a/a/b/i$a;->k:Ljava/util/Map;

    const-string v1, "armeabi-v7a"

    sget-object v2, La/a/a/a/a/b/i$a;->g:La/a/a/a/a/b/i$a;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 169
    sget-object v0, La/a/a/a/a/b/i$a;->k:Ljava/util/Map;

    const-string v1, "armeabi"

    sget-object v2, La/a/a/a/a/b/i$a;->f:La/a/a/a/a/b/i$a;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    sget-object v0, La/a/a/a/a/b/i$a;->k:Ljava/util/Map;

    const-string v1, "x86"

    sget-object v2, La/a/a/a/a/b/i$a;->a:La/a/a/a/a/b/i$a;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
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
    .line 153
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method static a()La/a/a/a/a/b/i$a;
    .locals 3

    .prologue
    .line 178
    sget-object v0, Landroid/os/Build;->CPU_ABI:Ljava/lang/String;

    .line 180
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 181
    invoke-static {}, La/a/a/a/c;->h()La/a/a/a/l;

    move-result-object v0

    const-string v1, "Fabric"

    const-string v2, "Architecture#getValue()::Build.CPU_ABI returned null or empty"

    invoke-interface {v0, v1, v2}, La/a/a/a/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 183
    sget-object v0, La/a/a/a/a/b/i$a;->h:La/a/a/a/a/b/i$a;

    .line 191
    :cond_0
    :goto_0
    return-object v0

    .line 186
    :cond_1
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    .line 187
    sget-object v1, La/a/a/a/a/b/i$a;->k:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/a/a/a/a/b/i$a;

    .line 188
    if-nez v0, :cond_0

    .line 189
    sget-object v0, La/a/a/a/a/b/i$a;->h:La/a/a/a/a/b/i$a;

    goto :goto_0
.end method

.method public static valueOf(Ljava/lang/String;)La/a/a/a/a/b/i$a;
    .locals 1

    .prologue
    .line 153
    const-class v0, La/a/a/a/a/b/i$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, La/a/a/a/a/b/i$a;

    return-object v0
.end method

.method public static values()[La/a/a/a/a/b/i$a;
    .locals 1

    .prologue
    .line 153
    sget-object v0, La/a/a/a/a/b/i$a;->l:[La/a/a/a/a/b/i$a;

    invoke-virtual {v0}, [La/a/a/a/a/b/i$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [La/a/a/a/a/b/i$a;

    return-object v0
.end method
