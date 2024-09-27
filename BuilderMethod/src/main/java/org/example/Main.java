package org.example;

public class Main {
    public static void main(String[] args) {
        Post post = new Post.Builder()
                .withTitle("Java Builder Pattern")
                .withContent("Builder pattern is useful when we have a complex object that can be built in multiple simple steps.")
                .withCategory("Design pattern")
                .build();

        System.out.println(post);
    }
}