package com.example.pcnamer.interface2.view_objects;

import android.app.Activity;
import android.util.Log;
import android.view.View;

import com.example.pcnamer.interface2.Pickle;
import com.example.pcnamer.interface2.R;

/**
 * Created by PcNamer on 2018-02-24.
 */

public class ViewObject implements Pickle {
    public ViewObject(){
        Log.d("Object",getObjectName());
        int layout = getLayout();
    }

    public String getObjectName(){
        return "Object createt";
    }

    public int getLayout(){
        return R.layout.empty_layout;
    }
}
