package com.example.abima.intentpassing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ImageView imageView = (ImageView) findViewById(R.id.star);
        Button button = (Button) findViewById(R.id.back);
        TextView textView = (TextView) findViewById(R.id.text);

        Intent intent = getIntent();
        String color = intent.getStringExtra("color");

        imageView.setImageResource(this.getResources().getIdentifier("drawable/" + color, null, this.getPackageName()));
        textView.setText(color + "Star");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
    }
}
