import java.util.ArrayList;

class Solution {

    ArrayList<Integer>[] graph;
    boolean[] visited;

    public int countCompleteComponents(int n, int[][] edges) {

        graph = new ArrayList[n];
        visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] edge : edges) {
            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]);
        }

        int complete = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                int[] res = dfs(i);

                int vertices = res[0];
                int edgeCount = res[1] / 2;

                if (edgeCount == (long) vertices * (vertices - 1) / 2) {
                    complete++;
                }
            }
        }

        return complete;
    }

    private int[] dfs(int node) {
        visited[node] = true;

        int vertices = 1;
        int edges = graph[node].size();

        for (int next : graph[node]) {
            if (!visited[next]) {
                int[] res = dfs(next);
                vertices += res[0];
                edges += res[1];
            }
        }

        return new int[]{vertices, edges};
    }
}
