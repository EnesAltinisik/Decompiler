package android.support.v7.app;

import android.content.Context;
import android.content.IntentSender;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.c;
import android.support.v4.media.session.c.a;
import android.support.v7.c.g;
import android.support.v7.c.g.f;
import android.support.v7.d.a.b;
import android.support.v7.d.a.d;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;

public class MediaRouteControllerDialog extends AlertDialog {
    private static final String TAG = "MediaRouteControllerDialog";
    private static final int VOLUME_UPDATE_DELAY_MILLIS = 250;
    private ImageView mArtView;
    private boolean mAttachedToWindow;
    private final MediaRouterCallback mCallback;
    private View mControlView;
    private MediaControllerCallback mControllerCallback;
    private boolean mCreated;
    private MediaDescriptionCompat mDescription;
    private Button mDisconnectButton;
    private c mMediaController;
    private Drawable mMediaRouteConnectingDrawable;
    private Drawable mMediaRouteOnDrawable;
    private ImageButton mPlayPauseButton;
    private final f mRoute;
    private TextView mRouteNameView;
    private final g mRouter;
    private ImageButton mSettingsButton;
    private PlaybackStateCompat mState;
    private Button mStopCastingButton;
    private TextView mSubtitleView;
    private TextView mTitleView;
    private boolean mVolumeControlEnabled;
    private LinearLayout mVolumeLayout;
    private SeekBar mVolumeSlider;
    private boolean mVolumeSliderTouched;

    private final class ClickListener implements OnClickListener {
        private ClickListener() {
        }

        public void onClick(View view) {
            int id = view.getId();
            if (id == b.stop || id == b.disconnect) {
                if (MediaRouteControllerDialog.this.mRoute.e()) {
                    MediaRouteControllerDialog.this.mRouter.a(id == b.stop ? 2 : 1);
                }
                MediaRouteControllerDialog.this.dismiss();
            } else if (id == b.play_pause) {
                if (MediaRouteControllerDialog.this.mMediaController != null && MediaRouteControllerDialog.this.mState != null) {
                    if (MediaRouteControllerDialog.this.mState.a() == 3) {
                        MediaRouteControllerDialog.this.mMediaController.a().b();
                    } else {
                        MediaRouteControllerDialog.this.mMediaController.a().a();
                    }
                }
            } else if (id == b.settings) {
                IntentSender n = MediaRouteControllerDialog.this.mRoute.n();
                if (n != null) {
                    try {
                        n.sendIntent(null, 0, null, null, null);
                        MediaRouteControllerDialog.this.dismiss();
                    } catch (Throwable e) {
                        Log.e(MediaRouteControllerDialog.TAG, "Error opening route settings.", e);
                    }
                }
            }
        }
    }

    private final class MediaControllerCallback extends a {
        private MediaControllerCallback() {
        }

        public void onSessionDestroyed() {
            if (MediaRouteControllerDialog.this.mMediaController != null) {
                MediaRouteControllerDialog.this.mMediaController.b(MediaRouteControllerDialog.this.mControllerCallback);
                MediaRouteControllerDialog.this.mMediaController = null;
            }
        }

        public void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat) {
            MediaRouteControllerDialog.this.mState = playbackStateCompat;
            MediaRouteControllerDialog.this.update();
        }

        public void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) {
            MediaRouteControllerDialog.this.mDescription = mediaMetadataCompat == null ? null : mediaMetadataCompat.a();
            MediaRouteControllerDialog.this.update();
        }
    }

    private final class MediaRouterCallback extends g.a {
        private MediaRouterCallback() {
        }

        public void onRouteUnselected(g gVar, f fVar) {
            MediaRouteControllerDialog.this.update();
        }

        public void onRouteChanged(g gVar, f fVar) {
            MediaRouteControllerDialog.this.update();
        }

        public void onRouteVolumeChanged(g gVar, f fVar) {
            if (fVar == MediaRouteControllerDialog.this.mRoute) {
                MediaRouteControllerDialog.this.updateVolume();
            }
        }
    }

    public MediaRouteControllerDialog(Context context) {
        this(context, 0);
    }

    public MediaRouteControllerDialog(Context context, int i) {
        super(MediaRouterThemeHelper.createThemedContext(context), i);
        this.mVolumeControlEnabled = true;
        Context context2 = getContext();
        this.mControllerCallback = new MediaControllerCallback();
        this.mRouter = g.a(context2);
        this.mCallback = new MediaRouterCallback();
        this.mRoute = this.mRouter.c();
        setMediaSession(this.mRouter.d());
    }

    public f getRoute() {
        return this.mRoute;
    }

    public View onCreateMediaControlView(Bundle bundle) {
        return null;
    }

    public View getMediaControlView() {
        return this.mControlView;
    }

    public void setVolumeControlEnabled(boolean z) {
        if (this.mVolumeControlEnabled != z) {
            this.mVolumeControlEnabled = z;
            if (this.mCreated) {
                updateVolume();
            }
        }
    }

    public boolean isVolumeControlEnabled() {
        return this.mVolumeControlEnabled;
    }

    private void setMediaSession(Token token) {
        PlaybackStateCompat playbackStateCompat = null;
        if (this.mMediaController != null) {
            this.mMediaController.b(this.mControllerCallback);
            this.mMediaController = null;
        }
        if (token != null && this.mAttachedToWindow) {
            try {
                this.mMediaController = new c(getContext(), token);
            } catch (Throwable e) {
                Log.e(TAG, "Error creating media controller in setMediaSession.", e);
            }
            if (this.mMediaController != null) {
                this.mMediaController.a(this.mControllerCallback);
            }
            MediaMetadataCompat c = this.mMediaController == null ? null : this.mMediaController.c();
            this.mDescription = c == null ? null : c.a();
            if (this.mMediaController != null) {
                playbackStateCompat = this.mMediaController.b();
            }
            this.mState = playbackStateCompat;
            update();
        }
    }

    public Token getMediaSession() {
        return this.mMediaController == null ? null : this.mMediaController.d();
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(android.support.v7.d.a.c.mr_media_route_controller_material_dialog_b);
        OnClickListener clickListener = new ClickListener();
        this.mDisconnectButton = (Button) findViewById(b.disconnect);
        this.mDisconnectButton.setOnClickListener(clickListener);
        this.mStopCastingButton = (Button) findViewById(b.stop);
        this.mStopCastingButton.setOnClickListener(clickListener);
        this.mSettingsButton = (ImageButton) findViewById(b.settings);
        this.mSettingsButton.setOnClickListener(clickListener);
        this.mArtView = (ImageView) findViewById(b.art);
        this.mTitleView = (TextView) findViewById(b.title);
        this.mSubtitleView = (TextView) findViewById(b.subtitle);
        this.mPlayPauseButton = (ImageButton) findViewById(b.play_pause);
        this.mPlayPauseButton.setOnClickListener(clickListener);
        this.mRouteNameView = (TextView) findViewById(b.route_name);
        this.mVolumeLayout = (LinearLayout) findViewById(b.media_route_volume_layout);
        this.mVolumeSlider = (SeekBar) findViewById(b.media_route_volume_slider);
        this.mVolumeSlider.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
            private final Runnable mStopTrackingTouch = new Runnable() {
                public void run() {
                    if (MediaRouteControllerDialog.this.mVolumeSliderTouched) {
                        MediaRouteControllerDialog.this.mVolumeSliderTouched = false;
                        MediaRouteControllerDialog.this.updateVolume();
                    }
                }
            };

            public void onStartTrackingTouch(SeekBar seekBar) {
                if (MediaRouteControllerDialog.this.mVolumeSliderTouched) {
                    MediaRouteControllerDialog.this.mVolumeSlider.removeCallbacks(this.mStopTrackingTouch);
                } else {
                    MediaRouteControllerDialog.this.mVolumeSliderTouched = true;
                }
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
                MediaRouteControllerDialog.this.mVolumeSlider.postDelayed(this.mStopTrackingTouch, 250);
            }

            public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                if (z) {
                    MediaRouteControllerDialog.this.mRoute.a(i);
                }
            }
        });
        this.mCreated = true;
        if (update()) {
            this.mControlView = onCreateMediaControlView(bundle);
            FrameLayout frameLayout = (FrameLayout) findViewById(b.media_route_control_frame);
            if (this.mControlView != null) {
                frameLayout.findViewById(b.default_control_frame).setVisibility(8);
                frameLayout.addView(this.mControlView);
            }
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mAttachedToWindow = true;
        this.mRouter.a(android.support.v7.c.f.a, this.mCallback, 2);
        setMediaSession(this.mRouter.d());
    }

    public void onDetachedFromWindow() {
        this.mRouter.a(this.mCallback);
        setMediaSession(null);
        this.mAttachedToWindow = false;
        super.onDetachedFromWindow();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 25 && i != 24) {
            return super.onKeyDown(i, keyEvent);
        }
        int i2;
        f fVar = this.mRoute;
        if (i == 25) {
            i2 = -1;
        } else {
            i2 = 1;
        }
        fVar.b(i2);
        return true;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 25 || i == 24) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    private boolean update() {
        CharSequence charSequence = null;
        if (!this.mRoute.e() || this.mRoute.f()) {
            dismiss();
            return false;
        } else if (!this.mCreated) {
            return false;
        } else {
            updateVolume();
            this.mRouteNameView.setText(this.mRoute.a());
            if (this.mRoute.l()) {
                this.mDisconnectButton.setVisibility(0);
            } else {
                this.mDisconnectButton.setVisibility(8);
            }
            if (this.mRoute.n() != null) {
                this.mSettingsButton.setVisibility(0);
            } else {
                this.mSettingsButton.setVisibility(8);
            }
            if (this.mControlView == null) {
                boolean z;
                boolean z2;
                if (this.mDescription != null && this.mDescription.c() != null) {
                    this.mArtView.setImageBitmap(this.mDescription.c());
                    this.mArtView.setVisibility(0);
                } else if (this.mDescription == null || this.mDescription.d() == null) {
                    this.mArtView.setImageDrawable(null);
                    this.mArtView.setVisibility(8);
                } else {
                    this.mArtView.setImageURI(this.mDescription.d());
                    this.mArtView.setVisibility(0);
                }
                CharSequence a = this.mDescription == null ? null : this.mDescription.a();
                if (TextUtils.isEmpty(a)) {
                    z = false;
                } else {
                    z = true;
                }
                if (this.mDescription != null) {
                    charSequence = this.mDescription.b();
                }
                if (TextUtils.isEmpty(charSequence)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z || z2) {
                    int i;
                    this.mTitleView.setText(a);
                    this.mTitleView.setEnabled(z);
                    TextView textView = this.mTitleView;
                    if (z) {
                        i = 0;
                    } else {
                        i = 8;
                    }
                    textView.setVisibility(i);
                    this.mSubtitleView.setText(charSequence);
                    TextView textView2 = this.mSubtitleView;
                    if (z2) {
                        i = 0;
                    } else {
                        i = 8;
                    }
                    textView2.setVisibility(i);
                } else {
                    this.mTitleView.setText(d.mr_media_route_controller_no_info_available);
                    this.mTitleView.setEnabled(false);
                    this.mTitleView.setVisibility(0);
                    this.mSubtitleView.setVisibility(8);
                }
                if (this.mState != null) {
                    boolean z3;
                    if (this.mState.a() == 6 || this.mState.a() == 3) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    boolean z4;
                    if ((this.mState.b() & 516) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if ((this.mState.b() & 514) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z3 && r2) {
                        this.mPlayPauseButton.setVisibility(0);
                        this.mPlayPauseButton.setImageResource(MediaRouterThemeHelper.getThemeResource(getContext(), android.support.v7.d.a.a.mediaRoutePauseDrawable));
                        this.mPlayPauseButton.setContentDescription(getContext().getResources().getText(d.mr_media_route_controller_pause));
                    } else if (z3 || !r1) {
                        this.mPlayPauseButton.setVisibility(8);
                    } else {
                        this.mPlayPauseButton.setVisibility(0);
                        this.mPlayPauseButton.setImageResource(MediaRouterThemeHelper.getThemeResource(getContext(), android.support.v7.d.a.a.mediaRoutePlayDrawable));
                        this.mPlayPauseButton.setContentDescription(getContext().getResources().getText(d.mr_media_route_controller_play));
                    }
                } else {
                    this.mPlayPauseButton.setVisibility(8);
                }
            }
            return true;
        }
    }

    private Drawable getIconDrawable() {
        if (this.mRoute.d()) {
            if (this.mMediaRouteConnectingDrawable == null) {
                this.mMediaRouteConnectingDrawable = MediaRouterThemeHelper.getThemeDrawable(getContext(), android.support.v7.d.a.a.mediaRouteConnectingDrawable);
            }
            return this.mMediaRouteConnectingDrawable;
        }
        if (this.mMediaRouteOnDrawable == null) {
            this.mMediaRouteOnDrawable = MediaRouterThemeHelper.getThemeDrawable(getContext(), android.support.v7.d.a.a.mediaRouteOnDrawable);
        }
        return this.mMediaRouteOnDrawable;
    }

    private void updateVolume() {
        if (!this.mVolumeSliderTouched) {
            if (isVolumeControlAvailable()) {
                this.mVolumeLayout.setVisibility(0);
                this.mVolumeSlider.setMax(this.mRoute.k());
                this.mVolumeSlider.setProgress(this.mRoute.j());
                return;
            }
            this.mVolumeLayout.setVisibility(8);
        }
    }

    private boolean isVolumeControlAvailable() {
        return this.mVolumeControlEnabled && this.mRoute.i() == 1;
    }
}
