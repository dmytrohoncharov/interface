package com.example.pcnamer.interface2;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import com.example.pcnamer.interface2.actions.ActionBuildContainer;
import com.example.pcnamer.interface2.view_objects.containers.Div;
import com.example.pcnamer.interface2.view_objects.views.ViewFieldText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewFieldText login = new ViewFieldText("LOGIN", "Enter login");
        ViewFieldText pass = new ViewFieldText("PASSWORD", "Enter password");
        ViewFieldText array[] = {login, pass};

        Context ctx = getApplicationContext();
        Div startDiv = new Div(0, array, ctx);
        View view = startDiv.getContainer();

      // int a = login.getLayout();
        LinearLayout content = findViewById(R.id.lay);
        content.addView(view);

      // LayoutInflater factory = LayoutInflater.from(this);

      // View myView = factory.inflate(a, null);
        // 4isto twoj test kod
        ViewFieldText testField = new ViewFieldText("Sania pidor", "da ili nit");
        int b = login.getLayout();
        LayoutInflater factory = LayoutInflater.from(this);
        View myView = factory.inflate(b, null);
        content.addView(myView);
       // class.create("textField")

        //ActionBuildContainer test = new ActionBuildContainer(1);
        //Vo_login log = new Vo_login(ctx);
        //Log.e("tag", log.setXml());

        // два вью

    }
}

