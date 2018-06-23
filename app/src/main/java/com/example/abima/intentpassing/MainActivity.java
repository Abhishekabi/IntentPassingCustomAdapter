package com.example.abima.intentpassing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    String[] colors = new String[]{
            "red","blue","green","yellow","red","blue","green","yellow","red","blue","green","yellow","red","blue","green","yellow","red","blue","green","yellow","red","blue","green","yellow","red","blue","green","yellow","red","blue","green","yellow"
    };

    int[] images = new int[]{
            R.drawable.red,R.drawable.blue,R.drawable.green,R.drawable.yellow,R.drawable.red,R.drawable.blue,R.drawable.green,R.drawable.yellow,R.drawable.red,R.drawable.blue,R.drawable.green,R.drawable.yellow,R.drawable.red,R.drawable.blue,R.drawable.green,R.drawable.yellow,R.drawable.red,R.drawable.blue,R.drawable.green,R.drawable.yellow,R.drawable.red,R.drawable.blue,R.drawable.green,R.drawable.yellow,R.drawable.red,R.drawable.blue,R.drawable.green,R.drawable.yellow,R.drawable.red,R.drawable.blue,R.drawable.green,R.drawable.yellow
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.list);

        //ArrayAdapter arrayAdapter = new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,colors) ;

        CustomAdapter customAdapter = new CustomAdapter();

        listView.setAdapter(customAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(),secondActivity.class);
                intent.putExtra("color",colors[i]);
                startActivity(intent);
            }
        });
    }

    public class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return colors.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view = getLayoutInflater().inflate(R.layout.custom_list,null);
            ImageView imageView = (ImageView) view.findViewById(R.id.image);
            TextView colorText = (TextView) view.findViewById(R.id.color);

            imageView.setImageResource(images[i]);
            colorText.setText(colors[i]);

            return view;
        }
    }
}












