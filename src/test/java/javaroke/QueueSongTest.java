package javaroke;

import org.junit.jupiter.api.Test;

import javaroke.queue.QueueSong;

import static org.junit.jupiter.api.Assertions.*;

public class QueueSongTest {
    @Test
    public void testQueueSongEnqueue() {
        QueueSong queueSong = new QueueSong();

        queueSong.enqueue("Test-1", "Test 1", "Tester", "02:16");

        assertEquals("Test-1", queueSong.peek().getSongId(), "enqueue failed at first in QueueSong extend");

        queueSong.enqueue("Test-2", "Test 2", "Tester", "01:32");

        assertEquals("Test-1", queueSong.peek().getSongId(), "enqueue failed at 2nd++ in QueueSong extend");
    }
}
