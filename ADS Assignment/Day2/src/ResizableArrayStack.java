//JDK 16 used
public class ResizableArrayStack<T> implements StackADT<T> {
    private T[] stack;      
    private int size;       

    private static final int DEFAULT_CAPACITY = 10;

    @SuppressWarnings("unchecked")
    public ResizableArrayStack() {
        stack = (T[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    @Override
    public void push(T item) {
        if (size == stack.length) {
            resize(2 * stack.length);  
        }
        stack[size++] = item;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        T item = stack[--size];
        stack[size] = null; 
        if (size > 0 && size == stack.length / 4) {
            resize(stack.length / 2); 
        }
        return item;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack[size - 1];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @SuppressWarnings("unchecked")
    private void resize(int capacity) {
        T[] newStack = (T[]) new Object[capacity];
        System.arraycopy(stack, 0, newStack, 0, size);
        stack = newStack;
    }

    public static void main(String[] args) {
        StackADT<Integer> stack = new ResizableArrayStack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Stack size: " + stack.size()); 
        System.out.println("Top element: " + stack.peek());

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack size after pop: " + stack.size()); 

        System.out.println("Is stack empty? " + stack.isEmpty()); 

        stack.pop();
        stack.pop();

        System.out.println("Is stack empty after popping all elements? " + stack.isEmpty()); 
    }
}
