package android.support.v4.c;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;

@TargetApi(11)
class e {
    static void a(Context context, Intent[] intentArr) {
        context.startActivities(intentArr);
    }
}
