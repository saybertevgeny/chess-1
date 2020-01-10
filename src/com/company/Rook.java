package com.company;

public class Rook extends Figure {

    public Rook (Color color, Position position){
        super(color, position);
    }

    public boolean Move(Position position) {
        super.pos = position;
        return true;
    }
}
