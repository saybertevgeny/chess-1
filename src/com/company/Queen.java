package com.company;

public class Queen extends Figure {

    public Queen (Color color, byte i, byte j){
        super(color, i, j);
    }

    public boolean Move(byte i, byte j) {
        super.pos_i = i;
        super.pos_j = j;
        return true;
    }

    public void Print(){
        System.out.print((figureColor == Color.WHITE) ? "wQ   " : "bQ   ");
    }
}