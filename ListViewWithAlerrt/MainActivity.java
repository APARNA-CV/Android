package com.example.gridviewandalertbox;
import static com.example.gridviewandalertbox.R.layout.activity_main2;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.SimpleAdapter;
import android.view.View;
import androidx.appcompat.app.AlertDialog;
import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    GridView grid;
    int[] im={R.drawable.pic1,R.drawable.pic2};
    String[] name={"jaguar","bugatti"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        grid =findViewById(R.id.grid);
        ArrayList<HashMap<String,Object>> list = new ArrayList<>();
        for(int i=0;i<name.length;i++)
        {
            HashMap<String,Object> map=new HashMap<>();
            map.put("name",name[i]);
            map.put("image",im[i]);
            list.add(map);
        }
        String[] ff={"name","image"};
        int[] kk={R.id.tv,R.id.img};
        SimpleAdapter adapter = new SimpleAdapter(getApplicationContext(),list,activity_main2,ff,kk);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Alert");
                builder.setMessage("You clicked on"+name[i]);
                AlertDialog al=builder.create();
                al.show();
            }
        });

    }
}