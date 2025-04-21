package javaroke;

import org.junit.jupiter.api.Test;

import javaroke.queue.QueueAbstract;

import static org.junit.jupiter.api.Assertions.*;

public class QueueAbstractTest {
    @Test
    public void testQueueAbstractInitialize() {
        QueueAbstract<String> queue = new QueueAbstract<String>() {
        };
        assertNotNull(queue, "queue initialize failed");
    }

    @Test
    public void testQueueAbstractSize() {
        QueueAbstract<String> queue = new QueueAbstract<String>() {
        };

        assertEquals(0, queue.size(), "blank queue size failed");

        queue.enqueue("Test 1");
        queue.enqueue("Test 1");
        queue.enqueue("Test 1");
        queue.enqueue("Test 1");

        assertEquals(4, queue.size(), "enqueue size failed");

        queue.dequeue();

        assertEquals(3, queue.size(), "dequeue size failed");

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        assertEquals(0, queue.size(), "dequeue to blank size failed");
    }

    @Test
    public void testQueueAbstractPeek() {
        QueueAbstract<String> queue = new QueueAbstract<String>() {
        };

        queue.enqueue("Test 1");

        assertEquals("Test 1", queue.peek(), "peek failed");
    }

    @Test
    public void testQueueAbstractEnqueue() {
        QueueAbstract<String> queue = new QueueAbstract<String>() {
        };

        queue.enqueue("Test 1");

        assertEquals("Test 1", queue.peek(), "enqueue failed at first");

        queue.enqueue("Test 2");

        assertEquals("Test 1", queue.peek(), "enqueue failed at 2nd++");
    }

    @Test
    public void testQueueAbstractEnqueueAtFront() {
        QueueAbstract<String> queue = new QueueAbstract<String>() {
        };

        queue.enqueueAtFront("Test 1");

        assertEquals("Test 1", queue.peek(), "enqueueAtFront failed at first");

        queue.enqueueAtFront("Test 2");

        assertEquals("Test 2", queue.peek(), "enqueueAtFront failed at 2nd++");
    }

    @Test
    public void testQueueAbstractDequeue() {
        QueueAbstract<String> queue = new QueueAbstract<String>() {
        };

        queue.enqueue("Test 1");
        queue.enqueue("Test 2");
        queue.enqueue("Test 3");
        queue.enqueue("Test 4");

        assertEquals("Test 1", queue.peek(), "enqueue failed at first");

        assertEquals("Test 1", queue.dequeue(), "dequeue failed at first");
        assertEquals("Test 2", queue.dequeue(), "dequeue failed at 2nd");

        assertEquals("Test 3", queue.peek(), "peek failed at 3rd");
    }

    @Test
    public void testQueueAbstractNull() {
        QueueAbstract<String> queue = new QueueAbstract<String>() {
        };

        assertNull(queue.peek(), "peek failed at blank queue");

        assertNull(queue.dequeue(), "dequeue failed at blank queue");

        queue.enqueue("Test 1");
        queue.enqueue(null);

        assertEquals("Test 1", queue.peek(), "enqueue failed at null input");

        queue.enqueueAtFront(null);

        assertEquals("Test 1", queue.peek(), "enqueueAtFront failed at null input");

        queue.dequeue();

        assertNull(queue.dequeue(), "dequeue failed at last node");
    }

    @Test
    public void testQueueAbstractIterable() {
        // Create an anonymous concrete implementation of QueueAbstract
        QueueAbstract<String> queue = new QueueAbstract<String>() {
        };

        // Test data
        String[] expectedValues = { "Test 1", "Test 2", "Test 3", "Test 4" };

        // Fill the queue
        for (String value : expectedValues) {
            queue.enqueue(value);
        }

        // Test size before iteration
        assertEquals(4, queue.size(), "Queue size should be 4");

        // Test iteration
        int i = 0;
        for (String data : queue) {
            assertEquals(expectedValues[i], data,
                    "Element at position " + i + " should match expected value");
            i++;
        }

        // Verify we iterated through all elements
        assertEquals(4, i, "Should have iterated through 4 elements");

        // Verify queue is unchanged after iteration (still has all elements)
        assertEquals(4, queue.size(), "Queue size should remain 4 after iteration");
    }
}
