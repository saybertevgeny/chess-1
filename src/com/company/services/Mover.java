package com.company.services;

import com.company.model.*;

public class Mover {
    public void moveFigureByWay (ChessBoard b, Move move){
        Way w = move.getWay();
        Position pos = w.getWay().get(0);
        //на стартовой позиции, где стояла ранее фигура, ставиим null
        b.setBoardPosition(pos.getI(), pos.getJ(), null);

        int max = w.getWay().size();

        if (move.getIsKill()){
            for (int i = 0; i < max; i++){
                pos = new Position(w.getWay().get(i).getI(),w.getWay().get(i).getJ());
                if (b.getFigureByPosition(pos) == move.getFigureInRisk()){
                    break;
                }
            }
        } else {
            pos = w.getWay().get(max-1);
        }

        b.setBoardPosition(pos.getI(), pos.getJ(), move.getFigure());
    }
}
