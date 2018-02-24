package com.example.pcnamer.interface2.view_objects;

import android.app.Activity;
import android.drm.DrmStore;
import android.util.Log;
import android.view.View;

import com.example.pcnamer.interface2.Pickle;
import com.example.pcnamer.interface2.R;
import com.example.pcnamer.interface2.actions.AppAction;
import com.example.pcnamer.interface2.controls.LayoutControl;

/**
 * Created by PcNamer on 2018-02-24.
 */

public class ViewObject implements Pickle{
    public ViewObject(){
        Log.d("Object",getObjectName() + " created");
        int layout = getLayout();
    }

    public String getObjectName(){
        return "empty object";
    }

    public int getLayout(){
       return LayoutControl.getLayout(this.getObjectName());
    }

}
