public class QueueSong extends Queue<NodeSong> {
    // Set up Queue Song
    public QueueSong() {
        super(); // like use Queue() to set up queue<NodeSOng> that we are extended
    }

    // New enqueue function that input as string, not like before that we input as
    // class
    public void enqueue(String songId) {
        enqueue(new NodeSong(songId));
    }

    // Other Song function here...

}
