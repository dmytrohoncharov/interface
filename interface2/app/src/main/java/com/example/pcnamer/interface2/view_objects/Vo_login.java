package com.example.pcnamer.interface2.view_objects;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;

import com.example.pcnamer.interface2.MainActivity;
import com.example.pcnamer.interface2.R;

import java.util.zip.Inflater;

/**
 * Created by PcNamer on 2018-02-21.
 */

public class Vo_login extends ViewObject{
    public Vo_login(Context ctx){
        Log.e("Tag","ZOPA2");
        LayoutInflater.from(ctx).inflate(R.layout.vo_text_field, null);
    }
    @Override
    public String setXml(){
       return "Vo_login";
    }

}
