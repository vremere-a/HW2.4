package xxx;

public class Triangle extends Figure {
    private double a;
    private double b;
    private double h;

    Triangle(double a, double h, double b){
        this.a=a;
        this.h=h;
        this.b=b;
    }

    public String draw() {
        return "треугольник";
    }

    public double getArea() {
        return 0.5*a*h;
    }

    public String getColor() {
        return " желтый.";
    }

    public double hypotenuse() {
        return Math.round(Math.sqrt(Math.pow(a,2) + Math.pow(b,2)));
    }
}
