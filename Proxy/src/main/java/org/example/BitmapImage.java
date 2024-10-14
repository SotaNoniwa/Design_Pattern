package org.example;

import javafx.geometry.Point2D;

public class BitmapImage implements Image {

    private Point2D location;
    private String name;

    public BitmapImage(String filename) {
        // Loads image from file on disk
        System.out.println("Loaded from disk:" + filename);
        name = filename;
    }

    @Override
    public void render() {
        // Render to screen
        System.out.println("Rendered " + name);
    }

    @Override
    public Point2D getLocation() {
        return location;
    }

    @Override
    public void setLocation(Point2D point2d) {
        location = point2d;
    }
}
