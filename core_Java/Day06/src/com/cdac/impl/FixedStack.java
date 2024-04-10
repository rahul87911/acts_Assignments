package com.cdac.impl;

import com.cdac.inter.Stack;
import com.cdac.core.*;

public class FixedStack implements Stack {

	 private Customer[] stackArray;
	 private int top;

	    public FixedStack() {
	        stackArray = new Customer[STACK_SIZE];
	        top = -1;
	    }

	    @Override
	    public void push(Customer customer) {
	        if (top == STACK_SIZE - 1) {
	            System.out.println("Stack is full. Cannot push more elements.");
	            return;
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
