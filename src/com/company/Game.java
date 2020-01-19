package com.company;

import com.company.model.ChessBoard;
import com.company.model.Color;

public class Game {
    private ChessBoard board;
    private Color player;
    private int moveCount;

    //вместо setPlayer
    public void changePlayer() {
        if (this.player == Color.WHITE){
            this.player = Color.BLACK;
        } else {
            this.player = Color.WHITE;
        };
    }

    public Color getPlayer() {
        return player;
    }

    //вместо setMoveCount
    public void increaseMoveCount (){
        this.moveCount++;
    }

    public int getMoveCount() {
        return moveCount;
    }

}
