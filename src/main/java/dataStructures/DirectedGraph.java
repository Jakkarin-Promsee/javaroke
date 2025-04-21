package dataStructures;

import models.Edge;

public class DirectedGraph extends GraphAbstract {
    @Override
    public void addEdge(String source, String destination, int weight) {
        addNode(source);
        addNode(destination);

        adjacencyList.get(source).addEdge(new Edge(destination, weight));
    }
}
