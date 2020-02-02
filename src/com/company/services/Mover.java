package com.company.services;

import com.company.model.*;

public class Mover {
    public void moveFigureByWay (ChessBoard b, Move move, Figure figure){
        Way w = move.getMoving();
        Position pos = w.getWay().get(0);
        //на стартовой позиции, где стояла ранее фигура, ставиим null
        b.setBoardPosition(pos.getI(), pos.getJ(), null);

        int max = w.getWay().size();

        if (move.getIsKill()){
            for (int i = 0; i < max; i++){
                pos = w.getWay().get(i);
                if (b.getFigureByPosition(pos) == move.getFigureInRisk()){
                    break;
                }
            }
        } else {
            pos = w.getWay().get(max);
        }

        b.setBoardPosition(pos.getI(), pos.getJ(), figure);
    }
}
