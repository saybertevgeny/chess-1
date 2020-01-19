package com.company.model.figures;

import com.company.model.*;

import java.util.ArrayList;

public class Bishop extends Figure {

    public Bishop (Color color, int i, int j){
        super(color, i, j);
    }

    public boolean moveTo(int i, int j) {
        return true;
    }

    public ArrayList<Way> possibleMovesList (int posI, int posJ){
        ArrayList<Way> possibleMoves = new ArrayList<Way>();
        Position pos;
        Way w;


        //опишем вариаци хождения слона
        //#1
        pos = new Position (posI, posJ);
        w = new Way();
        w.add(pos);
        while (true) {
            pos=pos.diagonLeftUpPosition(getFigureColor());
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
            pos=pos.diagonRightUpPosition(getFigureColor());
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
            pos=pos.diagonLeftDownPosition(getFigureColor());
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
            pos=pos.diagonRightDownPosition(getFigureColor());
            if (pos.inBoard()) {
                w.add(pos);
                possibleMoves.add(w.clone());
            } else break;
        }

        return possibleMoves;
    }

    public void print(){
        System.out.print((getFigureColor() == Color.WHITE) ? "wBs  " : "bBs  ");
    }
}
