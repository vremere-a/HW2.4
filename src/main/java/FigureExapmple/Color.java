package FigureExapmple;

public enum Color {
    BLUE (" синий."),
    WHITE (" белый."),
    RED (" красный."),
    YELLOW (" желтый.");

    private String describe;

     Color(String describe) {
        this.describe = describe;
    }

    public String getColor() {
        return describe;
    }
}



