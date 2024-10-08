package org.example;

import java.util.ArrayList;
import java.util.List;

/*
Composite class in the composite pattern
Implements children management operations e.g. ls(), addFile()
Delegate unrelated operations with children management to child (leaf) class
 */
public class Directory extends File {

    // Stores child components as ArrayList
    private List<File> children = new ArrayList<>();

    public Directory(String name) {
        super(name);
    }

    @Override
    public void ls() {
        System.out.println(getName());
        children.forEach(File::ls);
    }

    @Override
    public File[] getFiles() {
        return children.toArray(new File[children.size()]);
    }

    @Override
    public void addFile(File file) {
        children.add(file);
    }

    @Override
    public boolean removeFile(File file) {
        return children.remove(file);
    }
}
