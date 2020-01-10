package com.company;

public abstract class Figure {
    public final Color figureColor;
    public byte pos_i;
    public byte pos_j;

    Figure (Color color, byte i, byte j) {
        figureColor = color;
        pos_i = i;
        pos_j = j;
    }

    public void Kill (){
        //что то, что будем делать с фигурой, когда убраем ее с поля
    }

    public abstract boolean Move (byte i, byte j);
}