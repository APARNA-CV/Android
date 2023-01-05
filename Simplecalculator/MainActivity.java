package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText num1,num2;
    Button add,mul,sub,div;
    TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1=(EditText) findViewById(R.id.num1);
        num2=(EditText) findViewById(R.id.num2);
        add=(Button) findViewById(R.id.add);
        mul=(Button) findViewById(R.id.mul);
        div=(Button) findViewById(R.id.div);
        sub=(Button) findViewById(R.id.sub);
        res=(TextView) findViewById(R.id.res);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f1=Integer.parseInt(num1.getText().toString());
                int f2=Integer.parseInt(num2.getText().toString());
                int f3=f1+f2;
                res.setText("Addition ="+f3);
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              int f1=Integer.parseInt(num1.getText().toString());
              int f2=Integer.parseInt(num2.getText().toString());
              int f3=f1*f2;
              res.setText("Multiplication ="+f3);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f1=Integer.parseInt(num1.getText().toString());
                int f2=Integer.parseInt(num2.getText().toString());
                int f3=f1-f2;
                res.setText("Subtraction ="+f3);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f1=Integer.parseInt(num1.getText().toString());
                int f2=Integer.parseInt(num2.getText().toString());
                int f3=f1/f2;
                res.setText("Division ="+f3);
            }
        });
    }

}