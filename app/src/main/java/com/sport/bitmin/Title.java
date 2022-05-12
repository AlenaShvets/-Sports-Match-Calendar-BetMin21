package com.sport.bitmin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Title extends AppCompatActivity {

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title);

    }

    public void start (View view)
    {
        Intent openNewWindow = new Intent(Title.this, MainActivity.class);
        startActivity(openNewWindow);
        //  mp.stop();
        //  mp.release();
        finish();
    }
}