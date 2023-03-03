package com.example.mydemo;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

public class ImageAdapter extends PagerAdapter {

    Context context;
    ImageAdapter(Context context){
        this.context=context;
    }
    @Override
    public int getCount() {
        return sliderimageId.length;
    }

    @Override
    public boolean isViewFromObject( View view,  Object object) {
        return view==((ImageView)object);
    }

    private int[] sliderimageId=new int[]{R.drawable.twitter_logo_png,R.drawable.youtube_logo,R.drawable.nstagramlogo};

    @Override
    public  Object instantiateItem(ViewGroup container,int position){
        ImageView imageView=new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(sliderimageId[position]);
        ((ViewPager)container).addView(imageView,0);
        return imageView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ((ViewPager) container).removeView((ImageView) object);
    }


}
