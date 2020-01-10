package com.company;

public class ChessBoard {
    public Figure[][] board = new Figure[8][8];
    public int moveCount;
    public Color player;

    public ChessBoard () {
        //стартовая расстановка
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                board[i][j]=null;
            }
        }
        player = Color.WHITE;
        moveCount = 0;
    }

}
