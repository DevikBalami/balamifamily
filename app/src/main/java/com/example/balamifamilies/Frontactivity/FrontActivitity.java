package com.example.balamifamilies.Frontactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.balamifamilies.R;

public class FrontActivitity extends AppCompatActivity {
    private TextView txtsample;
    private Button btnsubmit;
    private EditText editemail, password;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtsample=findViewById(R.id.txtsample);
        btnsubmit=findViewById(R.id.btnsubmit);
        editemail=findViewById(R.id.editemail);
        password=findViewById(R.id.password);
        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editemail.getText().toString().trim().equals("devikbalami12@gmail.com") && password.getText().toString().trim().equals("catchsquare@12"))

                    txtsample.setText("Approved");
            }
        });

    }
}
