package com.example.pcnamer.interface2.actions;

import com.example.pcnamer.interface2.view_objects.containers.Div;

/**
 * Created by PcNamer on 2018-02-24.
 */

public class ActionBuildContainer extends AppAction {

    public int level;
    public  ActionBuildContainer(int level){
        super();
        Div newContainer = new Div(level);
    }

    @Override
    public String getActionName(){
        return "Build Container";
    }


}
