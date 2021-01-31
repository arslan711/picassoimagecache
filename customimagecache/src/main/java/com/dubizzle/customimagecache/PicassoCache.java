package com.dubizzle.customimagecache;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.NetworkPolicy;
import com.squareup.picasso.Picasso;

public class PicassoCache {


    public static void load(String url, ImageView view, int height, int width) {

        Picasso
                .get()
                .load(url)
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
