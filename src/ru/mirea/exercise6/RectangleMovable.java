package ru.mirea.exercise6;

public class RectangleMovable extends Rectangle implements Movable{


    public RectangleMovable(Point coordinate1, Point coordinate2) {
        super(coordinate1, coordinate2);
    }

    @Override
    public void move(int x1, int y1, int x2, int y2) {
        if(x1 == x2 && y1 == y2) {
            getCoordinate1().setX(getCoordinate1().getX()+x1);
            getCoordinate1().setY(getCoordinate1().getY()+y1);
            getCoordinate2().setX(getCoordinate2().getX()+x2);
            getCoordinate2().setY(getCoordinate2().getY()+y2);
        }
        else
            System.out.println("Некорректные координаты передвижения");
    }
}


