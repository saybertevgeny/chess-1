package com.company.figures;

import com.company.entity.*;

import java.util.ArrayList;

public class Pawn extends Figure {

    public Pawn (Color color, byte i, byte j){
        super(color, i, j);
    }

    public boolean moveTo(byte i, byte j) {
        super.setI(i);
        super.setJ(j);
        return true;
    }

    public ArrayList<Way> possibleMovesList (ChessBoard board){
        ArrayList<Way> possibleMoves = new ArrayList<Way>();
        Position pos = new Position (getPos_i(), getPos_j());
        Way w = new Way();
        w.add(pos);

        //если первый ход, пешка может идти на 2 клетки вперед
        if (board.getMoveCount() == 1){
            pos.upPosition(getFigureColor());
            w.add(pos);
            pos.upPosition(getFigureColor());
            w.add(pos);
            if (pos.inBoard()){
                possibleMoves.add(w.clone());
            }
        } else {
            pos.upPosition(getFigureColor());
            if (pos.inBoard()){
                possibleMoves.add(w.clone());
            }
        }
        return possibleMoves;
    }

    public void print(){
        System.out.print((getFigureColor() == Color.WHITE) ? "wPn  " : "bPn  ");
    }


}
