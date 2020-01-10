package com.company;

public class Knight extends Figure {

    public Knight (Color color, Position position){
        super(color, position);
    }

    public boolean Move(Position position) {
        super.pos = position;
        return true;
    }
}
