package com.company;

public class Position {
    public byte i;
    public byte j;

    Position(byte i_pos, byte j_pos){
        i = i_pos;
        j = j_pos;
    }

    public boolean InBoard(){
        return ((i>=0)&(i<8)&(j>=0)&(j<8));
    }

    public Position UpPosition(Color color){
        Position pos = new Position(i,j);
        //фигуры должны ходить навстречу друг другу, в зависимости от цвета определим смещение по i
        int sign = (color==Color.WHITE) ? 1 :(-1);
        pos.i+=1*sign;
        return pos;
    }

    public Position DownPosition(Color color){
        Position pos = new Position(i,j);
        //фигуры должны ходить навстречу друг другу, в зависимости от цвета определим смещение по i
        int sign = (color==Color.WHITE) ? 1 :(-1);
        pos.i-=1*sign;
        return pos;
    }

    public Position LeftPosition(Color color){
        Position pos = new Position(i,j);
        //фигуры должны ходить зеркально друг другу, в зависимости от цвета определим смещение по j
        int sign = (color==Color.WHITE) ? 1 :(-1);
        pos.j-=1*sign;
        return pos;
    }

    public Position RightPosition(Color color){
        Position pos = new Position(i,j);
        //фигуры должны ходить зеркально друг другу, в зависимости от цвета определим смещение по j
        int sign = (color==Color.WHITE) ? 1 :(-1);
        pos.j+=1*sign;
        return pos;
    }

    public Position DiagonLeftUpPosition(Color color){
        Position pos = new Position(i,j);
        //фигуры должны ходить зеркально друг другу, в зависимости от цвета определим смещение по i и j
        int sign = (color==Color.WHITE) ? 1 :(-1);
        pos.i+=1*sign;
        pos.j+=1*sign;
        return pos;
    }

    public Position DiagonRightUpPosition(Color color){
        Position pos = new Position(i,j);
        //фигуры должны ходить зеркально друг другу, в зависимости от цвета определим смещение по i и j
        int sign = (color==Color.WHITE) ? 1 :(-1);
        pos.i-=1*sign;
        pos.j-=1*sign;
        return pos;
    }

    public Position DiagonLeftDownPosition(Color color){
        Position pos = new Position(i,j);
        //фигуры должны ходить зеркально друг другу, в зависимости от цвета определим смещение по i и j
        int sign = (color==Color.WHITE) ? 1 :(-1);
        pos.i-=1*sign;
        pos.j+=1*sign;
        return pos;
    }

    public Position DiagonRightDownPosition(Color color){
        Position pos = new Position(i,j);
        //фигуры должны ходить зеркально друг другу, в зависимости от цвета определим смещение по i и j
        int sign = (color==Color.WHITE) ? 1 :(-1);
        pos.i+=1*sign;
        pos.j-=1*sign;
        return pos;
    }
}
