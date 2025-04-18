import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Test Queue concrete for QueueLyric and QueueSong
public class QueueTest {
    @Test
    public void testQueueInitialize() {
        Queue<Node<String>> queue = new Queue<Node<String>>() {
        };
        assertNotEquals(null, queue, "queue initialize failed");
    }

    @Test
    public void testQueueSize() {
        Queue<Node<String>> queue = new Queue<Node<String>>() {
        };

        assertEquals(0, queue.size(), "blank queue size failed");

        queue.enqueue(new Node<String>(new String("Test 1")));
        queue.enqueue(new Node<String>(new String("Test 1")));
        queue.enqueue(new Node<String>(new String("Test 1")));
        queue.enqueue(new Node<String>(new String("Test 1")));

        assertEquals(4, queue.size(), "enqueue size failed");

        queue.dequeue();

        assertEquals(3, queue.size(), "dequeue size failed");

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        assertEquals(0, queue.size(), "dequeue to blank size failed");
    }

    @Test
    public void testQueuePeek() {
        Queue<Node<String>> queue = new Queue<Node<String>>() {
        };

        // Enqueue first item
        queue.enqueue(new Node<String>(new String("Test 1")));

        // Peek to see data object inside
        assertEquals("Test 1", queue.peek().data, "peek failed");
    }

    @Test
    public void testQueueEnqueue() {
        Queue<Node<String>> queue = new Queue<Node<String>>() {
        };

        // Enqueue first item
        queue.enqueue(new Node<String>(new String("Test 1")));

        // Assert the first item is at the front of the queue
        assertEquals("Test 1", queue.peek().data, "enqueue failed at first");

        // Enqueue second item
        queue.enqueue(new Node<String>(new String("Test 2")));

        // Assert the first item is still at the front
        assertEquals("Test 1", queue.peek().data, "enqueue failed at 2st++");
    }

    @Test
    public void testQueueEnqueueAtFront() {
        Queue<Node<String>> queue = new Queue<Node<String>>() {
        };

        // Enqueue first item
        queue.enqueueAtFront(new Node<String>(new String("Test 1")));

        // Assert the first item is at the front of the queue
        assertEquals("Test 1", queue.peek().data, "enqueueAtFront failed at first");

        // Enqueue second item
        queue.enqueueAtFront(new Node<String>(new String("Test 2")));

        // Assert the first item is still at the front
        assertEquals("Test 2", queue.peek().data, "enqueueAtFront failed at 2st++");
    }

    @Test
    public void testQueueDequeue() {
        Queue<Node<String>> queue = new Queue<Node<String>>() {
        };

        // Enqueue several items
        queue.enqueue(new Node<String>(new String("Test 1")));
        queue.enqueue(new Node<String>(new String("Test 2")));
        queue.enqueue(new Node<String>(new String("Test 3")));
        queue.enqueue(new Node<String>(new String("Test 4")));

        // Assert the front of the queue is "Test 1"
        assertEquals("Test 1", queue.peek().data, "enqueue failed at first");

        // Dequeue and assert the returned data
        assertEquals("Test 1", queue.dequeue().data, "dequeue failed at first enqueue");
        assertEquals("Test 2", queue.dequeue().data, "enqueue failed at 2st++");

        // Assert the new front of the queue is "Test 3"
        assertEquals("Test 3", queue.peek().data, "enqueue failed at 2st++");
    }

    @Test
    public void testQueueNull() {
        Queue<Node<String>> queue = new Queue<Node<String>>() {
        };

        // If queue is blank, peek should be null
        assertEquals(null, queue.peek(), "peek failed at blank queue in null cases");

        // If queue is blank, dequeue should be null
        assertEquals(null, queue.dequeue(), "dequeue failed at blank queue in null cases");

        // Enqueue null value
        queue.enqueue(new Node<String>(new String("Test 1")));
        queue.enqueue(null);

        // If input is null, this enqueue process should be exist
        assertEquals("Test 1", queue.peek().data, "enqueue failed at null input");

        // EnqueueAtFront null value
        queue.enqueueAtFront(null);

        // If input is null, this enqueue process should be exist
        assertEquals("Test 1", queue.peek().data, "enqueue failed at null input");

        // Dequeue queue to blank again
        queue.dequeue();

        // If queue is blank, dequeue should be null
        assertEquals(null, queue.dequeue(), "dequeue failed at last node");
    }
}
