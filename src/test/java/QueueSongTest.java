import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QueueSongTest {
    @Test
    public void testQueueSongEnqueue() {
        QueueSong queueSong = new QueueSong();

        queueSong.enqueue("Test 1");

        assertEquals("Test 1", queueSong.peek().songId, "enqueue failed at first in QueueSong extend");

        queueSong.enqueue("Test 2");

        assertEquals("Test 1", queueSong.peek().songId, "enqueue failed at 2nd++ in QueueSong extend");
    }
}
