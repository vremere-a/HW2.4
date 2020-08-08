package FigureExapmple;

public class Square extends Figure {
    private double sideA;

    public Square(double sideA) {
        this.sideA = sideA;
    }

    public String draw() {
        return "Фигура: " + "квадрат" + "," + " площадь: " + getArea()
                + " кв. ед." + "," + " длина стороны: " + sideLength() + " ед." + "," + " цвет: "
                + Color.BLUE.getColor() + ".";
    }

    public double getArea() {
        return sideA * sideA;
    }

    public double sideLength() {
        return sideA;
    }
}
