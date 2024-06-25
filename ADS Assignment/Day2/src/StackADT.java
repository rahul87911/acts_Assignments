// Stack ADT Interface
public interface StackADT<T> {
    void push(T item);   // Add an item to the top of the stack
    T pop();             // Remove and return the item from the top of the stack
    T peek();            // Return (without removing) the item at the top of the stack
    boolean isEmpty();   // Check if the stack is empty
    int size();          // Return the number of items in the stack
}
