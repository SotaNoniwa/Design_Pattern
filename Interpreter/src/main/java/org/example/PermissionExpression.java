package org.example;

// Abstract expression
public interface PermissionExpression {

    boolean interpret(User user);
}
