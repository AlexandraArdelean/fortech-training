package homework;

public class ShapeTest {

    public static void main(String[] args) {


        Shape s1 = new Circle(5.5, "Red", true);
        System.out.println(s1); // this will call toString() from Circle
        System.out.println(s1.getColor()); // call getColor() from Shape
        System.out.println(s1.isFilled()); // call isFilled() from Shape


        Circle c1 = new Circle(2.6, "white", true);
        System.out.println(c1); // calls toString() from Circle
        System.out.println(c1.getArea()); // calls getArea() from Circle
        System.out.println(c1.getPerimeter()); // call getPerimeter() from Circle
        System.out.println(c1.getRadius()); // call getRadius() from Circle
        System.out.println(c1.getColor()); // calls getColor() from Shape
        System.out.println(c1.isFilled()); // call isFilled() from Shape


        Shape s2 = new Rectangle(1.0, 2.0, "white", true);
        System.out.println(s2); // toString() from Rectangle
        System.out.println(s2.getColor()); // getColor() from Shape
        System.out.println(s2.isFilled()); //isFilled() from Shape


        Rectangle r1 = (Rectangle) s2; // by down casting Shape s2 to Rectangle we have access to methods from Rectangle class
        System.out.println(r1); // from Rectangle
        System.out.println(r1.getArea()); // from Rectangle
        System.out.println(r1.getPerimeter()); // from Rectangle
        System.out.println(r1.getColor()); // from Shape
        System.out.println(r1.isFilled()); // from Shape
        System.out.println(r1.getLength()); // from Rectangle
        System.out.println(r1.getWidth()); // from Rectangle


        Square s3 = new Square(6.6, "black", false);

        System.out.println(s3); // calls toString() from Square
        System.out.println(s3.getArea()); // calls getArea() from Rectangle
        System.out.println(s3.getPerimeter()); // calls getPerimeter() from Rectangle
        System.out.println(s3.getColor()); // calls getColor() from Shape
        System.out.println(s3.isFilled()); // calls isFilled() from Shape

        Rectangle s4 = new Square(5.0);
        s4.setLength(10);
        s4.setWidth(20);
        System.out.println(s4); // calls toString() from Square
        System.out.println(s4.getArea()); // calls getArea() from Rectangle
        System.out.println(s4.getPerimeter()); // calls getPerimeter() from Rectangle
        System.out.println(s4.getWidth()); // from Rectangle
        System.out.println(s4.getLength()); // from Rectangle
        System.out.println(s4.getColor()); // from Shape
        System.out.println(s4.isFilled()); // from Shape



    }

}
