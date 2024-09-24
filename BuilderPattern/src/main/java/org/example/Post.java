package org.example;

public class Post {

    // private & final because members are immutable
    private final String title;
    private final String content;
    private final String category;

    Post(Builder builder) {
        this.title = builder.title;
        this.content = builder.content;
        this.category = builder.category;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Post{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", category='" + category + '\'' +
                '}';
    }

    // Builder inner class
    // static because we need an instance of Builder (inner) class before instantiating object of Post (outer) class.
    // If an inner class is not static, we can't instantiate it without creating an instance of the outer class.
    public static class Builder {
        private String title;
        private String content;
        private String category;

        public Builder withTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder withContent(String content) {
            this.content = content;
            return this;
        }

        public Builder withCategory(String category) {
            this.category = category;
            return this;
        }

        public Post build() {
            return new Post(this);
        }
    }
}
