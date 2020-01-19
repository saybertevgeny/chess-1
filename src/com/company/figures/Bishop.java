package com.company.figures;

import com.company.entity.*;

import java.util.ArrayList;

public class Bishop extends Figure {

    public Bishop (Color color, byte i, byte j){
        super(color, i, j);
    }

    public boolean moveTo(byte i, byte j) {
        super.setI(i);
        super.setJ(j);
        return true;
    }

    public ArrayList<Way> possibleMovesList (ChessBoard board){
        ArrayList<Way> possibleMoves = new ArrayList<Way>();
        Position pos;
        Way w;


        //опишем вариаци хождения слона
        //#1
        pos = new Position (getPos_i(), getPos_j());
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
        pos = new Position (getPos_i(), getPos_j());
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
        pos = new Position (getPos_i(), getPos_j());
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
        pos = new Position (getPos_i(), getPos_j());
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
