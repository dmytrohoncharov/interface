package com.example.pcnamer.interface2;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import com.example.pcnamer.interface2.actions.ActionBuildContainer;
import com.example.pcnamer.interface2.view_objects.views.ViewFieldText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewFieldText login = new ViewFieldText("LOGIN", "Enter login");
        int a = login.getLayout();
        setContentView(a);
        LinearLayout content = (LinearLayout)findViewById(R.id.lay);
        LayoutInflater factory = LayoutInflater.from(this);
        View myView = factory.inflate(a, null);
        content.addView(myView);
        //Context ctx = getApplicationContext();
        //ActionBuildContainer test = new ActionBuildContainer(1);
        //Vo_login log = new Vo_login(ctx);
        //Log.e("tag", log.setXml());

    }
}

