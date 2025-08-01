package Graph;

import java.util.*;

public class BipartiteGraph {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }

    static void createGraph(ArrayList<Edge>[] graph){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3 ));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));


        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));

    }

    public static boolean isBipartite(ArrayList<Edge>[] graph){
        int col[] = new int[graph.length];
        for(int i=0; i<col.length; i++){
            col[i] = -1;
        }

        for(int i=0; i<graph.length; i++){
            if(col[i] == -1){
                if(isBipartiteUtil(graph, col, i)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isBipartiteUtil(ArrayList<Edge>[] graph, int col[], int curr){
        Queue<Integer> q = new LinkedList<>();
        q.add(curr);
        col[curr] = 0;
        while(!q.isEmpty()){
            int num = q.poll();

            for(int i=0; i<graph[num].size(); i++){
                Edge e = graph[num].get(i);
                if(col[e.dest] == -1){
                    int nextCall = col[num] == 0 ?  1 : 0;
                    col[e.dest] = nextCall;
                    q.add(e.dest);
                }else if(col[e.dest] == col[num]){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        /*
                0 ---- 2
               /        \
              /          \
              1          4  
               \        /
                \      /
                 \    /
                    3     
        */
        int V = 5;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        System.out.println(isBipartite(graph));
    }
}
