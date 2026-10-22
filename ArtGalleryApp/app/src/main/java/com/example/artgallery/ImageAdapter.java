
package com.example.artgallery;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {

    Context context;
    int[] images;

    public ImageAdapter(Context c, int[] imgs) {
        context = c;
        images = imgs;
    }

    public int getCount() { return images.length; }
    public Object getItem(int p) { return images[p]; }
    public long getItemId(int p) { return p; }

    public View getView(int p, View v, ViewGroup parent) {
        ImageView img = (v == null) ? new ImageView(context) : (ImageView) v;
        img.setLayoutParams(new ViewGroup.LayoutParams(300,300));
        img.setScaleType(ImageView.ScaleType.CENTER_CROP);
        img.setImageResource(images[p]);
        return img;
    }
}
