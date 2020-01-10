package com.company;

public class Pawn extends Figure {

    public Pawn (Color color, byte i, byte j){
        super(color, i, j);
    }

    public boolean Move(byte i, byte j) {
        super.pos_i = i;
        super.pos_j = j;
        return true;
    }

    public boolean Move (ChessBoard board){
        if (board.moveCount == 1){

        }
        return true;
    }

    public void Print(){
        System.out.print((figureColor == Color.WHITE) ? "wPn  " : "bPn  ");
    }


}
