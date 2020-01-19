package com.company.model;

import java.util.ArrayList;

public abstract class Figure {
    private final Color figureColor;

    public Color getFigureColor() {
        return figureColor;
    }

    public Figure (Color color, byte i, byte j) {
        figureColor = color;
    }

    public abstract void print();

    public abstract boolean moveTo (byte i, byte j);

    public abstract ArrayList<Way> possibleMovesList (byte posI, byte posJ);

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

    public ArrayList<Move> allowedMoves (ChessBoard board, byte posI, byte posJ){
        ArrayList<Way> pm = this.possibleMovesList(posI, posJ);
        Move m;
        ArrayList<Move> result = new ArrayList<Move>();
        for (int count = 1; count < pm.size(); count++) {
            if (this.isAllowedWay(pm.get(count), board) == true){
                //m.setMoving(pm.get(count).clone());

            }
        }
        return result;
    }


}