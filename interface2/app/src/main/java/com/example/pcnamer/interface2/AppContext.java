package com.example.pcnamer.interface2;

import android.content.Context;
import android.widget.LinearLayout;

/**
 * Created by PcNamer on 2018-03-20.
 */

public class AppContext {

    Context ctx;
    LinearLayout top_bar;
    LinearLayout bottom_layout;
    LinearLayout main_l;

    public AppContext(){

    }

    public Context getContext(){
        return this.ctx;
    }

    public LinearLayout getTopLayout(){
        return this.top_bar;
    }

    public LinearLayout getMainLayout(){
        return this.main_l;
    }

    public LinearLayout getBotLayout(){
        return this.bottom_layout;
    }







}
