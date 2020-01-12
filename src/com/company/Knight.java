package com.company;

import java.util.ArrayList;

public class Knight extends Figure {

    public Knight (Color color, byte i, byte j){
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


        //опишем вариаци хождения коня
        //#1
        pos = new Position (pos_i, pos_j);
        w = new Way();
        w.way.add(pos);
        w.way.add(pos=pos.UpPosition(figureColor));
        w.way.add(pos=pos.UpPosition(figureColor));
        w.way.add(pos=pos.UpPosition(figureColor));
        w.way.add(pos=pos.LeftPosition(figureColor));
        if (pos.InBoard()){
            possibleMoves.add(w);
        }

        //#2
        pos = new Position (pos_i, pos_j);
        w = new Way();
        w.way.add(pos);
        w.way.add(pos=pos.UpPosition(figureColor));
        w.way.add(pos=pos.UpPosition(figureColor));
        w.way.add(pos=pos.UpPosition(figureColor));
        w.way.add(pos=pos.RightPosition(figureColor));
        if (pos.InBoard()){
            possibleMoves.add(w);
        }

        //#3
        pos = new Position (pos_i, pos_j);
        w = new Way();
        w.way.add(pos);
        w.way.add(pos=pos.RightPosition(figureColor));
        w.way.add(pos=pos.RightPosition(figureColor));
        w.way.add(pos=pos.RightPosition(figureColor));
        w.way.add(pos=pos.UpPosition(figureColor));
        if (pos.InBoard()){
            possibleMoves.add(w);
        }

        //#4
        pos = new Position (pos_i, pos_j);
        w = new Way();
        w.way.add(pos);
        w.way.add(pos=pos.RightPosition(figureColor));
        w.way.add(pos=pos.RightPosition(figureColor));
        w.way.add(pos=pos.RightPosition(figureColor));
        w.way.add(pos=pos.DownPosition(figureColor));
        if (pos.InBoard()){
            possibleMoves.add(w);
        }

        //#5
        pos = new Position (pos_i, pos_j);
        w = new Way();
        w.way.add(pos);
        w.way.add(pos=pos.LeftPosition(figureColor));
        w.way.add(pos=pos.LeftPosition(figureColor));
        w.way.add(pos=pos.LeftPosition(figureColor));
        w.way.add(pos=pos.UpPosition(figureColor));
        if (pos.InBoard()){
            possibleMoves.add(w);
        }

        //#6
        pos = new Position (pos_i, pos_j);
        w = new Way();
        w.way.add(pos);
        w.way.add(pos=pos.LeftPosition(figureColor));
        w.way.add(pos=pos.LeftPosition(figureColor));
        w.way.add(pos=pos.LeftPosition(figureColor));
        w.way.add(pos=pos.DownPosition(figureColor));
        if (pos.InBoard()){
            possibleMoves.add(w);
        }

        //#7
        pos = new Position (pos_i, pos_j);
        w = new Way();
        w.way.add(pos);
        w.way.add(pos=pos.DownPosition(figureColor));
        w.way.add(pos=pos.DownPosition(figureColor));
        w.way.add(pos=pos.DownPosition(figureColor));
        w.way.add(pos=pos.LeftPosition(figureColor));
        if (pos.InBoard()){
            possibleMoves.add(w);
        }

        //#8
        pos = new Position (pos_i, pos_j);
        w = new Way();
        w.way.add(pos);
        w.way.add(pos=pos.DownPosition(figureColor));
        w.way.add(pos=pos.DownPosition(figureColor));
        w.way.add(pos=pos.DownPosition(figureColor));
        w.way.add(pos=pos.RightPosition(figureColor));
        if (pos.InBoard()){
            possibleMoves.add(w);
        }

        return possibleMoves;
    }

    public void Print(){
        System.out.print((figureColor == Color.WHITE) ? "wKn  " : "bKn  ");
    }
}