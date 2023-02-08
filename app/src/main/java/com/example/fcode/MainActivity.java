package com.example.fcode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
        TextView text,swipe,submit;
        EditText name,email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        swipe = findViewById(R.id.button3);
        text=findViewById(R.id.textView);
        name=findViewById(R.id.editTextTextPersonName);
        email=findViewById(R.id.email);
        submit =findViewById(R.id.sub);


        swipe.setVisibility(View.INVISIBLE);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               String n_name = name.getText().toString();
               String n_email = email.getText().toString();

               if (n_name.isEmpty() && n_email.isEmpty())
                   Toast.makeText(getApplicationContext(), " Please fill in all fields ", Toast.LENGTH_SHORT).show();
               else {
                    swipe.setVisibility(View.VISIBLE);
                   submit.setVisibility(View.INVISIBLE);

               }

               swipe.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View view) {

                       String show = n_name ;

                       Intent intent =new Intent(MainActivity.this ,MainActivity2.class);
                       intent.putExtra("message",show);
                       startActivity(intent);
                   }
               });


            }
        });



    }
}