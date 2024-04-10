package com.cdac.inter;
import com.cdac.core.*;

public interface Stack {

	int STACK_SIZE = 5; 

    void push(Customer customer);

    Customer pop();
}
