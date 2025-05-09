package javaroke.stack;

import javaroke.models.NodeLyric;

public class StackLyric extends StackAbstract<NodeLyric> {
    // Set up Stack Lyric
    public StackLyric() {
        super(); // like use StackAbstract() to set up StackAbstract<NodeLyric> that we are extended
    }

    // Other push function that input as string
    public void push(int time, String line) {
        push(new NodeLyric(time, line));
    }
}
