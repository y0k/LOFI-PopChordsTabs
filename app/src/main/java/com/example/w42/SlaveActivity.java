package com.example.w42;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SlaveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slave);
        getWindow().getDecorView().setBackgroundColor(Color.BLACK);

        //### PICTURE ###//
        final ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.drawable.image_name);
        setContentView(imageView);

    }
}