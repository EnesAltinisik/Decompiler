package android.support.v7.app;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.support.v4.b.ag;
import android.support.v4.b.ah.a;
import android.support.v4.b.al;
import android.support.v7.appcompat.R;
import android.widget.RemoteViews;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

@TargetApi(9)
class s {
    public static float a(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    private static int a() {
        return R.layout.notification_action;
    }

    public static int a(Context context) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.notification_top_pad);
        float a = (a(context.getResources().getConfiguration().fontScale, 1.0f, 1.3f) - 1.0f) / 0.29999995f;
        return Math.round((((float) dimensionPixelSize) * (1.0f - a)) + (((float) context.getResources().getDimensionPixelSize(R.dimen.notification_top_pad_large_text)) * a));
    }

    @TargetApi(11)
    private static int a(boolean z, int i) {
        return i <= 3 ? z ? R.layout.notification_template_big_media_narrow_custom : R.layout.notification_template_big_media_narrow : z ? R.layout.notification_template_big_media_custom : R.layout.notification_template_big_media;
    }

    private static Bitmap a(Context context, int i, int i2) {
        return a(context, i, i2, 0);
    }

    private static Bitmap a(Context context, int i, int i2, int i3) {
        Drawable drawable = context.getResources().getDrawable(i);
        int intrinsicWidth = i3 == 0 ? drawable.getIntrinsicWidth() : i3;
        if (i3 == 0) {
            i3 = drawable.getIntrinsicHeight();
        }
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, i3, Config.ARGB_8888);
        drawable.setBounds(0, 0, intrinsicWidth, i3);
        if (i2 != 0) {
            drawable.mutate().setColorFilter(new PorterDuffColorFilter(i2, Mode.SRC_IN));
        }
        drawable.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    public static Bitmap a(Context context, int i, int i2, int i3, int i4) {
        int i5 = R.drawable.notification_icon_background;
        if (i4 == 0) {
            i4 = 0;
        }
        Bitmap a = a(context, i5, i4, i2);
        Canvas canvas = new Canvas(a);
        Drawable mutate = context.getResources().getDrawable(i).mutate();
        mutate.setFilterBitmap(true);
        int i6 = (i2 - i3) / 2;
        mutate.setBounds(i6, i6, i3 + i6, i3 + i6);
        mutate.setColorFilter(new PorterDuffColorFilter(-1, Mode.SRC_ATOP));
        mutate.draw(canvas);
        return a;
    }

    private static RemoteViews a(Context context, a aVar) {
        Object obj = aVar.d == null ? 1 : null;
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), obj != null ? b() : a());
        remoteViews.setImageViewBitmap(R.id.action_image, a(context, aVar.a(), context.getResources().getColor(R.color.notification_action_color_filter)));
        remoteViews.setTextViewText(R.id.action_text, aVar.c);
        if (obj == null) {
            remoteViews.setOnClickPendingIntent(R.id.action_container, aVar.d);
        }
        if (VERSION.SDK_INT >= 15) {
            remoteViews.setContentDescription(R.id.action_container, aVar.c);
        }
        return remoteViews;
    }

    @TargetApi(11)
    private static RemoteViews a(Context context, al.a aVar) {
        Object obj = aVar.c() == null ? 1 : null;
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.notification_media_action);
        remoteViews.setImageViewResource(R.id.action0, aVar.a());
        if (obj == null) {
            remoteViews.setOnClickPendingIntent(R.id.action0, aVar.c());
        }
        if (VERSION.SDK_INT >= 15) {
            remoteViews.setContentDescription(R.id.action0, aVar.b());
        }
        return remoteViews;
    }

    public static RemoteViews a(Context context, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, int i2, Bitmap bitmap, CharSequence charSequence4, boolean z, long j, int i3, int i4, int i5, boolean z2) {
        Object obj;
        Resources resources = context.getResources();
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), i5);
        Object obj2 = i3 < -1 ? 1 : null;
        if (VERSION.SDK_INT >= 16 && VERSION.SDK_INT < 21) {
            if (obj2 != null) {
                remoteViews.setInt(R.id.notification_background, "setBackgroundResource", R.drawable.notification_bg_low);
                remoteViews.setInt(R.id.icon, "setBackgroundResource", R.drawable.notification_template_icon_low_bg);
            } else {
                remoteViews.setInt(R.id.notification_background, "setBackgroundResource", R.drawable.notification_bg);
                remoteViews.setInt(R.id.icon, "setBackgroundResource", R.drawable.notification_template_icon_bg);
            }
        }
        if (bitmap != null) {
            if (VERSION.SDK_INT >= 16) {
                remoteViews.setViewVisibility(R.id.icon, 0);
                remoteViews.setImageViewBitmap(R.id.icon, bitmap);
            } else {
                remoteViews.setViewVisibility(R.id.icon, 8);
            }
            if (i2 != 0) {
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.notification_right_icon_size);
                int dimensionPixelSize2 = dimensionPixelSize - (resources.getDimensionPixelSize(R.dimen.notification_small_icon_background_padding) * 2);
                if (VERSION.SDK_INT >= 21) {
                    remoteViews.setImageViewBitmap(R.id.right_icon, a(context, i2, dimensionPixelSize, dimensionPixelSize2, i4));
                } else {
                    remoteViews.setImageViewBitmap(R.id.right_icon, a(context, i2, -1));
                }
                remoteViews.setViewVisibility(R.id.right_icon, 0);
            }
        } else if (i2 != 0) {
            remoteViews.setViewVisibility(R.id.icon, 0);
            if (VERSION.SDK_INT >= 21) {
                remoteViews.setImageViewBitmap(R.id.icon, a(context, i2, resources.getDimensionPixelSize(R.dimen.notification_large_icon_width) - resources.getDimensionPixelSize(R.dimen.notification_big_circle_margin), resources.getDimensionPixelSize(R.dimen.notification_small_icon_size_as_large), i4));
            } else {
                remoteViews.setImageViewBitmap(R.id.icon, a(context, i2, -1));
            }
        }
        if (charSequence != null) {
            remoteViews.setTextViewText(R.id.title, charSequence);
        }
        if (charSequence2 != null) {
            remoteViews.setTextViewText(R.id.text, charSequence2);
            obj2 = 1;
        } else {
            obj2 = null;
        }
        Object obj3 = (VERSION.SDK_INT >= 21 || bitmap == null) ? null : 1;
        if (charSequence3 != null) {
            remoteViews.setTextViewText(R.id.info, charSequence3);
            remoteViews.setViewVisibility(R.id.info, 0);
            obj3 = 1;
            obj = 1;
        } else if (i > 0) {
            if (i > resources.getInteger(R.integer.status_bar_notification_info_maxnum)) {
                remoteViews.setTextViewText(R.id.info, resources.getString(R.string.status_bar_notification_info_overflow));
            } else {
                remoteViews.setTextViewText(R.id.info, NumberFormat.getIntegerInstance().format((long) i));
            }
            remoteViews.setViewVisibility(R.id.info, 0);
            obj3 = 1;
            int i6 = 1;
        } else {
            remoteViews.setViewVisibility(R.id.info, 8);
            obj = obj2;
        }
        if (charSequence4 != null && VERSION.SDK_INT >= 16) {
            remoteViews.setTextViewText(R.id.text, charSequence4);
            if (charSequence2 != null) {
                remoteViews.setTextViewText(R.id.text2, charSequence2);
                remoteViews.setViewVisibility(R.id.text2, 0);
                obj2 = 1;
                if (obj2 != null && VERSION.SDK_INT >= 16) {
                    if (z2) {
                        remoteViews.setTextViewTextSize(R.id.text, 0, (float) resources.getDimensionPixelSize(R.dimen.notification_subtext_size));
                    }
                    remoteViews.setViewPadding(R.id.line1, 0, 0, 0, 0);
                }
                if (j == 0) {
                    if (z || VERSION.SDK_INT < 16) {
                        remoteViews.setViewVisibility(R.id.time, 0);
                        remoteViews.setLong(R.id.time, "setTime", j);
                    } else {
                        remoteViews.setViewVisibility(R.id.chronometer, 0);
                        remoteViews.setLong(R.id.chronometer, "setBase", (SystemClock.elapsedRealtime() - System.currentTimeMillis()) + j);
                        remoteViews.setBoolean(R.id.chronometer, "setStarted", true);
                    }
                    obj2 = 1;
                } else {
                    obj2 = obj3;
                }
                remoteViews.setViewVisibility(R.id.right_side, obj2 == null ? 0 : 8);
                remoteViews.setViewVisibility(R.id.line3, obj == null ? 0 : 8);
                return remoteViews;
            }
            remoteViews.setViewVisibility(R.id.text2, 8);
        }
        obj2 = null;
        if (z2) {
            remoteViews.setTextViewTextSize(R.id.text, 0, (float) resources.getDimensionPixelSize(R.dimen.notification_subtext_size));
        }
        remoteViews.setViewPadding(R.id.line1, 0, 0, 0, 0);
        if (j == 0) {
            obj2 = obj3;
        } else {
            if (z) {
            }
            remoteViews.setViewVisibility(R.id.time, 0);
            remoteViews.setLong(R.id.time, "setTime", j);
            obj2 = 1;
        }
        if (obj2 == null) {
        }
        remoteViews.setViewVisibility(R.id.right_side, obj2 == null ? 0 : 8);
        if (obj == null) {
        }
        remoteViews.setViewVisibility(R.id.line3, obj == null ? 0 : 8);
        return remoteViews;
    }

    public static RemoteViews a(Context context, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, int i2, Bitmap bitmap, CharSequence charSequence4, boolean z, long j, int i3, int i4, int i5, boolean z2, ArrayList<a> arrayList) {
        int size;
        Object obj;
        RemoteViews a = a(context, charSequence, charSequence2, charSequence3, i, i2, bitmap, charSequence4, z, j, i3, i4, i5, z2);
        a.removeAllViews(R.id.actions);
        if (arrayList != null) {
            size = arrayList.size();
            if (size > 0) {
                int i6 = size > 3 ? 3 : size;
                for (int i7 = 0; i7 < i6; i7++) {
                    a.addView(R.id.actions, a(context, (a) arrayList.get(i7)));
                }
                obj = 1;
                size = obj == null ? 0 : 8;
                a.setViewVisibility(R.id.actions, size);
                a.setViewVisibility(R.id.action_divider, size);
                return a;
            }
        }
        obj = null;
        if (obj == null) {
        }
        a.setViewVisibility(R.id.actions, size);
        a.setViewVisibility(R.id.action_divider, size);
        return a;
    }

    @TargetApi(11)
    public static <T extends al.a> RemoteViews a(Context context, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, Bitmap bitmap, CharSequence charSequence4, boolean z, long j, int i2, int i3, List<T> list, boolean z2, PendingIntent pendingIntent, boolean z3) {
        int min = Math.min(list.size(), 5);
        RemoteViews a = a(context, charSequence, charSequence2, charSequence3, i, 0, bitmap, charSequence4, z, j, i2, i3, a(z3, min), false);
        a.removeAllViews(R.id.media_actions);
        if (min > 0) {
            for (int i4 = 0; i4 < min; i4++) {
                a.addView(R.id.media_actions, a(context, (al.a) list.get(i4)));
            }
        }
        if (z2) {
            a.setViewVisibility(R.id.cancel_action, 0);
            a.setInt(R.id.cancel_action, "setAlpha", context.getResources().getInteger(R.integer.cancel_button_image_alpha));
            a.setOnClickPendingIntent(R.id.cancel_action, pendingIntent);
        } else {
            a.setViewVisibility(R.id.cancel_action, 8);
        }
        return a;
    }

    @TargetApi(11)
    private static <T extends al.a> RemoteViews a(Context context, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, Bitmap bitmap, CharSequence charSequence4, boolean z, long j, int i2, List<T> list, int[] iArr, boolean z2, PendingIntent pendingIntent, boolean z3) {
        RemoteViews a = a(context, charSequence, charSequence2, charSequence3, i, 0, bitmap, charSequence4, z, j, i2, 0, z3 ? R.layout.notification_template_media_custom : R.layout.notification_template_media, true);
        int size = list.size();
        int min = iArr == null ? 0 : Math.min(iArr.length, 3);
        a.removeAllViews(R.id.media_actions);
        if (min > 0) {
            for (int i3 = 0; i3 < min; i3++) {
                if (i3 >= size) {
                    throw new IllegalArgumentException(String.format("setShowActionsInCompactView: action %d out of bounds (max %d)", new Object[]{Integer.valueOf(i3), Integer.valueOf(size - 1)}));
                }
                a.addView(R.id.media_actions, a(context, (al.a) list.get(iArr[i3])));
            }
        }
        if (z2) {
            a.setViewVisibility(R.id.end_padder, 8);
            a.setViewVisibility(R.id.cancel_action, 0);
            a.setOnClickPendingIntent(R.id.cancel_action, pendingIntent);
            a.setInt(R.id.cancel_action, "setAlpha", context.getResources().getInteger(R.integer.cancel_button_image_alpha));
        } else {
            a.setViewVisibility(R.id.end_padder, 0);
            a.setViewVisibility(R.id.cancel_action, 8);
        }
        return a;
    }

    @TargetApi(11)
    public static <T extends al.a> RemoteViews a(ag agVar, Context context, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, Bitmap bitmap, CharSequence charSequence4, boolean z, long j, int i2, List<T> list, int[] iArr, boolean z2, PendingIntent pendingIntent, boolean z3) {
        RemoteViews a = a(context, charSequence, charSequence2, charSequence3, i, bitmap, charSequence4, z, j, i2, (List) list, iArr, z2, pendingIntent, z3);
        agVar.a().setContent(a);
        if (z2) {
            agVar.a().setOngoing(true);
        }
        return a;
    }

    @TargetApi(16)
    public static <T extends al.a> void a(Notification notification, Context context, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, Bitmap bitmap, CharSequence charSequence4, boolean z, long j, int i2, int i3, List<T> list, boolean z2, PendingIntent pendingIntent, boolean z3) {
        notification.bigContentView = a(context, charSequence, charSequence2, charSequence3, i, bitmap, charSequence4, z, j, i2, i3, (List) list, z2, pendingIntent, z3);
        if (z2) {
            notification.flags |= 2;
        }
    }

    public static void a(Context context, RemoteViews remoteViews, RemoteViews remoteViews2) {
        a(remoteViews);
        remoteViews.removeAllViews(R.id.notification_main_column);
        remoteViews.addView(R.id.notification_main_column, remoteViews2.clone());
        remoteViews.setViewVisibility(R.id.notification_main_column, 0);
        if (VERSION.SDK_INT >= 21) {
            remoteViews.setViewPadding(R.id.notification_main_column_container, 0, a(context), 0, 0);
        }
    }

    private static void a(RemoteViews remoteViews) {
        remoteViews.setViewVisibility(R.id.title, 8);
        remoteViews.setViewVisibility(R.id.text2, 8);
        remoteViews.setViewVisibility(R.id.text, 8);
    }

    private static int b() {
        return R.layout.notification_action_tombstone;
    }
}
