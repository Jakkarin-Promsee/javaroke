package models;

import java.util.ArrayList;
import java.util.List;
import utils.Validator;

public class NodeGraph {
    private String songId;
    private List<Edge> edges;
    private boolean isVisited;
    private int distance;

    public NodeGraph(String songId) {
        Validator.validateSongId(songId);
        this.songId = songId;
        this.edges = new ArrayList<>();
        this.isVisited = false;
        this.distance = Integer.MAX_VALUE;
    }

    public String getSongID() {
        return songId;
    }

    public List<Edge> getEdges() {
        return edges;
    }

    public Boolean isVisited() {
        return isVisited;
    }

    public int getDistance() {
        return distance;
    }

    public void setSongID(String songId) {
        Validator.validateSongId(songId);
        this.songId = songId;
    }

    public void setEdges(List<Edge> edges) {
        this.edges = edges;
    }

    public void setVisited(Boolean isVisited) {
        this.isVisited = isVisited;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void plusDistance(int distance) {
        this.distance += distance;
    }

    public void addEdge(Edge edge) {
        for (Edge e : edges) {
            if (e.getDestination().equals(edge.getDestination())) {
                e.plusWeight(edge.getWeight()); // Add weight to existing edge
                return; // Skip adding if edge exists
            }
        }

        // Edge doesn't exist, so add it
        this.edges.add(edge);
    }
}
