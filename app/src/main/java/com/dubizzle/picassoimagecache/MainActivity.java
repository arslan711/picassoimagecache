package com.dubizzle.picassoimagecache;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;

import com.dubizzle.customimagecache.PicassoCache;

public class MainActivity extends AppCompatActivity {
ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        imageView=findViewById(R.id.image);
        PicassoCache.load("https://demo-app-photos-45687895456123.s3.amazonaws.com/46a0c97762ba449cb49b3575681a4d84?AWSAccessKeyId=ASIASV3YI6A4Q3NXHYVV&Signature=anwKAtdoQMrOtV%2Bw%2BcLJ8ACqRVo%3D&x-amz-security-token=IQoJb3JpZ2luX2VjEKj%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FwEaCXVzLWVhc3QtMSJHMEUCIHdvUVRVZaE4pJ1lyI0b90lRgGvte5lkRW5DJwDbA46kAiEArjp%2BdNyvcFwRibOyN1c80EES%2FP0gN6PAD96rJPZq6bQq1wEIkf%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FARACGgwxODQzOTg5NjY4NDEiDHc6F7%2BTFpg3ewulYCqrAZfVhXIiPII2xoMVpMjOdfswbjqZYfYBwbDJNS6OhG8%2BTkaqOjAIk3pk1i%2BbBMdhMAbVfxDQljvyh%2BeWf5a86uwwRPASaOHiC%2BeSsKwS%2F54UgXytTReSm8wWLWRrrWmoz%2B9DrzPaqs2UorfQ%2FDYIsT7qYjrJkGI8tKz0Af%2F1XPRr7CsFF%2FZSa%2FCjWjs71RHyAqyoe8mEvOwGf21Y7qQ2R65rjOfFbJmaa8Rx%2FzCegtaABjrgAafPzB%2BlvKx8t2bvvKUPVudtIzqUdYjhSJCYnTGuBU%2FN4D9tJOSBUNFhDNIGG9q1BXFmb9aY4inATcztOahRTysztKqhCm0k4lZsKZ470nLe8KW%2FGxe6g9b1T0x5DSkMmF1kCoFWJiht4Bm0neTTMNgbEuSG%2FBaLffAH%2FZRxstQsMIzPvQ9v8z0yDq48h%2BANLuWMhzpK%2BVB3hyE28WQIf0GCZFZR4J6ZQKekS16I4sQor0RB1qYF6qS9%2BmxAdpImZlNuP2ac6Mgx7ofZjkWWmUgt9knVSGFhvoOhU2TM%2BcG6&Expires=1612025695",
             imageView,60,60   );
    }
}