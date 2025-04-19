import java.util.List;

public class QueueLyric extends Queue<NodeLyric> {
    // Set up Queue Lyric
    public QueueLyric() {
        super(); // like use Queue() to set up queue<NodeSOng> that we are extended
    }

    // Other enqueue function that input as string
    public void enqueue(String time, String line) {
        enqueue(new NodeLyric(time, line));
    }

    // Other enqueueAtFront function that input as string
    public void enqueueAtFront(String time, String line) {
        enqueueAtFront(new NodeLyric(time, line));
    }

    // ------- Other Song function here... -------

    // Return List that carry all lyrics
    public List<String> getAllLyrics() {
        return null;
    }

    // Skip the Lyric on queue, check songTime < current peek
    // Return as new QueueSong that carry those skip lyric
    // Change Queue by dequeue data that not match out
    public QueueLyric skipTo(String songTime) {
        return null;
    }
}
