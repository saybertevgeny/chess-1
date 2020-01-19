package com.company;

import com.company.entity.ChessBoard;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ChessBoard b = new ChessBoard();
        b.print();

        for (int i = 0; i<b.getBoard()[7][3].possibleMovesList(b).size(); i++){
            b.getBoard()[7][3].possibleMovesList(b).get(i).print();
        }
    }
}
