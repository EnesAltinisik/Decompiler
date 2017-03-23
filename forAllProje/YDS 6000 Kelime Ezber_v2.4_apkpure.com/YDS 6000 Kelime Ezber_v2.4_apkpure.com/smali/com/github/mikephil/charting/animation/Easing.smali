.class public Lcom/github/mikephil/charting/animation/Easing;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/github/mikephil/charting/animation/Easing$EasingFunctions;,
        Lcom/github/mikephil/charting/animation/Easing$EasingOption;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getEasingFunctionFromOption(Lcom/github/mikephil/charting/animation/Easing$EasingOption;)Lcom/github/mikephil/charting/animation/EasingFunction;
    .locals 2

    sget-object v0, Lcom/github/mikephil/charting/animation/Easing$1;->$SwitchMap$com$github$mikephil$charting$animation$Easing$EasingOption:[I

    invoke-virtual {p0}, Lcom/github/mikephil/charting/animation/Easing$EasingOption;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lcom/github/mikephil/charting/animation/Easing$EasingFunctions;->Linear:Lcom/github/mikephil/charting/animation/EasingFunction;

    :goto_0
    return-object v0

    :pswitch_0
    sget-object v0, Lcom/github/mikephil/charting/animation/Easing$EasingFunctions;->EaseInQuad:Lcom/github/mikephil/charting/animation/EasingFunction;

    goto :goto_0

    :pswitch_1
    sget-object v0, Lcom/github/mikephil/charting/animation/Easing$EasingFunctions;->EaseOutQuad:Lcom/github/mikephil/charting/animation/EasingFunction;

    goto :goto_0

    :pswitch_2
    sget-object v0, Lcom/github/mikephil/charting/animation/Easing$EasingFunctions;->EaseInOutQuad:Lcom/github/mikephil/charting/animation/EasingFunction;

    goto :goto_0

    :pswitch_3
    sget-object v0, Lcom/github/mikephil/charting/animation/Easing$EasingFunctions;->EaseInCubic:Lcom/github/mikephil/charting/animation/EasingFunction;

    goto :goto_0

    :pswitch_4
    sget-object v0, Lcom/github/mikephil/charting/animation/Easing$EasingFunctions;->EaseOutCubic:Lcom/github/mikephil/charting/animation/EasingFunction;

    goto :goto_0

    :pswitch_5
    sget-object v0, Lcom/github/mikephil/charting/animation/Easing$EasingFunctions;->EaseInOutCubic:Lcom/github/mikephil/charting/animation/EasingFunction;

    goto :goto_0

    :pswitch_6
    sget-object v0, Lcom/github/mikephil/charting/animation/Easing$EasingFunctions;->EaseInQuart:Lcom/github/mikephil/charting/animation/EasingFunction;

    goto :goto_0

    :pswitch_7
    sget-object v0, Lcom/github/mikephil/charting/animation/Easing$EasingFunctions;->EaseOutQuart:Lcom/github/mikephil/charting/animation/EasingFunction;

    goto :goto_0

    :pswitch_8
    sget-object v0, Lcom/github/mikephil/charting/animation/Easing$EasingFunctions;->EaseInOutQuart:Lcom/github/mikephil/charting/animation/EasingFunction;

    goto :goto_0

    :pswitch_9
    sget-object v0, Lcom/github/mikephil/charting/animation/Easing$EasingFunctions;->EaseInSine:Lcom/github/mikephil/charting/animation/EasingFunction;

    goto :goto_0

    :pswitch_a
    sget-object v0, Lcom/github/mikephil/charting/animation/Easing$EasingFunctions;->EaseOutSine:Lcom/github/mikephil/charting/animation/EasingFunction;

    goto :goto_0

    :pswitch_b
    sget-object v0, Lcom/github/mikephil/charting/animation/Easing$EasingFunctions;->EaseInOutSine:Lcom/github/mikephil/charting/animation/EasingFunction;

    goto :goto_0

    :pswitch_c
    sget-object v0, Lcom/github/mikephil/charting/animation/Easing$EasingFunctions;->EaseInExpo:Lcom/github/mikephil/charting/animation/EasingFunction;

    goto :goto_0

    :pswitch_d
    sget-object v0, Lcom/github/mikephil/charting/animation/Easing$EasingFunctions;->EaseOutExpo:Lcom/github/mikephil/charting/animation/EasingFunction;

    goto :goto_0

    :pswitch_e
    sget-object v0, Lcom/github/mikephil/charting/animation/Easing$EasingFunctions;->EaseInOutExpo:Lcom/github/mikephil/charting/animation/EasingFunction;

    goto :goto_0

    :pswitch_f
    sget-object v0, Lcom/github/mikephil/charting/animation/Easing$EasingFunctions;->EaseInCirc:Lcom/github/mikephil/charting/animation/EasingFunction;

    goto :goto_0

    :pswitch_10
    sget-object v0, Lcom/github/mikephil/charting/animation/Easing$EasingFunctions;->EaseOutCirc:Lcom/github/mikephil/charting/animation/EasingFunction;

    goto :goto_0

    :pswitch_11
    sget-object v0, Lcom/github/mikephil/charting/animation/Easing$EasingFunctions;->EaseInOutCirc:Lcom/github/mikephil/charting/animation/EasingFunction;

    goto :goto_0

    :pswitch_12
    sget-object v0, Lcom/github/mikephil/charting/animation/Easing$EasingFunctions;->EaseInElastic:Lcom/github/mikephil/charting/animation/EasingFunction;

    goto :goto_0

    :pswitch_13
    sget-object v0, Lcom/github/mikephil/charting/animation/Easing$EasingFunctions;->EaseOutElastic:Lcom/github/mikephil/charting/animation/EasingFunction;

    goto :goto_0

    :pswitch_14
    sget-object v0, Lcom/github/mikephil/charting/animation/Easing$EasingFunctions;->EaseInOutElastic:Lcom/github/mikephil/charting/animation/EasingFunction;

    goto :goto_0

    :pswitch_15
    sget-object v0, Lcom/github/mikephil/charting/animation/Easing$EasingFunctions;->EaseInBack:Lcom/github/mikephil/charting/animation/EasingFunction;

    goto :goto_0

    :pswitch_16
    sget-object v0, Lcom/github/mikephil/charting/animation/Easing$EasingFunctions;->EaseOutBack:Lcom/github/mikephil/charting/animation/EasingFunction;

    goto :goto_0

    :pswitch_17
    sget-object v0, Lcom/github/mikephil/charting/animation/Easing$EasingFunctions;->EaseInOutBack:Lcom/github/mikephil/charting/animation/EasingFunction;

    goto :goto_0

    :pswitch_18
    sget-object v0, Lcom/github/mikephil/charting/animation/Easing$EasingFunctions;->EaseInBounce:Lcom/github/mikephil/charting/animation/EasingFunction;

    goto :goto_0

    :pswitch_19
    sget-object v0, Lcom/github/mikephil/charting/animation/Easing$EasingFunctions;->EaseOutBounce:Lcom/github/mikephil/charting/animation/EasingFunction;

    goto :goto_0

    :pswitch_1a
    sget-object v0, Lcom/github/mikephil/charting/animation/Easing$EasingFunctions;->EaseInOutBounce:Lcom/github/mikephil/charting/animation/EasingFunction;

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_a
        :pswitch_b
        :pswitch_c
        :pswitch_d
        :pswitch_e
        :pswitch_f
        :pswitch_10
        :pswitch_11
        :pswitch_12
        :pswitch_13
        :pswitch_14
        :pswitch_15
        :pswitch_16
        :pswitch_17
        :pswitch_18
        :pswitch_19
        :pswitch_1a
    .end packed-switch
.end method
