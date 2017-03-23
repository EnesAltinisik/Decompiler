package com.pinarsu.siparis.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.pinarsu.siparis.R;
import com.pinarsu.siparis.model.data.ANKET_ARAMA_PARENT;

public class SurveyPreviewActivity extends AppCompatActivity {
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_survey_preview);
        ButterKnife.inject((Activity) this);
    }

    @OnClick({2131558646})
    void tvClose() {
        finish();
    }

    @OnClick({2131558645})
    void fillSurvey() {
        startActivity(new Intent(this, SurveyActivity.class).putExtra("parent", (ANKET_ARAMA_PARENT) getIntent().getExtras().getSerializable("parent")));
        finish();
    }
}
