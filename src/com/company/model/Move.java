package com.company.model;

public class Move {
    private Figure figure;
    private Way way;
    private boolean isKill;
    private Figure figureInRisk;

    public void setFigure(Figure figure) {
        this.figure = figure;
    }

    public Figure getFigure() {
        return figure;
    }

    public void setWay(Way way) {
        this.way = way;
    }

    public void setKill(boolean kill) {
        isKill = kill;
    }

    public void setFigureInRisk(Figure figureInRisk) {
        this.figureInRisk = figureInRisk;
    }

    public Way getWay() {
        return way;
    }

    public Figure getFigureInRisk() {
        return figureInRisk;
    }

    public boolean getIsKill() {
        return isKill;
    }

    public Move(Figure figure, Way way, Boolean isKill, Figure figureInRisk){
        this.setFigure(figure);
        this.setWay(way);
        this.setFigureInRisk(figureInRisk);
        this.setKill(isKill);
    }

    public Move clone(){
        Move moveCloned = new Move(this.figure, this.way, this.isKill,this.figureInRisk);
        return moveCloned;
    }

    public void print(){
        Position from = this.getWay().getPosition(0);
        Position to = this.getWay().getEndPosition();
        this.getFigure().print();
        System.out.println(" (" + from.getI() + ";" + from.getJ() + ") -> ("
                + to.getI() + ";" + to.getJ() + ")");

    }
}
