package com.company;

public class King extends Figure {

    public King (Color color, Position position){
        super(color, position);
    }

    public boolean Move(Position position) {
        super.pos = position;
        return true;
    }
}
