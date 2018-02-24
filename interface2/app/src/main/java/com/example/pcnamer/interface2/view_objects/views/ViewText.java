package com.example.pcnamer.interface2.view_objects.views;

import com.example.pcnamer.interface2.R;
import com.example.pcnamer.interface2.view_objects.ViewObject;

/**
 * Created by PcNamer on 2018-02-24.
 */

public class ViewText extends ViewObject {

    public String value;

    public ViewText(){
        super();
    }

    public ViewText(String value){
        super();
    }

    @Override
    public String getObjectName(){
        return "View Text";
    }

    @Override
    public int getLayout(){
        return R.layout.view_text_layout;
    }
}
