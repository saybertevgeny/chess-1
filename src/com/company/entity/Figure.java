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

    public abstract void print();

    public abstract boolean moveTo (byte i, byte j);

    public abstract ArrayList<Way> possibleMovesList (ChessBoard board);

    //смотрим, нет ли на пути фигур того же цвета?
    public boolean isAllowedWay (Way way, ChessBoard board){
        boolean trigger = true;
        for (int i = 1; i<way.size(); i++){
            //идем с i=1, потому что 0 элемент сущности way(путь), отвечает за стартовую позицию фиигуры
            if ((board.getFigureByPosition(way.getPosition(i)) != null)
                    && (board.getFigureByPosition(way.getPosition(i)).getFigureColor() == this.figureColor)) {
                trigger = false;
            }
        }
        return trigger;
    }

    //смотрим, нет ли на пути фигур другого цвета (не срубаем ли фигуру соперника по пути)?
    public boolean isKillingWay (Way way, ChessBoard board){
        boolean isKill = false;
        for (int i = 0; i<way.size(); i++){
            if ((board.getFigureByPosition(way.getPosition(i)) != null)
                    && (board.getFigureByPosition(way.getPosition(i)).getFigureColor() != this.figureColor)) {
                isKill = true;
            }
        }
        //ПРОБЛЕМА!!! Что еслии на пути 2 фигуры подряд? как быть тогда?
        return isKill;
    }


}