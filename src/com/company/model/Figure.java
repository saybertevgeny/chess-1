package com.company.model;

import java.util.ArrayList;

public abstract class Figure {
    private final Color figureColor;

    public Color getFigureColor() {
        return figureColor;
    }

    public Figure (Color color, int i, int j) {
        figureColor = color;
    }

    public abstract void print();

    public abstract ArrayList<Way> possibleMovesList (int posI, int posJ);
}