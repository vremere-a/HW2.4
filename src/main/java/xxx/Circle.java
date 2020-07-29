package xxx;

public class Circle extends Figure {
    private double r;

    Circle(double r) {
        this.r = r;
    }

    public String draw() {
        return "круг";
    }

    public double getArea() {
        return Math.round(Math.PI *r *r) ;
    }

    public String getColor() {
        return " белый.";
    }

    public double diameter() {
        return  r+r;
    }
}
