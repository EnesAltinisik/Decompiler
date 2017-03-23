package com.pinarsu.siparis.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.v7.widget.m;
import android.util.AttributeSet;

public class EditText extends m {
    public EditText(Context context) {
        super(context);
        init(null);
    }

    public EditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(attributeSet);
    }

    public EditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(attributeSet);
    }

    private void init(AttributeSet attributeSet) {
        if (!isInEditMode()) {
            Typeface createFromAsset;
            if (attributeSet == null) {
                createFromAsset = Typeface.createFromAsset(getContext().getAssets(), "fonts/opensans_regular.ttf");
            } else {
                TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{16842903});
                int i = obtainStyledAttributes.getInt(0, 0);
                obtainStyledAttributes.recycle();
                if (i == 1) {
                    createFromAsset = Typeface.createFromAsset(getContext().getAssets(), "fonts/opensans_bold.ttf");
                } else {
                    createFromAsset = Typeface.createFromAsset(getContext().getAssets(), "fonts/opensans_regular.ttf");
                }
            }
            setTypeface(createFromAsset, 0);
        }
    }
}
