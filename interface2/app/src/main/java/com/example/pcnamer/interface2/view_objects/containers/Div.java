package com.example.pcnamer.interface2.view_objects.containers;

import com.example.pcnamer.interface2.view_objects.ViewObject;

/**
 * Created by PcNamer on 2018-02-24.
 */

public class Div extends ViewObject {

    public int level;

    public Div(int level) {
        super();
        this.level = level;
    }

    @Override
    public String getObjectName(){
        return "Div created, level = " + this.level;
    }

    public int getLevel(){
        return this.level;
    }

}
