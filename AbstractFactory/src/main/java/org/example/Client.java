package org.example;

import org.example.aws.AwsResourceFactory;
import org.example.gcp.GoogleResourceFactory;
import org.example.Instance.Capacity;

public class Client {

    private final ResourceFactory factory;

    // * HIDING CONCRETE FACTORIES
    // Client works with abstract interface ResourceFactory,
    // meaning Client doesn't know the details of which specific
    // factory is used (AwsResourceFactory or GoogleResourceFactory).
    public Client(ResourceFactory factory) {
        this.factory = factory;
    }

    // * HIDING CONCRETE OBJECTS
    // Client is only interacting with the interface Instance and Storage,
    // not the specific implementations like Ec2Instance or GoogleComputeEngineInstance.
    public Instance createServer(Capacity cap, int storageMib) {
        Instance instance = factory.createInstance(cap);
        Storage storage = factory.createStorage(storageMib);
        instance.attachStorage(storage);
        return instance;
    }

    public static void main(String[] args) {
        Client aws = new Client(new AwsResourceFactory());
        Instance i1 = aws.createServer(Capacity.micro, 20480);
        i1.start();
        i1.stop();

        System.out.println("*************************");
        Client gcp = new Client(new GoogleResourceFactory());
        Instance i2 = gcp.createServer(Capacity.micro, 20480);
        i2.start();
        i2.stop();
    }
}