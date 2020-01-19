package com.company.entity;

import java.util.ArrayList;

public abstract class Figure {
    private final Color figureColor;
    private byte pos_i;
    private byte pos_j;

    public void setI (byte i){
        this.pos_i = i;
    }

    public void setJ (byte j){
        this.pos_j = j;
    }

    public Color getFigureColor() {
        return figureColor;
    }

    public byte getPos_i() {
        return pos_i;
    }

    public byte getPos_j() {
        return pos_j;
    }

    public Figure (Color color, byte i, byte j) {
        figureColor = color;
        pos_i = i;
        pos_j = j;
    }

    public void kill (){
        //что делаем с фигурой, когда ее срубили, положеение "вне поля"
        pos_i= -127;//минимальное значение типа byte
        pos_j= -127;
    }

    public abstract boolean moveTo (byte i, byte j);

    public abstract ArrayList<Way> possibleMovesList (ChessBoard board);

    public abstract void print();
}