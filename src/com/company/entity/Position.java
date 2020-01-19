package com.company.entity;

public class Position {
    private byte i;
    private byte j;

    public Position(byte i_pos, byte j_pos){
        i = i_pos;
        j = j_pos;
    }

    public byte getI() {
        return i;
    }

    public byte getJ() {
        return j;
    }

    public void setI(byte i) {
        this.i = i;
    }

    public void setJ(byte j) {
        this.j = j;
    }

    public boolean inBoard(){
        return ((i>=0)&&(i<8)&&(j>=0)&&(j<8));
    }

    public Position upPosition(Color color){
        Position pos = new Position(i,j);
        //фигуры должны ходить навстречу друг другу, в зависимости от цвета определим смещение по i
        int sign = (color==Color.WHITE) ? 1 :(-1);
        pos.i+=1*sign;
        return pos;
    }

    public Position downPosition(Color color){
        Position pos = new Position(i,j);
        //фигуры должны ходить навстречу друг другу, в зависимости от цвета определим смещение по i
        int sign = (color==Color.WHITE) ? 1 :(-1);
        pos.i-=1*sign;
        return pos;
    }

    public Position leftPosition(Color color){
        Position pos = new Position(i,j);
        //фигуры должны ходить зеркально друг другу, в зависимости от цвета определим смещение по j
        int sign = (color==Color.WHITE) ? 1 :(-1);
        pos.j-=1*sign;
        return pos;
    }

    public Position rightPosition(Color color){
        Position pos = new Position(i,j);
        //фигуры должны ходить зеркально друг другу, в зависимости от цвета определим смещение по j
        int sign = (color==Color.WHITE) ? 1 :(-1);
        pos.j+=1*sign;
        return pos;
    }

    public Position diagonLeftUpPosition(Color color){
        Position pos = new Position(i,j);
        //фигуры должны ходить зеркально друг другу, в зависимости от цвета определим смещение по i и j
        int sign = (color==Color.WHITE) ? 1 :(-1);
        pos.i+=1*sign;
        pos.j+=1*sign;
        return pos;
    }

    public Position diagonRightUpPosition(Color color){
        Position pos = new Position(i,j);
        //фигуры должны ходить зеркально друг другу, в зависимости от цвета определим смещение по i и j
        int sign = (color==Color.WHITE) ? 1 :(-1);
        pos.i-=1*sign;
        pos.j-=1*sign;
        return pos;
    }

    public Position diagonLeftDownPosition(Color color){
        Position pos = new Position(i,j);
        //фигуры должны ходить зеркально друг другу, в зависимости от цвета определим смещение по i и j
        int sign = (color==Color.WHITE) ? 1 :(-1);
        pos.i-=1*sign;
        pos.j+=1*sign;
        return pos;
    }

    public Position diagonRightDownPosition(Color color){
        Position pos = new Position(i,j);
        //фигуры должны ходить зеркально друг другу, в зависимости от цвета определим смещение по i и j
        int sign = (color==Color.WHITE) ? 1 :(-1);
        pos.i+=1*sign;
        pos.j-=1*sign;
        return pos;
    }
}
