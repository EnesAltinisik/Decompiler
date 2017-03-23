.class public Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;
.super Lcom/pinarsu/siparis/ui/activity/BaseActivity;
.source "AddReminderActivity.java"

# interfaces
.implements Lcom/pinarsu/siparis/interfaces/IDatePickerListener;
.implements Lcom/pinarsu/siparis/interfaces/ITimePickerListener;


# instance fields
.field calendarTool:Lcom/pinarsu/siparis/tools/calendarevent/CalendarTool;

.field day:I

.field edDesc:Landroid/widget/EditText;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00ad
    .end annotation
.end field

.field hourOfDay:I

.field item:Lcom/pinarsu/siparis/tools/calendarevent/CalendarItem;

.field minute:I

.field month:I

.field private thisDay:I

.field private thisHourOfDay:I

.field private thisMinute:I

.field private thisMonth:I

.field private thisYear:I

.field tvAddReminder:Landroid/widget/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00ae
    .end annotation
.end field

.field tvSelectedDate:Landroid/widget/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00ac
    .end annotation
.end field

.field tvTime:Landroid/widget/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00aa
    .end annotation
.end field

.field year:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 34
    invoke-direct {p0}, Lcom/pinarsu/siparis/ui/activity/BaseActivity;-><init>()V

    .line 55
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->item:Lcom/pinarsu/siparis/tools/calendarevent/CalendarItem;

    return-void
.end method

.method private setDate()V
    .locals 4

    .prologue
    .line 194
    const-string v0, "%02d"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget v3, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->day:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 196
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/pinarsu/siparis/tools/DateTimeTool;->MONTHS:[Ljava/lang/String;

    iget v2, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->month:I

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->year:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 197
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->tvSelectedDate:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 198
    return-void
.end method


# virtual methods
.method clickAddReminder()V
    .locals 14
    .annotation build Lbutterknife/OnClick;
        value = {
            0x7f0d00ae
        }
    .end annotation

    .prologue
    const-wide/16 v8, 0x0

    const/4 v13, -0x1

    .line 121
    const v0, 0x7f060051

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 123
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 124
    new-instance v0, Lcom/pinarsu/siparis/tools/ToastHelper;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->activity:Lcom/pinarsu/siparis/ui/activity/BaseActivity;

    const-string v2, "Hat\u0131rlatma Ba\u015fl\u0131\u011f\u0131 bo\u015f b\u0131rak\u0131lamaz"

    invoke-direct {v0, v1, v2}, Lcom/pinarsu/siparis/tools/ToastHelper;-><init>(Landroid/app/Activity;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/pinarsu/siparis/tools/ToastHelper;->show()V

    .line 179
    :goto_0
    return-void

    .line 128
    :cond_0
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    .line 129
    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Ljava/util/Calendar;->get(I)I

    move-result v2

    iput v2, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->thisYear:I

    .line 130
    const/4 v2, 0x2

    invoke-virtual {v0, v2}, Ljava/util/Calendar;->get(I)I

    move-result v2

    iput v2, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->thisMonth:I

    .line 131
    const/4 v2, 0x5

    invoke-virtual {v0, v2}, Ljava/util/Calendar;->get(I)I

    move-result v2

    iput v2, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->thisDay:I

    .line 132
    const/16 v2, 0xb

    invoke-virtual {v0, v2}, Ljava/util/Calendar;->get(I)I

    move-result v2

    iput v2, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->thisHourOfDay:I

    .line 133
    const/16 v2, 0xc

    invoke-virtual {v0, v2}, Ljava/util/Calendar;->get(I)I

    move-result v0

    iput v0, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->thisMinute:I

    .line 135
    iget v0, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->thisMinute:I

    add-int/lit8 v0, v0, 0x1

    .line 137
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget v3, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->thisDay:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->thisMonth:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->thisYear:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->thisHourOfDay:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ":"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ":00"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 138
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget v3, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->day:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->month:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->year:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->hourOfDay:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ":"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->minute:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ":00"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 139
    sget-object v3, Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;->DATETIME:Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;

    invoke-static {v0, v3}, Lcom/pinarsu/siparis/tools/DateTimeTool;->getDateTime(Ljava/lang/String;Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;)Ljava/util/Calendar;

    move-result-object v0

    .line 140
    sget-object v3, Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;->DATETIME:Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;

    invoke-static {v2, v3}, Lcom/pinarsu/siparis/tools/DateTimeTool;->getDateTime(Ljava/lang/String;Lcom/pinarsu/siparis/tools/DateTimeTool$DATETIMEFORMAT;)Ljava/util/Calendar;

    move-result-object v2

    .line 141
    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v4

    .line 142
    invoke-virtual {v2}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v2

    .line 143
    cmp-long v0, v4, v2

    if-lez v0, :cond_1

    .line 144
    new-instance v0, Lcom/pinarsu/siparis/tools/ToastHelper;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->activity:Lcom/pinarsu/siparis/ui/activity/BaseActivity;

    const-string v2, "Ge\u00e7mi\u015f tarihe Hat\u0131rlatma ekleyemezsiniz."

    invoke-direct {v0, v1, v2}, Lcom/pinarsu/siparis/tools/ToastHelper;-><init>(Landroid/app/Activity;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/pinarsu/siparis/tools/ToastHelper;->show()V

    goto/16 :goto_0

    .line 148
    :cond_1
    const-string v0, "android.permission.WRITE_CALENDAR"

    invoke-static {p0, v0}, Landroid/support/v4/app/ActivityCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_2

    .line 149
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->activity:Lcom/pinarsu/siparis/ui/activity/BaseActivity;

    const-string v1, "Hat\u0131rlatma ekleyebilmek i\u00e7in izin veriniz."

    invoke-static {v0, v1}, Lcom/pinarsu/siparis/ui/fragment/InfoCallAlertDialogFragment;->show(Landroid/support/v7/app/AppCompatActivity;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 153
    :cond_2
    const-string v0, ""

    .line 154
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->edDesc:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    .line 156
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->item:Lcom/pinarsu/siparis/tools/calendarevent/CalendarItem;

    if-nez v0, :cond_3

    .line 157
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->calendarTool:Lcom/pinarsu/siparis/tools/calendarevent/CalendarTool;

    iget v3, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->year:I

    iget v4, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->month:I

    iget v5, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->day:I

    iget v6, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->hourOfDay:I

    iget v7, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->minute:I

    invoke-virtual/range {v0 .. v7}, Lcom/pinarsu/siparis/tools/calendarevent/CalendarTool;->createEvent(Ljava/lang/String;Ljava/lang/String;IIIII)Ljava/lang/Long;

    move-result-object v0

    .line 159
    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    cmp-long v1, v2, v8

    if-lez v1, :cond_4

    .line 160
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->calendarTool:Lcom/pinarsu/siparis/tools/calendarevent/CalendarTool;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/pinarsu/siparis/tools/calendarevent/CalendarTool;->createReminder(J)Ljava/lang/Long;

    move-result-object v0

    .line 161
    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    cmp-long v0, v0, v8

    if-lez v0, :cond_4

    .line 162
    new-instance v0, Lcom/pinarsu/siparis/tools/ToastHelper;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->activity:Lcom/pinarsu/siparis/ui/activity/BaseActivity;

    const-string v2, "Hat\u0131rlatma kaydedildi."

    invoke-direct {v0, v1, v2}, Lcom/pinarsu/siparis/tools/ToastHelper;-><init>(Landroid/app/Activity;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/pinarsu/siparis/tools/ToastHelper;->show()V

    .line 163
    invoke-virtual {p0, v13}, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->setResult(I)V

    .line 164
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->finish()V

    goto/16 :goto_0

    .line 169
    :cond_3
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->item:Lcom/pinarsu/siparis/tools/calendarevent/CalendarItem;

    iget-object v0, v0, Lcom/pinarsu/siparis/tools/calendarevent/CalendarItem;->eventID:Ljava/lang/Long;

    .line 170
    iget-object v3, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->calendarTool:Lcom/pinarsu/siparis/tools/calendarevent/CalendarTool;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    iget v8, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->year:I

    iget v9, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->month:I

    iget v10, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->day:I

    iget v11, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->hourOfDay:I

    iget v12, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->minute:I

    move-object v6, v1

    move-object v7, v2

    invoke-virtual/range {v3 .. v12}, Lcom/pinarsu/siparis/tools/calendarevent/CalendarTool;->updateEvent(JLjava/lang/String;Ljava/lang/String;IIIII)I

    move-result v0

    .line 171
    if-lez v0, :cond_4

    .line 172
    new-instance v0, Lcom/pinarsu/siparis/tools/ToastHelper;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->activity:Lcom/pinarsu/siparis/ui/activity/BaseActivity;

    const-string v2, "Hat\u0131rlatma g\u00fcncellendi."

    invoke-direct {v0, v1, v2}, Lcom/pinarsu/siparis/tools/ToastHelper;-><init>(Landroid/app/Activity;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/pinarsu/siparis/tools/ToastHelper;->show()V

    .line 173
    invoke-virtual {p0, v13}, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->setResult(I)V

    .line 174
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->finish()V

    goto/16 :goto_0

    .line 178
    :cond_4
    new-instance v0, Lcom/pinarsu/siparis/tools/ToastHelper;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->activity:Lcom/pinarsu/siparis/ui/activity/BaseActivity;

    const-string v2, "Hat\u0131rlatma kaydetme ba\u015far\u0131s\u0131z."

    invoke-direct {v0, v1, v2}, Lcom/pinarsu/siparis/tools/ToastHelper;-><init>(Landroid/app/Activity;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/pinarsu/siparis/tools/ToastHelper;->show()V

    goto/16 :goto_0
.end method

.method clickLinearSelectCalendar()V
    .locals 3
    .annotation build Lbutterknife/OnClick;
        value = {
            0x7f0d00ab
        }
    .end annotation

    .prologue
    .line 109
    iget v0, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->year:I

    iget v1, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->month:I

    iget v2, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->day:I

    invoke-static {p0, v0, v1, v2}, Lcom/pinarsu/siparis/ui/fragment/DatePickerFragment;->newInstance(Lcom/pinarsu/siparis/interfaces/IDatePickerListener;III)Lcom/pinarsu/siparis/ui/fragment/DatePickerFragment;

    move-result-object v0

    .line 110
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->activity:Lcom/pinarsu/siparis/ui/activity/BaseActivity;

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/ui/fragment/DatePickerFragment;->show(Landroid/support/v7/app/AppCompatActivity;)V

    .line 111
    return-void
.end method

.method clickLinearTime()V
    .locals 2
    .annotation build Lbutterknife/OnClick;
        value = {
            0x7f0d00a9
        }
    .end annotation

    .prologue
    .line 115
    iget v0, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->hourOfDay:I

    iget v1, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->minute:I

    invoke-static {p0, v0, v1}, Lcom/pinarsu/siparis/ui/fragment/TimePickerFragment;->newInstance(Lcom/pinarsu/siparis/interfaces/IDatePickerListener;II)Lcom/pinarsu/siparis/ui/fragment/TimePickerFragment;

    move-result-object v0

    .line 116
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->activity:Lcom/pinarsu/siparis/ui/activity/BaseActivity;

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/ui/fragment/TimePickerFragment;->show(Landroid/support/v7/app/AppCompatActivity;)V

    .line 117
    return-void
.end method

.method public getLayoutResource()I
    .locals 1

    .prologue
    .line 104
    const v0, 0x7f030019

    return v0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 9

    .prologue
    const/16 v8, 0xc

    const/16 v7, 0xb

    const/4 v6, 0x5

    const/4 v5, 0x2

    const/4 v4, 0x1

    .line 59
    invoke-super {p0, p1}, Lcom/pinarsu/siparis/ui/activity/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 61
    const v0, 0x7f060099

    invoke-virtual {p0, v0}, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->setTitle(I)V

    .line 62
    invoke-static {p0}, Lbutterknife/ButterKnife;->inject(Landroid/app/Activity;)V

    .line 63
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    .line 64
    if-eqz v0, :cond_0

    const-string v1, "item"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 65
    const-string v1, "item"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/tools/calendarevent/CalendarItem;

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->item:Lcom/pinarsu/siparis/tools/calendarevent/CalendarItem;

    .line 68
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->edDesc:Landroid/widget/EditText;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->item:Lcom/pinarsu/siparis/tools/calendarevent/CalendarItem;

    iget-object v2, v2, Lcom/pinarsu/siparis/tools/calendarevent/CalendarItem;->description:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 69
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->tvAddReminder:Landroid/widget/TextView;

    const-string v1, "D\u00fczenlemeyi Bitir"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 72
    :cond_0
    new-instance v0, Lcom/pinarsu/siparis/tools/calendarevent/CalendarTool;

    invoke-direct {v0, p0}, Lcom/pinarsu/siparis/tools/calendarevent/CalendarTool;-><init>(Landroid/support/v7/app/AppCompatActivity;)V

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->calendarTool:Lcom/pinarsu/siparis/tools/calendarevent/CalendarTool;

    .line 75
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    .line 76
    invoke-virtual {v0, v4}, Ljava/util/Calendar;->get(I)I

    move-result v1

    iput v1, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->thisYear:I

    .line 77
    invoke-virtual {v0, v5}, Ljava/util/Calendar;->get(I)I

    move-result v1

    iput v1, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->thisMonth:I

    .line 78
    invoke-virtual {v0, v6}, Ljava/util/Calendar;->get(I)I

    move-result v1

    iput v1, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->thisDay:I

    .line 79
    invoke-virtual {v0, v7}, Ljava/util/Calendar;->get(I)I

    move-result v1

    iput v1, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->thisHourOfDay:I

    .line 80
    invoke-virtual {v0, v8}, Ljava/util/Calendar;->get(I)I

    move-result v1

    iput v1, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->thisMinute:I

    .line 82
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->item:Lcom/pinarsu/siparis/tools/calendarevent/CalendarItem;

    if-nez v1, :cond_1

    .line 83
    iget v0, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->thisYear:I

    iput v0, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->year:I

    .line 84
    iget v0, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->thisMonth:I

    iput v0, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->month:I

    .line 85
    iget v0, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->thisDay:I

    iput v0, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->day:I

    .line 86
    iget v0, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->thisHourOfDay:I

    iput v0, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->hourOfDay:I

    .line 87
    iget v0, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->thisMinute:I

    iput v0, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->minute:I

    .line 96
    :goto_0
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->setTime()V

    .line 97
    invoke-direct {p0}, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->setDate()V

    .line 99
    return-void

    .line 89
    :cond_1
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->item:Lcom/pinarsu/siparis/tools/calendarevent/CalendarItem;

    iget-object v1, v1, Lcom/pinarsu/siparis/tools/calendarevent/CalendarItem;->start:Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 90
    invoke-virtual {v0, v4}, Ljava/util/Calendar;->get(I)I

    move-result v1

    iput v1, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->year:I

    .line 91
    invoke-virtual {v0, v5}, Ljava/util/Calendar;->get(I)I

    move-result v1

    iput v1, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->month:I

    .line 92
    invoke-virtual {v0, v6}, Ljava/util/Calendar;->get(I)I

    move-result v1

    iput v1, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->day:I

    .line 93
    invoke-virtual {v0, v7}, Ljava/util/Calendar;->get(I)I

    move-result v1

    iput v1, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->hourOfDay:I

    .line 94
    invoke-virtual {v0, v8}, Ljava/util/Calendar;->get(I)I

    move-result v0

    iput v0, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->minute:I

    goto :goto_0
.end method

.method public onDateSet(III)V
    .locals 3

    .prologue
    .line 184
    iput p1, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->year:I

    .line 185
    iput p2, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->month:I

    .line 186
    iput p3, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->day:I

    .line 187
    invoke-direct {p0}, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->setDate()V

    .line 188
    const-string v0, "MNTTAG"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "year : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 189
    const-string v0, "MNTTAG"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "month : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 190
    const-string v0, "MNTTAG"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "day : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 191
    return-void
.end method

.method public onTimeSet(II)V
    .locals 3

    .prologue
    .line 202
    iput p1, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->hourOfDay:I

    .line 203
    iput p2, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->minute:I

    .line 204
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->setTime()V

    .line 205
    const-string v0, "MNTTAG"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "hourOfDay : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 206
    const-string v0, "MNTTAG"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "minute : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 207
    return-void
.end method

.method setTime()V
    .locals 5

    .prologue
    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 210
    const-string v0, "%02d"

    new-array v1, v3, [Ljava/lang/Object;

    iget v2, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->hourOfDay:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v4

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 211
    const-string v1, "%02d"

    new-array v2, v3, [Ljava/lang/Object;

    iget v3, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->minute:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 213
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ":"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 214
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;->tvTime:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 215
    return-void
.end method
