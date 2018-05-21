package com.example.jplo.glide;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    private Context context = MainActivity.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        String internetUrl = "http://media.comicbook.com/2018/03/avengers-infinity-war-poster-1093756.jpeg";

        Glide.with(context)
                .load(internetUrl)
                .into(imageView);
    }
}
