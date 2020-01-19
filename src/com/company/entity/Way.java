package com.company.entity;

import java.util.ArrayList;

public class Way{
    private ArrayList<Position> way = new ArrayList<Position>();

    public ArrayList<Position> getWay() {
        return way;
    }

    /*public void setWay(ArrayList<Position> way) {
        this.way = way;
    }*/

    //вместо setWay
    public void add (Position position){
        this.way.add(position);
    }

    public void print(){
        System.out.print("Путь:");
        for (int c = 0; c<way.size(); c++){
            System.out.print("(" + way.get(c).getI() + ";" + way.get(c).getJ() + ")");
        }
        System.out.println();
    }

    public Way clone(){
            Way wayCloned = new Way();
            wayCloned.way = (ArrayList<Position>) this.way.clone();
            return wayCloned;

    }

    //public boolean IsKill (ChessBoard board)
}
