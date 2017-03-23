package com.google.android.gms.fitness;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.zzc;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.request.DataDeleteRequest;
import com.google.android.gms.fitness.request.DataReadRequest;
import com.google.android.gms.fitness.request.DataUpdateRequest;
import com.google.android.gms.fitness.result.DailyTotalResult;
import com.google.android.gms.fitness.result.DataReadResult;
import java.util.concurrent.TimeUnit;

public interface HistoryApi {

    public static class ViewIntentBuilder {
        private final Context mContext;
        private long zzXy;
        private final DataType zzaCH;
        private DataSource zzaCI;
        private long zzaCJ;
        private String zzaCK;

        public ViewIntentBuilder(Context context, DataType dataType) {
            this.mContext = context;
            this.zzaCH = dataType;
        }

        private Intent zzk(Intent intent) {
            if (this.zzaCK == null) {
                return intent;
            }
            Intent intent2 = new Intent(intent).setPackage(this.zzaCK);
            ResolveInfo resolveActivity = this.mContext.getPackageManager().resolveActivity(intent2, 0);
            if (resolveActivity == null) {
                return intent;
            }
            intent2.setComponent(new ComponentName(this.zzaCK, resolveActivity.activityInfo.name));
            return intent2;
        }

        public Intent build() {
            boolean z = true;
            zzaa.zza(this.zzXy > 0, (Object) "Start time must be set");
            if (this.zzaCJ <= this.zzXy) {
                z = false;
            }
            zzaa.zza(z, (Object) "End time must be set and after start time");
            Intent intent = new Intent(Fitness.ACTION_VIEW);
            intent.setType(DataType.getMimeType(this.zzaCI.getDataType()));
            intent.putExtra(Fitness.EXTRA_START_TIME, this.zzXy);
            intent.putExtra(Fitness.EXTRA_END_TIME, this.zzaCJ);
            zzc.zza(this.zzaCI, intent, DataSource.EXTRA_DATA_SOURCE);
            return zzk(intent);
        }

        public ViewIntentBuilder setDataSource(DataSource dataSource) {
            zzaa.zzb(dataSource.getDataType().equals(this.zzaCH), "Data source %s is not for the data type %s", dataSource, this.zzaCH);
            this.zzaCI = dataSource;
            return this;
        }

        public ViewIntentBuilder setPreferredApplication(String str) {
            this.zzaCK = str;
            return this;
        }

        public ViewIntentBuilder setTimeInterval(long j, long j2, TimeUnit timeUnit) {
            this.zzXy = timeUnit.toMillis(j);
            this.zzaCJ = timeUnit.toMillis(j2);
            return this;
        }
    }

    PendingResult<Status> deleteData(GoogleApiClient googleApiClient, DataDeleteRequest dataDeleteRequest);

    PendingResult<Status> insertData(GoogleApiClient googleApiClient, DataSet dataSet);

    PendingResult<DailyTotalResult> readDailyTotal(GoogleApiClient googleApiClient, DataType dataType);

    PendingResult<DataReadResult> readData(GoogleApiClient googleApiClient, DataReadRequest dataReadRequest);

    PendingResult<Status> updateData(GoogleApiClient googleApiClient, DataUpdateRequest dataUpdateRequest);
}
