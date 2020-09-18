package ru.mirea.exercise6;

public class Rectangle {
    private Point coordinate1, coordinate2;

    public Rectangle(Point coordinate1, Point coordinate2) {
        this.coordinate1 = coordinate1;
        this.coordinate2 = coordinate2;
    }


    public Point getCoordinate1() {
        return coordinate1;
    }

    public Point getCoordinate2() {
        return coordinate2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "coordinate 1 = " + coordinate1 +
                ", coordinate 2 = " + coordinate2 +
                '}';
    }
}
