package org.example;

import javafx.geometry.Point2D;

public class Client {
    public static void main(String[] args) {
        // User doesn't notice but here ImageProxy object is actually instantiated via ImageFactory
        Image img = ImageFactory.getImage("A1.bmp");

        img.setLocation(new Point2D(10, 10));
        System.out.println("Image location: " + img.getLocation());

        System.out.println("Rendering image now...");
        img.render(); // BitmapImage object is created
    }
}