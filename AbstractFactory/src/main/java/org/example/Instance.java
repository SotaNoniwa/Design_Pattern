package org.example.instance;

import org.example.storage.Storage;

// Represents an abstract product
public interface Instance {

    enum Capacity {micro, small, large}

    void start();

    void attachStorage(Storage storage);

    void stop();
}
