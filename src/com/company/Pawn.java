package com.company;

import java.util.ArrayList;

public class Pawn extends Figure {

    public Pawn (Color color, byte i, byte j){
        super(color, i, j);
    }

    public boolean MoveTo(byte i, byte j) {
        super.pos_i = i;
        super.pos_j = j;
        return true;
    }

    public ArrayList<Way> MoveTo (ChessBoard board){
        ArrayList<Way> possibleMoves = new ArrayList<Way>();
        Position pos = new Position (pos_i, pos_j);
        Way w = new Way();
        w.way.add(pos);

        //если первый ход, пешка может идти на 2 клетки вперед
        if (board.moveCount == 1){
            pos.UpPosition(figureColor);
            w.way.add(pos);
            pos.UpPosition(figureColor);
            w.way.add(pos);
            if (pos.InBoard()){
                possibleMoves.add(w);
            }
        } else {
            pos.UpPosition(figureColor);
            if (pos.InBoard()){
                possibleMoves.add(w);
            }
        }
        return possibleMoves;
    }

    public void Print(){
        System.out.print((figureColor == Color.WHITE) ? "wPn  " : "bPn  ");
    }


}
