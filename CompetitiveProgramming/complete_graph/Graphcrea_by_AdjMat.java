import java.util.ArrayList;

public class Graphcrea_by_AdjMat{
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
    public static void main(String[] args) {
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
    //int arr []=new int[v];
    int v =5;
    ArrayList<Edge>[] graph = new ArrayList[v];
    for(int i=0;i<v;i++){
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
    //to find neighbors
    System.out.println("d"+" "+"w");
    for(int i=0;i<graph[3].size();i++) {
        Edge e= graph[3].get(i);
        System.out.println(e.dest+" "+ e.wt);
        }
    }
}