package com.company;

import com.company.model.*;
import com.company.model.figures.King;
import com.company.services.Checker;
import com.company.services.Gamer;
import com.company.services.Mover;

import java.util.ArrayList;

public class Game {
    Gamer g = new Gamer();
    Checker c;
    Mover mover;

    public void startGame(){
        while (true){
            g.increaseMoveCount();
            Position position;
            for (int row = 0; row < 8; row++){
                for (int col = 0; col < 8; col++){
                    position = new Position(row, col);
                    Figure f = g.getBoard().getFigureByPosition(position);
                    //если на клетке есть фигура и она принадлежт текущему игроку
                    if ((f!= null) && (f.getFigureColor() == g.getPlayer())){
                        ArrayList<Way> pm = f.possibleMovesList(row, col);
                        ArrayList<Move> am = c.allowedMoves(f,g.getBoard(),row,col);
                        Move m = c.randomMove(am);
                        if ((m.getFigureInRisk() instanceof King) || (g.getMoveCount() == 1000)){
                            System.out.println("Ход " && g.getMoveCount());
                            mover.moveFigureByWay(g.getBoard(),m,f);
                            break;
                        } else {
                            mover.moveFigureByWay(g.getBoard(),m,f);
                        }
                    }
                }
            }
        }
    }

}
