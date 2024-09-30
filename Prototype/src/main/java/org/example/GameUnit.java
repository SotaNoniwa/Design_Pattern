package org.example;

import javafx.geometry.Point3D;

/**
 * This class represents an abstract prototype & defines the clone method
 */
public abstract class GameUnit implements Cloneable {

    private Point3D position;

    public GameUnit() {
        position = Point3D.ZERO;
    }

    public GameUnit(float x, float y, float z) {
        position = new Point3D(x, y, z);
    }

    /**
     * The {@code clone} method overrides {@code clone} method for {@code Object} class.
     * {@code super.clone()} performs <b>shallow copy</b> ({@code position} in original instance
     * and {@code position} in copied instance refer to the same instance of {@code Point3D}, that is,
     * changing {@code position} in one will affect to another {@code position}) and returns {@code Object}
     * instance, therefore, it needs to be cast as {@code GameUnit}.<br>
     * Then, it calls {@code unit.initialize()} to set {@code Point3D position} to the origin (0, 0, 0).
     * Note {@code Position3D} is immutable, we can't change its object ({@code position}) once it's created.
     * At the end, any change of {@code position} in a {@code GameUnit} object
     * (through methods like {@code initialize()} or {@code move()})
     * will create new instance of Point3D, leaving another {@code GameUnit} object
     * unaffected.
     *
     * @return a new instance
     * @throws CloneNotSupportedException
     */
    @Override
    public GameUnit clone() throws CloneNotSupportedException {
        GameUnit unit = (GameUnit) super.clone();
        unit.initialize();
        return unit;
    }

    protected void initialize() {
        this.position = Point3D.ZERO;
        reset();
    }

    protected abstract void reset();

    public void move(Point3D direction, float distance) {
        Point3D finalMove = direction.normalize();
        finalMove = finalMove.multiply(distance);
        position = position.add(finalMove);
    }

    public Point3D getPosition() {
        return position;
    }
}
