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

        

        Game g = new Game();
        g.startGame();

    }
}
