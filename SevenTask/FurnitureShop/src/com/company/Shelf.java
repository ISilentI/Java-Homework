package com.company;

public class Shelf extends Furniture{
    private int bindType, style;

    public Shelf(int color, int size, int material, int bindType, int style) {
        super(color, size, material, size*material*100);
        this.bindType = bindType;
        this.style = style;
    }

    public int getBindType() {
        return bindType;
    }

    public int getStyle() {
        return style;
    }

    @Override
    public String toString() {
        return super.toString() + "Shelf: -> Bind: " + bindType + "| Style: |" + style + "| <-";
    }
}