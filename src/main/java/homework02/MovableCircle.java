package homework02;

import homework02.exceptions.*;

public class MovableCircle implements Movable {

    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) throws MovableException {

        this.radius = radius;
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);

        if (radius <= 0) {
            throw new InvalidValueException("The radius value must be a positive number!");
        }
        checkCircleDirection();
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) throws InvalidValueException, InvalidCircleCreationException {
        if (radius <= 0) {
            throw new InvalidValueException("The radius value must be greater then 0");
        }
        // setting a temporary value for radius
        int tempRadius = radius;

        // check if X coordinate has a negative value, if so, change the tempRadius to negative value
        if (this.center.getX() < 0) {
            tempRadius *= -1;
        }

        // check if Y coordinate has a negative value
        if (this.center.getY() < 0) {
            // check if tempRadius wasn't changed
            if (tempRadius > 0) {
                // then change tempRadius value to negative
                tempRadius *= -1;
            }
        }

        // check if the circle around a point is in plan
        if (((this.center.getX() + tempRadius) > PLAIN_X_MAX || (this.center.getX() + tempRadius) < PLAIN_X_MIN)
                || ((this.center.getY() + tempRadius) > PLAIN_Y_MAX || (this.center.getY() + tempRadius) < PLAIN_Y_MIN)) {
            throw new InvalidCircleCreationException("The Circle could not be created");
        }
        this.radius = radius;
    }


    @Override
    public void moveUp() throws MoveUpException {
        if ((this.center.getY() + this.radius + this.center.getySpeed()) > PLAIN_Y_MAX) {
            throw new MoveUpException("The circle is out of plan. Can't execute move up method!");
        }
        this.center.moveUp();

    }

    @Override
    public void moveDown() throws MoveDownException {
        if ((this.center.getY() - (radius + this.center.getySpeed()) > PLAIN_Y_MAX)) {
            throw new MoveDownException("The circle is out of plan. Can't execute move down method!");

        }
        this.center.moveDown();

    }

    @Override
    public void moveLeft() throws MoveLeftException {
        if ((this.center.getX() - (this.radius + this.center.getxSpeed()) > PLAIN_X_MIN)) {
            throw new MoveLeftException("The circle is out of plan! Can't execute move left method!");
        }
        this.center.moveLeft();
    }

    @Override
    public void moveRight() throws MoveRightException {
        if ((this.center.getX() + this.radius + this.center.getxSpeed()) > PLAIN_X_MAX) {
            throw new MoveRightException("The circle is out of plan! Can't execute move right method!");
        }
        this.center.moveRight();

    }

    @Override
    public void moveUp(int howMuch) throws MoveUpException, InvalidValueException {
        if (howMuch <= 0) {
            throw new InvalidValueException("Invalid value provided!");
        }
        if ((this.center.getY() + this.radius + howMuch) > PLAIN_Y_MAX) {
            throw new MoveUpException("Circle is out of plan. Move up method could not be executed!");
        }

        this.center.moveUp(howMuch);
    }

    @Override
    public void moveDown(int howMuch) throws MoveDownException, InvalidValueException {
        if (howMuch <= 0) {
            throw new InvalidValueException("Invalid value provided!");
        }
        if (this.center.getY() - (radius + howMuch) < PLAIN_Y_MIN) {
            throw new MoveDownException("Circle is out of plan. Move down method could not be executed!");
        }
        this.center.moveDown(howMuch);

    }

    @Override
    public void moveLeft(int howMuch) throws MoveLeftException, InvalidValueException {
        if (howMuch <= 0) {
            throw new MoveLeftException("Invalid value provided!");
        }
        if (this.center.getX() - (this.radius + howMuch) < PLAIN_X_MIN) {
            throw new MoveLeftException("Circle is out of plan. Move left method could not be executed!");
        }
        this.center.moveLeft(howMuch);
    }

    @Override
    public void moveRight(int howMuch) throws MoveRightException, InvalidValueException {
        if (howMuch <= 0) {
            throw new InvalidValueException("Invalid value provided!");
        }
        if ((this.center.getX() + this.radius + howMuch) > PLAIN_X_MAX) {
            throw new MoveRightException("Circle is out of plan. Move right method could not be executed!");
        }
        this.center.moveRight(howMuch);
    }

    // method to check in what direction a point can move
    public void checkCircleDirection() {
        System.out.println("Directions for moving the circle: ");
        if ((this.center.getY() + this.radius + this.center.getySpeed()) <= PLAIN_Y_MAX) {
            System.out.println("Up");
        }
        if ((this.center.getY() - (radius + this.center.getySpeed())) >= PLAIN_Y_MIN) {
            System.out.println("Down");
        }
        if ((this.center.getX() + this.radius + this.center.getxSpeed()) <= PLAIN_X_MAX) {
            System.out.println("Right");
        }
        if ((this.center.getX() - (radius + this.center.getxSpeed())) >= PLAIN_X_MIN) {
            System.out.println("Left");
        }

    }

    @Override
    public String toString() {
        return String.format("MovableCircle with center at %1$s with radius = %2$d",
                this.center.toString(), this.radius);
    }
}
