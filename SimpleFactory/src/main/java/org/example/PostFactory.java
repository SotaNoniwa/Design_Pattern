package org.example;

// Simple Factory: provide a static method to get instance of Post subclass
// The logic to create object based on condition is defined in this class.
public class PostFactory {

    public static Post createPost(String type) {
        return switch (type) {
            case "blog" -> new BlogPost();
            case "news" -> new NewsPost();
            case "product" -> new ProductPost();
            default -> throw new IllegalArgumentException("Post type is unknown");
        };
    }
}
