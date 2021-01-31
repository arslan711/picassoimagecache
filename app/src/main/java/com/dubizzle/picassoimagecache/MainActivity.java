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
        PicassoCache.load("https://demo-app-photos-45687895456123.s3.amazonaws.com/6bda5343ed714ddf90af089de05fe9c6-thumbnail?AWSAccessKeyId=ASIASV3YI6A424LH7EXW&Signature=pnN4%2BI6J7KP0Oop0QDJVdCiAgqw%3D&x-amz-security-token=IQoJb3JpZ2luX2VjELv%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FwEaCXVzLWVhc3QtMSJHMEUCICdu8I8Rpx4zc8RfRQmCVpSfVbhXo6eVVRvHRX%2FDByhPAiEA0i9dIHySS7uWuT4VICdDuXmc38otNNS4VKcaR02e7VAq1wEIpP%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FARACGgwxODQzOTg5NjY4NDEiDMn2eszCFdT7uCGopSqrARNURAf6t%2BfMe4R7UUeYQTDR6uQIcx%2F0unLmwMQxUJcF52dQ81uVNQSvQAUz6yhejBmkp3jl6um7diSTERqmf4T%2BNex4%2Bc2ZDfAH0Q%2BZlYiqQUMR44%2BZTSOGBkD07I3VJCEXMRLP56S59ccrtMr01zIrNi8rAquHqW51vU7mXoBjkxz8dn3RtKGjOORKsI9kxbcVqqk8V14j7KV0Ak21GhXs6Q13kXqiHAIR4jDgkNqABjrgAbZ8cqtfMTNpmBKPtT%2Fq5JvXnlN5mtuqKU0G8lryp4SOsEiK%2B5vnUCX%2F%2BYLAhTFqk1NfpbWNfhgKkEz0EtQIVJbh4GnHg%2FpecO8cNaLdChKKrDSGAFTVbsUYXJSOP59ioIdAJhy1hzMgxaOtLR80WPrjfFyE8eiJ4Hz1SRujJftyLPeRheZh3MQojcHZdKcJ9MuCpTwLjU6GnPj4sB%2FwryN3KJrbk%2Bh2pHKkNQI4URESracvVwIUyQ3cQZmlkhqnh8GDj8bnNKdLPK7SdB9QP5r4byy17irB6WlBz4VdaEep&Expires=1612093620",
             imageView,60,60   );
    }
}