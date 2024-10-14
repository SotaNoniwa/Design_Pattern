package org.example;

import javafx.geometry.Point2D;

public class ImageProxy implements Image {

    private BitmapImage image; // Reference to real object (BitmapImage)
    private String name;
    private Point2D location;

    public ImageProxy(String name) {
        this.name = name;
    }

    @Override
    public void render() {
        // Lazy loading, instantiate object only when it's necessary
        if (image == null) {
            image = new BitmapImage(name);
            if (location != null) {
                image.setLocation(location);
            }
            image.render();
        }
    }

    @Override
    public Point2D getLocation() {
        if (image != null) {
            image.getLocation();
        }
        return location;
    }

    @Override
    public void setLocation(Point2D point2d) {
        if (image != null) {
            image.setLocation(point2d);
        } else {
            location = point2d;
        }
    }
}
