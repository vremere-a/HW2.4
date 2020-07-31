package FigureExapmple;

public class Trapezoid extends Figure {
    private double sideA;
    private double sideB;
    private double height;

    public Trapezoid(double sideA, double height, double sideB) {
        this.sideA = sideA;
        this.height = height;
        this.sideB = sideB;
    }

    public String draw() {
        return "Фигура: " + " трапеция" + "," + " площадь: " + getArea()
                + " кв. ед." + "," + " средняя длина: " + middleLine() + " ед." + "," + " цвет:"
                + Color.YELLOW.getColor();
    }

    public double getArea() {
        return sideA + sideB / 0.5 * height;
    }

    @Override
    public double sideLength() {
        return 0;
    }

    public double middleLine() {
        return (sideA + sideB) / 2;
    }

    @Override
    public double hypotenuse() {
        return 0;
    }

    @Override
    public double diameter() {
        return 0;
    }
}
