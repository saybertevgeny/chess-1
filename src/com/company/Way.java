package com.company;

import java.util.ArrayList;

public class Way{
    ArrayList<Position> way = new ArrayList<Position>();

    public void Print(){
        System.out.print("Путь:");
        for (int c = 0; c<way.size(); c++){
            System.out.print("(" + way.get(c).i + ";" + way.get(c).j + ")");
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
