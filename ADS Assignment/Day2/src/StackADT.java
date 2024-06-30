public interface StackADT<T> {
    void push(T item);   
    T pop();             
    T peek();            
    int size();
	boolean isEmpty();          
}
