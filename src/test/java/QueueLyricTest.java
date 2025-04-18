import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class QueueLyricTest {
    @Test
    public void QueueLyricEnqueueTest() {
        QueueLyric queueLyric = new QueueLyric();

        // Enqueue items
        queueLyric.enqueue("00:00", "I'm keep into the lesser fire");
        queueLyric.enqueue("00:07", "My body ached to be satisfy");
        queueLyric.enqueue("00:11", "My weakness come and go...");

        // Assert
        assertNotNull(queueLyric.peek(), "Queue should not be empty after enqueueing");
        assertEquals("00:00", queueLyric.peek().time, "The first time in the queue should be '00:00'");
        assertEquals("I'm keep into the lesser fire", queueLyric.peek().line,
                "The first line in the queue should match");

        // Dequeue items
        queueLyric.dequeue();
        queueLyric.dequeue();

        // Assert
        assertNotNull(queueLyric.peek(), "Queue should not be empty after dequeuing");
        assertEquals("00:11", queueLyric.peek().time, "The next time in the queue should be '00:11'");
    }
}
