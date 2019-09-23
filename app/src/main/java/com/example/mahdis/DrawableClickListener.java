package com.example.mahdis;
/**
 * Created by Ali on 19/08/2019.
 */
public interface DrawableClickListener {

    public static enum DrawablePosition { TOP, BOTTOM, LEFT, RIGHT };
    public void onClick(DrawablePosition target);
}