.class public Lcom/pinarsu/siparis/adapter/ReminderAdapter;
.super Landroid/widget/BaseAdapter;
.source "ReminderAdapter.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pinarsu/siparis/adapter/ReminderAdapter$ViewHolder;
    }
.end annotation


# instance fields
.field activity:Landroid/app/Activity;

.field delegate:Lcom/pinarsu/siparis/interfaces/IOnItemViewClickListener;

.field item:Lcom/pinarsu/siparis/tools/calendarevent/CalendarItem;

.field list:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/pinarsu/siparis/tools/calendarevent/CalendarItem;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/app/Activity;Ljava/util/List;Lcom/pinarsu/siparis/interfaces/IOnItemViewClickListener;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Ljava/util/List",
            "<",
            "Lcom/pinarsu/siparis/tools/calendarevent/CalendarItem;",
            ">;",
            "Lcom/pinarsu/siparis/interfaces/IOnItemViewClickListener;",
            ")V"
        }
    .end annotation

    .prologue
    .line 36
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 37
    iput-object p1, p0, Lcom/pinarsu/siparis/adapter/ReminderAdapter;->activity:Landroid/app/Activity;

    .line 38
    iput-object p2, p0, Lcom/pinarsu/siparis/adapter/ReminderAdapter;->list:Ljava/util/List;

    .line 39
    iput-object p3, p0, Lcom/pinarsu/siparis/adapter/ReminderAdapter;->delegate:Lcom/pinarsu/siparis/interfaces/IOnItemViewClickListener;

    .line 40
    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/ReminderAdapter;->list:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/ReminderAdapter;->list:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .prologue
    .line 55
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 61
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/ReminderAdapter;->activity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    .line 65
    if-nez p2, :cond_0

    .line 66
    new-instance v1, Lcom/pinarsu/siparis/adapter/ReminderAdapter$ViewHolder;

    invoke-direct {v1}, Lcom/pinarsu/siparis/adapter/ReminderAdapter$ViewHolder;-><init>()V

    .line 67
    const v2, 0x7f03006f

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 69
    const v0, 0x7f0d00b1

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lcom/pinarsu/siparis/adapter/ReminderAdapter$ViewHolder;->tvTitle:Landroid/widget/TextView;

    .line 72
    const v0, 0x7f0d0101

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lcom/pinarsu/siparis/adapter/ReminderAdapter$ViewHolder;->tvDetail:Landroid/widget/TextView;

    .line 74
    const v0, 0x7f0d014b

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lcom/pinarsu/siparis/adapter/ReminderAdapter$ViewHolder;->imEdit:Landroid/widget/ImageView;

    .line 75
    const v0, 0x7f0d014c

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lcom/pinarsu/siparis/adapter/ReminderAdapter$ViewHolder;->imDelete:Landroid/widget/ImageView;

    .line 77
    invoke-virtual {p2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 80
    :goto_0
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/ReminderAdapter;->list:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/tools/calendarevent/CalendarItem;

    iput-object v0, p0, Lcom/pinarsu/siparis/adapter/ReminderAdapter;->item:Lcom/pinarsu/siparis/tools/calendarevent/CalendarItem;

    .line 82
    iget-object v0, p0, Lcom/pinarsu/siparis/adapter/ReminderAdapter;->item:Lcom/pinarsu/siparis/tools/calendarevent/CalendarItem;

    iget-object v0, v0, Lcom/pinarsu/siparis/tools/calendarevent/CalendarItem;->start:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-static {v2, v3}, Lcom/pinarsu/siparis/tools/DateTimeTool;->getCalendarFromTimeMillis(J)Ljava/util/Calendar;

    move-result-object v0

    .line 84
    sget-object v2, Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;->AROX2:Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;

    invoke-static {v0, v2}, Lcom/pinarsu/siparis/tools/DateTimeTool;->getDateWithFormat(Ljava/util/Calendar;Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;)Ljava/lang/String;

    move-result-object v2

    .line 86
    new-instance v3, Landroid/text/SpannableString;

    invoke-direct {v3, v2}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 87
    new-instance v2, Landroid/text/style/UnderlineSpan;

    invoke-direct {v2}, Landroid/text/style/UnderlineSpan;-><init>()V

    invoke-virtual {v3}, Landroid/text/SpannableString;->length()I

    move-result v4

    invoke-virtual {v3, v2, v5, v4, v5}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 88
    iget-object v2, v1, Lcom/pinarsu/siparis/adapter/ReminderAdapter$ViewHolder;->tvTitle:Landroid/widget/TextView;

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 90
    sget-object v2, Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;->ONLYTIME_WITHOUT_SECOND:Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;

    invoke-static {v0, v2}, Lcom/pinarsu/siparis/tools/DateTimeTool;->getDateWithFormat(Ljava/util/Calendar;Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;)Ljava/lang/String;

    move-result-object v0

    .line 91
    iget-object v2, v1, Lcom/pinarsu/siparis/adapter/ReminderAdapter$ViewHolder;->tvDetail:Landroid/widget/TextView;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, " - "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v3, p0, Lcom/pinarsu/siparis/adapter/ReminderAdapter;->item:Lcom/pinarsu/siparis/tools/calendarevent/CalendarItem;

    iget-object v3, v3, Lcom/pinarsu/siparis/tools/calendarevent/CalendarItem;->description:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 92
    iget-object v0, v1, Lcom/pinarsu/siparis/adapter/ReminderAdapter$ViewHolder;->imEdit:Landroid/widget/ImageView;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    .line 93
    iget-object v0, v1, Lcom/pinarsu/siparis/adapter/ReminderAdapter$ViewHolder;->imEdit:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 94
    iget-object v0, v1, Lcom/pinarsu/siparis/adapter/ReminderAdapter$ViewHolder;->imDelete:Landroid/widget/ImageView;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    .line 95
    iget-object v0, v1, Lcom/pinarsu/siparis/adapter/ReminderAdapter$ViewHolder;->imDelete:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 97
    return-object p2

    .line 79
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/adapter/ReminderAdapter$ViewHolder;

    move-object v1, v0

    goto :goto_0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 102
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 103
    iget-object v1, p0, Lcom/pinarsu/siparis/adapter/ReminderAdapter;->delegate:Lcom/pinarsu/siparis/interfaces/IOnItemViewClickListener;

    invoke-interface {v1, p1, v0}, Lcom/pinarsu/siparis/interfaces/IOnItemViewClickListener;->onItemClick(Landroid/view/View;I)V

    .line 104
    return-void
.end method
