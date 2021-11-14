package homework02;

public class MovablePoint implements Movable{
    int x; // package access
    int y;
    int xSpeed;
    int ySpeed;

    // constructor
    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    @Override
    public void moveUp() {

    }

    @Override
    public void moveDown() {

    }

    @Override
    public void moveLeft() {

    }

    @Override
    public void moveRight() {

    }

    @Override
    public void moveUp(int howMuch) {

    }

    @Override
    public void moveDown(int howMuch) {

    }

    @Override
    public void moveLeft(int howMuch) {

    }

    @Override
    public void moveRight(int howMuch) {

    }
}
