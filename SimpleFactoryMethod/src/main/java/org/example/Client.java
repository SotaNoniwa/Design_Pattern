package org.example;

public class Client {
    public static void main(String[] args) {
        // Logic for object creation is in PostFactory, thus we just call static method, createPost()
        Post newsPost = PostFactory.createPost("news");
        System.out.println(newsPost);

        Post productPost = PostFactory.createPost("product");
        System.out.println(productPost);

        Post blogPost = PostFactory.createPost("blog");
        System.out.println(blogPost);
    }
}