public class Main {
    public static void main(String[] args) {
        QueueLyricTest();
        System.out.println("");
        QueueSongTest();

    }

    public static void QueueLyricTest() {
        QueueLyric queueLyric = new QueueLyric();

        queueLyric.enqueue("00:00", "I'm keep into the lesser fire");
        queueLyric.enqueue("00:07", "My body ached to be satisfy");
        queueLyric.enqueue("00:11", "My weakness come and go...");
        queueLyric.enqueueAtFront(new NodeLyric("00:11", "dunno"));
        queueLyric.enqueueAtFront(new NodeLyric("00:13", "dunno2"));

        System.out.println("QueueLyric test>>  " + queueLyric.peek().time + " " + queueLyric.peek().line);
        queueLyric.dequeue();
        queueLyric.dequeue();
        System.out.println("QueueLyric test>>  " + queueLyric.peek().time + " " + queueLyric.peek().line);
    }

    public static void QueueSongTest() {
        QueueSong queueSong = new QueueSong();

        queueSong.enqueue("yai-mak-mak");
        queueSong.enqueue("hai-jai-mai-ook");
        queueSong.enqueue("yak-tai");

        System.out.println("QueueSong test>>  " + queueSong.peek().songId);
        queueSong.dequeue();
        queueSong.dequeue();
        System.out.println("QueueSong test>>  " + queueSong.peek().songId);
    }
}