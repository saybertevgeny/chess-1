package com.company;

import java.util.ArrayList;

public class Queen extends Figure {

    public Queen (Color color, byte i, byte j){
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


        //опишем вариаци хождения королевы
        //#1
        pos = new Position (pos_i, pos_j);
        w = new Way();
        w.way.add(pos);
        while (true) {
            pos=pos.DiagonLeftUpPosition(figureColor);
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
            pos=pos.DiagonRightUpPosition(figureColor);
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
            pos=pos.DiagonLeftDownPosition(figureColor);
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
            pos=pos.DiagonRightDownPosition(figureColor);
            if (pos.InBoard()) {
                w.way.add(pos);
                possibleMoves.add(w.clone());
            } else break;
        }

        //#5
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

        //#6
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

        //#7
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

        //#8
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
        System.out.print((figureColor == Color.WHITE) ? "wQ   " : "bQ   ");
    }
}