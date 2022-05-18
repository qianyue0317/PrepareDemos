package com.qianyue.preparedemos.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.Button;

public class QyButton extends Button {
    private static final String TAG = "qianyueqianyue";

    public QyButton(Context context) {
        super(context);
    }

    public QyButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public QyButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        Log.i(TAG, "QYButton onMeasure: ");
        new Throwable("onMeasure").printStackTrace();
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        Log.i(TAG, "QYButton onLayout: ");
        new Throwable("onLayout").printStackTrace();
    }

    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Log.i(TAG, "draw: ");
    }
}
