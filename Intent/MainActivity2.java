package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity2 extends AppCompatActivity {
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button btn1=(Button) this.<View>findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(MainActivity2.this,MainActivity.class);
                startActivity(in);
            }
        });
    }
}