package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ChessBoard b = new ChessBoard();
        b.Print();

        for (int i = 0; i<b.board[7][3].MoveTo(b).size(); i++){
            b.board[7][3].MoveTo(b).get(i).Print();
        }
    }
}
