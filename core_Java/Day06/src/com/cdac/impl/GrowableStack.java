package com.cdac.impl;

import com.cdac.inter.Stack;
import com.cdac.core.*;

public class GrowableStack implements Stack {

	private Customer[] stackArray;
    private int top;

    public GrowableStack() {
        stackArray = new Customer[STACK_SIZE];
        top = -1;
    }

    @Override
    public void push(Customer customer) {
        if (top == stackArray.length - 1) {
            
            Customer[] newArray = new Customer[stackArray.length * 2];
            System.arraycopy(stackArray, 0, newArray, 0, stackArray.length);
            stackArray = newArray;
        }
        stackArray[++top] = customer;
    }

    @Override
    public Customer pop() {
        if (top == -1) {
            System.out.println("Stack is empty. Nothing to pop.");
            return null;
        }
        return stackArray[top--];
    }
}
