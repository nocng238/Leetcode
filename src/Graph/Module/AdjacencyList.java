package Graph.Module;

import java.util.*;

public class AdjacencyList {
    private final int V;
    private int E;
    private List<Integer>[] adj;

    public AdjacencyList(int V) {
        this.V = V;
        this.E = 0;
        this.adj = (List<Integer>[]) new List[V];
        for (int v = 0; v < V; v++) {
            this.adj[v] = new ArrayList<>();
        }
    }
    public int V() { return V; }
    public int E() { return E; }
    public void addEdge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v);
        E++;
    }
    public Iterable<Integer> adj(int v) { return adj[v]; }
}
