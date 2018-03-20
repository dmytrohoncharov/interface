package com.example.pcnamer.interface2.view_objects.views;

import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

import com.example.pcnamer.interface2.view_objects.ViewInflator;
import com.example.pcnamer.interface2.AppContext;

/**
 * Created by PcNamer on 2018-03-20.
 */

public class ViewObject {

    private String name;
    private int layout;
    private LinearLayout box;

    public ViewObject(AppContext ctx){

        ViewInflator new_obj = new ViewInflator(ctx, getBox(ctx), getLayout());

        Log.e("Creating View Object - ", this.getName());

    }

    public String getName(){
        return name;
    }

    public int getLayout(){
        return layout;
    }

    public LinearLayout getBox(AppContext ctx){
        return box;
    }






}
