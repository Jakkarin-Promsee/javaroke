package models;

import utils.Validator;

public class NodeSong {
    private String songId;
    private String title;
    private String artist;
    private String duration;

    public NodeSong(String songId, String title, String artist, String duration) {
        Validator.validateSongId(songId);
        Validator.validateTimeForm(duration);
        this.songId = songId;
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    public String getSongId() {
        return songId;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getDuration() {
        return duration;
    }

    public void setSongId(String songId) {
        Validator.validateSongId(songId);
        this.songId = songId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setDuration(String duration) {
        Validator.validateTimeForm(duration);
        this.duration = duration;
    }
}
