.class public Lcom/pinarsu/siparis/ui/fragment/TimePickerFragment;
.super Landroid/support/v4/app/DialogFragment;
.source "TimePickerFragment.java"

# interfaces
.implements Landroid/app/TimePickerDialog$OnTimeSetListener;


# instance fields
.field private delegate:Lcom/pinarsu/siparis/interfaces/ITimePickerListener;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 20
    invoke-direct {p0}, Landroid/support/v4/app/DialogFragment;-><init>()V

    return-void
.end method

.method public static newInstance(Lcom/pinarsu/siparis/interfaces/IDatePickerListener;II)Lcom/pinarsu/siparis/ui/fragment/TimePickerFragment;
    .locals 3

    .prologue
    .line 25
    new-instance v0, Lcom/pinarsu/siparis/ui/fragment/TimePickerFragment;

    invoke-direct {v0}, Lcom/pinarsu/siparis/ui/fragment/TimePickerFragment;-><init>()V

    .line 26
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 27
    const-string v2, "delegate"

    invoke-virtual {v1, v2, p0}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 28
    const-string v2, "hourOfDay"

    invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 29
    const-string v2, "minute"

    invoke-virtual {v1, v2, p2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 30
    invoke-virtual {v0, v1}, Lcom/pinarsu/siparis/ui/fragment/TimePickerFragment;->setArguments(Landroid/os/Bundle;)V

    .line 31
    return-object v0
.end method


# virtual methods
.method public onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 6

    .prologue
    .line 37
    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/fragment/TimePickerFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v1

    .line 38
    const-string v0, "delegate"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/pinarsu/siparis/interfaces/ITimePickerListener;

    iput-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/TimePickerFragment;->delegate:Lcom/pinarsu/siparis/interfaces/ITimePickerListener;

    .line 39
    const-string v0, "hourOfDay"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v3

    .line 40
    const-string v0, "minute"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v4

    .line 42
    new-instance v0, Landroid/app/TimePickerDialog;

    invoke-virtual {p0}, Lcom/pinarsu/siparis/ui/fragment/TimePickerFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const/4 v5, 0x1

    move-object v2, p0

    invoke-direct/range {v0 .. v5}, Landroid/app/TimePickerDialog;-><init>(Landroid/content/Context;Landroid/app/TimePickerDialog$OnTimeSetListener;IIZ)V

    return-object v0
.end method

.method public onTimeSet(Landroid/widget/TimePicker;II)V
    .locals 1

    .prologue
    .line 52
    iget-object v0, p0, Lcom/pinarsu/siparis/ui/fragment/TimePickerFragment;->delegate:Lcom/pinarsu/siparis/interfaces/ITimePickerListener;

    invoke-interface {v0, p2, p3}, Lcom/pinarsu/siparis/interfaces/ITimePickerListener;->onTimeSet(II)V

    .line 53
    return-void
.end method

.method public show(Landroid/support/v7/app/AppCompatActivity;)V
    .locals 2

    .prologue
    .line 46
    invoke-virtual {p1}, Landroid/support/v7/app/AppCompatActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    .line 47
    const-string v1, "Date Picker"

    invoke-virtual {p0, v0, v1}, Lcom/pinarsu/siparis/ui/fragment/TimePickerFragment;->show(Landroid/support/v4/app/FragmentManager;Ljava/lang/String;)V

    .line 48
    return-void
.end method
