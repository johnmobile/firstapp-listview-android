package com.johnreis.instituto.firstdayapp.views;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;

import com.johnreis.instituto.firstdayapp.R;

public class ActivitySplash extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable()
        {
            @Override
            public void run() {
                Intent i = new Intent(getBaseContext(), ActivityMain.class);
                startActivity(i);
            }
        }, 3000 );

    }
}
