package com.company;

public class Queen extends Figure {

    public Queen (Color color, Position position){
        super(color, position);
    }

    public boolean Move(Position position) {
        super.pos = position;
        return true;
    }
}
