package homework;

public class Shape {

    private String color;
    private boolean filled;

    public Shape() {
        color = "green";
        filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString() {
        String isNot = "";
        if (isFilled() == false) {
            isNot = "not ";
        }
        return "A Shape with color of " + color + " is " + isNot + "filled. ";
    }
}


