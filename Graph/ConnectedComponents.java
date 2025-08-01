package Graph;

import java.util.*;

public class ConnectedComponents {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    static void createGraph(ArrayList<Edge>[] graph){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));
        
        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        graph[6].add(new Edge(6, 5, 1));

        graph[7].add(new Edge(7, 8, 1));

        graph[8].add(new Edge(8, 7, 1));
    }

    //Same can be done using DFS

    public static void bfs(ArrayList<Edge>[] graph){
        boolean vis[] = new boolean[graph.length];
        for(int i=0; i<graph.length; i++){
            if(!vis[i]){
                bfsUtil(graph, vis, i);
            }
        }
    }

    public static void bfsUtil(ArrayList<Edge>[] graph, boolean vis[], int curr){ //O(V+E)
        Queue<Integer> q = new LinkedList<>();

        q.add(curr); // source = 0
        while(!q.isEmpty()){
            int node = q.remove();

            if(!vis[node]){
                System.out.print(node + " ");
                vis[node] = true;
                for(int i=0; i<graph[node].size(); i++){
                    Edge e = graph[node].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    public static void main(String[] args) {

        /*
                1 --- 3
               /      | \
              0       |  5 --- 6
               \      | /
                2 --- 4
        */

        int V = 9;

        @SuppressWarnings("unchecked")  // To avoid warning 

        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        bfs(graph);
    }
}
