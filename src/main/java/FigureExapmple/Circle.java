package FigureExapmple;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public String draw() {
        return "Фигура: " + " круг" + "," + " площадь: " + getArea()
                + " кв. ед." + "," + " диаметр круга: " + diameter() + " ед." + "," + " цвет: "
                + Color.WHITE.getColor() + ".";
    }

    public double getArea() {
        return Math.round(Math.PI * radius * radius);
    }

    public double diameter() {
        return 0;
    }
}
