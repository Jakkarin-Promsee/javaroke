package javaroke.models;

// Node T to recieve T as each class data to keep
// T may be NodeLyric Or NodeSong class
public class Node<T> {
    private T data;
    private Node<T> next;

    public Node(T data) {
        this.next = null;
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

}
