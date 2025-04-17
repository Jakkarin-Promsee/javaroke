public class Queue<T> {
    private Node<T> front, rear;
    private int size;

    // Set Default Queue
    public Queue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    // Check node in Queue is Empty or not
    public boolean isEmpty() {
        return size == 0;
    }

    // Get size of Queue
    public int size() {
        return size;
    }

    // Enqueue data in the form as class T
    public void enqueue(T data) {
        // Create newNode as class T,and call Node() self setup function.
        Node<T> newNode = new Node<T>(data);

        // Main operation
        if (isEmpty()) {
            // Front = rear point at new node
            front = rear = newNode;
        } else {
            // Connect rear.next to new node
            rear.next = newNode;

            // Move rear to new node that live in the last of this liked list
            rear = newNode;
        }

        // If endqueue function work correctly, plus size of queue by 1
        size++;
    }

    // Dequeue data return as class T
    public T dequeue() {
        // If this queue empty, end this dequeue operation and return as a null value
        if (isEmpty()) {
            return null;
        }

        // Recieve Front data before move node pointer
        T data = front.data;

        // Move front pointer to front.next
        front = front.next;

        // If dequeue function work correctly, reduce size of queue by 1
        size--;

        // Set up pointer to default. when Front == null, Mean real must be null too
        // Use to prevent future conflict in mis match pointer
        if (front == null) {
            rear = null;
        }

        // Return Front data that keep before move pointer forward
        return data;
    }

    // Check Current front data, return as class T
    public T peek() {
        // If this queue empty, end this peek operation and return as a null value
        if (isEmpty()) {
            return null;
        }

        // Return data in front node
        return front.data;
    }
}
