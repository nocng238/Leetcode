package Graph.Module;

public class WeightedGraph {
    private final int V;
    private int E;
    private double[][] adj;

    public WeightedGraph(int V) {
        this.V = V;
        this.E = 0;
        this.adj = new double[V][V];
        for (int i = 0; i < V; i++)
            for (int j = 0; j < V; j++)
                adj[i][j] = i == j ? 0 : Double.POSITIVE_INFINITY;
    }
    public void addEdge(int v, int w, double weight) {
        adj[v][w] = weight;
        adj[w][v] = weight;
        E++;
    }

    // các method còn lại tương tự
}
