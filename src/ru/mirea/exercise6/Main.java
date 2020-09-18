package ru.mirea.exercise6;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(new Point(3,4),new Point(5,6));
        System.out.println(rectangle);

        RectangleMovable rectangleMovable = new RectangleMovable(new Point(3,4),new Point(5,6));
        rectangleMovable.move(1,3,1,3);
        rectangleMovable.move(1,3,1,4);

        System.out.println(rectangleMovable);
    }
}
