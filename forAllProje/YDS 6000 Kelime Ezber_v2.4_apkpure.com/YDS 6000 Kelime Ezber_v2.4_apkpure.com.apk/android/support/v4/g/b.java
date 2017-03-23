package android.support.v4.g;

import android.annotation.TargetApi;
import android.os.AsyncTask;

@TargetApi(11)
class b {
    static <Params, Progress, Result> void a(AsyncTask<Params, Progress, Result> asyncTask, Params... paramsArr) {
        asyncTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, paramsArr);
    }
}
