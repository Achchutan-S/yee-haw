package Graphs;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    private int vertices;
    private int[][] adjacencyMatrix;
    private List<List<Integer>> adjacencyList;

    public Graph(int vertices) {
        this.vertices = vertices;
        adjacencyMatrix = new int[vertices][vertices];
        adjacencyList = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            adjacencyList.add(new ArrayList<>());
        }
    }

    // Adding edge for both representations
    public void addEdge(int src, int dest) {
        // For Adjacency Matrix
        adjacencyMatrix[src][dest] = 1;
        adjacencyMatrix[dest][src] = 1; // For an undirected graph

        // For Adjacency List
        adjacencyList.get(src).add(dest);
        adjacencyList.get(dest).add(src); // For an undirected graph
    }

    // Printing Adjacency Matrix
    public void printAdjacencyMatrix() {
        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Printing Adjacency List
    public void printAdjacencyList() {
        System.out.println("Adjacency List:");
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + " -> ");
            for (int node : adjacencyList.get(i)) {
                System.out.print(node + " ");
            }
            System.out.println();
        }
    }
}
