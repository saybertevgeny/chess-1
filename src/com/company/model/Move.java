package com.company.model;

public class Move {
    private Way Moving;
    private boolean IsKill;
    private Figure FigureInRisk;

    public void setMoving(Way moving) {
        Moving = moving;
    }

    public void setKill(boolean kill) {
        IsKill = kill;
    }

    public void setFigureInRisk(Figure figureInRisk) {
        FigureInRisk = figureInRisk;
    }

    public Way getMoving() {
        return Moving;
    }

    public Figure getFigureInRisk() {
        return FigureInRisk;
    }

    public boolean getIsKill() {
        return IsKill;
    }

    public Move(Way Moving, Boolean isKill, Figure figureInRisk){
        this.setMoving(Moving);
        this.setFigureInRisk(figureInRisk);
        this.setKill(isKill);
    }

    public Move clone(){
        Move moveCloned = new Move(this.Moving, this.IsKill,this.FigureInRisk);
        return moveCloned;
    }

    public void print(){
        System.out.print("Доустимый путь: ");
        this.getMoving().print();
        System.out.print(getIsKill() ? "Угроза есть" : "Угрозы нет");
    }
}
