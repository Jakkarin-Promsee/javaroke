public class QueueLyric extends Queue<NodeLyric> {
    // Set up Queue Lyric
    public QueueLyric() {
        super(); // like use Queue() to set up queue<NodeSOng> that we are extended
    }

    // New enqueue function that input as string, not like before that we input as
    // class
    public void enqueue(String time, String line) {
        enqueue(new NodeLyric(time, line));
    }

    // Other Song function here...
}
