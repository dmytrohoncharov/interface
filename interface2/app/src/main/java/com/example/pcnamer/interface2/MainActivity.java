package com.example.pcnamer.interface2;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Context ctx = getApplicationContext();
        //Vo_login log = new Vo_login(ctx);
        //Log.e("tag", log.setXml());

    }
}

