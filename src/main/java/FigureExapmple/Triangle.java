package FigureExapmple;

public class Triangle extends Figure {
    private double sideA;
    private double sideB;
    private double height;

    public Triangle(double sideA, double height, double sideB) {
        this.sideA = sideA;
        this.height = height;
        this.sideB = sideB;
    }

    public String draw() {
        return "Фигура: " + " треугольник" + "," + " площадь: " + getArea()
                + " кв. ед." + "," + " длина гипотенузы: " + hypotenuse() + " ед." + "," + " цвет: "
                + Color.RED.getColor() + ".";
    }

    public double getArea() {
        return 0.5 * sideA * height;
    }

    public double hypotenuse() {
        return Math.round(Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2)));
    }
}
