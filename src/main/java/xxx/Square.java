package xxx;

public class Square extends Figure {
    private double a;

    Square(double a){
        this.a=a;
    }

    public String draw() {
        return "квадрат";
    }

    public double getArea() {
       return a*a;
    }

    public String getColor() {
        return " синий.";
    }

    public double sideLength() {
       return a;
    }
}
