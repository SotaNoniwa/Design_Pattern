package org.example;

/*
This is the implementor.
Note that this is also interface as implementor is defining its own hierarchy
which not related at all to the abstraction hierarchy.
*/
public interface LinkedList<T> {

    void addFirst(T element);

    T removeFirst();

    void addLast(T element);

    T removeLast();

    int getSize();
}
