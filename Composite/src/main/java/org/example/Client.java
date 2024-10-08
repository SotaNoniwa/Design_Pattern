package org.example;

public class Client {
    // Client treats both composite & leaf nodes (objects) uniformly
    public static void main(String[] args) {
        // createTreeOne() returns Directory object
        File root1 = createTreeOne(); // Receives returned data as File
        root1.ls();

        System.out.println("****************");
        // createTreeTwo() returns BinaryFile object
        File root2 = createTreeTwo(); // Receives returned data as File
        root2.ls();
    }

    // Client builds tree using leaf and composites
    private static File createTreeOne() {
        // Create directories & files
        Directory dir1 = new Directory("DIR1");
        Directory dir2 = new Directory("DIR2"); // Top-level directory holds all dirs & files
        File file1 = new BinaryFile("file1", 1000);
        File file2 = new BinaryFile("file2", 2000);
        File file3 = new BinaryFile("file3", 150);

        // Add files to directories via addFile()
        dir2.addFile(file2);
        dir2.addFile(file3);
        dir2.addFile(dir1);
        dir1.addFile(file1);

        return dir2; // Return Directory object
    }

    private static File createTreeTwo() {
        // Return BinaryFile object
        return new BinaryFile("Another file", 200);
    }
}