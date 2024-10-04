package org.example;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Supplier;

// The object pool, here we are pre-creating all objects.
public class ObjectPool<T extends Poolable> {

    private BlockingQueue<T> availablePool; // in memory cache

    public ObjectPool(Supplier<T> creator, int count) {
        availablePool = new LinkedBlockingQueue<>();
        for (int i = 0; i < count; i++) {
            availablePool.offer(creator.get());
        }
    }

    // get method must decide what to do if pool is empty. It can create new
    // object and return that, or wait until one becomes available.
    public T get() {
        try {
            // Wait if none of objects in pool are free. Note this has severe impact!
            return availablePool.take();
        } catch (InterruptedException e) {
            System.out.println("take() was interrupted");
        }
        return null;
    }

    public void release(T obj) {
        obj.reset();
        try {
            availablePool.put(obj);
        } catch (InterruptedException e) {
            System.out.println("put() was interrupted");
        }
    }
}
