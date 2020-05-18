package com.example.balamifamilies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.balamifamilies.Frontactivity.FrontActivitity;

public class MainActivity extends AppCompatActivity {
    private Button gotologin;
    private ImageView imagefront;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gotologin = findViewById(R.id.gotologin);
        imagefront = findViewById(R.id.imagefront);
        gotologin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FrontActivitity.class);
                startActivity(intent);
            }
        });
    }
}
