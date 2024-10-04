package org.example;

/**
 * This class demonstrates singleton pattern using Double-Checked Locking
 * or "classic" singleton, also known as a lazy initializing singleton.
 * Although this implementation solves the multi-threading issue with
 * lazy initialization using volatile and double check locking, the volatile
 * keyword is guaranteed to work only after JVMs starting.
 */
public class LazyRegistryWithDCL {

    private LazyRegistryWithDCL() {
    }

    // volatile forces value read/write from main memory instead of cache
    private static volatile LazyRegistryWithDCL INSTANCE;

    // Note the method is static, meaning it belongs to the class, not instances
    public static LazyRegistryWithDCL getInstance() {
        if (INSTANCE == null) { // First check (without lock)
            // Need class level lock (not instance level) as getInstance() belongs to class.
            // LazyRegistryWithDCL.class refers to class object (not instance object)
            // synchronized ensures only one thread can enter the block
            synchronized (LazyRegistryWithDCL.class) { // Acquire lock on class object
                if (INSTANCE == null) { // Second check (with lock)
                    INSTANCE = new LazyRegistryWithDCL(); // Initialize singleton
                }
            }
        }
        return INSTANCE;
    }
}
