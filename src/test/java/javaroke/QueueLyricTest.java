package javaroke;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import javaroke.queue.QueueLyric;

public class QueueLyricTest {
    @Test
    public void testQueueLyricEnqueue() {
        QueueLyric queueLyric = new QueueLyric();

        queueLyric.enqueue("00:00", "Test 1");

        assertEquals("00:00", queueLyric.peek().getTime(), "enqueue failed at first in QueueLyric");
        assertEquals("Test 1", queueLyric.peek().getline(), "enqueue failed at first in QueueLyric");

        queueLyric.enqueue("00:05", "Test 2");

        assertEquals("00:00", queueLyric.peek().getTime(), "enqueue failed at 2nd++ in QueueLyric");
        assertEquals("Test 1", queueLyric.peek().getline(), "enqueue failed at 2nd++ in QueueLyric");
    }
}
