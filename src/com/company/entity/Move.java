package com.company.entity;

public class Move {
    private Figure MoveableFigure;
    private Way Moving;
    private boolean IsKill;
    private Figure FigureInRisk;

    public void setMoveableFigure(Figure moveableFigure) {
        MoveableFigure = moveableFigure;
    }

    public void setMoving(Way moving) {
        Moving = moving;
    }

    public void setKill(boolean kill) {
        IsKill = kill;
    }

    public void setFigureInRisk(Figure figureInRisk) {
        FigureInRisk = figureInRisk;
    }
}
