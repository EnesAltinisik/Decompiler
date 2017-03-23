package com.pinarsu.siparis.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.Transformation;
import android.widget.AbsListView;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import com.google.android.gms.cast.TextTrackStyle;
import java.util.ArrayList;
import java.util.List;

public class AnimatedExpandableListView extends ExpandableListView {
    private static final int ANIMATION_DURATION = 300;
    private static final String TAG = AnimatedExpandableListAdapter.class.getSimpleName();
    private AnimatedExpandableListAdapter adapter;

    public static abstract class AnimatedExpandableListAdapter extends BaseExpandableListAdapter {
        private static final int STATE_COLLAPSING = 2;
        private static final int STATE_EXPANDING = 1;
        private static final int STATE_IDLE = 0;
        private SparseArray<GroupInfo> groupInfo = new SparseArray();
        private AnimatedExpandableListView parent;

        public abstract View getRealChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup);

        public abstract int getRealChildrenCount(int i);

        private void setParent(AnimatedExpandableListView animatedExpandableListView) {
            this.parent = animatedExpandableListView;
        }

        public int getRealChildType(int i, int i2) {
            return 0;
        }

        public int getRealChildTypeCount() {
            return 1;
        }

        private GroupInfo getGroupInfo(int i) {
            GroupInfo groupInfo = (GroupInfo) this.groupInfo.get(i);
            if (groupInfo != null) {
                return groupInfo;
            }
            groupInfo = new GroupInfo();
            this.groupInfo.put(i, groupInfo);
            return groupInfo;
        }

        public void notifyGroupExpanded(int i) {
            getGroupInfo(i).dummyHeight = -1;
        }

        private void startExpandAnimation(int i, int i2) {
            GroupInfo groupInfo = getGroupInfo(i);
            groupInfo.animating = true;
            groupInfo.firstChildPosition = i2;
            groupInfo.expanding = true;
        }

        private void startCollapseAnimation(int i, int i2) {
            GroupInfo groupInfo = getGroupInfo(i);
            groupInfo.animating = true;
            groupInfo.firstChildPosition = i2;
            groupInfo.expanding = false;
        }

        private void stopAnimation(int i) {
            getGroupInfo(i).animating = false;
        }

        public final int getChildType(int i, int i2) {
            if (getGroupInfo(i).animating) {
                return 0;
            }
            return getRealChildType(i, i2) + 1;
        }

        public final int getChildTypeCount() {
            return getRealChildTypeCount() + 1;
        }

        protected LayoutParams generateDefaultLayoutParams() {
            return new AbsListView.LayoutParams(-1, -2, 0);
        }

        public final View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
            GroupInfo groupInfo = getGroupInfo(i);
            if (!groupInfo.animating) {
                return getRealChildView(i, i2, z, view, viewGroup);
            }
            View view2;
            if (view instanceof DummyView) {
                view2 = view;
            } else {
                view2 = new DummyView(viewGroup.getContext());
                view2.setLayoutParams(new AbsListView.LayoutParams(-1, 0));
            }
            if (i2 < groupInfo.firstChildPosition) {
                view2.getLayoutParams().height = 0;
                return view2;
            }
            int i3;
            ExpandableListView expandableListView = (ExpandableListView) viewGroup;
            final View view3 = (DummyView) view2;
            view3.clearViews();
            view3.setDivider(expandableListView.getDivider(), viewGroup.getMeasuredWidth(), expandableListView.getDividerHeight());
            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(viewGroup.getWidth(), 1073741824);
            int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(0, 0);
            int i4 = 0;
            int height = viewGroup.getHeight();
            int realChildrenCount = getRealChildrenCount(i);
            int i5 = groupInfo.firstChildPosition;
            while (i5 < realChildrenCount) {
                View realChildView = getRealChildView(i, i5, i5 == realChildrenCount + -1, null, viewGroup);
                AbsListView.LayoutParams layoutParams = (AbsListView.LayoutParams) realChildView.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = (AbsListView.LayoutParams) generateDefaultLayoutParams();
                    realChildView.setLayoutParams(layoutParams);
                }
                int i6 = layoutParams.height;
                if (i6 > 0) {
                    i6 = MeasureSpec.makeMeasureSpec(i6, 1073741824);
                } else {
                    i6 = makeMeasureSpec2;
                }
                realChildView.measure(makeMeasureSpec, i6);
                i4 += realChildView.getMeasuredHeight();
                if (i4 >= height) {
                    view3.addFakeView(realChildView);
                    i3 = i4 + ((i4 / (i5 + 1)) * ((realChildrenCount - i5) - 1));
                    break;
                }
                view3.addFakeView(realChildView);
                i5++;
            }
            i3 = i4;
            Object tag = view3.getTag();
            if (tag == null) {
                i6 = 0;
            } else {
                i6 = ((Integer) tag).intValue();
            }
            Animation expandAnimation;
            if (groupInfo.expanding && r2 != 1) {
                expandAnimation = new ExpandAnimation(view3, 0, i3, groupInfo);
                expandAnimation.setDuration((long) this.parent.getAnimationDuration());
                final int i7 = i;
                expandAnimation.setAnimationListener(new AnimationListener() {
                    public void onAnimationEnd(Animation animation) {
                        AnimatedExpandableListAdapter.this.stopAnimation(i7);
                        AnimatedExpandableListAdapter.this.notifyDataSetChanged();
                        view3.setTag(Integer.valueOf(0));
                    }

                    public void onAnimationRepeat(Animation animation) {
                    }

                    public void onAnimationStart(Animation animation) {
                    }
                });
                view3.startAnimation(expandAnimation);
                view3.setTag(Integer.valueOf(1));
                return view2;
            } else if (groupInfo.expanding || r2 == 2) {
                return view2;
            } else {
                if (groupInfo.dummyHeight == -1) {
                    groupInfo.dummyHeight = i3;
                }
                expandAnimation = new ExpandAnimation(view3, groupInfo.dummyHeight, 0, groupInfo);
                expandAnimation.setDuration((long) this.parent.getAnimationDuration());
                i3 = i;
                final ExpandableListView expandableListView2 = expandableListView;
                final GroupInfo groupInfo2 = groupInfo;
                expandAnimation.setAnimationListener(new AnimationListener() {
                    public void onAnimationEnd(Animation animation) {
                        AnimatedExpandableListAdapter.this.stopAnimation(i3);
                        expandableListView2.collapseGroup(i3);
                        AnimatedExpandableListAdapter.this.notifyDataSetChanged();
                        groupInfo2.dummyHeight = -1;
                        view3.setTag(Integer.valueOf(0));
                    }

                    public void onAnimationRepeat(Animation animation) {
                    }

                    public void onAnimationStart(Animation animation) {
                    }
                });
                view3.startAnimation(expandAnimation);
                view3.setTag(Integer.valueOf(2));
                return view2;
            }
        }

        public final int getChildrenCount(int i) {
            GroupInfo groupInfo = getGroupInfo(i);
            if (groupInfo.animating) {
                return groupInfo.firstChildPosition + 1;
            }
            return getRealChildrenCount(i);
        }
    }

    private static class DummyView extends View {
        private Drawable divider;
        private int dividerHeight;
        private int dividerWidth;
        private List<View> views = new ArrayList();

        public DummyView(Context context) {
            super(context);
        }

        public void setDivider(Drawable drawable, int i, int i2) {
            if (drawable != null) {
                this.divider = drawable;
                this.dividerWidth = i;
                this.dividerHeight = i2;
                drawable.setBounds(0, 0, i, i2);
            }
        }

        public void addFakeView(View view) {
            view.layout(0, 0, getWidth(), view.getMeasuredHeight());
            this.views.add(view);
        }

        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            int size = this.views.size();
            for (int i5 = 0; i5 < size; i5++) {
                View view = (View) this.views.get(i5);
                view.layout(i, i2, view.getMeasuredWidth() + i, view.getMeasuredHeight() + i2);
            }
        }

        public void clearViews() {
            this.views.clear();
        }

        public void dispatchDraw(Canvas canvas) {
            canvas.save();
            if (this.divider != null) {
                this.divider.setBounds(0, 0, this.dividerWidth, this.dividerHeight);
            }
            int size = this.views.size();
            for (int i = 0; i < size; i++) {
                View view = (View) this.views.get(i);
                canvas.save();
                canvas.clipRect(0, 0, getWidth(), view.getMeasuredHeight());
                view.draw(canvas);
                canvas.restore();
                if (this.divider != null) {
                    this.divider.draw(canvas);
                    canvas.translate(0.0f, (float) this.dividerHeight);
                }
                canvas.translate(0.0f, (float) view.getMeasuredHeight());
            }
            canvas.restore();
        }
    }

    private static class ExpandAnimation extends Animation {
        private int baseHeight;
        private int delta;
        private GroupInfo groupInfo;
        private View view;

        private ExpandAnimation(View view, int i, int i2, GroupInfo groupInfo) {
            this.baseHeight = i;
            this.delta = i2 - i;
            this.view = view;
            this.groupInfo = groupInfo;
            this.view.getLayoutParams().height = i;
            this.view.requestLayout();
        }

        protected void applyTransformation(float f, Transformation transformation) {
            super.applyTransformation(f, transformation);
            if (f < TextTrackStyle.DEFAULT_FONT_SCALE) {
                int i = this.baseHeight + ((int) (((float) this.delta) * f));
                this.view.getLayoutParams().height = i;
                this.groupInfo.dummyHeight = i;
                this.view.requestLayout();
                return;
            }
            i = this.baseHeight + this.delta;
            this.view.getLayoutParams().height = i;
            this.groupInfo.dummyHeight = i;
            this.view.requestLayout();
        }
    }

    private static class GroupInfo {
        boolean animating;
        int dummyHeight;
        boolean expanding;
        int firstChildPosition;

        private GroupInfo() {
            this.animating = false;
            this.expanding = false;
            this.dummyHeight = -1;
        }
    }

    public AnimatedExpandableListView(Context context) {
        super(context);
    }

    public AnimatedExpandableListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AnimatedExpandableListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setAdapter(ExpandableListAdapter expandableListAdapter) {
        super.setAdapter(expandableListAdapter);
        if (expandableListAdapter instanceof AnimatedExpandableListAdapter) {
            this.adapter = (AnimatedExpandableListAdapter) expandableListAdapter;
            this.adapter.setParent(this);
            return;
        }
        throw new ClassCastException(expandableListAdapter.toString() + " must implement AnimatedExpandableListAdapter");
    }

    @SuppressLint({"NewApi"})
    public boolean expandGroupWithAnimation(int i) {
        if ((i == this.adapter.getGroupCount() + -1) && VERSION.SDK_INT >= 14 && i > 0) {
            return expandGroup(i, true);
        }
        int flatListPosition = getFlatListPosition(getPackedPositionForGroup(i));
        if (flatListPosition != -1) {
            flatListPosition -= getFirstVisiblePosition();
            if (flatListPosition < getChildCount() && getChildAt(flatListPosition).getBottom() >= getBottom()) {
                this.adapter.notifyGroupExpanded(i);
                return expandGroup(i);
            }
        }
        this.adapter.startExpandAnimation(i, 0);
        return expandGroup(i);
    }

    public boolean collapseGroupWithAnimation(int i) {
        int flatListPosition = getFlatListPosition(getPackedPositionForGroup(i));
        if (flatListPosition != -1) {
            flatListPosition -= getFirstVisiblePosition();
            if (flatListPosition < 0 || flatListPosition >= getChildCount()) {
                return collapseGroup(i);
            }
            if (getChildAt(flatListPosition).getBottom() >= getBottom()) {
                return collapseGroup(i);
            }
        }
        long expandableListPosition = getExpandableListPosition(getFirstVisiblePosition());
        flatListPosition = getPackedPositionChild(expandableListPosition);
        int packedPositionGroup = getPackedPositionGroup(expandableListPosition);
        if (flatListPosition == -1 || packedPositionGroup != i) {
            flatListPosition = 0;
        }
        this.adapter.startCollapseAnimation(i, flatListPosition);
        this.adapter.notifyDataSetChanged();
        return isGroupExpanded(i);
    }

    private int getAnimationDuration() {
        return 300;
    }
}
