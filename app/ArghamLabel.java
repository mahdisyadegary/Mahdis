package com.arghamsystem.arghamak;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

/**
 * Created by Ali , on 19/08/2019.
 */

public class ArghamLabel extends android.support.v7.widget.AppCompatTextView {


    public ArghamLabel(Context context) {
        super(context);
        Typeface face=Typeface.createFromAsset(context.getAssets(), "fonts/IRANSansMobile(FaNum).ttf");
        this.setTypeface(face);
    }

    public ArghamLabel(Context context, AttributeSet attrs) {
        super(context, attrs);
        Typeface face=Typeface.createFromAsset(context.getAssets(), "fonts/IRANSansMobile(FaNum).ttf");
        this.setTypeface(face);
    }

    public ArghamLabel(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        Typeface face=Typeface.createFromAsset(context.getAssets(), "fonts/IRANSansMobile(FaNum).ttf");
        this.setTypeface(face);
    }


}

