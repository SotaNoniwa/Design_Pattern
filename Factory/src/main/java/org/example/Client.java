package org.example;

import org.example.message.Message;

public class Client {
    public static void main(String[] args) {
        printMessage(new TextMessageCreator());
        printMessage(new JSONMessageCreator());
    }

    // * HIDING CONCRETE OBJECTS
    // Client is only interacting with abstract class MessageCreator,
    // not the specific implementations like JSONMessage or TextMessage.
    public static void printMessage(MessageCreator creator) {
        Message msg = creator.getMessage();
        System.out.println(msg);
    }
}