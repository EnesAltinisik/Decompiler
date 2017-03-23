package com.pinarsu.siparis.ui.fragment;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import com.google.android.gms.identity.intents.AddressConstants.ErrorCodes;
import com.pinarsu.siparis.R;
import com.pinarsu.siparis.adapter.ReminderAdapter;
import com.pinarsu.siparis.interfaces.IDelegateOneObjectLister;
import com.pinarsu.siparis.interfaces.IOnItemViewClickListener;
import com.pinarsu.siparis.tools.PermissionHelper;
import com.pinarsu.siparis.tools.ToastHelper;
import com.pinarsu.siparis.tools.calendarevent.CalendarItem;
import com.pinarsu.siparis.tools.calendarevent.CalendarTool;
import com.pinarsu.siparis.ui.activity.AddReminderActivity;
import java.io.Serializable;
import java.util.List;

@SuppressLint({"ParcelCreator"})
public class ReminderFragment extends BaseFragment implements IDelegateOneObjectLister, IOnItemViewClickListener {
    CalendarTool calendarTool;
    private long eventID;
    List<CalendarItem> list;
    @InjectView(2131558581)
    ListView lv;
    PermissionHelper permissionHelper;
    @InjectView(2131558660)
    TextView tvNoRecord;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.activity.setTitle(0);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ButterKnife.inject(this, view);
        this.calendarTool = new CalendarTool(this.activity);
        this.permissionHelper = new PermissionHelper(this.activity);
        if (this.permissionHelper.isAndroidVersion6AndGreater()) {
            String[] strArr = new String[]{"android.permission.WRITE_CALENDAR", "android.permission.READ_CALENDAR"};
            if (this.permissionHelper.checkPermissionGranted(strArr)) {
                setView();
                return;
            } else {
                this.permissionHelper.requestPermissions(strArr);
                return;
            }
        }
        setView();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    public void onDetach() {
        super.onDetach();
    }

    public int getLayoutResource() {
        return R.layout.activity_reminder;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
    }

    private void setView() {
        if (this.permissionHelper.isAndroidVersion6AndGreater()) {
            if (this.permissionHelper.checkPermissionGranted(new String[]{"android.permission.WRITE_CALENDAR", "android.permission.READ_CALENDAR"})) {
                InfoCallAlertDialogFragment.show(this.activity, "Hatırlatma ekleyebilmek için izin veriniz.");
                return;
            }
        }
        this.calendarTool.deleteEventPassedTime();
        this.list = this.calendarTool.getAllEventList(false);
        if (this.list == null || this.list.size() <= 0) {
            this.lv.setAdapter(null);
            this.tvNoRecord.setVisibility(0);
            return;
        }
        this.tvNoRecord.setVisibility(4);
        this.lv.setAdapter(new ReminderAdapter(this.activity, this.list, this));
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (this.permissionHelper.onRequestPermissionsResult(i, strArr, iArr)) {
            setView();
        }
    }

    @OnClick({2131558582})
    void clickAdd() {
        startActivityForResult(new Intent(this.activity, AddReminderActivity.class), ErrorCodes.ERROR_CODE_NO_APPLICABLE_ADDRESSES);
    }

    public void onItemClick(View view, int i) {
        if (view.getId() == R.id.imEdit) {
            Log.d("MNTTAG", "positiononClick : " + i);
            Intent intent = new Intent(this.activity, AddReminderActivity.class);
            intent.putExtra("item", (Serializable) this.list.get(i));
            startActivityForResult(intent, ErrorCodes.ERROR_CODE_NO_APPLICABLE_ADDRESSES);
            return;
        }
        this.eventID = ((CalendarItem) this.list.get(i)).eventID.longValue();
        YesOrNoFragment.show(this.activity, this, "Silmek istediğinizden emin misiniz?", ((CalendarItem) this.list.get(i)).title);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == ErrorCodes.ERROR_CODE_NO_APPLICABLE_ADDRESSES) {
            setView();
        }
    }

    public void onObject(Object obj, int i) {
        if (obj != null && ((Boolean) obj).booleanValue()) {
            this.calendarTool.deleteEvent(this.eventID);
            setView();
            new ToastHelper(this.activity, "Hatırlatma başarıyla silindi.").show();
        }
    }
}
