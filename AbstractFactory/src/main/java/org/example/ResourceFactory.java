package org.example;

/**
 * Abstract factory with methods defined for each object type.
 * Abstract factory doesn't know actual logic for object instantiation,
 * another classes (concrete factories) such as GoogleResourceFactory, AwsResourceFactory
 * are responsible for an object creation.
 */
public interface ResourceFactory {

    Instance createInstance(Instance.Capacity capacity);

    Storage createStorage(int capMib);
}
