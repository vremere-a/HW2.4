package xxx;

public class Trapezoid extends Figure {
    private double a;
    private double b;
    private double c;
    private double d;
    private double h;

    Trapezoid(double a, double h, double b , double c, double d){
        this.a=a;
        this.h=h;
        this.b=b;
        this.c=c;
        this.d=d;
    }

    public String draw() {
        return "трапеция";
    }

    public double getArea() {
        return a+b/0.5*h;
    }

    public String getColor() {
        return " красный.";
    }

    public double midleLine() {
        return (a+b)/2;
    }
}
