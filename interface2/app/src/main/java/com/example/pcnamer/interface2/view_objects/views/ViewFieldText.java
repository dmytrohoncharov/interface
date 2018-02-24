package com.example.pcnamer.interface2.view_objects.views;
import com.example.pcnamer.interface2.R;

/**
 * Created by PcNamer on 2018-02-24.
 */

public class ViewFieldText extends ViewText {

    public String label;
    public String value;

    public ViewFieldText() {
        super();
    }
    public ViewFieldText(String value) {
        super(value);
    }
    public ViewFieldText(String value, String label) {
        super(value);
        this.label = label;
    }

    @Override
    public String getObjectName(){
        return "ViewFieldText";
    }

    @Override
    public int getLayout(){
        return R.layout.view_field_text_layout;
    }

}
