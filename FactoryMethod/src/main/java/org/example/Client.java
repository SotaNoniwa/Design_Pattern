package org.example;

import org.example.message.Message;

public class Client {
    public static void main(String[] args) {
        printMessage(new TextMessageCreator());

        printMessage(new JSONMessageCreator());
    }

    public static void printMessage(MessageCreator creator) {
        Message msg = creator.getMessage();
        System.out.println(msg);
    }
}