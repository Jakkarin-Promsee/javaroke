public class Main {
    public static void main(String[] args) {
        Queue<NodeLyric> queueLyric = new Queue<>();

        queueLyric.enqueue(new NodeLyric("00:00", "I'm keep into the lesser fire"));
        queueLyric.enqueue(new NodeLyric("00:07", "My body ached to be satisfy"));
        queueLyric.enqueue(new NodeLyric("00:11", "My weakness come and go..."));

        System.out.println(queueLyric.peek().time + " " + queueLyric.peek().line);
        queueLyric.dequeue();
        queueLyric.dequeue();
        System.out.println(queueLyric.peek().time + " " + queueLyric.peek().line);
    }
}