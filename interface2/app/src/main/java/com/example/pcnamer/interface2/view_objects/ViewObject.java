package com.example.pcnamer.interface2.view_objects;

import android.util.Log;

import com.example.pcnamer.interface2.Pickle;

/**
 * Created by PcNamer on 2018-02-24.
 */

public class ViewObject implements Pickle {
    public ViewObject(){
        Log.d("Object",getObjectName());
    }
    public String getObjectName(){
        return "Object createt";
    }
}
