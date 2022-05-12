package com.sport.bitmin;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton wezerstart = (ImageButton) findViewById(R.id.wezerstart);
        wezerstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent start = new Intent(MainActivity.this, Fixture.class);
                startActivity(start);
            }
        });
    }
}