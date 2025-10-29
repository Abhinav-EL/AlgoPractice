package graphs;

import java.util.ArrayList;
import java.util.List;

public class AdjancyListGraph {
    private List<Integer>[] adj;

    public AdjancyListGraph(int V){
        adj = (ArrayList<Integer>[]) new ArrayList[V];
        for(int v=0; v< V; v++){
            adj[v] = new ArrayList<>();
        }
    }

    public int size(){
        return adj.length;
    }

    public void addEdge(int v, int w){
        this.adj[v].add(w);
        this.adj[w].add(v);
    }

    public Iterable<Integer> getEdges(int w){
        return this.adj[w];
    }
}
