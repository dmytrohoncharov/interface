package com.example.pcnamer.interface2.view_objects.views;

import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.pcnamer.interface2.AppContext;
import com.example.pcnamer.interface2.R;

import org.w3c.dom.Text;

/**
 * Created by PcNamer on 2018-03-20.
 */

public class VOTextView extends ViewObject {

    public AppContext ctx;
    public VOTextView(AppContext ctx){
        super(ctx);
        this.ctx = ctx;
        //TextView text = (TextView) findViewWithTag("Text");
    }
    @Override
    public String getName(){
        return "TextView";
    }
    @Override
    public int getLayout(){
        return R.layout.vo_text_view;
    }
    @Override
    public LinearLayout getBox(AppContext ctx){
        return ctx.getMainLayout();
    }
}
