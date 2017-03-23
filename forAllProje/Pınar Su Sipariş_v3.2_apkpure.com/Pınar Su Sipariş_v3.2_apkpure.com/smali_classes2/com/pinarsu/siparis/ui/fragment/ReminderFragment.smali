.class public Lcom/pinarsu/siparis/ui/fragment/ReminderFragment;
.super Lcom/pinarsu/siparis/ui/fragment/BaseFragment;
.source "ReminderFragment.java"

# interfaces
.implements Lcom/pinarsu/siparis/interfaces/IDelegateOneObjectLister;
.implements Lcom/pinarsu/siparis/interfaces/IOnItemViewClickListener;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ParcelCreator"
    }
.end annotation


# instance fields
.field calendarTool:Lcom/pinarsu/siparis/tools/calendarevent/CalendarTool;

.field private eventID:J

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

.field lv:Landroid/widget/ListView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d00b5
    .end annotation
.end field

.field permissionHelper:Lcom/pinarsu/siparis/tools/PermissionHelper;

.field tvNoRecord:Landroid/widget/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0d0104
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 48
    invoke-direct {p0}, Lcom/pinarsu/siparis/ui/fragment/BaseFragment;-><init>()V

    .line 50
    return-void
.end method

.method private setView()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 121
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/ReminderFragment;->permissionHelper:Lcom/pinarsu/siparis/tools/PermissionHelper;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/tools/PermissionHelper;->isAndroidVersion6AndGreater()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 122
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "android.permission.WRITE_CALENDAR"

    aput-object v1, v0, v3

    const/4 v1, 0x1

    const-string v2, "android.permission.READ_CALENDAR"

    aput-object v2, v0, v1

    .line 125
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/ReminderFragment;->permissionHelper:Lcom/pinarsu/siparis/tools/PermissionHelper;

    invoke-virtual {v1, v0}, Lcom/pinarsu/siparis/tools/PermissionHelper;->checkPermissionGranted([Ljava/lang/String;)Z

    move-result v0

    .line 126
    if-eqz v0, :cond_0

    .line 127
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/ReminderFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    const-string v1, "Hat\u0131rlatma ekleyebilmek i\u00e7in izin veriniz."

    invoke-static {v0, v1}, Lcom/pinarsu/siparis/ui/fragment/InfoCallAlertDialogFragment;->show(Landroid/support/v7/app/AppCompatActivity;Ljava/lang/String;)V

    .line 141
    :goto_0
    return-void

    .line 131
    :cond_0
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/ReminderFragment;->calendarTool:Lcom/pinarsu/siparis/tools/calendarevent/CalendarTool;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/tools/calendarevent/CalendarTool;->deleteEventPassedTime()V

    .line 132
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/ReminderFragment;->calendarTool:Lcom/pinarsu/siparis/tools/calendarevent/CalendarTool;

    invoke-virtual {v0, v3}, Lcom/pinarsu/siparis/tools/calendarevent/CalendarTool;->getAllEventList(Z)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/ReminderFragment;->list:Ljava/util/List;

    .line 133
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/ReminderFragment;->list:Ljava/util/List;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/ReminderFragment;->list:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 134
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/ReminderFragment;->tvNoRecord:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 135
    new-instance v0, Lcom/pinarsu/siparis/adapter/ReminderAdapter;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/ReminderFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    iget-object v2, p0, Lcom/pinarsu/siparis/ui/fragment/ReminderFragment;->list:Ljava/util/List;

    invoke-direct {v0, v1, v2, p0}, Lcom/pinarsu/siparis/adapter/ReminderAdapter;-><init>(Landroid/app/Activity;Ljava/util/List;Lcom/pinarsu/siparis/interfaces/IOnItemViewClickListener;)V

    .line 136
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/ReminderFragment;->lv:Landroid/widget/ListView;

    invoke-virtual {v1, v0}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    goto :goto_0

    .line 138
    :cond_1
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/ReminderFragment;->lv:Landroid/widget/ListView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 139
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/ReminderFragment;->tvNoRecord:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0
.end method


# virtual methods
.method clickAdd()V
    .locals 3
    .annotation build Lbutterknife/OnClick;
        value = {
            0x7f0d00b6
        }
    .end annotation

    .prologue
    .line 152
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/ReminderFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    const-class v2, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 154
    const/16 v1, 0x22b

    invoke-virtual {p0, v0, v1}, Lcom/pinarsu/siparis/ui/fragment/ReminderFragment;->startActivityForResult(Landroid/content/Intent;I)V

    .line 155
    return-void
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 112
    const/4 v0, 0x0

    return v0
.end method

.method public getLayoutResource()I
    .locals 1

    .prologue
    .line 102
    const v0, 0x7f030028

    return v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    .prologue
    .line 172
    invoke-super {p0, p1, p2, p3}, Lcom/pinarsu/siparis/ui/fragment/BaseFragment;->onActivityResult(IILandroid/content/Intent;)V

    .line 173
    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    .line 174
    const/16 v0, 0x22b

    if-ne p1, v0, :cond_0

    .line 175
    invoke-direct {p0}, Lcom/pinarsu/siparis/ui/fragment/ReminderFragment;->setView()V

    .line 178
    :cond_0
    return-void
.end method

.method public onAttach(Landroid/app/Activity;)V
    .locals 0

    .prologue
    .line 92
    invoke-super {p0, p1}, Lcom/pinarsu/siparis/ui/fragment/BaseFragment;->onAttach(Landroid/app/Activity;)V

    .line 93
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 54
    invoke-super {p0, p1}, Lcom/pinarsu/siparis/ui/fragment/BaseFragment;->onCreate(Landroid/os/Bundle;)V

    .line 56
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    .prologue
    .line 61
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/ReminderFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/ui/activity/MainActivity;->setTitle(I)V

    .line 62
    invoke-super {p0, p1, p2, p3}, Lcom/pinarsu/siparis/ui/fragment/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v0

    .line 64
    return-object v0
.end method

.method public onDetach()V
    .locals 0

    .prologue
    .line 97
    invoke-super {p0}, Lcom/pinarsu/siparis/ui/fragment/BaseFragment;->onDetach()V

    .line 98
    return-void
.end method

.method public onItemClick(Landroid/view/View;I)V
    .locals 3

    .prologue
    .line 159
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x7f0d014b

    if-ne v0, v1, :cond_0

    .line 160
    const-string v0, "MNTTAG"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "positiononClick : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 161
    new-instance v1, Landroid/content/Intent;

    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/ReminderFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    const-class v2, Lcom/pinarsu/siparis/ui/activity/AddReminderActivity;

    invoke-direct {v1, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 162
    const-string v2, "item"

    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/ReminderFragment;->list:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/Serializable;

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 163
    const/16 v0, 0x22b

    invoke-virtual {p0, v1, v0}, Lcom/pinarsu/siparis/ui/fragment/ReminderFragment;->startActivityForResult(Landroid/content/Intent;I)V

    .line 168
    :goto_0
    return-void

    .line 165
    :cond_0
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/ReminderFragment;->list:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/tools/calendarevent/CalendarItem;

    iget-object v0, v0, Lcom/pinarsu/siparis/tools/calendarevent/CalendarItem;->eventID:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/pinarsu/siparis/ui/fragment/ReminderFragment;->eventID:J

    .line 166
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/ReminderFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    const-string v2, "Silmek istedi\u011finizden emin misiniz?"

    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/ReminderFragment;->list:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/tools/calendarevent/CalendarItem;

    iget-object v0, v0, Lcom/pinarsu/siparis/tools/calendarevent/CalendarItem;->title:Ljava/lang/String;

    invoke-static {v1, p0, v2, v0}, Lcom/pinarsu/siparis/ui/fragment/YesOrNoFragment;->show(Landroid/support/v7/app/AppCompatActivity;Lcom/pinarsu/siparis/interfaces/IDelegateOneObjectLister;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public onObject(Ljava/lang/Object;I)V
    .locals 4

    .prologue
    .line 182
    if-nez p1, :cond_1

    .line 190
    :cond_0
    :goto_0
    return-void

    .line 184
    :cond_1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 185
    if-eqz v0, :cond_0

    .line 186
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/ReminderFragment;->calendarTool:Lcom/pinarsu/siparis/tools/calendarevent/CalendarTool;

    iget-wide v2, p0, Lcom/pinarsu/siparis/ui/fragment/ReminderFragment;->eventID:J

    invoke-virtual {v0, v2, v3}, Lcom/pinarsu/siparis/tools/calendarevent/CalendarTool;->deleteEvent(J)V

    .line 187
    invoke-direct {p0}, Lcom/pinarsu/siparis/ui/fragment/ReminderFragment;->setView()V

    .line 188
    new-instance v0, Lcom/pinarsu/siparis/tools/ToastHelper;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/ReminderFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    const-string v2, "Hat\u0131rlatma ba\u015far\u0131yla silindi."

    invoke-direct {v0, v1, v2}, Lcom/pinarsu/siparis/tools/ToastHelper;-><init>(Landroid/app/Activity;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/pinarsu/siparis/tools/ToastHelper;->show()V

    goto :goto_0
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 1

    .prologue
    .line 145
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/ReminderFragment;->permissionHelper:Lcom/pinarsu/siparis/tools/PermissionHelper;

    invoke-virtual {v0, p1, p2, p3}, Lcom/pinarsu/siparis/tools/PermissionHelper;->onRequestPermissionsResult(I[Ljava/lang/String;[I)Z

    move-result v0

    .line 146
    if-eqz v0, :cond_0

    .line 147
    invoke-direct {p0}, Lcom/pinarsu/siparis/ui/fragment/ReminderFragment;->setView()V

    .line 148
    :cond_0
    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 69
    invoke-super {p0, p1, p2}, Lcom/pinarsu/siparis/ui/fragment/BaseFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 70
    invoke-static {p0, p1}, Lbutterknife/ButterKnife;->inject(Ljava/lang/Object;Landroid/view/View;)V

    .line 71
    new-instance v0, Lcom/pinarsu/siparis/tools/calendarevent/CalendarTool;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/ReminderFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    invoke-direct {v0, v1}, Lcom/pinarsu/siparis/tools/calendarevent/CalendarTool;-><init>(Landroid/support/v7/app/AppCompatActivity;)V

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/ReminderFragment;->calendarTool:Lcom/pinarsu/siparis/tools/calendarevent/CalendarTool;

    .line 74
    new-instance v0, Lcom/pinarsu/siparis/tools/PermissionHelper;

    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/ReminderFragment;->activity:Lcom/pinarsu/siparis/ui/activity/MainActivity;

    invoke-direct {v0, v1}, Lcom/pinarsu/siparis/tools/PermissionHelper;-><init>(Landroid/app/Activity;)V

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/ReminderFragment;->permissionHelper:Lcom/pinarsu/siparis/tools/PermissionHelper;

    .line 75
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/ReminderFragment;->permissionHelper:Lcom/pinarsu/siparis/tools/PermissionHelper;

    invoke-virtual {v0}, Lcom/pinarsu/siparis/tools/PermissionHelper;->isAndroidVersion6AndGreater()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 77
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "android.permission.WRITE_CALENDAR"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "android.permission.READ_CALENDAR"

    aput-object v2, v0, v1

    .line 80
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/ReminderFragment;->permissionHelper:Lcom/pinarsu/siparis/tools/PermissionHelper;

    invoke-virtual {v1, v0}, Lcom/pinarsu/siparis/tools/PermissionHelper;->checkPermissionGranted([Ljava/lang/String;)Z

    move-result v1

    .line 81
    if-eqz v1, :cond_0

    .line 82
    invoke-direct {p0}, Lcom/pinarsu/siparis/ui/fragment/ReminderFragment;->setView()V

    .line 88
    :goto_0
    return-void

    .line 84
    :cond_0
    iget-object v1, p0, Lcom/pinarsu/siparis/ui/fragment/ReminderFragment;->permissionHelper:Lcom/pinarsu/siparis/tools/PermissionHelper;

    invoke-virtual {v1, v0}, Lcom/pinarsu/siparis/tools/PermissionHelper;->requestPermissions([Ljava/lang/String;)V

    goto :goto_0

    .line 86
    :cond_1
    invoke-direct {p0}, Lcom/pinarsu/siparis/ui/fragment/ReminderFragment;->setView()V

    goto :goto_0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .prologue
    .line 118
    return-void
.end method
