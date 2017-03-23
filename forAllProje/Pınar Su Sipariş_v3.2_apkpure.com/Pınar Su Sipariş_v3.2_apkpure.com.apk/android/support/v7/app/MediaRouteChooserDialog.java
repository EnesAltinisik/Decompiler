package android.support.v7.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.c.g;
import android.support.v7.c.g.a;
import android.support.v7.c.g.f;
import android.support.v7.d.a.b;
import android.support.v7.d.a.c;
import android.support.v7.d.a.d;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MediaRouteChooserDialog extends Dialog {
    private RouteAdapter mAdapter;
    private boolean mAttachedToWindow;
    private final MediaRouterCallback mCallback;
    private ListView mListView;
    private final g mRouter;
    private ArrayList<f> mRoutes;
    private android.support.v7.c.f mSelector;

    private final class MediaRouterCallback extends a {
        private MediaRouterCallback() {
        }

        public void onRouteAdded(g gVar, f fVar) {
            MediaRouteChooserDialog.this.refreshRoutes();
        }

        public void onRouteRemoved(g gVar, f fVar) {
            MediaRouteChooserDialog.this.refreshRoutes();
        }

        public void onRouteChanged(g gVar, f fVar) {
            MediaRouteChooserDialog.this.refreshRoutes();
        }

        public void onRouteSelected(g gVar, f fVar) {
            MediaRouteChooserDialog.this.dismiss();
        }
    }

    private final class RouteAdapter extends ArrayAdapter<f> implements OnItemClickListener {
        private final LayoutInflater mInflater;

        public RouteAdapter(Context context, List<f> list) {
            super(context, 0, list);
            this.mInflater = LayoutInflater.from(context);
        }

        public boolean areAllItemsEnabled() {
            return false;
        }

        public boolean isEnabled(int i) {
            return ((f) getItem(i)).c();
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = this.mInflater.inflate(c.mr_media_route_list_item, viewGroup, false);
            }
            f fVar = (f) getItem(i);
            TextView textView = (TextView) view.findViewById(16908309);
            ((TextView) view.findViewById(16908308)).setText(fVar.a());
            CharSequence b = fVar.b();
            if (TextUtils.isEmpty(b)) {
                textView.setVisibility(8);
                textView.setText("");
            } else {
                textView.setVisibility(0);
                textView.setText(b);
            }
            view.setEnabled(fVar.c());
            return view;
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            f fVar = (f) getItem(i);
            if (fVar.c()) {
                fVar.o();
                MediaRouteChooserDialog.this.dismiss();
            }
        }
    }

    private static final class RouteComparator implements Comparator<f> {
        public static final RouteComparator sInstance = new RouteComparator();

        private RouteComparator() {
        }

        public int compare(f fVar, f fVar2) {
            return fVar.a().compareTo(fVar2.a());
        }
    }

    public MediaRouteChooserDialog(Context context) {
        this(context, 0);
    }

    public MediaRouteChooserDialog(Context context, int i) {
        super(MediaRouterThemeHelper.createThemedContext(context), i);
        this.mSelector = android.support.v7.c.f.a;
        this.mRouter = g.a(getContext());
        this.mCallback = new MediaRouterCallback();
    }

    public android.support.v7.c.f getRouteSelector() {
        return this.mSelector;
    }

    public void setRouteSelector(android.support.v7.c.f fVar) {
        if (fVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        } else if (!this.mSelector.equals(fVar)) {
            this.mSelector = fVar;
            if (this.mAttachedToWindow) {
                this.mRouter.a(this.mCallback);
                this.mRouter.a(fVar, this.mCallback, 1);
            }
            refreshRoutes();
        }
    }

    public void onFilterRoutes(List<f> list) {
        int size = list.size();
        while (true) {
            int i = size - 1;
            if (size <= 0) {
                return;
            }
            if (onFilterRoute((f) list.get(i))) {
                size = i;
            } else {
                list.remove(i);
                size = i;
            }
        }
    }

    public boolean onFilterRoute(f fVar) {
        return !fVar.f() && fVar.c() && fVar.a(this.mSelector);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().requestFeature(3);
        setContentView(c.mr_media_route_chooser_dialog);
        setTitle(d.mr_media_route_chooser_title);
        getWindow().setFeatureDrawableResource(3, MediaRouterThemeHelper.getThemeResource(getContext(), android.support.v7.d.a.a.mediaRouteOffDrawable));
        this.mRoutes = new ArrayList();
        this.mAdapter = new RouteAdapter(getContext(), this.mRoutes);
        this.mListView = (ListView) findViewById(b.media_route_list);
        this.mListView.setAdapter(this.mAdapter);
        this.mListView.setOnItemClickListener(this.mAdapter);
        this.mListView.setEmptyView(findViewById(16908292));
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mAttachedToWindow = true;
        this.mRouter.a(this.mSelector, this.mCallback, 1);
        refreshRoutes();
    }

    public void onDetachedFromWindow() {
        this.mAttachedToWindow = false;
        this.mRouter.a(this.mCallback);
        super.onDetachedFromWindow();
    }

    public void refreshRoutes() {
        if (this.mAttachedToWindow) {
            this.mRoutes.clear();
            this.mRoutes.addAll(this.mRouter.a());
            onFilterRoutes(this.mRoutes);
            Collections.sort(this.mRoutes, RouteComparator.sInstance);
            this.mAdapter.notifyDataSetChanged();
        }
    }
}
