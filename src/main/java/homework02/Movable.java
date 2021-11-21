package homework02;


import homework02.exceptions.*;

/**
 * Specifies that a geometric form is movable in a 2D plain.
 */

public interface Movable {


    int PLAIN_X_MAX = 1000;
    int PLAIN_Y_MAX = 1000;
    int PLAIN_X_MIN = -1000;
    int PLAIN_Y_MIN = -1000;

    /**
     * Moves the form up in the plain. The implementation should take care of
     * how much will this movement be.
     */
    void moveUp() throws MoveUpException;

    /**
     * Moves the form down in the plain. The implementation should take care of
     * how much will this movement be.
     */
    void moveDown() throws MoveDownException;

    /**
     * Moves the form left in the plain. The implementation should take care of
     * how much will this movement be.
     */
    void moveLeft() throws MoveLeftException, InvalidValueException;

    /**
     * Moves the form right in the plain. The implementation should take care of
     * how much will this movement be.
     */
    void moveRight() throws MoveRightException, InvalidValueException;

    /**
     * Moves the form up in the plain with the specified number of points.
     *
     * @param howMuch the number of points to move up in the plain
     */
    void moveUp(int howMuch) throws MoveUpException, InvalidValueException;

    /**
     * Moves the form down in the plain with the specified number of points.
     *
     * @param howMuch the number of points to move down in the plain
     */
    void moveDown(int howMuch) throws MoveDownException, InvalidValueException;

    /**
     * Moves the form left in the plain with the specified number of points.
     *
     * @param howMuch the number of points to move left in the plain
     */
    void moveLeft(int howMuch) throws MoveLeftException, InvalidValueException;

    /**
     * Moves the form right in the plain with the specified number of points.
     *
     * @param howMuch the number of points to move right in the plain
     */
    void moveRight(int howMuch) throws MoveRightException, InvalidValueException;


}
