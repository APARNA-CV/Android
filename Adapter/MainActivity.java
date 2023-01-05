package com.example.adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView ls;
    String[] list={"grapes","apple","kiwi"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ls=(ListView) findViewById(R.id.ls);
        ArrayAdapter<String> a=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,list);
        try {
            ls.setAdapter(a);
        }
        catch (Exception e)
        {
            Toast.makeText(this,"Something went wrong",Toast.LENGTH_SHORT).show();
        }
    }
}