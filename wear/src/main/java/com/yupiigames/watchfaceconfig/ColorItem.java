package com.yupiigames.watchfaceconfig;

import android.content.Context;
import android.graphics.Color;
import android.support.wearable.view.CircledImageView;
import android.support.wearable.view.WearableListView;
import android.view.View;
import android.widget.LinearLayout;

/**
 * Created by yair.carreno on 05/07/2015.
 */
public class ColorItem extends LinearLayout implements
        WearableListView.OnCenterProximityListener {

    private final CircledImageView mColor;

    public ColorItem(Context context) {
        super(context);
        View.inflate(context, R.layout.list_item, this);
        mColor = (CircledImageView) findViewById(R.id.color);
    }

    public void setColor(String colorName) {
        mColor.setCircleColor(Color.parseColor(colorName));
    }

    public int getColor() {
        return mColor.getDefaultCircleColor();
    }

    @Override
    public void onCenterPosition(boolean b) {
    }

    @Override
    public void onNonCenterPosition(boolean b) {
    }
}
