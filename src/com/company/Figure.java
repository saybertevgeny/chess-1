package com.company;

public abstract class Figure {
    public final Color figureColor;
    public Position pos;

    Figure (Color color, Position position) {
        figureColor = color;
        pos = position;
    }

    public void Kill (){
        //что то, что будем делать с фигурой, когда убраем ее с поля
    }

    public abstract boolean Move (Position position);
}