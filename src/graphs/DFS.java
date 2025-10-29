package graphs;

import java.util.Stack;

/** Ball of String implementation:
 * - Maintain information about visited vertices.
 * - Recursively visit all unmkarked vertices.
 */
public class DFS {
    private AdjancyListGraph graph;
    private int s;
    private Boolean[] marked;
    private int[] edgeTo;

    public DFS(AdjancyListGraph graph, int s){
        this.graph = graph;
        marked = new Boolean[graph.size()];
        edgeTo = new int[graph.size()];
        initializeGraph(s);
    }

    public Iterable<Integer> getPathTo(int v){
        if(!marked[v]){
            return null;
        }
        Stack<Integer> stack = new Stack<>();
        for(int i = v; i!=s; i = edgeTo[i]){
            stack.push(i);
        }
        stack.push(s);
        return stack;
    }

    private void initializeGraph(int s){
        this.s = s;
        dfs(s);
    }

    private void dfs(int v){
        if(marked[v]){
            return;
        }
        marked[v]= true;
        for(int w: graph.getEdges(v)){
            if(!marked[w]){
                edgeTo[w] = v;
                dfs(w);
            }
        }
    }

}
