package com.company;

public class Pawn extends Figure {

    public Pawn (Color color, byte i, byte j){
        super(color, i, j);
    }

    @Override
    public boolean Move(byte i, byte j) {
        return true;
    }
}
