package com.company;

public class Pawn extends Figure {

    public Pawn (Color color, Position position){
        super(color, position);
    }

    @Override
    public boolean Move(Position position) {
        super.pos = position;
        //board[i][j] = Pawn;
        return true;
    }
}
