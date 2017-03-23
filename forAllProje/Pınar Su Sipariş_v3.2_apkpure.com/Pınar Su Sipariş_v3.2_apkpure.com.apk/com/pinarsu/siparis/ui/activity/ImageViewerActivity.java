package com.pinarsu.siparis.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import butterknife.ButterKnife;
import butterknife.InjectView;
import com.google.android.gms.plus.PlusShare;
import com.pinarsu.siparis.R;
import com.pinarsu.siparis.view.gestureimageview.GestureImageView;
import com.squareup.picasso.Picasso;

public class ImageViewerActivity extends AppCompatActivity {
    @InjectView(2131558612)
    GestureImageView im;
    private String url;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_imageviewer);
        ButterKnife.inject((Activity) this);
        this.url = getIntent().getExtras().getString(PlusShare.KEY_CALL_TO_ACTION_URL).replace(" ", "%20");
        Picasso.with(this).load(this.url).into(this.im);
    }
}
