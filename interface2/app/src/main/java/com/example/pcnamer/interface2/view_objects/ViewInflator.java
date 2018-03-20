package com.example.pcnamer.interface2.view_objects;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.pcnamer.interface2.AppContext;

/**
 * Created by PcNamer on 2018-03-20.
 */

public class ViewInflator extends FrameLayout {

    public ViewInflator(AppContext context, LinearLayout box, int layout){
        this(context.getContext(),null, layout, box);
    }

    public ViewInflator(Context context, AttributeSet attr, int layout, LinearLayout box){
        super(context, attr,layout);
        LayoutInflater.from(context).inflate(layout,this);
        box.addView(this);

        TextView text = (TextView) findViewWithTag("text");
        text.setText("text");

    }

}
