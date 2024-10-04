package org.example;

/**
 * Eager Singleton - Early initialization
 * Create singleton as soon as class is loaded
 */
public class EagerRegistry {

    /**
     * The constructor is private to ensure that no other class
     * can instantiate EagerRegistry using the new keyword.
     * This enforces the rule that only one instance of the class will ever be created.
     */
    private EagerRegistry() {
    }

    /**
     * static - INSTANCE belongs to class, not instance of the class
     * final - We need only one INSTANCE that is immutable
     */
    private static final EagerRegistry INSTANCE = new EagerRegistry();

    public static EagerRegistry getInstance() {
        return INSTANCE;
    }
}
