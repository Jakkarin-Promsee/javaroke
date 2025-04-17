import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Test Queue concrete for QueueLyric and QueueSong
public class QueueTest {
    @Test
    public void QueueLyricTest() {
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

    @Test
    public void QueueSongTest() {
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
