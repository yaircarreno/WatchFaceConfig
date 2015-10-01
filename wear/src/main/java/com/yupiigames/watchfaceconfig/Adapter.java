package com.yupiigames.watchfaceconfig;

import android.support.v7.widget.RecyclerView;
import android.support.wearable.view.WearableListView;
import android.view.ViewGroup;

/**
 * Created by yair.carreno on 05/07/2015.
 */
public class Adapter extends WearableListView.Adapter  {
    private final String[] mColors;

    public Adapter(String[] colors){
        mColors = colors;
    }
    @Override
    public WearableListView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ColorItemViewHolder(new ColorItem(viewGroup.getContext()));
    }

    @Override
    public void onBindViewHolder(WearableListView.ViewHolder holder, int position) {
        ColorItemViewHolder colorItemViewHolder = (ColorItemViewHolder) holder;
        String colorName = mColors[position];
        colorItemViewHolder.mColorItem.setColor(colorName);

        RecyclerView.LayoutParams layoutParams =
                new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT);
        colorItemViewHolder.itemView.setLayoutParams(layoutParams);
    }

    @Override
    public int getItemCount() {
        return mColors.length;
    }

    public static class ColorItemViewHolder extends WearableListView.ViewHolder {
        private final ColorItem mColorItem;

        public ColorItemViewHolder(ColorItem colorItem) {
            super(colorItem);
            mColorItem = colorItem;
        }

        public ColorItem getmColorItem() {
            return mColorItem;
        }
    }
}