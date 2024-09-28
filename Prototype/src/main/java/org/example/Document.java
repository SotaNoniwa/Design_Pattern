package org.example;

import java.util.ArrayList;
import java.util.List;

public class Document implements DocumentPrototype {

    private final String title;
    private final String content;
    private final List<String> images;

    Document(String title, String content, List<String> images) {
        this.title = title;
        this.content = content;
        this.images = new ArrayList<>(images); // Deep copy of images list
    }

    @Override
    public DocumentPrototype clone() {
        // Deep copy of complex document
        return new Document(this.title, this.content, this.images);
    }

    @Override
    public void display() {
        System.out.println("title: " + title + ", content: " + content + ", images: " + images);
    }

}
