package com.company;

import com.company.model.ChessBoard;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ChessBoard b = new ChessBoard();
        b.print();

        for (int i = 0; i<b.getBoard()[7][3].possibleMovesList((byte) 7,(byte) 3).size(); i++){
            b.getBoard()[7][3].possibleMovesList((byte) 7,(byte) 3).get(i).print();
        }
    }
}
