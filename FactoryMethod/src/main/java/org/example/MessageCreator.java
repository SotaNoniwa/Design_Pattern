package org.example;

import org.example.message.Message;

/**
 * This is our abstract "creator".
 * The abstract method createMessage() has to be implemented by its subclasses.
 */
public abstract class MessageCreator {

    public Message getMessage() {
        Message msg = createMessage(); // Instantiate object

        msg.addDefaultHeaders();
        msg.encrypt();

        return msg; // return Message object
    }

    // Factory method
    public abstract Message createMessage();
}
