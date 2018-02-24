package com.example.pcnamer.interface2.view_objects.containers;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

import com.example.pcnamer.interface2.MainActivity;
import com.example.pcnamer.interface2.R;
import com.example.pcnamer.interface2.view_objects.ViewObject;

/**
 * Created by PcNamer on 2018-02-24.
 */

public class Div extends ViewObject {

    public int level;
    public Context ctx;

    public Div(int level, ViewObject[] objects, Context ctx) {
        super();
        this.level = level;
        this.ctx = ctx;
    }
    public int getLevel(){
        return this.level;
    }

    public View getContainer(){

        LayoutInflater factory = LayoutInflater.from(this.ctx);

        View myView = factory.inflate(this.getLayout(), null);

        return myView;
    }

    @Override
    public String getObjectName() {
        return "div";
    }
}
