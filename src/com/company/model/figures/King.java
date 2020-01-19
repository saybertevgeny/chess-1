package com.company.model.figures;

import com.company.model.*;

import java.util.ArrayList;

public class King extends Figure {

    public King (Color color, int i, int j){
        super(color, i, j);
    }

    public ArrayList<Way> possibleMovesList (int posI, int posJ){
        ArrayList<Way> possibleMoves = new ArrayList<Way>();
        Position pos;
        Way w;

        //опишем вариаци хождения короля
        //#1
        pos = new Position (posI, posJ);
        w = new Way();
        w.add(pos);
        pos=pos.rightPosition(getFigureColor());        ;
        if (pos.inBoard()){
            w.add(pos);
            possibleMoves.add(w.clone());
        }

        //#2
        pos = new Position (posI, posJ);
        w = new Way();
        w.add(pos);
        pos=pos.leftPosition(getFigureColor());
        if (pos.inBoard()){
            w.add(pos);
            possibleMoves.add(w.clone());
        }

        //#3
        pos = new Position (posI, posJ);
        w = new Way();
        w.add(pos);
        pos=pos.upPosition(getFigureColor());
        if (pos.inBoard()){
            w.add(pos);
            possibleMoves.add(w.clone());
        }

        //#4
        pos = new Position (posI, posJ);
        w = new Way();
        w.add(pos);
        pos=pos.downPosition(getFigureColor());
        if (pos.inBoard()){
            w.add(pos);
            possibleMoves.add(w.clone());
        }

        //#5
        pos = new Position (posI, posJ);
        w = new Way();
        w.add(pos);
        pos=pos.diagonRightUpPosition(getFigureColor());
        if (pos.inBoard()){
            w.add(pos);
            possibleMoves.add(w.clone());
        }

        //#6
        pos = new Position (posI, posJ);
        w = new Way();
        w.add(pos);
        pos=pos.diagonLeftUpPosition(getFigureColor());
        if (pos.inBoard()){
            w.add(pos);
            possibleMoves.add(w.clone());
        }

        //#7
        pos = new Position (posI, posJ);
        w = new Way();
        w.add(pos);
        pos=pos.diagonRightDownPosition(getFigureColor());
        if (pos.inBoard()){
            w.add(pos);
            possibleMoves.add(w.clone());
        }

        //#8
        pos = new Position (posI, posJ);
        w = new Way();
        w.add(pos);
        pos=pos.diagonLeftDownPosition(getFigureColor());
        if (pos.inBoard()){
            w.add(pos);
            possibleMoves.add(w.clone());
        }

        return possibleMoves;
    }

    public void print(){
        System.out.print((getFigureColor() == Color.WHITE) ? "wK   " : "bK   ");
    }

}