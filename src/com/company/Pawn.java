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

    public Position Move (ChessBoard board){
        Position go = new Position (this.pos_i, this.pos_j);

        if (board.moveCount == 1){

        }
        return go;
    }


}
