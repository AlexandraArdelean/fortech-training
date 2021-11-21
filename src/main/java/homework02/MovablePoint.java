package homework02;

import homework02.exceptions.*;

public class MovablePoint implements Movable {
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    /**
     * constructor that initialises the values of x and y coordinates in a plan
     * xSpeed, ySpeed represents the moving speed of coordinates(x,y)
     *
     * @param x      is the x coordinate of point in plan
     * @param y      is the y coordinate of point in plan
     * @param xSpeed is the moving speed of x
     * @param ySpeed is the moving speed of y
     * @throws InvalidPointCreationException is thrown when coordinates (x,y) are not in plan
     * @throws InvalidSpeedException         is thrown when xSpeed and YSpeed aren't valid
     * @throws InvalidValueException         is thrown when xSpeed or YSpeed have negative values
     */
    public MovablePoint(int x, int y, int xSpeed, int ySpeed) throws
            InvalidPointCreationException,
            InvalidSpeedException,
            InvalidValueException {
        // checking if (x,y) are in plain
        if ((x > PLAIN_X_MAX || x < PLAIN_X_MIN) || (y > PLAIN_Y_MAX || y < PLAIN_Y_MIN)) {
            throw new InvalidPointCreationException("The coordinates (x,y) of MovablePoint should be between: " + PLAIN_X_MAX
                    + PLAIN_X_MIN);

        }

        // check if the speed movement is positive
        if (xSpeed <= 0 || ySpeed <= 0) {
            throw new InvalidValueException("The movement speed must be a positive number!");

        }

        // check if a point can move in any direction in plan
        if ((PLAIN_X_MAX < (xSpeed + Math.abs(x))) || (Math.abs(PLAIN_X_MIN) < (xSpeed + Math.abs(x)))) {
            throw new InvalidSpeedException("The speed of X is incorrect!");
        }
        if ((PLAIN_Y_MAX < (xSpeed + Math.abs(y))) || (Math.abs(PLAIN_Y_MIN) < (ySpeed + Math.abs(y)))) {
            throw new InvalidSpeedException("The speed of Y is incorrect!");
        }

        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(int xSpeed) throws InvalidValueException {
        if (xSpeed <= 0) {
            throw new InvalidValueException("xSpeed must be greater than 0!");
        }
        this.xSpeed = xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }

    public void setySpeed(int ySpeed) throws InvalidValueException {
        if (ySpeed <= 0) {
            throw new InvalidValueException("ySpeed must be greater than 0!");
        }
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() throws MoveUpException {
        int temp = this.y + this.ySpeed;
        if (temp > PLAIN_Y_MAX) {
            throw new MoveUpException("You have reached the maximum value! Maximum value for Y is: "
                    + PLAIN_Y_MAX);

        }
        this.y += this.ySpeed;

    }

    @Override
    public void moveDown() throws MoveDownException {
        int temp = this.y - this.ySpeed;
        if (temp < PLAIN_Y_MIN) {
            throw new MoveDownException("You have reached the minimum value! Minimum value for Y is:  "
                    + PLAIN_Y_MIN);
        }
        this.y -= this.ySpeed;

    }

    @Override
    public void moveLeft() throws MoveLeftException {
        int temp = this.x - this.xSpeed;
        if (temp < PLAIN_X_MIN) {
            throw new MoveLeftException("You have reached the minimum value! Minimum value for X is: " +
                    "" + PLAIN_X_MIN);

        }
        this.x -= this.xSpeed;

    }

    @Override
    public void moveRight() throws MoveRightException {
        int temp = this.x + this.xSpeed;
        if (temp > PLAIN_X_MAX) {
            throw new MoveRightException("You have reached the maximum value! Maximum value for X is: "
                    + PLAIN_X_MAX);

        }
        this.x += this.xSpeed;
    }

    @Override
    public void moveUp(int howMuch) throws MoveUpException, InvalidValueException {
        if (howMuch <= 0) {
            throw new InvalidValueException("Invalid value provided!");
        }
        int temp = this.y + howMuch;
        if (temp > PLAIN_Y_MAX) {
            throw new MoveUpException("The points are too big! Movement could not be completed!");
        }
        this.y += howMuch;

    }

    @Override
    public void moveDown(int howMuch) throws MoveDownException, InvalidValueException {
        if (howMuch <= 0) {
            throw new InvalidValueException("Invalid value provided!");
        }
        int temp = this.y - howMuch;
        if (temp < PLAIN_Y_MIN) {
            throw new MoveDownException("The points are too big! Movement could not be completed");
        }
        this.y -= howMuch;
    }

    @Override
    public void moveLeft(int howMuch) throws MoveLeftException, InvalidValueException {
        if (howMuch <= 0) {
            throw new InvalidValueException("Invalid value provided!");
        }
        int temp = this.x - howMuch;
        if (temp < PLAIN_X_MIN) {
            throw new MoveLeftException("The points are too big! Movement could not be completed");
        }
        this.x -= howMuch;

    }

    @Override
    public void moveRight(int howMuch) throws MoveRightException, InvalidValueException {
        if (howMuch <= 0) {
            throw new InvalidValueException("Invalid value provided!");
        }
        int temp = this.x + howMuch;
        if (temp > PLAIN_X_MAX) {
            throw new MoveRightException("The points are too big! Movement could not be completed");
        }
        this.x += howMuch;

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
}
