package com.company;

public class Bishop extends Figure {

    public Bishop (Color color, Position position){
        super(color, position);
    }

    public boolean Move(Position position) {
        super.pos = position;
        return true;
    }
}
