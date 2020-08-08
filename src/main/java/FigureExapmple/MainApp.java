package FigureExapmple;

public class MainApp {
    public static void main(String[] args) {
        Figure square = new Square(2);
        Figure circle = new Circle(2);
        Figure triangle = new Triangle(2, 3, 3);
        Figure trapezoid = new Trapezoid(2, 3, 3);

        int randNumberFigure = 1 + (int) (Math.random() * 4);
        Figure[] obj = new Figure[randNumberFigure];
        for (int i = 0; i < obj.length; i++) {
            int randTypeFigure = 1 + (int) (Math.random() * 4);
            if (randTypeFigure == 1)
                obj[i] = square;
            if (randTypeFigure == 2)
                obj[i] = circle;
            if (randTypeFigure == 3)
                obj[i] = triangle;
            if (randTypeFigure == 4)
                obj[i] = trapezoid;
        }
        for (Figure figure : obj) {
            System.out.println(figure.draw());
        }
    }
}
