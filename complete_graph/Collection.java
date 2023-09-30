import java.util.ArrayList;
import java.util.LinkedList;
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
    public static boolean Bfs(ArrayList<Edge>[]graph){
        Queue<Integer> q = new LinkedList<>();
        boolean vis[]=new boolean[graph.length];
        while(!q.isEmpty()){
            int curr =q.remove();
            if(!vis[curr]){
                System.out.println(curr);
                vis[curr] = true;
                for(int i=0;i<graph[curr].size();i++){
                    Edge edge = graph[curr].get(i);
                    q.add(edge.dest);
                }
            }
         }
         return true;
     }
    public static void main(String[] args) {
        int v=5;
        
        ArrayList<Edge> []graph = new ArrayList[v];
        System.out.println(creategraph(graph));
        System.out.println(Bfs(graph));
    }
    
}
