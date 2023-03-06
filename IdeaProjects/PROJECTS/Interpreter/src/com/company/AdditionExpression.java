package com.company;

public class AdditionExpression implements Expression{

    private String expression;

    public AdditionExpression(String expression) {
        this.expression = expression;
    }

    @Override
    public int interpret(InterpreterEngine interpreterEngine) {
        return interpreterEngine.addition(expression);
    }

}
