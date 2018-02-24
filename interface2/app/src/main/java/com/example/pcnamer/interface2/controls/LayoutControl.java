package com.example.pcnamer.interface2.controls;

import com.example.pcnamer.interface2.R;

/**
 * Created by PcNamer on 2018-02-24.
 */

public class LayoutControl {

    public static int getLayout(String name){
        switch(name){
            case "div":
                return R.layout.div_layout;
            case "field text":
                return R.layout.view_field_text_layout;
            case "text":
                return R.layout.view_text_layout;
            default:
                return R.layout.empty_layout;
        }
    }
}
