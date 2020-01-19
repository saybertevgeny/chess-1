package com.company.services;

import com.company.model.*;

import java.util.ArrayList;

public class Gamer {
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
