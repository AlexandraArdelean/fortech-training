package course03;

public enum Color {
    BLACK("negru"),
    WHITE("alb"),
    GREEN("verde"),
    YELLOW("galben");

    private String carColor;

    Color(String color) {
        this.carColor = color;
    }

    @Override
    public String toString() {
        return "Color{" +
                "carColor='" + carColor + '\'' +
                '}';
    }
}
