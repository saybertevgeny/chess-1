package com.company;

import java.util.ArrayList;

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
        //что делаем с фигурой, когда ее срубили, положеение "вне поля"
        pos_i= -127;//минимальное значение типа byte
        pos_j= -127;
    }

    public abstract boolean MoveTo (byte i, byte j);

    public abstract ArrayList<Way> MoveTo (ChessBoard board);

    public abstract void Print();
}