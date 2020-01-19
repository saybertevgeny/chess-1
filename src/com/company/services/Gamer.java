package com.company.services;

import com.company.model.ChessBoard;
import com.company.model.Figure;
import com.company.model.Position;
import com.company.model.Way;

import java.util.ArrayList;

public class Gamer {
    ChessBoard board = new ChessBoard();
    public void startGame(){
        while (true){
            Position position;
            for (int row = 0; row < 8; row++){
                for (int col = 0; col < 8; col++){
                    position = new Position((byte)row,(byte) col);
                    Figure f = board.getFigureByPosition(position);
                    //если на клетке есть фигура
                    if (f!= null) {
                            // и фигура пренадлежит текущему игроку
                            //&& (f.getFigureColor() == board.getPlayer()))

                        ArrayList<Way> pm = f.possibleMovesList((byte) row, (byte) col);
                        for (int count = 1; count < pm.size(); count++) {

                        }
                    }
                }
            }
        }
    }

}
