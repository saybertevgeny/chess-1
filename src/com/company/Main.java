package com.company;

import com.company.model.ChessBoard;
import com.company.model.Move;
import com.company.services.Checker;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ChessBoard b = new ChessBoard();
        b.print();

        for (int i = 0; i<b.getBoard()[6][1].possibleMovesList(6,1).size(); i++){
            b.getBoard()[6][1].possibleMovesList(6,1).get(i).print();
        }

        /*Checker c = new Checker();
        ArrayList<Move> m = new ArrayList<>();
        ArrayList<Move> mm = c.allowedMoves(b.getBoard()[6][1], b, 6,1,m);
        for (int i = 0; i< mm.size(); i++){
            mm.get(i).print();
            System.out.println();
        }*/

        Game g = new Game();
        g.startGame();

    }
}
