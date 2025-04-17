// Node T to recieve T as each class data to keep
// T may be NodeLyric Or NodeSong class
public class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.next = null;
        this.data = data;
    }
}
