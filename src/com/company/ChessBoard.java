package com.company;

public class ChessBoard {
    public Figure[][] board = new Figure[8][8];
    public int moveCount;
    public Color player;

    public ChessBoard () {
        //стартовая расстановка

        //Белые:
        Color standPlayer = Color.WHITE;

        //ставим пешкии
        for (int i = 0; i < 8; i++){
            board[6][i] = new Pawn (standPlayer,(byte) 6, (byte) i);
        }

        //ставим турки
        board[7][0] = new Rook(standPlayer,(byte) 7, (byte) 0);
        board[7][7] = new Rook(standPlayer,(byte) 7, (byte) 7);

        //ставим коней
        board[7][1] = new Knight(standPlayer,(byte) 7, (byte) 1);
        board[7][6] = new Knight(standPlayer,(byte) 7, (byte) 6);

        //ставим ферзей
        board[7][2] = new Bishop(standPlayer,(byte) 7, (byte) 2);
        board[7][5] = new Bishop(standPlayer,(byte) 7, (byte) 5);

        //ставим королеву
        board[7][3] = new Queen(standPlayer,(byte) 7, (byte) 3);

        //ставиим короля
        board[7][4] = new King(standPlayer,(byte) 7, (byte) 4);


        //Черные:
        standPlayer = Color.BLACK;

        //ставим пешкии
        for (int i = 0; i < 8; i++){
            board[1][i] = new Pawn (standPlayer,(byte) 6, (byte) i);
        }

        //ставим турки
        board[0][0] = new Rook(standPlayer,(byte) 0, (byte) 0);
        board[0][7] = new Rook(standPlayer,(byte) 0, (byte) 7);

        //ставим коней
        board[0][1] = new Knight(standPlayer,(byte) 0, (byte) 1);
        board[0][6] = new Knight(standPlayer,(byte) 0, (byte) 6);

        //ставим ферзей
        board[0][2] = new Bishop(standPlayer,(byte) 0, (byte) 2);
        board[0][5] = new Bishop(standPlayer,(byte) 0, (byte) 5);

        //ставим королеву
        board[0][3] = new Queen(standPlayer,(byte) 0, (byte) 3);

        //ставиим короля
        board[0][4] = new King(standPlayer,(byte) 7, (byte) 4);

        player = Color.WHITE;
        moveCount = 0;
    }

}
