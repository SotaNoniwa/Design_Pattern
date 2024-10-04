package org.example;

/**
 * Singleton pattern using lazy initialization holder class. This ensures that,
 * we have a lazy initialization without worrying about synchronization.
 */
public class LazyRegistryIODH {

    private LazyRegistryIODH() {
        System.out.println("In LazyRegistryIODH singleton");
    }


    // When LazyRegistryIODH.getInstance() is invoked, the RegistryHolder class is referenced for the first time.
    // At that moment, the RegistryHolder class gets loaded by the JVM.
    // As part of the class loading process, the static field INSTANCE inside RegistryHolder is initialized
    // by creating a new instance of LazyRegistryIODH.
    private static class RegistryHolder {
        static LazyRegistryIODH INSTANCE = new LazyRegistryIODH();
    }

    public static LazyRegistryIODH getInstance() {
        // RegistryHolder class gets loaded, static field INSTANCE is initialized
        return RegistryHolder.INSTANCE;
    }
}
