package com.example.pcnamer.interface2.actions;

import android.content.Context;
import android.util.Log;

import com.example.pcnamer.interface2.Pickle;

/**
 * Created by PcNamer on 2018-02-24.
 */

public class AppAction implements Pickle {
    public AppAction(){
        Log.d("Action" , getActionName());
    }

    public String getActionName(){
        return "AppAction created";
    }
}
