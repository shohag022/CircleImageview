package com.rbmjltd.circleimageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    CircleImageView circleImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        circleImageView = findViewById(R.id.profile_image);
        circleImageView.setImageResource(R.drawable.profile);

    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}