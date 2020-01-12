package com.company;

import java.util.ArrayList;

public class King extends Figure {

    public King (Color color, byte i, byte j){
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

        //опишем вариаци хождения короля
        //#1
        pos = new Position (pos_i, pos_j);
        w = new Way();
        w.way.add(pos);
        pos=pos.RightPosition(figureColor);        ;
        if (pos.InBoard()){
            w.way.add(pos);
            possibleMoves.add(w.clone());
        }

        //#2
        pos = new Position (pos_i, pos_j);
        w = new Way();
        w.way.add(pos);
        pos=pos.LeftPosition(figureColor);
        if (pos.InBoard()){
            w.way.add(pos);
            possibleMoves.add(w.clone());
        }

        //#3
        pos = new Position (pos_i, pos_j);
        w = new Way();
        w.way.add(pos);
        pos=pos.UpPosition(figureColor);
        if (pos.InBoard()){
            w.way.add(pos);
            possibleMoves.add(w.clone());
        }

        //#4
        pos = new Position (pos_i, pos_j);
        w = new Way();
        w.way.add(pos);
        pos=pos.DownPosition(figureColor);
        if (pos.InBoard()){
            w.way.add(pos);
            possibleMoves.add(w.clone());
        }

        //#5
        pos = new Position (pos_i, pos_j);
        w = new Way();
        w.way.add(pos);
        pos=pos.DiagonRightUpPosition(figureColor);
        if (pos.InBoard()){
            w.way.add(pos);
            possibleMoves.add(w.clone());
        }

        //#6
        pos = new Position (pos_i, pos_j);
        w = new Way();
        w.way.add(pos);
        pos=pos.DiagonLeftUpPosition(figureColor);
        if (pos.InBoard()){
            w.way.add(pos);
            possibleMoves.add(w.clone());
        }

        //#7
        pos = new Position (pos_i, pos_j);
        w = new Way();
        w.way.add(pos);
        pos=pos.DiagonRightDownPosition(figureColor);
        if (pos.InBoard()){
            w.way.add(pos);
            possibleMoves.add(w.clone());
        }

        //#8
        pos = new Position (pos_i, pos_j);
        w = new Way();
        w.way.add(pos);
        pos=pos.DiagonLeftDownPosition(figureColor);
        if (pos.InBoard()){
            w.way.add(pos);
            possibleMoves.add(w.clone());
        }

        return possibleMoves;
    }

    public void Print(){
        System.out.print((figureColor == Color.WHITE) ? "wK   " : "bK   ");
    }

}