package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.view.View;
import android.widget.Toast;
import android.widget.AdapterView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner ap;
    String[] list={"Bens","Bugatti","Jaguar"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ap=(Spinner) findViewById(R.id.spinner);
        ap.setOnItemSelectedListener(this);
        ArrayAdapter ar=new ArrayAdapter(this, android.R.layout.simple_spinner_item,list);
        ar.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ap.setAdapter(ar);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(this,"You have selected"+list[i],Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
        Toast.makeText(this,"you have selected nothing",Toast.LENGTH_LONG).show();
    }
}