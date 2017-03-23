package com.pinarsu.siparis.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import butterknife.ButterKnife;
import com.pinarsu.siparis.R;
import com.pinarsu.siparis.ui.fragment.InfoCallAlertDialogFragment;

public class TestActivity extends AppCompatActivity {
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.test);
        ButterKnife.inject((Activity) this);
        InfoCallAlertDialogFragment.show(this, "Bu bir test verisifweewhweryhwehywerhwhwewerh werf wefwe fwef wefwefewf fewf wef wef wef wed dir.#4449333900#");
    }
}
