package com.company.model.figures;

import com.company.model.*;

import java.util.ArrayList;

public class Rook extends Figure {

    public Rook (Color color, byte i, byte j){
        super(color, i, j);
    }

    public boolean moveTo(byte i, byte j) {
        return true;
    }

    public ArrayList<Way> possibleMovesList (byte posI, byte posJ){
        ArrayList<Way> possibleMoves = new ArrayList<Way>();
        Position pos;
        Way w;


        //опишем вариаци хождения ладьи
        //#1
        pos = new Position (posI, posJ);
        w = new Way();
        w.add(pos);
        while (true) {
            pos=pos.upPosition(getFigureColor());
            if (pos.inBoard()) {
                w.add(pos);
                possibleMoves.add(w.clone());
            } else break;
        }

        //#2
        pos = new Position (posI, posJ);
        w = new Way();
        w.add(pos);
        while (true) {
            pos=pos.downPosition(getFigureColor());
            if (pos.inBoard()) {
                w.add(pos);
                possibleMoves.add(w.clone());
            } else break;
        }

        //#3
        pos = new Position (posI, posJ);
        w = new Way();
        w.add(pos);
        while (true) {
            pos=pos.leftPosition(getFigureColor());
            if (pos.inBoard()) {
                w.add(pos);
                possibleMoves.add(w.clone());
            } else break;
        }

        //#4
        pos = new Position (posI, posJ);
        w = new Way();
        w.add(pos);
        while (true) {
            pos=pos.rightPosition(getFigureColor());
            if (pos.inBoard()) {
                w.add(pos);
                possibleMoves.add(w.clone());
            } else break;
        }

        return possibleMoves;
    }

    public void print(){
        System.out.print((getFigureColor() == Color.WHITE) ? "wRk  " : "bRk  ");
    }
}
