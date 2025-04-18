import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class QueueSongTest {
    @Test
    public void QueueSongEnqueueTest() {
        QueueSong queueSong = new QueueSong();

        // Enqueue items
        queueSong.enqueue("yai-mak-mak");
        queueSong.enqueue("hai-jai-mai-ook");
        queueSong.enqueue("yak-tai");

        // Assert
        assertNotNull(queueSong.peek(), "Queue should not be empty after enqueueing");
        assertEquals("yai-mak-mak", queueSong.peek().songId, "The first song ID in the queue should be 'yai-mak-mak'");

        // Dequeue items
        queueSong.dequeue();
        queueSong.dequeue();

        // Assert
        assertNotNull(queueSong.peek(), "Queue should not be empty after dequeuing");
        assertEquals("yak-tai", queueSong.peek().songId, "The next song ID in the queue should be 'yak-tai'");
    }
}
