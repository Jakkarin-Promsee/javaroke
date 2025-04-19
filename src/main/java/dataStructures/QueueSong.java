package dataStructures;

import java.util.List;
import models.NodeSong;

public class QueueSong extends QueueAbstract<NodeSong> {
    // Set up Queue Song
    public QueueSong() {
        super(); // like use Queue() to set up queue<NodeSOng> that we are extended
    }

    // Other enqueue function that input as String
    public void enqueue(String songId, String title, String artist, String duration) {
        enqueue(new NodeSong(songId, title, artist, duration));
    }

    // Other enqueueAtFront function that input as String
    public void enqueueAtFront(String songId, String title, String artist, String duration) {
        enqueueAtFront(new NodeSong(songId, title, artist, duration));
    }

    // ------- Other Song function here... -------

    // Return the all time to play all song in this queue
    // May not do it now, cause we don't have the database yet.
    public int totalDuration() {
        return 0;
    }

    // Return the briefly summary of this list
    // May be "3 songs, 10 min total."
    public String getPlaylistSummary() {
        return null;
    }

    // Return List that carry all song name
    public List<String> getTitleList() {
        return null;
    }

    // Return List that carry all song artist
    public List<String> getArtistList() {
        return null;
    }

    // Skip the song on queue untill find song name $songTitle
    // Return as new QueueSong that carry those skip song
    // Change Queue by dequeue data that not match out
    public QueueSong skipTo(String songTitle) {
        return null;
    }

    // Enqueue $otherQueueu to this Queue
    public void mergeWith(QueueSong otherQueue) {

    }

    // Other more...
}
