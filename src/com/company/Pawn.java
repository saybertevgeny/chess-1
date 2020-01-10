package com.company;

public class Pawn extends Figure {

    public Pawn (Color color, Position position){
        super(color, position);
    }

    @Override
    public boolean Move(Position position) {
        super.pos = position;
        return true;
    }

    public Position Move (ChessBoard board){
        Position go = this.pos;

        if (board.moveCount == 1){

        }
        return go;
    }


}
