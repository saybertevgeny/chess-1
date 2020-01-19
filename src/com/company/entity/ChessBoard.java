package com.company.entity;

import com.company.figures.*;

import java.util.ArrayList;

public class ChessBoard {
    private Figure[][] board = new Figure[8][8];
    private int moveCount;
    private Color player;

    public Color getPlayer() {
        return player;
    }

    public Figure[][] getBoard() {
        return board;
    }

    public int getMoveCount() {
        return moveCount;
    }

    //вместо setPlayer
    public void changePlayer() {
        if (this.player == Color.WHITE){
            this.player = Color.BLACK;
        } else {
            this.player = Color.WHITE;
        };
    }

    //вместо setBoard
    public void setBoardPosition(byte i, byte j, Figure figure) {
        this.board[i][j] = figure;
    }

    //вместо setMoveCount
    public void increaseMoveCount (){
        this.moveCount++;
    }

    public ChessBoard () {
        //стартовая расстановка

        //Белые:
        Color standPlayer = Color.WHITE;

        //ставим пешкии
        for (int i = 0; i < 8; i++){
            board[6][i] = new Pawn(standPlayer,(byte) 6, (byte) i);
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
        board[0][3] = new Queen(standPlayer,(byte) 0, (byte) 4);

        //ставиим короля
        board[0][4] = new King(standPlayer,(byte) 7, (byte) 3);


        //белые ходят первыми
        player = Color.WHITE;
        //пока ни одного хода не сделано
        moveCount = 0;
    }

    public void print(){
        for (int i=0; i<8; i++){
            for (int j=0; j<8; j++) {
                if (board[i][j] == null) {
                    System.out.print("null ");
                } else board[i][j].print();
            }
            System.out.println("");
        }
    }

    public Figure getFigureByPosition (Position position){
        return this.board[position.getI()][position.getJ()];
    }

    /*private ArrayList<Move> allowMovesList (ChessBoard board){

    }*/

}
