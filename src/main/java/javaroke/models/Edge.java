package javaroke.models;

import javaroke.utils.Validator;

public class Edge {
    private String destination;
    private int weight;

    public Edge(String destination, int weight) {
        this.destination = destination;
        this.weight = weight;
    }

    public String getDestination() {
        return destination;
    }

    public int getWeight() {
        return weight;
    }

    public void setDestination(String destination) {
        Validator.validateSongId(destination);
        this.destination = destination;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void plusWeight(int weight) {
        this.weight += weight;
    }

}
