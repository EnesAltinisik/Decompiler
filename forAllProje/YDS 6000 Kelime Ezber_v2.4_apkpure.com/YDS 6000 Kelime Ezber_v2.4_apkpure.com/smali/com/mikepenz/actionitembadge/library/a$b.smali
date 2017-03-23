.class public final enum Lcom/mikepenz/actionitembadge/library/a$b;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mikepenz/actionitembadge/library/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/mikepenz/actionitembadge/library/a$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/mikepenz/actionitembadge/library/a$b;

.field public static final enum b:Lcom/mikepenz/actionitembadge/library/a$b;

.field public static final enum c:Lcom/mikepenz/actionitembadge/library/a$b;

.field public static final enum d:Lcom/mikepenz/actionitembadge/library/a$b;

.field public static final enum e:Lcom/mikepenz/actionitembadge/library/a$b;

.field public static final enum f:Lcom/mikepenz/actionitembadge/library/a$b;

.field public static final enum g:Lcom/mikepenz/actionitembadge/library/a$b;

.field public static final enum h:Lcom/mikepenz/actionitembadge/library/a$b;

.field public static final enum i:Lcom/mikepenz/actionitembadge/library/a$b;

.field public static final enum j:Lcom/mikepenz/actionitembadge/library/a$b;

.field public static final enum k:Lcom/mikepenz/actionitembadge/library/a$b;

.field public static final enum l:Lcom/mikepenz/actionitembadge/library/a$b;

.field public static final enum m:Lcom/mikepenz/actionitembadge/library/a$b;

.field public static final enum n:Lcom/mikepenz/actionitembadge/library/a$b;

.field private static final synthetic p:[Lcom/mikepenz/actionitembadge/library/a$b;


# instance fields
.field private o:Lcom/mikepenz/actionitembadge/library/a/b;


# direct methods
.method static constructor <clinit>()V
    .locals 15

    const/4 v14, 0x2

    const/4 v13, 0x1

    const/4 v12, 0x0

    const/high16 v5, -0x1000000

    const/4 v11, -0x1

    new-instance v6, Lcom/mikepenz/actionitembadge/library/a$b;

    const-string v7, "GREY"

    new-instance v0, Lcom/mikepenz/actionitembadge/library/a/b;

    sget-object v1, Lcom/mikepenz/actionitembadge/library/a/b$a;->a:Lcom/mikepenz/actionitembadge/library/a/b$a;

    sget v2, Lcom/mikepenz/actionitembadge/library/R$layout;->menu_action_item_badge:I

    const-string v3, "#e0e0e0"

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    const-string v4, "#c7c7c7"

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    invoke-direct/range {v0 .. v5}, Lcom/mikepenz/actionitembadge/library/a/b;-><init>(Lcom/mikepenz/actionitembadge/library/a/b$a;IIII)V

    invoke-direct {v6, v7, v12, v0}, Lcom/mikepenz/actionitembadge/library/a$b;-><init>(Ljava/lang/String;ILcom/mikepenz/actionitembadge/library/a/b;)V

    sput-object v6, Lcom/mikepenz/actionitembadge/library/a$b;->a:Lcom/mikepenz/actionitembadge/library/a$b;

    new-instance v0, Lcom/mikepenz/actionitembadge/library/a$b;

    const-string v1, "DARK_GREY"

    new-instance v6, Lcom/mikepenz/actionitembadge/library/a/b;

    sget-object v7, Lcom/mikepenz/actionitembadge/library/a/b$a;->a:Lcom/mikepenz/actionitembadge/library/a/b$a;

    sget v8, Lcom/mikepenz/actionitembadge/library/R$layout;->menu_action_item_badge:I

    const-string v2, "#606060"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v9

    const-string v2, "#3e3e3e"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v10

    invoke-direct/range {v6 .. v11}, Lcom/mikepenz/actionitembadge/library/a/b;-><init>(Lcom/mikepenz/actionitembadge/library/a/b$a;IIII)V

    invoke-direct {v0, v1, v13, v6}, Lcom/mikepenz/actionitembadge/library/a$b;-><init>(Ljava/lang/String;ILcom/mikepenz/actionitembadge/library/a/b;)V

    sput-object v0, Lcom/mikepenz/actionitembadge/library/a$b;->b:Lcom/mikepenz/actionitembadge/library/a$b;

    new-instance v0, Lcom/mikepenz/actionitembadge/library/a$b;

    const-string v1, "RED"

    new-instance v6, Lcom/mikepenz/actionitembadge/library/a/b;

    sget-object v7, Lcom/mikepenz/actionitembadge/library/a/b$a;->a:Lcom/mikepenz/actionitembadge/library/a/b$a;

    sget v8, Lcom/mikepenz/actionitembadge/library/R$layout;->menu_action_item_badge:I

    const-string v2, "#FF4444"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v9

    const-string v2, "#CC0000"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v10

    invoke-direct/range {v6 .. v11}, Lcom/mikepenz/actionitembadge/library/a/b;-><init>(Lcom/mikepenz/actionitembadge/library/a/b$a;IIII)V

    invoke-direct {v0, v1, v14, v6}, Lcom/mikepenz/actionitembadge/library/a$b;-><init>(Ljava/lang/String;ILcom/mikepenz/actionitembadge/library/a/b;)V

    sput-object v0, Lcom/mikepenz/actionitembadge/library/a$b;->c:Lcom/mikepenz/actionitembadge/library/a$b;

    new-instance v0, Lcom/mikepenz/actionitembadge/library/a$b;

    const-string v1, "BLUE"

    const/4 v2, 0x3

    new-instance v6, Lcom/mikepenz/actionitembadge/library/a/b;

    sget-object v7, Lcom/mikepenz/actionitembadge/library/a/b$a;->a:Lcom/mikepenz/actionitembadge/library/a/b$a;

    sget v8, Lcom/mikepenz/actionitembadge/library/R$layout;->menu_action_item_badge:I

    const-string v3, "#33B5E5"

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v9

    const-string v3, "#0099CC"

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v10

    invoke-direct/range {v6 .. v11}, Lcom/mikepenz/actionitembadge/library/a/b;-><init>(Lcom/mikepenz/actionitembadge/library/a/b$a;IIII)V

    invoke-direct {v0, v1, v2, v6}, Lcom/mikepenz/actionitembadge/library/a$b;-><init>(Ljava/lang/String;ILcom/mikepenz/actionitembadge/library/a/b;)V

    sput-object v0, Lcom/mikepenz/actionitembadge/library/a$b;->d:Lcom/mikepenz/actionitembadge/library/a$b;

    new-instance v0, Lcom/mikepenz/actionitembadge/library/a$b;

    const-string v1, "GREEN"

    const/4 v2, 0x4

    new-instance v6, Lcom/mikepenz/actionitembadge/library/a/b;

    sget-object v7, Lcom/mikepenz/actionitembadge/library/a/b$a;->a:Lcom/mikepenz/actionitembadge/library/a/b$a;

    sget v8, Lcom/mikepenz/actionitembadge/library/R$layout;->menu_action_item_badge:I

    const-string v3, "#99CC00"

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v9

    const-string v3, "#669900"

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v10

    invoke-direct/range {v6 .. v11}, Lcom/mikepenz/actionitembadge/library/a/b;-><init>(Lcom/mikepenz/actionitembadge/library/a/b$a;IIII)V

    invoke-direct {v0, v1, v2, v6}, Lcom/mikepenz/actionitembadge/library/a$b;-><init>(Ljava/lang/String;ILcom/mikepenz/actionitembadge/library/a/b;)V

    sput-object v0, Lcom/mikepenz/actionitembadge/library/a$b;->e:Lcom/mikepenz/actionitembadge/library/a$b;

    new-instance v0, Lcom/mikepenz/actionitembadge/library/a$b;

    const-string v1, "PURPLE"

    const/4 v2, 0x5

    new-instance v6, Lcom/mikepenz/actionitembadge/library/a/b;

    sget-object v7, Lcom/mikepenz/actionitembadge/library/a/b$a;->a:Lcom/mikepenz/actionitembadge/library/a/b$a;

    sget v8, Lcom/mikepenz/actionitembadge/library/R$layout;->menu_action_item_badge:I

    const-string v3, "#AA66CC"

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v9

    const-string v3, "#9933CC"

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v10

    invoke-direct/range {v6 .. v11}, Lcom/mikepenz/actionitembadge/library/a/b;-><init>(Lcom/mikepenz/actionitembadge/library/a/b$a;IIII)V

    invoke-direct {v0, v1, v2, v6}, Lcom/mikepenz/actionitembadge/library/a$b;-><init>(Ljava/lang/String;ILcom/mikepenz/actionitembadge/library/a/b;)V

    sput-object v0, Lcom/mikepenz/actionitembadge/library/a$b;->f:Lcom/mikepenz/actionitembadge/library/a$b;

    new-instance v0, Lcom/mikepenz/actionitembadge/library/a$b;

    const-string v1, "YELLOW"

    const/4 v2, 0x6

    new-instance v6, Lcom/mikepenz/actionitembadge/library/a/b;

    sget-object v7, Lcom/mikepenz/actionitembadge/library/a/b$a;->a:Lcom/mikepenz/actionitembadge/library/a/b$a;

    sget v8, Lcom/mikepenz/actionitembadge/library/R$layout;->menu_action_item_badge:I

    const-string v3, "#FFBB33"

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v9

    const-string v3, "#FF8800"

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v10

    invoke-direct/range {v6 .. v11}, Lcom/mikepenz/actionitembadge/library/a/b;-><init>(Lcom/mikepenz/actionitembadge/library/a/b$a;IIII)V

    invoke-direct {v0, v1, v2, v6}, Lcom/mikepenz/actionitembadge/library/a$b;-><init>(Ljava/lang/String;ILcom/mikepenz/actionitembadge/library/a/b;)V

    sput-object v0, Lcom/mikepenz/actionitembadge/library/a$b;->g:Lcom/mikepenz/actionitembadge/library/a$b;

    new-instance v6, Lcom/mikepenz/actionitembadge/library/a$b;

    const-string v7, "GREY_LARGE"

    const/4 v8, 0x7

    new-instance v0, Lcom/mikepenz/actionitembadge/library/a/b;

    sget-object v1, Lcom/mikepenz/actionitembadge/library/a/b$a;->b:Lcom/mikepenz/actionitembadge/library/a/b$a;

    sget v2, Lcom/mikepenz/actionitembadge/library/R$layout;->menu_action_item_badge_large:I

    const-string v3, "#e0e0e0"

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    const-string v4, "#c7c7c7"

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    invoke-direct/range {v0 .. v5}, Lcom/mikepenz/actionitembadge/library/a/b;-><init>(Lcom/mikepenz/actionitembadge/library/a/b$a;IIII)V

    invoke-direct {v6, v7, v8, v0}, Lcom/mikepenz/actionitembadge/library/a$b;-><init>(Ljava/lang/String;ILcom/mikepenz/actionitembadge/library/a/b;)V

    sput-object v6, Lcom/mikepenz/actionitembadge/library/a$b;->h:Lcom/mikepenz/actionitembadge/library/a$b;

    new-instance v0, Lcom/mikepenz/actionitembadge/library/a$b;

    const-string v1, "DARK_GREY_LARGE"

    const/16 v2, 0x8

    new-instance v6, Lcom/mikepenz/actionitembadge/library/a/b;

    sget-object v7, Lcom/mikepenz/actionitembadge/library/a/b$a;->b:Lcom/mikepenz/actionitembadge/library/a/b$a;

    sget v8, Lcom/mikepenz/actionitembadge/library/R$layout;->menu_action_item_badge_large:I

    const-string v3, "#606060"

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v9

    const-string v3, "#3e3e3e"

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v10

    invoke-direct/range {v6 .. v11}, Lcom/mikepenz/actionitembadge/library/a/b;-><init>(Lcom/mikepenz/actionitembadge/library/a/b$a;IIII)V

    invoke-direct {v0, v1, v2, v6}, Lcom/mikepenz/actionitembadge/library/a$b;-><init>(Ljava/lang/String;ILcom/mikepenz/actionitembadge/library/a/b;)V

    sput-object v0, Lcom/mikepenz/actionitembadge/library/a$b;->i:Lcom/mikepenz/actionitembadge/library/a$b;

    new-instance v0, Lcom/mikepenz/actionitembadge/library/a$b;

    const-string v1, "RED_LARGE"

    const/16 v2, 0x9

    new-instance v6, Lcom/mikepenz/actionitembadge/library/a/b;

    sget-object v7, Lcom/mikepenz/actionitembadge/library/a/b$a;->b:Lcom/mikepenz/actionitembadge/library/a/b$a;

    sget v8, Lcom/mikepenz/actionitembadge/library/R$layout;->menu_action_item_badge_large:I

    const-string v3, "#FF4444"

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v9

    const-string v3, "#CC0000"

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v10

    invoke-direct/range {v6 .. v11}, Lcom/mikepenz/actionitembadge/library/a/b;-><init>(Lcom/mikepenz/actionitembadge/library/a/b$a;IIII)V

    invoke-direct {v0, v1, v2, v6}, Lcom/mikepenz/actionitembadge/library/a$b;-><init>(Ljava/lang/String;ILcom/mikepenz/actionitembadge/library/a/b;)V

    sput-object v0, Lcom/mikepenz/actionitembadge/library/a$b;->j:Lcom/mikepenz/actionitembadge/library/a$b;

    new-instance v0, Lcom/mikepenz/actionitembadge/library/a$b;

    const-string v1, "BLUE_LARGE"

    const/16 v2, 0xa

    new-instance v6, Lcom/mikepenz/actionitembadge/library/a/b;

    sget-object v7, Lcom/mikepenz/actionitembadge/library/a/b$a;->b:Lcom/mikepenz/actionitembadge/library/a/b$a;

    sget v8, Lcom/mikepenz/actionitembadge/library/R$layout;->menu_action_item_badge_large:I

    const-string v3, "#33B5E5"

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v9

    const-string v3, "#0099CC"

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v10

    invoke-direct/range {v6 .. v11}, Lcom/mikepenz/actionitembadge/library/a/b;-><init>(Lcom/mikepenz/actionitembadge/library/a/b$a;IIII)V

    invoke-direct {v0, v1, v2, v6}, Lcom/mikepenz/actionitembadge/library/a$b;-><init>(Ljava/lang/String;ILcom/mikepenz/actionitembadge/library/a/b;)V

    sput-object v0, Lcom/mikepenz/actionitembadge/library/a$b;->k:Lcom/mikepenz/actionitembadge/library/a$b;

    new-instance v0, Lcom/mikepenz/actionitembadge/library/a$b;

    const-string v1, "GREEN_LARGE"

    const/16 v2, 0xb

    new-instance v6, Lcom/mikepenz/actionitembadge/library/a/b;

    sget-object v7, Lcom/mikepenz/actionitembadge/library/a/b$a;->b:Lcom/mikepenz/actionitembadge/library/a/b$a;

    sget v8, Lcom/mikepenz/actionitembadge/library/R$layout;->menu_action_item_badge_large:I

    const-string v3, "#99CC00"

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v9

    const-string v3, "#669900"

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v10

    invoke-direct/range {v6 .. v11}, Lcom/mikepenz/actionitembadge/library/a/b;-><init>(Lcom/mikepenz/actionitembadge/library/a/b$a;IIII)V

    invoke-direct {v0, v1, v2, v6}, Lcom/mikepenz/actionitembadge/library/a$b;-><init>(Ljava/lang/String;ILcom/mikepenz/actionitembadge/library/a/b;)V

    sput-object v0, Lcom/mikepenz/actionitembadge/library/a$b;->l:Lcom/mikepenz/actionitembadge/library/a$b;

    new-instance v0, Lcom/mikepenz/actionitembadge/library/a$b;

    const-string v1, "PURPLE_LARGE"

    const/16 v2, 0xc

    new-instance v6, Lcom/mikepenz/actionitembadge/library/a/b;

    sget-object v7, Lcom/mikepenz/actionitembadge/library/a/b$a;->b:Lcom/mikepenz/actionitembadge/library/a/b$a;

    sget v8, Lcom/mikepenz/actionitembadge/library/R$layout;->menu_action_item_badge_large:I

    const-string v3, "#AA66CC"

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v9

    const-string v3, "#9933CC"

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v10

    invoke-direct/range {v6 .. v11}, Lcom/mikepenz/actionitembadge/library/a/b;-><init>(Lcom/mikepenz/actionitembadge/library/a/b$a;IIII)V

    invoke-direct {v0, v1, v2, v6}, Lcom/mikepenz/actionitembadge/library/a$b;-><init>(Ljava/lang/String;ILcom/mikepenz/actionitembadge/library/a/b;)V

    sput-object v0, Lcom/mikepenz/actionitembadge/library/a$b;->m:Lcom/mikepenz/actionitembadge/library/a$b;

    new-instance v0, Lcom/mikepenz/actionitembadge/library/a$b;

    const-string v1, "YELLOW_LARGE"

    const/16 v2, 0xd

    new-instance v6, Lcom/mikepenz/actionitembadge/library/a/b;

    sget-object v7, Lcom/mikepenz/actionitembadge/library/a/b$a;->b:Lcom/mikepenz/actionitembadge/library/a/b$a;

    sget v8, Lcom/mikepenz/actionitembadge/library/R$layout;->menu_action_item_badge_large:I

    const-string v3, "#FFBB33"

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v9

    const-string v3, "#FF8800"

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v10

    invoke-direct/range {v6 .. v11}, Lcom/mikepenz/actionitembadge/library/a/b;-><init>(Lcom/mikepenz/actionitembadge/library/a/b$a;IIII)V

    invoke-direct {v0, v1, v2, v6}, Lcom/mikepenz/actionitembadge/library/a$b;-><init>(Ljava/lang/String;ILcom/mikepenz/actionitembadge/library/a/b;)V

    sput-object v0, Lcom/mikepenz/actionitembadge/library/a$b;->n:Lcom/mikepenz/actionitembadge/library/a$b;

    const/16 v0, 0xe

    new-array v0, v0, [Lcom/mikepenz/actionitembadge/library/a$b;

    sget-object v1, Lcom/mikepenz/actionitembadge/library/a$b;->a:Lcom/mikepenz/actionitembadge/library/a$b;

    aput-object v1, v0, v12

    sget-object v1, Lcom/mikepenz/actionitembadge/library/a$b;->b:Lcom/mikepenz/actionitembadge/library/a$b;

    aput-object v1, v0, v13

    sget-object v1, Lcom/mikepenz/actionitembadge/library/a$b;->c:Lcom/mikepenz/actionitembadge/library/a$b;

    aput-object v1, v0, v14

    const/4 v1, 0x3

    sget-object v2, Lcom/mikepenz/actionitembadge/library/a$b;->d:Lcom/mikepenz/actionitembadge/library/a$b;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lcom/mikepenz/actionitembadge/library/a$b;->e:Lcom/mikepenz/actionitembadge/library/a$b;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lcom/mikepenz/actionitembadge/library/a$b;->f:Lcom/mikepenz/actionitembadge/library/a$b;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/mikepenz/actionitembadge/library/a$b;->g:Lcom/mikepenz/actionitembadge/library/a$b;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lcom/mikepenz/actionitembadge/library/a$b;->h:Lcom/mikepenz/actionitembadge/library/a$b;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lcom/mikepenz/actionitembadge/library/a$b;->i:Lcom/mikepenz/actionitembadge/library/a$b;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lcom/mikepenz/actionitembadge/library/a$b;->j:Lcom/mikepenz/actionitembadge/library/a$b;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    sget-object v2, Lcom/mikepenz/actionitembadge/library/a$b;->k:Lcom/mikepenz/actionitembadge/library/a$b;

    aput-object v2, v0, v1

    const/16 v1, 0xb

    sget-object v2, Lcom/mikepenz/actionitembadge/library/a$b;->l:Lcom/mikepenz/actionitembadge/library/a$b;

    aput-object v2, v0, v1

    const/16 v1, 0xc

    sget-object v2, Lcom/mikepenz/actionitembadge/library/a$b;->m:Lcom/mikepenz/actionitembadge/library/a$b;

    aput-object v2, v0, v1

    const/16 v1, 0xd

    sget-object v2, Lcom/mikepenz/actionitembadge/library/a$b;->n:Lcom/mikepenz/actionitembadge/library/a$b;

    aput-object v2, v0, v1

    sput-object v0, Lcom/mikepenz/actionitembadge/library/a$b;->p:[Lcom/mikepenz/actionitembadge/library/a$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILcom/mikepenz/actionitembadge/library/a/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mikepenz/actionitembadge/library/a/b;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/mikepenz/actionitembadge/library/a$b;->o:Lcom/mikepenz/actionitembadge/library/a/b;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/mikepenz/actionitembadge/library/a$b;
    .locals 1

    const-class v0, Lcom/mikepenz/actionitembadge/library/a$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/mikepenz/actionitembadge/library/a$b;

    return-object v0
.end method

.method public static values()[Lcom/mikepenz/actionitembadge/library/a$b;
    .locals 1

    sget-object v0, Lcom/mikepenz/actionitembadge/library/a$b;->p:[Lcom/mikepenz/actionitembadge/library/a$b;

    invoke-virtual {v0}, [Lcom/mikepenz/actionitembadge/library/a$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/mikepenz/actionitembadge/library/a$b;

    return-object v0
.end method


# virtual methods
.method public a()Lcom/mikepenz/actionitembadge/library/a/b;
    .locals 1

    iget-object v0, p0, Lcom/mikepenz/actionitembadge/library/a$b;->o:Lcom/mikepenz/actionitembadge/library/a/b;

    return-object v0
.end method
