package com.example.gridcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText n1,n2;
    TextView res;
    Button add,mul,div,sub;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1=(EditText) findViewById(R.id.n1);
        n2=(EditText) findViewById(R.id.n2);
        res=(TextView) findViewById(R.id.res);
        add=(Button) findViewById(R.id.add);
        mul=(Button) findViewById(R.id.mul);
        sub=(Button) findViewById(R.id.sub);
        div=(Button) findViewById(R.id.div);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f1=Integer.parseInt(n1.getText().toString());
                int f2=Integer.parseInt(n2.getText().toString());
                int f3=f1+f2;
                res.setText("Addition ="+f3);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f1=Integer.parseInt(n1.getText().toString());
                int f2=Integer.parseInt(n2.getText().toString());
                int f3=f1-f2;
                res.setText("Sutraction ="+f3);
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f1=Integer.parseInt(n1.getText().toString());
                int f2=Integer.parseInt(n2.getText().toString());
                int f3=f1*f2;
                res.setText("Multiplication ="+f3);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f1=Integer.parseInt(n1.getText().toString());
                int f2=Integer.parseInt(n2.getText().toString());
                int f3=f1/f2;
                res.setText("Division ="+f3);
            }
        });
    }
}