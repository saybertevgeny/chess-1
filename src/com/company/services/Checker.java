package com.company.services;

import com.company.model.ChessBoard;
import com.company.model.Figure;
import com.company.model.Move;
import com.company.model.Way;

import java.util.ArrayList;

public class Checker {
    //смотрим, нет ли на пути фигур того же цвета?
    private boolean isAllowedWay (Figure figure, Way way, ChessBoard board){
        boolean trigger = true;
        for (int i = 1; i<way.size(); i++){
            //идем с i=1, потому что 0 элемент сущности way(путь), отвечает за стартовую позицию фиигуры
            if ((board.getFigureByPosition(way.getPosition(i)) != null)
                    && (board.getFigureByPosition(way.getPosition(i)).getFigureColor() == figure.getFigureColor())) {
                trigger = false;
            }
        }
        return trigger;
    }

    //смотрим, нет ли на пути фигур другого цвета (не срубаем ли фигуру соперника по пути)?
    private boolean isKillingWay (Figure figure, Way way, ChessBoard board){
        boolean isKill = false;
        for (int i = 0; i<way.size(); i++){
            if ((board.getFigureByPosition(way.getPosition(i)) != null)
                    && (board.getFigureByPosition(way.getPosition(i)).getFigureColor() != figure.getFigureColor())) {
                isKill = true;
            }
        }
        //ПРОБЛЕМА!!! Что еслии на пути 2 фигуры подряд? как быть тогда?
        return isKill;
    }

    public ArrayList<Move> allowedMoves (Figure figure, ChessBoard board, int posI, int posJ){
        ArrayList<Way> pm = figure.possibleMovesList(posI, posJ);
        Move m;
        ArrayList<Move> result = new ArrayList<Move>();
        for (int count = 1; count < pm.size(); count++) {
            if (this.isAllowedWay(figure, pm.get(count), board)){
                m = new Move(pm.get(count), false, null);
                if (this.isKillingWay(figure, pm.get(count), board)){
                    m.setKill(true);
                    for (int i = 0; i<pm.get(count).size(); i++){
                        if ((board.getFigureByPosition(pm.get(count).getPosition(i)) != null)
                                && (board.getFigureByPosition(pm.get(count).getPosition(i)).getFigureColor() != figure.getFigureColor())) {
                           m.setFigureInRisk(board.getFigureByPosition(pm.get(count).getPosition(i)));
                        }
                    }
                }
                result.add(m.clone());
            }
        }
        return result;
    }
}
