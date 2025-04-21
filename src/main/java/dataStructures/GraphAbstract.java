package dataStructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import models.NodeGraph;

public abstract class GraphAbstract {
    /*
     * numVertices: indicate the size of both adjacencyList and idList
     * adjacencyList: be HashMap, use to keep map of all NodeGraph with idSong
     * idList: be TreeSet, use to keep all idSong that sort by character
     * 
     * In normal use, we will only use adjacencyList to find all node
     * But when we want to read adjacency Metrix, we have to use idList to make
     * correct metrix cause hashMap order may not the same between adjacencyList
     * order and in self Node order
     */
    protected int numVertices;
    protected Map<String, NodeGraph> adjacencyList;
    protected Set<String> idList;

    public GraphAbstract() {
        this.numVertices = 0;
        this.adjacencyList = new HashMap<>();
        this.idList = new TreeSet<>();
    }

    protected void addNode(String name) {
        // HashMap containsKey O(1)
        // But TreeSet is O(log n)
        if (!adjacencyList.containsKey(name)) {
            idList.add(name);
            adjacencyList.put(name, new NodeGraph(name));
            numVertices++;
        }
    }

    public void showAdjacencyMatric() {
        idList.forEach((idSongY) -> {
            idList.forEach((idSongX) -> {
                // adjacencyList.get(idSongY).getEdges();
            });

        });
        adjacencyList.forEach((key, node) -> {

            System.out.println("");
        });
    }

    public abstract void addEdge(String source, String destination, int weight);
}
