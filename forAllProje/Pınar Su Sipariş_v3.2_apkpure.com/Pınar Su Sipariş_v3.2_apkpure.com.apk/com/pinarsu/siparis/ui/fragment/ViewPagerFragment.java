package com.pinarsu.siparis.ui.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.pinarsu.siparis.R;
import com.pinarsu.siparis.interfaces.IClickListener;
import com.pinarsu.siparis.model.ViewPagerItem;
import com.squareup.picasso.Picasso;

public class ViewPagerFragment extends Fragment {
    private IClickListener delegate;
    private ViewPagerItem item;
    private int position;

    public enum IMAGE_TYPE {
        FROM_URL,
        FROM_DRAWABLE
    }

    public static ViewPagerFragment newInstance(int i, ViewPagerItem viewPagerItem, IClickListener iClickListener) {
        ViewPagerFragment viewPagerFragment = new ViewPagerFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("position", i);
        bundle.putSerializable("item", viewPagerItem);
        bundle.putSerializable("delegate", iClickListener);
        viewPagerFragment.setArguments(bundle);
        return viewPagerFragment;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.position = getArguments().getInt("position", 0);
        this.item = (ViewPagerItem) getArguments().getSerializable("item");
        this.delegate = (IClickListener) getArguments().getSerializable("delegate");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.item_viewpager, viewGroup, false);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.im);
        if (this.item.type == IMAGE_TYPE.FROM_DRAWABLE) {
            int i = this.item.imageDrawable;
            if (i != 0) {
                Picasso.with(inflate.getContext()).load(i).into(imageView);
            }
        } else {
            String str = this.item.imageUrl;
            if (!str.isEmpty()) {
                Picasso.with(inflate.getContext()).load(str).into(imageView);
            }
        }
        inflate.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (ViewPagerFragment.this.delegate != null) {
                    ViewPagerFragment.this.delegate.onClickListener(ViewPagerFragment.this.position);
                }
            }
        });
        return inflate;
    }
}
