package com.company.model.figures;

import com.company.model.*;

import java.util.ArrayList;

public class Knight extends Figure {

    public Knight (Color color, int i, int j){
        super(color, i, j);
    }

    public boolean moveTo(int i, int j) {
        return true;
    }

    public ArrayList<Way> possibleMovesList (int posI, int posJ){
        ArrayList<Way> possibleMoves = new ArrayList<Way>();
        Position pos;
        Way w;


        //опишем вариаци хождения коня
        //#1
        pos = new Position (posI, posJ);
        w = new Way();
        w.add(pos);
        w.add(pos=pos.upPosition(getFigureColor()));
        w.add(pos=pos.upPosition(getFigureColor()));
        w.add(pos=pos.upPosition(getFigureColor()));
        w.add(pos=pos.leftPosition(getFigureColor()));
        if (pos.inBoard()){
            possibleMoves.add(w);
        }

        //#2
        pos = new Position (posI, posJ);
        w = new Way();
        w.add(pos);
        w.add(pos=pos.upPosition(getFigureColor()));
        w.add(pos=pos.upPosition(getFigureColor()));
        w.add(pos=pos.upPosition(getFigureColor()));
        w.add(pos=pos.rightPosition(getFigureColor()));
        if (pos.inBoard()){
            possibleMoves.add(w);
        }

        //#3
        pos = new Position (posI, posJ);
        w = new Way();
        w.add(pos);
        w.add(pos=pos.rightPosition(getFigureColor()));
        w.add(pos=pos.rightPosition(getFigureColor()));
        w.add(pos=pos.rightPosition(getFigureColor()));
        w.add(pos=pos.upPosition(getFigureColor()));
        if (pos.inBoard()){
            possibleMoves.add(w);
        }

        //#4
        pos = new Position (posI, posJ);
        w = new Way();
        w.add(pos);
        w.add(pos=pos.rightPosition(getFigureColor()));
        w.add(pos=pos.rightPosition(getFigureColor()));
        w.add(pos=pos.rightPosition(getFigureColor()));
        w.add(pos=pos.downPosition(getFigureColor()));
        if (pos.inBoard()){
            possibleMoves.add(w);
        }

        //#5
        pos = new Position (posI, posJ);
        w = new Way();
        w.add(pos);
        w.add(pos=pos.leftPosition(getFigureColor()));
        w.add(pos=pos.leftPosition(getFigureColor()));
        w.add(pos=pos.leftPosition(getFigureColor()));
        w.add(pos=pos.upPosition(getFigureColor()));
        if (pos.inBoard()){
            possibleMoves.add(w);
        }

        //#6
        pos = new Position (posI, posJ);
        w = new Way();
        w.add(pos);
        w.add(pos=pos.leftPosition(getFigureColor()));
        w.add(pos=pos.leftPosition(getFigureColor()));
        w.add(pos=pos.leftPosition(getFigureColor()));
        w.add(pos=pos.downPosition(getFigureColor()));
        if (pos.inBoard()){
            possibleMoves.add(w);
        }

        //#7
        pos = new Position (posI, posJ);
        w = new Way();
        w.add(pos);
        w.add(pos=pos.downPosition(getFigureColor()));
        w.add(pos=pos.downPosition(getFigureColor()));
        w.add(pos=pos.downPosition(getFigureColor()));
        w.add(pos=pos.leftPosition(getFigureColor()));
        if (pos.inBoard()){
            possibleMoves.add(w);
        }

        //#8
        pos = new Position (posI, posJ);
        w = new Way();
        w.add(pos);
        w.add(pos=pos.downPosition(getFigureColor()));
        w.add(pos=pos.downPosition(getFigureColor()));
        w.add(pos=pos.downPosition(getFigureColor()));
        w.add(pos=pos.rightPosition(getFigureColor()));
        if (pos.inBoard()){
            possibleMoves.add(w);
        }

        return possibleMoves;
    }

    public void print(){
        System.out.print((getFigureColor() == Color.WHITE) ? "wKn  " : "bKn  ");
    }
}