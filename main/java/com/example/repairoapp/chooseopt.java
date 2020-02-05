package com.example.repairoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class chooseopt extends AppCompatActivity {
ImageButton carbtn,bikebtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chooseopt);
        carbtn=findViewById(R.id.car);
        carbtn=findViewById(R.id.bike);
        carbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
