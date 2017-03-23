package com.pinarsu.siparis.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import com.pinarsu.siparis.R;
import com.pinarsu.siparis.view.TextView;

public class ExceptionActivity extends AppCompatActivity {
    @InjectView(2131558610)
    LinearLayout linear;
    @InjectView(2131558611)
    TextView tvError;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_exception);
        ButterKnife.inject((Activity) this);
        String str = "";
        Bundle extras = getIntent().getExtras();
        if (extras != null && extras.containsKey("error")) {
            Log.d("MNTTAG", extras.getString("error"));
        }
    }

    @OnClick({2131558610})
    void restart() {
        Intent launchIntentForPackage = getBaseContext().getPackageManager().getLaunchIntentForPackage(getBaseContext().getPackageName());
        launchIntentForPackage.addFlags(67108864);
        startActivity(launchIntentForPackage);
        finish();
    }
}
