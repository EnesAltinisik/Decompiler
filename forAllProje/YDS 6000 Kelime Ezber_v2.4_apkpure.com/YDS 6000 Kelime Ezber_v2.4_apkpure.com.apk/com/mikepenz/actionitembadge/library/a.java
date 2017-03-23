package com.mikepenz.actionitembadge.library;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.Display;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.mikepenz.actionitembadge.library.a.c;

public class a {

    public interface a {
        boolean a(MenuItem menuItem);
    }

    public enum b {
        GREY(new com.mikepenz.actionitembadge.library.a.b(com.mikepenz.actionitembadge.library.a.b.a.DEFAULT, R.layout.menu_action_item_badge, Color.parseColor("#e0e0e0"), Color.parseColor("#c7c7c7"), -16777216)),
        DARK_GREY(new com.mikepenz.actionitembadge.library.a.b(com.mikepenz.actionitembadge.library.a.b.a.DEFAULT, R.layout.menu_action_item_badge, Color.parseColor("#606060"), Color.parseColor("#3e3e3e"), -1)),
        RED(new com.mikepenz.actionitembadge.library.a.b(com.mikepenz.actionitembadge.library.a.b.a.DEFAULT, R.layout.menu_action_item_badge, Color.parseColor("#FF4444"), Color.parseColor("#CC0000"), -1)),
        BLUE(new com.mikepenz.actionitembadge.library.a.b(com.mikepenz.actionitembadge.library.a.b.a.DEFAULT, R.layout.menu_action_item_badge, Color.parseColor("#33B5E5"), Color.parseColor("#0099CC"), -1)),
        GREEN(new com.mikepenz.actionitembadge.library.a.b(com.mikepenz.actionitembadge.library.a.b.a.DEFAULT, R.layout.menu_action_item_badge, Color.parseColor("#99CC00"), Color.parseColor("#669900"), -1)),
        PURPLE(new com.mikepenz.actionitembadge.library.a.b(com.mikepenz.actionitembadge.library.a.b.a.DEFAULT, R.layout.menu_action_item_badge, Color.parseColor("#AA66CC"), Color.parseColor("#9933CC"), -1)),
        YELLOW(new com.mikepenz.actionitembadge.library.a.b(com.mikepenz.actionitembadge.library.a.b.a.DEFAULT, R.layout.menu_action_item_badge, Color.parseColor("#FFBB33"), Color.parseColor("#FF8800"), -1)),
        GREY_LARGE(new com.mikepenz.actionitembadge.library.a.b(com.mikepenz.actionitembadge.library.a.b.a.LARGE, R.layout.menu_action_item_badge_large, Color.parseColor("#e0e0e0"), Color.parseColor("#c7c7c7"), -16777216)),
        DARK_GREY_LARGE(new com.mikepenz.actionitembadge.library.a.b(com.mikepenz.actionitembadge.library.a.b.a.LARGE, R.layout.menu_action_item_badge_large, Color.parseColor("#606060"), Color.parseColor("#3e3e3e"), -1)),
        RED_LARGE(new com.mikepenz.actionitembadge.library.a.b(com.mikepenz.actionitembadge.library.a.b.a.LARGE, R.layout.menu_action_item_badge_large, Color.parseColor("#FF4444"), Color.parseColor("#CC0000"), -1)),
        BLUE_LARGE(new com.mikepenz.actionitembadge.library.a.b(com.mikepenz.actionitembadge.library.a.b.a.LARGE, R.layout.menu_action_item_badge_large, Color.parseColor("#33B5E5"), Color.parseColor("#0099CC"), -1)),
        GREEN_LARGE(new com.mikepenz.actionitembadge.library.a.b(com.mikepenz.actionitembadge.library.a.b.a.LARGE, R.layout.menu_action_item_badge_large, Color.parseColor("#99CC00"), Color.parseColor("#669900"), -1)),
        PURPLE_LARGE(new com.mikepenz.actionitembadge.library.a.b(com.mikepenz.actionitembadge.library.a.b.a.LARGE, R.layout.menu_action_item_badge_large, Color.parseColor("#AA66CC"), Color.parseColor("#9933CC"), -1)),
        YELLOW_LARGE(new com.mikepenz.actionitembadge.library.a.b(com.mikepenz.actionitembadge.library.a.b.a.LARGE, R.layout.menu_action_item_badge_large, Color.parseColor("#FFBB33"), Color.parseColor("#FF8800"), -1));
        
        private com.mikepenz.actionitembadge.library.a.b o;

        private b(com.mikepenz.actionitembadge.library.a.b bVar) {
            this.o = bVar;
        }

        public com.mikepenz.actionitembadge.library.a.b a() {
            return this.o;
        }
    }

    public static void a(Activity activity, MenuItem menuItem, Drawable drawable, com.mikepenz.actionitembadge.library.a.b bVar, String str) {
        a(activity, menuItem, drawable, bVar, str, null);
    }

    public static void a(final Activity activity, final MenuItem menuItem, Drawable drawable, com.mikepenz.actionitembadge.library.a.b bVar, String str, final a aVar) {
        if (menuItem != null) {
            FrameLayout frameLayout = bVar == null ? (FrameLayout) menuItem.getActionView() : (FrameLayout) menuItem.setActionView(bVar.a()).getActionView();
            View view = (TextView) frameLayout.findViewById(R.id.menu_badge);
            ImageView imageView = (ImageView) frameLayout.findViewById(R.id.menu_badge_icon);
            if (!(imageView == null || drawable == null)) {
                imageView.setImageDrawable(drawable);
            }
            if (activity != null) {
                frameLayout.setOnClickListener(new OnClickListener() {
                    public void onClick(View view) {
                        if (!(aVar != null ? aVar.a(menuItem) : false)) {
                            activity.onMenuItemSelected(0, menuItem);
                        }
                    }
                });
                frameLayout.setOnLongClickListener(new OnLongClickListener() {
                    public boolean onLongClick(View view) {
                        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
                        Point point = new Point();
                        defaultDisplay.getSize(point);
                        int i = point.x;
                        Toast makeText = Toast.makeText(activity, menuItem.getTitle(), 0);
                        makeText.setGravity(48, i / 5, c.a(activity, 48.0f));
                        makeText.show();
                        return true;
                    }
                });
            }
            if (bVar != null) {
                c.a(view, new com.mikepenz.actionitembadge.library.a.a().c(bVar.e()).a(bVar.b()).b(bVar.c()).e(bVar.g()).d(bVar.f()).a((Context) activity));
                view.setTextColor(bVar.d());
            }
            if (str == null) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
                view.setText(str);
            }
            menuItem.setVisible(true);
        }
    }

    public static void a(Activity activity, MenuItem menuItem, com.mikepenz.iconics.a.a aVar, b bVar, int i) {
        a(activity, menuItem, aVar, bVar.a(), i);
    }

    public static void a(Activity activity, MenuItem menuItem, com.mikepenz.iconics.a.a aVar, com.mikepenz.actionitembadge.library.a.b bVar, int i) {
        if (i == Integer.MIN_VALUE) {
            a(activity, menuItem, new com.mikepenz.iconics.a(activity, aVar).a(-1).a(), bVar, null);
        } else {
            a(activity, menuItem, new com.mikepenz.iconics.a(activity, aVar).a(-1).a(), bVar, String.valueOf(i));
        }
    }

    public static void a(MenuItem menuItem) {
        menuItem.setVisible(false);
    }

    public static void a(MenuItem menuItem, int i) {
        a(menuItem, null, i);
    }

    public static void a(MenuItem menuItem, Drawable drawable, int i) {
        if (i == Integer.MIN_VALUE) {
            a(null, menuItem, drawable, (com.mikepenz.actionitembadge.library.a.b) null, null);
        } else {
            a(null, menuItem, drawable, (com.mikepenz.actionitembadge.library.a.b) null, String.valueOf(i));
        }
    }
}
