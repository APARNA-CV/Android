package com.example.toggle_image;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ToggleButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView im;
    ToggleButton tg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        im=(ImageView) findViewById(R.id.im);
        tg=(ToggleButton) findViewById(R.id.tg);
        im.setVisibility(View.INVISIBLE);
        tg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tg.isChecked())
                {
                    im.setVisibility(View.VISIBLE);
                }
                else
                {
                    im.setVisibility(View.INVISIBLE);
                }
            }
        });
    }
}