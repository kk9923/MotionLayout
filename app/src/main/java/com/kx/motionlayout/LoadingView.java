package com.kx.motionlayout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

import androidx.annotation.Nullable;

public class LoadingView extends ImageView {

    protected ProgressDrawable mProgressDrawable;

    public LoadingView(Context context) {
        this(context,null);
    }

    public LoadingView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public LoadingView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        mProgressDrawable = new ProgressDrawable();
        setImageDrawable(mProgressDrawable);

    }

    public void start() {
        mProgressDrawable.start();
    }
    public void stop() {
        mProgressDrawable.stop();
    }
}
