package com.company;

public abstract class Figure {
    public final Color figureColor;
    public byte currentPositionI;
    public byte currentPositionJ;

    Figure (Color color, byte i, byte j) {
        figureColor = color;
        currentPositionI = i;
        currentPositionJ = j;
    }

    public void Kill (){
        currentPositionI = -1;
        currentPositionJ = -1;
    }

    public abstract boolean Move (byte i, byte j);
}