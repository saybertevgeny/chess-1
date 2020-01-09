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

    public Kill (){
        currentPositionI = -1;
        currentPositionJ = -1;
    }

    public Move (byte i, byte j){
        currentPositionI = i;
        currentPositionJ = j;
    }
}
