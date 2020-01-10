package com.company;

public class Bishop extends Figure {

    public Bishop (Color color, byte i, byte j){
        super(color, i, j);
    }

    public boolean Move(byte i, byte j) {
        super.pos_i = i;
        super.pos_j = j;
        return true;
    }
}
