//JDK16 Used
public  class ArrayQueue<T> implements QueueADT<T> {

	 private T[] queue;
	    private int front;
	    private int rear;
	    private int count;
	    private int capacity;

	    public ArrayQueue(int capacity) {
	        this.capacity = capacity;
	        queue = (T[]) new Object[capacity];
	        front = 0;
	        rear = 0;
	        count = 0;
	    }
	    
	    

	    @Override
	    public void enqueue(T element) {
	        if (isFull()) {
	            throw new IllegalStateException("Queue is full");
	        }
	        queue[rear] = element;
	        rear = (rear + 1) % capacity;
	        count++;
	    }

	    @Override
	    public T dequeue() {
	        if (isEmpty()) {
	            throw new IllegalStateException("Queue is empty");
	        }
	        T element = queue[front];
	        queue[front] = null;
	        front = (front + 1) % capacity;
	        count--;
	        return element;
	    }

	    @Override
	    public T peek() {
	        if (isEmpty()) {
	            throw new IllegalStateException("Queue is empty");
	        }
	        return queue[front];
	    }

	    @Override
	    public boolean isEmpty() {
	        return count == 0;
	    }

	    @Override
	    public boolean isFull() {
	        return count == capacity;
	    }

	    @Override
	    public int size() {
	        return count;
	    }

	    public static void main(String[] args) {
	        ArrayQueue<Integer> queue = new ArrayQueue<>(5);
	        queue.enqueue(1);
	        queue.enqueue(2);
	        queue.enqueue(3);
	        System.out.println("Front element is: " + queue.peek());
	        System.out.println("Removed element: " + queue.dequeue());
	        System.out.println("Queue size: " + queue.size());
	        System.out.println("Is queue empty? " + queue.isEmpty());
	        System.out.println("Is queue full? " + queue.isFull());
	    }



		@Override
		public void display() {
		   for(i=0;i<=)
			
		}

}
