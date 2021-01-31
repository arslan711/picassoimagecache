package com.dubizzle.customimagecache;

import android.annotation.SuppressLint;
import android.util.TypedValue;
import android.widget.ImageView;

import com.squareup.picasso.NetworkPolicy;
import com.squareup.picasso.Picasso;

public class PicassoCache {


    @SuppressLint("UseCompatLoadingForDrawables")
    public static void load(String url, ImageView view, int height, int width) {

        Picasso
                .get()
                .load(url)
                .placeholder(view.getResources().getDrawable(R.drawable.emptyholder))
                .transform(new RoundTransform(5,5))
                .networkPolicy(NetworkPolicy.OFFLINE)
                .resize((int)TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, width, view.getContext().getResources().getDisplayMetrics())
                        ,(int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, height, view.getContext().getResources().getDisplayMetrics()))
                                .into(view, new com.squareup.picasso.Callback() {
                                    @Override
                                    public void onSuccess() {

                                    }

                                    @Override
                                    public void onError(Exception e) {

                                        //Try again online if cache failed
                                        Picasso
                                                .get()
                                                .load(url)
                                                .placeholder(view.getResources().getDrawable(R.drawable.emptyholder))
                                                .transform(new RoundTransform(5,5))
                                                .resize((int)TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, width, view.getContext().getResources().getDisplayMetrics())
                                                        ,(int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, height, view.getContext().getResources().getDisplayMetrics()))
                                                .into(view, new com.squareup.picasso.Callback() {
                                                    @Override
                                                    public void onSuccess() {

                                                    }

                                                    @Override
                                                    public void onError(Exception e) {

                                                        Picasso
                                                                .get()
                                                                .load("https://placeholder17.blob.core.windows.net/placeholder/emptyholder.png")
                                                                .resize((int)TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, width, view.getContext().getResources().getDisplayMetrics())
                                                                        ,(int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, height, view.getContext().getResources().getDisplayMetrics()))
                                                                .into(view, new com.squareup.picasso.Callback() {
                                                                    @Override
                                                                    public void onSuccess() {

                                                                    }

                                                                    @Override
                                                                    public void onError(Exception e) {
                                                                    }

                                                                });
                                                    }

                                                });
                                    }

                                });

    }
}
