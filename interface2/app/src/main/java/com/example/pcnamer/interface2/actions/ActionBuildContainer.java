package com.example.pcnamer.interface2.actions;

import com.example.pcnamer.interface2.view_objects.ViewObject;
import com.example.pcnamer.interface2.view_objects.containers.Div;

/**
 * Created by PcNamer on 2018-02-24.
 */

public class ActionBuildContainer extends AppAction {

    public int level;
    public  ActionBuildContainer(int level, ViewObject[] objects){
        super();
       // Div newContainer = new Div(level, objects);
    }

    @Override
    public String getActionName(){
        return "Build Container";
    }


}
