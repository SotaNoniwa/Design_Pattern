package org.example;

import javafx.geometry.Point3D;

import java.util.ArrayList;
import java.util.Arrays;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
//        Swordsman s1 = new Swordsman();
//        s1.move(new Point3D(-10, 0, 0), 20);
//        s1.attack();
//
//        System.out.println(s1);
//        Swordsman s2 = (Swordsman) s1.clone();
//        System.out.println("Cloned swordsman " + s2);

        DocumentPrototype document1 = new Document(
                "Alice in wonderland",
                "The story of Alice to explore mysterious & exciting world.",
                Arrays.asList("Alice", "Rabbit", "Mad hatter")
        );
        System.out.println(document1);
        document1.display();

        DocumentPrototype document2 = document1.clone();
        System.out.println(document2);
        document2.display();

    }
}