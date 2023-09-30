import java.util.*;

public class Collection {
    static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }
    public static boolean creategraph(ArrayList<Edge> []graph){
           /*
             (5)
        0--------1
                /\ 
          (1)  /  \ (3)
              /    \
             2----  3
             |  (1)
          (1)| 
             |
             4
             
    */
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<Edge>();
        }
        //vertex 0
        graph[0].add(new Edge(0, 1, 5));
        //vertex 1
        graph[1].add(new Edge(1,0,5));
        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,3));
        //vertex 2
        graph[2].add(new Edge(2,1,1));
        graph[2].add(new Edge(2,3,1));
        graph[2].add(new Edge(2,4,1));
        //vertex3
        graph[3].add(new Edge(3,1,3));
        graph[3].add(new Edge(3,2,1));
        //vertex 4
        graph[4].add(new Edge(4,2,1));
        return true;
    }    
    public static boolean Bfs(ArrayList<Edge>[] graph) {
    Queue<Integer> q = new LinkedList<>();
    boolean[] vis = new boolean[graph.length];

    // Start BFS from vertex 0 (you can choose any starting vertex)
    int startVertex = 0;
    q.add(startVertex);
    vis[startVertex] = true;

    while (!q.isEmpty()) {
        int curr = q.poll();
        System.out.print(curr + " "); // Print the current vertex

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge edge = graph[curr].get(i);
            
            if (!vis[edge.dest]) {
                q.add(edge.dest);
                vis[edge.dest] = true;
            }
        }
    }
    return true;
}

public static boolean printBfs(ArrayList<Edge>[]graph){
    Queue<Integer> q = new LinkedList<>();
    boolean[] vis = new boolean[graph.length];
    q.add(0);
    while(!q.isEmpty()){
        int curr=q.remove();
        if(!vis[curr]){
            System.out.print("\n"+curr+" ");
            vis[curr]=true;
            //neighbor
            for (int i = 0; i < graph[curr].size(); i++) {
            Edge edge1 = graph[curr].get(i);
            q.add(edge1.dest);
            
                
            }

        }
    }
    return true;
}
public static boolean dfs(ArrayList<Edge>[]graph, int curr,boolean vis[]){
    System.out.print(curr +" ");
    vis[curr] = true;
    for(int i=0;i<graph[curr].size();i++){
        Edge edge = graph[curr].get(i);
        if(!vis[edge.dest]){
            dfs(graph, edge.dest, vis);

        }
    }
    return true;
}
public static boolean haspath(ArrayList<Edge>[] graph, int src, int dest, boolean[] vis) {
    if (src == dest) {
        return true;
    }
    vis[src] = true;
    for (int i = 0; i < graph[src].size(); i++) {
        Edge edge = graph[src].get(i);
        if (!vis[edge.dest] && haspath(graph, edge.dest, dest, vis)) {
            return true;
        }
    }
    return false;
}

    public static void main(String[] args) {
        int v=5;
        
        ArrayList<Edge> []graph = new ArrayList[v];
        creategraph(graph);
        //Bfs(graph);
      // printBfs(graph);
       //dfs(graph, 0, new boolean[v]);
       System.out.println(haspath(graph, 0, 1, new boolean[v]));
    }
    
}
