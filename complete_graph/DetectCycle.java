import java.util.ArrayList;

public class DetectCycle {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static boolean creategraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        // vertex 0
        graph[0].add(new Edge(0, 1, 5));
        // vertex 1
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));
        // vertex 2
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 4, 1));
        // vertex 3
        graph[3].add(new Edge(3, 1, 3));
        // vertex 4
        graph[4].add(new Edge(4, 2, 1));
        return true;
    }

    public static boolean DetectCycles(ArrayList<Edge>[] graph) {
        boolean[] vis = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                if (DetectCycleUtil(graph, vis, i, -1)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean DetectCycleUtil(ArrayList<Edge>[] graph, boolean vis[], int curr, int par) {
        vis[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge edge = graph[curr].get(i);
            if (!vis[edge.dest]) {
                // case 3
                if (DetectCycleUtil(graph, vis, edge.dest, curr)) {
                    return true;
                }
            }
            // case 1
            if (vis[edge.dest] && edge.dest != par && edge.dest != curr) {
                return true;
            }
            // case 2
            // do nothing
        }
        return false;
    }

    public static void main(String[] args) {
        int v = 5;
        ArrayList<Edge>[] graph = new ArrayList[v];
        creategraph(graph);
        System.out.println(DetectCycles(graph));
    }
}
