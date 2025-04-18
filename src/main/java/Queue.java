public abstract class Queue<T> {
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
        // If input data is null, exist this enqueue process
        if (data == null) {
            return;
        }

        // Create newNode as class T,and call Node() self setup function.
        Node<T> newNode = new Node<T>(data);

        // Main operation
        if (isEmpty()) {
            // Front = rear point at new node
            front = rear = newNode;
        } else {
            // Connect rear.next to newNode, making newNode be lastest rear
            rear.next = newNode;

            // Move rear to newNode that live in the last rear of this liked list
            rear = newNode;
        }

        // If endqueue function work correctly, plus size of queue by 1
        size++;
    }

    // Enqueue data at front position in the form as class T
    // Use for backward function, work parallel with history stack

    // enqueueAtFront Option 2 with O(n).
    // Be definitely Queue main process, FIFO at all
    public void enqueueAtFront(T data) {
        // If input data is null, exist this enqueue process
        if (data == null) {
            return;
        }

        // Main operation
        if (isEmpty()) {
            // Direct enqueue, cause it already has nothing inside
            enqueue(data);
        } else {
            // Create new queue for tempo dump data from current queue
            // Due to queue is abstract class now, have to use {} for make it be concrete
            Queue<T> tempoQueue = new Queue<T>() {
            };

            // Dump all data from current to tempoQueue
            // Making current queue empty
            while (!isEmpty()) {
                tempoQueue.enqueue(dequeue());
            }

            // Enqueue data first
            enqueue(data);

            // Dump all old data from tempoQueue to current again
            while (!tempoQueue.isEmpty()) {
                enqueue(tempoQueue.dequeue());
            }
        }
    }

    // enqueueAtFront Option 2 with O(1).
    // Still be Queue main process, but not FIFO at all
    // public void enqueueAtFront(T data) {
    // // Create newNode as class T,and call Node() self setup function.
    // Node<T> newNode = new Node<T>(data);

    // // Main operation
    // if (isEmpty()) {
    // // Front = rear point at new node
    // front = rear = newNode;
    // } else {
    // // Connect newNode.next to front, making newNode be lastest front
    // newNode.next = front;

    // // Move front to newNode that live in the lastest front of this liked list
    // front = newNode;
    // }

    // // If endqueue function work correctly, plus size of queue by 1
    // size++;
    // }

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
