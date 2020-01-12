package com.company;

import java.util.ArrayList;

public class Rook extends Figure {

    public Rook (Color color, byte i, byte j){
        super(color, i, j);
    }

    public boolean MoveTo(byte i, byte j) {
        super.pos_i = i;
        super.pos_j = j;
        return true;
    }

    public ArrayList<Way> MoveTo (ChessBoard board){
        ArrayList<Way> possibleMoves = new ArrayList<Way>();
        Position pos;
        Way w;


        //опишем вариаци хождения ладьи
        //#1
        pos = new Position (pos_i, pos_j);
        w = new Way();
        w.way.add(pos);
        while (true) {
            pos=pos.UpPosition(figureColor);
            if (pos.InBoard()) {
                w.way.add(pos);
                possibleMoves.add(w.clone());
            } else break;
        }

        //#2
        pos = new Position (pos_i, pos_j);
        w = new Way();
        w.way.add(pos);
        while (true) {
            pos=pos.DownPosition(figureColor);
            if (pos.InBoard()) {
                w.way.add(pos);
                possibleMoves.add(w.clone());
            } else break;
        }

        //#3
        pos = new Position (pos_i, pos_j);
        w = new Way();
        w.way.add(pos);
        while (true) {
            pos=pos.LeftPosition(figureColor);
            if (pos.InBoard()) {
                w.way.add(pos);
                possibleMoves.add(w.clone());
            } else break;
        }

        //#4
        pos = new Position (pos_i, pos_j);
        w = new Way();
        w.way.add(pos);
        while (true) {
            pos=pos.RightPosition(figureColor);
            if (pos.InBoard()) {
                w.way.add(pos);
                possibleMoves.add(w.clone());
            } else break;
        }

        return possibleMoves;
    }

    public void Print(){
        System.out.print((figureColor == Color.WHITE) ? "wRk  " : "bRk  ");
    }
}
