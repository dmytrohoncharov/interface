package com.example.pcnamer.interface2;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.pcnamer.interface2.view_objects.views.VOTextView;
import com.example.pcnamer.interface2.view_objects.views.ViewObject;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LinearLayout main_layout = (LinearLayout) findViewById(R.id.main_layout);
        final LinearLayout bot_layout = (LinearLayout) findViewById(R.id.bottom_layout);
        final LinearLayout top_layout = (LinearLayout) findViewById(R.id.top_bar);

        AppContext ctx = new AppContext() {
            @Override
            public Context getContext() {
                return getApplicationContext();
            }
            @Override
            public LinearLayout getTopLayout(){
                return top_layout;
            }
            @Override
            public LinearLayout getMainLayout(){
                return main_layout;
            }
            @Override
            public LinearLayout getBotLayout(){
                return bot_layout;
            }
        };

       // ViewObject a = new ViewObject(ctx, R.layout.vo_text_view);
        VOTextView a = new VOTextView(ctx);
        //TextView text = (TextView)
        //Controller ctr = new Controller(ctx);
        //ctr.create("loginField");



      //  main_layout.addView(a);




        //Context ctx = getApplicationContext();
    }
}

