package xxx;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        Square square = new Square(2);
        Circle circle = new Circle(2);
        Triangle triangle = new Triangle(2,3,3);
        Trapezoid trapezoid = new Trapezoid(2,3,3,3,4);

        int rand = 1 + (int)(Math.random() * 4);
        Object [] obj = new Object[rand];
        for (int i = 0; i<obj.length; i++) {
            int ran = 1 + (int)(Math.random() * 4);
            if (ran == 1)
            obj[i] = square;
            if (ran == 2)
                obj[i] = circle;
            if (ran == 3)
                obj[i] = triangle;
            if (ran == 4)
                obj[i] = new Square(2);
        }
        for (int i = 0; i<obj.length; i++) {
            if (obj[i] == square){
                System.out.println("Фигура: " + square.draw() + "," + " площадь: " + square.getArea()
                + " кв. ед." + "," + " длина стороны: " + square.sideLength() + " ед." + "," + " цвет:"
                + square.getColor());
            }
            if (obj[i] == circle) {
                System.out.println("Фигура: " + circle.draw() + "," + " площадь: " + circle.getArea()
                        + " кв. ед." + "," + " диаметр круга: " + circle.diameter() + " ед." + "," + " цвет:"
                        + circle.getColor());
            }
            if (obj[i] == triangle ) {
                System.out.println("Фигура: " + triangle.draw() + "," + " площадь: " + triangle.getArea()
                        + " кв. ед." + "," + " длина гипотенузы: " + triangle.hypotenuse() + " ед." + "," + " цвет:"
                        + triangle.getColor());
            }
            if (obj[i] == triangle ) {
                System.out.println("Фигура: " + trapezoid.draw() + "," + " площадь: " + trapezoid.getArea()
                        + " кв. ед." + "," + " средняя длина: " + trapezoid.midleLine() + " ед." + "," + " цвет:"
                        + trapezoid.getColor());
            }

        }
    }
}
