package com.example.saket.picassosample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = (ImageView)findViewById(R.id.imageView);


        Picasso.with(this)
                .load("https://www.simplifiedcoding.net/wp-content/uploads/2015/10/advertise.png")
                .into(imageView);

    }
}
