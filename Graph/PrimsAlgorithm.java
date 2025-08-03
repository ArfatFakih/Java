package Graph;

import java.util.*;

public class PrimsAlgorithm {

    static class Pair{
        int distance;
        int node;
        public Pair(int distance, int node){
            this.distance = distance;
            this.node = node;
        }
    }

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

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 1));
        
        graph[1].add(new Edge(1, 0, 2));
        graph[1].add(new Edge(1, 2, 1));

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 2));
        graph[2].add(new Edge(2, 4, 2));

        graph[3].add(new Edge(3, 2, 2));
        graph[3].add(new Edge(3, 4, 1));

        graph[4].add(new Edge(4, 2, 2));
        graph[4].add(new Edge(4, 3, 1));
    }

    public static int primsAlgo(ArrayList<Edge>[] graph, int V){
        int vis[] = new int[V];
        PriorityQueue<Pair> q = new PriorityQueue<>((a,b) -> a.distance - b.distance);

        q.add(new Pair(0, 0));
        int ans = 0;

        while(!q.isEmpty()){
            Pair p = q.poll();
            int wt = p.distance;
            int nd = p.node;

            if(vis[nd] == 1) continue;

            vis[nd] = 1;
            ans += wt;

            for(Edge it : graph[nd]){
                int adjNode = it.dest;
                int adjWt = it.wt;
                if(vis[adjNode] == 0){
                    q.add(new Pair(adjWt, adjNode));
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int V = 5;

        @SuppressWarnings("unchecked")  // To avoid warning 

        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        System.out.println("Total wt = " + primsAlgo(graph, V));
    }
}
