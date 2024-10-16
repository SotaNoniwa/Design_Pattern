package org.example.dynamic;

import javafx.geometry.Point2D;
import org.example.Image;

public class Client {

    public static void main(String[] args) {
        Image img = ImageFactory.getImage("A.bmp");
        img.setLocation(new Point2D(-10, 0));
        System.out.println(img.getLocation());
        System.out.println("*****************************");
        img.render();
    }
}
