package com.example.mahdis;


import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by Ali , on 19/08/2019.
 */

public class MahdisLabel extends TextView {


    public MahdisLabel(Context context) {
        super(context);
        Typeface face=Typeface.createFromAsset(context.getAssets(), "fonts/IRANSansMobile(FaNum).ttf");
        this.setTypeface(face);
    }

    public MahdisLabel(Context context, AttributeSet attrs) {
        super(context, attrs);
        Typeface face=Typeface.createFromAsset(context.getAssets(), "fonts/IRANSansMobile(FaNum).ttf");
        this.setTypeface(face);
    }

    public MahdisLabel(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        Typeface face=Typeface.createFromAsset(context.getAssets(), "fonts/IRANSansMobile(FaNum).ttf");
        this.setTypeface(face);
    }


}

