package homework;

public class Square extends Rectangle {


    public Square() {
        super();

    }

    public Square(double side) {
        super(side, side); // in this case width=length=side
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }


    public double getSide() {
        return super.getWidth();
    }

    // the side of a square should be the same width and length
    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public void setWidth(double side) {
        setSide(side);
    }

    @Override
    public void setLength(double side) {
        setSide(side);

    }


    /**
     * We don't need to override the getArea() and getPerimeter() from Rectangle class
     * Using the 'extends' keyword, Square class inherits the attributes and methods from Rectangle Class (superclass)
     * Square is a rectangle with the width and length equals (width=length=side),
     * so the getArea() and getPerimeter() methods will be implemented correctly
     * without the need to override the methods in Square class
     */


    public String toString() {
        return "A Square with side= " + getSide() + ", which is a subclass of " + super.toString();
    }
}
