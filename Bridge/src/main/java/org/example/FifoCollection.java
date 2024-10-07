package org.example;

// This is the abstraction
// It represents a First-In First-Out collection
public interface FifoCollection<T> {

    // Adds element to collection
    void offer(T element);

    // Removes & returns first element from collection
    T poll();
}
