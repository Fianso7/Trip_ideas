package com.example.fcode;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView welcom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        welcom=findViewById(R.id.welcom);
        String intent = getIntent().getStringExtra("message");
        String message = intent + "Choose your activity ";
        welcom.setText(message);
    }
}